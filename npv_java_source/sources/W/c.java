package W;

/* JADX INFO: loaded from: classes.dex */
public final class c extends W.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W.g f15250a = new W.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W.g f15251b = new W.g();

    public final void a() {
        this.f15251b.m();
        this.f15250a.m();
    }

    public final void b(p237x7.a aVar, int i6, V.C1704d c1704d) {
        W.g gVar = this.f15250a;
        W.d.n nVar = W.d.n.f15275c;
        gVar.y(nVar);
        W.g gVarA = W.g.c.a(gVar);
        W.g.c.d(gVarA, W.d.t.a(0), aVar);
        W.g.c.c(gVarA, W.d.q.a(0), i6);
        int i10 = 1;
        W.g.c.d(gVarA, W.d.t.a(1), c1704d);
        if (!(gVar.f15294g == gVar.n(nVar.b()) && gVar.f15295h == gVar.n(nVar.d()))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int iB = nVar.b();
            int i11 = 0;
            int i12 = 0;
            while (i12 < iB) {
                if (((i10 << i12) & gVar.f15294g) != 0) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(nVar.e(W.d.q.a(i12)));
                    i11++;
                }
                i12++;
                i10 = 1;
            }
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int iD = nVar.d();
            int i13 = 0;
            int i14 = 0;
            while (i14 < iD) {
                if (((1 << i14) & gVar.f15295h) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.f(W.d.t.a(i14)));
                    i13++;
                }
                i14++;
                gVar = gVar;
            }
            java.lang.String string2 = sb2.toString();
            p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
            V.I0.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
        }
        W.g gVar2 = this.f15251b;
        W.d.u uVar = W.d.u.f15280c;
        gVar2.y(uVar);
        W.g gVarA2 = W.g.c.a(gVar2);
        W.g.c.c(gVarA2, W.d.q.a(0), i6);
        W.g.c.d(gVarA2, W.d.t.a(0), c1704d);
        if (gVar2.f15294g == gVar2.n(uVar.b()) && gVar2.f15295h == gVar2.n(uVar.d())) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int iB2 = uVar.b();
        int i15 = 0;
        for (int i16 = 0; i16 < iB2; i16++) {
            if (((1 << i16) & gVar2.f15294g) != 0) {
                if (i15 > 0) {
                    sb3.append(", ");
                }
                sb3.append(uVar.e(W.d.q.a(i16)));
                i15++;
            }
        }
        java.lang.String string3 = sb3.toString();
        p247y7.AbstractC7350t.e(string3, "StringBuilder().apply(builderAction).toString()");
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        int iD2 = uVar.d();
        int i17 = 0;
        int i18 = 0;
        while (i18 < iD2) {
            if (((1 << i18) & gVar2.f15295h) != 0) {
                if (i15 > 0) {
                    sb4.append(", ");
                }
                sb4.append(uVar.f(W.d.t.a(i18)));
                i17++;
            }
            i18++;
            gVar2 = gVar2;
        }
        java.lang.String string4 = sb4.toString();
        p247y7.AbstractC7350t.e(string4, "StringBuilder().apply(builderAction).toString()");
        V.I0.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i15 + " int arguments (" + string3 + ") and " + i17 + " object arguments (" + string4 + ").");
    }

    public final void c() {
        if (!this.f15251b.u()) {
            V.AbstractC1741q.r("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f15251b.w(this.f15250a);
    }

    public final void d(V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
        if (!this.f15251b.t()) {
            V.AbstractC1741q.r("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f15250a.r(interfaceC1713g, c1727k1, y6);
    }

    public final boolean e() {
        return this.f15250a.t();
    }

    public final void f(java.lang.Object obj, p237x7.p pVar) {
        W.g gVar = this.f15250a;
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
}
