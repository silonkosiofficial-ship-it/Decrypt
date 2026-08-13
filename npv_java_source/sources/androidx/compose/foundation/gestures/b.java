package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends F0.AbstractC0927m implements F0.v0, F0.InterfaceC0921h {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p230x.s f19010R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p237x7.l f19011S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19012T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p250z.l f19013U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p237x7.l f19014V = new androidx.compose.foundation.gestures.b.a();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Y8.j f19015W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private p250z.b f19016X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f19017Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private p251z0.W f19018Z;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p251z0.B b6) {
            return (java.lang.Boolean) androidx.compose.foundation.gestures.b.this.j2().l(b6);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    static final class C0361b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19020G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19021H;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19023G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f19024H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19025I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p251z0.K f19026J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p237x7.q f19027K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ p237x7.l f19028L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ p237x7.a f19029M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ p237x7.a f19030N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ p237x7.p f19031O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.gestures.b bVar, p251z0.K k6, p237x7.q qVar, p237x7.l lVar, p237x7.a aVar, p237x7.a aVar2, p237x7.p pVar, p127m7.e eVar) {
                super(2, eVar);
                this.f19025I = bVar;
                this.f19026J = k6;
                this.f19027K = qVar;
                this.f19028L = lVar;
                this.f19029M = aVar;
                this.f19030N = aVar2;
                this.f19031O = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004e  */
            /* JADX WARN: Code duplicated, block: B:25:0x0060  */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                W8.N n6;
                java.util.concurrent.CancellationException e6;
                Y8.j jVar;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19023G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    W8.N n10 = (W8.N) this.f19024H;
                    try {
                        p230x.s sVar = this.f19025I.f19010R;
                        p251z0.K k6 = this.f19026J;
                        p237x7.q qVar = this.f19027K;
                        p237x7.l lVar = this.f19028L;
                        p237x7.a aVar = this.f19029M;
                        p237x7.a aVar2 = this.f19030N;
                        p237x7.p pVar = this.f19031O;
                        this.f19024H = n10;
                        this.f19023G = 1;
                        if (p230x.l.e(k6, qVar, lVar, aVar, aVar2, sVar, pVar, this) == objG) {
                            return objG;
                        }
                    } catch (java.util.concurrent.CancellationException e10) {
                        n6 = n10;
                        e6 = e10;
                        jVar = this.f19025I.f19015W;
                        if (jVar != null) {
                            Y8.n.b(jVar.j(androidx.compose.foundation.gestures.a.C0360a.f19006a));
                        }
                        if (!W8.O.h(n6)) {
                            throw e6;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n6 = (W8.N) this.f19024H;
                    try {
                        p087i7.x.b(obj);
                    } catch (java.util.concurrent.CancellationException e11) {
                        e6 = e11;
                        jVar = this.f19025I.f19015W;
                        if (jVar != null) {
                            Y8.n.b(jVar.j(androidx.compose.foundation.gestures.a.C0360a.f19006a));
                        }
                        if (!W8.O.h(n6)) {
                            throw e6;
                        }
                    }
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((androidx.compose.foundation.gestures.b.C0361b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                androidx.compose.foundation.gestures.b.C0361b.a aVar = new androidx.compose.foundation.gestures.b.C0361b.a(this.f19025I, this.f19026J, this.f19027K, this.f19028L, this.f19029M, this.f19030N, this.f19031O, eVar);
                aVar.f19024H = obj;
                return aVar;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$b, reason: collision with other inner class name */
        static final class C0362b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ A0.d f19032D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19033E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0362b(A0.d dVar, androidx.compose.foundation.gestures.b bVar) {
                super(2);
                this.f19032D = dVar;
                this.f19033E = bVar;
            }

            public final void a(p251z0.B b6, long j6) {
                A0.e.c(this.f19032D, b6);
                Y8.j jVar = this.f19033E.f19015W;
                if (jVar != null) {
                    Y8.n.b(jVar.j(new androidx.compose.foundation.gestures.a.b(j6, null)));
                }
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a((p251z0.B) obj, ((p131n0.g) obj2).v());
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$c */
        static final class c extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19034D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(androidx.compose.foundation.gestures.b bVar) {
                super(0);
                this.f19034D = bVar;
            }

            public final void a() {
                Y8.j jVar = this.f19034D.f19015W;
                if (jVar != null) {
                    Y8.n.b(jVar.j(androidx.compose.foundation.gestures.a.C0360a.f19006a));
                }
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$d */
        static final class d extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ A0.d f19035D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19036E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(A0.d dVar, androidx.compose.foundation.gestures.b bVar) {
                super(1);
                this.f19035D = dVar;
                this.f19036E = bVar;
            }

            public final void a(p251z0.B b6) {
                A0.e.c(this.f19035D, b6);
                float f6 = ((androidx.compose.ui.platform.A1) F0.AbstractC0923i.a(this.f19036E, androidx.compose.ui.platform.AbstractC1966p0.r())).f();
                long jB = this.f19035D.b(Y0.B.a(f6, f6));
                this.f19035D.e();
                Y8.j jVar = this.f19036E.f19015W;
                if (jVar != null) {
                    Y8.n.b(jVar.j(new androidx.compose.foundation.gestures.a.d(p230x.n.l(jB), null)));
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p251z0.B) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$e */
        static final class e extends p247y7.AbstractC7352v implements p237x7.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19037D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ A0.d f19038E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(androidx.compose.foundation.gestures.b bVar, A0.d dVar) {
                super(3);
                this.f19037D = bVar;
                this.f19038E = dVar;
            }

            public final void a(p251z0.B b6, p251z0.B b10, long j6) {
                if (((java.lang.Boolean) this.f19037D.j2().l(b6)).booleanValue()) {
                    if (!this.f19037D.f19017Y) {
                        if (this.f19037D.f19015W == null) {
                            this.f19037D.f19015W = Y8.m.b(Integer.MAX_VALUE, null, null, 6, null);
                        }
                        this.f19037D.s2();
                    }
                    A0.e.c(this.f19038E, b6);
                    long jQ = p131n0.g.q(b10.h(), j6);
                    Y8.j jVar = this.f19037D.f19015W;
                    if (jVar != null) {
                        Y8.n.b(jVar.j(new androidx.compose.foundation.gestures.a.c(jQ, null)));
                    }
                }
            }

            @Override // p237x7.q
            public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                a((p251z0.B) obj, (p251z0.B) obj2, ((p131n0.g) obj3).v());
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$f */
        static final class f extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19039D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(androidx.compose.foundation.gestures.b bVar) {
                super(0);
                this.f19039D = bVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean b() {
                return java.lang.Boolean.valueOf(!this.f19039D.r2());
            }
        }

        C0361b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19020G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f19021H;
                A0.d dVar = new A0.d();
                androidx.compose.foundation.gestures.b.C0361b.a aVar = new androidx.compose.foundation.gestures.b.C0361b.a(androidx.compose.foundation.gestures.b.this, k6, new androidx.compose.foundation.gestures.b.C0361b.e(androidx.compose.foundation.gestures.b.this, dVar), new androidx.compose.foundation.gestures.b.C0361b.d(dVar, androidx.compose.foundation.gestures.b.this), new androidx.compose.foundation.gestures.b.C0361b.c(androidx.compose.foundation.gestures.b.this), new androidx.compose.foundation.gestures.b.C0361b.f(androidx.compose.foundation.gestures.b.this), new androidx.compose.foundation.gestures.b.C0361b.C0362b(dVar, androidx.compose.foundation.gestures.b.this), null);
                this.f19020G = 1;
                if (W8.O.f(aVar, this) == objG) {
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
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((androidx.compose.foundation.gestures.b.C0361b) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.b.C0361b c0361b = androidx.compose.foundation.gestures.b.this.new C0361b(eVar);
            c0361b.f19021H = obj;
            return c0361b;
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f19040F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19041G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f19043I;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19041G = obj;
            this.f19043I |= Integer.MIN_VALUE;
            return androidx.compose.foundation.gestures.b.this.o2(this);
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f19044F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f19045G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f19046H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19047I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f19049K;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19047I = obj;
            this.f19049K |= Integer.MIN_VALUE;
            return androidx.compose.foundation.gestures.b.this.p2(null, this);
        }
    }

    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f19050F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f19051G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19052H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f19054J;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19052H = obj;
            this.f19054J |= Integer.MIN_VALUE;
            return androidx.compose.foundation.gestures.b.this.q2(null, this);
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f19055G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f19056H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f19057I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19058J;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f19060G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f19061H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            /* synthetic */ java.lang.Object f19062I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p247y7.O f19063J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f19064K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p247y7.O o6, androidx.compose.foundation.gestures.b bVar, p127m7.e eVar) {
                super(2, eVar);
                this.f19063J = o6;
                this.f19064K = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p237x7.l lVar;
                java.lang.Object obj2;
                androidx.compose.foundation.gestures.a aVar;
                p247y7.O o6;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19061H;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    lVar = (p237x7.l) this.f19062I;
                    obj2 = this.f19063J.f57254C;
                    if (!(obj2 instanceof androidx.compose.foundation.gestures.a.d) || (obj2 instanceof androidx.compose.foundation.gestures.a.C0360a)) {
                        return p087i7.M.f46721a;
                    }
                    aVar = null;
                    androidx.compose.foundation.gestures.a.b bVar = obj2 instanceof androidx.compose.foundation.gestures.a.b ? (androidx.compose.foundation.gestures.a.b) obj2 : null;
                    if (bVar != null) {
                        lVar.l(bVar);
                    }
                    o6 = this.f19063J;
                    Y8.j jVar = this.f19064K.f19015W;
                    if (jVar != null) {
                        this.f19062I = lVar;
                        this.f19060G = o6;
                        this.f19061H = 1;
                        obj = jVar.b(this);
                        if (obj == objG) {
                            return objG;
                        }
                    }
                    o6.f57254C = aVar;
                    obj2 = this.f19063J.f57254C;
                    if (obj2 instanceof androidx.compose.foundation.gestures.a.d) {
                    }
                    return p087i7.M.f46721a;
                }
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o6 = (p247y7.O) this.f19060G;
                lVar = (p237x7.l) this.f19062I;
                p087i7.x.b(obj);
                aVar = (androidx.compose.foundation.gestures.a) obj;
                o6.f57254C = aVar;
                obj2 = this.f19063J.f57254C;
                if (obj2 instanceof androidx.compose.foundation.gestures.a.d) {
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p237x7.l lVar, p127m7.e eVar) {
                return ((androidx.compose.foundation.gestures.b.f.a) x(lVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                androidx.compose.foundation.gestures.b.f.a aVar = new androidx.compose.foundation.gestures.b.f.a(this.f19063J, this.f19064K, eVar);
                aVar.f19062I = obj;
                return aVar;
            }
        }

        f(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005e A[PHI: r4
  0x005e: PHI (r4v7 W8.N) = (r4v0 W8.N), (r4v3 W8.N), (r4v3 W8.N), (r4v3 W8.N), (r4v5 W8.N), (r4v8 W8.N) binds: [B:18:0x0056, B:45:0x00db, B:47:0x00ea, B:41:0x00d4, B:30:0x008d, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:25:0x0080 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0081  */
        /* JADX WARN: Code duplicated, block: B:28:0x0085  */
        /* JADX WARN: Code duplicated, block: B:31:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00dd A[Catch: CancellationException -> 0x00d7, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00ec A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00db -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ea -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fa -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00a3
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.foundation.gestures.b.f) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.b.f fVar = androidx.compose.foundation.gestures.b.this.new f(eVar);
            fVar.f19058J = obj;
            return fVar;
        }
    }

    public b(p237x7.l lVar, boolean z6, p250z.l lVar2, p230x.s sVar) {
        this.f19010R = sVar;
        this.f19011S = lVar;
        this.f19012T = z6;
        this.f19013U = lVar2;
    }

    private final p251z0.W l2() {
        return p251z0.U.a(new androidx.compose.foundation.gestures.b.C0361b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o2(p127m7.e eVar) {
        androidx.compose.foundation.gestures.b.c cVar;
        androidx.compose.foundation.gestures.b bVar;
        if (eVar instanceof androidx.compose.foundation.gestures.b.c) {
            cVar = (androidx.compose.foundation.gestures.b.c) eVar;
            int i6 = cVar.f19043I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f19043I = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new androidx.compose.foundation.gestures.b.c(eVar);
            }
        } else {
            cVar = new androidx.compose.foundation.gestures.b.c(eVar);
        }
        java.lang.Object obj = cVar.f19041G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f19043I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p250z.b bVar2 = this.f19016X;
            if (bVar2 != null) {
                p250z.l lVar = this.f19013U;
                if (lVar != null) {
                    p250z.a aVar = new p250z.a(bVar2);
                    cVar.f19040F = this;
                    cVar.f19043I = 1;
                    if (lVar.c(aVar, cVar) == objG) {
                        return objG;
                    }
                }
                bVar = this;
            } else {
                bVar = this;
            }
            bVar.n2(Y0.A.f16198b.a());
            return p087i7.M.f46721a;
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = (androidx.compose.foundation.gestures.b) cVar.f19040F;
        p087i7.x.b(obj);
        bVar.f19016X = null;
        bVar.n2(Y0.A.f16198b.a());
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p2(androidx.compose.foundation.gestures.a.c cVar, p127m7.e eVar) {
        androidx.compose.foundation.gestures.b.d dVar;
        androidx.compose.foundation.gestures.b bVar;
        p250z.l lVar;
        p250z.b bVar2;
        androidx.compose.foundation.gestures.a.c cVar2;
        p250z.b bVar3;
        androidx.compose.foundation.gestures.b bVar4;
        if (eVar instanceof androidx.compose.foundation.gestures.b.d) {
            dVar = (androidx.compose.foundation.gestures.b.d) eVar;
            int i6 = dVar.f19049K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f19049K = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new androidx.compose.foundation.gestures.b.d(eVar);
            }
        } else {
            dVar = new androidx.compose.foundation.gestures.b.d(eVar);
        }
        java.lang.Object obj = dVar.f19047I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar.f19049K;
        if (i10 != 0) {
            if (i10 == 1) {
                cVar = (androidx.compose.foundation.gestures.a.c) dVar.f19045G;
                bVar = (androidx.compose.foundation.gestures.b) dVar.f19044F;
                p087i7.x.b(obj);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar3 = (p250z.b) dVar.f19046H;
                cVar2 = (androidx.compose.foundation.gestures.a.c) dVar.f19045G;
                bVar4 = (androidx.compose.foundation.gestures.b) dVar.f19044F;
                p087i7.x.b(obj);
            }
            bVar2 = bVar3;
            bVar = bVar4;
            cVar = cVar2;
            bVar.f19016X = bVar2;
            bVar.m2(cVar.a());
            return p087i7.M.f46721a;
        }
        p087i7.x.b(obj);
        p250z.b bVar5 = this.f19016X;
        if (bVar5 != null && (lVar = this.f19013U) != null) {
            p250z.a aVar = new p250z.a(bVar5);
            dVar.f19044F = this;
            dVar.f19045G = cVar;
            dVar.f19049K = 1;
            if (lVar.c(aVar, dVar) == objG) {
                return objG;
            }
        }
        bVar = this;
        bVar2 = new p250z.b();
        p250z.l lVar2 = bVar.f19013U;
        if (lVar2 != null) {
            dVar.f19044F = bVar;
            dVar.f19045G = cVar;
            dVar.f19046H = bVar2;
            dVar.f19049K = 2;
            if (lVar2.c(bVar2, dVar) == objG) {
                return objG;
            }
            cVar2 = cVar;
            bVar3 = bVar2;
            bVar4 = bVar;
            bVar2 = bVar3;
            bVar = bVar4;
            cVar = cVar2;
        }
        bVar.f19016X = bVar2;
        bVar.m2(cVar.a());
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q2(androidx.compose.foundation.gestures.a.d dVar, p127m7.e eVar) {
        androidx.compose.foundation.gestures.b.e eVar2;
        androidx.compose.foundation.gestures.b bVar;
        if (eVar instanceof androidx.compose.foundation.gestures.b.e) {
            eVar2 = (androidx.compose.foundation.gestures.b.e) eVar;
            int i6 = eVar2.f19054J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar2.f19054J = i6 - Integer.MIN_VALUE;
            } else {
                eVar2 = new androidx.compose.foundation.gestures.b.e(eVar);
            }
        } else {
            eVar2 = new androidx.compose.foundation.gestures.b.e(eVar);
        }
        java.lang.Object obj = eVar2.f19052H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = eVar2.f19054J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p250z.b bVar2 = this.f19016X;
            if (bVar2 != null) {
                p250z.l lVar = this.f19013U;
                if (lVar != null) {
                    p250z.c cVar = new p250z.c(bVar2);
                    eVar2.f19050F = this;
                    eVar2.f19051G = dVar;
                    eVar2.f19054J = 1;
                    if (lVar.c(cVar, eVar2) == objG) {
                        return objG;
                    }
                }
                bVar = this;
            } else {
                bVar = this;
            }
            bVar.n2(dVar.a());
            return p087i7.M.f46721a;
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (androidx.compose.foundation.gestures.a.d) eVar2.f19051G;
        bVar = (androidx.compose.foundation.gestures.b) eVar2.f19050F;
        p087i7.x.b(obj);
        bVar.f19016X = null;
        bVar.n2(dVar.a());
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2() {
        this.f19017Y = true;
        W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.gestures.b.f(null), 3, null);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        this.f19017Y = false;
        h2();
    }

    @Override // F0.v0
    public /* synthetic */ boolean Y0() {
        return F0.u0.d(this);
    }

    @Override // F0.v0
    public /* synthetic */ void f1() {
        F0.u0.c(this);
    }

    @Override // F0.v0
    public void g0() {
        p251z0.W w6 = this.f19018Z;
        if (w6 != null) {
            w6.g0();
        }
    }

    public final void h2() {
        p250z.b bVar = this.f19016X;
        if (bVar != null) {
            p250z.l lVar = this.f19013U;
            if (lVar != null) {
                lVar.a(new p250z.a(bVar));
            }
            this.f19016X = null;
        }
    }

    public abstract java.lang.Object i2(p237x7.p pVar, p127m7.e eVar);

    protected final p237x7.l j2() {
        return this.f19011S;
    }

    protected final boolean k2() {
        return this.f19012T;
    }

    public abstract void m2(long j6);

    @Override // F0.v0
    public /* synthetic */ boolean n0() {
        return F0.u0.a(this);
    }

    public abstract void n2(long j6);

    public abstract boolean r2();

    @Override // F0.v0
    public /* synthetic */ void t0() {
        F0.u0.b(this);
    }

    public final void t2(p237x7.l lVar, boolean z6, p250z.l lVar2, p230x.s sVar, boolean z10) {
        p251z0.W w6;
        this.f19011S = lVar;
        boolean z11 = true;
        if (this.f19012T != z6) {
            this.f19012T = z6;
            if (!z6) {
                h2();
                p251z0.W w10 = this.f19018Z;
                if (w10 != null) {
                    W1(w10);
                }
                this.f19018Z = null;
            }
            z10 = true;
        }
        if (!p247y7.AbstractC7350t.b(this.f19013U, lVar2)) {
            h2();
            this.f19013U = lVar2;
        }
        if (this.f19010R != sVar) {
            this.f19010R = sVar;
        } else {
            z11 = z10;
        }
        if (!z11 || (w6 = this.f19018Z) == null) {
            return;
        }
        w6.o1();
    }

    @Override // F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        if (this.f19012T && this.f19018Z == null) {
            this.f19018Z = (p251z0.W) T1(l2());
        }
        p251z0.W w6 = this.f19018Z;
        if (w6 != null) {
            w6.w0(c7380p, rVar, j6);
        }
    }
}
