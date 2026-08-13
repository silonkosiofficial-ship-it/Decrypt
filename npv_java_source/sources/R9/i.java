package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements R9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R9.i.b f9802a = new R9.i.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final R9.l.a f9803b = new R9.i.a();

    public static final class a implements R9.l.a {
        a() {
        }

        @Override // R9.l.a
        public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
            p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
            Q9.d.f9128e.b();
            return false;
        }

        @Override // R9.l.a
        public R9.m c(javax.net.ssl.SSLSocket sSLSocket) {
            p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
            return new R9.i();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R9.l.a a() {
            return R9.i.f9803b;
        }
    }

    @Override // R9.m
    public boolean a() {
        return Q9.d.f9128e.b();
    }

    @Override // R9.m
    public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return false;
    }

    @Override // R9.m
    public java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        java.lang.String applicationProtocol = ((org.bouncycastle.jsse.BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : p247y7.AbstractC7350t.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // R9.m
    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        if (b(sSLSocket)) {
            org.bouncycastle.jsse.BCSSLSocket bCSSLSocket = (org.bouncycastle.jsse.BCSSLSocket) sSLSocket;
            org.bouncycastle.jsse.BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((java.lang.String[]) Q9.k.f9149a.b(list).toArray(new java.lang.String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
