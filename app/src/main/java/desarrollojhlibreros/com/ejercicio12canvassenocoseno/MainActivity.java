package desarrollojhlibreros.com.ejercicio12canvassenocoseno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lienzo l = new Lienzo(this);
        setContentView(l);
    }
}
