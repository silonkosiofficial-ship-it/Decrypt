package W6;

/* JADX INFO: renamed from: W6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1768b {

    /* JADX INFO: renamed from: W6.b$a */
    public static final class a {
        public static java.lang.Object a(W6.InterfaceC1768b interfaceC1768b, W6.C1767a c1767a) {
            p247y7.AbstractC7350t.f(c1767a, "key");
            java.lang.Object objC = interfaceC1768b.c(c1767a);
            if (objC != null) {
                return objC;
            }
            throw new java.lang.IllegalStateException("No instance for key " + c1767a);
        }
    }

    java.util.List a();

    java.lang.Object b(W6.C1767a c1767a);

    java.lang.Object c(W6.C1767a c1767a);

    void d(W6.C1767a c1767a);

    boolean e(W6.C1767a c1767a);

    void f(W6.C1767a c1767a, java.lang.Object obj);

    java.lang.Object g(W6.C1767a c1767a, p237x7.a aVar);
}
