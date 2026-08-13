package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2174Am extends com.google.android.gms.internal.ads.AbstractBinderC4172jm {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p244y3.r f25782C;

    public BinderC2174Am(p244y3.r rVar) {
        this.f25782C = rVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String A() {
        return this.f25782C.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void C() {
        this.f25782C.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void D5(X3.a aVar) {
        this.f25782C.F((android.view.View) X3.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void P1(X3.a aVar) {
        this.f25782C.q((android.view.View) X3.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final boolean Y() {
        return this.f25782C.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final double d() {
        if (this.f25782C.o() != null) {
            return this.f25782C.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final float e() {
        return this.f25782C.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final float g() {
        return this.f25782C.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final android.os.Bundle h() {
        return this.f25782C.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final boolean h0() {
        return this.f25782C.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final float i() {
        return this.f25782C.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final p184s3.Y0 j() {
        if (this.f25782C.H() != null) {
            return this.f25782C.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final com.google.android.gms.internal.ads.InterfaceC3944hh k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final com.google.android.gms.internal.ads.InterfaceC4712oh l() {
        p134n3.d dVarI = this.f25782C.i();
        if (dVarI != null) {
            return new com.google.android.gms.internal.ads.BinderC3286bh(dVarI.a(), dVarI.c(), dVarI.b(), dVarI.e(), dVarI.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final X3.a m() {
        android.view.View viewA = this.f25782C.a();
        if (viewA == null) {
            return null;
        }
        return X3.b.c2(viewA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final X3.a n() {
        android.view.View viewG = this.f25782C.G();
        if (viewG == null) {
            return null;
        }
        return X3.b.c2(viewG);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final X3.a p() {
        java.lang.Object objI = this.f25782C.I();
        if (objI == null) {
            return null;
        }
        return X3.b.c2(objI);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void p3(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        java.util.HashMap map = (java.util.HashMap) X3.b.L0(aVar2);
        java.util.HashMap map2 = (java.util.HashMap) X3.b.L0(aVar3);
        this.f25782C.E((android.view.View) X3.b.L0(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String q() {
        return this.f25782C.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String s() {
        return this.f25782C.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String t() {
        return this.f25782C.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String u() {
        return this.f25782C.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.util.List v() {
        java.util.List<p134n3.d> listJ = this.f25782C.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (listJ != null) {
            for (p134n3.d dVar : listJ) {
                arrayList.add(new com.google.android.gms.internal.ads.BinderC3286bh(dVar.a(), dVar.c(), dVar.b(), dVar.e(), dVar.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String w() {
        return this.f25782C.n();
    }
}
