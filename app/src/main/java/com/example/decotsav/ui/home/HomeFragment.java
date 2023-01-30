package com.example.decotsav.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.decotsav.R;
import com.example.decotsav.adapters.HomeVerticalAdapter;
import com.example.decotsav.models.HomeVerticalModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeVerticalRec;


    ///////////////vertical View

    List<HomeVerticalModel> homeVerticalModelList;
    HomeVerticalAdapter homeVerticalAdapter;

    //private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);

//        binding = FragmentHomeBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();

        View root=inflater.inflate(R.layout.fragment_home,container,false);

        homeVerticalRec = root.findViewById(R.id.home_vertical_rec);
//        final TextView textView = binding.textView;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        ///////////////// Vertical Recycler View

        homeVerticalModelList=new ArrayList<>();

        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan1","100 balloon, ribbon, with hbdy jsadflj lwejfloij ijafj ijdfj ijfdpf jenfdknp qw er ty ui op lk 123456 130 words limit","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.logo, "Basic Plan2","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan3","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan4","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan5","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan6","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan7","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan8","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan9","100 balloon, ribbon, with hbdy","only at 999/-","1"));
        homeVerticalModelList.add(new HomeVerticalModel(R.drawable.hbdy1, "Basic Plan10","100 balloon, ribbon, with hbdy","only at 999/-","1"));

        homeVerticalAdapter=new HomeVerticalAdapter(getActivity(),homeVerticalModelList);
        homeVerticalRec.setAdapter(homeVerticalAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);

        return root;
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }
}