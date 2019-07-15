package app.emilykgarciaq.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anuragdhunna.www.splashscreen.R;

public class LocalizationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localization_screen);

        Button btnPaymentScreen = (Button) findViewById(R.id.buttonYes);
        btnPaymentScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPaymentScreen= new Intent(view.getContext(),MethodPaymentScreen.class);
                startActivityForResult(intentPaymentScreen,0);
            }
        });

    }
}
