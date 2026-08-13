package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends p184s3.AbstractBinderC7136u0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3950hk f54126C;

    @Override // p184s3.InterfaceC7139v0
    public final void B5(p184s3.K1 k6) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void P4(java.lang.String str, X3.a aVar) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void R0(java.lang.String str) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void W4(java.lang.String str) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void Y0(com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void a0(java.lang.String str) {
    }

    final /* synthetic */ void b() {
        com.google.android.gms.internal.ads.InterfaceC3950hk interfaceC3950hk = this.f54126C;
        if (interfaceC3950hk != null) {
            try {
                interfaceC3950hk.L4(java.util.Collections.emptyList());
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Could not notify onComplete event.", e6);
            }
        }
    }

    @Override // p184s3.InterfaceC7139v0
    public final float d() {
        return 1.0f;
    }

    @Override // p184s3.InterfaceC7139v0
    public final java.lang.String e() {
        return "";
    }

    @Override // p184s3.InterfaceC7139v0
    public final void e2(p184s3.H0 h6) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void h() {
    }

    @Override // p184s3.InterfaceC7139v0
    public final java.util.List i() {
        return java.util.Collections.emptyList();
    }

    @Override // p184s3.InterfaceC7139v0
    public final void j6(boolean z6) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void k() {
        p224w3.p.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        p224w3.g.f56228b.post(new java.lang.Runnable() { // from class: s3.C1
            @Override // java.lang.Runnable
            public final void run() {
                this.f54125C.b();
            }
        });
    }

    @Override // p184s3.InterfaceC7139v0
    public final void l0(boolean z6) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void p5(X3.a aVar, java.lang.String str) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final boolean v() {
        return false;
    }

    @Override // p184s3.InterfaceC7139v0
    public final void w0(float f6) {
    }

    @Override // p184s3.InterfaceC7139v0
    public final void y2(com.google.android.gms.internal.ads.InterfaceC3950hk interfaceC3950hk) {
        this.f54126C = interfaceC3950hk;
    }
}
