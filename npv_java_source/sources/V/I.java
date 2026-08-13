package V;

/* JADX INFO: loaded from: classes.dex */
final class I extends p051f0.z implements V.J {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.a f14672D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V.u1 f14673E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private V.I.a f14674F = new V.I.a();

    public static final class a extends p051f0.A implements V.J.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final V.I.a.C0285a f14675h = new V.I.a.C0285a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f14676i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final java.lang.Object f14677j = new java.lang.Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p170r.N f14680e = p170r.O.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.lang.Object f14681f = f14677j;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14682g;

        /* JADX INFO: renamed from: V.I$a$a, reason: collision with other inner class name */
        public static final class C0285a {
            private C0285a() {
            }

            public /* synthetic */ C0285a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final java.lang.Object a() {
                return V.I.a.f14677j;
            }
        }

        @Override // V.J.a
        public java.lang.Object a() {
            return this.f14681f;
        }

        @Override // V.J.a
        public p170r.N b() {
            return this.f14680e;
        }

        @Override // p051f0.A
        public void c(p051f0.A a6) {
            p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            V.I.a aVar = (V.I.a) a6;
            m(aVar.b());
            this.f14681f = aVar.f14681f;
            this.f14682g = aVar.f14682g;
        }

        @Override // p051f0.A
        public p051f0.A d() {
            return new V.I.a();
        }

        public final java.lang.Object j() {
            return this.f14681f;
        }

