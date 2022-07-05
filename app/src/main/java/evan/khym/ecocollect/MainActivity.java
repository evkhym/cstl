package evan.khym.ecocollect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button homeb = findViewById(R.id.homeb);

        homeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, MainActivity.class);
                startActivity(it);
//                finish();
            }
        });

        Button contactbtn = findViewById(R.id.contactb);

        contactbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Contact.class);
                startActivity(it);
//                finish();
            }
        });

        Button loginb = findViewById(R.id.loginb);

        loginb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
//                finish();
            }
        });

        Button dashboardb = findViewById(R.id.dashboardb);

        dashboardb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Dashboard.class);
                startActivity(it);
//                finish();
            }
        });

        Button settingsb = findViewById(R.id.settingsb);

        settingsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Settings.class);
                startActivity(it);
//                finish();
            }
        });

        Button reportb = findViewById(R.id.reportb);

        reportb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Report.class);
                startActivity(it);
//                finish();
            }
        });
    }
}
