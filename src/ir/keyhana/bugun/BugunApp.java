package ir.keyhana.bugun;

import android.app.Application;
import android.content.Intent;

public class BugunApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Intent service = new Intent(getApplicationContext(), BugunService.class);
        startService(service);
    }
}
