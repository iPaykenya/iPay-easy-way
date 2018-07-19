package com.libs.ipay.library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.libs.ipay.ipayLibrary.CardChannel;
import com.libs.ipay.ipayLibrary.Channel;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pass your parameters here

        String live             = "0";
        String vid              = "demo";
        String cbk              = "http://smssystem.intrepidprojects.co.ke/autopaytest/callback.php";
        String security_key     = "demo";
        String amount           = "10";
        String p1               = "value1test";
        String p2               = "value2test";
        String p3               = "value3test";
        String p4               = "value4test";
        String curr             = "KES"; //or USD
        String phone_number     = "0700000000";
        String email            = "example@gmail.com";

        //channel setting (1-sets on && 0-sets off)
        String mpesa_status    = "1";
        String mbonga_status   = "1";
        String airtel_status   = "1";
        String easy_status     = "1";
        String visa_status     = "1";


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Channel fragment1 = new Channel();
        Bundle data = new Bundle();
        data.putString("live", live);
        data.putString("vid", vid);
        data.putString("cbk", cbk);
        data.putString("key", security_key);
        data.putString("amount", amount);
        data.putString("p1", p1);
        data.putString("p2", p2);
        data.putString("p3", p3);
        data.putString("p4", p4);
        data.putString("currency", curr);
        data.putString("phone", phone_number);
        data.putString("email", email);
        data.putString("mpesa_status", mpesa_status);
        data.putString("mbonga_status", mbonga_status);
        data.putString("airtel_status", airtel_status);
        data.putString("easy_status", easy_status);
        data.putString("visa_status", visa_status);
        fragment1.setArguments(data);
        fragmentTransaction.add(R.id.layouta, fragment1, "fragment");
        fragmentTransaction.commit();

    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...
        Toast.makeText(this, ""+ CardChannel.payment_state, Toast.LENGTH_SHORT).show();

    }
}
