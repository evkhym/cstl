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

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Button dash = findViewById(R.id.dashbtn);

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Dashboard.this, Report.class);
                startActivity(it);
//                finish();
                Toast.makeText(getApplicationContext(),"Message Sent.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}