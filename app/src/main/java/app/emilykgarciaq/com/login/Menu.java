package app.emilykgarciaq.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anuragdhunna.www.splashscreen.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnlocalization = (Button) findViewById(R.id.buttonSearch);
        btnlocalization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentlocalization = new Intent(view.getContext(),LocalizationScreen.class);
                startActivityForResult(intentlocalization,0);
            }
        });

        Button btnUserFound = (Button) findViewById(R.id.buttonCall);
        btnUserFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUserFound = new Intent(view.getContext(),UserFound.class);
                startActivityForResult(intentUserFound,0);
            }
        });

    }
}
