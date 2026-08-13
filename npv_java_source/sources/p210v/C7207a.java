package p210v;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7207a implements p210v.T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p131n0.g f55649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p210v.C7228w f55650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f55654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p251z0.A f55655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.compose.ui.d f55656h;

    /* JADX INFO: renamed from: v.a$a, reason: collision with other inner class name */
    static final class C0727a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f55657F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        long f55658G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f55659H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f55661J;

        C0727a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f55659H = obj;
            this.f55661J |= Integer.MIN_VALUE;
            return p210v.C7207a.this.b(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: v.a$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55662G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f55663H;

        /* JADX INFO: renamed from: v.a$b$a, reason: collision with other inner class name */
        static final class C0728a extends p147o7.k implements p237x7.p {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            int f55665E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f55666F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p210v.C7207a f55667G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0728a(p210v.C7207a c7207a, p127m7.e eVar) {
                super(2, eVar);
                this.f55667G = c7207a;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0099  */
            /* JADX WARN: Code duplicated, block: B:28:0x00af A[LOOP:1: B:24:0x0097->B:28:0x00af, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:30:0x00b3 BREAK  A[LOOP:1: B:24:0x0097->B:28:0x00af], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p210v.C7207a.b.C0728a.B(java.lang.Object):java.lang.Object");
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
                return ((p210v.C7207a.b.C0728a) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p210v.C7207a.b.C0728a c0728a = new p210v.C7207a.b.C0728a(this.f55667G, eVar);
                c0728a.f55666F = obj;
                return c0728a;
            }
        }

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f55662G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f55663H;
                p210v.C7207a.b.C0728a c0728a = new p210v.C7207a.b.C0728a(p210v.C7207a.this, null);
                this.f55662G = 1;
                if (p230x.q.c(k6, c0728a, this) == objG) {
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
            return ((p210v.C7207a.b) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p210v.C7207a.b bVar = p210v.C7207a.this.new b(eVar);
            bVar.f55663H = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: v.a$c */
    public static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        public c() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: v.a$d */
    public static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        public d() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    public C7207a(android.content.Context context, p210v.Q q6) {
        androidx.compose.ui.d c7221o;
        p210v.C7228w c7228w = new p210v.C7228w(context, p141o0.A0.k(q6.b()));
        this.f55650b = c7228w;
        p087i7.M m6 = p087i7.M.f46721a;
        this.f55651c = V.v1.h(m6, V.v1.j());
        this.f55652d = true;
        this.f55654f = p131n0.m.f51333b.b();
        androidx.compose.ui.d dVarD = p251z0.U.d(androidx.compose.ui.d.f19586a, m6, new p210v.C7207a.b(null));
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            c7221o = new p210v.C7226u(this, c7228w, androidx.compose.ui.platform.E0.b() ? new p210v.C7207a.c() : androidx.compose.ui.platform.E0.a());
        } else {
            c7221o = new p210v.C7221o(this, c7228w, q6, androidx.compose.ui.platform.E0.b() ? new p210v.C7207a.d() : androidx.compose.ui.platform.E0.a());
        }
        this.f55656h = dVarD.b(c7221o);
    }

    private final void h() {
        boolean zIsFinished;
        p210v.C7228w c7228w = this.f55650b;
        android.widget.EdgeEffect edgeEffect = c7228w.f55730d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        android.widget.EdgeEffect edgeEffect2 = c7228w.f55731e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        android.widget.EdgeEffect edgeEffect3 = c7228w.f55732f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        android.widget.EdgeEffect edgeEffect4 = c7228w.f55733g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            k();
        }
    }

    private final float l(long j6) {
        float fM = p131n0.g.m(i());
        float fN = p131n0.g.n(j6) / p131n0.m.g(this.f55654f);
        android.widget.EdgeEffect edgeEffectF = this.f55650b.f();
        p210v.C7227v c7227v = p210v.C7227v.f55726a;
        return c7227v.b(edgeEffectF) == 0.0f ? (-c7227v.d(edgeEffectF, -fN, 1 - fM)) * p131n0.m.g(this.f55654f) : p131n0.g.n(j6);
    }

    private final float m(long j6) {
        float fN = p131n0.g.n(i());
        float fM = p131n0.g.m(j6) / p131n0.m.i(this.f55654f);
        android.widget.EdgeEffect edgeEffectH = this.f55650b.h();
        p210v.C7227v c7227v = p210v.C7227v.f55726a;
        return c7227v.b(edgeEffectH) == 0.0f ? c7227v.d(edgeEffectH, fM, 1 - fN) * p131n0.m.i(this.f55654f) : p131n0.g.m(j6);
    }

    private final float n(long j6) {
        float fN = p131n0.g.n(i());
        float fM = p131n0.g.m(j6) / p131n0.m.i(this.f55654f);
        android.widget.EdgeEffect edgeEffectJ = this.f55650b.j();
        p210v.C7227v c7227v = p210v.C7227v.f55726a;
        return c7227v.b(edgeEffectJ) == 0.0f ? (-c7227v.d(edgeEffectJ, -fM, fN)) * p131n0.m.i(this.f55654f) : p131n0.g.m(j6);
    }

    private final float o(long j6) {
        float fM = p131n0.g.m(i());
        float fN = p131n0.g.n(j6) / p131n0.m.g(this.f55654f);
        android.widget.EdgeEffect edgeEffectL = this.f55650b.l();
        p210v.C7227v c7227v = p210v.C7227v.f55726a;
        return c7227v.b(edgeEffectL) == 0.0f ? c7227v.d(edgeEffectL, fN, fM) * p131n0.m.g(this.f55654f) : p131n0.g.n(j6);
    }

    private final boolean p(long j6) {
        boolean z6;
        boolean z10 = true;
        if (!this.f55650b.r() || p131n0.g.m(j6) >= 0.0f) {
            z6 = false;
        } else {
            p210v.C7227v.f55726a.e(this.f55650b.h(), p131n0.g.m(j6));
            z6 = !this.f55650b.r();
        }
        if (this.f55650b.u() && p131n0.g.m(j6) > 0.0f) {
            p210v.C7227v.f55726a.e(this.f55650b.j(), p131n0.g.m(j6));
            z6 = z6 || !this.f55650b.u();
        }
        if (this.f55650b.y() && p131n0.g.n(j6) < 0.0f) {
            p210v.C7227v.f55726a.e(this.f55650b.l(), p131n0.g.n(j6));
            z6 = z6 || !this.f55650b.y();
        }
        if (!this.f55650b.o() || p131n0.g.n(j6) <= 0.0f) {
            return z6;
        }
        p210v.C7227v.f55726a.e(this.f55650b.f(), p131n0.g.n(j6));
        if (!z6 && this.f55650b.o()) {
            z10 = false;
        }
        return z10;
    }

    private final boolean q() {
        boolean z6;
        if (this.f55650b.t()) {
            m(p131n0.g.f51312b.c());
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f55650b.w()) {
            n(p131n0.g.f51312b.c());
            z6 = true;
        }
        if (this.f55650b.A()) {
            o(p131n0.g.f51312b.c());
            z6 = true;
        }
        if (!this.f55650b.q()) {
            return z6;
        }
        l(p131n0.g.f51312b.c());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117 A[ADDED_TO_REGION] */
    @Override // p210v.T
    public long a(long j6, int i6, p237x7.l lVar) {
        float fL;
        android.widget.EdgeEffect edgeEffectF;
        boolean z6;
        boolean z10;
        android.widget.EdgeEffect edgeEffectJ;
        if (p131n0.m.k(this.f55654f)) {
            return ((p131n0.g) lVar.l(p131n0.g.d(j6))).v();
        }
        boolean z11 = true;
        if (!this.f55653e) {
            q();
            this.f55653e = true;
        }
        float fN = 0.0f;
        if (p131n0.g.n(j6) == 0.0f) {
            fL = 0.0f;
        } else if (this.f55650b.A()) {
            fL = o(j6);
            if (!this.f55650b.A()) {
                edgeEffectF = this.f55650b.l();
                edgeEffectF.onRelease();
            }
        } else if (this.f55650b.q()) {
            fL = l(j6);
            if (!this.f55650b.q()) {
                edgeEffectF = this.f55650b.f();
                edgeEffectF.onRelease();
            }
        } else {
            fL = 0.0f;
        }
        if (p131n0.g.m(j6) != 0.0f) {
            if (this.f55650b.t()) {
                fN = m(j6);
                if (!this.f55650b.t()) {
                    edgeEffectJ = this.f55650b.h();
                    edgeEffectJ.onRelease();
                }
            } else if (this.f55650b.w()) {
                fN = n(j6);
                if (!this.f55650b.w()) {
                    edgeEffectJ = this.f55650b.j();
                    edgeEffectJ.onRelease();
                }
            }
        }
        long jA = p131n0.h.a(fN, fL);
        if (!p131n0.g.j(jA, p131n0.g.f51312b.c())) {
            k();
        }
        long jQ = p131n0.g.q(j6, jA);
        long jV = ((p131n0.g) lVar.l(p131n0.g.d(jQ))).v();
        long jQ2 = p131n0.g.q(jQ, jV);
        boolean z12 = false;
        if (p241y0.f.d(i6, p241y0.f.f57150a.b())) {
            if (p131n0.g.m(jQ2) > 0.5f) {
                m(jQ2);
            } else {
                if (p131n0.g.m(jQ2) < -0.5f) {
                    n(jQ2);
                } else {
                    z6 = false;
                }
                if (p131n0.g.n(jQ2) > 0.5f) {
                    o(jQ2);
                } else {
                    if (p131n0.g.n(jQ2) < -0.5f) {
                        l(jQ2);
                    } else {
                        z10 = false;
                    }
                    if (!z6 && !z10) {
                        z11 = false;
                    }
                    z12 = z11;
                }
                z10 = true;
                if (!z6) {
                    z11 = false;
                }
                z12 = z11;
            }
            z6 = true;
            if (p131n0.g.n(jQ2) > 0.5f) {
                o(jQ2);
            } else {
                if (p131n0.g.n(jQ2) < -0.5f) {
                    l(jQ2);
                } else {
                    z10 = false;
                }
                if (!z6) {
                    z11 = false;
                }
                z12 = z11;
            }
            z10 = true;
            if (!z6) {
                z11 = false;
            }
            z12 = z11;
        }
        if (p(j6) || z12) {
            k();
        }
        return p131n0.g.r(jA, jV);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p210v.T
    public java.lang.Object b(long j6, p237x7.p pVar, p127m7.e eVar) {
        p210v.C7207a.C0727a c0727a;
        float fH;
        p210v.C7227v c7227v;
        android.widget.EdgeEffect edgeEffectJ;
        int iD;
        float fI;
        p210v.C7227v c7227v2;
        android.widget.EdgeEffect edgeEffectF;
        int iD2;
        long jA;
        long jK;
        p210v.C7207a c7207a;
        long jK2;
        p210v.C7227v c7227v3;
        android.widget.EdgeEffect edgeEffectJ2;
        int iD3;
        p210v.C7227v c7227v4;
        android.widget.EdgeEffect edgeEffectF2;
        int iD4;
        if (eVar instanceof p210v.C7207a.C0727a) {
            c0727a = (p210v.C7207a.C0727a) eVar;
            int i6 = c0727a.f55661J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0727a.f55661J = i6 - Integer.MIN_VALUE;
            } else {
                c0727a = new p210v.C7207a.C0727a(eVar);
            }
        } else {
            c0727a = new p210v.C7207a.C0727a(eVar);
        }
        java.lang.Object objU = c0727a.f55659H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = c0727a.f55661J;
        if (i10 != 0) {
            if (i10 == 1) {
                p087i7.x.b(objU);
                return p087i7.M.f46721a;
            }
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jK = c0727a.f55658G;
            c7207a = (p210v.C7207a) c0727a.f55657F;
            p087i7.x.b(objU);
            jK2 = Y0.A.k(jK, ((Y0.A) objU).o());
            c7207a.f55653e = false;
            if (Y0.A.h(jK2) > 0.0f) {
                if (Y0.A.h(jK2) < 0.0f) {
                    c7227v3 = p210v.C7227v.f55726a;
                    edgeEffectJ2 = c7207a.f55650b.j();
                    iD3 = -A7.a.d(Y0.A.h(jK2));
                }
                if (Y0.A.i(jK2) > 0.0f) {
                    if (Y0.A.i(jK2) < 0.0f) {
                        c7227v4 = p210v.C7227v.f55726a;
                        edgeEffectF2 = c7207a.f55650b.f();
                        iD4 = -A7.a.d(Y0.A.i(jK2));
                    }
                    if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                        c7207a.k();
                    }
                    c7207a.h();
                    return p087i7.M.f46721a;
                }
                c7227v4 = p210v.C7227v.f55726a;
                edgeEffectF2 = c7207a.f55650b.l();
                iD4 = A7.a.d(Y0.A.i(jK2));
                c7227v4.c(edgeEffectF2, iD4);
                if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                    c7207a.k();
                }
                c7207a.h();
                return p087i7.M.f46721a;
            }
            c7227v3 = p210v.C7227v.f55726a;
            edgeEffectJ2 = c7207a.f55650b.h();
            iD3 = A7.a.d(Y0.A.h(jK2));
            c7227v3.c(edgeEffectJ2, iD3);
            if (Y0.A.i(jK2) > 0.0f) {
                if (Y0.A.i(jK2) < 0.0f) {
                    c7227v4 = p210v.C7227v.f55726a;
                    edgeEffectF2 = c7207a.f55650b.f();
                    iD4 = -A7.a.d(Y0.A.i(jK2));
                }
                if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                    c7207a.k();
                }
                c7207a.h();
                return p087i7.M.f46721a;
            }
            c7227v4 = p210v.C7227v.f55726a;
            edgeEffectF2 = c7207a.f55650b.l();
            iD4 = A7.a.d(Y0.A.i(jK2));
            c7227v4.c(edgeEffectF2, iD4);
            if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                c7207a.k();
            }
            c7207a.h();
            return p087i7.M.f46721a;
        }
        p087i7.x.b(objU);
        if (p131n0.m.k(this.f55654f)) {
            java.lang.Object objB = Y0.A.b(j6);
            c0727a.f55661J = 1;
            if (pVar.u(objB, c0727a) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }
        if (Y0.A.h(j6) <= 0.0f || !this.f55650b.t()) {
            if (Y0.A.h(j6) >= 0.0f || !this.f55650b.w()) {
                fH = 0.0f;
            } else {
                c7227v = p210v.C7227v.f55726a;
                edgeEffectJ = this.f55650b.j();
                iD = -A7.a.d(Y0.A.h(j6));
            }
            if (Y0.A.i(j6) > 0.0f || !this.f55650b.A()) {
                if (Y0.A.i(j6) < 0.0f || !this.f55650b.q()) {
                    fI = 0.0f;
                } else {
                    c7227v2 = p210v.C7227v.f55726a;
                    edgeEffectF = this.f55650b.f();
                    iD2 = -A7.a.d(Y0.A.i(j6));
                }
                jA = Y0.B.a(fH, fI);
                if (!Y0.A.g(jA, Y0.A.f16198b.a())) {
                    k();
                }
                jK = Y0.A.k(j6, jA);
                java.lang.Object objB2 = Y0.A.b(jK);
                c0727a.f55657F = this;
                c0727a.f55658G = jK;
                c0727a.f55661J = 2;
                objU = pVar.u(objB2, c0727a);
                if (objU == objG) {
                    return objG;
                }
                c7207a = this;
                jK2 = Y0.A.k(jK, ((Y0.A) objU).o());
                c7207a.f55653e = false;
                if (Y0.A.h(jK2) > 0.0f) {
                    if (Y0.A.h(jK2) < 0.0f) {
                        c7227v3 = p210v.C7227v.f55726a;
                        edgeEffectJ2 = c7207a.f55650b.j();
                        iD3 = -A7.a.d(Y0.A.h(jK2));
                    }
                    if (Y0.A.i(jK2) > 0.0f) {
                        if (Y0.A.i(jK2) < 0.0f) {
                            c7227v4 = p210v.C7227v.f55726a;
                            edgeEffectF2 = c7207a.f55650b.f();
                            iD4 = -A7.a.d(Y0.A.i(jK2));
                        }
                        if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                            c7207a.k();
                        }
                        c7207a.h();
                        return p087i7.M.f46721a;
                    }
                    c7227v4 = p210v.C7227v.f55726a;
                    edgeEffectF2 = c7207a.f55650b.l();
                    iD4 = A7.a.d(Y0.A.i(jK2));
                    c7227v4.c(edgeEffectF2, iD4);
                    if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                        c7207a.k();
                    }
                    c7207a.h();
                    return p087i7.M.f46721a;
                }
                c7227v3 = p210v.C7227v.f55726a;
                edgeEffectJ2 = c7207a.f55650b.h();
                iD3 = A7.a.d(Y0.A.h(jK2));
                c7227v3.c(edgeEffectJ2, iD3);
                if (Y0.A.i(jK2) > 0.0f) {
                    if (Y0.A.i(jK2) < 0.0f) {
                        c7227v4 = p210v.C7227v.f55726a;
                        edgeEffectF2 = c7207a.f55650b.f();
                        iD4 = -A7.a.d(Y0.A.i(jK2));
                    }
                    if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                        c7207a.k();
                    }
                    c7207a.h();
                    return p087i7.M.f46721a;
                }
                c7227v4 = p210v.C7227v.f55726a;
                edgeEffectF2 = c7207a.f55650b.l();
                iD4 = A7.a.d(Y0.A.i(jK2));
                c7227v4.c(edgeEffectF2, iD4);
                if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                    c7207a.k();
                }
                c7207a.h();
                return p087i7.M.f46721a;
            }
            c7227v2 = p210v.C7227v.f55726a;
            edgeEffectF = this.f55650b.l();
            iD2 = A7.a.d(Y0.A.i(j6));
            c7227v2.c(edgeEffectF, iD2);
            fI = Y0.A.i(j6);
            jA = Y0.B.a(fH, fI);
            if (!Y0.A.g(jA, Y0.A.f16198b.a())) {
                k();
            }
            jK = Y0.A.k(j6, jA);
            java.lang.Object objB3 = Y0.A.b(jK);
            c0727a.f55657F = this;
            c0727a.f55658G = jK;
            c0727a.f55661J = 2;
            objU = pVar.u(objB3, c0727a);
            if (objU == objG) {
                return objG;
            }
            c7207a = this;
            jK2 = Y0.A.k(jK, ((Y0.A) objU).o());
            c7207a.f55653e = false;
            if (Y0.A.h(jK2) > 0.0f) {
                if (Y0.A.h(jK2) < 0.0f) {
                    c7227v3 = p210v.C7227v.f55726a;
                    edgeEffectJ2 = c7207a.f55650b.j();
                    iD3 = -A7.a.d(Y0.A.h(jK2));
                }
                if (Y0.A.i(jK2) > 0.0f) {
                    if (Y0.A.i(jK2) < 0.0f) {
                        c7227v4 = p210v.C7227v.f55726a;
                        edgeEffectF2 = c7207a.f55650b.f();
                        iD4 = -A7.a.d(Y0.A.i(jK2));
                    }
                    if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                        c7207a.k();
                    }
                    c7207a.h();
                    return p087i7.M.f46721a;
                }
                c7227v4 = p210v.C7227v.f55726a;
                edgeEffectF2 = c7207a.f55650b.l();
                iD4 = A7.a.d(Y0.A.i(jK2));
                c7227v4.c(edgeEffectF2, iD4);
                if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                    c7207a.k();
                }
                c7207a.h();
                return p087i7.M.f46721a;
            }
            c7227v3 = p210v.C7227v.f55726a;
            edgeEffectJ2 = c7207a.f55650b.h();
            iD3 = A7.a.d(Y0.A.h(jK2));
            c7227v3.c(edgeEffectJ2, iD3);
            if (Y0.A.i(jK2) > 0.0f) {
                if (Y0.A.i(jK2) < 0.0f) {
                    c7227v4 = p210v.C7227v.f55726a;
                    edgeEffectF2 = c7207a.f55650b.f();
                    iD4 = -A7.a.d(Y0.A.i(jK2));
                }
                if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                    c7207a.k();
                }
                c7207a.h();
                return p087i7.M.f46721a;
            }
            c7227v4 = p210v.C7227v.f55726a;
            edgeEffectF2 = c7207a.f55650b.l();
            iD4 = A7.a.d(Y0.A.i(jK2));
            c7227v4.c(edgeEffectF2, iD4);
            if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                c7207a.k();
            }
            c7207a.h();
            return p087i7.M.f46721a;
        }
        c7227v = p210v.C7227v.f55726a;
        edgeEffectJ = this.f55650b.h();
        iD = A7.a.d(Y0.A.h(j6));
        c7227v.c(edgeEffectJ, iD);
        fH = Y0.A.h(j6);
        if (Y0.A.i(j6) > 0.0f) {
            if (Y0.A.i(j6) < 0.0f) {
            }
            fI = 0.0f;
        } else {
            if (Y0.A.i(j6) < 0.0f) {
            }
            fI = 0.0f;
        }
        jA = Y0.B.a(fH, fI);
        if (!Y0.A.g(jA, Y0.A.f16198b.a())) {
            k();
        }
        jK = Y0.A.k(j6, jA);
        java.lang.Object objB4 = Y0.A.b(jK);
        c0727a.f55657F = this;
        c0727a.f55658G = jK;
        c0727a.f55661J = 2;
        objU = pVar.u(objB4, c0727a);
        if (objU == objG) {
            return objG;
        }
        c7207a = this;
        jK2 = Y0.A.k(jK, ((Y0.A) objU).o());
        c7207a.f55653e = false;
        if (Y0.A.h(jK2) > 0.0f) {
            if (Y0.A.h(jK2) < 0.0f) {
                c7227v3 = p210v.C7227v.f55726a;
                edgeEffectJ2 = c7207a.f55650b.j();
                iD3 = -A7.a.d(Y0.A.h(jK2));
            }
            if (Y0.A.i(jK2) > 0.0f) {
                if (Y0.A.i(jK2) < 0.0f) {
                    c7227v4 = p210v.C7227v.f55726a;
                    edgeEffectF2 = c7207a.f55650b.f();
                    iD4 = -A7.a.d(Y0.A.i(jK2));
                }
                if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                    c7207a.k();
                }
                c7207a.h();
                return p087i7.M.f46721a;
            }
            c7227v4 = p210v.C7227v.f55726a;
            edgeEffectF2 = c7207a.f55650b.l();
            iD4 = A7.a.d(Y0.A.i(jK2));
            c7227v4.c(edgeEffectF2, iD4);
            if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                c7207a.k();
            }
            c7207a.h();
            return p087i7.M.f46721a;
        }
        c7227v3 = p210v.C7227v.f55726a;
        edgeEffectJ2 = c7207a.f55650b.h();
        iD3 = A7.a.d(Y0.A.h(jK2));
        c7227v3.c(edgeEffectJ2, iD3);
        if (Y0.A.i(jK2) > 0.0f) {
            if (Y0.A.i(jK2) < 0.0f) {
                c7227v4 = p210v.C7227v.f55726a;
                edgeEffectF2 = c7207a.f55650b.f();
                iD4 = -A7.a.d(Y0.A.i(jK2));
            }
            if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
                c7207a.k();
            }
            c7207a.h();
            return p087i7.M.f46721a;
        }
        c7227v4 = p210v.C7227v.f55726a;
        edgeEffectF2 = c7207a.f55650b.l();
        iD4 = A7.a.d(Y0.A.i(jK2));
        c7227v4.c(edgeEffectF2, iD4);
        if (!Y0.A.g(jK2, Y0.A.f16198b.a())) {
            c7207a.k();
        }
        c7207a.h();
        return p087i7.M.f46721a;
    }

    @Override // p210v.T
    public androidx.compose.ui.d c() {
        return this.f55656h;
    }

    @Override // p210v.T
    public boolean d() {
        p210v.C7228w c7228w = this.f55650b;
        android.widget.EdgeEffect edgeEffect = c7228w.f55730d;
        if (edgeEffect != null && p210v.C7227v.f55726a.b(edgeEffect) != 0.0f) {
            return true;
        }
        android.widget.EdgeEffect edgeEffect2 = c7228w.f55731e;
        if (edgeEffect2 != null && p210v.C7227v.f55726a.b(edgeEffect2) != 0.0f) {
            return true;
        }
        android.widget.EdgeEffect edgeEffect3 = c7228w.f55732f;
        if (edgeEffect3 != null && p210v.C7227v.f55726a.b(edgeEffect3) != 0.0f) {
            return true;
        }
        android.widget.EdgeEffect edgeEffect4 = c7228w.f55733g;
        return (edgeEffect4 == null || p210v.C7227v.f55726a.b(edgeEffect4) == 0.0f) ? false : true;
    }

    public final long i() {
        p131n0.g gVar = this.f55649a;
        long jV = gVar != null ? gVar.v() : p131n0.n.b(this.f55654f);
        return p131n0.h.a(p131n0.g.m(jV) / p131n0.m.i(this.f55654f), p131n0.g.n(jV) / p131n0.m.g(this.f55654f));
    }

    public final V.InterfaceC1753w0 j() {
        return this.f55651c;
    }

    public final void k() {
        if (this.f55652d) {
            this.f55651c.setValue(p087i7.M.f46721a);
        }
    }

    public final void r(long j6) {
        boolean zF = p131n0.m.f(this.f55654f, p131n0.m.f51333b.b());
        boolean z6 = !p131n0.m.f(j6, this.f55654f);
        this.f55654f = j6;
        if (z6) {
            this.f55650b.B(Y0.u.a(A7.a.d(p131n0.m.i(j6)), A7.a.d(p131n0.m.g(j6))));
        }
        if (zF || !z6) {
            return;
        }
        k();
        h();
    }
}
