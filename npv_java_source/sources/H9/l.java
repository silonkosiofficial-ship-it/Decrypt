package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H9.l.b f4755e = new H9.l.b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final H9.i[] f4756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final H9.i[] f4757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H9.l f4758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H9.l f4759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final H9.l f4760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H9.l f4761k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String[] f4764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String[] f4765d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String[] f4767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String[] f4768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4769d;

        public a(H9.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "connectionSpec");
            this.f4766a = lVar.f();
            this.f4767b = lVar.f4764c;
            this.f4768c = lVar.f4765d;
            this.f4769d = lVar.h();
        }

        public a(boolean z6) {
            this.f4766a = z6;
        }

        public final H9.l a() {
            return new H9.l(this.f4766a, this.f4769d, this.f4767b, this.f4768c);
        }

        public final H9.l.a b(H9.i... iVarArr) {
            p247y7.AbstractC7350t.f(iVarArr, "cipherSuites");
            if (!this.f4766a) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(iVarArr.length);
            for (H9.i iVar : iVarArr) {
                arrayList.add(iVar.c());
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            return c((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }

        public final H9.l.a c(java.lang.String... strArr) {
            p247y7.AbstractC7350t.f(strArr, "cipherSuites");
            if (!this.f4766a) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new java.lang.IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f4767b = (java.lang.String[]) strArr.clone();
            return this;
        }

        public final H9.l.a d(boolean z6) {
            if (!this.f4766a) {
                throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f4769d = z6;
            return this;
        }

        public final H9.l.a e(H9.E... eArr) {
            p247y7.AbstractC7350t.f(eArr, "tlsVersions");
            if (!this.f4766a) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(eArr.length);
            for (H9.E e6 : eArr) {
                arrayList.add(e6.g());
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            return f((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }

        public final H9.l.a f(java.lang.String... strArr) {
            p247y7.AbstractC7350t.f(strArr, "tlsVersions");
            if (!this.f4766a) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new java.lang.IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f4768c = (java.lang.String[]) strArr.clone();
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        H9.i iVar = H9.i.f4726o1;
        H9.i iVar2 = H9.i.f4729p1;
        H9.i iVar3 = H9.i.f4732q1;
        H9.i iVar4 = H9.i.f4684a1;
        H9.i iVar5 = H9.i.f4696e1;
        H9.i iVar6 = H9.i.f4687b1;
        H9.i iVar7 = H9.i.f4699f1;
        H9.i iVar8 = H9.i.f4717l1;
        H9.i iVar9 = H9.i.f4714k1;
        H9.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f4756f = iVarArr;
        H9.i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, H9.i.f4654L0, H9.i.f4656M0, H9.i.f4710j0, H9.i.f4713k0, H9.i.f4645H, H9.i.f4653L, H9.i.f4715l};
        f4757g = iVarArr2;
        H9.l.a aVarB = new H9.l.a(true).b((H9.i[]) java.util.Arrays.copyOf(iVarArr, iVarArr.length));
        H9.E e6 = H9.E.TLS_1_3;
        H9.E e10 = H9.E.TLS_1_2;
        f4758h = aVarB.e(e6, e10).d(true).a();
        f4759i = new H9.l.a(true).b((H9.i[]) java.util.Arrays.copyOf(iVarArr2, iVarArr2.length)).e(e6, e10).d(true).a();
        f4760j = new H9.l.a(true).b((H9.i[]) java.util.Arrays.copyOf(iVarArr2, iVarArr2.length)).e(e6, e10, H9.E.TLS_1_1, H9.E.TLS_1_0).d(true).a();
        f4761k = new H9.l.a(false).a();
    }

    public l(boolean z6, boolean z10, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.f4762a = z6;
        this.f4763b = z10;
        this.f4764c = strArr;
        this.f4765d = strArr2;
    }

    private final H9.l g(javax.net.ssl.SSLSocket sSLSocket, boolean z6) {
        java.lang.String[] enabledCipherSuites;
        java.lang.String[] enabledProtocols;
        if (this.f4764c != null) {
            java.lang.String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            p247y7.AbstractC7350t.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = I9.d.E(enabledCipherSuites2, this.f4764c, H9.i.f4685b.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f4765d != null) {
            java.lang.String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            p247y7.AbstractC7350t.e(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = I9.d.E(enabledProtocols2, this.f4765d, p117l7.a.f());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        java.lang.String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        p247y7.AbstractC7350t.e(supportedCipherSuites, "supportedCipherSuites");
        int iX = I9.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", H9.i.f4685b.c());
        if (z6 && iX != -1) {
            p247y7.AbstractC7350t.e(enabledCipherSuites, "cipherSuitesIntersection");
            java.lang.String str = supportedCipherSuites[iX];
            p247y7.AbstractC7350t.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = I9.d.o(enabledCipherSuites, str);
        }
        H9.l.a aVar = new H9.l.a(this);
        p247y7.AbstractC7350t.e(enabledCipherSuites, "cipherSuitesIntersection");
        H9.l.a aVarC = aVar.c((java.lang.String[]) java.util.Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        p247y7.AbstractC7350t.e(enabledProtocols, "tlsVersionsIntersection");
        return aVarC.f((java.lang.String[]) java.util.Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void c(javax.net.ssl.SSLSocket sSLSocket, boolean z6) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        H9.l lVarG = g(sSLSocket, z6);
        if (lVarG.i() != null) {
            sSLSocket.setEnabledProtocols(lVarG.f4765d);
        }
        if (lVarG.d() != null) {
            sSLSocket.setEnabledCipherSuites(lVarG.f4764c);
        }
    }

    public final java.util.List d() {
        java.lang.String[] strArr = this.f4764c;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(H9.i.f4685b.b(str));
        }
        return p097j7.AbstractC6879v.T0(arrayList);
    }

    public final boolean e(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "socket");
        if (!this.f4762a) {
            return false;
        }
        java.lang.String[] strArr = this.f4765d;
        if (strArr != null && !I9.d.u(strArr, sSLSocket.getEnabledProtocols(), p117l7.a.f())) {
            return false;
        }
        java.lang.String[] strArr2 = this.f4764c;
        return strArr2 == null || I9.d.u(strArr2, sSLSocket.getEnabledCipherSuites(), H9.i.f4685b.c());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof H9.l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z6 = this.f4762a;
        H9.l lVar = (H9.l) obj;
        if (z6 != lVar.f4762a) {
            return false;
        }
        return !z6 || (java.util.Arrays.equals(this.f4764c, lVar.f4764c) && java.util.Arrays.equals(this.f4765d, lVar.f4765d) && this.f4763b == lVar.f4763b);
    }

    public final boolean f() {
        return this.f4762a;
    }

    public final boolean h() {
        return this.f4763b;
    }

    public int hashCode() {
        if (!this.f4762a) {
            return 17;
        }
        java.lang.String[] strArr = this.f4764c;
        int iHashCode = (527 + (strArr != null ? java.util.Arrays.hashCode(strArr) : 0)) * 31;
        java.lang.String[] strArr2 = this.f4765d;
        return ((iHashCode + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4763b ? 1 : 0);
    }

    public final java.util.List i() {
        java.lang.String[] strArr = this.f4765d;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(H9.E.f4574D.a(str));
        }
        return p097j7.AbstractC6879v.T0(arrayList);
    }

    public java.lang.String toString() {
        if (!this.f4762a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + j$.util.Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + j$.util.Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4763b + ')';
    }
}
