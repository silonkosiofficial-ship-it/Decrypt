package androidx.compose.foundation.relocation;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private E.b f19457P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f19458Q;

    public e(E.b bVar) {
        this.f19457P = bVar;
    }

    private final void T1() {
        E.b bVar = this.f19457P;
        if (bVar instanceof androidx.compose.foundation.relocation.a) {
            p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((androidx.compose.foundation.relocation.a) bVar).b().A(this);
        }
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        U1(this.f19457P);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        T1();
    }

    public final void U1(E.b bVar) {
        T1();
        if (bVar instanceof androidx.compose.foundation.relocation.a) {
            ((androidx.compose.foundation.relocation.a) bVar).b().d(this);
        }
        this.f19457P = bVar;
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f19458Q;
    }
}
