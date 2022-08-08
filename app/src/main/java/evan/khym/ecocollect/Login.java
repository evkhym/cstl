package evan.khym.ecocollect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login2 = findViewById(R.id.buttongologin);

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Login.this, MainActivity.class);
                startActivity(it);
//                finish();
                Toast.makeText(getApplicationContext(),"Login Successful.", Toast.LENGTH_SHORT).show();
            }

        });
        Button login3 = findViewById(R.id.buttonaccount);

        login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Login.this, Settings.class);
                startActivity(it);
            }
        });

        Button login1 = findViewById(R.id.buttoncontactus);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Login.this, Contact.class);
                startActivity(it);
//                finish();
            }
        });

    }
}