package p204u3;

/* JADX INFO: renamed from: u3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7201c extends com.google.android.gms.internal.ads.AbstractBinderC2582Ln {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel f55486C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.app.Activity f55487D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f55488E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f55489F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f55490G = false;

    public BinderC7201c(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f55486C = adOverlayInfoParcel;
        this.f55487D = activity;
    }

    private final synchronized void b() {
        try {
            if (this.f55489F) {
                return;
            }
            p204u3.z zVar = this.f55486C.f24712E;
            if (zVar != null) {
                zVar.p4(4);
            }
            this.f55489F = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void A() {
        if (this.f55487D.isFinishing()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void C() {
        this.f55490G = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void N2(int i6, java.lang.String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final boolean T() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void W3(android.os.Bundle bundle) {
        p204u3.z zVar;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25347M8)).booleanValue() && !this.f55490G) {
            this.f55487D.requestWindowFeature(1);
        }
        boolean z6 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z6 = true;
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.f55486C;
        if (adOverlayInfoParcel != null && !z6) {
            if (bundle == null) {
                p184s3.InterfaceC7076a interfaceC7076a = adOverlayInfoParcel.f24711D;
                if (interfaceC7076a != null) {
                    interfaceC7076a.e0();
                }
                com.google.android.gms.internal.ads.MG mg = this.f55486C.f24730W;
                if (mg != null) {
                    mg.p0();
                }
                if (this.f55487D.getIntent() != null && this.f55487D.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zVar = this.f55486C.f24712E) != null) {
                    zVar.T2();
                }
            }
            android.app.Activity activity = this.f55487D;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.f55486C;
            p174r3.v.l();
            p204u3.l lVar = adOverlayInfoParcel2.f24710C;
            if (p204u3.C7199a.b(activity, lVar, adOverlayInfoParcel2.f24718K, lVar.f55499K, null, "")) {
                return;
            }
        }
        this.f55487D.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void b0(X3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void j2(int i6, int i10, android.content.Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void m() {
        if (this.f55487D.isFinishing()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void p() {
        p204u3.z zVar = this.f55486C.f24712E;
        if (zVar != null) {
            zVar.y0();
        }
        if (this.f55487D.isFinishing()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void t() {
        if (this.f55488E) {
            this.f55487D.finish();
            return;
        }
        this.f55488E = true;
        p204u3.z zVar = this.f55486C.f24712E;
        if (zVar != null) {
            zVar.f3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void v() {
        p204u3.z zVar = this.f55486C.f24712E;
        if (zVar != null) {
            zVar.q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void z0(android.os.Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f55488E);
    }
}
