package S9;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends java.net.ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S9.a f12692a = new S9.a();

    private a() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public java.util.List select(java.net.URI uri) {
        if (uri != null) {
            return p097j7.AbstractC6879v.e(java.net.Proxy.NO_PROXY);
        }
        throw new java.lang.IllegalArgumentException("uri must not be null".toString());
    }
}
