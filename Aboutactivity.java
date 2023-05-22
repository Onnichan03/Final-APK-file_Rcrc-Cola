package crystals.pixels.first.aid.medical.firstaid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.C0631R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Aboutactivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(C0631R.layout.activity_aboutactivity);
        ((AdView) findViewById(C0631R.C0632id.adView)).loadAd(new AdRequest.Builder().build());
        ((TextView) findViewById(C0631R.C0632id.textabout)).setText(" .First aid is a life-saving technique which people prefer to save lives with minimal equipment. First aid includes simple procedures which are aided with some common sense. It is not classified as a medical treatment and cannot be comparable to a medical professional.\n\n Why do I need a first aid App?\nFalls, bee stings, burns, allergic reactions etc all of these are common accidents that can happen in any home or on any outing. That’s when a first aid App  comes in handy. When you have a Knowledge and Idea how to react to a certain accident in a certain situation.\nFirst aid is emergency care given immediately to an injured person. The purpose of first aid is to minimize injury and future disability. In serious cases, first aid may be necessary to keep the victim alive.\nmobile application ng first aid na magtuturo sa mga user kung paano mangasiwa ng first aid upang matugunan ang mga nabanggit na isyu. Maaari mong i-download ang application at gamitin ito sa isang emergency. Ang gumagamit ay kailangan lamang na magpasok ng anumang hindi inaasahang pinsala o sakit, at ang application ay gagabay sa kanila sa pamamagitan ng hakbang-hakbang na pamamaraan ng first aid. Ang paggamit ng programa ay makakatulong sa pagliligtas ng mga buhay at pagtugon sa mga emerhensiya.");
    }
}
