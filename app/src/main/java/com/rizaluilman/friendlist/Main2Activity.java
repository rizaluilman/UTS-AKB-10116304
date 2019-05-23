/*
 Tanggal Pengerjaan: 22/05/2019
 NIM: 10116304
 Nama: Rizalu Ilman Mubarokh
 Kelas: IF-7
 */
package com.rizaluilman.friendlist;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {

    LinearLayout kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        kontak = findViewById(R.id.kontak);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_profil:
                            kontak.setVisibility(View.INVISIBLE);
                            selectedFragment = new ProfilFragment();
                            break;
                        case R.id.nav_contact:
                            kontak.setVisibility(View.INVISIBLE);
                            selectedFragment = new ContactFragment();
                            break;
                        case R.id.nav_group:
                            kontak.setVisibility(View.INVISIBLE);
                            selectedFragment = new GroupFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    public void ph(View view){
        Intent phone = new Intent(Intent.ACTION_DIAL);
        phone.setData(Uri.parse("tel:08221269508"));
        startActivity(phone);
    }

    public void ig(View view){
        Intent instagram = new Intent(Intent.ACTION_VIEW);
        instagram.setData(Uri.parse("https://instagram.com/rizaluilman"));
        startActivity(instagram);
    }

    public void tw(View view){
        Intent twitter = new Intent(Intent.ACTION_VIEW);
        twitter.setData(Uri.parse("https://twitter.com/rizalu_ilman"));
        startActivity(twitter);
    }

    public void fb(View view){
        Intent facebook = new Intent(Intent.ACTION_VIEW);
        facebook.setData(Uri.parse("https://facebook.com/26_rizalu"));
        startActivity(facebook);
    }

    public void in(View view){
        Intent linkedin = new Intent(Intent.ACTION_VIEW);
        linkedin.setData(Uri.parse("https://linkedin.com/in/rizalu-ilman-148569136"));
        startActivity(linkedin);
    }

    public void mail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ilmanrizalu@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hai Rizalu");
        intent.putExtra(Intent.EXTRA_TEXT, "Pesan dari applikasi Friendlist");
        intent.setType("message/rfc822");
        startActivity(intent);
    }

}