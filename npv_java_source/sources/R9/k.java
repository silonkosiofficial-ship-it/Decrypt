package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements R9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R9.k.b f9808a = new R9.k.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final R9.l.a f9809b = new R9.k.a();

    public static final class a implements R9.l.a {
        a() {
        }

        @Override // R9.l.a
        public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
            p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
            return Q9.e.f9131e.c() && org.conscrypt.Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // R9.l.a
        public R9.m c(javax.net.ssl.SSLSocket sSLSocket) {
            p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
            return new R9.k();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R9.l.a a() {
            return R9.k.f9809b;
        }
    }

    @Override // R9.m
    public boolean a() {
        return Q9.e.f9131e.c();
    }

    @Override // R9.m
    public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return org.conscrypt.Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // R9.m
    public java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        if (b(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // R9.m
    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        if (b(sSLSocket)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) Q9.k.f9149a.b(list).toArray(new java.lang.String[0]));
        }
    }
}
