package F6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W6.C1767a f2771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f2772b;

    static {
        F7.o oVarE;
        F7.c cVarB = p247y7.P.b(java.util.Map.class);
        try {
            F7.q.a aVar = F7.q.f2794c;
            oVarE = p247y7.P.e(p247y7.P.r(java.util.Map.class, aVar.d(p247y7.P.q(F6.h.class, aVar.c())), aVar.d(p247y7.P.p(java.lang.Object.class))));
        } catch (java.lang.Throwable unused) {
            oVarE = null;
        }
        f2771a = new W6.C1767a("EngineCapabilities", new p017b7.a(cVarB, oVarE));
        f2772b = p097j7.Z.c(I6.F.f5123a);
    }

    public static final W6.C1767a a() {
        return f2771a;
    }
}
