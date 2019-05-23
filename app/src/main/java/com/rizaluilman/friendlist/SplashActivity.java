/*
 Tanggal Pengerjaan: 22/05/2019
 NIM: 10116304
 Nama: Rizalu Ilman Mubarokh
 Kelas: IF-7
 */
package com.rizaluilman.friendlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rizaluilman.friendlist.MainActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
