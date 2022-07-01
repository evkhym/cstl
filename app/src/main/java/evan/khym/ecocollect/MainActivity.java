package evan.khym.ecocollect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });
        setContentView(R.layout.main);

        Button btn2 = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });
        setContentView(R.layout.main);

        Button btn3 = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });
        setContentView(R.layout.main);

        Button btn4 = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });
        setContentView(R.layout.main);

        Button btn7 = findViewById(R.id.button7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });
        setContentView(R.layout.main);

        Button btn6 = findViewById(R.id.button6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });
    }
}
