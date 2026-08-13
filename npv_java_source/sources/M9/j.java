package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M9.j.a f7271i = new M9.j.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.C1235a f7272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M9.h f7273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H9.InterfaceC1239e f7274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H9.r f7275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.List f7276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.util.List f7278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f7279h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.String a(java.net.InetSocketAddress inetSocketAddress) {
            java.lang.String hostAddress;
            java.lang.String str;
            p247y7.AbstractC7350t.f(inetSocketAddress, "<this>");
            java.net.InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            p247y7.AbstractC7350t.e(hostAddress, str);
            return hostAddress;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f7280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7281b;

        public b(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "routes");
            this.f7280a = list;
        }

        public final java.util.List a() {
            return this.f7280a;
        }

        public final boolean b() {
            return this.f7281b < this.f7280a.size();
        }

        public final H9.D c() {
            if (!b()) {
                throw new java.util.NoSuchElementException();
            }
            java.util.List list = this.f7280a;
            int i6 = this.f7281b;
            this.f7281b = i6 + 1;
            return (H9.D) list.get(i6);
        }
    }

    public j(H9.C1235a c1235a, M9.h hVar, H9.InterfaceC1239e interfaceC1239e, H9.r rVar) {
        p247y7.AbstractC7350t.f(c1235a, "address");
        p247y7.AbstractC7350t.f(hVar, "routeDatabase");
        p247y7.AbstractC7350t.f(interfaceC1239e, "call");
        p247y7.AbstractC7350t.f(rVar, "eventListener");
        this.f7272a = c1235a;
        this.f7273b = hVar;
        this.f7274c = interfaceC1239e;
        this.f7275d = rVar;
        this.f7276e = p097j7.AbstractC6879v.m();
        this.f7278g = p097j7.AbstractC6879v.m();
        this.f7279h = new java.util.ArrayList();
        f(c1235a.l(), c1235a.g());
    }

    private final boolean b() {
        return this.f7277f < this.f7276e.size();
    }

    private final java.net.Proxy d() throws java.net.SocketException, java.net.UnknownHostException {
        if (b()) {
            java.util.List list = this.f7276e;
            int i6 = this.f7277f;
            this.f7277f = i6 + 1;
            java.net.Proxy proxy = (java.net.Proxy) list.get(i6);
            e(proxy);
            return proxy;
        }
        throw new java.net.SocketException("No route to " + this.f7272a.l().h() + "; exhausted proxy configurations: " + this.f7276e);
    }

    private final void e(java.net.Proxy proxy) throws java.net.SocketException, java.net.UnknownHostException {
        java.lang.String strH;
        int iL;
        java.util.List listA;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f7278g = arrayList;
        if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS) {
            strH = this.f7272a.l().h();
            iL = this.f7272a.l().l();
        } else {
            java.net.SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof java.net.InetSocketAddress)) {
                throw new java.lang.IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            M9.j.a aVar = f7271i;
            p247y7.AbstractC7350t.e(socketAddressAddress, "proxyAddress");
            java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) socketAddressAddress;
            strH = aVar.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        if (1 > iL || iL >= 65536) {
            throw new java.net.SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == java.net.Proxy.Type.SOCKS) {
            arrayList.add(java.net.InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        if (I9.d.i(strH)) {
            listA = p097j7.AbstractC6879v.e(java.net.InetAddress.getByName(strH));
        } else {
            this.f7275d.m(this.f7274c, strH);
            listA = this.f7272a.c().a(strH);
            if (listA.isEmpty()) {
                throw new java.net.UnknownHostException(this.f7272a.c() + " returned no addresses for " + strH);
            }
            this.f7275d.l(this.f7274c, strH, listA);
        }
        java.util.Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new java.net.InetSocketAddress((java.net.InetAddress) it.next(), iL));
        }
    }

    private final void f(H9.u uVar, java.net.Proxy proxy) {
        this.f7275d.o(this.f7274c, uVar);
        java.util.List listG = g(proxy, uVar, this);
        this.f7276e = listG;
        this.f7277f = 0;
        this.f7275d.n(this.f7274c, uVar, listG);
    }

    private static final java.util.List g(java.net.Proxy proxy, H9.u uVar, M9.j jVar) {
        if (proxy != null) {
            return p097j7.AbstractC6879v.e(proxy);
        }
        java.net.URI uriQ = uVar.q();
        if (uriQ.getHost() == null) {
            return I9.d.w(java.net.Proxy.NO_PROXY);
        }
        java.util.List<java.net.Proxy> listSelect = jVar.f7272a.i().select(uriQ);
        java.util.List<java.net.Proxy> list = listSelect;
        if (list == null || list.isEmpty()) {
            return I9.d.w(java.net.Proxy.NO_PROXY);
        }
        p247y7.AbstractC7350t.e(listSelect, "proxiesOrNull");
        return I9.d.T(listSelect);
    }

    public final boolean a() {
        return b() || (this.f7279h.isEmpty() ^ true);
    }

    public final M9.j.b c() {
        if (!a()) {
            throw new java.util.NoSuchElementException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (b()) {
            java.net.Proxy proxyD = d();
            java.util.Iterator it = this.f7278g.iterator();
            while (it.hasNext()) {
                H9.D d6 = new H9.D(this.f7272a, proxyD, (java.net.InetSocketAddress) it.next());
                if (this.f7273b.c(d6)) {
                    this.f7279h.add(d6);
                } else {
                    arrayList.add(d6);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            p097j7.AbstractC6879v.C(arrayList, this.f7279h);
            this.f7279h.clear();
        }
        return new M9.j.b(arrayList);
    }
}
