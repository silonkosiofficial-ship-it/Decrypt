package I7;

/* JADX INFO: renamed from: I7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1266b {
    static {
        java.lang.Object objB;
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            objB = p087i7.w.b(java.lang.Class.forName("java.lang.ClassValue"));
        } catch (java.lang.Throwable th) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th));
        }
        if (p087i7.w.h(objB)) {
            objB = java.lang.Boolean.TRUE;
        }
        java.lang.Object objB2 = p087i7.w.b(objB);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (p087i7.w.g(objB2)) {
            objB2 = bool;
        }
        ((java.lang.Boolean) objB2).booleanValue();
    }

    public static final I7.AbstractC1265a a(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "compute");
        return new I7.C1268d(lVar);
    }
}
