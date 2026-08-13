package R;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f9262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.C7157a f9263c = p200u.AbstractC7159b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f9264d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p250z.i f9265e;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9266G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f9268I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p200u.InterfaceC7175j f9269J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f6, p200u.InterfaceC7175j interfaceC7175j, p127m7.e eVar) {
            super(2, eVar);
            this.f9268I = f6;
            this.f9269J = interfaceC7175j;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f9266G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7157a c7157a = R.u.this.f9263c;
                java.lang.Float fB = p147o7.b.b(this.f9268I);
                p200u.InterfaceC7175j interfaceC7175j = this.f9269J;
                this.f9266G = 1;
                if (p200u.C7157a.f(c7157a, fB, interfaceC7175j, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((R.u.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return R.u.this.new a(this.f9268I, this.f9269J, eVar);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9270G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p200u.InterfaceC7175j f9272I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p200u.InterfaceC7175j interfaceC7175j, p127m7.e eVar) {
            super(2, eVar);
            this.f9272I = interfaceC7175j;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f9270G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7157a c7157a = R.u.this.f9263c;
                java.lang.Float fB = p147o7.b.b(0.0f);
                p200u.InterfaceC7175j interfaceC7175j = this.f9272I;
                this.f9270G = 1;
                if (p200u.C7157a.f(c7157a, fB, interfaceC7175j, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((R.u.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return R.u.this.new b(this.f9272I, eVar);
        }
    }

    public u(boolean z6, p237x7.a aVar) {
        this.f9261a = z6;
        this.f9262b = aVar;
    }

    public final void b(p161q0.g gVar, float f6, long j6) {
        long j10;
        float fFloatValue = ((java.lang.Number) this.f9263c.m()).floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jM = p141o0.C7016y0.m(j6, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f9261a) {
            p161q0.f.e(gVar, jM, f6, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fI = p131n0.m.i(gVar.i());
        float fG = p131n0.m.g(gVar.i());
        int iB = p141o0.AbstractC7013x0.f52260a.b();
        p161q0.d dVarF0 = gVar.F0();
        long jI = dVarF0.i();
        dVarF0.h().m();
        try {
            dVarF0.c().c(0.0f, 0.0f, fI, fG, iB);
            j10 = jI;
            try {
                p161q0.f.e(gVar, jM, f6, 0L, 0.0f, null, null, 0, 124, null);
                dVarF0.h().s();
                dVarF0.d(j10);
            } catch (java.lang.Throwable th) {
                th = th;
                dVarF0.h().s();
                dVarF0.d(j10);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            j10 = jI;
        }
    }

    public final void c(p250z.i iVar, W8.N n6) {
        java.util.List list;
        java.lang.Object objA;
        p237x7.p bVar;
        float fA;
        boolean z6 = iVar instanceof p250z.g;
        if (z6) {
            this.f9264d.add(iVar);
        } else {
            if (iVar instanceof p250z.h) {
                list = this.f9264d;
                objA = ((p250z.h) iVar).a();
            } else {
                if (!(iVar instanceof p250z.d)) {
                    if (iVar instanceof p250z.e) {
                        list = this.f9264d;
                        objA = ((p250z.e) iVar).a();
                    } else if (!(iVar instanceof p250z.b)) {
                        if (iVar instanceof p250z.c) {
                            list = this.f9264d;
                            objA = ((p250z.c) iVar).a();
                        } else {
                            if (!(iVar instanceof p250z.a)) {
                                return;
                            }
                            list = this.f9264d;
                            objA = ((p250z.a) iVar).a();
                        }
                    }
                }
                this.f9264d.add(iVar);
            }
            list.remove(objA);
        }
        p250z.i iVar2 = (p250z.i) p097j7.AbstractC6879v.v0(this.f9264d);
        if (p247y7.AbstractC7350t.b(this.f9265e, iVar2)) {
            return;
        }
        if (iVar2 != null) {
            R.g gVar = (R.g) this.f9262b.b();
            if (z6) {
                fA = gVar.c();
            } else if (iVar instanceof p250z.d) {
                fA = gVar.b();
            } else {
                fA = iVar instanceof p250z.b ? gVar.a() : 0.0f;
            }
            bVar = new R.u.a(fA, R.p.d(iVar2), null);
        } else {
            bVar = new R.u.b(R.p.e(this.f9265e), null);
        }
        W8.AbstractC1788i.d(n6, null, null, bVar, 3, null);
        this.f9265e = iVar2;
    }
}
