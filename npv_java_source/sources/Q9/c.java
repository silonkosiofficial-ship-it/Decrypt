package Q9;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Q9.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Q9.c.a f9122f = new Q9.c.a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f9123g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f9124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final R9.j f9125e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Q9.k a() {
            if (b()) {
                return new Q9.c();
            }
            return null;
        }

        public final boolean b() {
            return Q9.c.f9123g;
        }
    }

    public static final class b implements U9.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final javax.net.ssl.X509TrustManager f9126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Method f9127b;

        public b(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
            p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
            p247y7.AbstractC7350t.f(method, "findByIssuerAndSignatureMethod");
            this.f9126a = x509TrustManager;
            this.f9127b = method;
        }

        @Override // U9.e
        public java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
            p247y7.AbstractC7350t.f(x509Certificate, "cert");
            try {
                java.lang.Object objInvoke = this.f9127b.invoke(this.f9126a, x509Certificate);
                p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((java.security.cert.TrustAnchor) objInvoke).getTrustedCert();
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.AssertionError("unable to get issues and signature", e6);
            } catch (java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Q9.c.b)) {
                return false;
            }
            Q9.c.b bVar = (Q9.c.b) obj;
            return p247y7.AbstractC7350t.b(this.f9126a, bVar.f9126a) && p247y7.AbstractC7350t.b(this.f9127b, bVar.f9127b);
        }

        public int hashCode() {
            return (this.f9126a.hashCode() * 31) + this.f9127b.hashCode();
        }

        public java.lang.String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f9126a + ", findByIssuerAndSignatureMethod=" + this.f9127b + ')';
        }
    }

    static {
        boolean z6 = false;
        if (Q9.k.f9149a.h() && android.os.Build.VERSION.SDK_INT < 30) {
            z6 = true;
        }
        f9123g = z6;
    }

    public c() {
        java.util.List listR = p097j7.AbstractC6879v.r(R9.n.a.b(R9.n.f9812j, null, 1, null), new R9.l(R9.h.f9794f.d()), new R9.l(R9.k.f9808a.a()), new R9.l(R9.i.f9802a.a()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listR) {
            if (((R9.m) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f9124d = arrayList;
        this.f9125e = R9.j.f9804d.a();
    }

    @Override // Q9.k
    public U9.c c(javax.net.ssl.X509TrustManager x509TrustManager) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        R9.d dVarA = R9.d.f9787d.a(x509TrustManager);
        return dVarA != null ? dVarA : super.c(x509TrustManager);
    }

    @Override // Q9.k
    public U9.e d(javax.net.ssl.X509TrustManager x509TrustManager) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        try {
            java.lang.reflect.Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", java.security.cert.X509Certificate.class);
            declaredMethod.setAccessible(true);
            p247y7.AbstractC7350t.e(declaredMethod, "method");
            return new Q9.c.b(x509TrustManager, declaredMethod);
        } catch (java.lang.NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // Q9.k
    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        java.util.Iterator it = this.f9124d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((R9.m) next).b(sSLSocket));
        R9.m mVar = (R9.m) next;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // Q9.k
    public void f(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, int i6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(socket, "socket");
        p247y7.AbstractC7350t.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i6);
        } catch (java.lang.ClassCastException e6) {
            if (android.os.Build.VERSION.SDK_INT != 26) {
                throw e6;
            }
            throw new java.io.IOException("Exception in connect", e6);
        }
    }

    @Override // Q9.k
    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        java.util.Iterator it = this.f9124d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((R9.m) next).b(sSLSocket));
        R9.m mVar = (R9.m) next;
        if (mVar != null) {
            return mVar.c(sSLSocket);
        }
        return null;
    }

    @Override // Q9.k
    public java.lang.Object h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "closer");
        return this.f9125e.a(str);
    }

    @Override // Q9.k
    public boolean i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "hostname");
        return android.os.Build.VERSION.SDK_INT >= 24 ? android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // Q9.k
    public void l(java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "message");
        if (this.f9125e.b(obj)) {
            return;
        }
        Q9.k.k(this, str, 5, null, 4, null);
    }
}
