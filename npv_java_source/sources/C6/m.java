package C6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F6.k f1370a;

    static {
        F6.k kVarA;
        java.util.Iterator it = java.util.ServiceLoader.load(C6.k.class, C6.k.class.getClassLoader()).iterator();
        p247y7.AbstractC7350t.e(it, "iterator(...)");
        C6.k kVar = (C6.k) R8.k.A(R8.k.g(it));
        if (kVar == null || (kVarA = kVar.a()) == null) {
            throw new java.lang.IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html".toString());
        }
        f1370a = kVarA;
    }

    public static final C6.c b(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "block");
        return C6.o.b(f1370a, lVar);
    }

    public static /* synthetic */ C6.c c(p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            lVar = new p237x7.l() { // from class: C6.l
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj2) {
                    return C6.m.d((C6.j) obj2);
                }
            };
        }
        return b(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M d(C6.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        return p087i7.M.f46721a;
    }
}
