package br.com.mefti.vid32_hilosyasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    private void UnSegundo(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                for(int i=1; i<=10; i++){
                    UnSegundo();
                }
                break;
            default:

                break;
        }
    }
}
