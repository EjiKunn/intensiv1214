package ru.kokorinvv.intensiv1214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myBtn1;
    Button myBtn2;
    Button myBtn3;
    Button myBtn4;
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBtn1 = findViewById(R.id.button);
        myBtn2 = findViewById(R.id.button2);
        myBtn3 = findViewById(R.id.button3);
        myBtn4 = findViewById(R.id.button4);
        myText = findViewById(R.id.Text1);

        View.OnClickListener oclBtn1 = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                myText.setText("Жмакнули кнопочку 1");
                Log.e("@click", "Преснули кнопку 1");

            }
        };
        View.OnClickListener oclBtn2 = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                myText.setText("Жмакнули кнопочку 2");
                Log.e("@click", "Преснули кнопку 2");

            }
        };
        View.OnClickListener oclBtn3 = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                myText.setText("Жмакнули кнопочку 3");
                Log.e("@click", "Преснули кнопку 3");

            }
        };
        View.OnClickListener oclBtn4 = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                myText.setText("Жмакнули кнопочку 4");
                Log.e("@click", "Преснули кнопку 4");

            }
        };

        myBtn1.setOnClickListener(oclBtn1);
        myBtn2.setOnClickListener(oclBtn2);
        myBtn3.setOnClickListener(oclBtn3);
        myBtn4.setOnClickListener(oclBtn4);




    }
}