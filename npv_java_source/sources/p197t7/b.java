package p197t7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(java.io.Closeable closeable, java.lang.Throwable th) throws java.io.IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                p087i7.AbstractC6661g.a(th, th2);
            }
        }
    }
}
