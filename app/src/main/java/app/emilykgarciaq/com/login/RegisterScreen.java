package app.emilykgarciaq.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anuragdhunna.www.splashscreen.R;

public class RegisterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        Button btnMenuRegist = (Button) findViewById(R.id.buttonContinueRegister);
        btnMenuRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenuRegist = new Intent(view.getContext(),Menu.class);
                startActivityForResult(intentMenuRegist,0);
            }
        });

    }
}
