package C9;

/* JADX INFO: loaded from: classes2.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y8.j f1380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W8.InterfaceC1822z0 f1381c;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1382G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1383H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ C9.A f1384I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, C9.A a6, p127m7.e eVar) {
            super(2, eVar);
            this.f1383H = pVar;
            this.f1384I = a6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f1382G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVar = this.f1383H;
                Z8.InterfaceC1869f interfaceC1869fM = Z8.AbstractC1871h.m(this.f1384I.c());
                this.f1382G = 1;
                if (pVar.u(interfaceC1869fM, this) == objG) {
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
            return ((C9.A.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new C9.A.a(this.f1383H, this.f1384I, eVar);
        }
    }

    public A(W8.N n6, boolean z6, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(n6, "scope");
        p247y7.AbstractC7350t.f(pVar, "onBack");
        this.f1379a = z6;
        this.f1380b = Y8.m.b(-2, Y8.EnumC1863d.SUSPEND, null, 4, null);
        this.f1381c = W8.AbstractC1788i.d(n6, null, null, new C9.A.a(pVar, this, null), 3, null);
    }

    public final void a() {
        this.f1380b.o(new java.util.concurrent.CancellationException("onBack cancelled"));
        W8.InterfaceC1822z0.a.a(this.f1381c, null, 1, null);
    }

    public final boolean b() {
        return Y8.C.a.a(this.f1380b, null, 1, null);
    }

    public final Y8.j c() {
        return this.f1380b;
    }

    public final boolean d() {
        return this.f1379a;
    }

    public final java.lang.Object e(float f6) {
        return this.f1380b.j(java.lang.Float.valueOf(f6));
    }
}
