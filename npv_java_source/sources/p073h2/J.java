package p073h2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class J {

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f45973C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f45974D;

        /* JADX INFO: renamed from: h2.J$a$a, reason: collision with other inner class name */
        public static final class C0529a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f45975C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.p f45976D;

            /* JADX INFO: renamed from: h2.J$a$a$a, reason: collision with other inner class name */
            public static final class C0530a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f45977F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f45978G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                java.lang.Object f45979H;

                public C0530a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f45977F = obj;
                    this.f45978G |= Integer.MIN_VALUE;
                    return h2.J.a.C0529a.this.a(null, this);
                }
            }

            public C0529a(Z8.InterfaceC1870g interfaceC1870g, p237x7.p pVar) {
                this.f45975C = interfaceC1870g;
                this.f45976D = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                h2.J.a.C0529a.C0530a c0530a;
                Z8.InterfaceC1870g interfaceC1870g;
                if (eVar instanceof h2.J.a.C0529a.C0530a) {
                    c0530a = (h2.J.a.C0529a.C0530a) eVar;
                    int i6 = c0530a.f45978G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0530a.f45978G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0530a = new h2.J.a.C0529a.C0530a(eVar);
                    }
                } else {
                    c0530a = new h2.J.a.C0529a.C0530a(eVar);
                }
                java.lang.Object obj2 = c0530a.f45977F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0530a.f45978G;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC1870g = (Z8.InterfaceC1870g) c0530a.f45979H;
                        p087i7.x.b(obj2);
                    } else {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj2);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj2);
                Z8.InterfaceC1870g interfaceC1870g2 = this.f45975C;
                p237x7.p pVar = this.f45976D;
                c0530a.f45979H = interfaceC1870g2;
                c0530a.f45978G = 1;
                java.lang.Object objA = ((p073h2.AbstractC6646x) obj).a(pVar, c0530a);
                if (objA == objG) {
                    return objG;
                }
                obj2 = objA;
                interfaceC1870g = interfaceC1870g2;
                c0530a.f45979H = null;
                c0530a.f45978G = 2;
                if (interfaceC1870g.a(obj2, c0530a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
            this.f45973C = interfaceC1869f;
            this.f45974D = pVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f45973C.b(new h2.J.a.C0529a(interfaceC1870g, this.f45974D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public static final /* synthetic */ p073h2.F a(p073h2.F f6, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(f6, "<this>");
        p247y7.AbstractC7350t.f(pVar, "transform");
        return new p073h2.F(new h2.J.a(f6.b(), pVar), f6.d(), f6.c(), null, 8, null);
    }
}
