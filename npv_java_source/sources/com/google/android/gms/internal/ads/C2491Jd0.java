package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2491Jd0 implements com.google.android.gms.internal.ads.InterfaceC3037Yc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f28730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2528Kd0 f28731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2967Wd0 f28732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2929Vc0 f28733d;

    C2491Jd0(java.lang.Object obj, com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0, com.google.android.gms.internal.ads.InterfaceC2967Wd0 interfaceC2967Wd0, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0) {
        this.f28730a = obj;
        this.f28731b = c2528Kd0;
        this.f28732c = interfaceC2967Wd0;
        this.f28733d = c2929Vc0;
    }

    private static java.lang.String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        com.google.android.gms.internal.ads.C3671f9 c3671f9B0 = com.google.android.gms.internal.ads.C3781g9.b0();
        c3671f9B0.B(5);
        c3671f9B0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArr, 0, bArr.length));
        return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.C3781g9) c3671f9B0.u()).l(), 11);
    }

    private final synchronized byte[] j(java.util.Map map, java.util.Map map2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
        } catch (java.lang.Exception e6) {
            this.f28733d.c(2007, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e6);
            return null;
        }
        return (byte[]) this.f28730a.getClass().getDeclaredMethod("xss", java.util.Map.class, java.util.Map.class).invoke(this.f28730a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037Yc0
    public final synchronized java.lang.String a(android.content.Context context, java.lang.String str) {
        java.util.Map mapB;
        mapB = this.f28732c.b();
        mapB.put("f", "q");
        mapB.put("ctx", context);
        mapB.put("aid", null);
        return i(j(null, mapB));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037Yc0
    public final synchronized void b(java.lang.String str, android.view.MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.HashMap map = new java.util.HashMap();
            map.put("t", new java.lang.Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f28730a.getClass().getDeclaredMethod("he", java.util.Map.class).invoke(this.f28730a, map);
            this.f28733d.d(3003, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.C2895Ud0(2005, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037Yc0
    public final synchronized java.lang.String c(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, android.app.Activity activity) {
        java.util.Map mapA;
        mapA = this.f28732c.a();
        mapA.put("f", "c");
        mapA.put("ctx", context);
        mapA.put("cs", str2);
        mapA.put("aid", null);
        mapA.put("view", view);
        mapA.put("act", activity);
        return i(j(null, mapA));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037Yc0
    public final synchronized java.lang.String d(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        java.util.Map mapC;
        mapC = this.f28732c.c();
        mapC.put("f", "v");
        mapC.put("ctx", context);
        mapC.put("aid", null);
        mapC.put("view", view);
        mapC.put("act", activity);
        return i(j(null, mapC));
    }

    public final synchronized int e() {
        try {
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.C2895Ud0(2006, e6);
        }
        return ((java.lang.Integer) this.f28730a.getClass().getDeclaredMethod("lcs", null).invoke(this.f28730a, null)).intValue();
    }

    final com.google.android.gms.internal.ads.C2528Kd0 f() {
        return this.f28731b;
    }

    public final synchronized void g() {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.f28730a.getClass().getDeclaredMethod("close", null).invoke(this.f28730a, null);
            this.f28733d.d(3001, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.C2895Ud0(2003, e6);
        }
    }

    final synchronized boolean h() {
        try {
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.C2895Ud0(2001, e6);
        }
        return ((java.lang.Boolean) this.f28730a.getClass().getDeclaredMethod("init", null).invoke(this.f28730a, null)).booleanValue();
    }
}
