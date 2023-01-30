package com.example.decotsav.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.decotsav.R;
import com.example.decotsav.models.HomeVerticalModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;

public class HomeVerticalAdapter extends RecyclerView.Adapter<HomeVerticalAdapter.ViewHolder> {

    private BottomSheetDialog bottomSheetDialog;
    Context context;
    List<HomeVerticalModel> list;

    public HomeVerticalAdapter(Context context, List<HomeVerticalModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final String mName = list.get(position).getName();
        final String mDescription = list.get(position).getDescription();
        final String mPrice = list.get(position).getPrice();
        final int mImage = list.get(position).getImage();


        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.price.setText(list.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog = new BottomSheetDialog(context,R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout, null);
                sheetView.findViewById(R.id.addToCart).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Added to a Cart", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });

                ImageView bottomImg = sheetView.findViewById(R.id.bottomImage);
                TextView bottomName = sheetView.findViewById(R.id.bottomName);
                TextView bottomDescription = sheetView.findViewById(R.id.bottomDesc);
                TextView bottomPrice = sheetView.findViewById(R.id.bottomPrice);

                bottomName.setText(mName);
                bottomDescription.setText(mDescription);
                bottomPrice.setText(mPrice);
                bottomImg.setImageResource(mImage);

                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,description,price;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.ver_img);
            name=itemView.findViewById(R.id.name);
            description=itemView.findViewById(R.id.description);
            price=itemView.findViewById(R.id.price);

        }
    }
}
