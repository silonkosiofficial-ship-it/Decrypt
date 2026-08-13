package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2657Np extends com.google.android.gms.internal.ads.AbstractBinderC5717xp {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p104k3.l f30379C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p104k3.p f30380D;

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void I4(p184s3.W0 w6) {
        p104k3.l lVar = this.f30379C;
        if (lVar != null) {
            lVar.c(w6.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void L(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void S1(com.google.android.gms.internal.ads.InterfaceC5167sp interfaceC5167sp) {
        p104k3.p pVar = this.f30380D;
        if (pVar != null) {
            pVar.a(new com.google.android.gms.internal.ads.C2362Fp(interfaceC5167sp));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void d() {
        p104k3.l lVar = this.f30379C;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void e() {
        p104k3.l lVar = this.f30379C;
        if (lVar != null) {
            lVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void i() {
        p104k3.l lVar = this.f30379C;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void j() {
        p104k3.l lVar = this.f30379C;
        if (lVar != null) {
            lVar.e();
        }
    }

    public final void o6(p104k3.p pVar) {
        this.f30380D = pVar;
    }
}
