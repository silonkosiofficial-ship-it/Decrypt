package Q9;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Q9.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q9.b.a f9119e = new Q9.b.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9120f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f9121d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Q9.k a() {
            if (b()) {
                return new Q9.b();
            }
            return null;
        }

        public final boolean b() {
            return Q9.b.f9120f;
        }
    }

    static {
        f9120f = Q9.k.f9149a.h() && android.os.Build.VERSION.SDK_INT >= 29;
    }

    public b() {
        java.util.List listR = p097j7.AbstractC6879v.r(R9.c.f9786a.a(), new R9.l(R9.h.f9794f.d()), new R9.l(R9.k.f9808a.a()), new R9.l(R9.i.f9802a.a()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listR) {
            if (((R9.m) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f9121d = arrayList;
    }

    @Override // Q9.k
    public U9.c c(javax.net.ssl.X509TrustManager x509TrustManager) {
        p247y7.AbstractC7350t.f(x509TrustManager, "trustManager");
        R9.d dVarA = R9.d.f9787d.a(x509TrustManager);
        return dVarA != null ? dVarA : super.c(x509TrustManager);
    }

    @Override // Q9.k
    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        java.util.Iterator it = this.f9121d.iterator();
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
    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        java.util.Iterator it = this.f9121d.iterator();
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
    public boolean i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "hostname");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
