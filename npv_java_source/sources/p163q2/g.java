package p163q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f53063C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p143o2.n f53064D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f53065E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.l f53066F;

        /* JADX INFO: renamed from: q2.g$a$a, reason: collision with other inner class name */
        public static final class C0688a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f53067C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p143o2.n f53068D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ boolean f53069E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p237x7.l f53070F;

            /* JADX INFO: renamed from: q2.g$a$a$a, reason: collision with other inner class name */
            public static final class C0689a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f53071F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f53072G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                java.lang.Object f53073H;

                public C0689a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f53071F = obj;
                    this.f53072G |= Integer.MIN_VALUE;
                    return q2.g.a.C0688a.this.a(null, this);
                }
            }

            public C0688a(Z8.InterfaceC1870g interfaceC1870g, p143o2.n nVar, boolean z6, p237x7.l lVar) {
                this.f53067C = interfaceC1870g;
                this.f53068D = nVar;
                this.f53069E = z6;
                this.f53070F = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                q2.g.a.C0688a.C0689a c0689a;
                Z8.InterfaceC1870g interfaceC1870g;
                if (eVar instanceof q2.g.a.C0688a.C0689a) {
                    c0689a = (q2.g.a.C0688a.C0689a) eVar;
                    int i6 = c0689a.f53072G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0689a.f53072G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0689a = new q2.g.a.C0688a.C0689a(eVar);
                    }
                } else {
                    c0689a = new q2.g.a.C0688a.C0689a(eVar);
                }
                java.lang.Object obj2 = c0689a.f53071F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0689a.f53072G;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC1870g = (Z8.InterfaceC1870g) c0689a.f53073H;
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
                Z8.InterfaceC1870g interfaceC1870g2 = this.f53067C;
                p143o2.n nVar = this.f53068D;
                boolean z6 = this.f53069E;
                p237x7.l lVar = this.f53070F;
                c0689a.f53073H = interfaceC1870g2;
                c0689a.f53072G = 1;
                java.lang.Object objD = p223w2.b.d(nVar, true, z6, lVar, c0689a);
                if (objD == objG) {
                    return objG;
                }
                obj2 = objD;
                interfaceC1870g = interfaceC1870g2;
                c0689a.f53073H = null;
                c0689a.f53072G = 2;
                if (interfaceC1870g.a(obj2, c0689a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f, p143o2.n nVar, boolean z6, p237x7.l lVar) {
            this.f53063C = interfaceC1869f;
            this.f53064D = nVar;
            this.f53065E = z6;
            this.f53066F = lVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f53063C.b(new q2.g.a.C0688a(interfaceC1870g, this.f53064D, this.f53065E, this.f53066F), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public static final Z8.InterfaceC1869f a(p143o2.n nVar, boolean z6, java.lang.String[] strArr, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(nVar, "db");
        p247y7.AbstractC7350t.f(strArr, "tableNames");
        p247y7.AbstractC7350t.f(lVar, "block");
        return new q2.g.a(Z8.AbstractC1871h.l(nVar.r().g((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), true)), nVar, z6, lVar);
    }
}
