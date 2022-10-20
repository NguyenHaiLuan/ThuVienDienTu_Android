package nhl69.luansapp.tonghopandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class List extends AppCompatActivity {

    ListView listView;
    ArrayList<Books> arrayList;
    AdapterBooks adapterBooks;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.listviewbooks);
        arrayList = new ArrayList<>();
        arrayList.add(new Books("Đắc Nhân Tâm", "Dale Carnegie", "Đang đọc...", R.drawable.dacnhantam));
        arrayList.add(new Books("The one thing!", "Gary Keller and Jay Papasan", "Đã đọc!", R.drawable.theonething1));
        arrayList.add(new Books("Dám nghĩ lớn", "David Joseph Schwartz", "Đã đọc!", R.drawable.damnghilon));
        arrayList.add(new Books("Cho tôi xin một vé đi tuổi thơ", "Nguyễn Nhật Ánh", "Đã đọc!", R.drawable.chotoixin));
        arrayList.add(new Books("Nhà giả kim", "Paulo Coelho", "Đã đọc!", R.drawable.nhagiakim));
        arrayList.add(new Books("Thức tỉnh mục đích sống", "Eckhart Tolle", "Đã đọc!", R.drawable.thuctinh));
        arrayList.add(new Books("7 Thói quen để thành đạt", "Stephen R. Covey", "Đã đọc!", R.drawable.thoiquenthanhdat));
        arrayList.add(new Books("Những bài học cuộc sống", "Hal Urban", "Đã đọc!", R.drawable.nhungbaihoc));
        arrayList.add(new Books("Đọc vị bất kỳ ai", "David J.Lieberman", "Đã đọc!", R.drawable.docvibatkiai));

        adapterBooks = new AdapterBooks(List.this, R.layout.books_list, arrayList);
        listView.setAdapter(adapterBooks);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                switch (i){
                    case 0:
                        intent.setClass(List.this, DacNhanTam.class);
                        break;
                    case 1:
                        intent.setClass(List.this, TheOneThingD.class);
                        break;
                    case 2:
                        intent.setClass(List.this, DamNghiLonD.class);
                        break;
                    case 3:
                        intent.setClass(List.this, ChoToiXinMotVe.class);
                        break;
                    case 4:
                        intent.setClass(List.this, NhaGiaKimDD.class);
                        break;
                    case 5:
                        intent.setClass(List.this, ThucTinhMucDichSong.class);
                        break;
                    case 6:
                        intent.setClass(List.this, ZThoiQuenDeThanhDat.class);
                        break;
                    case 7:
                        intent.setClass(List.this, ZNhungBaiHocCuocSong.class);
                        break;
                    case 8:
                        intent.setClass(List.this, ZDocViBatKiAi.class);
                        break;
                }
                startActivity(intent);
            }
        });

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.back:
                        finish();
                        break;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.mybooks:
                        startActivity(new Intent(getApplicationContext(), List.class));
                        overridePendingTransition(0, 0);
                        return true;
                }                return true;
            }
        });

    }
}