package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class u extends P3.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p115l4.C6932m f24959b;

    public u(int i6, p115l4.C6932m c6932m) {
        super(i6);
        this.f24959b = c6932m;
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(com.google.android.gms.common.api.Status status) {
        this.f24959b.d(new O3.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(java.lang.Exception exc) {
        this.f24959b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(com.google.android.gms.common.api.internal.n nVar) throws android.os.DeadObjectException {
        try {
            h(nVar);
        } catch (android.os.DeadObjectException e6) {
            a(com.google.android.gms.common.api.internal.y.e(e6));
            throw e6;
        } catch (android.os.RemoteException e10) {
            a(com.google.android.gms.common.api.internal.y.e(e10));
        } catch (java.lang.RuntimeException e11) {
            this.f24959b.d(e11);
        }
    }

    protected abstract void h(com.google.android.gms.common.api.internal.n nVar);
}
