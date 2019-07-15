package app.emilykgarciaq.com.login;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anuragdhunna.www.splashscreen.R;

public class SplashScreenActivity extends AppCompatActivity {

    private final int DURACION_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent =
                        new Intent(getApplicationContext(),
                                MainActivity.
                                        class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
