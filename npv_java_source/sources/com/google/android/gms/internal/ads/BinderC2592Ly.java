package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2592Ly extends com.google.android.gms.internal.ads.AbstractBinderC2377Gc {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2556Ky f29606C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p184s3.V f29607D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K40 f29608E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f29609F = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25394R0)).booleanValue();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f29610G;

    public BinderC2592Ly(com.google.android.gms.internal.ads.C2556Ky c2556Ky, p184s3.V v6, com.google.android.gms.internal.ads.K40 k40, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f29606C = c2556Ky;
        this.f29607D = v6;
        this.f29608E = k40;
        this.f29610G = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final void K0(boolean z6) {
        this.f29609F = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final void M3(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2672Oc interfaceC2672Oc) {
        try {
            this.f29608E.q(interfaceC2672Oc);
            this.f29606C.k((android.app.Activity) X3.b.L0(aVar), interfaceC2672Oc, this.f29609F);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final p184s3.V d() {
        return this.f29607D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final p184s3.U0 e() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25235C6)).booleanValue()) {
            return this.f29606C.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final void z1(p184s3.N0 n6) {
        Q3.AbstractC1477p.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f29608E != null) {
            try {
                if (!n6.e()) {
                    this.f29610G.e();
                }
            } catch (android.os.RemoteException e6) {
                p224w3.p.c("Error in making CSI ping for reporting paid event callback", e6);
            }
            this.f29608E.k(n6);
        }
    }
}
