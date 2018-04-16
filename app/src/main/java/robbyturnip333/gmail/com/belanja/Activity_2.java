package robbyturnip333.gmail.com.belanja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {
        TextView name, daftar,ukuran,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        name=findViewById(R.id.nama);
        ukuran=findViewById(R.id.size);
        daftar=findViewById(R.id.toping);
        total=findViewById(R.id.harga);

        name.setText(getIntent().getStringExtra("nama"));
        daftar.setText(getIntent().getStringExtra("toping"));
        ukuran.setText(getIntent().getStringExtra("ukuran"));
        total.setText(getIntent().getStringExtra("harga"));

    }
}
