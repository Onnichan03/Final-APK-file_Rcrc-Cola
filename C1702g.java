package crystals.pixels.first.aid.medical.firstaid;

import android.view.View;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.g */
class C1702g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Outputactivity f1644a;

    C1702g(Outputactivity outputactivity) {
        this.f1644a = outputactivity;
    }

    public void onClick(View view) {
        if (this.f1644a.f1627e > 0) {
            Outputactivity outputactivity = this.f1644a;
            outputactivity.f1627e--;
            this.f1644a.f1628f.setText(Outputactivity.f1623c[this.f1644a.f1627e]);
            this.f1644a.f1629g.setText(Outputactivity.f1624d[this.f1644a.f1627e]);
            if (this.f1644a.f1626b.isLoaded()) {
                this.f1644a.f1626b.show();
            }
        }
    }
}
