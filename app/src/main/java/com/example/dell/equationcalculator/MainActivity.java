package com.example.dell.equationcalculator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public static final String EXTRA_a="com.example.dell.equationcalculator.EXTRA_a";
    public static final String EXTRA_b="com.example.dell.equationcalculator.EXTRA_b";
    public static final String EXTRA_c="com.example.dell.equationcalculator.EXTRA_c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });


    }

    private void calculate() {


        Intent intent=new Intent(this,Main2Activity.class);
        //getting values for a,b,c through their respective IDs

        EditText editText1= (EditText) findViewById(R.id.editText);
        int a = Integer.parseInt(editText1.getText().toString());
        EditText editText2= (EditText) findViewById(R.id.editText2);
        int b=  Integer.parseInt(editText2.getText().toString());
        EditText editText3= (EditText) findViewById(R.id.editText3);
        int c= Integer.parseInt(editText3.getText().toString());

        //using putextra() Method to pass values to the other activity

        intent.putExtra(EXTRA_a,a);
        intent.putExtra(EXTRA_b,b);
        intent.putExtra(EXTRA_c,c);

        startActivity(intent);

    }
}






