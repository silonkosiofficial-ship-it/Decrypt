package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class w extends P3.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.AbstractC2149d f24961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p115l4.C6932m f24962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P3.k f24963d;

    public w(int i6, com.google.android.gms.common.api.internal.AbstractC2149d abstractC2149d, p115l4.C6932m c6932m, P3.k kVar) {
        super(i6);
        this.f24962c = c6932m;
        this.f24961b = abstractC2149d;
        this.f24963d = kVar;
        if (i6 == 2 && abstractC2149d.c()) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(com.google.android.gms.common.api.Status status) {
        this.f24962c.d(this.f24963d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(java.lang.Exception exc) {
        this.f24962c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(com.google.android.gms.common.api.internal.n nVar) throws android.os.DeadObjectException {
        try {
            this.f24961b.b(nVar.s(), this.f24962c);
        } catch (android.os.DeadObjectException e6) {
            throw e6;
        } catch (android.os.RemoteException e10) {
            a(com.google.android.gms.common.api.internal.y.e(e10));
        } catch (java.lang.RuntimeException e11) {
            this.f24962c.d(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(com.google.android.gms.common.api.internal.g gVar, boolean z6) {
        gVar.d(this.f24962c, z6);
    }

    @Override // P3.t
    public final boolean f(com.google.android.gms.common.api.internal.n nVar) {
        return this.f24961b.c();
    }

    @Override // P3.t
    public final N3.C1391d[] g(com.google.android.gms.common.api.internal.n nVar) {
        return this.f24961b.e();
    }
}
