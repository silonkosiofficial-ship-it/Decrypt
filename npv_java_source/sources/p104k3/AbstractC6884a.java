package p104k3;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6884a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p184s3.C7090e1 f49448a;

    protected AbstractC6884a() {
        p184s3.C7090e1 c7090e1 = new p184s3.C7090e1();
        this.f49448a = c7090e1;
        c7090e1.r("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public p104k3.AbstractC6884a a(java.lang.String str) {
        this.f49448a.p(str);
        return c();
    }

    public p104k3.AbstractC6884a b(java.lang.Class cls, android.os.Bundle bundle) {
        this.f49448a.q(cls, bundle);
        if (cls.equals(com.google.ads.mediation.admob.AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f49448a.s("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return c();
    }

    protected abstract p104k3.AbstractC6884a c();

    public final p104k3.AbstractC6884a d(java.lang.String str) {
        this.f49448a.r(str);
        return c();
    }

    public final p104k3.AbstractC6884a e(boolean z6) {
        this.f49448a.t(z6);
        return c();
    }

    public final p104k3.AbstractC6884a f(boolean z6) {
        this.f49448a.a(z6);
        return c();
    }
}
