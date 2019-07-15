package app.emilykgarciaq.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anuragdhunna.www.splashscreen.R;

public class MethodPaymentScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_payment_screen);

        Button btnCash = (Button) findViewById(R.id.buttonCash);
        Button btnCreditCard = (Button) findViewById(R.id.buttonCreditCard);
        Button btnPaypal = (Button) findViewById(R.id.buttonPayPal);

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSatisfactoryPayment = new Intent(view.getContext(), SatisfactoryPayment.class);
                startActivityForResult(intentSatisfactoryPayment,0);
            }
        });

        btnCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSatisfactoryPaymentt = new Intent(view.getContext(), SatisfactoryPayment.class);
                startActivityForResult(intentSatisfactoryPaymentt,0);
            }
        });

        btnPaypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSatisfactoryPaymentttt = new Intent(view.getContext(), SatisfactoryPayment.class);
                startActivityForResult(intentSatisfactoryPaymentttt,0);
            }
        });
    }
}
