package H9;

/* JADX INFO: renamed from: H9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1235a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.q f4582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final javax.net.SocketFactory f4583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f4584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final javax.net.ssl.HostnameVerifier f4585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H9.C1241g f4586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H9.InterfaceC1236b f4587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.net.Proxy f4588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.net.ProxySelector f4589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final H9.u f4590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f4591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.List f4592k;

    public C1235a(java.lang.String str, int i6, H9.q qVar, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, H9.C1241g c1241g, H9.InterfaceC1236b interfaceC1236b, java.net.Proxy proxy, java.util.List list, java.util.List list2, java.net.ProxySelector proxySelector) {
        p247y7.AbstractC7350t.f(str, "uriHost");
        p247y7.AbstractC7350t.f(qVar, "dns");
        p247y7.AbstractC7350t.f(socketFactory, "socketFactory");
        p247y7.AbstractC7350t.f(interfaceC1236b, "proxyAuthenticator");
        p247y7.AbstractC7350t.f(list, "protocols");
        p247y7.AbstractC7350t.f(list2, "connectionSpecs");
        p247y7.AbstractC7350t.f(proxySelector, "proxySelector");
        this.f4582a = qVar;
        this.f4583b = socketFactory;
        this.f4584c = sSLSocketFactory;
        this.f4585d = hostnameVerifier;
        this.f4586e = c1241g;
        this.f4587f = interfaceC1236b;
        this.f4588g = proxy;
        this.f4589h = proxySelector;
        this.f4590i = new H9.u.a().o(sSLSocketFactory != null ? "https" : "http").e(str).k(i6).a();
        this.f4591j = I9.d.T(list);
        this.f4592k = I9.d.T(list2);
    }

    public final H9.C1241g a() {
        return this.f4586e;
    }

    public final java.util.List b() {
        return this.f4592k;
    }

    public final H9.q c() {
        return this.f4582a;
    }

    public final boolean d(H9.C1235a c1235a) {
        p247y7.AbstractC7350t.f(c1235a, "that");
        return p247y7.AbstractC7350t.b(this.f4582a, c1235a.f4582a) && p247y7.AbstractC7350t.b(this.f4587f, c1235a.f4587f) && p247y7.AbstractC7350t.b(this.f4591j, c1235a.f4591j) && p247y7.AbstractC7350t.b(this.f4592k, c1235a.f4592k) && p247y7.AbstractC7350t.b(this.f4589h, c1235a.f4589h) && p247y7.AbstractC7350t.b(this.f4588g, c1235a.f4588g) && p247y7.AbstractC7350t.b(this.f4584c, c1235a.f4584c) && p247y7.AbstractC7350t.b(this.f4585d, c1235a.f4585d) && p247y7.AbstractC7350t.b(this.f4586e, c1235a.f4586e) && this.f4590i.l() == c1235a.f4590i.l();
    }

    public final javax.net.ssl.HostnameVerifier e() {
        return this.f4585d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof H9.C1235a) {
            H9.C1235a c1235a = (H9.C1235a) obj;
            if (p247y7.AbstractC7350t.b(this.f4590i, c1235a.f4590i) && d(c1235a)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List f() {
        return this.f4591j;
    }

    public final java.net.Proxy g() {
        return this.f4588g;
    }

    public final H9.InterfaceC1236b h() {
        return this.f4587f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f4590i.hashCode()) * 31) + this.f4582a.hashCode()) * 31) + this.f4587f.hashCode()) * 31) + this.f4591j.hashCode()) * 31) + this.f4592k.hashCode()) * 31) + this.f4589h.hashCode()) * 31) + j$.util.Objects.hashCode(this.f4588g)) * 31) + j$.util.Objects.hashCode(this.f4584c)) * 31) + j$.util.Objects.hashCode(this.f4585d)) * 31) + j$.util.Objects.hashCode(this.f4586e);
    }

    public final java.net.ProxySelector i() {
        return this.f4589h;
    }

    public final javax.net.SocketFactory j() {
        return this.f4583b;
    }

    public final javax.net.ssl.SSLSocketFactory k() {
        return this.f4584c;
    }

    public final H9.u l() {
        return this.f4590i;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f4590i.h());
        sb2.append(':');
        sb2.append(this.f4590i.l());
        sb2.append(", ");
        if (this.f4588g != null) {
            sb = new java.lang.StringBuilder();
            sb.append("proxy=");
            obj = this.f4588g;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("proxySelector=");
            obj = this.f4589h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
