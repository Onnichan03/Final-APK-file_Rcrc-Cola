package crystals.pixels.first.aid.medical.firstaid;

import android.view.View;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.f */
class C1701f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Outputactivity f1643a;

    C1701f(Outputactivity outputactivity) {
        this.f1643a = outputactivity;
    }

    public void onClick(View view) {
        if (this.f1643a.f1627e < Outputactivity.f1623c.length - 1) {
            this.f1643a.f1627e++;
            this.f1643a.f1628f.setText(Outputactivity.f1623c[this.f1643a.f1627e]);
            this.f1643a.f1629g.setText(Outputactivity.f1624d[this.f1643a.f1627e]);
            if (this.f1643a.f1626b.isLoaded()) {
                this.f1643a.f1626b.show();
            }
        }
    }
}
