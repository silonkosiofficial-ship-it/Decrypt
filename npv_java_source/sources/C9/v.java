package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f1552h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C9.C0855i f1555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z8.InterfaceC1869f f1556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z8.InterfaceC1869f f1557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z8.InterfaceC1869f f1558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Z8.InterfaceC1869f f1559g;

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1560C;

        /* JADX INFO: renamed from: C9.v$a$a, reason: collision with other inner class name */
        public static final class C0029a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1561C;

            /* JADX INFO: renamed from: C9.v$a$a$a, reason: collision with other inner class name */
            public static final class C0030a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1562F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1563G;

                public C0030a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1562F = obj;
                    this.f1563G |= Integer.MIN_VALUE;
                    return C9.v.a.C0029a.this.a(null, this);
                }
            }

            public C0029a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1561C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.v.a.C0029a.C0030a c0030a;
                if (eVar instanceof C9.v.a.C0029a.C0030a) {
                    c0030a = (C9.v.a.C0029a.C0030a) eVar;
                    int i6 = c0030a.f1563G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0030a.f1563G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0030a = new C9.v.a.C0029a.C0030a(eVar);
                    }
                } else {
                    c0030a = new C9.v.a.C0029a.C0030a(eVar);
                }
                java.lang.Object obj2 = c0030a.f1562F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0030a.f1563G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1561C;
                    java.lang.Integer numC = p147o7.b.c(((java.util.List) obj).size());
                    c0030a.f1563G = 1;
                    if (interfaceC1870g.a(numC, c0030a) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj2);
                }
                return p087i7.M.f46721a;
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1560C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1560C.b(new C9.v.a.C0029a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public v() {
        C9.C0855i c0855i = new C9.C0855i();
        this.f1555c = c0855i;
        this.f1556d = c0855i.c();
        this.f1557e = c0855i.d();
        this.f1558f = c0855i.j();
        this.f1559g = new C9.v.a(c0855i.b());
    }

    public final Z8.InterfaceC1869f a() {
        return this.f1557e;
    }

    public final C9.C0855i b() {
        return this.f1555c;
    }

    public final void c() {
        if (this.f1554b) {
            C9.C0855i.n(this.f1555c, null, 1, null);
        }
    }

    public final void d(androidx.lifecycle.r rVar, androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(rVar, "lifecycleOwner");
        p247y7.AbstractC7350t.f(y6, "viewModelStoreOwner");
        if (this.f1554b) {
            return;
        }
        this.f1554b = true;
        this.f1555c.l(rVar, y6);
    }

    public final void e(java.lang.String str, C9.u uVar) {
        p247y7.AbstractC7350t.f(str, "route");
        if (this.f1554b) {
            this.f1555c.p(str, uVar);
        } else {
            this.f1553a = str;
        }
    }

    public final void f(C9.I i6) {
        p247y7.AbstractC7350t.f(i6, "routeGraph");
        this.f1555c.r(i6);
        java.lang.String str = this.f1553a;
        if (str != null) {
            C9.C0855i.q(this.f1555c, str, null, 2, null);
            this.f1553a = null;
        }
    }
}
