package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2272Df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f26755a = (java.lang.String) com.google.android.gms.internal.ads.AbstractC5589wg.f39659a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f26756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f26757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f26758d;

    public C2272Df(android.content.Context context, java.lang.String str) {
        this.f26757c = context;
        this.f26758d = str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f26756b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", android.os.Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", android.os.Build.VERSION.SDK);
        p174r3.v.t();
        linkedHashMap.put("device", p214v3.E0.X());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        p174r3.v.t();
        linkedHashMap.put("is_lite_sdk", true != p214v3.E0.f(context) ? "0" : "1");
        java.util.concurrent.Future futureB = p174r3.v.q().b(context);
        try {
            linkedHashMap.put("network_coarse", java.lang.Integer.toString(((com.google.android.gms.internal.ads.C2876To) futureB.get()).f31997j));
            linkedHashMap.put("network_fine", java.lang.Integer.toString(((com.google.android.gms.internal.ads.C2876To) futureB.get()).f31998k));
        } catch (java.lang.Exception e6) {
            p174r3.v.s().x(e6, "CsiConfiguration.CsiConfiguration");
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.jb)).booleanValue()) {
            java.util.Map map = this.f26756b;
            p174r3.v.t();
            map.put("is_bstar", true != p214v3.E0.c(context) ? "0" : "1");
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25650o9)).booleanValue()) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25694t2)).booleanValue() || com.google.android.gms.internal.ads.AbstractC2829Sg0.d(p174r3.v.s().o())) {
                return;
            }
            this.f26756b.put("plugin", p174r3.v.s().o());
        }
    }

    final android.content.Context a() {
        return this.f26757c;
    }

    final java.lang.String b() {
        return this.f26758d;
    }

    final java.lang.String c() {
        return this.f26755a;
    }

    final java.util.Map d() {
        return this.f26756b;
    }
}
