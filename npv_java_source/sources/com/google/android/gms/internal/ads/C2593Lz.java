package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2593Lz extends com.google.android.gms.internal.ads.AbstractC2777Qy {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3726fi f29618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.Runnable f29619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.Executor f29620l;

    public C2593Lz(com.google.android.gms.internal.ads.C3563eA c3563eA, com.google.android.gms.internal.ads.InterfaceC3726fi interfaceC3726fi, java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        super(c3563eA);
        this.f29618j = interfaceC3726fi;
        this.f29619k = runnable;
        this.f29620l = executor;
    }

    static /* synthetic */ void q(java.util.concurrent.atomic.AtomicReference atomicReference) {
        java.lang.Runnable runnable = (java.lang.Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3673fA
    public final void b() {
        final com.google.android.gms.internal.ads.RunnableC2520Jz runnableC2520Jz = new com.google.android.gms.internal.ads.RunnableC2520Jz(new java.util.concurrent.atomic.AtomicReference(this.f29619k));
        this.f29620l.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f29174C.r(runnableC2520Jz);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final int i() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final android.view.View k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final p184s3.Y0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final com.google.android.gms.internal.ads.S60 m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final com.google.android.gms.internal.ads.S60 n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2777Qy
    public final void p(android.view.ViewGroup viewGroup, p184s3.c2 c2Var) {
    }

    final /* synthetic */ void r(java.lang.Runnable runnable) {
        try {
            if (this.f29618j.zze(X3.b.c2(runnable))) {
                return;
            }
            q(((com.google.android.gms.internal.ads.RunnableC2520Jz) runnable).f28778C);
        } catch (android.os.RemoteException unused) {
            q(((com.google.android.gms.internal.ads.RunnableC2520Jz) runnable).f28778C);
        }
    }
}
