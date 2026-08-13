package V;

/* JADX INFO: renamed from: V.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1748u implements V.G, V.InterfaceC1700b1, V.T0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.AbstractC1744s f15018C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final V.InterfaceC1713g f15019D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f15020E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Object f15021F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.Set f15022G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final V.C1718h1 f15023H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final X.f f15024I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p170r.L f15025J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p170r.L f15026K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final X.f f15027L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final W.a f15028M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final W.a f15029N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final X.f f15030O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private X.f f15031P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f15032Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private V.C1748u f15033R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f15034S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final V.B f15035T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final V.C1737o f15036U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p127m7.i f15037V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final boolean f15038W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f15039X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private p237x7.p f15040Y;

    /* JADX INFO: renamed from: V.u$a */
    private static final class a implements V.Y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f15041a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p170r.L f15045e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f15042b = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f15043c = new java.util.ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f15044d = new java.util.ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.util.List f15046f = new java.util.ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p170r.B f15047g = new p170r.B(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final p170r.B f15048h = new p170r.B(0, 1, null);

        public a(java.util.Set set) {
            this.f15041a = set;
        }

        private final void i(int i6) {
            int i10 = 0;
            if (!this.f15046f.isEmpty()) {
                int i11 = 0;
                java.util.List listS = null;
                p170r.B b6 = null;
                p170r.B b10 = null;
                while (i11 < this.f15048h.b()) {
                    if (i6 <= this.f15048h.a(i11)) {
                        java.lang.Object objRemove = this.f15046f.remove(i11);
                        int iL = this.f15048h.l(i11);
                        int iL2 = this.f15047g.l(i11);
                        if (listS == null) {
                            listS = p097j7.AbstractC6879v.s(objRemove);
                            b10 = new p170r.B(0, 1, null);
                            b10.g(iL);
                            b6 = new p170r.B(0, 1, null);
                        } else {
                            p247y7.AbstractC7350t.d(b6, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            p247y7.AbstractC7350t.d(b10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            listS.add(objRemove);
                            b10.g(iL);
                        }
                        b6.g(iL2);
                    } else {
                        i11++;
                    }
                }
                if (listS != null) {
                    p247y7.AbstractC7350t.d(b6, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    p247y7.AbstractC7350t.d(b10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    int size = listS.size() - 1;
                    while (i10 < size) {
                        int i12 = i10 + 1;
                        int size2 = listS.size();
                        for (int i13 = i12; i13 < size2; i13++) {
                            int iA = b10.a(i10);
                            int iA2 = b10.a(i13);
                            if (iA < iA2 || (iA2 == iA && b6.a(i10) < b6.a(i13))) {
                                V.AbstractC1750v.f(listS, i10, i13);
                                V.AbstractC1750v.g(b6, i10, i13);
                                V.AbstractC1750v.g(b10, i10, i13);
                            }
                        }
                        i10 = i12;
                    }
                    this.f15043c.addAll(listS);
                }
            }
        }

        private final void j(java.lang.Object obj, int i6, int i10, int i11) {
            i(i6);
            if (i11 < 0 || i11 >= i6) {
                this.f15043c.add(obj);
                return;
            }
            this.f15046f.add(obj);
            this.f15047g.g(i10);
            this.f15048h.g(i11);
        }

        @Override // V.Y0
        public void a(V.Z0 z6, int i6, int i10, int i11) {
            j(z6, i6, i10, i11);
        }

        @Override // V.Y0
        public void b(V.InterfaceC1728l interfaceC1728l, int i6, int i10, int i11) {
            p170r.L lA = this.f15045e;
            if (lA == null) {
                lA = p170r.X.a();
                this.f15045e = lA;
            }
            lA.v(interfaceC1728l);
            j(interfaceC1728l, i6, i10, i11);
        }

        @Override // V.Y0
        public void c(V.InterfaceC1728l interfaceC1728l, int i6, int i10, int i11) {
            j(interfaceC1728l, i6, i10, i11);
        }

        @Override // V.Y0
        public void d(V.Z0 z6) {
            this.f15042b.add(z6);
        }

        @Override // V.Y0
        public void e(p237x7.a aVar) {
            this.f15044d.add(aVar);
        }

        public final void f() {
            if (!this.f15041a.isEmpty()) {
                java.lang.Object objA = V.K1.f14689a.a("Compose:abandons");
                try {
                    java.util.Iterator it = this.f15041a.iterator();
                    while (it.hasNext()) {
                        V.Z0 z6 = (V.Z0) it.next();
                        it.remove();
                        z6.b();
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } finally {
                    V.K1.f14689a.b(objA);
                }
            }
        }

        public final void g() {
            i(Integer.MIN_VALUE);
            if (!this.f15043c.isEmpty()) {
                java.lang.Object objA = V.K1.f14689a.a("Compose:onForgotten");
                try {
                    p170r.L l6 = this.f15045e;
                    for (int size = this.f15043c.size() - 1; -1 < size; size--) {
                        java.lang.Object obj = this.f15043c.get(size);
                        if (obj instanceof V.Z0) {
                            this.f15041a.remove(obj);
                            ((V.Z0) obj).c();
                        }
                        if (obj instanceof V.InterfaceC1728l) {
                            if (l6 == null || !l6.a(obj)) {
                                ((V.InterfaceC1728l) obj).i();
                            } else {
                                ((V.InterfaceC1728l) obj).f();
                            }
                        }
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                    V.K1.f14689a.b(objA);
                } catch (java.lang.Throwable th) {
                    V.K1.f14689a.b(objA);
                    throw th;
                }
            }
            if (!this.f15042b.isEmpty()) {
                java.lang.Object objA2 = V.K1.f14689a.a("Compose:onRemembered");
                try {
                    java.util.List list = this.f15042b;
                    int size2 = list.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        V.Z0 z6 = (V.Z0) list.get(i6);
                        this.f15041a.remove(z6);
                        z6.d();
                    }
                    p087i7.M m10 = p087i7.M.f46721a;
                } finally {
                    V.K1.f14689a.b(objA2);
                }
            }
        }

        public final void h() {
            if (!this.f15044d.isEmpty()) {
                java.lang.Object objA = V.K1.f14689a.a("Compose:sideeffects");
                try {
                    java.util.List list = this.f15044d;
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((p237x7.a) list.get(i6)).b();
                    }
                    this.f15044d.clear();
                    p087i7.M m6 = p087i7.M.f46721a;
                } finally {
                    V.K1.f14689a.b(objA);
                }
            }
        }
    }

    public C1748u(V.AbstractC1744s abstractC1744s, V.InterfaceC1713g interfaceC1713g, p127m7.i iVar) {
        this.f15018C = abstractC1744s;
        this.f15019D = interfaceC1713g;
        this.f15020E = new java.util.concurrent.atomic.AtomicReference(null);
        this.f15021F = new java.lang.Object();
        java.util.Set setL = new p170r.L(0, 1, null).l();
        this.f15022G = setL;
        V.C1718h1 c1718h1 = new V.C1718h1();
        if (abstractC1744s.c()) {
            c1718h1.o();
        }
        if (abstractC1744s.e()) {
            c1718h1.s();
        }
        this.f15023H = c1718h1;
        this.f15024I = new X.f();
        this.f15025J = new p170r.L(0, 1, null);
        this.f15026K = new p170r.L(0, 1, null);
        this.f15027L = new X.f();
        W.a aVar = new W.a();
        this.f15028M = aVar;
        W.a aVar2 = new W.a();
        this.f15029N = aVar2;
        this.f15030O = new X.f();
        this.f15031P = new X.f();
        this.f15035T = new V.B(null, false, 3, null);
        V.C1737o c1737o = new V.C1737o(interfaceC1713g, abstractC1744s, c1718h1, setL, aVar, aVar2, this);
        abstractC1744s.n(c1737o);
        this.f15036U = c1737o;
        this.f15037V = iVar;
        this.f15038W = abstractC1744s instanceof V.U0;
        this.f15040Y = V.C1722j.f14896a.a();
    }

    public /* synthetic */ C1748u(V.AbstractC1744s abstractC1744s, V.InterfaceC1713g interfaceC1713g, p127m7.i iVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC1744s, interfaceC1713g, (i6 & 4) != 0 ? null : iVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7  */
    private final void A(W.a aVar) throws java.lang.Throwable {
        V.C1748u.a aVar2;
        boolean z6;
        long[] jArr;
        int i6;
        V.C1748u.a aVar3;
        long[] jArr2;
        int i10;
        int i11;
        char c6;
        long j6;
        int i12;
        boolean zD;
        long[] jArr3;
        long[] jArr4;
        V.C1748u c1748u = this;
        boolean z10 = true;
        V.C1748u.a aVar4 = new V.C1748u.a(c1748u.f15022G);
        try {
            if (aVar.c()) {
                if (c1748u.f15029N.c()) {
                    aVar4.f();
                    return;
                }
                return;
            }
            V.K1 k6 = V.K1.f14689a;
            java.lang.Object objA = k6.a("Compose:applyChanges");
            c1748u.f15019D.e();
            V.C1727k1 c1727k1V = c1748u.f15023H.V();
            int i13 = 0;
            try {
                aVar.b(c1748u.f15019D, c1727k1V, aVar4);
                p087i7.M m6 = p087i7.M.f46721a;
                c1727k1V.L(true);
                c1748u.f15019D.i();
                k6.b(objA);
                aVar4.g();
                aVar4.h();
                if (c1748u.f15032Q) {
                    try {
                        try {
                            java.lang.Object objA2 = k6.a("Compose:unobserve");
                            try {
                                c1748u.f15032Q = false;
                                p170r.K kD = c1748u.f15024I.d();
                                long[] jArr5 = kD.f53333a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j10 = jArr5[i14];
                                        char c10 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            while (i13 < i16) {
                                                if ((j10 & 255) < 128) {
                                                    int i17 = (i14 << 3) + i13;
                                                    java.lang.Object obj = kD.f53334b[i17];
                                                    java.lang.Object obj2 = kD.f53335c[i17];
                                                    if (obj2 instanceof p170r.L) {
                                                        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        p170r.L l6 = (p170r.L) obj2;
                                                        java.lang.Object[] objArr = l6.f53341b;
                                                        long[] jArr6 = l6.f53340a;
                                                        int length2 = jArr6.length - 2;
                                                        aVar3 = aVar4;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i18 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr6[i18];
                                                                    i10 = length;
                                                                    i11 = i14;
                                                                    c6 = 7;
                                                                    j6 = -9187201950435737472L;
                                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                        int i20 = 0;
                                                                        while (i20 < i19) {
                                                                            if ((j12 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i21 = (i18 << 3) + i20;
                                                                                if (!((V.R0) objArr[i21]).r()) {
                                                                                    l6.y(i21);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j12 >>= 8;
                                                                            i20++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        if (i19 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                    }
                                                                    if (i18 == length2) {
                                                                        break;
                                                                    }
                                                                    i18++;
                                                                    length = i10;
                                                                    i14 = i11;
                                                                    jArr6 = jArr3;
                                                                } catch (java.lang.Throwable th) {
                                                                    th = th;
                                                                    V.K1.f14689a.b(objA2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i10 = length;
                                                            i11 = i14;
                                                            c6 = 7;
                                                            j6 = -9187201950435737472L;
                                                        }
                                                        zD = l6.d();
                                                    } else {
                                                        aVar3 = aVar4;
                                                        jArr2 = jArr5;
                                                        i10 = length;
                                                        i11 = i14;
                                                        c6 = c10;
                                                        j6 = -9187201950435737472L;
                                                        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        zD = !((V.R0) obj2).r();
                                                    }
                                                    if (zD) {
                                                        kD.q(i17);
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    aVar3 = aVar4;
                                                    jArr2 = jArr5;
                                                    i10 = length;
                                                    i11 = i14;
                                                    c6 = c10;
                                                    j6 = j11;
                                                    i12 = i15;
                                                }
                                                j10 >>= i12;
                                                i13++;
                                                i15 = i12;
                                                z10 = true;
                                                c10 = c6;
                                                j11 = j6;
                                                jArr5 = jArr2;
                                                aVar4 = aVar3;
                                                length = i10;
                                                i14 = i11;
                                            }
                                            z6 = z10;
                                            aVar2 = aVar4;
                                            jArr = jArr5;
                                            int i22 = length;
                                            int i23 = i14;
                                            if (i16 != i15) {
                                                break;
                                            }
                                            length = i22;
                                            i6 = i23;
                                        } else {
                                            z6 = z10;
                                            aVar2 = aVar4;
                                            jArr = jArr5;
                                            i6 = i14;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i14 = i6 + 1;
                                        z10 = z6;
                                        jArr5 = jArr;
                                        aVar4 = aVar2;
                                        i13 = 0;
                                    }
                                } else {
                                    aVar2 = aVar4;
                                }
                                B();
                                p087i7.M m10 = p087i7.M.f46721a;
                                V.K1.f14689a.b(objA2);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            aVar4 = aVar4;
                            c1748u = this;
                            if (c1748u.f15029N.c()) {
                                aVar4.f();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        c1748u = this;
                        if (c1748u.f15029N.c()) {
                            aVar4.f();
                        }
                        throw th;
                    }
                } else {
                    aVar2 = aVar4;
                }
                if (this.f15029N.c()) {
                    aVar2.f();
                    return;
                }
                return;
            } catch (java.lang.Throwable th5) {
                try {
                    c1727k1V.L(false);
                    throw th5;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        V.K1.f14689a.b(objA);
                        throw th;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            aVar4 = aVar4;
        }
        if (c1748u.f15029N.c()) {
            aVar4.f();
        }
        throw th;
    }

    private final void B() {
        long[] jArr;
        long[] jArr2;
        int i6;
        int i10;
        int i11;
        boolean zD;
        java.lang.Object[] objArr;
        long[] jArr3;
        java.lang.Object[] objArr2;
        long[] jArr4;
        p170r.K kD = this.f15027L.d();
        long[] jArr5 = kD.f53333a;
        int length = jArr5.length - 2;
        long j6 = 255;
        char c6 = 7;
        long j10 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j11 = jArr5[i13];
                if ((((~j11) << c6) & j11 & j10) != j10) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & j6) < 128) {
                            int i16 = (i13 << 3) + i15;
                            java.lang.Object obj = kD.f53334b[i16];
                            java.lang.Object obj2 = kD.f53335c[i16];
                            if (obj2 instanceof p170r.L) {
                                p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                p170r.L l6 = (p170r.L) obj2;
                                java.lang.Object[] objArr3 = l6.f53341b;
                                long[] jArr6 = l6.f53340a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i6 = length;
                                if (length2 >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j12 = jArr6[i17];
                                        i10 = i14;
                                        i11 = i15;
                                        if ((((~j12) << c6) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j12 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                    if (!this.f15024I.c((V.J) objArr3[i20])) {
                                                        l6.y(i20);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                }
                                                j12 >>= 8;
                                                i19++;
                                                jArr6 = jArr4;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i18 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        i14 = i10;
                                        i15 = i11;
                                        jArr6 = jArr3;
                                        objArr3 = objArr;
                                        c6 = 7;
                                    }
                                } else {
                                    i10 = i14;
                                    i11 = i15;
                                }
                                zD = l6.d();
                            } else {
                                jArr2 = jArr5;
                                i6 = length;
                                i10 = i14;
                                i11 = i15;
                                p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zD = !this.f15024I.c((V.J) obj2);
                            }
                            if (zD) {
                                kD.q(i16);
                            }
                        } else {
                            jArr2 = jArr5;
                            i6 = length;
                            i10 = i14;
                            i11 = i15;
                        }
                        j11 >>= 8;
                        i15 = i11 + 1;
                        i12 = 8;
                        jArr5 = jArr2;
                        length = i6;
                        i14 = i10;
                        j6 = 255;
                        c6 = 7;
                    }
                    jArr = jArr5;
                    int i21 = length;
                    if (i14 != i12) {
                        break;
                    } else {
                        length = i21;
                    }
                } else {
                    jArr = jArr5;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                jArr5 = jArr;
                j6 = 255;
                c6 = 7;
                j10 = -9187201950435737472L;
                i12 = 8;
            }
        }
        if (!this.f15026K.e()) {
            return;
        }
        p170r.L l10 = this.f15026K;
        java.lang.Object[] objArr4 = l10.f53341b;
        long[] jArr7 = l10.f53340a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j13 = jArr7[i22];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i23 = 8 - ((~(i22 - length3)) >>> 31);
                for (int i24 = 0; i24 < i23; i24++) {
                    if ((j13 & 255) < 128) {
                        int i25 = (i22 << 3) + i24;
                        if (!((V.R0) objArr4[i25]).t()) {
                            l10.y(i25);
                        }
                    }
                    j13 >>= 8;
                }
                if (i23 != 8) {
                    return;
                }
            }
            if (i22 == length3) {
                return;
            } else {
                i22++;
            }
        }
    }

    private final void C(p237x7.p pVar) {
        if (!(!this.f15039X)) {
            V.I0.b("The composition is disposed");
        }
        this.f15040Y = pVar;
        this.f15018C.a(this, pVar);
    }

    private final void D() {
        java.lang.Object andSet = this.f15020E.getAndSet(V.AbstractC1750v.f15049a);
        if (andSet != null) {
            if (p247y7.AbstractC7350t.b(andSet, V.AbstractC1750v.f15049a)) {
                V.AbstractC1741q.s("pending composition has not been applied");
                throw new p087i7.C6665k();
            }
            if (andSet instanceof java.util.Set) {
                y((java.util.Set) andSet, true);
                return;
            }
            if (!(andSet instanceof java.lang.Object[])) {
                V.AbstractC1741q.s("corrupt pendingModifications drain: " + this.f15020E);
                throw new p087i7.C6665k();
            }
            for (java.util.Set set : (java.util.Set[]) andSet) {
                y(set, true);
            }
        }
    }

    private final void E() {
        java.lang.Object andSet = this.f15020E.getAndSet(null);
        if (p247y7.AbstractC7350t.b(andSet, V.AbstractC1750v.f15049a)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            y((java.util.Set) andSet, false);
            return;
        }
        if (andSet instanceof java.lang.Object[]) {
            for (java.util.Set set : (java.util.Set[]) andSet) {
                y(set, false);
            }
            return;
        }
        if (andSet == null) {
            V.AbstractC1741q.s("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new p087i7.C6665k();
        }
        V.AbstractC1741q.s("corrupt pendingModifications drain: " + this.f15020E);
        throw new p087i7.C6665k();
    }

    private final boolean F() {
        return this.f15036U.B0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[Catch: all -> 0x001e, LOOP:0: B:33:0x0060->B:48:0x009f, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x0036, B:23:0x003b, B:25:0x003f, B:26:0x0044, B:28:0x0050, B:30:0x0054, B:33:0x0060, B:35:0x0070, B:37:0x007c, B:39:0x0086, B:44:0x0095, B:48:0x009f, B:49:0x00a2, B:52:0x00a7), top: B:64:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7 A[Catch: all -> 0x001e, EDGE_INSN: B:52:0x00a7->B:53:0x00ac BREAK  A[LOOP:0: B:33:0x0060->B:48:0x009f], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x0036, B:23:0x003b, B:25:0x003f, B:26:0x0044, B:28:0x0050, B:30:0x0054, B:33:0x0060, B:35:0x0070, B:37:0x007c, B:39:0x0086, B:44:0x0095, B:48:0x009f, B:49:0x00a2, B:52:0x00a7), top: B:64:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a7 A[SYNTHETIC] */
    private final V.EnumC1696a0 H(V.R0 r6, V.C1704d c1704d, java.lang.Object obj) {
        int i6;
        synchronized (this.f15021F) {
            try {
                V.C1748u c1748u = this.f15033R;
                V.C1748u c1748u2 = null;
                if (c1748u != null) {
                    if (!this.f15023H.T(this.f15034S, c1704d)) {
                        c1748u = null;
                    }
                    c1748u2 = c1748u;
                }
                if (c1748u2 == null) {
                    if (N(r6, obj)) {
                        return V.EnumC1696a0.IMMINENT;
                    }
                    J();
                    if (obj != null && (obj instanceof V.J)) {
                        java.lang.Object objC = this.f15031P.d().c(r6);
                        if (objC != null) {
                            if (!(objC instanceof p170r.L)) {
                                if (objC != V.C1706d1.f14849a) {
                                    this.f15031P.a(r6, obj);
                                    break;
                                }
                            } else {
                                p170r.L l6 = (p170r.L) objC;
                                java.lang.Object[] objArr = l6.f53341b;
                                long[] jArr = l6.f53340a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    this.f15031P.a(r6, obj);
                                    break;
                                }
                                int i10 = 0;
                                loop0: while (true) {
                                    long j6 = jArr[i10];
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i10 == length) {
                                            this.f15031P.a(r6, obj);
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        int i11 = 8;
                                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j6 & 255) >= 128) {
                                                i6 = i11;
                                            } else {
                                                if (objArr[(i10 << 3) + i13] == V.C1706d1.f14849a) {
                                                    break loop0;
                                                }
                                                i6 = 8;
                                            }
                                            j6 >>= i6;
                                            i13++;
                                            i11 = i6;
                                        }
                                        if (i12 == i11) {
                                            if (i10 == length) {
                                                i10++;
                                            }
                                        }
                                        this.f15031P.a(r6, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.f15031P.a(r6, obj);
                            break;
                        }
                    } else {
                        X.f fVar = this.f15031P;
                        V.C1706d1 c1706d1 = V.C1706d1.f14849a;
                        fVar.h(r6, c1706d1);
                    }
                }
                if (c1748u2 != null) {
                    return c1748u2.H(r6, c1704d, obj);
                }
                this.f15018C.k(this);
                return p() ? V.EnumC1696a0.DEFERRED : V.EnumC1696a0.SCHEDULED;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final void I(java.lang.Object obj) {
        java.lang.Object objC = this.f15024I.d().c(obj);
        if (objC == null) {
            return;
        }
        if (!(objC instanceof p170r.L)) {
            V.R0 r6 = (V.R0) objC;
            if (r6.s(obj) == V.EnumC1696a0.IMMINENT) {
                this.f15030O.a(obj, r6);
                return;
            }
            return;
        }
        p170r.L l6 = (p170r.L) objC;
        java.lang.Object[] objArr = l6.f53341b;
        long[] jArr = l6.f53340a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        V.R0 r10 = (V.R0) objArr[(i6 << 3) + i11];
                        if (r10.s(obj) == V.EnumC1696a0.IMMINENT) {
                            this.f15030O.a(obj, r10);
                        }
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    private final p061g0.c J() {
        V.B b6 = this.f15035T;
        if (b6.b()) {
            b6.a();
        } else {
            V.B bI = this.f15018C.i();
            if (bI != null) {
                bI.a();
            }
            b6.a();
            if (!p247y7.AbstractC7350t.b(null, null)) {
                b6.c(null);
            }
        }
        return null;
    }

    private final X.f M() {
        X.f fVar = this.f15031P;
        this.f15031P = new X.f();
        return fVar;
    }

    private final boolean N(V.R0 r6, java.lang.Object obj) {
        return p() && this.f15036U.p1(r6, obj);
    }

    private final void o(java.lang.Object obj, boolean z6) {
        java.lang.Object objC = this.f15024I.d().c(obj);
        if (objC == null) {
            return;
        }
        if (!(objC instanceof p170r.L)) {
            V.R0 r6 = (V.R0) objC;
            if (this.f15030O.f(obj, r6) || r6.s(obj) == V.EnumC1696a0.IGNORED) {
                return;
            }
            ((!r6.t() || z6) ? this.f15025J : this.f15026K).h(r6);
            return;
        }
        p170r.L l6 = (p170r.L) objC;
        java.lang.Object[] objArr = l6.f53341b;
        long[] jArr = l6.f53340a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        V.R0 r10 = (V.R0) objArr[(i6 << 3) + i11];
                        if (!this.f15030O.f(obj, r10) && r10.s(obj) != V.EnumC1696a0.IGNORED) {
                            ((!r10.t() || z6) ? this.f15025J : this.f15026K).h(r10);
                        }
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x00d3 A[EDGE_INSN: B:193:0x00d3->B:37:0x00d3 BREAK  A[LOOP:2: B:24:0x007b->B:35:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0111 A[EDGE_INSN: B:221:0x0111->B:216:0x0111 BREAK  A[LOOP:13: B:59:0x0146->B:70:0x0182], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[LOOP:2: B:24:0x007b->B:35:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0182 A[LOOP:13: B:59:0x0146->B:70:0x0182, LOOP_END] */
    private final void y(java.util.Set set, boolean z6) {
        long[] jArr;
        java.lang.String str;
        int i6;
        int i10;
        java.lang.String str2;
        boolean zA;
        java.lang.Object[] objArr;
        long[] jArr2;
        java.lang.Object[] objArr2;
        long[] jArr3;
        java.lang.String str3;
        long[] jArr4;
        int i11;
        java.lang.String str4;
        long[] jArr5;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zD;
        java.lang.Object[] objArr3;
        long[] jArr6;
        java.lang.Object[] objArr4;
        long[] jArr7;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        char c6 = 7;
        long j6 = -9187201950435737472L;
        int i22 = 8;
        if (set instanceof X.d) {
            p170r.W wD = ((X.d) set).d();
            java.lang.Object[] objArr5 = wD.f53341b;
            long[] jArr8 = wD.f53340a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i23 = 0;
                while (true) {
                    long j10 = jArr8[i23];
                    if ((((~j10) << c6) & j10 & j6) != j6) {
                        int i24 = 8 - ((~(i23 - length)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j10 & 255) < 128) {
                                java.lang.Object obj = objArr5[(i23 << 3) + i25];
                                if (obj instanceof V.R0) {
                                    ((V.R0) obj).s(null);
                                } else {
                                    o(obj, z6);
                                    java.lang.Object objC = this.f15027L.d().c(obj);
                                    if (objC != null) {
                                        if (objC instanceof p170r.L) {
                                            p170r.L l6 = (p170r.L) objC;
                                            java.lang.Object[] objArr6 = l6.f53341b;
                                            long[] jArr9 = l6.f53340a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                i19 = length;
                                                i20 = i23;
                                                int i26 = 0;
                                                while (true) {
                                                    long j11 = jArr9[i26];
                                                    i17 = i24;
                                                    i18 = i25;
                                                    if ((((~j11) << c6) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i26 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i26++;
                                                        i24 = i17;
                                                        i25 = i18;
                                                        c6 = 7;
                                                    } else {
                                                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                                        for (int i28 = 0; i28 < i27; i28++) {
                                                            if ((j11 & 255) < 128) {
                                                                o((V.J) objArr6[(i26 << 3) + i28], z6);
                                                            }
                                                            j11 >>= 8;
                                                        }
                                                        if (i27 != 8) {
                                                            break;
                                                        }
                                                        if (i26 != length2) {
                                                            break;
                                                        }
                                                        i26++;
                                                        i24 = i17;
                                                        i25 = i18;
                                                        c6 = 7;
                                                    }
                                                }
                                            }
                                        } else {
                                            i17 = i24;
                                            i18 = i25;
                                            i19 = length;
                                            i20 = i23;
                                            o((V.J) objC, z6);
                                        }
                                    }
                                    i21 = 8;
                                }
                                i17 = i24;
                                i18 = i25;
                                i19 = length;
                                i20 = i23;
                                i21 = 8;
                            } else {
                                i17 = i24;
                                i18 = i25;
                                i19 = length;
                                i20 = i23;
                                i21 = i22;
                            }
                            j10 >>= i21;
                            i25 = i18 + 1;
                            length = i19;
                            i22 = i21;
                            i23 = i20;
                            i24 = i17;
                            c6 = 7;
                        }
                        int i29 = length;
                        i16 = i23;
                        if (i24 != i22) {
                            break;
                        } else {
                            length = i29;
                        }
                    } else {
                        i16 = i23;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i23 = i16 + 1;
                    c6 = 7;
                    j6 = -9187201950435737472L;
                    i22 = 8;
                }
            }
        } else {
            for (java.lang.Object obj2 : set) {
                if (obj2 instanceof V.R0) {
                    ((V.R0) obj2).s(null);
                } else {
                    o(obj2, z6);
                    java.lang.Object objC2 = this.f15027L.d().c(obj2);
                    if (objC2 != null) {
                        if (objC2 instanceof p170r.L) {
                            p170r.L l10 = (p170r.L) objC2;
                            java.lang.Object[] objArr7 = l10.f53341b;
                            long[] jArr10 = l10.f53340a;
                            int length3 = jArr10.length - 2;
                            if (length3 >= 0) {
                                int i30 = 0;
                                while (true) {
                                    long j12 = jArr10[i30];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i30 != length3) {
                                            break;
                                            break;
                                        }
                                        i30++;
                                    } else {
                                        int i31 = 8 - ((~(i30 - length3)) >>> 31);
                                        for (int i32 = 0; i32 < i31; i32++) {
                                            if ((j12 & 255) < 128) {
                                                o((V.J) objArr7[(i30 << 3) + i32], z6);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i31 != 8) {
                                            break;
                                        } else if (i30 != length3) {
                                            break;
                                        } else {
                                            i30++;
                                        }
                                    }
                                }
                            }
                        } else {
                            o((V.J) objC2, z6);
                        }
                    }
                }
            }
        }
        p170r.L l11 = this.f15026K;
        p170r.L l12 = this.f15025J;
        java.lang.String str5 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (!z6 || !l11.e()) {
            java.lang.String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
            if (l12.e()) {
                p170r.K kD = this.f15024I.d();
                long[] jArr11 = kD.f53333a;
                int length4 = jArr11.length - 2;
                if (length4 >= 0) {
                    int i33 = 0;
                    while (true) {
                        long j13 = jArr11[i33];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i34 = 8 - ((~(i33 - length4)) >>> 31);
                            int i35 = 0;
                            while (i35 < i34) {
                                if ((j13 & 255) < 128) {
                                    int i36 = (i33 << 3) + i35;
                                    java.lang.Object obj3 = kD.f53334b[i36];
                                    java.lang.Object obj4 = kD.f53335c[i36];
                                    if (obj4 instanceof p170r.L) {
                                        java.lang.String str7 = str6;
                                        p247y7.AbstractC7350t.d(obj4, str7);
                                        p170r.L l13 = (p170r.L) obj4;
                                        java.lang.Object[] objArr8 = l13.f53341b;
                                        long[] jArr12 = l13.f53340a;
                                        int length5 = jArr12.length - 2;
                                        if (length5 >= 0) {
                                            int i37 = 0;
                                            while (true) {
                                                long j14 = jArr12[i37];
                                                str2 = str7;
                                                i10 = i34;
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i38 = 8 - ((~(i37 - length5)) >>> 31);
                                                    int i39 = 0;
                                                    while (i39 < i38) {
                                                        if ((j14 & 255) < 128) {
                                                            jArr3 = jArr12;
                                                            int i40 = (i37 << 3) + i39;
                                                            objArr2 = objArr8;
                                                            if (l12.a((V.R0) objArr8[i40])) {
                                                                l13.y(i40);
                                                            }
                                                        } else {
                                                            objArr2 = objArr8;
                                                            jArr3 = jArr12;
                                                        }
                                                        j14 >>= 8;
                                                        i39++;
                                                        jArr12 = jArr3;
                                                        objArr8 = objArr2;
                                                    }
                                                    objArr = objArr8;
                                                    jArr2 = jArr12;
                                                    if (i38 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr = objArr8;
                                                    jArr2 = jArr12;
                                                }
                                                if (i37 == length5) {
                                                    break;
                                                }
                                                i37++;
                                                i34 = i10;
                                                str7 = str2;
                                                jArr12 = jArr2;
                                                objArr8 = objArr;
                                            }
                                        } else {
                                            str2 = str7;
                                            i10 = i34;
                                        }
                                        zA = l13.d();
                                    } else {
                                        i10 = i34;
                                        str2 = str6;
                                        p247y7.AbstractC7350t.d(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        zA = l12.a((V.R0) obj4);
                                    }
                                    if (zA) {
                                        kD.q(i36);
                                    }
                                } else {
                                    jArr11 = jArr11;
                                    length4 = length4;
                                    i10 = i34;
                                    str2 = str6;
                                    i33 = i33;
                                }
                                j13 >>= 8;
                                i35++;
                                length4 = length4;
                                jArr11 = jArr11;
                                i33 = i33;
                                i34 = i10;
                                str6 = str2;
                            }
                            jArr = jArr11;
                            int i41 = length4;
                            str = str6;
                            int i42 = i33;
                            if (i34 != 8) {
                                break;
                            }
                            length4 = i41;
                            i6 = i42;
                        } else {
                            jArr = jArr11;
                            str = str6;
                            i6 = i33;
                        }
                        if (i6 == length4) {
                            break;
                        }
                        i33 = i6 + 1;
                        jArr11 = jArr;
                        str6 = str;
                    }
                }
                B();
                l12.m();
                return;
            }
            return;
        }
        p170r.K kD2 = this.f15024I.d();
        long[] jArr13 = kD2.f53333a;
        int length6 = jArr13.length - 2;
        if (length6 >= 0) {
            int i43 = 0;
            while (true) {
                long j15 = jArr13[i43];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i44 = 8 - ((~(i43 - length6)) >>> 31);
                    int i45 = 0;
                    while (i45 < i44) {
                        if ((j15 & 255) < 128) {
                            int i46 = (i43 << 3) + i45;
                            java.lang.Object obj5 = kD2.f53334b[i46];
                            java.lang.Object obj6 = kD2.f53335c[i46];
                            if (obj6 instanceof p170r.L) {
                                p247y7.AbstractC7350t.d(obj6, str5);
                                p170r.L l14 = (p170r.L) obj6;
                                java.lang.Object[] objArr9 = l14.f53341b;
                                jArr5 = jArr13;
                                long[] jArr14 = l14.f53340a;
                                str4 = str5;
                                int length7 = jArr14.length - 2;
                                i12 = length6;
                                i13 = i43;
                                if (length7 >= 0) {
                                    int i47 = 0;
                                    while (true) {
                                        long j16 = jArr14[i47];
                                        i14 = i44;
                                        i15 = i45;
                                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i48 = 8 - ((~(i47 - length7)) >>> 31);
                                            int i49 = 0;
                                            while (i49 < i48) {
                                                if ((j16 & 255) < 128) {
                                                    jArr7 = jArr14;
                                                    int i50 = (i47 << 3) + i49;
                                                    objArr4 = objArr9;
                                                    V.R0 r6 = (V.R0) objArr9[i50];
                                                    if (l11.a(r6) || l12.a(r6)) {
                                                        l14.y(i50);
                                                    }
                                                } else {
                                                    objArr4 = objArr9;
                                                    jArr7 = jArr14;
                                                }
                                                j16 >>= 8;
                                                i49++;
                                                jArr14 = jArr7;
                                                objArr9 = objArr4;
                                            }
                                            objArr3 = objArr9;
                                            jArr6 = jArr14;
                                            if (i48 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr9;
                                            jArr6 = jArr14;
                                        }
                                        if (i47 == length7) {
                                            break;
                                        }
                                        i47++;
                                        i44 = i14;
                                        i45 = i15;
                                        jArr14 = jArr6;
                                        objArr9 = objArr3;
                                    }
                                } else {
                                    i14 = i44;
                                    i15 = i45;
                                }
                                zD = l14.d();
                            } else {
                                str4 = str5;
                                jArr5 = jArr13;
                                i12 = length6;
                                i13 = i43;
                                i14 = i44;
                                i15 = i45;
                                p247y7.AbstractC7350t.d(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                V.R0 r10 = (V.R0) obj6;
                                zD = l11.a(r10) || l12.a(r10);
                            }
                            if (zD) {
                                kD2.q(i46);
                            }
                        } else {
                            str4 = str5;
                            jArr5 = jArr13;
                            i12 = length6;
                            i13 = i43;
                            i14 = i44;
                            i15 = i45;
                        }
                        j15 >>= 8;
                        i45 = i15 + 1;
                        length6 = i12;
                        jArr13 = jArr5;
                        str5 = str4;
                        i43 = i13;
                        i44 = i14;
                    }
                    str3 = str5;
                    jArr4 = jArr13;
                    int i51 = length6;
                    int i52 = i43;
                    if (i44 != 8) {
                        break;
                    }
                    length6 = i51;
                    i11 = i52;
                } else {
                    str3 = str5;
                    jArr4 = jArr13;
                    i11 = i43;
                }
                if (i11 == length6) {
                    break;
                }
                i43 = i11 + 1;
                jArr13 = jArr4;
                str5 = str3;
            }
        }
        l11.m();
        B();
    }

    public final V.B G() {
        return this.f15035T;
    }

    public final void K(V.J j6) {
        if (this.f15024I.c(j6)) {
            return;
        }
        this.f15027L.g(j6);
    }

    public final void L(java.lang.Object obj, V.R0 r6) {
        this.f15024I.f(obj, r6);
    }

    @Override // V.G, V.T0
    public void a(java.lang.Object obj) {
        V.R0 r0D0;
        long[] jArr;
        int i6;
        if (F() || (r0D0 = this.f15036U.D0()) == null) {
            return;
        }
        r0D0.H(true);
        if (r0D0.w(obj)) {
            return;
        }
        if (obj instanceof p051f0.z) {
            ((p051f0.z) obj).r(p051f0.g.a(1));
        }
        this.f15024I.a(obj, r0D0);
        if (obj instanceof V.J) {
            V.J j6 = (V.J) obj;
            V.J.a aVarP = j6.p();
            this.f15027L.g(obj);
            p170r.N nB = aVarP.b();
            java.lang.Object[] objArr = nB.f53317b;
            long[] jArr2 = nB.f53316a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr2[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j10 & 255) < 128) {
                                p051f0.y yVar = (p051f0.y) objArr[(i10 << 3) + i13];
                                if (yVar instanceof p051f0.z) {
                                    ((p051f0.z) yVar).r(p051f0.g.a(1));
                                }
                                this.f15027L.a(yVar, obj);
                                i6 = 8;
                            } else {
                                jArr2 = jArr2;
                                i6 = i11;
                            }
                            j10 >>= i6;
                            i13++;
                            i11 = i6;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i12 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    jArr2 = jArr;
                }
            }
            r0D0.v(j6, aVarP.a());
        }
    }

    @Override // V.G
    public void b(p237x7.a aVar) {
        this.f15036U.R0(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // V.G
    public boolean c(java.util.Set set) {
        if (set instanceof X.d) {
            p170r.W wD = ((X.d) set).d();
            java.lang.Object[] objArr = wD.f53341b;
            long[] jArr = wD.f53340a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                loop0: while (true) {
                    long j6 = jArr[i6];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j6) < 128) {
                                java.lang.Object obj = objArr[(i6 << 3) + i11];
                                if (this.f15024I.c(obj) || this.f15027L.c(obj)) {
                                    break loop0;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i10 == 8) {
                            if (i6 != length) {
                                i6++;
                            }
                        }
                    } else if (i6 != length) {
                        i6++;
                    }
                }
                return true;
            }
        } else {
            for (java.lang.Object obj2 : set) {
                if (this.f15024I.c(obj2) || this.f15027L.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // V.G
    public void d(V.AbstractC1735n0 abstractC1735n0) {
        V.C1748u.a aVar = new V.C1748u.a(this.f15022G);
        V.C1727k1 c1727k1V = abstractC1735n0.a().V();
        try {
            V.AbstractC1741q.K(c1727k1V, aVar);
            p087i7.M m6 = p087i7.M.f46721a;
            c1727k1V.L(true);
            aVar.g();
        } catch (java.lang.Throwable th) {
            c1727k1V.L(false);
            throw th;
        }
    }

    @Override // V.InterfaceC1700b1
    public void deactivate() {
        synchronized (this.f15021F) {
            try {
                boolean z6 = this.f15023H.N() > 0;
                if (z6 || (!this.f15022G.isEmpty())) {
                    V.K1 k6 = V.K1.f14689a;
                    java.lang.Object objA = k6.a("Compose:deactivate");
                    try {
                        V.C1748u.a aVar = new V.C1748u.a(this.f15022G);
                        if (z6) {
                            this.f15019D.e();
                            V.C1727k1 c1727k1V = this.f15023H.V();
                            try {
                                V.AbstractC1741q.t(c1727k1V, aVar);
                                p087i7.M m6 = p087i7.M.f46721a;
                                c1727k1V.L(true);
                                this.f15019D.i();
                                aVar.g();
                            } catch (java.lang.Throwable th) {
                                c1727k1V.L(false);
                                throw th;
                            }
                        }
                        aVar.f();
                        p087i7.M m10 = p087i7.M.f46721a;
                        k6.b(objA);
                    } catch (java.lang.Throwable th2) {
                        V.K1.f14689a.b(objA);
                        throw th2;
                    }
                }
                this.f15024I.b();
                this.f15027L.b();
                this.f15031P.b();
                this.f15028M.a();
                this.f15029N.a();
                this.f15036U.o0();
                p087i7.M m11 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // V.r
    public void e() {
        synchronized (this.f15021F) {
            try {
                if (!(!this.f15036U.M0())) {
                    V.I0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f15039X) {
                    this.f15039X = true;
                    this.f15040Y = V.C1722j.f14896a.b();
                    W.a aVarE0 = this.f15036U.E0();
                    if (aVarE0 != null) {
                        A(aVarE0);
                    }
                    boolean z6 = this.f15023H.N() > 0;
                    if (z6 || (!this.f15022G.isEmpty())) {
                        V.C1748u.a aVar = new V.C1748u.a(this.f15022G);
                        if (z6) {
                            this.f15019D.e();
                            V.C1727k1 c1727k1V = this.f15023H.V();
                            try {
                                V.AbstractC1741q.K(c1727k1V, aVar);
                                p087i7.M m6 = p087i7.M.f46721a;
                                c1727k1V.L(true);
                                this.f15019D.clear();
                                this.f15019D.i();
                                aVar.g();
                            } catch (java.lang.Throwable th) {
                                c1727k1V.L(false);
                                throw th;
                            }
                        }
                        aVar.f();
                    }
                    this.f15036U.p0();
                }
                p087i7.M m10 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        this.f15018C.r(this);
    }

    @Override // V.T0
    public void f(V.R0 r6) {
        this.f15032Q = true;
    }

    @Override // V.T0
    public V.EnumC1696a0 g(V.R0 r6, java.lang.Object obj) {
        V.C1748u c1748u;
        if (r6.k()) {
            r6.C(true);
        }
        V.C1704d c1704dI = r6.i();
        if (c1704dI == null || !c1704dI.b()) {
            return V.EnumC1696a0.IGNORED;
        }
        if (this.f15023H.W(c1704dI)) {
            return !r6.j() ? V.EnumC1696a0.IGNORED : H(r6, c1704dI, obj);
        }
        synchronized (this.f15021F) {
            c1748u = this.f15033R;
        }
        return (c1748u == null || !c1748u.N(r6, obj)) ? V.EnumC1696a0.IGNORED : V.EnumC1696a0.IMMINENT;
    }

    @Override // V.r
    public void h(p237x7.p pVar) {
        C(pVar);
    }

    @Override // V.G
    public void j(p237x7.p pVar) throws java.lang.Exception {
        try {
            synchronized (this.f15021F) {
                D();
                X.f fVarM = M();
                try {
                    J();
                    this.f15036U.j0(fVarM, pVar);
                } catch (java.lang.Exception e6) {
                    this.f15031P = fVarM;
                    throw e6;
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                if (!this.f15022G.isEmpty()) {
                    new V.C1748u.a(this.f15022G).f();
                }
                throw th;
            } catch (java.lang.Exception e10) {
                u();
                throw e10;
            }
        }
    }

    @Override // V.G
    public void k() {
        synchronized (this.f15021F) {
            try {
                if (this.f15029N.d()) {
                    A(this.f15029N);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                try {
                    try {
                        if (!this.f15022G.isEmpty()) {
                            new V.C1748u.a(this.f15022G).f();
                        }
                        throw th;
                    } catch (java.lang.Exception e6) {
                        u();
                        throw e6;
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // V.r
    public boolean l() {
        return this.f15039X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V.G
    public void m(java.util.Set set) {
        java.lang.Object obj;
        java.lang.Object objG;
        do {
            obj = this.f15020E.get();
            if (obj == null ? true : p247y7.AbstractC7350t.b(obj, V.AbstractC1750v.f15049a)) {
                objG = set;
            } else if (obj instanceof java.util.Set) {
                objG = new java.util.Set[]{obj, set};
            } else {
                if (!(obj instanceof java.lang.Object[])) {
                    throw new java.lang.IllegalStateException(("corrupt pendingModifications: " + this.f15020E).toString());
                }
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objG = p097j7.AbstractC6872n.G((java.util.Set[]) obj, set);
            }
        } while (!p200u.AbstractC7162c0.a(this.f15020E, obj, objG));
        if (obj == null) {
            synchronized (this.f15021F) {
                E();
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }
    }

    @Override // V.G
    public void n() {
        synchronized (this.f15021F) {
            try {
                A(this.f15028M);
                E();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                try {
                    try {
                        if (!this.f15022G.isEmpty()) {
                            new V.C1748u.a(this.f15022G).f();
                        }
                        throw th;
                    } catch (java.lang.Exception e6) {
                        u();
                        throw e6;
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // V.G
    public boolean p() {
        return this.f15036U.M0();
    }

    @Override // V.G
    public void q(java.util.List list) throws java.lang.Exception {
        int size = list.size();
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z6 = true;
                break;
            } else if (!p247y7.AbstractC7350t.b(((V.C1738o0) ((p087i7.u) list.get(i6)).c()).b(), this)) {
                break;
            } else {
                i6++;
            }
        }
        V.AbstractC1741q.O(z6);
        try {
            this.f15036U.J0(list);
            p087i7.M m6 = p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            try {
                if (true ^ this.f15022G.isEmpty()) {
                    new V.C1748u.a(this.f15022G).f();
                }
                throw th;
            } catch (java.lang.Exception e6) {
                u();
                throw e6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060, B:25:0x0065), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EDGE_INSN: B:33:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    @Override // V.G
    public void r(java.lang.Object obj) {
        synchronized (this.f15021F) {
            try {
                I(obj);
                java.lang.Object objC = this.f15027L.d().c(obj);
                if (objC != null) {
                    if (objC instanceof p170r.L) {
                        p170r.L l6 = (p170r.L) objC;
                        java.lang.Object[] objArr = l6.f53341b;
                        long[] jArr = l6.f53340a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i6 != length) {
                                        break;
                                        break;
                                    }
                                    i6++;
                                } else {
                                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j6) < 128) {
                                            I((V.J) objArr[(i6 << 3) + i11]);
                                        }
                                        j6 >>= 8;
                                    }
                                    if (i10 != 8) {
                                        break;
                                    } else if (i6 != length) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                    } else {
                        I((V.J) objC);
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.r
    public boolean s() {
        boolean z6;
        synchronized (this.f15021F) {
            z6 = this.f15031P.e() > 0;
        }
        return z6;
    }

    @Override // V.InterfaceC1700b1
    public void t(p237x7.p pVar) {
        this.f15036U.n1();
        C(pVar);
        this.f15036U.u0();
    }

    @Override // V.G
    public void u() {
        this.f15020E.set(null);
        this.f15028M.a();
        this.f15029N.a();
        if (!this.f15022G.isEmpty()) {
            new V.C1748u.a(this.f15022G).f();
        }
    }

    @Override // V.G
    public void v() {
        synchronized (this.f15021F) {
            try {
                this.f15036U.g0();
                if (!this.f15022G.isEmpty()) {
                    new V.C1748u.a(this.f15022G).f();
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                try {
                    try {
                        if (!this.f15022G.isEmpty()) {
                            new V.C1748u.a(this.f15022G).f();
                        }
                        throw th;
                    } catch (java.lang.Exception e6) {
                        u();
                        throw e6;
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // V.G
    public boolean w() {
        boolean zT0;
        synchronized (this.f15021F) {
            try {
                D();
                try {
                    X.f fVarM = M();
                    try {
                        J();
                        zT0 = this.f15036U.T0(fVarM);
                        if (!zT0) {
                            E();
                        }
                    } catch (java.lang.Exception e6) {
                        this.f15031P = fVarM;
                        throw e6;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        if (!this.f15022G.isEmpty()) {
                            new V.C1748u.a(this.f15022G).f();
                        }
                        throw th;
                    } catch (java.lang.Exception e10) {
                        u();
                        throw e10;
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return zT0;
    }

    @Override // V.G
    public void x() {
        synchronized (this.f15021F) {
            try {
                for (java.lang.Object obj : this.f15023H.O()) {
                    V.R0 r6 = obj instanceof V.R0 ? (V.R0) obj : null;
                    if (r6 != null) {
                        r6.invalidate();
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.G
    public java.lang.Object z(V.G g6, int i6, p237x7.a aVar) {
        if (g6 == null || p247y7.AbstractC7350t.b(g6, this) || i6 < 0) {
            return aVar.b();
        }
        this.f15033R = (V.C1748u) g6;
        this.f15034S = i6;
        try {
            return aVar.b();
        } finally {
            this.f15033R = null;
            this.f15034S = 0;
        }
    }
}
