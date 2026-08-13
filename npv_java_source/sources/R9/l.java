package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements R9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R9.l.a f9810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R9.m f9811b;

    public interface a {
        boolean b(javax.net.ssl.SSLSocket sSLSocket);

        R9.m c(javax.net.ssl.SSLSocket sSLSocket);
    }

    public l(R9.l.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "socketAdapterFactory");
        this.f9810a = aVar;
    }

    private final synchronized R9.m e(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            if (this.f9811b == null && this.f9810a.b(sSLSocket)) {
                this.f9811b = this.f9810a.c(sSLSocket);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f9811b;
    }

    @Override // R9.m
    public boolean a() {
        return true;
    }

    @Override // R9.m
    public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return this.f9810a.b(sSLSocket);
    }

    @Override // R9.m
    public java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        R9.m mVarE = e(sSLSocket);
        if (mVarE != null) {
            return mVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // R9.m
    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        R9.m mVarE = e(sSLSocket);
        if (mVarE != null) {
            mVarE.d(sSLSocket, str, list);
        }
    }
}
