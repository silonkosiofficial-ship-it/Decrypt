package Y8;

/* JADX INFO: loaded from: classes2.dex */
public interface C {

    public static final class a {
        public static /* synthetic */ boolean a(Y8.C c6, java.lang.Throwable th, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i6 & 1) != 0) {
                th = null;
            }
            return c6.c(th);
        }
    }

    boolean c(java.lang.Throwable th);

    void d(p237x7.l lVar);

    java.lang.Object h(java.lang.Object obj, p127m7.e eVar);

    java.lang.Object j(java.lang.Object obj);

    boolean m();
}
