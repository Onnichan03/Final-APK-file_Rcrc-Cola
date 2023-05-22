package crystals.pixels.first.aid.medical.firstaid;

import android.content.Intent;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.j */
class C1705j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Splashscreen f1647a;

    C1705j(Splashscreen splashscreen) {
        this.f1647a = splashscreen;
    }

    public void run() {
        this.f1647a.startActivity(new Intent(this.f1647a, StartActivity.class));
        this.f1647a.finish();
    }
}
