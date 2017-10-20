package com.example.asdf.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_secnod);
        String data= getIntent().getStringExtra("data");

        TextView txtShow = (TextView)findViewById(R.id.txtShow);
        txtShow.setText(data);

        Button btnBack =(Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("dataBuck","我是返回值");
                setResult(RESULT_OK);
                finish();
            }

        });
    }
}
