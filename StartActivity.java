package crystals.pixels.first.aid.medical.firstaid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.C0631R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class StartActivity extends Activity implements View.OnClickListener {

    /* renamed from: a */
    Button f1631a;

    /* renamed from: b */
    Button f1632b;

    /* renamed from: c */
    Intent f1633c;

    /* renamed from: d */
    InterstitialAd f1634d;

    /* renamed from: a */
    private void m2745a() {
        this.f1634d = new InterstitialAd(this);
        this.f1634d.setAdUnitId(getResources().getString(C0631R.string.interstitialunitid));
        m2747b();
        this.f1634d.setAdListener(new C1706k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2747b() {
        this.f1634d.loadAd(new AdRequest.Builder().build());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C0631R.C0632id.startapp:
                this.f1633c = new Intent(this, MainActivity.class);
                if (this.f1634d.isLoaded()) {
                    this.f1634d.show();
                    return;
                } else {
                    startActivity(this.f1633c);
                    return;
                }
            case C0631R.C0632id.about:
                this.f1633c = new Intent(this, Aboutactivity.class);
                if (this.f1634d.isLoaded()) {
                    this.f1634d.show();
                    return;
                } else {
                    startActivity(this.f1633c);
                    return;
                }
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(C0631R.layout.activity_start);
        m2745a();
        this.f1631a = (Button) findViewById(C0631R.C0632id.startapp);
        this.f1631a.setOnClickListener(this);
        this.f1632b = (Button) findViewById(C0631R.C0632id.about);
        this.f1632b.setOnClickListener(this);
    }
}
