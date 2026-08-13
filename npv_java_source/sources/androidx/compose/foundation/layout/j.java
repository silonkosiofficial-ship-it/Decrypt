package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class j extends androidx.compose.foundation.layout.i {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private A.y f19266P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19267Q;

    public j(A.y yVar, boolean z6) {
        this.f19266P = yVar;
        this.f19267Q = z6;
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f19266P == A.y.Min ? interfaceC0895n.S(i6) : interfaceC0895n.T(i6);
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f19266P == A.y.Min ? interfaceC0895n.S(i6) : interfaceC0895n.T(i6);
    }

    @Override // androidx.compose.foundation.layout.i
    public long T1(D0.M m6, D0.G g6, long j6) {
        int iS = this.f19266P == A.y.Min ? g6.S(Y0.C1859b.k(j6)) : g6.T(Y0.C1859b.k(j6));
        if (iS < 0) {
            iS = 0;
        }
        return Y0.C1859b.f16201b.e(iS);
    }

    @Override // androidx.compose.foundation.layout.i
    public boolean U1() {
        return this.f19267Q;
    }

    public void V1(boolean z6) {
        this.f19267Q = z6;
    }

    public final void W1(A.y yVar) {
        this.f19266P = yVar;
    }
}
