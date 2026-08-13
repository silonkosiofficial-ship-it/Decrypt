package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.C1235a f4571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.net.Proxy f4572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.net.InetSocketAddress f4573c;

    public D(H9.C1235a c1235a, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress) {
        p247y7.AbstractC7350t.f(c1235a, "address");
        p247y7.AbstractC7350t.f(proxy, "proxy");
        p247y7.AbstractC7350t.f(inetSocketAddress, "socketAddress");
        this.f4571a = c1235a;
        this.f4572b = proxy;
        this.f4573c = inetSocketAddress;
    }

    public final H9.C1235a a() {
        return this.f4571a;
    }

    public final java.net.Proxy b() {
        return this.f4572b;
    }

    public final boolean c() {
        return this.f4571a.k() != null && this.f4572b.type() == java.net.Proxy.Type.HTTP;
    }

    public final java.net.InetSocketAddress d() {
        return this.f4573c;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof H9.D) {
            H9.D d6 = (H9.D) obj;
            if (p247y7.AbstractC7350t.b(d6.f4571a, this.f4571a) && p247y7.AbstractC7350t.b(d6.f4572b, this.f4572b) && p247y7.AbstractC7350t.b(d6.f4573c, this.f4573c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f4571a.hashCode()) * 31) + this.f4572b.hashCode()) * 31) + this.f4573c.hashCode();
    }

    public java.lang.String toString() {
        return "Route{" + this.f4573c + '}';
    }
}
