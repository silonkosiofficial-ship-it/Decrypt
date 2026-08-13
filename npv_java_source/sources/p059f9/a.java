package p059f9;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: f9.a$a, reason: collision with other inner class name */
    public static final class C0508a {
        public static /* synthetic */ java.lang.Object a(p059f9.a aVar, java.lang.Object obj, p127m7.e eVar, int i6, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i6 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj, eVar);
        }

        public static /* synthetic */ boolean b(p059f9.a aVar, java.lang.Object obj, int i6, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i6 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj);
        }

        public static /* synthetic */ void c(p059f9.a aVar, java.lang.Object obj, int i6, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i6 & 1) != 0) {
                obj = null;
            }
            aVar.d(obj);
        }
    }

    boolean a(java.lang.Object obj);

    boolean b();

    java.lang.Object c(java.lang.Object obj, p127m7.e eVar);

    void d(java.lang.Object obj);
}
