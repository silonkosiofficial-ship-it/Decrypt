package Q9;

/* JADX INFO: loaded from: classes2.dex */
public class i extends Q9.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q9.i.a f9144d = new Q9.i.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f9145e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Q9.i a() {
            if (b()) {
                return new Q9.i();
            }
            return null;
        }

        public final boolean b() {
            return Q9.i.f9145e;
        }
    }

    static {
        java.lang.String property = java.lang.System.getProperty("java.specification.version");
        java.lang.Integer numV = property != null ? S8.r.v(property) : null;
        boolean z6 = false;
        if (numV == null) {
            try {
                javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", null);
                z6 = true;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        } else if (numV.intValue() >= 9) {
            z6 = true;
        }
        f9145e = z6;
    }

    @Override // Q9.k
    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((java.lang.String[]) Q9.k.f9149a.b(list).toArray(new java.lang.String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // Q9.k
    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        try {
            java.lang.String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : p247y7.AbstractC7350t.b(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
