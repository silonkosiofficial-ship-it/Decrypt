package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L {
    public static final void a(p127m7.i iVar, java.lang.Throwable th) {
        try {
            W8.K k6 = (W8.K) iVar.i(W8.K.f15455g);
            if (k6 != null) {
                k6.z0(iVar, th);
            } else {
                p019b9.AbstractC2119f.a(iVar, th);
            }
        } catch (java.lang.Throwable th2) {
            p019b9.AbstractC2119f.a(iVar, b(th, th2));
        }
    }

    public static final java.lang.Throwable b(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == th2) {
            return th;
        }
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
        p087i7.AbstractC6661g.a(runtimeException, th);
        return runtimeException;
    }
}
