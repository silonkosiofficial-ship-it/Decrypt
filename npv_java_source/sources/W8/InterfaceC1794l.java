package W8;

/* JADX INFO: renamed from: W8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1794l extends p127m7.e {

    /* JADX INFO: renamed from: W8.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(W8.InterfaceC1794l interfaceC1794l, java.lang.Throwable th, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i6 & 1) != 0) {
                th = null;
            }
            return interfaceC1794l.k(th);
        }
    }

    void C(java.lang.Object obj, p237x7.q qVar);

    void F(W8.J j6, java.lang.Object obj);

    void G(p237x7.l lVar);

    void J(java.lang.Object obj);

    boolean f();

    boolean isCancelled();

    boolean k(java.lang.Throwable th);

    java.lang.Object s(java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar);
}
