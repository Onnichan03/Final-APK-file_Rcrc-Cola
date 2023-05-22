package crystals.pixels.first.aid.medical.firstaid;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.C0631R;

public class Splashscreen extends Activity {

    /* renamed from: a */
    private final int f1630a = 1000;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(C0631R.layout.activity_outputactivity);
        setContentView(C0631R.layout.activity_splashscreen);
        new Handler().postDelayed(new C1705j(this), 1000);
    }
}
