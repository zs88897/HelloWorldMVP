package com.example.a17164.helloworldmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a17164.helloworldmvp.presenter.IPesenter;
import com.example.a17164.helloworldmvp.presenter.presenterImp.PresenterImpl;
import com.example.a17164.helloworldmvp.view.showView;

public class MainActivity extends AppCompatActivity implements showView , View.OnClickListener{
    private TextView textView;
    private Button button;
    private IPesenter iPesenter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(this);//这里的this指的是什么
         iPesenter=new PresenterImpl(this);
    }

    @Override
    public void show(String str) {
        textView.setText(str);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            iPesenter.show();/////
        }
    }
}
