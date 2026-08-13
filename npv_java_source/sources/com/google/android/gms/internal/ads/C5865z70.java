package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5865z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f40222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U60 f40223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f40224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2189Ba0 f40225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f40226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2591Lx f40227f;

    public C5865z70(com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C2189Ba0 c2189Ba0, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.Q90 q90) {
        this.f40222a = r60;
        this.f40223b = u60;
        this.f40224c = c2559La0;
        this.f40225d = c2189Ba0;
        this.f40227f = c2591Lx;
        this.f40226e = q90;
    }

    public final void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            b((java.lang.String) it.next(), 2);
        }
    }

    public final void b(java.lang.String str, int i6) {
        com.google.android.gms.internal.ads.R60 r60 = this.f40222a;
        if (r60.f31177i0) {
            this.f40225d.a(str, this.f40223b.f32114b, i6);
            return;
        }
        this.f40224c.d(str, r60.f31207x0, this.f40226e);
    }

    public final void c(java.util.List list, int i6) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r((((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25436U9)).booleanValue() && com.google.android.gms.internal.ads.C2591Lx.j(str)) ? this.f40227f.b(str, p184s3.C7147y.e()) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str), new com.google.android.gms.internal.ads.C5755y70(this, i6), com.google.android.gms.internal.ads.AbstractC3524dr.f34795a);
        }
    }
}
