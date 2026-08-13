package Q9;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q9.k.a f9149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Q9.k f9150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.logging.Logger f9151c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final Q9.k d() {
            R9.e.f9790a.b();
            Q9.k kVarA = Q9.b.f9119e.a();
            if (kVarA != null) {
                return kVarA;
            }
            Q9.k kVarA2 = Q9.c.f9122f.a();
            p247y7.AbstractC7350t.c(kVarA2);
            return kVarA2;
        }

        private final Q9.k e() {
            Q9.j jVarA;
            Q9.d dVarA;
            Q9.e eVarB;
            if (j() && (eVarB = Q9.e.f9131e.b()) != null) {
                return eVarB;
            }
            if (i() && (dVarA = Q9.d.f9128e.a()) != null) {
                return dVarA;
            }
            if (k() && (jVarA = Q9.j.f9146e.a()) != null) {
                return jVarA;
            }
            Q9.i iVarA = Q9.i.f9144d.a();
            if (iVarA != null) {
                return iVarA;
            }
            Q9.k kVarA = Q9.f.f9135i.a();
            return kVarA != null ? kVarA : new Q9.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Q9.k f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return p247y7.AbstractC7350t.b("BC", java.security.Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return p247y7.AbstractC7350t.b("Conscrypt", java.security.Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return p247y7.AbstractC7350t.b("OpenJSSE", java.security.Security.getProviders()[0].getName());
        }

        public final java.util.List b(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "protocols");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((H9.y) obj) != H9.y.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((H9.y) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "protocols");
            X9.C1836d c1836d = new X9.C1836d();
            for (java.lang.String str : b(list)) {
                c1836d.U(str.length());
                c1836d.t0(str);
            }
            return c1836d.K0();
        }

        public final Q9.k g() {
            return Q9.k.f9150b;
        }

        public final boolean h() {
            return p247y7.AbstractC7350t.b("Dalvik", java.lang.System.getProperty("java.vm.name"));
        }
    }

    static {
        Q9.k.a aVar = new Q9.k.a(null);
        f9149a = aVar;
        f9150b = aVar.f();
        f9151c = java.util.logging.Logger.getLogger(H9.x.class.getName());
    }

    public static /* synthetic */ void k(Q9.k kVar, java.lang.String str, int i6, java.lang.Throwable th, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i10 & 2) != 0) {
            i6 = 4;
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        kVar.j(str, i6, th);
    }

    public void b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
    }

    public U9.c c(javax.net.ssl.X509TrustManager x509TrustManager) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        return new U9.a(d(x509TrustManager));
    }

    public U9.e d(javax.net.ssl.X509TrustManager x509TrustManager) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        java.security.cert.X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        p247y7.AbstractC7350t.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new U9.b((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
    }

    public void f(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, int i6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(socket, "socket");
        p247y7.AbstractC7350t.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i6);
    }

    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return null;
    }

    public java.lang.Object h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "closer");
        if (f9151c.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable(str);
        }
        return null;
    }

    public boolean i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "hostname");
        return true;
    }

    public void j(java.lang.String str, int i6, java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(str, "message");
        f9151c.log(i6 == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, str, th);
    }

    public void l(java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        j(str, 5, (java.lang.Throwable) obj);
    }

    public javax.net.ssl.SSLContext m() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        p247y7.AbstractC7350t.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public javax.net.ssl.SSLSocketFactory n(javax.net.ssl.X509TrustManager x509TrustManager) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        try {
            javax.net.ssl.SSLContext sSLContextM = m();
            sSLContextM.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = sSLContextM.getSocketFactory();
            p247y7.AbstractC7350t.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.AssertionError("No System TLS: " + e6, e6);
        }
    }

    public javax.net.ssl.X509TrustManager o() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
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

    public java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        p247y7.AbstractC7350t.e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
