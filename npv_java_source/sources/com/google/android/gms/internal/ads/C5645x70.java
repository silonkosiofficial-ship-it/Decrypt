package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5645x70 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2698Ot f39790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2591Lx f39791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2559La0 f39792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4033iT f39793d;

    C5645x70(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C4033iT c4033iT) {
        this.f39790a = interfaceC2698Ot;
        this.f39791b = c2591Lx;
        this.f39792c = c2559La0;
        this.f39793d = c4033iT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.internal.ads.R60 r60Q = this.f39790a.Q();
        if (r60Q != null && !r60Q.f31177i0) {
            p224w3.w wVar = r60Q.f31207x0;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25436U9)).booleanValue() && this.f39791b != null && com.google.android.gms.internal.ads.C2591Lx.j(str)) {
                this.f39791b.i(str, this.f39792c, p184s3.C7147y.e(), wVar);
                return;
            } else {
                this.f39792c.d(str, wVar, null);
                return;
            }
        }
        com.google.android.gms.internal.ads.U60 u60H0 = this.f39790a.h0();
        if (u60H0 == null) {
            p174r3.v.s().x(new java.lang.IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jA = p174r3.v.c().a();
        boolean zA = p174r3.v.s().a(this.f39790a.getContext());
        boolean z6 = false;
        boolean z10 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.d6)).booleanValue() && r60Q != null && r60Q.f31152S;
        if (r60Q != null && r60Q.f31167d0 != null) {
            z6 = true;
        }
        this.f39793d.i(new com.google.android.gms.internal.ads.C4251kT(jA, u60H0.f32114b, str, (zA || z10 || z6) ? 2 : 1));
    }
}
