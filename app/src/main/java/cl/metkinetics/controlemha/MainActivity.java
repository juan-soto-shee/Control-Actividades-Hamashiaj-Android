package cl.metkinetics.controlemha;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

/** Abre la aplicación web en el navegador externo predeterminado. */
public class MainActivity extends Activity {
    private static final String HOME = "https://control-actividades-hamashiaj.web.app/";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse(HOME));
        browser.addCategory(Intent.CATEGORY_BROWSABLE);
        try {
            startActivity(browser);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No hay un navegador instalado", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
