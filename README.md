# Control de Actividades Hamashiaj — Android
APK Android que abre https://control-actividades-hamashiaj.web.app/ en WebView. La información continúa en Firebase y puede editarse desde el PC.

## Generar APK sin Android Studio
1. Ir a **Actions** > **Compilar APK Android** > **Run workflow**.
2. Esperar que termine correctamente.
3. Abrir la ejecución y descargar **Control-Actividades-Hamashiaj-APK** en **Artifacts**.
4. Descomprimir el ZIP e instalar `app-debug.apk` en Android.

Este APK es una compilación de prueba. Para distribución formal se requiere firmar una versión release y gestionar su clave de firma. Verificar el inicio de sesión Firebase en Android; Google OAuth puede necesitar configuración adicional o Chrome Custom Tabs.
