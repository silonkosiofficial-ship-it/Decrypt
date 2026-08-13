package Q9;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends Q9.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q9.j.a f9146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9147f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.security.Provider f9148d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Q9.j a() {
            p247y7.AbstractC7342k abstractC7342k = null;
            if (b()) {
                return new Q9.j(abstractC7342k);
            }
            return null;
        }

        public final boolean b() {
            return Q9.j.f9147f;
        }
    }

    static {
        Q9.j.a aVar = new Q9.j.a(null);
        f9146e = aVar;
        boolean z6 = false;
        try {
            java.lang.Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z6 = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        f9147f = z6;
    }

    private j() {
        this.f9148d = new org.openjsse.net.ssl.OpenJSSE();
    }

    public /* synthetic */ j(p247y7.AbstractC7342k abstractC7342k) {
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
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.3", this.f9148d);
        p247y7.AbstractC7350t.e(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Q9.k
    public javax.net.ssl.X509TrustManager o() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm(), this.f9148d);
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
