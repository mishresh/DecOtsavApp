package com.example.decotsav.ui.cart;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.decotsav.DatePickerFragment;
import com.example.decotsav.R;
import com.example.decotsav.activity.Add_Address_Fragment;
import com.example.decotsav.adapters.CartAdapter;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment implements View.OnClickListener {

    TextView requestNewClaim;
    TextView dateOfBirthET;
    String selectedDate;
    MaterialButton button;
    //Button addAddress;

    List<CartViewModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public static final int REQUEST_CODE = 11; // Used to identify the result

    private OnFragmentInteractionListener mListener;

    public CartFragment() {
        // Required empty public constructor
    }

    public static CartFragment newInstance() {
        CartFragment fragment = new CartFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        //login = findViewById(R.id.btnLogin);
       // signup = findViewById(R.id.btnSignUp);
        //addAddress = button.findViewById(R.id.btnConfAdd);
        //addAddress = (Button) view.findViewById(R.id.btnConfAdd);
        Button addAddress = (Button) view.findViewById(R.id.btnConfAdd);

        addAddress.setOnClickListener(this);
        //phonebookBtn.setOnClickListener(this);





        dateOfBirthET = view.findViewById(R.id.btPickDate);

        // get fragment manager so we can launch from fragment
        final FragmentManager fm = ((AppCompatActivity)getActivity()).getSupportFragmentManager();

        // Using an onclick listener on the editText to show the datePicker
        dateOfBirthET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create the datePickerFragment
                AppCompatDialogFragment newFragment = new DatePickerFragment();
                // set the targetFragment to receive the results, specifying the request code
                newFragment.setTargetFragment(CartFragment.this, REQUEST_CODE);
                // show the datePicker
                newFragment.show(fm, "datePicker");
            }
        });


        recyclerView = view.findViewById(R.id.cartRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add((new CartViewModel(R.drawable.hbdy1,"Basic 1","Description: Basic 1","Rs 599")));
        list.add((new CartViewModel(R.drawable.hbdy1,"Basic 2","Description: Basic 2","Rs 599")));
        list.add((new CartViewModel(R.drawable.hbdy1,"Basic 3","Description: Basic 3","Rs 599")));
        list.add((new CartViewModel(R.drawable.hbdy1,"Basic 4","Description: Basic 4","Rs 599")));
        list.add((new CartViewModel(R.drawable.hbdy1,"Basic 5","Description: Basic 5","Rs 599")));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
//        button = view.findViewById(R.id.confirmAdd);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Add_Address_Fragment addAddressFragment= new Add_Address_Fragment();
//                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,addAddressFragment).commit();
//            }
//        });

        return view;
    }

//    @Override
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.btnConfAdd:
                fragment = new Add_Address_Fragment();
                replaceFragment(fragment);
                break;

//            case R.id.phbookButton:
//                fragment = new PhoneBookFragment();
//                replaceFragment(fragment);
//                break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // check for the results
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            // get date from string
            selectedDate = data.getStringExtra("selectedDate");
            // set the value of the editText
            dateOfBirthET.setText(selectedDate);
        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }



}
