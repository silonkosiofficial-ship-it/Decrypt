package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f7182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7185d;

    public b(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "connectionSpecs");
        this.f7182a = list;
    }

    private final boolean c(javax.net.ssl.SSLSocket sSLSocket) {
        int size = this.f7182a.size();
        for (int i6 = this.f7183b; i6 < size; i6++) {
            if (((H9.l) this.f7182a.get(i6)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final H9.l a(javax.net.ssl.SSLSocket sSLSocket) throws java.net.UnknownServiceException {
        H9.l lVar;
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        int i6 = this.f7183b;
        int size = this.f7182a.size();
        while (true) {
            if (i6 >= size) {
                lVar = null;
                break;
            }
            lVar = (H9.l) this.f7182a.get(i6);
            i6++;
            if (lVar.e(sSLSocket)) {
                this.f7183b = i6;
                break;
            }
        }
        if (lVar != null) {
            this.f7184c = c(sSLSocket);
            lVar.c(sSLSocket, this.f7185d);
            return lVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f7185d);
        sb.append(", modes=");
        sb.append(this.f7182a);
        sb.append(", supported protocols=");
        java.lang.String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        p247y7.AbstractC7350t.c(enabledProtocols);
        java.lang.String string = java.util.Arrays.toString(enabledProtocols);
        p247y7.AbstractC7350t.e(string, "toString(this)");
        sb.append(string);
        throw new java.net.UnknownServiceException(sb.toString());
    }

    public final boolean b(java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(iOException, "e");
        this.f7185d = true;
        return (!this.f7184c || (iOException instanceof java.net.ProtocolException) || (iOException instanceof java.io.InterruptedIOException) || ((iOException instanceof javax.net.ssl.SSLHandshakeException) && (iOException.getCause() instanceof java.security.cert.CertificateException)) || (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException) || !(iOException instanceof javax.net.ssl.SSLException)) ? false : true;
    }
}
