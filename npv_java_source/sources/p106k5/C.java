package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f49543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q4.f f49544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f49545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p115l4.C6932m f49546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f49547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Boolean f49549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p115l4.C6932m f49550h;

    public C(Q4.f fVar) {
        java.lang.Object obj = new java.lang.Object();
        this.f49545c = obj;
        this.f49546d = new p115l4.C6932m();
        this.f49547e = false;
        this.f49548f = false;
        this.f49550h = new p115l4.C6932m();
        android.content.Context contextK = fVar.k();
        this.f49544b = fVar;
        this.f49543a = p106k5.AbstractC6898i.q(contextK);
        java.lang.Boolean boolB = b();
        this.f49549g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f49546d.e(null);
                    this.f49547e = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private java.lang.Boolean a(android.content.Context context) {
        java.lang.Boolean boolG = g(context);
        if (boolG == null) {
            this.f49548f = false;
            return null;
        }
        this.f49548f = true;
        return java.lang.Boolean.valueOf(java.lang.Boolean.TRUE.equals(boolG));
    }

    private java.lang.Boolean b() {
        if (!this.f49543a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f49548f = false;
        return java.lang.Boolean.valueOf(this.f49543a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f49544b.t();
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z6) {
        java.lang.String str;
        java.lang.String str2 = z6 ? "ENABLED" : "DISABLED";
        if (this.f49549g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f49548f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        p076h5.g.f().b(java.lang.String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private static java.lang.Boolean g(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            p076h5.g.f().e("Could not read data collection permission from manifest", e6);
            return null;
        }
    }

    public void c(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalStateException("An invalid data collection token was used.");
        }
        this.f49550h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            java.lang.Boolean bool = this.f49549g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public p115l4.AbstractC6931l h() {
        p115l4.AbstractC6931l abstractC6931lA;
        synchronized (this.f49545c) {
            abstractC6931lA = this.f49546d.a();
        }
        return abstractC6931lA;
    }

    public p115l4.AbstractC6931l i() {
        return p116l5.b.c(this.f49550h.a(), h());
    }
}
