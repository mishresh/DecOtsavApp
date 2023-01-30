package com.example.decotsav.ui.customized;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.decotsav.R;
import com.example.decotsav.adapters.CustomizedVerticalAdapter;
import com.example.decotsav.models.CustomizedVerticalModel;

import java.util.ArrayList;
import java.util.List;

public class CustomizedFragment extends Fragment {

    RecyclerView customizedVerticalRec;


    ///////////////vertical View

    List<CustomizedVerticalModel> customizedVerticalModelList;
    CustomizedVerticalAdapter customizedVerticalAdapter;

    //private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);

//        binding = FragmentHomeBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();

        View root=inflater.inflate(R.layout.fragment_customized,container,false);

        customizedVerticalRec = root.findViewById(R.id.customized_vertical_rec);
//        final TextView textView = binding.textView;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        ///////////////// Vertical Recycler View

        customizedVerticalModelList=new ArrayList<>();

        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan1","100 balloon, ribbon, with hbdy jsadflj lwejfl 60 words limit","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.logo, "Basic Plan2","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan3","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan4","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan5","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan6","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan7","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan8","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan9","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));
        customizedVerticalModelList.add(new CustomizedVerticalModel(R.drawable.hbdy1, "Basic Plan10","100 balloon, ribbon, with hbdy","10 piece","100 Rs.","1000 Rs."));

        customizedVerticalAdapter=new CustomizedVerticalAdapter(getActivity(),customizedVerticalModelList);
        customizedVerticalRec.setAdapter(customizedVerticalAdapter);
        customizedVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        customizedVerticalRec.setHasFixedSize(true);
        customizedVerticalRec.setNestedScrollingEnabled(false);

        return root;
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }
}