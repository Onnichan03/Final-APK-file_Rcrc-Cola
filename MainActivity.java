package crystals.pixels.first.aid.medical.firstaid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.google.android.gms.C0631R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {

    /* renamed from: e */
    public static String[] f1618e = {"Abdominal Pain", "Alcohol Intoxication", "Allergic Reaction Treatment", "Altitude/Mountain Sickness", "Ankle Fracture", " Asthma Attack in Adults", "Asthma Attack in Children", "Asthma Attack in Pregnancy", "Black Eye", "Black Widow Spider Bite", "Broken Arm in Children", "Broken Nose", "Chemical Burns", "Chest Injury", "Chest Pain", "Colds in Children", "Constipation", "Dehydration", "Diaper Rash Treatment", "Diving Ear Pain", "Drug Overdose", "Exercise-Induced Asthma", "Eye Burns/Corneal Burns", "Finger Dislocation", "Gas Pain in Children", "Head Injury", "Heart Attack", "Heat Rash", "Insulin Reaction", "Knee Injury", "Rape/Sexual Assault ", "Smoke Inhalation", "Snakebite", "Teething Pain Treatment", "Vaginal Bleeding Treatment", "Wrist Injury", "Diarrhea", "Nosebleeds", "Animal Bites", "Dizziness", "Pulled Muscle (Muscle Strain)", "Bee, Wasp, Insect Stings", "Fever in Children", "Rectal (Anal) Bleeding", "Blood in Urine (Hematuria)", "Food Poisoning", "Spider Bites", "Broken Toe", "Frostbite", "Sprains", "Bruises (Hematomas)", "Heart Palpitations", "Sunburn", "Burns", "Heat Exhaustion", "Testicle Pain", "Choking", "Heatstroke", "Vertigo", "Cuts and Wounds"};

    /* renamed from: a */
    ListView f1619a;

    /* renamed from: b */
    Context f1620b;

    /* renamed from: c */
    InterstitialAd f1621c;

    /* renamed from: d */
    Intent f1622d;

    /* renamed from: a */
    private void m2736a() {
        this.f1621c = new InterstitialAd(this);
        this.f1621c.setAdUnitId(getResources().getString(C0631R.string.interstitialunitid));
        m2738b();
        this.f1621c.setAdListener(new C1699d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2738b() {
        this.f1621c.loadAd(new AdRequest.Builder().build());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(C0631R.layout.activity_main);
        m2736a();
        this.f1620b = this;
        this.f1619a = (ListView) findViewById(C0631R.C0632id.listView);
        this.f1619a.setAdapter(new C1696a(this, f1618e));
        this.f1619a.setOnItemClickListener(new C1698c(this));
    }
}
