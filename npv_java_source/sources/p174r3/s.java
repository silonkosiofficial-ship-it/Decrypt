package p174r3;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f53883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f53884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f53885c = new java.util.TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f53886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f53887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f53888f;

    public s(android.content.Context context, java.lang.String str) {
        java.lang.String strConcat;
        this.f53883a = context.getApplicationContext();
        this.f53884b = str;
        java.lang.String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + W3.e.a(context).f(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            p224w3.p.e("Unable to get package version name for reporting", e6);
            strConcat = java.lang.String.valueOf(packageName).concat("-missing");
        }
        this.f53888f = strConcat;
    }

    public final java.lang.String a() {
        return this.f53888f;
    }

    public final java.lang.String b() {
        return this.f53887e;
    }

    public final java.lang.String c() {
        return this.f53884b;
    }

    public final java.lang.String d() {
        return this.f53886d;
    }

    public final java.util.Map e() {
        return this.f53885c;
    }

    public final void f(p184s3.X1 x6, p224w3.a aVar) {
        this.f53886d = x6.f54161L.f54136C;
        android.os.Bundle bundle = x6.f54164O;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.internal.ads.AbstractC4600ng.f37635c.e();
        for (java.lang.String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f53887e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f53885c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f53885c.put("SDKVersion", aVar.f56217C);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC4600ng.f37633a.e()).booleanValue()) {
            android.os.Bundle bundleB = p214v3.AbstractC7240e.b(this.f53883a, (java.lang.String) com.google.android.gms.internal.ads.AbstractC4600ng.f37634b.e());
            for (java.lang.String str3 : bundleB.keySet()) {
                this.f53885c.put(str3, bundleB.get(str3).toString());
            }
        }
    }
}
