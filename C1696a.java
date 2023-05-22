package crystals.pixels.first.aid.medical.firstaid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.C0631R;

/* renamed from: crystals.pixels.first.aid.medical.firstaid.a */
public class C1696a extends BaseAdapter {

    /* renamed from: c */
    private static LayoutInflater f1635c = null;

    /* renamed from: a */
    String[] f1636a;

    /* renamed from: b */
    Context f1637b;

    public C1696a(MainActivity mainActivity, String[] strArr) {
        this.f1636a = strArr;
        this.f1637b = mainActivity;
        f1635c = (LayoutInflater) this.f1637b.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.f1636a.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1697b bVar = new C1697b(this);
        View inflate = f1635c.inflate(C0631R.layout.listitems, (ViewGroup) null);
        bVar.f1638a = (TextView) inflate.findViewById(C0631R.C0632id.textView1);
        bVar.f1638a.setText(this.f1636a[i]);
        return inflate;
    }
}
