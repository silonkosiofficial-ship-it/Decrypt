package p054f3;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f44984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z2.e f44985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p064g3.InterfaceC6599d f44986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p054f3.x f44987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f44988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p074h3.b f44989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p084i3.a f44990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p084i3.a f44991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p064g3.InterfaceC6598c f44992i;

    public r(android.content.Context context, Z2.e eVar, p064g3.InterfaceC6599d interfaceC6599d, p054f3.x xVar, java.util.concurrent.Executor executor, p074h3.b bVar, p084i3.a aVar, p084i3.a aVar2, p064g3.InterfaceC6598c interfaceC6598c) {
        this.f44984a = context;
        this.f44985b = eVar;
        this.f44986c = interfaceC6599d;
        this.f44987d = xVar;
        this.f44988e = executor;
        this.f44989f = bVar;
        this.f44990g = aVar;
        this.f44991h = aVar2;
        this.f44992i = interfaceC6598c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Boolean l(Y2.p pVar) {
        return java.lang.Boolean.valueOf(this.f44986c.Z(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Iterable m(Y2.p pVar) {
        return this.f44986c.a0(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object n(java.lang.Iterable iterable, Y2.p pVar, long j6) {
        this.f44986c.j1(iterable);
        this.f44986c.k1(pVar, this.f44990g.a() + j6);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object o(java.lang.Iterable iterable) {
        this.f44986c.x(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object p() {
        this.f44992i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object q(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f44992i.i(((java.lang.Integer) entry.getValue()).intValue(), b3.c.b.INVALID_PAYLOD, (java.lang.String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object r(Y2.p pVar, long j6) {
        this.f44986c.k1(pVar, this.f44990g.a() + j6);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object s(Y2.p pVar, int i6) {
        this.f44987d.a(pVar, i6 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final Y2.p pVar, final int i6, java.lang.Runnable runnable) {
        try {
            try {
                p074h3.b bVar = this.f44989f;
                final p064g3.InterfaceC6599d interfaceC6599d = this.f44986c;
                j$.util.Objects.requireNonNull(interfaceC6599d);
                bVar.f(new h3.b.a() { // from class: f3.i
                    @Override // h3.b.a
                    public final java.lang.Object n() {
                        return java.lang.Integer.valueOf(interfaceC6599d.v());
                    }
                });
                if (k()) {
                    u(pVar, i6);
                } else {
                    this.f44989f.f(new h3.b.a() { // from class: f3.j
                        @Override // h3.b.a
                        public final java.lang.Object n() {
                            return this.f44965a.s(pVar, i6);
                        }
                    });
                }
            } catch (p074h3.a unused) {
                this.f44987d.a(pVar, i6 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public Y2.i j(Z2.m mVar) {
        p074h3.b bVar = this.f44989f;
        final p064g3.InterfaceC6598c interfaceC6598c = this.f44992i;
        j$.util.Objects.requireNonNull(interfaceC6598c);
        return mVar.a(Y2.i.a().i(this.f44990g.a()).o(this.f44991h.a()).n("GDT_CLIENT_METRICS").h(new Y2.h(W2.b.b("proto"), ((p014b3.a) bVar.f(new h3.b.a() { // from class: f3.h
            @Override // h3.b.a
            public final java.lang.Object n() {
                return interfaceC6598c.g();
            }
        })).f())).d());
    }

    boolean k() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.f44984a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public Z2.g u(final Y2.p pVar, int i6) {
        Z2.g gVarB;
        Z2.m mVarD = this.f44985b.d(pVar.b());
        long jMax = 0;
        Z2.g gVarE = Z2.g.e(0L);
        while (true) {
            final long j6 = jMax;
            while (true) {
                if (!((java.lang.Boolean) this.f44989f.f(new h3.b.a() { // from class: f3.k
                    @Override // h3.b.a
                    public final java.lang.Object n() {
                        return this.f44968a.l(pVar);
                    }
                })).booleanValue()) {
                    this.f44989f.f(new h3.b.a() { // from class: f3.q
                        @Override // h3.b.a
                        public final java.lang.Object n() {
                            return this.f44981a.r(pVar, j6);
                        }
                    });
                    return gVarE;
                }
                final java.lang.Iterable iterable = (java.lang.Iterable) this.f44989f.f(new h3.b.a() { // from class: f3.l
                    @Override // h3.b.a
                    public final java.lang.Object n() {
                        return this.f44970a.m(pVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarD == null) {
                    p024c3.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    gVarB = Z2.g.a();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((p064g3.AbstractC6606k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVarD));
                    }
                    gVarB = mVarD.b(Z2.f.a().b(arrayList).c(pVar.c()).a());
                }
                gVarE = gVarB;
                if (gVarE.c() == Z2.g.a.TRANSIENT_ERROR) {
                    this.f44989f.f(new h3.b.a() { // from class: f3.m
                        @Override // h3.b.a
                        public final java.lang.Object n() {
                            return this.f44972a.n(iterable, pVar, j6);
                        }
                    });
                    this.f44987d.b(pVar, i6 + 1, true);
                    return gVarE;
                }
                this.f44989f.f(new h3.b.a() { // from class: f3.n
                    @Override // h3.b.a
                    public final java.lang.Object n() {
                        return this.f44976a.o(iterable);
                    }
                });
                if (gVarE.c() == Z2.g.a.OK) {
                    break;
                }
                if (gVarE.c() == Z2.g.a.INVALID_PAYLOAD) {
                    final java.util.HashMap map = new java.util.HashMap();
                    java.util.Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        java.lang.String strN = ((p064g3.AbstractC6606k) it2.next()).b().n();
                        map.put(strN, !map.containsKey(strN) ? 1 : java.lang.Integer.valueOf(((java.lang.Integer) map.get(strN)).intValue() + 1));
                    }
                    this.f44989f.f(new h3.b.a() { // from class: f3.p
                        @Override // h3.b.a
                        public final java.lang.Object n() {
                            return this.f44979a.q(map);
                        }
                    });
                }
            }
            jMax = java.lang.Math.max(j6, gVarE.b());
            if (pVar.e()) {
                this.f44989f.f(new h3.b.a() { // from class: f3.o
                    @Override // h3.b.a
                    public final java.lang.Object n() {
                        return this.f44978a.p();
                    }
                });
            }
        }
    }

    public void v(final Y2.p pVar, final int i6, final java.lang.Runnable runnable) {
        this.f44988e.execute(new java.lang.Runnable() { // from class: f3.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f44959C.t(pVar, i6, runnable);
            }
        });
    }
}
