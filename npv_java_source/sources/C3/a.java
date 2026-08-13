package C3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f1282c;

    public a(android.content.Context context, p224w3.a aVar) {
        this.f1280a = context;
        this.f1281b = context.getPackageName();
        this.f1282c = aVar.f56217C;
    }

    public void a(java.util.Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", android.os.Build.VERSION.RELEASE);
        map.put("api_v", android.os.Build.VERSION.SDK);
        p174r3.v.t();
        map.put("device", p214v3.E0.X());
        map.put("app", this.f1281b);
        p174r3.v.t();
        map.put("is_lite_sdk", true != p214v3.E0.f(this.f1280a) ? "0" : "1");
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25491a;
        java.util.List listB = p184s3.A.a().b();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25301I6)).booleanValue()) {
            listB.addAll(p174r3.v.s().j().i().d());
        }
        map.put("e", android.text.TextUtils.join(",", listB));
        map.put("sdkVersion", this.f1282c);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.jb)).booleanValue()) {
            p174r3.v.t();
            map.put("is_bstar", true != p214v3.E0.c(this.f1280a) ? "0" : "1");
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25650o9)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25694t2)).booleanValue()) {
                map.put("plugin", com.google.android.gms.internal.ads.AbstractC2829Sg0.c(p174r3.v.s().o()));
            }
        }
    }
}
