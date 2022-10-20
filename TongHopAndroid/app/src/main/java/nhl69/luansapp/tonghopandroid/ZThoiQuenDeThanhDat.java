package nhl69.luansapp.tonghopandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

@SuppressWarnings("ALL")
public class ZThoiQuenDeThanhDat extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zthoi_quen_de_thanh_dat);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationbar);
        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        finish();
                        break;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.mybooks:
                        startActivity(new Intent(getApplicationContext(), List.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return true;

            }
        });
    }
}