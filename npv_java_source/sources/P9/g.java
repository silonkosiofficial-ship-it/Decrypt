package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements N9.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P9.g.a f8630g = new P9.g.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.List f8631h = I9.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.util.List f8632i = I9.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M9.f f8633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N9.g f8634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P9.f f8635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile P9.i f8636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H9.y f8637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f8638f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.util.List a(H9.z zVar) {
            p247y7.AbstractC7350t.f(zVar, "request");
            H9.t tVarE = zVar.e();
            java.util.ArrayList arrayList = new java.util.ArrayList(tVarE.size() + 4);
            arrayList.add(new P9.c(P9.c.f8520g, zVar.g()));
            arrayList.add(new P9.c(P9.c.f8521h, N9.i.f7930a.c(zVar.i())));
            java.lang.String strD = zVar.d("Host");
            if (strD != null) {
                arrayList.add(new P9.c(P9.c.f8523j, strD));
            }
            arrayList.add(new P9.c(P9.c.f8522i, zVar.i().p()));
            int size = tVarE.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.String strE = tVarE.e(i6);
                java.util.Locale locale = java.util.Locale.US;
                p247y7.AbstractC7350t.e(locale, "US");
                java.lang.String lowerCase = strE.toLowerCase(locale);
                p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!P9.g.f8631h.contains(lowerCase) || (p247y7.AbstractC7350t.b(lowerCase, "te") && p247y7.AbstractC7350t.b(tVarE.s(i6), "trailers"))) {
                    arrayList.add(new P9.c(lowerCase, tVarE.s(i6)));
                }
            }
            return arrayList;
        }

        public final H9.B.a b(H9.t tVar, H9.y yVar) throws java.net.ProtocolException {
            p247y7.AbstractC7350t.f(tVar, "headerBlock");
            p247y7.AbstractC7350t.f(yVar, "protocol");
            H9.t.a aVar = new H9.t.a();
            int size = tVar.size();
            N9.k kVarA = null;
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.String strE = tVar.e(i6);
                java.lang.String strS = tVar.s(i6);
                if (p247y7.AbstractC7350t.b(strE, ":status")) {
                    kVarA = N9.k.f7933d.a("HTTP/1.1 " + strS);
                } else if (!P9.g.f8632i.contains(strE)) {
                    aVar.c(strE, strS);
                }
            }
            if (kVarA != null) {
                return new H9.B.a().p(yVar).g(kVarA.f7935b).m(kVarA.f7936c).k(aVar.d());
            }
            throw new java.net.ProtocolException("Expected ':status' header not present");
        }
    }

    public g(H9.x xVar, M9.f fVar, N9.g gVar, P9.f fVar2) {
        p247y7.AbstractC7350t.f(xVar, "client");
        p247y7.AbstractC7350t.f(fVar, "connection");
        p247y7.AbstractC7350t.f(gVar, "chain");
        p247y7.AbstractC7350t.f(fVar2, "http2Connection");
        this.f8633a = fVar;
        this.f8634b = gVar;
        this.f8635c = fVar2;
        java.util.List listG = xVar.G();
        H9.y yVar = H9.y.H2_PRIOR_KNOWLEDGE;
        this.f8637e = listG.contains(yVar) ? yVar : H9.y.HTTP_2;
    }

    @Override // N9.d
    public long a(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "response");
        if (N9.e.b(b6)) {
            return I9.d.v(b6);
        }
        return 0L;
    }

    @Override // N9.d
    public void b() {
        P9.i iVar = this.f8636d;
        p247y7.AbstractC7350t.c(iVar);
        iVar.n().close();
    }

    @Override // N9.d
    public X9.Z c(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "response");
        P9.i iVar = this.f8636d;
        p247y7.AbstractC7350t.c(iVar);
        return iVar.p();
    }

    @Override // N9.d
    public void cancel() {
        this.f8638f = true;
        P9.i iVar = this.f8636d;
        if (iVar != null) {
            iVar.f(P9.b.CANCEL);
        }
    }

    @Override // N9.d
    public H9.B.a d(boolean z6) throws java.io.IOException {
        P9.i iVar = this.f8636d;
        if (iVar == null) {
            throw new java.io.IOException("stream wasn't created");
        }
        H9.B.a aVarB = f8630g.b(iVar.C(), this.f8637e);
        if (z6 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // N9.d
    public M9.f e() {
        return this.f8633a;
    }

    @Override // N9.d
    public void f() {
        this.f8635c.flush();
    }

    @Override // N9.d
    public X9.X g(H9.z zVar, long j6) {
        p247y7.AbstractC7350t.f(zVar, "request");
        P9.i iVar = this.f8636d;
        p247y7.AbstractC7350t.c(iVar);
        return iVar.n();
    }

    @Override // N9.d
    public void h(H9.z zVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(zVar, "request");
        if (this.f8636d != null) {
            return;
        }
        this.f8636d = this.f8635c.l1(f8630g.a(zVar), zVar.a() != null);
        if (this.f8638f) {
            P9.i iVar = this.f8636d;
            p247y7.AbstractC7350t.c(iVar);
            iVar.f(P9.b.CANCEL);
            throw new java.io.IOException("Canceled");
        }
        P9.i iVar2 = this.f8636d;
        p247y7.AbstractC7350t.c(iVar2);
        X9.a0 a0VarV = iVar2.v();
        long jH = this.f8634b.h();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        a0VarV.g(jH, timeUnit);
        P9.i iVar3 = this.f8636d;
        p247y7.AbstractC7350t.c(iVar3);
        iVar3.E().g(this.f8634b.j(), timeUnit);
    }
}
