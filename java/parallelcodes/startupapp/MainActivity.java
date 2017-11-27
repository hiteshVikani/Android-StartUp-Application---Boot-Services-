package parallelcodes.startupapp;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtHelloWorld = (TextView) findViewById(R.id.txtHelloWorld);
        txtHelloWorld.setText(Calendar.getInstance().getTime().toString());
    }
}
