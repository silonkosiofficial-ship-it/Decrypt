package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements R9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R9.c.a f9786a = new R9.c.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R9.m a() {
            if (b()) {
                return new R9.c();
            }
            return null;
        }

        public final boolean b() {
            return Q9.k.f9149a.h() && android.os.Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // R9.m
    public boolean a() {
        return f9786a.b();
    }

    @Override // R9.m
    public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return android.net.ssl.SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // R9.m
    public java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        java.lang.String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : p247y7.AbstractC7350t.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // R9.m
    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) throws java.io.IOException {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        try {
            android.net.ssl.SSLSockets.setUseSessionTickets(sSLSocket, true);
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((java.lang.String[]) Q9.k.f9149a.b(list).toArray(new java.lang.String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e6) {
            throw new java.io.IOException("Android internal error", e6);
        }
    }
}
