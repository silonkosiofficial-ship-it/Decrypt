package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5574wX extends p184s3.P {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f39624C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f39625D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C4326l70 f39626E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C4569nJ f39627F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p184s3.H f39628G;

    public BinderC5574wX(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.ads.C4326l70 c4326l70 = new com.google.android.gms.internal.ads.C4326l70();
        this.f39626E = c4326l70;
        this.f39627F = new com.google.android.gms.internal.ads.C4569nJ();
        this.f39625D = abstractC2846Su;
        c4326l70.P(str);
        this.f39624C = context;
    }

    @Override // p184s3.Q
    public final void A4(p184s3.H h6) {
        this.f39628G = h6;
    }

    @Override // p184s3.Q
    public final void E5(p134n3.a aVar) {
        this.f39626E.N(aVar);
    }

    @Override // p184s3.Q
    public final void U4(com.google.android.gms.internal.ads.C3505dh c3505dh) {
        this.f39626E.d(c3505dh);
    }

    @Override // p184s3.Q
    public final void U5(com.google.android.gms.internal.ads.InterfaceC3397ci interfaceC3397ci) {
        this.f39627F.f(interfaceC3397ci);
    }

    @Override // p184s3.Q
    public final void c4(com.google.android.gms.internal.ads.InterfaceC2682Oh interfaceC2682Oh) {
        this.f39627F.b(interfaceC2682Oh);
    }

    @Override // p184s3.Q
    public final p184s3.N d() {
        com.google.android.gms.internal.ads.C4789pJ c4789pJG = this.f39627F.g();
        this.f39626E.e(c4789pJG.i());
        this.f39626E.f(c4789pJG.h());
        com.google.android.gms.internal.ads.C4326l70 c4326l70 = this.f39626E;
        if (c4326l70.D() == null) {
            c4326l70.O(p184s3.c2.s());
        }
        return new com.google.android.gms.internal.ads.BinderC5684xX(this.f39624C, this.f39625D, this.f39626E, c4789pJG, this.f39628G);
    }

    @Override // p184s3.Q
    public final void f5(com.google.android.gms.internal.ads.InterfaceC3082Zh interfaceC3082Zh, p184s3.c2 c2Var) {
        this.f39627F.e(interfaceC3082Zh);
        this.f39626E.O(c2Var);
    }

    @Override // p184s3.Q
    public final void g6(p134n3.f fVar) {
        this.f39626E.g(fVar);
    }

    @Override // p184s3.Q
    public final void k1(com.google.android.gms.internal.ads.InterfaceC2572Lh interfaceC2572Lh) {
        this.f39627F.a(interfaceC2572Lh);
    }

    @Override // p184s3.Q
    public final void l3(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2938Vh interfaceC2938Vh, com.google.android.gms.internal.ads.InterfaceC2830Sh interfaceC2830Sh) {
        this.f39627F.c(str, interfaceC2938Vh, interfaceC2830Sh);
    }

    @Override // p184s3.Q
    public final void l6(p184s3.C7113m0 c7113m0) {
        this.f39626E.v(c7113m0);
    }

    @Override // p184s3.Q
    public final void x2(com.google.android.gms.internal.ads.InterfaceC5597wk interfaceC5597wk) {
        this.f39627F.d(interfaceC5597wk);
    }

    @Override // p184s3.Q
    public final void z2(com.google.android.gms.internal.ads.C4498mk c4498mk) {
        this.f39626E.S(c4498mk);
    }
}
