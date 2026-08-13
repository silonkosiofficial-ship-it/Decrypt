package p200u;

/* JADX INFO: renamed from: u.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7161c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.C7180l0 f54819a = p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p200u.C7180l0 f54820b = p200u.AbstractC7177k.j(0.0f, 0.0f, Y0.i.m(p200u.Q0.a(Y0.i.f16208D)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p200u.C7180l0 f54821c = p200u.AbstractC7177k.j(0.0f, 0.0f, p131n0.m.c(p200u.Q0.f(p131n0.m.f51333b)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p200u.C7180l0 f54822d = p200u.AbstractC7177k.j(0.0f, 0.0f, p131n0.g.d(p200u.Q0.e(p131n0.g.f51312b)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p200u.C7180l0 f54823e = p200u.AbstractC7177k.j(0.0f, 0.0f, p200u.Q0.g(p131n0.i.f51317e), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p200u.C7180l0 f54824f = p200u.AbstractC7177k.j(0.0f, 0.0f, java.lang.Integer.valueOf(p200u.Q0.b(p247y7.C7349s.f57306a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p200u.C7180l0 f54825g = p200u.AbstractC7177k.j(0.0f, 0.0f, Y0.p.b(p200u.Q0.c(Y0.p.f16221b)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p200u.C7180l0 f54826h = p200u.AbstractC7177k.j(0.0f, 0.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 3, null);

    /* JADX INFO: renamed from: u.c$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Y8.j f54827D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54828E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y8.j jVar, java.lang.Object obj) {
            super(0);
            this.f54827D = jVar;
            this.f54828E = obj;
        }

        public final void a() {
            this.f54827D.j(this.f54828E);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: u.c$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54829G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f54830H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f54831I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ Y8.j f54832J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p200u.C7157a f54833K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ V.G1 f54834L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ V.G1 f54835M;

        /* JADX INFO: renamed from: u.c$b$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f54836G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f54837H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p200u.C7157a f54838I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ V.G1 f54839J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ V.G1 f54840K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.lang.Object obj, p200u.C7157a c7157a, V.G1 g6, V.G1 g10, p127m7.e eVar) {
                super(2, eVar);
                this.f54837H = obj;
                this.f54838I = c7157a;
                this.f54839J = g6;
                this.f54840K = g10;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f54836G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    if (!p247y7.AbstractC7350t.b(this.f54837H, this.f54838I.k())) {
                        p200u.C7157a c7157a = this.f54838I;
                        java.lang.Object obj2 = this.f54837H;
                        p200u.InterfaceC7175j interfaceC7175jG = p200u.AbstractC7161c.g(this.f54839J);
                        this.f54836G = 1;
                        if (p200u.C7157a.f(c7157a, obj2, interfaceC7175jG, null, null, this, 12, null) == objG) {
                            return objG;
                        }
                    }
                    return p087i7.M.f46721a;
                }
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                p237x7.l lVarF = p200u.AbstractC7161c.f(this.f54840K);
                if (lVarF != null) {
                    lVarF.l(this.f54838I.m());
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p200u.AbstractC7161c.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new p200u.AbstractC7161c.b.a(this.f54837H, this.f54838I, this.f54839J, this.f54840K, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Y8.j jVar, p200u.C7157a c7157a, V.G1 g6, V.G1 g10, p127m7.e eVar) {
            super(2, eVar);
            this.f54832J = jVar;
            this.f54833K = c7157a;
            this.f54834L = g6;
            this.f54835M = g10;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0045  */
        /* JADX WARN: Code duplicated, block: B:16:0x0055  */
        /* JADX WARN: Code duplicated, block: B:17:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r13.f54830H
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r13.f54829G
                Y8.l r1 = (Y8.l) r1
                java.lang.Object r3 = r13.f54831I
                W8.N r3 = (W8.N) r3
                p087i7.x.b(r14)
                r4 = r14
                goto L3d
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                p087i7.x.b(r14)
                java.lang.Object r1 = r13.f54831I
                W8.N r1 = (W8.N) r1
                Y8.j r3 = r13.f54832J
                Y8.l r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L30:
                r13.f54831I = r3
                r13.f54829G = r1
                r13.f54830H = r2
                java.lang.Object r4 = r1.a(r13)
                if (r4 != r0) goto L3d
                return r0
            L3d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L6f
                java.lang.Object r4 = r1.next()
                Y8.j r5 = r13.f54832J
                java.lang.Object r5 = r5.a()
                java.lang.Object r5 = Y8.n.f(r5)
                if (r5 != 0) goto L57
                r7 = r4
                goto L58
            L57:
                r7 = r5
            L58:
                u.c$b$a r4 = new u.c$b$a
                u.a r8 = r13.f54833K
                V.G1 r9 = r13.f54834L
                V.G1 r10 = r13.f54835M
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                W8.AbstractC1784g.d(r5, r6, r7, r8, r9, r10)
                goto L30
            L6f:
                i7.M r0 = p087i7.M.f46721a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p200u.AbstractC7161c.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p200u.AbstractC7161c.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p200u.AbstractC7161c.b bVar = new p200u.AbstractC7161c.b(this.f54832J, this.f54833K, this.f54834L, this.f54835M, eVar);
            bVar.f54831I = obj;
            return bVar;
        }
    }

    public static final V.G1 c(float f6, p200u.InterfaceC7175j interfaceC7175j, java.lang.String str, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC7175j = f54820b;
        }
        p200u.InterfaceC7175j interfaceC7175j2 = interfaceC7175j;
        if ((i10 & 4) != 0) {
            str = "DpAnimation";
        }
        java.lang.String str2 = str;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        p237x7.l lVar2 = lVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1407150062, i6, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i11 = i6 << 6;
        V.G1 g1E = e(Y0.i.m(f6), p200u.z0.b(Y0.i.f16208D), interfaceC7175j2, null, str2, lVar2, interfaceC1734n, (i6 & 14) | ((i6 << 3) & 896) | (57344 & i11) | (i11 & 458752), 8);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1E;
    }

    public static final V.G1 d(float f6, p200u.InterfaceC7175j interfaceC7175j, float f10, java.lang.String str, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        p200u.InterfaceC7175j interfaceC7175j2;
        p200u.InterfaceC7175j interfaceC7175j3 = (i10 & 2) != 0 ? f54819a : interfaceC7175j;
        float f11 = (i10 & 4) != 0 ? 0.01f : f10;
        java.lang.String str2 = (i10 & 8) != 0 ? "FloatAnimation" : str;
        p237x7.l lVar2 = (i10 & 16) != 0 ? null : lVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(668842840, i6, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (interfaceC7175j3 == f54819a) {
            interfaceC1734n.T(1125598679);
            boolean z6 = (((i6 & 896) ^ 384) > 256 && interfaceC1734n.h(f11)) || (i6 & 384) == 256;
            java.lang.Object objG = interfaceC1734n.g();
            if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = p200u.AbstractC7177k.j(0.0f, 0.0f, java.lang.Float.valueOf(f11), 3, null);
                interfaceC1734n.K(objG);
            }
            interfaceC7175j2 = (p200u.C7180l0) objG;
            interfaceC1734n.J();
        } else {
            interfaceC1734n.T(1125708605);
            interfaceC1734n.J();
            interfaceC7175j2 = interfaceC7175j3;
        }
        int i11 = i6 << 3;
        V.G1 g1E = e(java.lang.Float.valueOf(f6), p200u.z0.i(p247y7.C7344m.f57303a), interfaceC7175j2, java.lang.Float.valueOf(f11), str2, lVar2, interfaceC1734n, (i6 & 14) | (i11 & 7168) | (57344 & i11) | (i11 & 458752), 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1E;
    }

    public static final V.G1 e(java.lang.Object obj, p200u.x0 x0Var, p200u.InterfaceC7175j interfaceC7175j, java.lang.Object obj2, java.lang.String str, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        p200u.InterfaceC7175j interfaceC7175jI;
        if ((i10 & 4) != 0) {
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);
                interfaceC1734n.K(objG);
            }
            interfaceC7175jI = (p200u.C7180l0) objG;
        } else {
            interfaceC7175jI = interfaceC7175j;
        }
        java.lang.Object obj3 = (i10 & 8) != 0 ? null : obj2;
        java.lang.String str2 = (i10 & 16) != 0 ? "ValueAnimation" : str;
        p237x7.l lVar2 = (i10 & 32) != 0 ? null : lVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1994373980, i6, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        java.lang.Object objG2 = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG2 == aVar.a()) {
            objG2 = V.A1.d(null, null, 2, null);
            interfaceC1734n.K(objG2);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG2;
        java.lang.Object objG3 = interfaceC1734n.g();
        if (objG3 == aVar.a()) {
            objG3 = new p200u.C7157a(obj, x0Var, obj3, str2);
            interfaceC1734n.K(objG3);
        }
        p200u.C7157a c7157a = (p200u.C7157a) objG3;
        V.G1 g1N = V.v1.n(lVar2, interfaceC1734n, (i6 >> 15) & 14);
        if (obj3 != null && (interfaceC7175jI instanceof p200u.C7180l0)) {
            p200u.C7180l0 c7180l0 = (p200u.C7180l0) interfaceC7175jI;
            if (!p247y7.AbstractC7350t.b(c7180l0.h(), obj3)) {
                interfaceC7175jI = p200u.AbstractC7177k.i(c7180l0.f(), c7180l0.g(), obj3);
            }
        }
        V.G1 g1N2 = V.v1.n(interfaceC7175jI, interfaceC1734n, 0);
        java.lang.Object objG4 = interfaceC1734n.g();
        if (objG4 == aVar.a()) {
            objG4 = Y8.m.b(-1, null, null, 6, null);
            interfaceC1734n.K(objG4);
        }
        Y8.j jVar = (Y8.j) objG4;
        boolean zL = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.l(obj)) || (i6 & 6) == 4) | interfaceC1734n.l(jVar);
        java.lang.Object objG5 = interfaceC1734n.g();
        if (zL || objG5 == aVar.a()) {
            objG5 = new p200u.AbstractC7161c.a(jVar, obj);
            interfaceC1734n.K(objG5);
        }
        V.Q.f((p237x7.a) objG5, interfaceC1734n, 0);
        boolean zL2 = interfaceC1734n.l(jVar) | interfaceC1734n.l(c7157a) | interfaceC1734n.S(g1N2) | interfaceC1734n.S(g1N);
        java.lang.Object objG6 = interfaceC1734n.g();
        if (zL2 || objG6 == aVar.a()) {
            objG6 = new p200u.AbstractC7161c.b(jVar, c7157a, g1N2, g1N, null);
            interfaceC1734n.K(objG6);
        }
        V.Q.e(jVar, (p237x7.p) objG6, interfaceC1734n, 0);
        V.G1 g1G = (V.G1) interfaceC1753w0.getValue();
        if (g1G == null) {
            g1G = c7157a.g();
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.l f(V.G1 g6) {
        return (p237x7.l) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p200u.InterfaceC7175j g(V.G1 g6) {
        return (p200u.InterfaceC7175j) g6.getValue();
    }
}
