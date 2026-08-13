package Q9;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Q9.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q9.d.a f9128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9129f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.security.Provider f9130d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Q9.d a() {
            p247y7.AbstractC7342k abstractC7342k = null;
            if (b()) {
                return new Q9.d(abstractC7342k);
            }
            return null;
        }

        public final boolean b() {
            return Q9.d.f9129f;
        }
    }

    static {
        Q9.d.a aVar = new Q9.d.a(null);
        f9128e = aVar;
        boolean z6 = false;
        try {
            java.lang.Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z6 = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        f9129f = z6;
    }

    private d() {
        this.f9130d = new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider();
    }

    public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    @Override // Q9.k
    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        super.e(sSLSocket, str, list);
    }

    @Override // Q9.k
    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return super.g(sSLSocket);
    }

    @Override // Q9.k
    public javax.net.ssl.SSLContext m() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.f9130d);
        p247y7.AbstractC7350t.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Q9.k
    public javax.net.ssl.X509TrustManager o() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.NoSuchProviderException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        p247y7.AbstractC7350t.c(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                p247y7.AbstractC7350t.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (javax.net.ssl.X509TrustManager) trustManager;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Unexpected default trust managers: ");
        java.lang.String string = java.util.Arrays.toString(trustManagers);
        p247y7.AbstractC7350t.e(string, "toString(this)");
        sb.append(string);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
