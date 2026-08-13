package E;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static final class a implements E.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ F0.InterfaceC0924j f2087C;

        a(F0.InterfaceC0924j interfaceC0924j) {
            this.f2087C = interfaceC0924j;
        }

        @Override // E.a
        public final java.lang.Object j1(D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar, p127m7.e eVar) {
            android.view.View viewA = F0.AbstractC0926l.a(this.f2087C);
            long jE = D0.AbstractC0901u.e(interfaceC0900t);
            p131n0.i iVar = (p131n0.i) aVar.b();
            p131n0.i iVarT = iVar != null ? iVar.t(jE) : null;
            if (iVarT != null) {
                viewA.requestRectangleOnScreen(E.d.c(iVarT), false);
            }
            return p087i7.M.f46721a;
        }
    }

    public static final E.a b(F0.InterfaceC0924j interfaceC0924j) {
        return new E.d.a(interfaceC0924j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect c(p131n0.i iVar) {
        return new android.graphics.Rect((int) iVar.i(), (int) iVar.l(), (int) iVar.j(), (int) iVar.e());
    }
}
