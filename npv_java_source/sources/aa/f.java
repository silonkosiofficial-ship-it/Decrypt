package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f17272a = p087i7.AbstractC6669o.b(aa.f.a.f17276D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f17273b = p087i7.AbstractC6669o.b(aa.f.b.f17277D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f17274c = p087i7.AbstractC6669o.b(aa.f.c.f17278D);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final aa.C1887a f17275d = new aa.C1887a();

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.f.a f17276D = new aa.f.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p141o0.E1 b() {
            return p141o0.G1.b(1, 1, 0, false, null, 28, null);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.f.b f17277D = new aa.f.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p201u0.d b() {
            float f6 = 1;
            return new u0.d.a("emptyImageVector", Y0.i.q(f6), Y0.i.q(f6), 1.0f, 1.0f, 0L, 0, false, 224, null).f();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.f.c f17278D = new aa.f.c();

        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p191t0.a b() {
            return new p191t0.a(aa.f.e(), 0L, 0L, 6, null);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.f.d f17279D = new aa.f.d();

        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p141o0.E1 b() {
            return aa.f.e();
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17280G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17281H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.d f17282I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ aa.n f17283J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ aa.r f17284K;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f17285D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f17286E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i6, int i10) {
                super(1);
                this.f17285D = i6;
                this.f17286E = i10;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final aa.e l(byte[] bArr) {
                p247y7.AbstractC7350t.f(bArr, "it");
                return new aa.e.a(aa.g.a(bArr, this.f17285D, this.f17286E));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(aa.d dVar, aa.n nVar, aa.r rVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17282I = dVar;
            this.f17283J = nVar;
            this.f17284K = rVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object next;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17280G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                aa.q qVarF = aa.o.f(this.f17282I, (aa.n) this.f17281H);
                java.util.Iterator it = qVarF.c().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((aa.k) next) instanceof aa.EnumC1889c));
                aa.EnumC1889c enumC1889c = next instanceof aa.EnumC1889c ? (aa.EnumC1889c) next : null;
                int iG = enumC1889c != null ? enumC1889c.g() : aa.EnumC1889c.MDPI.g();
                int iG2 = this.f17283J.a().g();
                java.lang.String strB = qVarF.b();
                aa.r rVar = this.f17284K;
                aa.f.e.a aVar = new aa.f.e.a(iG, iG2);
                this.f17280G = 1;
                obj = aa.f.j(strB, strB + "-" + iG2 + "dpi", rVar, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Bitmap");
            return ((aa.e.a) obj).a();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(aa.n nVar, p127m7.e eVar) {
            return ((aa.f.e) x(nVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            aa.f.e eVar2 = new aa.f.e(this.f17282I, this.f17283J, this.f17284K, eVar);
            eVar2.f17281H = obj;
            return eVar2;
        }
    }

    /* JADX INFO: renamed from: aa.f$f, reason: collision with other inner class name */
    static final class C0335f extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f17287G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f17288H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.l f17289I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ aa.r f17290J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.lang.String f17291K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0335f(p237x7.l lVar, aa.r rVar, java.lang.String str, p127m7.e eVar) {
            super(1, eVar);
            this.f17289I = lVar;
            this.f17290J = rVar;
            this.f17291K = str;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p237x7.l lVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17288H;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.l lVar2 = this.f17289I;
                aa.r rVar = this.f17290J;
                java.lang.String str = this.f17291K;
                this.f17287G = lVar2;
                this.f17288H = 1;
                java.lang.Object objB = rVar.b(str, this);
                if (objB == objG) {
                    return objG;
                }
                lVar = lVar2;
                obj = objB;
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (p237x7.l) this.f17287G;
                p087i7.x.b(obj);
            }
            return lVar.l(obj);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((aa.f.C0335f) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return new aa.f.C0335f(this.f17289I, this.f17290J, this.f17291K, eVar);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.f.g f17292D = new aa.f.g();

        g() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p191t0.b b() {
            return aa.f.g();
        }
    }

    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17293G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17294H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.d f17295I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ aa.r f17296J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ Y0.e f17297K;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ Y0.e f17298D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y0.e eVar) {
                super(1);
                this.f17298D = eVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final aa.e l(byte[] bArr) {
                p247y7.AbstractC7350t.f(bArr, "it");
                aa.g.b(bArr);
                return new aa.e.b(aa.g.c(null, this.f17298D));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(aa.d dVar, aa.r rVar, Y0.e eVar, p127m7.e eVar2) {
            super(2, eVar2);
            this.f17295I = dVar;
            this.f17296J = rVar;
            this.f17297K = eVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17293G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                java.lang.String strB = aa.o.f(this.f17295I, (aa.n) this.f17294H).b();
                aa.r rVar = this.f17296J;
                aa.f.h.a aVar = new aa.f.h.a(this.f17297K);
                this.f17293G = 1;
                obj = aa.f.j(strB, strB, rVar, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Svg");
            return ((aa.e.b) obj).a();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(aa.n nVar, p127m7.e eVar) {
            return ((aa.f.h) x(nVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            aa.f.h hVar = new aa.f.h(this.f17295I, this.f17296J, this.f17297K, eVar);
            hVar.f17294H = obj;
            return hVar;
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.f.i f17299D = new aa.f.i();

        i() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p201u0.d b() {
            return aa.f.f();
        }
    }

    static final class j extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17300G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17301H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.d f17302I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ aa.r f17303J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ Y0.e f17304K;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ Y0.e f17305D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y0.e eVar) {
                super(1);
                this.f17305D = eVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final aa.e l(byte[] bArr) {
                p247y7.AbstractC7350t.f(bArr, "it");
                return new aa.e.c(ca.c.q(aa.h.a(bArr), this.f17305D));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(aa.d dVar, aa.r rVar, Y0.e eVar, p127m7.e eVar2) {
            super(2, eVar2);
            this.f17302I = dVar;
            this.f17303J = rVar;
            this.f17304K = eVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17300G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                java.lang.String strB = aa.o.f(this.f17302I, (aa.n) this.f17301H).b();
                aa.r rVar = this.f17303J;
                aa.f.j.a aVar = new aa.f.j.a(this.f17304K);
                this.f17300G = 1;
                obj = aa.f.j(strB, strB, rVar, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Vector");
            return ((aa.e.c) obj).a();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(aa.n nVar, p127m7.e eVar) {
            return ((aa.f.j) x(nVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            aa.f.j jVar = new aa.f.j(this.f17302I, this.f17303J, this.f17304K, eVar);
            jVar.f17301H = obj;
            return jVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p141o0.E1 e() {
        return (p141o0.E1) f17272a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p201u0.d f() {
        return (p201u0.d) f17273b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p191t0.b g() {
        return (p191t0.b) f17274c.getValue();
    }

    public static final p141o0.E1 h(aa.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(dVar, "resource");
        interfaceC1734n.T(1838739546);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1838739546, i6, -1, "org.jetbrains.compose.resources.imageResource (ImageResources.kt:56)");
        }
        aa.r rVarA = aa.t.a(aa.s.b(), interfaceC1734n, 6);
        aa.n nVarH = aa.o.h(interfaceC1734n, 0);
        p141o0.E1 e1I = i(aa.u.a(dVar, rVarA, nVarH, aa.f.d.f17279D, new aa.f.e(dVar, nVarH, rVarA, null), interfaceC1734n, (i6 & 14) | 35840));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return e1I;
    }

    private static final p141o0.E1 i(V.G1 g6) {
        return (p141o0.E1) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object j(java.lang.String str, java.lang.String str2, aa.r rVar, p237x7.l lVar, p127m7.e eVar) {
        return f17275d.c(str2, new aa.f.C0335f(lVar, rVar, str, null), eVar);
    }

    public static final p191t0.b k(aa.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(dVar, "resource");
        interfaceC1734n.T(-1508925367);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1508925367, i6, -1, "org.jetbrains.compose.resources.painterResource (ImageResources.kt:35)");
        }
        aa.n nVarA = ((aa.InterfaceC1888b) interfaceC1734n.n(aa.o.e())).a(interfaceC1734n, 0);
        interfaceC1734n.T(-1389301971);
        int i10 = i6 & 14;
        boolean zS = (((i10 ^ 6) > 4 && interfaceC1734n.S(dVar)) || (i6 & 6) == 4) | interfaceC1734n.S(nVarA);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = aa.o.f(dVar, nVarA).b();
            interfaceC1734n.K(objG);
        }
        java.lang.String str = (java.lang.String) objG;
        interfaceC1734n.J();
        if (S8.r.I(str, ".xml", true)) {
            interfaceC1734n.T(-118556854);
            p201u0.q qVarG = p201u0.r.g(n(dVar, interfaceC1734n, i10), interfaceC1734n, 0);
            interfaceC1734n.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return qVarG;
        }
        if (S8.r.I(str, ".svg", true)) {
            interfaceC1734n.T(-118445595);
            p191t0.b bVarL = l(dVar, interfaceC1734n, i10);
            interfaceC1734n.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return bVarL;
        }
        interfaceC1734n.T(-118396429);
        p191t0.a aVar = new p191t0.a(h(dVar, interfaceC1734n, i10), 0L, 0L, 6, null);
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return aVar;
    }

    private static final p191t0.b l(aa.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.T(1371694195);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1371694195, i6, -1, "org.jetbrains.compose.resources.svgPainter (ImageResources.kt:106)");
        }
        aa.r rVarA = aa.t.a(aa.s.b(), interfaceC1734n, 6);
        Y0.e eVar = (Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e());
        p191t0.b bVarM = m(aa.u.a(dVar, rVarA, eVar, aa.f.g.f17292D, new aa.f.h(dVar, rVarA, eVar, null), interfaceC1734n, (i6 & 14) | 35840));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return bVarM;
    }

    private static final p191t0.b m(V.G1 g6) {
        return (p191t0.b) g6.getValue();
    }

    public static final p201u0.d n(aa.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(dVar, "resource");
        interfaceC1734n.T(-1394399862);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1394399862, i6, -1, "org.jetbrains.compose.resources.vectorResource (ImageResources.kt:86)");
        }
        aa.r rVarA = aa.t.a(aa.s.b(), interfaceC1734n, 6);
        Y0.e eVar = (Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e());
        p201u0.d dVarO = o(aa.u.a(dVar, rVarA, eVar, aa.f.i.f17299D, new aa.f.j(dVar, rVarA, eVar, null), interfaceC1734n, (i6 & 14) | 35840));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return dVarO;
    }

    private static final p201u0.d o(V.G1 g6) {
        return (p201u0.d) g6.getValue();
    }
}
