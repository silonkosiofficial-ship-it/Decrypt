package F6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W8.M f2776a = new W8.M("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W6.C1767a f2777b;

    static {
        F7.o oVarQ;
        F7.c cVarB = p247y7.P.b(C6.j.class);
        try {
            oVarQ = p247y7.P.q(C6.j.class, F7.q.f2794c.c());
        } catch (java.lang.Throwable unused) {
            oVarQ = null;
        }
        f2777b = new W6.C1767a("client-config", new p017b7.a(cVarB, oVarQ));
    }

    public static final java.lang.Object b(F6.b bVar, W8.InterfaceC1822z0 interfaceC1822z0, p127m7.e eVar) {
        W8.InterfaceC1819y interfaceC1819yA = W8.C0.a(interfaceC1822z0);
        p127m7.i iVarO0 = bVar.getCoroutineContext().o0(interfaceC1819yA).o0(f2776a);
        W8.InterfaceC1822z0 interfaceC1822z1 = (W8.InterfaceC1822z0) eVar.getContext().i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z1 != null) {
            interfaceC1819yA.e1(new F6.r(W8.InterfaceC1822z0.a.d(interfaceC1822z1, true, false, new F6.s(interfaceC1819yA), 2, null)));
        }
        return iVarO0;
    }

    public static final W6.C1767a c() {
        return f2777b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(O6.e eVar) {
        java.util.Set setNames = eVar.e().names();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setNames) {
            if (T6.C1673v.f13241a.p().contains((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new T6.Y(arrayList.toString());
        }
    }
}
