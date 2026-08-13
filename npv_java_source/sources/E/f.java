package E;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p131n0.i f2088D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.InterfaceC0900t f2089E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p131n0.i iVar, D0.InterfaceC0900t interfaceC0900t) {
            super(0);
            this.f2088D = iVar;
            this.f2089E = interfaceC0900t;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p131n0.i b() {
            p131n0.i iVar = this.f2088D;
            if (iVar != null) {
                return iVar;
            }
            D0.InterfaceC0900t interfaceC0900t = this.f2089E;
            if (!interfaceC0900t.K()) {
                interfaceC0900t = null;
            }
            if (interfaceC0900t != null) {
                return p131n0.n.c(Y0.u.d(interfaceC0900t.a()));
            }
            return null;
        }
    }

    public static final java.lang.Object a(F0.InterfaceC0924j interfaceC0924j, p131n0.i iVar, p127m7.e eVar) {
        java.lang.Object objJ1;
        if (!interfaceC0924j.E0().A1()) {
            return p087i7.M.f46721a;
        }
        D0.InterfaceC0900t interfaceC0900tK = F0.AbstractC0925k.k(interfaceC0924j);
        E.a aVarC = androidx.compose.foundation.relocation.b.c(interfaceC0924j);
        return (aVarC != null && (objJ1 = aVarC.j1(interfaceC0900tK, new E.f.a(iVar, interfaceC0900tK), eVar)) == p137n7.b.g()) ? objJ1 : p087i7.M.f46721a;
    }

    public static /* synthetic */ java.lang.Object b(F0.InterfaceC0924j interfaceC0924j, p131n0.i iVar, p127m7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = null;
        }
        return E.e.a(interfaceC0924j, iVar, eVar);
    }
}
