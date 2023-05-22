package crystals.pixels.first.aid.medical.firstaid;

import com.google.android.gms.ads.AdListener;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.d */
class C1699d extends AdListener {

    /* renamed from: a */
    final /* synthetic */ MainActivity f1641a;

    C1699d(MainActivity mainActivity) {
        this.f1641a = mainActivity;
    }

    public void onAdClosed() {
        this.f1641a.m2738b();
        this.f1641a.startActivity(this.f1641a.f1622d);
    }
}
