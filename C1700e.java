package crystals.pixels.first.aid.medical.firstaid;

import android.view.View;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.e */
class C1700e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Outputactivity f1642a;

    C1700e(Outputactivity outputactivity) {
        this.f1642a = outputactivity;
    }

    public void onClick(View view) {
        if (this.f1642a.f1625a.isLoaded()) {
            this.f1642a.f1625a.show();
        } else {
            this.f1642a.finish();
        }
    }
}
