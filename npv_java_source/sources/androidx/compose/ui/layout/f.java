package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
final class f extends androidx.compose.ui.d.c implements F0.C {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f19808P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f19809Q = true;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f19810R = Y0.u.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public f(p237x7.l lVar) {
        this.f19808P = lVar;
    }

    @Override // F0.C
    public void M(long j6) {
        if (Y0.t.e(this.f19810R, j6)) {
            return;
        }
        this.f19808P.l(Y0.t.b(j6));
        this.f19810R = j6;
    }

    public final void T1(p237x7.l lVar) {
        this.f19808P = lVar;
        this.f19810R = Y0.u.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // F0.C
    public /* synthetic */ void m1(D0.InterfaceC0900t interfaceC0900t) {
        F0.B.a(this, interfaceC0900t);
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f19809Q;
    }
}
