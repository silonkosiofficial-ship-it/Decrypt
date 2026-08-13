package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class YN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f33342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f33343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f33344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f33345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f33346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p174r3.k f33347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.os.Bundle f33348g = new android.os.Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.content.Context f33349h;

    public YN(android.content.Context context, com.google.android.gms.internal.ads.C4246kO c4246kO, com.google.android.gms.internal.ads.C3022Xq c3022Xq, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.lang.String str, java.lang.String str2, p174r3.k kVar) {
        java.lang.String str3;
        android.app.ActivityManager.MemoryInfo memoryInfoF;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMapC = c4246kO.c();
        this.f33342a = concurrentHashMapC;
        this.f33343b = c3022Xq;
        this.f33344c = c4546n70;
        this.f33345d = str;
        this.f33346e = str2;
        this.f33347f = kVar;
        this.f33349h = context;
        concurrentHashMapC.put("ad_format", str2.toUpperCase(java.util.Locale.ROOT));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25700t9)).booleanValue()) {
            int iP = kVar.p();
            int i6 = iP - 1;
            if (iP == 0) {
                throw null;
            }
            concurrentHashMapC.put("asv", i6 != 0 ? i6 != 1 ? "na" : "2" : "1");
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            c("rt_f", java.lang.String.valueOf(runtime.freeMemory()));
            c("rt_m", java.lang.String.valueOf(runtime.maxMemory()));
            c("rt_t", java.lang.String.valueOf(runtime.totalMemory()));
            c("wv_c", java.lang.String.valueOf(p174r3.v.s().c()));
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25654p2)).booleanValue() && (memoryInfoF = p224w3.g.f(context)) != null) {
                c("mem_avl", java.lang.String.valueOf(memoryInfoF.availMem));
                c("mem_tt", java.lang.String.valueOf(memoryInfoF.totalMem));
                c("low_m", true != memoryInfoF.lowMemory ? "0" : "1");
            }
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25345M6)).booleanValue()) {
            int iF = B3.AbstractC0797c.f(c4546n70) - 1;
            if (iF == 0) {
                concurrentHashMapC.put("request_id", str);
                concurrentHashMapC.put("scar", "false");
                return;
            }
            if (iF != 1) {
                str3 = iF != 2 ? iF != 3 ? "r_both" : "r_adstring" : "r_adinfo";
            } else {
                concurrentHashMapC.put("request_id", str);
                str3 = "query_g";
            }
            concurrentHashMapC.put("se", str3);
            concurrentHashMapC.put("scar", "true");
            c("ragent", c4546n70.f37511d.f54167R);
            c("rtype", B3.AbstractC0797c.b(B3.AbstractC0797c.c(c4546n70.f37511d)));
        }
    }

    public final android.os.Bundle a() {
        return this.f33348g;
    }

    public final java.util.Map b() {
        return this.f33342a;
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.f33342a.put(str, str2);
    }

    public final void d(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        if (!c3558e70.f34899b.f34447a.isEmpty()) {
            com.google.android.gms.internal.ads.R60 r60 = (com.google.android.gms.internal.ads.R60) c3558e70.f34899b.f34447a.get(0);
            c("ad_format", com.google.android.gms.internal.ads.R60.a(r60.f31162b));
            if (r60.f31162b == 6) {
                this.f33342a.put("as", true != this.f33343b.m() ? "0" : "1");
            }
        }
        c("gqi", c3558e70.f34899b.f34448b.f32114b);
    }

    public final void e(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            c("network_coarse", java.lang.Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            c("network_fine", java.lang.Integer.toString(bundle.getInt("gnt")));
        }
    }
}
