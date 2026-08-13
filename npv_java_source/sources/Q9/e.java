package Q9;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends Q9.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q9.e.a f9131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9132f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.security.Provider f9133d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean a(int i6, int i10, int i11) {
            org.conscrypt.Conscrypt.Version version = org.conscrypt.Conscrypt.version();
            if (version.major() != i6) {
                return version.major() > i6;
            }
            if (version.minor() != i10) {
                return version.minor() > i10;
            }
            return version.patch() >= i11;
        }

        public final Q9.e b() {
            p247y7.AbstractC7342k abstractC7342k = null;
            if (c()) {
                return new Q9.e(abstractC7342k);
            }
            return null;
        }

        public final boolean c() {
            return Q9.e.f9132f;
        }
    }

    public static final class b implements org.conscrypt.ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Q9.e.b f9134a = new Q9.e.b();

        private b() {
        }
    }

    static {
        Q9.e.a aVar = new Q9.e.a(null);
        f9131e = aVar;
        boolean z6 = false;
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (org.conscrypt.Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z6 = true;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        f9132f = z6;
    }

    private e() {
        java.security.Provider providerNewProvider = org.conscrypt.Conscrypt.newProvider();
        p247y7.AbstractC7350t.e(providerNewProvider, "newProvider()");
        this.f9133d = providerNewProvider;
    }

    public /* synthetic */ e(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    @Override // Q9.k
    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        if (!org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            super.e(sSLSocket, str, list);
        } else {
            org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) Q9.k.f9149a.b(list).toArray(new java.lang.String[0]));
        }
    }

    @Override // Q9.k
    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return org.conscrypt.Conscrypt.isConscrypt(sSLSocket) ? org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket) : super.g(sSLSocket);
    }

    @Override // Q9.k
    public javax.net.ssl.SSLContext m() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.f9133d);
        p247y7.AbstractC7350t.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Q9.k
    public javax.net.ssl.SSLSocketFactory n(javax.net.ssl.X509TrustManager x509TrustManager) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        javax.net.ssl.SSLContext sSLContextM = m();
        sSLContextM.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
        javax.net.ssl.SSLSocketFactory socketFactory = sSLContextM.getSocketFactory();
        p247y7.AbstractC7350t.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Q9.k
    public javax.net.ssl.X509TrustManager o() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        p247y7.AbstractC7350t.c(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                p247y7.AbstractC7350t.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                org.conscrypt.Conscrypt.setHostnameVerifier(x509TrustManager, Q9.e.b.f9134a);
                return x509TrustManager;
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
