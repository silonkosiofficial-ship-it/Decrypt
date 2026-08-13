package p217v7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(java.lang.AutoCloseable autoCloseable, java.lang.Throwable th) throws java.lang.Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (java.lang.Throwable th2) {
                p087i7.AbstractC6661g.a(th, th2);
            }
        }
    }
}
