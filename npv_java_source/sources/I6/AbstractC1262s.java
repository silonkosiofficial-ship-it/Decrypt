package I6;

/* JADX INFO: renamed from: I6.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1262s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W6.C1767a f5264a;

    static {
        F7.o oVarP;
        F7.c cVarB = p247y7.P.b(W6.InterfaceC1768b.class);
        try {
            oVarP = p247y7.P.p(W6.InterfaceC1768b.class);
        } catch (java.lang.Throwable unused) {
            oVarP = null;
        }
        f5264a = new W6.C1767a("ApplicationPluginRegistry", new p017b7.a(cVarB, oVarP));
    }

    public static final W6.C1767a a() {
        return f5264a;
    }

    public static final java.lang.Object b(C6.c cVar, I6.r rVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(rVar, "plugin");
        java.lang.Object objC = c(cVar, rVar);
        if (objC != null) {
            return objC;
        }
        throw new java.lang.IllegalStateException("Plugin " + rVar + " is not installed. Consider using `install(" + rVar.getKey() + ")` in client config first.");
    }

    public static final java.lang.Object c(C6.c cVar, I6.r rVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(rVar, "plugin");
        W6.InterfaceC1768b interfaceC1768b = (W6.InterfaceC1768b) cVar.x0().c(f5264a);
        if (interfaceC1768b != null) {
            return interfaceC1768b.c(rVar.getKey());
        }
        return null;
    }
}
