package p251z0;

/* JADX INFO: renamed from: z0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7377m extends p251z0.C7378n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.ui.d.c f57572c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private D0.InterfaceC0900t f57575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p251z0.C7380p f57576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f57577h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0.b f57573d = new A0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p170r.C7046v f57574e = new p170r.C7046v(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f57578i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f57579j = true;

    public C7377m(androidx.compose.ui.d.c cVar) {
        this.f57572c = cVar;
    }

    private final void j() {
        this.f57574e.b();
        this.f57575f = null;
    }

    private final boolean m(p251z0.C7380p c7380p, p251z0.C7380p c7380p2) {
        if (c7380p == null || c7380p.c().size() != c7380p2.c().size()) {
            return true;
        }
        int size = c7380p2.c().size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!p131n0.g.j(((p251z0.B) c7380p.c().get(i6)).h(), ((p251z0.B) c7380p2.c().get(i6)).h())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0254  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x022a  */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0237  */
    /* JADX WARN: Code duplicated, block: B:98:0x0247  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.d$c] */
    @Override // p251z0.C7378n
    public boolean a(p170r.C7046v c7046v, D0.InterfaceC0900t interfaceC0900t, p251z0.C7372h c7372h, boolean z6) {
        java.lang.Object obj;
        boolean z10;
        int iF;
        p251z0.AbstractC7383t.a aVar;
        int iC;
        int iF2;
        p251z0.AbstractC7383t.a aVar2;
        boolean z11;
        int i6;
        boolean zA = super.a(c7046v, interfaceC0900t, c7372h, z6);
        if (!this.f57572c.A1()) {
            return true;
        }
        ?? G10 = this.f57572c;
        int iA = F0.AbstractC0918f0.a(16);
        ?? bVar = 0;
        while (G10 != 0) {
            if (G10 instanceof F0.v0) {
                this.f57575f = F0.w0.a((F0.v0) G10);
            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                int i10 = 0;
                while (cVarU1 != null) {
                    if ((cVarU1.v1() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            G10 = G10;
                            bVar = bVar;
                            bVar = bVar;
                            G10 = cVarU1;
                        } else {
                            if (bVar == 0) {
                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (G10 != 0) {
                                bVar.d(G10);
                                G10 = 0;
                            }
                            bVar.d(cVarU1);
                        }
                    } else {
                        G10 = G10;
                        bVar = bVar;
                    }
                    cVarU1 = cVarU1.r1();
                    G10 = G10;
                    bVar = bVar;
                }
                if (i10 == 1) {
                    G10 = G10;
                    bVar = bVar;
                } else {
                    G10 = G10;
                    bVar = bVar;
                }
            }
            G10 = F0.AbstractC0925k.g(bVar);
        }
        int iQ = c7046v.q();
        int i11 = 0;
        while (i11 < iQ) {
            long jL = c7046v.l(i11);
            p251z0.B b6 = (p251z0.B) c7046v.r(i11);
            if (this.f57573d.d(jL)) {
                long jK = b6.k();
                i6 = i11;
                long jH = b6.h();
                if (p131n0.g.p(jK) && p131n0.g.p(jH)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(b6.e().size());
                    java.util.List listE = b6.e();
                    int size = listE.size();
                    int i12 = 0;
                    while (i12 < size) {
                        p251z0.C7370f c7370f = (p251z0.C7370f) listE.get(i12);
                        boolean z12 = zA;
                        long jB = c7370f.b();
                        if (p131n0.g.p(jB)) {
                            long jC = c7370f.c();
                            D0.InterfaceC0900t interfaceC0900t2 = this.f57575f;
                            p247y7.AbstractC7350t.c(interfaceC0900t2);
                            arrayList.add(new p251z0.C7370f(jC, interfaceC0900t2.G(interfaceC0900t, jB), c7370f.a(), null));
                        }
                        i12++;
                        listE = listE;
                        size = size;
                        zA = z12;
                    }
                    z11 = zA;
                    p170r.C7046v c7046v2 = this.f57574e;
                    D0.InterfaceC0900t interfaceC0900t3 = this.f57575f;
                    p247y7.AbstractC7350t.c(interfaceC0900t3);
                    long jG = interfaceC0900t3.G(interfaceC0900t, jK);
                    D0.InterfaceC0900t interfaceC0900t4 = this.f57575f;
                    p247y7.AbstractC7350t.c(interfaceC0900t4);
                    c7046v2.m(jL, b6.b((731 & 1) != 0 ? b6.f57459a : 0L, (731 & 2) != 0 ? b6.f57460b : 0L, (731 & 4) != 0 ? b6.f57461c : interfaceC0900t4.G(interfaceC0900t, jH), (731 & 8) != 0 ? b6.f57462d : false, (731 & 16) != 0 ? b6.f57464f : 0L, (731 & 32) != 0 ? b6.f57465g : jG, (731 & 64) != 0 ? b6.f57466h : false, (731 & 128) != 0 ? b6.f57467i : 0, arrayList, (731 & 512) != 0 ? b6.f57468j : 0L));
                } else {
                    z11 = zA;
                }
            } else {
                z11 = zA;
                i6 = i11;
            }
            i11 = i6 + 1;
            iQ = iQ;
            zA = z11;
        }
        boolean z13 = zA;
        if (this.f57574e.k()) {
            this.f57573d.c();
            g().j();
            return true;
        }
        for (int iF3 = this.f57573d.f() - 1; -1 < iF3; iF3--) {
            if (!c7046v.d(this.f57573d.e(iF3))) {
                this.f57573d.j(iF3);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f57574e.q());
        int iQ2 = this.f57574e.q();
        for (int i13 = 0; i13 < iQ2; i13++) {
            arrayList2.add(this.f57574e.r(i13));
        }
        p251z0.C7380p c7380p = new p251z0.C7380p(arrayList2, c7372h);
        java.util.List listC = c7380p.c();
        int size2 = listC.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj = null;
                break;
            }
            java.lang.Object obj2 = listC.get(i14);
            if (c7372h.a(((p251z0.B) obj2).f())) {
                obj = obj2;
                break;
            }
            i14++;
        }
        p251z0.B b10 = (p251z0.B) obj;
        if (b10 != null) {
            if (z6) {
                if (!this.f57578i && (b10.i() || b10.l())) {
                    D0.InterfaceC0900t interfaceC0900t5 = this.f57575f;
                    p247y7.AbstractC7350t.c(interfaceC0900t5);
                    z10 = true;
                    this.f57578i = !p251z0.AbstractC7381q.e(b10, interfaceC0900t5.a());
                }
                if (this.f57578i != this.f57577h) {
                    iF2 = c7380p.f();
                    aVar2 = p251z0.AbstractC7383t.f57591a;
                    if (p251z0.AbstractC7383t.i(iF2, aVar2.c()) && !p251z0.AbstractC7383t.i(c7380p.f(), aVar2.a()) && !p251z0.AbstractC7383t.i(c7380p.f(), aVar2.b())) {
                        iF = c7380p.f();
                        aVar = p251z0.AbstractC7383t.f57591a;
                        if ((p251z0.AbstractC7383t.i(iF, aVar.a()) && this.f57577h && !this.f57579j) || (p251z0.AbstractC7383t.i(c7380p.f(), aVar.b()) && this.f57578i && b10.i())) {
                            iC = aVar.c();
                        }
                    } else if (this.f57578i) {
                        iC = aVar2.a();
                    } else {
                        iC = aVar2.b();
                    }
                    c7380p.g(iC);
                } else {
                    iF = c7380p.f();
                    aVar = p251z0.AbstractC7383t.f57591a;
                    if (p251z0.AbstractC7383t.i(iF, aVar.a())) {
                        iC = aVar.c();
                        c7380p.g(iC);
                    } else {
                        iC = aVar.c();
                        c7380p.g(iC);
                    }
                }
            } else {
                this.f57578i = false;
            }
            z10 = true;
            if (this.f57578i != this.f57577h) {
                iF2 = c7380p.f();
                aVar2 = p251z0.AbstractC7383t.f57591a;
                if (p251z0.AbstractC7383t.i(iF2, aVar2.c())) {
                }
                if (this.f57578i) {
                    iC = aVar2.a();
                } else {
                    iC = aVar2.b();
                }
                c7380p.g(iC);
            } else {
                iF = c7380p.f();
                aVar = p251z0.AbstractC7383t.f57591a;
                if (p251z0.AbstractC7383t.i(iF, aVar.a())) {
                    iC = aVar.c();
                    c7380p.g(iC);
                } else {
                    iC = aVar.c();
                    c7380p.g(iC);
                }
            }
        } else {
            z10 = true;
        }
        boolean z14 = (z13 || !p251z0.AbstractC7383t.i(c7380p.f(), p251z0.AbstractC7383t.f57591a.c()) || m(this.f57576g, c7380p)) ? z10 : false;
        this.f57576g = c7380p;
        return z14;
    }

    @Override // p251z0.C7378n
    public void b(p251z0.C7372h c7372h) {
        super.b(c7372h);
        p251z0.C7380p c7380p = this.f57576g;
        if (c7380p == null) {
            return;
        }
        this.f57577h = this.f57578i;
        java.util.List listC = c7380p.c();
        int size = listC.size();
        for (int i6 = 0; i6 < size; i6++) {
            p251z0.B b6 = (p251z0.B) listC.get(i6);
            boolean z6 = !b6.i();
            boolean z10 = !c7372h.a(b6.f());
            boolean z11 = !this.f57578i;
            if ((z6 && z10) || (z6 && z11)) {
                this.f57573d.i(b6.f());
            }
        }
        this.f57578i = false;
        this.f57579j = p251z0.AbstractC7383t.i(c7380p.f(), p251z0.AbstractC7383t.f57591a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // p251z0.C7378n
    public void d() {
        X.b bVarG = g();
        int iT = bVarG.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarG.s();
            int i6 = 0;
            do {
                ((p251z0.C7377m) objArrS[i6]).d();
                i6++;
            } while (i6 < iT);
        }
        ?? G10 = this.f57572c;
        int iA = F0.AbstractC0918f0.a(16);
        ?? bVar = 0;
        while (G10 != 0) {
            if (G10 instanceof F0.v0) {
                ((F0.v0) G10).g0();
            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                int i10 = 0;
                while (cVarU1 != null) {
                    if ((cVarU1.v1() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            G10 = G10;
                            bVar = bVar;
                            bVar = bVar;
                            G10 = cVarU1;
                        } else {
                            if (bVar == 0) {
                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (G10 != 0) {
                                bVar.d(G10);
                                G10 = 0;
                            }
                            bVar.d(cVarU1);
                        }
                    } else {
                        G10 = G10;
                        bVar = bVar;
                    }
                    cVarU1 = cVarU1.r1();
                    G10 = G10;
                    bVar = bVar;
                }
                if (i10 == 1) {
                    G10 = G10;
                    bVar = bVar;
                } else {
                    G10 = G10;
                    bVar = bVar;
                }
            }
            G10 = F0.AbstractC0925k.g(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p251z0.C7378n
    public boolean e(p251z0.C7372h c7372h) {
        X.b bVarG;
        int iT;
        boolean z6 = false;
        int i6 = 0;
        z6 = false;
        if (!this.f57574e.k() && this.f57572c.A1()) {
            p251z0.C7380p c7380p = this.f57576g;
            p247y7.AbstractC7350t.c(c7380p);
            D0.InterfaceC0900t interfaceC0900t = this.f57575f;
            p247y7.AbstractC7350t.c(interfaceC0900t);
            long jA = interfaceC0900t.a();
            ?? G10 = this.f57572c;
            int iA = F0.AbstractC0918f0.a(16);
            ?? bVar = 0;
            while (G10 != 0) {
                if (G10 instanceof F0.v0) {
                    ((F0.v0) G10).w0(c7380p, p251z0.r.Final, jA);
                } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                    androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                    int i10 = 0;
                    while (cVarU1 != null) {
                        if ((cVarU1.v1() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                G10 = G10;
                                bVar = bVar;
                                bVar = bVar;
                                G10 = cVarU1;
                            } else {
                                if (bVar == 0) {
                                    bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                }
                                if (G10 != 0) {
                                    bVar.d(G10);
                                    G10 = 0;
                                }
                                bVar.d(cVarU1);
                            }
                        } else {
                            G10 = G10;
                            bVar = bVar;
                        }
                        cVarU1 = cVarU1.r1();
                        G10 = G10;
                        bVar = bVar;
                    }
                    if (i10 == 1) {
                        G10 = G10;
                        bVar = bVar;
                    } else {
                        G10 = G10;
                        bVar = bVar;
                    }
                }
                G10 = F0.AbstractC0925k.g(bVar);
            }
            if (this.f57572c.A1() && (iT = (bVarG = g()).t()) > 0) {
                java.lang.Object[] objArrS = bVarG.s();
                do {
                    ((p251z0.C7377m) objArrS[i6]).e(c7372h);
                    i6++;
                } while (i6 < iT);
            }
            z6 = true;
        }
        b(c7372h);
        j();
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.b] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.b] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p251z0.C7378n
    public boolean f(p170r.C7046v c7046v, D0.InterfaceC0900t interfaceC0900t, p251z0.C7372h c7372h, boolean z6) {
        X.b bVarG;
        int iT;
        if (this.f57574e.k() || !this.f57572c.A1()) {
            return false;
        }
        p251z0.C7380p c7380p = this.f57576g;
        p247y7.AbstractC7350t.c(c7380p);
        D0.InterfaceC0900t interfaceC0900t2 = this.f57575f;
        p247y7.AbstractC7350t.c(interfaceC0900t2);
        long jA = interfaceC0900t2.a();
        ?? G10 = this.f57572c;
        int iA = F0.AbstractC0918f0.a(16);
        ?? bVar = 0;
        while (G10 != 0) {
            if (G10 instanceof F0.v0) {
                ((F0.v0) G10).w0(c7380p, p251z0.r.Initial, jA);
            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                int i6 = 0;
                while (cVarU1 != null) {
                    if ((cVarU1.v1() & iA) != 0) {
                        i6++;
                        if (i6 == 1) {
                            G10 = G10;
                            bVar = bVar;
                            bVar = bVar;
                            G10 = cVarU1;
                        } else {
                            if (bVar == 0) {
                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (G10 != 0) {
                                bVar.d(G10);
                                G10 = 0;
                            }
                            bVar.d(cVarU1);
                        }
                    } else {
                        G10 = G10;
                        bVar = bVar;
                    }
                    cVarU1 = cVarU1.r1();
                    G10 = G10;
                    bVar = bVar;
                }
                if (i6 == 1) {
                    G10 = G10;
                    bVar = bVar;
                } else {
                    G10 = G10;
                    bVar = bVar;
                }
            }
            G10 = F0.AbstractC0925k.g(bVar);
        }
        if (this.f57572c.A1() && (iT = (bVarG = g()).t()) > 0) {
            java.lang.Object[] objArrS = bVarG.s();
            int i10 = 0;
            do {
                p251z0.C7377m c7377m = (p251z0.C7377m) objArrS[i10];
                p170r.C7046v c7046v2 = this.f57574e;
                D0.InterfaceC0900t interfaceC0900t3 = this.f57575f;
                p247y7.AbstractC7350t.c(interfaceC0900t3);
                c7377m.f(c7046v2, interfaceC0900t3, c7372h, z6);
                i10++;
            } while (i10 < iT);
        }
        if (this.f57572c.A1()) {
            ?? G11 = this.f57572c;
            int iA2 = F0.AbstractC0918f0.a(16);
            ?? bVar2 = 0;
            while (G11 != 0) {
                if (G11 instanceof F0.v0) {
                    ((F0.v0) G11).w0(c7380p, p251z0.r.Main, jA);
                } else if ((G11.v1() & iA2) != 0 && (G11 instanceof F0.AbstractC0927m)) {
                    androidx.compose.ui.d.c cVarU2 = ((F0.AbstractC0927m) G11).U1();
                    int i11 = 0;
                    while (cVarU2 != null) {
                        if ((cVarU2.v1() & iA2) != 0) {
                            i11++;
                            if (i11 == 1) {
                                bVar2 = bVar2;
                                G11 = G11;
                                bVar2 = bVar2;
                                G11 = cVarU2;
                            } else {
                                if (bVar2 == 0) {
                                    bVar2 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                }
                                if (G11 != 0) {
                                    bVar2.d(G11);
                                    G11 = 0;
                                }
                                bVar2.d(cVarU2);
                            }
                        } else {
                            bVar2 = bVar2;
                            G11 = G11;
                        }
                        cVarU2 = cVarU2.r1();
                        bVar2 = bVar2;
                        G11 = G11;
                    }
                    if (i11 == 1) {
                        bVar2 = bVar2;
                        G11 = G11;
                    } else {
                        bVar2 = bVar2;
                        G11 = G11;
                    }
                }
                G11 = F0.AbstractC0925k.g(bVar2);
            }
        }
        return true;
    }

    @Override // p251z0.C7378n
    public void i(long j6, p170r.I i6) {
        if (this.f57573d.d(j6) && !i6.a(this)) {
            this.f57573d.h(j6);
            this.f57574e.n(j6);
        }
        X.b bVarG = g();
        int iT = bVarG.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarG.s();
            int i10 = 0;
            do {
                ((p251z0.C7377m) objArrS[i10]).i(j6, i6);
                i10++;
            } while (i10 < iT);
        }
    }

    public final androidx.compose.ui.d.c k() {
        return this.f57572c;
    }

    public final A0.b l() {
        return this.f57573d;
    }

    public final void n() {
        this.f57578i = true;
    }

    public java.lang.String toString() {
        return "Node(pointerInputFilter=" + this.f57572c + ", children=" + g() + ", pointerIds=" + this.f57573d + ')';
    }
}
