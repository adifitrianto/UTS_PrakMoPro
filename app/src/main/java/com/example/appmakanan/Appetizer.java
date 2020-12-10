package com.example.appmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Appetizer extends AppCompatActivity {
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
                "Bakso Samyang","Bingka Telur","Rujak Cingur","Urap","Tempe Mendoan"
        };
        ktr = new String[]{
                "Appetizer Indonesia","Appetizer Indonesia","Appetizer Indonesia","Appetizer Indonesia","Appetizer Indonesia" //jumlahnya harus sama dengan jumlah judul
        };
        img = new String[]{
                Integer.toString(R.drawable.bakso),Integer.toString(R.drawable.bingka_telur),Integer.toString(R.drawable.rujak_cingur),
                Integer.toString(R.drawable.urap),Integer.toString(R.drawable.tempe_mendoan)
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