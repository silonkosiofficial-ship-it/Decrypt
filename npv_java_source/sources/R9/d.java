package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends U9.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final R9.d.a f9787d = new R9.d.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final javax.net.ssl.X509TrustManager f9788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.net.http.X509TrustManagerExtensions f9789c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R9.d a(javax.net.ssl.X509TrustManager x509TrustManager) {
            android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;
            p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
            } catch (java.lang.IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new R9.d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public d(javax.net.ssl.X509TrustManager x509TrustManager, android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        p247y7.AbstractC7350t.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f9788b = x509TrustManager;
        this.f9789c = x509TrustManagerExtensions;
    }

    @Override // U9.c
    public java.util.List a(java.util.List list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
        p247y7.AbstractC7350t.f(list, "chain");
        p247y7.AbstractC7350t.f(str, "hostname");
        try {
            java.util.List<java.security.cert.X509Certificate> listCheckServerTrusted = this.f9789c.checkServerTrusted((java.security.cert.X509Certificate[]) list.toArray(new java.security.cert.X509Certificate[0]), "RSA", str);
            p247y7.AbstractC7350t.e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (java.security.cert.CertificateException e6) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e6.getMessage());
            sSLPeerUnverifiedException.initCause(e6);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof R9.d) && ((R9.d) obj).f9788b == this.f9788b;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.f9788b);
    }
}
