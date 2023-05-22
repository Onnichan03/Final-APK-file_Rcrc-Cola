package crystals.pixels.first.aid.medical.firstaid;

import com.google.android.gms.ads.AdListener;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.h */
class C1703h extends AdListener {

    /* renamed from: a */
    final /* synthetic */ Outputactivity f1645a;

    C1703h(Outputactivity outputactivity) {
        this.f1645a = outputactivity;
    }

    public void onAdClosed() {
        this.f1645a.m2741b();
        this.f1645a.finish();
    }
}
