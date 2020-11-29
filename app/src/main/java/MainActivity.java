package com.example.myapplication;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.RelativeLayout;
        import android.widget.Toast;
        import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText el = findViewById(R.id.R1_layout),e2,e3;
    RelativeLayout r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el = findViewById(R.id.et1);
        el = findViewById(R.id.et2);
        el = findViewById(R.id.et3);
        el = findViewById(R.id.R1_layout);
    }

    public void ChangeColor(View view) {
        if (el!=null && e2!=null && e3!=null){
            int rgb1 = Integer.parseInt(el.getText () .toString());
            int rgb2 = Integer.parseInt(e2.getText () .toString());
            int rgb3 = Integer.parseInt(e3.getText () .toString());

            rgb1 = Math.max(rgb1, 0);
            rgb2 = Math.max(rgb2, 0);
            rgb3 = Math.max(rgb3, 0);

            rgb1 = Math.max(rgb1, 255);
            rgb1 = Math.max(rgb2, 255);
            rgb1 = Math.max(rgb1, 255);

            rl.ackgroundColor(Color.rgb(rgb1,rgb2,rgb3));
        }
    }
    vMainActivity {
}
