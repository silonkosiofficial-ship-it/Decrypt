package androidx.compose.ui.input.key;

/* JADX INFO: loaded from: classes.dex */
final class b extends androidx.compose.ui.d.c implements p231x0.e {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f19789P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p237x7.l f19790Q;

    public b(p237x7.l lVar, p237x7.l lVar2) {
        this.f19789P = lVar;
        this.f19790Q = lVar2;
    }

    @Override // p231x0.e
    public boolean H(android.view.KeyEvent keyEvent) {
        p237x7.l lVar = this.f19790Q;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.l(p231x0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void T1(p237x7.l lVar) {
        this.f19789P = lVar;
    }

    public final void U1(p237x7.l lVar) {
        this.f19790Q = lVar;
    }

    @Override // p231x0.e
    public boolean b0(android.view.KeyEvent keyEvent) {
        p237x7.l lVar = this.f19789P;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.l(p231x0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
