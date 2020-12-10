package com.example.appmakanan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Dessert extends AppCompatActivity {
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
                    "Es Pisang Ijo","Kolak Candil","Es Laksamana Mengamuk","Es Pallu Butung","Es Selendang Mayang"
            };
            ktr = new String[]{
                    "Dessert Indonesia","Dessert Indonesia","Dessert Indonesia","Dessert Indonesia","Dessert Indonesia" //jumlahnya harus sama dengan jumlah judul
            };
            img = new String[]{
                    Integer.toString(R.drawable.es_pisang_ijo),Integer.toString(R.drawable.kolak_candil),Integer.toString(R.drawable.laksamana_mengamuk),
                    Integer.toString(R.drawable.pallu_butung),Integer.toString(R.drawable.selendang_mayang)
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