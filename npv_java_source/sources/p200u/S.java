package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54731f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f54732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X.b f54733b = new X.b(new u.S.a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54734c = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54735d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54736e = V.A1.d(java.lang.Boolean.TRUE, null, 2, null);

    public final class a implements V.G1 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.lang.Object f54737C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.lang.Object f54738D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final p200u.x0 f54739E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final java.lang.String f54740F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final V.InterfaceC1753w0 f54741G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private p200u.InterfaceC7175j f54742H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private p200u.r0 f54743I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private boolean f54744J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private boolean f54745K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private long f54746L;

        public a(java.lang.Object obj, java.lang.Object obj2, p200u.x0 x0Var, p200u.InterfaceC7175j interfaceC7175j, java.lang.String str) {
            this.f54737C = obj;
            this.f54738D = obj2;
            this.f54739E = x0Var;
            this.f54740F = str;
            this.f54741G = V.A1.d(obj, null, 2, null);
            this.f54742H = interfaceC7175j;
            this.f54743I = new p200u.r0(this.f54742H, x0Var, this.f54737C, this.f54738D, null, 16, null);
        }

        public final java.lang.Object e() {
            return this.f54737C;
        }

        public final java.lang.Object g() {
            return this.f54738D;
        }

        @Override // V.G1
        public java.lang.Object getValue() {
            return this.f54741G.getValue();
        }

        public final boolean n() {
            return this.f54744J;
        }

        public final void o(long j6) {
            p200u.S.this.l(false);
            if (this.f54745K) {
                this.f54745K = false;
                this.f54746L = j6;
            }
            long j10 = j6 - this.f54746L;
            r(this.f54743I.f(j10));
            this.f54744J = this.f54743I.e(j10);
        }

        public final void q() {
            this.f54745K = true;
        }

        public void r(java.lang.Object obj) {
            this.f54741G.setValue(obj);
        }

        public final void s() {
            r(this.f54743I.g());
            this.f54745K = true;
        }

        public final void t(java.lang.Object obj, java.lang.Object obj2, p200u.InterfaceC7175j interfaceC7175j) {
            this.f54737C = obj;
            this.f54738D = obj2;
            this.f54742H = interfaceC7175j;
            this.f54743I = new p200u.r0(interfaceC7175j, this.f54739E, obj, obj2, null, 16, null);
            p200u.S.this.l(true);
            this.f54744J = false;
            this.f54745K = true;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54748G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f54749H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f54750I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f54751J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p200u.S f54752K;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1753w0 f54753D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p200u.S f54754E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p247y7.L f54755F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ W8.N f54756G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.InterfaceC1753w0 interfaceC1753w0, p200u.S s6, p247y7.L l6, W8.N n6) {
                super(1);
                this.f54753D = interfaceC1753w0;
                this.f54754E = s6;
                this.f54755F = l6;
                this.f54756G = n6;
            }

            public final void a(long j6) {
                V.G1 g6 = (V.G1) this.f54753D.getValue();
                long jLongValue = g6 != null ? ((java.lang.Number) g6.getValue()).longValue() : j6;
                int i6 = 0;
                if (this.f54754E.f54735d == Long.MIN_VALUE || this.f54755F.f57251C != p200u.AbstractC7190q0.n(this.f54756G.getCoroutineContext())) {
                    this.f54754E.f54735d = j6;
                    X.b bVar = this.f54754E.f54733b;
                    int iT = bVar.t();
                    if (iT > 0) {
                        java.lang.Object[] objArrS = bVar.s();
                        int i10 = 0;
                        do {
                            ((u.S.a) objArrS[i10]).q();
                            i10++;
                        } while (i10 < iT);
                    }
                    this.f54755F.f57251C = p200u.AbstractC7190q0.n(this.f54756G.getCoroutineContext());
                }
                if (this.f54755F.f57251C != 0.0f) {
                    this.f54754E.i((long) ((jLongValue - this.f54754E.f54735d) / this.f54755F.f57251C));
                    return;
                }
                X.b bVar2 = this.f54754E.f54733b;
                int iT2 = bVar2.t();
                if (iT2 > 0) {
                    java.lang.Object[] objArrS2 = bVar2.s();
                    do {
                        ((u.S.a) objArrS2[i6]).s();
                        i6++;
                    } while (i6 < iT2);
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((java.lang.Number) obj).longValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: u.S$b$b, reason: collision with other inner class name */
        static final class C0715b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ W8.N f54757D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0715b(W8.N n6) {
                super(0);
                this.f54757D = n6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float b() {
                return java.lang.Float.valueOf(p200u.AbstractC7190q0.n(this.f54757D.getCoroutineContext()));
            }
        }

        static final class c extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f54758G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ float f54759H;

            c(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f54758G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return p147o7.b.a(this.f54759H > 0.0f);
            }

            public final java.lang.Object H(float f6, p127m7.e eVar) {
                return ((u.S.b.c) x(java.lang.Float.valueOf(f6), eVar)).B(p087i7.M.f46721a);
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return H(((java.lang.Number) obj).floatValue(), (p127m7.e) obj2);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                u.S.b.c cVar = new u.S.b.c(eVar);
                cVar.f54759H = ((java.lang.Number) obj).floatValue();
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.InterfaceC1753w0 interfaceC1753w0, p200u.S s6, p127m7.e eVar) {
            super(2, eVar);
            this.f54751J = interfaceC1753w0;
            this.f54752K = s6;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0055 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x005d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0078 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r7.f54749H
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f54748G
                y7.L r1 = (p247y7.L) r1
                java.lang.Object r4 = r7.f54750I
                W8.N r4 = (W8.N) r4
                p087i7.x.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f54748G
                y7.L r1 = (p247y7.L) r1
                java.lang.Object r4 = r7.f54750I
                W8.N r4 = (W8.N) r4
                p087i7.x.b(r8)
                r8 = r4
                goto L56
            L30:
                p087i7.x.b(r8)
                java.lang.Object r8 = r7.f54750I
                W8.N r8 = (W8.N) r8
                y7.L r1 = new y7.L
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f57251C = r4
            L40:
                u.S$b$a r4 = new u.S$b$a
                V.w0 r5 = r7.f54751J
                u.S r6 = r7.f54752K
                r4.<init>(r5, r6, r1, r8)
                r7.f54750I = r8
                r7.f54748G = r1
                r7.f54749H = r3
                java.lang.Object r4 = p200u.P.a(r4, r7)
                if (r4 != r0) goto L56
                return r0
            L56:
                float r4 = r1.f57251C
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                u.S$b$b r4 = new u.S$b$b
                r4.<init>(r8)
                Z8.f r4 = V.v1.o(r4)
                u.S$b$c r5 = new u.S$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f54750I = r8
                r7.f54748G = r1
                r7.f54749H = r2
                java.lang.Object r4 = Z8.AbstractC1871h.v(r4, r5, r7)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u.S.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((u.S.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            u.S.b bVar = new u.S.b(this.f54751J, this.f54752K, eVar);
            bVar.f54750I = obj;
            return bVar;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f54761E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i6) {
            super(2);
            this.f54761E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p200u.S.this.k(interfaceC1734n, V.S0.a(this.f54761E | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public S(java.lang.String str) {
        this.f54732a = str;
    }

    private final boolean g() {
        return ((java.lang.Boolean) this.f54734c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((java.lang.Boolean) this.f54736e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j6) {
        boolean z6;
        X.b bVar = this.f54733b;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            z6 = true;
            int i6 = 0;
            do {
                u.S.a aVar = (u.S.a) objArrS[i6];
                if (!aVar.n()) {
                    aVar.o(j6);
                }
                if (!aVar.n()) {
                    z6 = false;
                }
                i6++;
            } while (i6 < iT);
        } else {
            z6 = true;
        }
        m(!z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z6) {
        this.f54734c.setValue(java.lang.Boolean.valueOf(z6));
    }

    private final void m(boolean z6) {
        this.f54736e.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void f(u.S.a aVar) {
        this.f54733b.d(aVar);
        l(true);
    }

    public final void j(u.S.a aVar) {
        this.f54733b.A(aVar);
    }

    public final void k(V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-318043801);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(this) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i10 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-318043801, i10, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            java.lang.Object objG = interfaceC1734nR.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                objG = V.A1.d(null, null, 2, null);
                interfaceC1734nR.K(objG);
            }
            V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
            if (h() || g()) {
                interfaceC1734nR.T(1719915818);
                boolean zL = interfaceC1734nR.l(this);
                java.lang.Object objG2 = interfaceC1734nR.g();
                if (zL || objG2 == aVar.a()) {
                    objG2 = new u.S.b(interfaceC1753w0, this, null);
                    interfaceC1734nR.K(objG2);
                }
                V.Q.e(this, (p237x7.p) objG2, interfaceC1734nR, i10 & 14);
            } else {
                interfaceC1734nR.T(1721436120);
            }
            interfaceC1734nR.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new u.S.c(i6));
        }
    }
}
