package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
final class c extends androidx.compose.ui.d.c implements p121m0.b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f19667P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p121m0.n f19668Q;

    public c(p237x7.l lVar) {
        this.f19667P = lVar;
    }

    @Override // p121m0.b
    public void R0(p121m0.n nVar) {
        if (p247y7.AbstractC7350t.b(this.f19668Q, nVar)) {
            return;
        }
        this.f19668Q = nVar;
        this.f19667P.l(nVar);
    }

    public final void T1(p237x7.l lVar) {
        this.f19667P = lVar;
    }
}
