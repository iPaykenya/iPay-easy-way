package com.libs.ipay.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.libs.ipay.ipayLibrary.Channel;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pass your parameters here

        String live             = "1";
        String vid              = "0000";
        String cbk              = "http://smssystem.intrepidprojects.co.ke/autopaytest/callback.php";
        String security_key     = "00003";
        String amount           = "10";
        String phone_number     = "0700000000";
        String email            = "example@gmail.com";


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Channel fragment1 = new Channel();
        Bundle data = new Bundle();
        data.putString("live", live);
        data.putString("vid", vid);
        data.putString("cbk", cbk);
        data.putString("key", security_key);
        data.putString("amount", amount);
        data.putString("phone", phone_number);
        data.putString("email", email);
        fragment1.setArguments(data);
        fragmentTransaction.add(R.id.layouta, fragment1, "fragment");
        fragmentTransaction.commit();


    }
}
