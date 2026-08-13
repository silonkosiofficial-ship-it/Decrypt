package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
final class q extends androidx.compose.ui.d.c implements p121m0.m {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private androidx.compose.ui.focus.n f19704P;

    public q(androidx.compose.ui.focus.n nVar) {
        this.f19704P = nVar;
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        super.D1();
        this.f19704P.e().d(this);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        this.f19704P.e().A(this);
        super.E1();
    }

    public final androidx.compose.ui.focus.n T1() {
        return this.f19704P;
    }

    public final void U1(androidx.compose.ui.focus.n nVar) {
        this.f19704P = nVar;
    }
}
