package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class X extends androidx.compose.ui.d.c implements p251z0.W, p251z0.K, Y0.e {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.lang.Object f57522P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private java.lang.Object f57523Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.lang.Object[] f57524R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p237x7.p f57525S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private W8.InterfaceC1822z0 f57526T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private p251z0.C7380p f57530X;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p251z0.C7380p f57527U = p251z0.U.f57520a;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final X.b f57528V = new X.b(new z0.X.a[16], 0);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final X.b f57529W = new X.b(new z0.X.a[16], 0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f57531Y = Y0.t.f16230b.a();

    private final class a implements p251z0.InterfaceC7367c, Y0.e, p127m7.e {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p127m7.e f57532C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final /* synthetic */ p251z0.X f57533D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private W8.InterfaceC1794l f57534E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private p251z0.r f57535F = p251z0.r.Main;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final p127m7.i f57536G = p127m7.j.f51198C;

        /* JADX INFO: renamed from: z0.X$a$a, reason: collision with other inner class name */
        static final class C0762a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f57538F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f57539G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f57541I;

            C0762a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f57539G = obj;
                this.f57541I |= Integer.MIN_VALUE;
                return z0.X.a.this.G0(0L, null, this);
            }
        }

        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f57542G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ long f57543H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ z0.X.a f57544I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j6, z0.X.a aVar, p127m7.e eVar) {
                super(2, eVar);
                this.f57543H = j6;
                this.f57544I = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0040  */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                W8.InterfaceC1794l interfaceC1794l;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f57542G;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    interfaceC1794l = this.f57544I.f57534E;
                    if (interfaceC1794l != null) {
                        i7.w.a aVar = p087i7.w.f46751D;
                        interfaceC1794l.t(p087i7.w.b(p087i7.x.a(new p251z0.C7382s(this.f57543H))));
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                long j6 = this.f57543H - 1;
                this.f57542G = 1;
                if (W8.Y.a(j6, this) == objG) {
                    return objG;
                }
                this.f57542G = 2;
                if (W8.Y.a(1L, this) == objG) {
                    return objG;
                }
                interfaceC1794l = this.f57544I.f57534E;
                if (interfaceC1794l != null) {
                    i7.w.a aVar2 = p087i7.w.f46751D;
                    interfaceC1794l.t(p087i7.w.b(p087i7.x.a(new p251z0.C7382s(this.f57543H))));
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((z0.X.a.b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new z0.X.a.b(this.f57543H, this.f57544I, eVar);
            }
        }

        static final class c extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f57545F;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f57547H;

            c(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f57545F = obj;
                this.f57547H |= Integer.MIN_VALUE;
                return z0.X.a.this.P0(0L, null, this);
            }
        }

        public a(p127m7.e eVar) {
            this.f57532C = eVar;
            this.f57533D = p251z0.X.this;
        }

        @Override // Y0.e
        public float B0(float f6) {
            return this.f57533D.B0(f6);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [W8.z0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [W8.z0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [x7.p] */
        @Override // p251z0.InterfaceC7367c
        public java.lang.Object G0(long j6, p237x7.p pVar, p127m7.e eVar) {
            z0.X.a.C0762a c0762a;
            W8.InterfaceC1794l interfaceC1794l;
            if (eVar instanceof z0.X.a.C0762a) {
                c0762a = (z0.X.a.C0762a) eVar;
                int i6 = c0762a.f57541I;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0762a.f57541I = i6 - Integer.MIN_VALUE;
                } else {
                    c0762a = new z0.X.a.C0762a(eVar);
                }
            } else {
                c0762a = new z0.X.a.C0762a(eVar);
            }
            java.lang.Object objU = c0762a.f57539G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = c0762a.f57541I;
            try {
                if (i10 == 0) {
                    p087i7.x.b(objU);
                    if (j6 <= 0 && (interfaceC1794l = this.f57534E) != null) {
                        i7.w.a aVar = p087i7.w.f46751D;
                        interfaceC1794l.t(p087i7.w.b(p087i7.x.a(new p251z0.C7382s(j6))));
                    }
                    W8.InterfaceC1822z0 interfaceC1822z0D = W8.AbstractC1788i.d(p251z0.X.this.t1(), null, null, new z0.X.a.b(j6, this, null), 3, null);
                    c0762a.f57538F = interfaceC1822z0D;
                    c0762a.f57541I = 1;
                    objU = pVar.u(this, c0762a);
                    j6 = interfaceC1822z0D;
                    if (objU == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) c0762a.f57538F;
                    p087i7.x.b(objU);
                    j6 = interfaceC1822z0;
                }
                j6.o(p251z0.C7368d.f57553C);
                return objU;
            } catch (java.lang.Throwable th) {
                j6.o(p251z0.C7368d.f57553C);
                throw th;
            }
        }

        @Override // p251z0.InterfaceC7367c
        public long H0() {
            return p251z0.X.this.H0();
        }

        @Override // Y0.e
        public int K0(long j6) {
            return this.f57533D.K0(j6);
        }

        @Override // p251z0.InterfaceC7367c
        public p251z0.C7380p L() {
            return p251z0.X.this.f57527U;
        }

        public final void M(java.lang.Throwable th) {
            W8.InterfaceC1794l interfaceC1794l = this.f57534E;
            if (interfaceC1794l != null) {
                interfaceC1794l.k(th);
            }
            this.f57534E = null;
        }

        public final void N(p251z0.C7380p c7380p, p251z0.r rVar) {
            W8.InterfaceC1794l interfaceC1794l;
            if (rVar != this.f57535F || (interfaceC1794l = this.f57534E) == null) {
                return;
            }
            this.f57534E = null;
            interfaceC1794l.t(p087i7.w.b(c7380p));
        }

        @Override // Y0.n
        public long O(float f6) {
            return this.f57533D.O(f6);
        }

        @Override // Y0.e
        public long P(long j6) {
            return this.f57533D.P(j6);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p251z0.InterfaceC7367c
        public java.lang.Object P0(long j6, p237x7.p pVar, p127m7.e eVar) {
            z0.X.a.c cVar;
            if (eVar instanceof z0.X.a.c) {
                cVar = (z0.X.a.c) eVar;
                int i6 = cVar.f57547H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    cVar.f57547H = i6 - Integer.MIN_VALUE;
                } else {
                    cVar = new z0.X.a.c(eVar);
                }
            } else {
                cVar = new z0.X.a.c(eVar);
            }
            java.lang.Object objG0 = cVar.f57545F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = cVar.f57547H;
            try {
                if (i10 == 0) {
                    p087i7.x.b(objG0);
                    cVar.f57547H = 1;
                    objG0 = G0(j6, pVar, cVar);
                    if (objG0 == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(objG0);
                }
                return objG0;
            } catch (p251z0.C7382s unused) {
                return null;
            }
        }

        @Override // Y0.e
        public int S0(float f6) {
            return this.f57533D.S0(f6);
        }

        @Override // Y0.n
        public float X(long j6) {
            return this.f57533D.X(j6);
        }

        @Override // p251z0.InterfaceC7367c
        public java.lang.Object X0(p251z0.r rVar, p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f57535F = rVar;
            this.f57534E = c1798n;
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX;
        }

        @Override // p251z0.InterfaceC7367c
        public long a() {
            return p251z0.X.this.f57531Y;
        }

        @Override // Y0.e
        public long b1(long j6) {
            return this.f57533D.b1(j6);
        }

        @Override // Y0.e
        public float g1(long j6) {
            return this.f57533D.g1(j6);
        }

        @Override // p127m7.e
        public p127m7.i getContext() {
            return this.f57536G;
        }

        @Override // Y0.e
        public float getDensity() {
            return this.f57533D.getDensity();
        }

        @Override // p251z0.InterfaceC7367c
        public androidx.compose.ui.platform.A1 getViewConfiguration() {
            return p251z0.X.this.getViewConfiguration();
        }

        @Override // Y0.e
        public long k0(float f6) {
            return this.f57533D.k0(f6);
        }

        @Override // Y0.e
        public float o0(int i6) {
            return this.f57533D.o0(i6);
        }

        @Override // Y0.e
        public float q0(float f6) {
            return this.f57533D.q0(f6);
        }

        @Override // p127m7.e
        public void t(java.lang.Object obj) {
            X.b bVar = p251z0.X.this.f57528V;
            p251z0.X x6 = p251z0.X.this;
            synchronized (bVar) {
                x6.f57528V.A(this);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            this.f57532C.t(obj);
        }

        @Override // Y0.n
        public float v0() {
            return this.f57533D.v0();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57548a;

        static {
            int[] iArr = new int[p251z0.r.values().length];
            try {
                iArr[p251z0.r.Initial.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p251z0.r.Final.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p251z0.r.Main.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f57548a = iArr;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ z0.X.a f57549D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z0.X.a aVar) {
            super(1);
            this.f57549D = aVar;
        }

        public final void a(java.lang.Throwable th) {
            this.f57549D.M(th);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f57550G;

        d(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f57550G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVarX1 = p251z0.X.this.X1();
                p251z0.X x6 = p251z0.X.this;
                this.f57550G = 1;
                if (pVarX1.u(x6, this) == objG) {
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
            return ((z0.X.d) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p251z0.X.this.new d(eVar);
        }
    }

    public X(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, p237x7.p pVar) {
        this.f57522P = obj;
        this.f57523Q = obj2;
        this.f57524R = objArr;
        this.f57525S = pVar;
    }

    private final void W1(p251z0.C7380p c7380p, p251z0.r rVar) {
        X.b bVar;
        int iT;
        synchronized (this.f57528V) {
            X.b bVar2 = this.f57529W;
            bVar2.e(bVar2.t(), this.f57528V);
        }
        try {
            int i6 = z0.X.b.f57548a[rVar.ordinal()];
            if (i6 == 1 || i6 == 2) {
                X.b bVar3 = this.f57529W;
                int iT2 = bVar3.t();
                if (iT2 > 0) {
                    java.lang.Object[] objArrS = bVar3.s();
                    int i10 = 0;
                    do {
                        ((z0.X.a) objArrS[i10]).N(c7380p, rVar);
                        i10++;
                    } while (i10 < iT2);
                }
            } else if (i6 == 3 && (iT = (bVar = this.f57529W).t()) > 0) {
                int i11 = iT - 1;
                java.lang.Object[] objArrS2 = bVar.s();
                do {
                    ((z0.X.a) objArrS2[i11]).N(c7380p, rVar);
                    i11--;
                } while (i11 >= 0);
            }
        } finally {
            this.f57529W.j();
        }
    }

    @Override // Y0.e
    public /* synthetic */ float B0(float f6) {
        return Y0.d.g(this, f6);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        o1();
        super.E1();
    }

    public long H0() {
        long jB1 = b1(getViewConfiguration().e());
        long jA = a();
        return p131n0.n.a(java.lang.Math.max(0.0f, p131n0.m.i(jB1) - Y0.t.g(jA)) / 2.0f, java.lang.Math.max(0.0f, p131n0.m.g(jB1) - Y0.t.f(jA)) / 2.0f);
    }

    @Override // Y0.e
    public /* synthetic */ int K0(long j6) {
        return Y0.d.a(this, j6);
    }

    @Override // Y0.n
    public /* synthetic */ long O(float f6) {
        return Y0.m.b(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ long P(long j6) {
        return Y0.d.e(this, j6);
    }

    @Override // Y0.e
    public /* synthetic */ int S0(float f6) {
        return Y0.d.b(this, f6);
    }

    @Override // p251z0.K
    public java.lang.Object V(p237x7.p pVar, p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        z0.X.a aVar = new z0.X.a(c1798n);
        synchronized (this.f57528V) {
            this.f57528V.d(aVar);
            p127m7.e eVarA = p127m7.g.a(pVar, aVar, aVar);
            i7.w.a aVar2 = p087i7.w.f46751D;
            eVarA.t(p087i7.w.b(p087i7.M.f46721a));
        }
        c1798n.G(new z0.X.c(aVar));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX;
    }

    @Override // Y0.n
    public /* synthetic */ float X(long j6) {
        return Y0.m.a(this, j6);
    }

    public p237x7.p X1() {
        return this.f57525S;
    }

    @Override // F0.v0
    public /* synthetic */ boolean Y0() {
        return F0.u0.d(this);
    }

    public final void Y1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, p237x7.p pVar) {
        boolean z6 = !p247y7.AbstractC7350t.b(this.f57522P, obj);
        this.f57522P = obj;
        if (!p247y7.AbstractC7350t.b(this.f57523Q, obj2)) {
            z6 = true;
        }
        this.f57523Q = obj2;
        java.lang.Object[] objArr2 = this.f57524R;
        if (objArr2 != null && objArr == null) {
            z6 = true;
        }
        if (objArr2 == null && objArr != null) {
            z6 = true;
        }
        boolean z10 = (objArr2 == null || objArr == null || java.util.Arrays.equals(objArr, objArr2)) ? z6 : true;
        this.f57524R = objArr;
        if (z10) {
            o1();
        }
        this.f57525S = pVar;
    }

    public long a() {
        return this.f57531Y;
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    @Override // F0.v0
    public void f1() {
        o1();
    }

    @Override // F0.v0
    public void g0() {
        p251z0.C7380p c7380p = this.f57530X;
        if (c7380p == null) {
            return;
        }
        java.util.List listC = c7380p.c();
        int size = listC.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!(!((p251z0.B) listC.get(i6)).i())) {
                java.util.List listC2 = c7380p.c();
                java.util.ArrayList arrayList = new java.util.ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    p251z0.B b6 = (p251z0.B) listC2.get(i10);
                    arrayList.add(new p251z0.B(b6.f(), b6.o(), b6.h(), false, b6.j(), b6.o(), b6.h(), b6.i(), b6.i(), 0, 0L, 1536, (p247y7.AbstractC7342k) null));
                }
                p251z0.C7380p c7380p2 = new p251z0.C7380p(arrayList);
                this.f57527U = c7380p2;
                W1(c7380p2, p251z0.r.Initial);
                W1(c7380p2, p251z0.r.Main);
                W1(c7380p2, p251z0.r.Final);
                this.f57530X = null;
                return;
            }
        }
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return F0.AbstractC0925k.m(this).K().getDensity();
    }

    @Override // p251z0.K
    public androidx.compose.ui.platform.A1 getViewConfiguration() {
        return F0.AbstractC0925k.m(this).s0();
    }

    @Override // Y0.e
    public /* synthetic */ long k0(float f6) {
        return Y0.d.i(this, f6);
    }

    @Override // F0.v0
    public /* synthetic */ boolean n0() {
        return F0.u0.a(this);
    }

    @Override // Y0.e
    public /* synthetic */ float o0(int i6) {
        return Y0.d.d(this, i6);
    }

    @Override // p251z0.W
    public void o1() {
        W8.InterfaceC1822z0 interfaceC1822z0 = this.f57526T;
        if (interfaceC1822z0 != null) {
            interfaceC1822z0.o(new p251z0.J());
            this.f57526T = null;
        }
    }

    @Override // Y0.e
    public /* synthetic */ float q0(float f6) {
        return Y0.d.c(this, f6);
    }

    @Override // F0.v0
    public void t0() {
        o1();
    }

    @Override // Y0.n
    public float v0() {
        return F0.AbstractC0925k.m(this).K().v0();
    }

    @Override // F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        this.f57531Y = j6;
        if (rVar == p251z0.r.Initial) {
            this.f57527U = c7380p;
        }
        if (this.f57526T == null) {
            this.f57526T = W8.AbstractC1788i.d(t1(), null, W8.P.UNDISPATCHED, new z0.X.d(null), 1, null);
        }
        W1(c7380p, rVar);
        java.util.List listC = c7380p.c();
        int size = listC.size();
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z6 = true;
                break;
            } else if (!p251z0.AbstractC7381q.d((p251z0.B) listC.get(i6))) {
                break;
            } else {
                i6++;
            }
        }
        if (!(!z6)) {
            c7380p = null;
        }
        this.f57530X = c7380p;
    }
}
