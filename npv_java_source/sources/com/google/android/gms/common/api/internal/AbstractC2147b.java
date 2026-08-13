package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2147b extends com.google.android.gms.common.api.internal.BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O3.a.c f24884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final O3.a f24885o;

    protected AbstractC2147b(O3.a aVar, O3.f fVar) {
        super((O3.f) Q3.AbstractC1477p.m(fVar, "GoogleApiClient must not be null"));
        Q3.AbstractC1477p.m(aVar, "Api must not be null");
        this.f24884n = aVar.b();
        this.f24885o = aVar;
    }

    private void o(android.os.RemoteException remoteException) {
        p(new com.google.android.gms.common.api.Status(8, remoteException.getLocalizedMessage(), (android.app.PendingIntent) null));
    }

    protected abstract void l(O3.a.b bVar);

    protected void m(O3.k kVar) {
    }

    public final void n(O3.a.b bVar) throws android.os.DeadObjectException {
        try {
            l(bVar);
        } catch (android.os.DeadObjectException e6) {
            o(e6);
            throw e6;
        } catch (android.os.RemoteException e10) {
            o(e10);
        }
    }

    public final void p(com.google.android.gms.common.api.Status status) {
        Q3.AbstractC1477p.b(!status.C(), "Failed result must not be success");
        O3.k kVarC = c(status);
        f(kVarC);
        m(kVarC);
    }
}
