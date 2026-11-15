package cl.metkinetics.controlemha;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;

/**
 * Abre Firebase Hosting en el navegador real (Chrome Custom Tabs).
 * Google Identity/Firebase Auth utiliza el almacenamiento y cookies de Chrome,
 * en lugar del WebView aislado que rompía el flujo de autenticación.
 *
 * La pantalla totalmente sin barra requiere TWA + Digital Asset Links
 * y una firma de APK estable; no se debe ocultar esa dependencia.
 */
public class MainActivity extends Activity {
    private static final String HOME = "https://control-actividades-hamashiaj.web.app/";

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomTabsIntent tab = new CustomTabsIntent.Builder()
                .setShowTitle(false)
                .build();
        tab.launchUrl(this, Uri.parse(HOME));
        finish();
    }
}
