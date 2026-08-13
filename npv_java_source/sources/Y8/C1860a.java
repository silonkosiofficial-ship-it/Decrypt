package Y8;

/* JADX INFO: renamed from: Y8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1860a extends Y8.k implements Y8.InterfaceC1862c {
    public C1860a(p127m7.i iVar, Y8.j jVar, boolean z6) {
        super(iVar, jVar, false, z6);
        i0((W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h));
    }

    @Override // W8.F0
    protected void F0(java.lang.Throwable th) {
        Y8.j jVarK1 = k1();
        java.util.concurrent.CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = W8.AbstractC1801o0.a(W8.S.a(this) + " was cancelled", th);
            }
        }
        jVarK1.o(cancellationExceptionA);
    }

    @Override // W8.F0
    protected boolean f0(java.lang.Throwable th) {
        W8.L.a(getContext(), th);
        return true;
    }
}
