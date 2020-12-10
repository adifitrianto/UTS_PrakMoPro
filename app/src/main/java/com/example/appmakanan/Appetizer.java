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
    String[] resep; //deklarasi keterangan resep
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
                "BAHAN: \n" +
                "- 250 gr bakso\n" +
                        "- 1 butir telur\n" +
                        "- 2 lembar daging asap, iris kotak kecil\n" +
                        "- 3 butir bawang putih cincang halus\n" +
                        "- 1/2 butir bombay iris besar\n" +
                        "- 3 sdm saos sambal (saya merk sasa)\n" +
                        "- 3 sdm saos tomat (saya merk indofood)\n" +
                        "- 2 sdm kecap manis (saya merk abc)\n" +
                        "- 1 sdt saos tiram (saya merk saori)\n" +
                        "- 3 sdm minyak untuk menumis\n" +
                        "- Garam dan penyedap rasa\n" +
                        "- 30 ml air\n" +
                        "-------------------------------\n" +
                 "LANGKAH: \n" +
                 "1. Siapkan semua bumbu\n" +
                 "2. Panaskan minyak dalam wajan. Tumis bawang putih hingga kecoklatan. Masukkan bawang bombay aduk hingga layu\n" +
                        "3. Masukkan telur, aduk sampai tercampur rata. Masukkan daging asap dan aduk rata\n" +
                        "4. Masukkan kecap, saos tomat, saos sambal, saos tiram, garam dan penyedap rasa. Lalu masukkan bakso dan air. Aduk rata\n" +
                        "5. Tunggu sampai air menyusut. Bakso Samyang ala Korean Taste siap disantap.",

                "BAHAN : \n" +
                "- 3 biji telor ayam/ itik\n" +
                "- 250 ml santan\n" +
                "- 100 ml gula merah yg sdh dicairkan\n" +
                "- 1 sendok gula putih\n" +
                "- Setengah sdt garam\n" +
                "- 1 vanili bubuk\n" +
                "- 1 sendok penuh tepung terigu\n" +
                "- Buah nangka secukupnya dipotong kotak kotak\n" +
                        "-------------------------------\n" +
                "LANGKAH: \n" +
                "1. Masukan santan kedlm wadah lain jangan dicampur dulu dengan telur dan lain lain\n" +
                "2. Masukan telur,gula merah,gula putih,vanili, garam dlm satu wadah kemudian campur sampai gula larut tidak usah sampai berbuih.\n" +
                "3. Larutkan tepung terigu dengan sedikit air aduk sampai tidak menggumpal\n" +
                "4. Campur santan dengan kocokan telur dan masukan juga tepung yg sdh dicairkan aduk sampai rata kemudian saring agar tidak ada yg bergerindil\n" +
                "5. Masukan setengah buah nangka yg sdh dipotong potong.setengahnya buat topping ya\n" +
                "6. Siapkan panci kukusan.panaskan sekitar 3 menit kemudian masukan adonan dlm loyang bunga dan kukus sekitar kurang lebih 30 menit.bisa juga tes tusuk.angkat sajikan... Selamat mencoba",

                "BAHAN : \n" +
                        "- 300 gram tahu putih\n" +
                        "- 250 gram tempe\n" +
                        "- 175 gram kangkung\n" +
                        "- 100 gram taoge\n" +
                        "- 500 gram cingur\n" +
                        "- 150 gram mentimun\n" +
                        "- 200 gram mangga muda\n" +
                        "- 350 gram bengkoang\n" +
                        "- 5 buah lontong\n" +
                        "- 3 sdm bawang goreng\n" +
                        "- 100 gram kerupuk kanji\n" +
                        "- 2 lembar daun salam\n" +
                        "- 2 cm jahe\n" +
                        "-------------------------------\n" +
                        "LANGKAH\n" +
                        "1. Cuci cingur hingga bersih. Rebus dengan ditambahkan garam,daun salam dan jahe.\n" +
                        "2. Goreng tahu dan tempe hingga kecoklatan kemudian potong-potong sesuai selera.\n" +
                        "3. Haluskan cabai merah,kacang tanah goreng,bawang putih,gula merah,pisang batu,terasi dan garam.\n" +
                        "4. Tambahkan petis dan air asam jawa kemudian aduk rata.\n" +
                        "5. Blanch atau rebus sebentar kangkung dan taoge,tiriskan.\n" +
                        "6. Potong-potong bengkoang,mentimun,dan mangga muda\n" +
                        "7. Tata sayuran cingur dan buah yang sudah di potong diatas piring saji.\n" +
                        "8. Sajikan dengan saus sambal bawang goreng dan kerupuk kanji.",

                "BAHAN :\n" +
                        "- Separo kelapa agak muda\n" +
                        "- 1 ikat kemangi\n" +
                        "- 1 ikat daun singkong\n" +
                        "- 1 ikat genjer\n" +
                        "- 1 ikat daun pepaya\n" +
                        "- 250 gr tauge\n" +
                        "- 3 lembar daun jeruk\n" +
                        "- Secukupnya Penyedap rasa\n" +
                        "- Secukupnya Garam\n" +
                        "Bumbu halus :\n" +
                        "- 5 siung baput\n" +
                        "- 3 ruas kencur\n" +
                        "- 10 cabai merah\n" +
                        "-10 cabai rawit\n" +
                        "- 2 sdm gula merah\n" +
                        "- 1 sdm trasi\n" +
                        "- 1 sdt asam jawa\n" +
                        "-------------------------------\n" +
                        "LANGKAH : \n" +
                        "1. Parut klapa lalu aduk dengan bumbu halus tambahkan daun jeruk, garam dan penyebab lalu ditarok wajan masak sambil diaduk aduk koreksi rasa angkat\n" +
                        "2. Rebus daun singkong, genjer, daun pepaya, toge lalu tiriskan (direbus sendiri sendiri)\n" +
                        "3. Petik daun kemangi cuci dan tiriskan\n" +
                        "4. Aduk semua bumbu dan sayuran lalu taroh piring dan sajikan",

                "BAHAN : \n" +
                        "- 1 papan tempe,iris tipis (sesuai selera)\n" +
                        "- 10 sdm tepung terigu\n" +
                        "- 1 sdt garam\n" +
                        "- 2 batang daun bawang,iris tipis\n" +
                        "- 200 ml air atau secukupnya\n" +
                        "Bumbu halus:\n" +
                        "- 4 siung bawang putih\n" +
                        "- 1 ruas kunyit\n" +
                        "- 1 sdm ketumbar bubuk\n" +
                        "- 1 sdt garam\n" +
                        "-------------------------------\n" +
                        "LANGKAH : \n" +
                        "1. Blender bumbu halus,lalu campurkan dengan tempe,aduk rata dan biarkan sekitar 10 menit agar bumbu meresap\n" +
                        "2. Campurkan terigu+garam+air,aduk rata hingga semi kental (ga terlalu kental dan ga terlalu cair)\n" +
                        "3. Masukkan daun bawang,aduk rata\n" +
                        "4. Celupkan tempe kedalam adonan tepung,lalu goreng dengan api kecil hingga setengah matang (jangan terlalu lama memasaknya agar tidak garing dan dapat hasil mendoan yang pas),angkat dan sajikan bersama sambal cocolan sesuai selera" //jumlahnya harus sama dengan jumlah judul
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