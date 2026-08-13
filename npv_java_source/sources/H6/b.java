package H6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final java.net.SocketTimeoutException a(java.lang.String str, java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(str, "message");
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(str);
        socketTimeoutException.initCause(th);
        return socketTimeoutException;
    }
}
