package W;

/* JADX INFO: loaded from: classes.dex */
public final class a extends W.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W.g f15235a = new W.g();

    public final void A() {
        this.f15235a.x(W.d.A.f15254c);
    }

    public final void B(int i6) {
        W.g gVar = this.f15235a;
        W.d.B b6 = W.d.B.f15255c;
        gVar.y(b6);
        W.g.c.c(W.g.c.a(gVar), W.d.q.a(0), i6);
        if (gVar.f15294g == gVar.n(b6.b()) && gVar.f15295h == gVar.n(b6.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = b6.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f15294g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(b6.e(W.d.q.a(i11)));
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = b6.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f15295h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(b6.f(W.d.t.a(i13)));
                i12++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + b6 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void C(java.lang.Object obj, V.C1704d c1704d, int i6) {
        W.g gVar = this.f15235a;
        W.d.C c6 = W.d.C.f15256c;
        gVar.y(c6);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), obj);
        W.g.c.d(gVarA, W.d.t.a(1), c1704d);
        W.g.c.c(gVarA, W.d.q.a(0), i6);
        if (gVar.f15294g == gVar.n(c6.b()) && gVar.f15295h == gVar.n(c6.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = c6.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f15294g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(c6.e(W.d.q.a(i11)));
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = c6.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f15295h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c6.f(W.d.t.a(i13)));
                i12++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + c6 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void D(java.lang.Object obj) {
        W.g gVar = this.f15235a;
        W.d.D d6 = W.d.D.f15257c;
        gVar.y(d6);
        W.g.c.d(W.g.c.a(gVar), W.d.t.a(0), obj);
        if (gVar.f15294g == gVar.n(d6.b()) && gVar.f15295h == gVar.n(d6.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = d6.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(d6.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = d6.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d6.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + d6 + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void E(java.lang.Object obj, p237x7.p pVar) {
        W.g gVar = this.f15235a;
        W.d.E e6 = W.d.E.f15258c;
        gVar.y(e6);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), obj);
        int iA = W.d.t.a(1);
        p247y7.AbstractC7350t.d(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        W.g.c.d(gVarA, iA, (p237x7.p) p247y7.W.f(pVar, 2));
        if (gVar.f15294g == gVar.n(e6.b()) && gVar.f15295h == gVar.n(e6.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = e6.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(e6.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = e6.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e6.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + e6 + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void F(java.lang.Object obj, int i6) {
        W.g gVar = this.f15235a;
        W.d.F f6 = W.d.F.f15259c;
        gVar.y(f6);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), obj);
        W.g.c.c(gVarA, W.d.q.a(0), i6);
        if (gVar.f15294g == gVar.n(f6.b()) && gVar.f15295h == gVar.n(f6.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = f6.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f15294g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(f6.e(W.d.q.a(i11)));
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = f6.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f15295h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(f6.f(W.d.t.a(i13)));
                i12++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + f6 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void G(int i6) {
        W.g gVar = this.f15235a;
        W.d.G g6 = W.d.G.f15260c;
        gVar.y(g6);
        W.g.c.c(W.g.c.a(gVar), W.d.q.a(0), i6);
        if (gVar.f15294g == gVar.n(g6.b()) && gVar.f15295h == gVar.n(g6.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = g6.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f15294g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(g6.e(W.d.q.a(i11)));
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = g6.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f15295h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(g6.f(W.d.t.a(i13)));
                i12++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + g6 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void H(java.lang.Object obj) {
        if (obj instanceof V.InterfaceC1728l) {
            this.f15235a.x(W.d.H.f15261c);
        }
    }

    public final void a() {
        this.f15235a.m();
    }

    public final void b(V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
        this.f15235a.r(interfaceC1713g, c1727k1, y6);
    }

    public final boolean c() {
        return this.f15235a.t();
    }

    public final boolean d() {
        return this.f15235a.u();
    }

    public final void e(int i6) {
        W.g gVar = this.f15235a;
        W.d.C1760a c1760a = W.d.C1760a.f15262c;
        gVar.y(c1760a);
        W.g.c.c(W.g.c.a(gVar), W.d.q.a(0), i6);
        if (gVar.f15294g == gVar.n(c1760a.b()) && gVar.f15295h == gVar.n(c1760a.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = c1760a.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f15294g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(c1760a.e(W.d.q.a(i11)));
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = c1760a.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f15295h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1760a.f(W.d.t.a(i13)));
                i12++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + c1760a + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void f(V.C1704d c1704d, java.lang.Object obj) {
        W.g gVar = this.f15235a;
        W.d.C1761b c1761b = W.d.C1761b.f15263c;
        gVar.y(c1761b);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), c1704d);
        W.g.c.d(gVarA, W.d.t.a(1), obj);
        if (gVar.f15294g == gVar.n(c1761b.b()) && gVar.f15295h == gVar.n(c1761b.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = c1761b.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(c1761b.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = c1761b.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1761b.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + c1761b + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void g(java.util.List list, p031d0.d dVar) {
        if (!list.isEmpty()) {
            W.g gVar = this.f15235a;
            W.d.C0292d c0292d = W.d.C0292d.f15265c;
            gVar.y(c0292d);
            W.g gVarA = W.g.c.a(gVar);
            W.g.c.d(gVarA, W.d.t.a(1), list);
            W.g.c.d(gVarA, W.d.t.a(0), dVar);
            if (gVar.f15294g == gVar.n(c0292d.b()) && gVar.f15295h == gVar.n(c0292d.d())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int iB = c0292d.b();
            int i6 = 0;
            for (int i10 = 0; i10 < iB; i10++) {
                if (((1 << i10) & gVar.f15294g) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0292d.e(W.d.q.a(i10)));
                    i6++;
                }
            }
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int iD = c0292d.d();
            int i11 = 0;
            for (int i12 = 0; i12 < iD; i12++) {
                if (((1 << i12) & gVar.f15295h) != 0) {
                    if (i6 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c0292d.f(W.d.t.a(i12)));
                    i11++;
                }
            }
            java.lang.String string2 = sb2.toString();
            p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
            V.I0.b("Error while pushing " + c0292d + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
        }
    }

    public final void h(V.AbstractC1735n0 abstractC1735n0, V.AbstractC1744s abstractC1744s, V.C1738o0 c1738o0, V.C1738o0 c1738o1) {
        W.g gVar = this.f15235a;
        W.d.C1763e c1763e = W.d.C1763e.f15266c;
        gVar.y(c1763e);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), abstractC1735n0);
        W.g.c.d(gVarA, W.d.t.a(1), abstractC1744s);
        W.g.c.d(gVarA, W.d.t.a(3), c1738o1);
        W.g.c.d(gVarA, W.d.t.a(2), c1738o0);
        if (gVar.f15294g == gVar.n(c1763e.b()) && gVar.f15295h == gVar.n(c1763e.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = c1763e.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(c1763e.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = c1763e.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1763e.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + c1763e + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void i() {
        this.f15235a.x(W.d.C1764f.f15267c);
    }

    public final void j(p031d0.d dVar, V.C1704d c1704d) {
        W.g gVar = this.f15235a;
        W.d.C1765g c1765g = W.d.C1765g.f15268c;
        gVar.y(c1765g);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), dVar);
        W.g.c.d(gVarA, W.d.t.a(1), c1704d);
        if (gVar.f15294g == gVar.n(c1765g.b()) && gVar.f15295h == gVar.n(c1765g.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = c1765g.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(c1765g.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = c1765g.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1765g.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + c1765g + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void k(java.lang.Object[] objArr) {
        if (!(objArr.length == 0)) {
            W.g gVar = this.f15235a;
            W.d.C1766h c1766h = W.d.C1766h.f15269c;
            gVar.y(c1766h);
            W.g.c.d(W.g.c.a(gVar), W.d.t.a(0), objArr);
            if (gVar.f15294g == gVar.n(c1766h.b()) && gVar.f15295h == gVar.n(c1766h.d())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int iB = c1766h.b();
            int i6 = 0;
            for (int i10 = 0; i10 < iB; i10++) {
                if (((1 << i10) & gVar.f15294g) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c1766h.e(W.d.q.a(i10)));
                    i6++;
                }
            }
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int iD = c1766h.d();
            int i11 = 0;
            for (int i12 = 0; i12 < iD; i12++) {
                if (((1 << i12) & gVar.f15295h) != 0) {
                    if (i6 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c1766h.f(W.d.t.a(i12)));
                    i11++;
                }
            }
            java.lang.String string2 = sb2.toString();
            p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
            V.I0.b("Error while pushing " + c1766h + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
        }
    }

    public final void l(p237x7.l lVar, V.r rVar) {
        W.g gVar = this.f15235a;
        W.d.i iVar = W.d.i.f15270c;
        gVar.y(iVar);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), lVar);
        W.g.c.d(gVarA, W.d.t.a(1), rVar);
        if (gVar.f15294g == gVar.n(iVar.b()) && gVar.f15295h == gVar.n(iVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = iVar.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(iVar.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = iVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(iVar.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + iVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void m() {
        this.f15235a.x(W.d.j.f15271c);
    }

    public final void n() {
        this.f15235a.x(W.d.k.f15272c);
    }

    public final void o(V.C1704d c1704d) {
        W.g gVar = this.f15235a;
        W.d.l lVar = W.d.l.f15273c;
        gVar.y(lVar);
        W.g.c.d(W.g.c.a(gVar), W.d.t.a(0), c1704d);
        if (gVar.f15294g == gVar.n(lVar.b()) && gVar.f15295h == gVar.n(lVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = lVar.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(lVar.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = lVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(lVar.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + lVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void p() {
        this.f15235a.x(W.d.m.f15274c);
    }

    public final void q(W.a aVar, p031d0.d dVar) {
        if (aVar.d()) {
            W.g gVar = this.f15235a;
            W.d.C1762c c1762c = W.d.C1762c.f15264c;
            gVar.y(c1762c);
            W.g gVarA = W.g.c.a(gVar);
            W.g.c.d(gVarA, W.d.t.a(0), aVar);
            W.g.c.d(gVarA, W.d.t.a(1), dVar);
            if (gVar.f15294g == gVar.n(c1762c.b()) && gVar.f15295h == gVar.n(c1762c.d())) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int iB = c1762c.b();
            int i6 = 0;
            for (int i10 = 0; i10 < iB; i10++) {
                if (((1 << i10) & gVar.f15294g) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c1762c.e(W.d.q.a(i10)));
                    i6++;
                }
            }
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int iD = c1762c.d();
            int i11 = 0;
            for (int i12 = 0; i12 < iD; i12++) {
                if (((1 << i12) & gVar.f15295h) != 0) {
                    if (i6 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c1762c.f(W.d.t.a(i12)));
                    i11++;
                }
            }
            java.lang.String string2 = sb2.toString();
            p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
            V.I0.b("Error while pushing " + c1762c + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
        }
    }

    public final void r(V.C1704d c1704d, V.C1718h1 c1718h1) {
        W.g gVar = this.f15235a;
        W.d.o oVar = W.d.o.f15276c;
        gVar.y(oVar);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), c1704d);
        W.g.c.d(gVarA, W.d.t.a(1), c1718h1);
        if (gVar.f15294g == gVar.n(oVar.b()) && gVar.f15295h == gVar.n(oVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = oVar.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(oVar.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = oVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void s(V.C1704d c1704d, V.C1718h1 c1718h1, W.c cVar) {
        W.g gVar = this.f15235a;
        W.d.p pVar = W.d.p.f15277c;
        gVar.y(pVar);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), c1704d);
        W.g.c.d(gVarA, W.d.t.a(1), c1718h1);
        W.g.c.d(gVarA, W.d.t.a(2), cVar);
        if (gVar.f15294g == gVar.n(pVar.b()) && gVar.f15295h == gVar.n(pVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = pVar.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(pVar.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = pVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(pVar.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void t(int i6) {
        W.g gVar = this.f15235a;
        W.d.r rVar = W.d.r.f15278c;
        gVar.y(rVar);
        W.g.c.c(W.g.c.a(gVar), W.d.q.a(0), i6);
        if (gVar.f15294g == gVar.n(rVar.b()) && gVar.f15295h == gVar.n(rVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = rVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f15294g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(rVar.e(W.d.q.a(i11)));
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = rVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f15295h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.f(W.d.t.a(i13)));
                i12++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void u(int i6, int i10, int i11) {
        W.g gVar = this.f15235a;
        W.d.s sVar = W.d.s.f15279c;
        gVar.y(sVar);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.c(gVarA, W.d.q.a(1), i6);
        W.g.c.c(gVarA, W.d.q.a(0), i10);
        W.g.c.c(gVarA, W.d.q.a(2), i11);
        if (gVar.f15294g == gVar.n(sVar.b()) && gVar.f15295h == gVar.n(sVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = sVar.b();
        int i12 = 0;
        for (int i13 = 0; i13 < iB; i13++) {
            if (((1 << i13) & gVar.f15294g) != 0) {
                if (i12 > 0) {
                    sb.append(", ");
                }
                sb.append(sVar.e(W.d.q.a(i13)));
                i12++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = sVar.d();
        int i14 = 0;
        for (int i15 = 0; i15 < iD; i15++) {
            if (((1 << i15) & gVar.f15295h) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sVar.f(W.d.t.a(i15)));
                i14++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").");
    }

    public final void v(V.Z0 z6) {
        W.g gVar = this.f15235a;
        W.d.v vVar = W.d.v.f15281c;
        gVar.y(vVar);
        W.g.c.d(W.g.c.a(gVar), W.d.t.a(0), z6);
        if (gVar.f15294g == gVar.n(vVar.b()) && gVar.f15295h == gVar.n(vVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = vVar.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = vVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(vVar.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }

    public final void w() {
        this.f15235a.x(W.d.w.f15282c);
    }

    public final void x(int i6, int i10) {
        W.g gVar = this.f15235a;
        W.d.x xVar = W.d.x.f15283c;
        gVar.y(xVar);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.c(gVarA, W.d.q.a(0), i6);
        W.g.c.c(gVarA, W.d.q.a(1), i10);
        if (gVar.f15294g == gVar.n(xVar.b()) && gVar.f15295h == gVar.n(xVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = xVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f15294g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(xVar.e(W.d.q.a(i12)));
                i11++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = xVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f15295h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(xVar.f(W.d.t.a(i14)));
                i13++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + xVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void y() {
        this.f15235a.x(W.d.y.f15284c);
    }

    public final void z(p237x7.a aVar) {
        W.g gVar = this.f15235a;
        W.d.z zVar = W.d.z.f15285c;
        gVar.y(zVar);
        W.g.c.d(W.g.c.a(gVar), W.d.t.a(0), aVar);
        if (gVar.f15294g == gVar.n(zVar.b()) && gVar.f15295h == gVar.n(zVar.d())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iB = zVar.b();
        int i6 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f15294g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.e(W.d.q.a(i10)));
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iD = zVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f15295h) != 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(zVar.f(W.d.t.a(i12)));
                i11++;
            }
        }
        java.lang.String string2 = sb2.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + zVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").");
    }
}
