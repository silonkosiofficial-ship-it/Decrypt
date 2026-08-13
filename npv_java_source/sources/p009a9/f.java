package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final java.lang.Object b(p127m7.i iVar, java.lang.Object obj, java.lang.Object obj2, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objI = p019b9.K.i(iVar, obj2);
        try {
            p009a9.A a6 = new p009a9.A(eVar, iVar);
            java.lang.Object objE = !(pVar instanceof p147o7.a) ? p137n7.b.e(pVar, obj, a6) : ((p237x7.p) p247y7.W.f(pVar, 2)).u(obj, a6);
            p019b9.K.f(iVar, objI);
            if (objE == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objE;
        } catch (java.lang.Throwable th) {
            p019b9.K.f(iVar, objI);
            throw th;
        }
    }

    public static /* synthetic */ java.lang.Object c(p127m7.i iVar, java.lang.Object obj, java.lang.Object obj2, p237x7.p pVar, p127m7.e eVar, int i6, java.lang.Object obj3) {
        if ((i6 & 4) != 0) {
            obj2 = p019b9.K.g(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z8.InterfaceC1870g d(Z8.InterfaceC1870g interfaceC1870g, p127m7.i iVar) {
        return ((interfaceC1870g instanceof p009a9.z) || (interfaceC1870g instanceof p009a9.s)) ? interfaceC1870g : new p009a9.C(interfaceC1870g, iVar);
    }
}
