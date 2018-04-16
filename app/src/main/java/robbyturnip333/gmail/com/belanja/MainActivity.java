package robbyturnip333.gmail.com.belanja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button min,plus,order;
    TextView t1,t2,t3,t4,t5;
    RadioButton rb1,rb2,rb3;
    CheckBox cb0,cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    int nilai=0;
    int harga,total;
    String kue,atasan,value,top1,top2,top3,top4,top5,top6,top7,top8;
    int toping1=0;
    int toping2=0;
    int toping3=0;
    int toping4=0;
    int toping5=0;
    int toping6=0;
    int toping7=0;
    int toping8=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        min=findViewById(R.id.btn1);
        plus=findViewById(R.id.btn2);
        order=findViewById(R.id.btn3);
        t1=findViewById(R.id.nama);
        t2=findViewById(R.id.tjum);
        rb1=findViewById(R.id.rbsmall);
        rb2=findViewById(R.id.rbmedium);
        rb3=findViewById(R.id.rblarge);
        cb0=findViewById(R.id.cb1);
        cb1=findViewById(R.id.cb2);
        cb2=findViewById(R.id.cb3);
        cb3=findViewById(R.id.cb4);
        cb4=findViewById(R.id.cb5);
        cb5=findViewById(R.id.cb6);
        cb6=findViewById(R.id.cb7);
        cb7=findViewById(R.id.cb8);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                harga=harga+toping1+toping2+toping3+toping4+toping5+toping6+toping7+toping8;
                total=harga*nilai;
                value=Integer.toString(total);
                atasan=top1+top2+top3+top4+top5+top6+top7+top8;
                Intent baru=new Intent(MainActivity.this,Activity_2.class);
                baru.putExtra("ukuran",kue);
                baru.putExtra("nama",t1.getText().toString());
                baru.putExtra("toping",atasan);
                baru.putExtra("harga",value);
                startActivity(baru);
                finish();

            }
        });

    }

    public void kurangNomor(View view){
        nilai=nilai-1;
        if(nilai>=0) ubahNomor(nilai);
        else {
            nilai = 0;
            ubahNomor(nilai);
        }
    }

    public void tambahNomor(View view){
        nilai=nilai+1;
        ubahNomor(nilai);
    }

    public  void ubahNomor(int hasil){

        t2.setText(""+hasil);
    }

    public void ukuranKue(View size){
    boolean ukuran=((RadioButton) size). isChecked();
    switch (size.getId()){
        case R.id.rbsmall:
            kue=rb1.getText().toString();
            harga=50000;
            break;
        case R.id.rbmedium:
            kue=rb2.getText().toString();
            harga=100000;
            break;
        case R.id.rblarge:
            kue=rb3.getText().toString();
            harga=200000;
            break;
        default:
            kue="Ukuran belum dipilih";
            harga=0;
            break;

    }
    }
    public void isiTopping(View view){
       if(cb0.isChecked()){
           toping1=10000;
           top1=cb0.getText().toString();
       }
       else{
           top1="";
       }
        if(cb1.isChecked()){
            toping2=5000;
            top2="\n"+cb1.getText().toString();
        }
        else{
            top2="";
        }

        if(cb2.isChecked()){
            toping3=50000;
            top3="\n"+cb2.getText().toString();
        }
        else{
            top3="";
        }

        if(cb3.isChecked()){
            toping4=20000;
            top4="\n"+cb3.getText().toString();

        }
        else{
            top4="";
        }

        if(cb4.isChecked()){
            toping5=30000;
            top5="\n"+cb4.getText().toString();

        }
        else{
            top5="";
        }

        if(cb5.isChecked()){
            toping6=40000;
            top6="\n"+cb5.getText().toString();
        }
        else{
            top6="";
        }

        if(cb6.isChecked()){
            toping7=10000;
            top7="\n"+cb6.getText().toString();
        }
        else{
            top7="";
        }
        if(cb7.isChecked()){
            toping8=15000;
            top8="\n"+cb7.getText().toString();

        }
        else{
            top8="";
        }

    }


    }


