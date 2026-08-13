package B3;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.pm.ApplicationInfo f609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final org.json.JSONObject f612e = new org.json.JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f613f = new java.util.concurrent.atomic.AtomicBoolean(false);

    c0(android.content.Context context, com.google.android.gms.internal.ads.Cif cif, java.util.List list, p224w3.a aVar) {
        this.f608a = context;
        this.f609b = context.getApplicationInfo();
        this.f610c = list;
        this.f611d = aVar;
    }

    public final org.json.JSONObject a() {
        if (!this.f613f.get()) {
            b();
        }
        return this.f612e;
    }

    public final void b() {
        if (this.f613f.getAndSet(true)) {
            return;
        }
        android.content.pm.PackageInfo packageInfoF = null;
        try {
            if (this.f609b != null) {
                packageInfoF = W3.e.a(this.f608a).f(this.f609b.packageName, 0);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (packageInfoF != null) {
            try {
                this.f612e.put("vc", packageInfoF.versionCode);
                this.f612e.put("vnm", packageInfoF.versionName);
            } catch (org.json.JSONException e6) {
                p174r3.v.s().x(e6, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        android.content.pm.ApplicationInfo applicationInfo = this.f609b;
        if (applicationInfo != null) {
            this.f612e.put("pn", applicationInfo.packageName);
        }
        org.json.JSONObject jSONObject = this.f612e;
        java.util.List list = this.f610c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : ((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25293H9)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.f612e.put("js", this.f611d.f56217C);
        java.util.Iterator<java.lang.String> itKeys = this.f612e.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object obj = this.f612e.get(next);
            if (obj != null) {
                this.f612e.put(next, android.util.Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
