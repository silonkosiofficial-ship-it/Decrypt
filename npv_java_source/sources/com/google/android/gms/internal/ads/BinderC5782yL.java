package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5782yL extends com.google.android.gms.internal.ads.AbstractBinderC4164ji {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f40043C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZI f40044D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f40045E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f40046F;

    public BinderC5782yL(java.lang.String str, com.google.android.gms.internal.ads.ZI zi, com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f40043C = str;
        this.f40044D = zi;
        this.f40045E = c3581eJ;
        this.f40046F = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.util.List A() {
        return this.f40045E.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void C() {
        this.f40044D.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final boolean H() {
        return (this.f40045E.h().isEmpty() || this.f40045E.X() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void P2(android.os.Bundle bundle) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Pc)).booleanValue()) {
            this.f40044D.q(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void Q() {
        this.f40044D.x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void R2(com.google.android.gms.internal.ads.InterfaceC3946hi interfaceC3946hi) {
        this.f40044D.A(interfaceC3946hi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void S5(p184s3.A0 a6) {
        this.f40044D.y(a6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final boolean T() {
        return this.f40044D.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void X5(android.os.Bundle bundle) {
        this.f40044D.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void Z1(android.os.Bundle bundle) {
        this.f40044D.v(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final boolean a4(android.os.Bundle bundle) {
        return this.f40044D.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final double d() {
        return this.f40045E.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final android.os.Bundle e() {
        return this.f40045E.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final p184s3.Y0 g() {
        return this.f40045E.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final com.google.android.gms.internal.ads.InterfaceC3944hh h() {
        return this.f40045E.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void h0() {
        this.f40044D.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final p184s3.U0 i() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25235C6)).booleanValue()) {
            return this.f40044D.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final com.google.android.gms.internal.ads.InterfaceC4382lh j() {
        return this.f40044D.Q().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void j3(p184s3.D0 d6) {
        this.f40044D.k(d6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final com.google.android.gms.internal.ads.InterfaceC4712oh k() {
        return this.f40045E.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final X3.a l() {
        return this.f40045E.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final X3.a m() {
        return X3.b.c2(this.f40044D);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String n() {
        return this.f40045E.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String p() {
        return this.f40045E.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void p1(p184s3.N0 n6) {
        try {
            if (!n6.e()) {
                this.f40046F.e();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.c("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f40044D.z(n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String q() {
        return this.f40045E.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String s() {
        return this.f40045E.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String t() {
        return this.f40043C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String u() {
        return this.f40045E.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.util.List v() {
        return H() ? this.f40045E.h() : java.util.Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String w() {
        return this.f40045E.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void z() {
        this.f40044D.b0();
    }
}