        public final boolean k(V.J j6, p051f0.k kVar) {
            boolean z6;
            boolean z10;
            synchronized (p051f0.p.I()) {
                z6 = true;
                z10 = (this.f14678c == kVar.f() && this.f14679d == kVar.j()) ? false : true;
            }
            if (this.f14681f == f14677j || (z10 && this.f14682g != l(j6, kVar))) {
                z6 = false;
            }
            if (z6 && z10) {
                synchronized (p051f0.p.I()) {
                    this.f14678c = kVar.f();
                    this.f14679d = kVar.j();
                    p087i7.M m6 = p087i7.M.f46721a;
                }
            }
            return z6;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x007c, LOOP:1: B:16:0x003c->B:40:0x00a4, LOOP_END, TryCatch #1 {all -> 0x007c, blocks: (B:13:0x002f, B:16:0x003c, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:34:0x0098, B:25:0x0071, B:27:0x0075, B:31:0x0086, B:30:0x007e, B:42:0x00a8, B:40:0x00a4), top: B:64:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:68:0x00a0 A[EDGE_INSN: B:68:0x00a0->B:38:0x00a0 BREAK  A[LOOP:1: B:16:0x003c->B:40:0x00a4], SYNTHETIC] */
        public final int l(V.J j6, p051f0.k kVar) {
            p170r.N nB;
            int i6;
            int i10;
            synchronized (p051f0.p.I()) {
                nB = b();
            }
            char c6 = 7;
            if (!nB.h()) {
                return 7;
            }
            X.b bVarC = V.v1.c();
            int iT = bVarC.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarC.s();
                int i11 = 0;
                do {
                    ((V.K) objArrS[i11]).a(j6);
                    i11++;
                } while (i11 < iT);
            }
            try {
                java.lang.Object[] objArr = nB.f53317b;
                int[] iArr = nB.f53318c;
                long[] jArr = nB.f53316a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int iC = 7;
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << c6) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                            c6 = 7;
                        } else {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j10 & 255) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    p051f0.y yVar = (p051f0.y) objArr[i16];
                                    if (iArr[i16] == 1) {
                                        p051f0.A aT = yVar instanceof V.I ? ((V.I) yVar).t(kVar) : p051f0.p.G(yVar.e(), kVar);
                                        iC = (((iC * 31) + V.AbstractC1701c.c(aT)) * 31) + aT.f();
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i13;
                                }
                                j10 >>= i10;
                                i15++;
                                i13 = i10;
                            }
                            if (i14 != i13) {
                                break;
                            }
                            if (i12 != length) {
                                break;
                            }
                            i12++;
                            c6 = 7;
                        }
                    }
                    i6 = iC;
                } else {
                    i6 = 7;
                }
                p087i7.M m6 = p087i7.M.f46721a;
                int iT2 = bVarC.t();
                if (iT2 <= 0) {
                    return i6;
                }
                java.lang.Object[] objArrS2 = bVarC.s();
                int i17 = 0;
                do {
                    ((V.K) objArrS2[i17]).b(j6);
                    i17++;
                } while (i17 < iT2);
                return i6;
            } catch (java.lang.Throwable th) {
                int iT3 = bVarC.t();
                if (iT3 > 0) {
                    java.lang.Object[] objArrS3 = bVarC.s();
                    int i18 = 0;
                    do {
                        ((V.K) objArrS3[i18]).b(j6);
                        i18++;
                    } while (i18 < iT3);
                }
                throw th;
            }
        }

        public void m(p170r.N n6) {
            this.f14680e = n6;
        }

        public final void n(java.lang.Object obj) {
            this.f14681f = obj;
        }

        public final void o(int i6) {
            this.f14682g = i6;
        }

        public final void p(int i6) {
            this.f14678c = i6;
        }

        public final void q(int i6) {
            this.f14679d = i6;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p031d0.d f14684E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p170r.H f14685F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f14686G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p031d0.d dVar, p170r.H h6, int i6) {
            super(1);
            this.f14684E = dVar;
            this.f14685F = h6;
            this.f14686G = i6;
        }

        public final void a(java.lang.Object obj) {
            if (obj == V.I.this) {
                throw new java.lang.IllegalStateException("A derived state calculation cannot read itself".toString());
            }
            if (obj instanceof p051f0.y) {
                int iA = this.f14684E.a();
                p170r.H h6 = this.f14685F;
                h6.s(obj, java.lang.Math.min(iA - this.f14686G, h6.e(obj, Integer.MAX_VALUE)));
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    public I(p237x7.a aVar, V.u1 u1Var) {
        this.f14672D = aVar;
        this.f14673E = u1Var;
    }

    private final V.I.a u(V.I.a aVar, p051f0.k kVar, boolean z6, p237x7.a aVar2) {
        f0.k.a aVar3;
        V.u1 u1VarC;
        int i6;
        int i10;
        V.I.a aVar4 = aVar;
        int i11 = 1;
        if (!aVar4.k(this, kVar)) {
            int i12 = 0;
            p170r.H h6 = new p170r.H(0, 1, null);
            p031d0.d dVar = (p031d0.d) V.w1.f15053a.a();
            if (dVar == null) {
                dVar = new p031d0.d(0);
                V.w1.f15053a.b(dVar);
            }
            int iA = dVar.a();
            X.b bVarC = V.v1.c();
            int iT = bVarC.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarC.s();
                int i13 = 0;
                while (true) {
                    ((V.K) objArrS[i13]).a(this);
                    int i14 = i13 + 1;
                    if (i14 >= iT) {
                        break;
                    }
                    i13 = i14;
                }
            }
            try {
                dVar.b(iA + 1);
                java.lang.Object objH = p051f0.k.f44821e.h(new V.I.b(dVar, h6, iA), null, aVar2);
                dVar.b(iA);
                int iT2 = bVarC.t();
                if (iT2 > 0) {
                    java.lang.Object[] objArrS2 = bVarC.s();
                    do {
                        ((V.K) objArrS2[i12]).b(this);
                        i12++;
                    } while (i12 < iT2);
                }
                synchronized (p051f0.p.I()) {
                    try {
                        aVar3 = p051f0.k.f44821e;
                        p051f0.k kVarC = aVar3.c();
                        if (aVar.j() == V.I.a.f14675h.a() || (u1VarC = c()) == null || !u1VarC.a(objH, aVar.j())) {
                            aVar4 = (V.I.a) p051f0.p.O(this.f14674F, this, kVarC);
                            aVar4.m(h6);
                            aVar4.o(aVar4.l(this, kVarC));
                            aVar4.n(objH);
                        } else {
                            aVar4.m(h6);
                            aVar4.o(aVar4.l(this, kVarC));
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                p031d0.d dVar2 = (p031d0.d) V.w1.f15053a.a();
                if (dVar2 != null && dVar2.a() == 0) {
                    aVar3.g();
                    synchronized (p051f0.p.I()) {
                        p051f0.k kVarC2 = aVar3.c();
                        aVar4.p(kVarC2.f());
                        aVar4.q(kVarC2.j());
                        p087i7.M m6 = p087i7.M.f46721a;
                    }
                }
                return aVar4;
            } catch (java.lang.Throwable th2) {
                int iT3 = bVarC.t();
                if (iT3 > 0) {
                    java.lang.Object[] objArrS3 = bVarC.s();
                    do {
                        ((V.K) objArrS3[i12]).b(this);
                        i12++;
                    } while (i12 < iT3);
                }
                throw th2;
            }
        }
        if (z6) {
            X.b bVarC2 = V.v1.c();
            int iT4 = bVarC2.t();
            if (iT4 > 0) {
                java.lang.Object[] objArrS4 = bVarC2.s();
                int i15 = 0;
                do {
                    ((V.K) objArrS4[i15]).a(this);
                    i15++;
                } while (i15 < iT4);
            }
            try {
                p170r.N nB = aVar.b();
                p031d0.d dVar3 = (p031d0.d) V.w1.f15053a.a();
                if (dVar3 == null) {
                    dVar3 = new p031d0.d(0);
                    V.w1.f15053a.b(dVar3);
                }
                int iA2 = dVar3.a();
                java.lang.Object[] objArr = nB.f53317b;
                int[] iArr = nB.f53318c;
                long[] jArr = nB.f53316a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j6 = jArr[i16];
                        long[] jArr2 = jArr;
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j6 & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    p051f0.y yVar = (p051f0.y) objArr[i20];
                                    dVar3.b(iA2 + iArr[i20]);
                                    p237x7.l lVarH = kVar.h();
                                    if (lVarH != null) {
                                        lVarH.l(yVar);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i17;
                                }
                                j6 >>= i10;
                                i19++;
                                i17 = i10;
                                i11 = 1;
                            }
                            int i21 = i17;
                            i6 = i11;
                            if (i18 != i21) {
                                break;
                            }
                        } else {
                            i6 = i11;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16 += i6;
                        i11 = i6;
                        jArr = jArr2;
                    }
                }
                dVar3.b(iA2);
                p087i7.M m10 = p087i7.M.f46721a;
                int iT5 = bVarC2.t();
                if (iT5 > 0) {
                    java.lang.Object[] objArrS5 = bVarC2.s();
                    int i22 = 0;
                    do {
                        ((V.K) objArrS5[i22]).b(this);
                        i22++;
                    } while (i22 < iT5);
                }
            } catch (java.lang.Throwable th3) {
                int iT6 = bVarC2.t();
                if (iT6 > 0) {
                    java.lang.Object[] objArrS6 = bVarC2.s();
                    int i23 = 0;
                    do {
                        ((V.K) objArrS6[i23]).b(this);
                        i23++;
                    } while (i23 < iT6);
                }
                throw th3;
            }
        }
        return aVar4;
    }

    private final java.lang.String v() {
        V.I.a aVar = (V.I.a) p051f0.p.F(this.f14674F);
        return aVar.k(this, p051f0.k.f44821e.c()) ? java.lang.String.valueOf(aVar.j()) : "<Not calculated>";
    }

    @Override // p051f0.y
    public void C(p051f0.A a6) {
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f14674F = (V.I.a) a6;
    }

    @Override // V.J
    public V.u1 c() {
        return this.f14673E;
    }

    @Override // p051f0.y
    public p051f0.A e() {
        return this.f14674F;
    }

    @Override // V.G1
    public java.lang.Object getValue() {
        f0.k.a aVar = p051f0.k.f44821e;
        p237x7.l lVarH = aVar.c().h();
        if (lVarH != null) {
            lVarH.l(this);
        }
        p051f0.k kVarC = aVar.c();
        return u((V.I.a) p051f0.p.G(this.f14674F, kVarC), kVarC, true, this.f14672D).j();
    }

    @Override // V.J
    public V.J.a p() {
        p051f0.k kVarC = p051f0.k.f44821e.c();
        return u((V.I.a) p051f0.p.G(this.f14674F, kVarC), kVarC, false, this.f14672D);
    }

    public final p051f0.A t(p051f0.k kVar) {
        return u((V.I.a) p051f0.p.G(this.f14674F, kVar), kVar, false, this.f14672D);
    }

    public java.lang.String toString() {
        return "DerivedState(value=" + v() + ")@" + hashCode();
    }
}
