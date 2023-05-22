package crystals.pixels.first.aid.medical.firstaid;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.c */
class C1698c implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MainActivity f1640a;

    C1698c(MainActivity mainActivity) {
        this.f1640a = mainActivity;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1640a.f1622d = new Intent(this.f1640a, Outputactivity.class);
        this.f1640a.f1622d.putExtra("index", new StringBuilder(String.valueOf(i)).toString());
        if (i % 3 != 0) {
            this.f1640a.startActivity(this.f1640a.f1622d);
        } else if (this.f1640a.f1621c.isLoaded()) {
            this.f1640a.f1621c.show();
        } else {
            this.f1640a.startActivity(this.f1640a.f1622d);
        }
    }
}
