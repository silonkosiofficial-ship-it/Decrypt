package p076h5;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f46496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h5.f.b f46497b = null;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f46498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f46499b;

        private b() {
            int iP = p106k5.AbstractC6898i.p(p076h5.f.this.f46496a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!p076h5.f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f46498a = null;
                    this.f46499b = null;
                    return;
                } else {
                    this.f46498a = "Flutter";
                    this.f46499b = null;
                    p076h5.g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f46498a = "Unity";
            java.lang.String string = p076h5.f.this.f46496a.getResources().getString(iP);
            this.f46499b = string;
            p076h5.g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(android.content.Context context) {
        this.f46496a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(java.lang.String str) {
        if (this.f46496a.getAssets() == null) {
            return false;
        }
        try {
            java.io.InputStream inputStreamOpen = this.f46496a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private h5.f.b f() {
        if (this.f46497b == null) {
            this.f46497b = new h5.f.b();
        }
        return this.f46497b;
    }

    public java.lang.String d() {
        return f().f46498a;
    }

    public java.lang.String e() {
        return f().f46499b;
    }
}
