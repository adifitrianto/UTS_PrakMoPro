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
                "BAHAN : \n" +
                        "- 1 kg ayam pedaging (16 bagian)\n" +
                        "- 8 batang daun bawang\n" +
                        "- 20 kuntum daun kemangi\n" +
                        "- 6 siung bawang merah\n" +
                        "- 6 siung bawang putih\n" +
                        "- 10 buah cabe merah besar\n" +
                        "- 8 buah cabe rawit\n" +
                        "- 5 buah cabe rawit merah\n" +
                        "- 2 batang sereh yg dimemarkan\n" +
                        "- 1 sdt garam\n" +
                        "- 1/2 sdt gula\n" +
                        "- 1 buah tomat\n" +
                        "- 2 lembar daun jeruk\n" +
                        "- 250 ml air\n" +
                        "-------------------------------\n" +
                        "LANGKAH : \n" +
                        "1. Cuci ayam sampai bersih lalu marinasi dgn jeruk nipis diamkan selama beberapa menit\n" +
                        "2. Blender semua bumbu halus\n" +
                        "3. Siapkan wajan dengan api yang tidak terlalu besar, tumis semua bumbu halus sampai harum.\n" +
                        "4. Masukkan ayam yang sudah dimarinasi, tambahkan air dan tunggu hingga air abis dan bumbu meresap pada daging.\n" +
                        "5. Tambahkan daun bawang dan daun kemangi, kemudian aduk rata hingga daun terlihat layu dan beraroma.\n" +
                        "6. Sajikan ayam rica-rica di piring, lalu tambahkan garnish dengan irisan tomat dan daun kemangi segar agar terlihat cantik.",

                "BAHAN : \n" +
                        "- Bumbu Halus:\n" +
                        "- 8 siung bawang merah\n" +
                        "- 3 siung bawang putih\n" +
                        "- 5 biji cabe keriting\n" +
                        "- 15 biji cabe rawit, sesuai selera\n" +
                        "- Sesuai selera Gula\n" +
                        "- 1/2 sdt kaldu bubuk (optional)\n" +
                        "- Garam (optional) tergantung seberapa asin ikan terinya\n" +
                        "Bahan Utama :\n" +
                        "- 250 gr ikan teri\n" +
                        "- 5 lembar daun jeruk, buang tangkainya n rajang halus\n" +
                        "- 50 ml air\n" +
                        "-------------------------------\n" +
                        "LANGKAH : \n" +
                        "1. Cuci bersih ikan terinya hingga gak terasa lagi asinnya. Lalu goreng garing n krispy. Angkat. Sisihkan.\n" +
                        "2.Tumis bumbu halus beserta daun jeruk hingga harum. Beri air sambil diaduk hingga bumbu matang n air berkurang. Lalu masukkan ikan teri. Aduk rata. Koreksi rasa. Angkat. Sajikan.",

                "BAHAN : \n" +
                        "- 1/2 kg kentang\n" +
                        "- 2 lbr daun jeruk\n" +
                        "- Secukupnya garam, gula, lada\n" +
                        "Bumbu halus\n" +
                        "- 12 bh cabe merah keriting\n" +
                        "- 1 bh cabe rawit\n" +
                        "- 10 siung bawang merah\n" +
                        "- 6 siung bawang putih\n" +
                        "- 1/2 bh tomat ukuran sedang\n" +
                        "-------------------------------\n" +
                        "LANGKAH : \n" +
                        "1. Kupas kentang. Potong dan cuci bersih.\n" +
                        "2. Goreng kentang dengan api sedang. Jangan terlalu sering dibolak-balik. Jika sudah matang, angkat lalu tiriskan. Sisihkan.\n" +
                        "3. Panaskan sedikit minyak. Tumis bumbu halus hingga harum.\n" +
                        "4. Tambahkan sedikit air. Masukkan daun jeruk. Masak hingga bumbu matang dan tidak langu.\n" +
                        "5. Beri bumbu seaosning (garam, gula, lada). Koreksi rasa.\n" +
                        "6. Masukkan kentang yang sudah digoreng sebelumnya. Aduk hingga semua kentang terbalut bumbu secara merata.\n" +
                        "7. Masak hingga bumbu sedikit menyusut. Sajikan.",

                "BAHAN : \n" +
                        "- 250 gr daging ayam\n" +
                        "- 50 gr daging sapi\n" +
                        "- 4 papan tahu (potong jadi 20 lalu goreng)\n" +
                        "- 1 butir telur\n" +
                        "- 1 sdm bawang putih bubuk\n" +
                        "- 1/2 sdt lada bubuk\n" +
                        "- 1 sdt kaldu bubuk\n" +
                        "- 1/2 sdt garam\n" +
                        "- 1 sdm saos tiram\n" +
                        "- 5 sdm tepung tapioka\n" +
                        "-------------------------------\n" +
                        "LANGKAH : \n" +
                        "1. Cuci bersih daging ayam kemudian blender hingga halus (bisa ditambahkan air es). Cuci daging sapi kemudian cincang kasar\n" +
                        "2. Masukkan semua bahan menjadi satu (kecuali tahu goreng) kemudian aduk rata. Goreng sedikit adonan untuk mengkoreksi rasanya (tekstur adonan basah cenderung kental, jika adonan kering bisa ditambahkan sedikit air)\n" +
                        "3. Iris sisi tahu untuk mengisi adonan. Ambil 1sdm makan adonan kemudian masukkan kedalam tahu, lakukan sampai tahu dan adonan habis\n" +
                        "4. Panaskan panci pengukus, kemudian kukus taso selama 30 menit",

                "BAHAN : \n" +
                        "- 1 ikat, daun singkong, rebus, peras buang airnya\n" +
                        "- 1/2 btr kelapa, parut\n" +
                        "Bumbu:\n" +
                        "- 3 bh cabe rawit\n" +
                        "- 1 ruas kencur\n" +
                        "- 1 siung bawang merah\n" +
                        "- Secukupnya Garam,\n" +
                        "- Penyedap,secukupnya\n" +
                        "- Minyak tuk menumis\n" +
                        "- Sedikit air\n" +
                        "-------------------------------\n" +
                        "LANGKAH: \n" +
                        "1. Haluskan bahan bumbu, kemudian di tumis,masukan kelapa parut aduk rata tambahkan sedikit air.\n" +
                        "2. Setelah diaduk rata masukan daun singkong, masak sebentar dan angkat.\n" +
                        "3. Makanan siap disajikan."
                //jumlahnya harus sama dengan jumlah judul
        };
        img = new String[]{
                Integer.toString(R.drawable.ayam_rica_rica),Integer.toString(R.drawable.balado_ikan_teri),Integer.toString(R.drawable.kentang_balado),
                Integer.toString(R.drawable.tahu_bakso),Integer.toString(R.drawable.urap_daun_singkong)
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