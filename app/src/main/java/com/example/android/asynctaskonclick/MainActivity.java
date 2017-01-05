package com.example.android.asynctaskonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyAsyncRequest {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn_call_async);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myMethod();
            }
        });
    }

    private void myMethod() {
        String myParam = "my param value";
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.response = this;
        myAsyncTask.execute(myParam);
    }

    @Override
    public void requestDone(String output) {
        Toast.makeText(this,output,Toast.LENGTH_LONG).show();
    }
}
