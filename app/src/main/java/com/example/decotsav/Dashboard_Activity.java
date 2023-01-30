package com.example.decotsav;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.decotsav.databinding.ActivityDashboardBinding;
import com.example.decotsav.ui.cart.CartFragment;
import com.example.decotsav.ui.customized.CustomizedFragment;
import com.example.decotsav.ui.home.HomeFragment;
import com.example.decotsav.ui.profile.ProfileFragment;

public class Dashboard_Activity extends AppCompatActivity {

    ActivityDashboardBinding binding;
    TextView addAddress;
//    Toolbar toolbar;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        toolbar = (Toolbar) findViewById(R.id.myTitleToolbar);
//        setSupportActionBar(toolbar);

        binding= ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.navigation_home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.navigation_favourite:
                    replaceFragment(new CustomizedFragment());
                    break;
                case  R.id.navigation_profile:
                    replaceFragment(new ProfileFragment());
                    break;
                case  R.id.navigation_cart:
                    replaceFragment(new CartFragment());
                    break;
            }

            return true;     
        });

//        addAddress=(TextView)findViewById(R.id.myAddress);
//        addAddress.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Dashboard_Activity.this, Add_Address_Fragment.class);
//                startActivity(intent);
//
//                Toast.makeText(Dashboard_Activity.this, "Add Address", Toast.LENGTH_LONG).show();            }
//        });



    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }



}