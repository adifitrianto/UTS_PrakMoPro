package com.example.appmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainCourse extends AppCompatActivity {
    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] jdl; //deklarasi judul item
    String[] ktr; //deklarasi keterangan item
    String[] img; //deklarasi item image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = (ListView)findViewById(R.id.list_view);
        jdl = new String[] {
                "Ayam Rica-Rica","Balado Ikan Teri","Kentang Balado","Tahu Bakso","Urap Daun Singkong"
        };
        ktr = new String[]{
                "Main Course Indonesia","Main Course Indonesia","Main Course Indonesia","Main Course Indonesia","Main Course Indonesia" //jumlahnya harus sama dengan jumlah judul
        };
        img = new String[]{
                Integer.toString(R.drawable.ayam_rica_rica),Integer.toString(R.drawable.balado_ikan_teri),Integer.toString(R.drawable.kentang_balado),
                Integer.toString(R.drawable.tahu_bakso),Integer.toString(R.drawable.urap_daun_singkong)
        };
        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<jdl.length; i++){
            map = new HashMap<String, String>();
            map.put("Judul", jdl[i]);
            map.put("Keterangan", ktr[i]);
            map.put("Gambar", img[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.list_item,
                new String[]{"Judul", "Keterangan", "Gambar"}, new int[]{R.id.txt_judul,(R.id.txt_keterangan),(R.id.img)});
        listView.setAdapter(adapter);
    }
}