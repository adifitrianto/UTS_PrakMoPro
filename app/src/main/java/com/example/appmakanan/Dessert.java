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
                    "BAHAN : \n" +
                            "- 5 buah pisang raja, dikukus\n" +
                            "- 100 ml air pandan\n" +
                            "- 250 ml susu cair\n" +
                            "- 3-4 sdm tepung terigu segitiga\n" +
                            "- 1 sdm butter leleh\n" +
                            "Bahan bubur :\n" +
                            "- 3 sdm tepung beras\n" +
                            "- 350 ml santan matang yg sdh diberi garam\n" +
                            "- sirup pisang ambon\n" +
                            "- kental manis putih\n" +
                            "- serut ice\n" +
                            "-------------------------------\n" +
                            "LANGKAH: \n" +
                            "1. Kukus pisang raja, sisihkan\n" +
                            "2. Buat dadar kulitnya dengan mencampur semua bahan kulit dadar, dan saring sampai halus.\n" +
                            "3. Gulung pisang kukus dengan kulit. sisihkan\n" +
                            "4. Buat bubur sumsumnya dengan memasakn tepung beras dan santan sampai meletup matang\n" +
                            "5. Tata dalam mangkok, potongan pisang ijo + bubur sumsum + sirup merah + kental manis dan es batu.",

                    "BAHAN : \n" +
                            "- 200 gr ubi kuning\n" +
                            "- Pisang sesuai selera dan bisa di sesuaikan\n" +
                            "- 8 sdm tepung tapioka\n" +
                            "- 100 gr Gula aren asli\n" +
                            "- 10 sdm gula pasir\n" +
                            "- Secukupnya garam\n" +
                            "- Daun pandan\n" +
                            "- 700 ml Air\n" +
                            "- 1 saset santan kara\n" +
                            "-------------------------------\n" +
                            "LANGKAH: \n" +
                            "1. Cuci ubi, kemudian kukus kurleb 10 menit...\n" +
                            "2. Angkat ubi dan haluskan menggunakan garpu...\n" +
                            "3. Campurkan ubi dengan tepung tapioka. Dan Uleni hingga kalis..\n" +
                            "4. Bentuklah adonan tersebut menjadi bola-bola sebesar kelereng.\n" +
                            "5. Kemudian rebus dengan gula merah, gula putih masak adonan hingga matang (terapung)....lalu sajikan\n" +
                            "6. Santan dimasak tersendiri dengan daun pandan. Apabila akan disajikan, tuang santan dan siap untuk dinikmati.",

                    "BAHAN : \n" +
                            "- 1 buah mangga alpukat\n" +
                            "- 50 gr fiber cream\n" +
                            "- 5 sdm gula pasir\n" +
                            "- 1 sdm biji selasih\n" +
                            "- Sejumput garam\n" +
                            "- Nata de coco secukupnya (tambahan saya)\n" +
                            "- 1 lembar daun pandan (ikat simpul)\n" +
                            "- 300 ml air\n" +
                            "-------------------------------\n" +
                            "LANGKAH : \n" +
                            "1. Kupas mangga kemudian potong\" dadu\n" +
                            "2. Rendam selasih dg air matang dan diamkan sampai mengembang kemudian cuci bersih\n" +
                            "3. Dalam panci masukkan fiber cream, gula pasir, garam, daun pandan, kemudian tambahkan air dan masak hingga mendidih kemudian sisihkan tunggu sampai agak dingin\n" +
                            "4. Siapkan gelas saji, masukkan mangga, selasih, nata de coco dan es batu\n" +
                            "5. Setelah itu siram rebusan fiber cream dan beri toping mangga dan selasih lagi diatasnya.",

                    "BAHAN : \n" +
                            "- 3 bh pisang raja, kukus\n" +
                            "- 400 ml santan kental\n" +
                            "- 100 ml santan encer, bisa pakai air biasa\n" +
                            "- 4 sdm tepung beras\n" +
                            "- 1 lembar daun pandan\n" +
                            "- 2 sdm gula pasir\n" +
                            "- Sejumput garam\n" +
                            "- Sirup Cocopandan\n" +
                            "-------------------------------\n" +
                            "LANGKAH : \n" +
                            "1. Potong potong pisang yang habis dikukus sesuai selera\n" +
                            "2. Larutkan tepung beras, gula dan garam dengan santan encer aduk sampai semua tercampur rata.\n" +
                            "3. Masak santan bersama daun pandan sampai mendidih.\n" +
                            "4. Setelah santan mendidih masukkan larutan tepung beras, aduk aduk sampai matang.\n" +
                            "5. Masukkan adonan dan pisang kedalam mangkok lalu beri sirup Cocopandan dan es batu. Sajikan.",

                    "BAHAN : \n" +
                            "- 100 gram tepung tapioka\n" +
                            "- 60 gram tepung beras\n" +
                            "- 50 gram tepung hunkwe\n" +
                            "- 65 ml santan instan\n" +
                            "- 635 ml air\n" +
                            "- 1/2 sdt garam\n" +
                            "Bahan kuah\n" +
                            "- 300 ml air\n" +
                            "- 100 ml santan instan\n" +
                            "- 2 lembar pandan, simpulkan\n" +
                            "Tambahan\n" +
                            "- Sirup cocopandan\n" +
                            "- Es batu\n" +
                            "-------------------------------\n" +
                            "LANGKAH : \n" +
                            "1. Masukkan semua bahan dalam teflon. Aduk rata, jangan sampai ada yang menggumpal. Masak dengan api sedang sambil terus diaduk agar tidak gosong.\n" +
                            "2. Bagi menjadi dua adonan, beri pewarna makanan. Aduk.\n" +
                            "3. Tuang adonan dalam cetakan. Biarkan dingin.\n" +
                            "4. Kuah santan: masukkan semua bahan kuah santan dalam panci. Masak dengan api sedang sampai mendidih sambil terus diaduk agar tidak pecah.\n" +
                            "5. Cara penyajian: masukkan es batu, potong adonan yang sudah set. Susun dalam wadah. Siram dengan sirup dan kuah santan. Siap untuk disantap."
                    //jumlahnya harus sama dengan jumlah judul
            };
            img = new String[]{
                    Integer.toString(R.drawable.es_pisang_ijo),Integer.toString(R.drawable.kolak_candil),Integer.toString(R.drawable.laksamana_mengamuk),
                    Integer.toString(R.drawable.pallu_butung),Integer.toString(R.drawable.selendang_mayang)
            };
            mylist = new ArrayList<>();

            for (int i=0; i<jdl.length; i++){
                map = new HashMap<>();
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