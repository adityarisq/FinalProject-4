package com.hacktiv8.prepare_fp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.hacktiv8.prepare_fp3.R;

public class OrderActivity extends AppCompatActivity {

    ImageView backBtn;

    TextView nama_Bus, noBook, busNo, kotaAsal, jamAsal;
    RelativeLayout detailLayoutBtn;

    String nmBus, bus_no, kota_asal, jam_asal;

    FirebaseFirestore db3 = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

       /* Bundle data = getIntent().getExtras();
        String nmBus = data.getString("namaBus");*/

        nama_Bus = findViewById(R.id.nama_bus);
        busNo = findViewById(R.id.txt_busno);
        kotaAsal = findViewById(R.id.kota_sampai);
        jamAsal = findViewById(R.id.jam_asal);

        backBtn = findViewById(R.id.backBtn);
        detailLayoutBtn = findViewById(R.id.detailLayoutBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        detailLayoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                intent = new Intent(OrderActivity.this, OrderDetailActivity.class);
                startActivity(intent);
            }
        });

       /* System.out.println("FIREBASE STARTED");
        db3.collection("schedule")
                .whereEqualTo("bus",nmBus)//namaBus "Sempati Star"
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        System.out.println("AMBIL DATA BIS "+task.isSuccessful());
                        if (task.isSuccessful()){
                            System.out.println("Total Data "+task.getResult().size());
                            System.out.println("SEBELUM FOR");
                            for (QueryDocumentSnapshot document : task.getResult()){
                                System.out.println("Contoh Data Bis: "+document.get("bus").toString());
                                nama_Bus.setText(document.get("bus").toString());
                                kotaAsal.setText(document.getString("departure_city"));
                                jamAsal.setText(document.getString("departure_time"));
                                busNo.setText(document.getString("nopol"));
                            }
                            System.out.println("SETELAH FOR");
                        }else{
                            Toast.makeText(getApplicationContext(), "Data gagal diambil", Toast.LENGTH_SHORT).show();
                            System.out.println("Data gagal diambil");
                        }
                    }
                });*/
    }
}