package androidx.compose.ui.input.rotary;

/* JADX INFO: loaded from: classes.dex */
final class b extends androidx.compose.ui.d.c implements B0.a {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f19801P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p237x7.l f19802Q;

    public b(p237x7.l lVar, p237x7.l lVar2) {
        this.f19801P = lVar;
        this.f19802Q = lVar2;
    }

    public final void T1(p237x7.l lVar) {
        this.f19801P = lVar;
    }

    public final void U1(p237x7.l lVar) {
        this.f19802Q = lVar;
    }

    @Override // B0.a
    public boolean W(B0.b bVar) {
        p237x7.l lVar = this.f19801P;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.l(bVar)).booleanValue();
        }
        return false;
    }

    @Override // B0.a
    public boolean r0(B0.b bVar) {
        p237x7.l lVar = this.f19802Q;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.l(bVar)).booleanValue();
        }
        return false;
    }
}
