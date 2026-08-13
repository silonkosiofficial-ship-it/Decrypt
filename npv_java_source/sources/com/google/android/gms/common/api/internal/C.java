package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected volatile boolean f24873D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicReference f24874E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.os.Handler f24875F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected final N3.C1394g f24876G;

    C(P3.InterfaceC1449e interfaceC1449e, N3.C1394g c1394g) {
        super(interfaceC1449e);
        this.f24874E = new java.util.concurrent.atomic.AtomicReference(null);
        this.f24875F = new p035d4.h(android.os.Looper.getMainLooper());
        this.f24876G = c1394g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(N3.C1389b c1389b, int i6) {
        this.f24874E.set(null);
        m(c1389b, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f24874E.set(null);
        n();
    }

    private static final int p(com.google.android.gms.common.api.internal.z zVar) {
        if (zVar == null) {
            return -1;
        }
        return zVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i6, int i10, android.content.Intent intent) {
        com.google.android.gms.common.api.internal.z zVar = (com.google.android.gms.common.api.internal.z) this.f24874E.get();
        if (i6 != 1) {
            if (i6 == 2) {
                int iG = this.f24876G.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (zVar == null) {
                        return;
                    }
                    if (zVar.b().e() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i10 == -1) {
            o();
            return;
        } else if (i10 == 0) {
            if (zVar != null) {
                l(new N3.C1389b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zVar.b().toString()), p(zVar));
                return;
            }
            return;
        }
        if (zVar != null) {
            l(zVar.b(), zVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(android.os.Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f24874E.set(bundle.getBoolean("resolving_error", false) ? new com.google.android.gms.common.api.internal.z(new N3.C1389b(bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(android.os.Bundle bundle) {
        super.i(bundle);
        com.google.android.gms.common.api.internal.z zVar = (com.google.android.gms.common.api.internal.z) this.f24874E.get();
        if (zVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zVar.a());
        bundle.putInt("failed_status", zVar.b().e());
        bundle.putParcelable("failed_resolution", zVar.b().s());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f24873D = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f24873D = false;
    }

    protected abstract void m(N3.C1389b c1389b, int i6);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        l(new N3.C1389b(13, null), p((com.google.android.gms.common.api.internal.z) this.f24874E.get()));
    }

    public final void s(N3.C1389b c1389b, int i6) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.common.api.internal.z zVar = new com.google.android.gms.common.api.internal.z(c1389b, i6);
        do {
            atomicReference = this.f24874E;
            if (p200u.AbstractC7162c0.a(atomicReference, null, zVar)) {
                this.f24875F.post(new com.google.android.gms.common.api.internal.B(this, zVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
