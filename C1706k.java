package crystals.pixels.first.aid.medical.firstaid;

import com.google.android.gms.ads.AdListener;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.k */
class C1706k extends AdListener {

    /* renamed from: a */
    final /* synthetic */ StartActivity f1648a;

    C1706k(StartActivity startActivity) {
        this.f1648a = startActivity;
    }

    public void onAdClosed() {
        this.f1648a.m2747b();
        this.f1648a.startActivity(this.f1648a.f1633c);
    }
}
