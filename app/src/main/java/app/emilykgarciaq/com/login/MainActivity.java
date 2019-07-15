package app.emilykgarciaq.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.anuragdhunna.www.splashscreen.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtRegister = (TextView) findViewById(R.id.textViewRegist);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister = new Intent(v.getContext(),RegisterScreen.class);
                startActivityForResult(intentRegister,0);
            }
        });

        Button btnMenu = (Button) findViewById(R.id.buttonContinue);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu = new Intent(view.getContext(), Menu.class);
                startActivityForResult(intentMenu,0);
            }
        });
    }
}
