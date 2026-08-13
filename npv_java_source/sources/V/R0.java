package V;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements V.InterfaceC1709e1, V.Q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final V.R0.a f14708h = new V.R0.a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14709i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V.T0 f14711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V.C1704d f14712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p237x7.p f14713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p170r.H f14715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p170r.K f14716g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final void a(V.C1727k1 c1727k1, java.util.List list, V.T0 t6) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    java.lang.Object objY0 = c1727k1.Y0((V.C1704d) list.get(i6), 0);
                    V.R0 r6 = objY0 instanceof V.R0 ? (V.R0) objY0 : null;
                    if (r6 != null) {
                        r6.e(t6);
                    }
                }
            }
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f14718E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p170r.H f14719F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, p170r.H h6) {
            super(1);
            this.f14718E = i6;
            this.f14719F = h6;
        }

        public final void a(V.r rVar) {
            int i6;
            if (V.R0.this.f14714e != this.f14718E || !p247y7.AbstractC7350t.b(this.f14719F, V.R0.this.f14715f) || !(rVar instanceof V.C1748u)) {
                return;
            }
            p170r.H h6 = this.f14719F;
            int i10 = this.f14718E;
            V.R0 r6 = V.R0.this;
            long[] jArr = h6.f53316a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j6 = jArr[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j6) < 128) {
                            int i15 = (i11 << 3) + i14;
                            java.lang.Object obj = h6.f53317b[i15];
                            boolean z6 = h6.f53318c[i15] != i10;
                            if (z6) {
                                V.C1748u c1748u = (V.C1748u) rVar;
                                c1748u.L(obj, r6);
                                if (obj instanceof V.J) {
                                    c1748u.K((V.J) obj);
                                    p170r.K k6 = r6.f14716g;
                                    if (k6 != null) {
                                        k6.p(obj);
                                    }
                                }
                            }
                            if (z6) {
                                h6.q(i15);
                            }
                            i6 = 8;
                        } else {
                            i6 = i12;
                        }
                        j6 >>= i6;
                        i14++;
                        i12 = i6;
                    }
                    if (i13 != i12) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((V.r) obj);
            return p087i7.M.f46721a;
        }
    }

    public R0(V.T0 t6) {
        this.f14711b = t6;
    }

    private final void F(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 32 : this.f14710a & (-33);
    }

    private final void G(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 16 : this.f14710a & (-17);
    }

    private final boolean f(V.J j6, p170r.K k6) {
        p247y7.AbstractC7350t.d(j6, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        V.u1 u1VarC = j6.c();
        if (u1VarC == null) {
            u1VarC = V.v1.p();
        }
        return !u1VarC.a(j6.p().a(), k6.c(j6));
    }

    private final boolean o() {
        return (this.f14710a & 32) != 0;
    }

    public final void A(V.C1704d c1704d) {
        this.f14712c = c1704d;
    }

    public final void B(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 2 : this.f14710a & (-3);
    }

    public final void C(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 4 : this.f14710a & (-5);
    }

    public final void D(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 64 : this.f14710a & (-65);
    }

    public final void E(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 8 : this.f14710a & (-9);
    }

    public final void H(boolean z6) {
        this.f14710a = z6 ? this.f14710a | 1 : this.f14710a & (-2);
    }

    public final void I(int i6) {
        this.f14714e = i6;
        G(false);
    }

    @Override // V.InterfaceC1709e1
    public void a(p237x7.p pVar) {
        this.f14713d = pVar;
    }

    public final void e(V.T0 t6) {
        this.f14711b = t6;
    }

    public final void g(V.InterfaceC1734n interfaceC1734n) {
        p087i7.M m6;
        p237x7.p pVar = this.f14713d;
        if (pVar != null) {
            pVar.u(interfaceC1734n, 1);
            m6 = p087i7.M.f46721a;
        } else {
            m6 = null;
        }
        if (m6 == null) {
            throw new java.lang.IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final p237x7.l h(int i6) {
        p170r.H h6 = this.f14715f;
        if (h6 == null || p()) {
            return null;
        }
        java.lang.Object[] objArr = h6.f53317b;
        int[] iArr = h6.f53318c;
        long[] jArr = h6.f53316a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        int i13 = (i10 << 3) + i12;
                        java.lang.Object obj = objArr[i13];
                        if (iArr[i13] != i6) {
                            return new V.R0.b(i6, h6);
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return null;
                }
            }
            if (i10 == length) {
                return null;
            }
            i10++;
        }
    }

    public final V.C1704d i() {
        return this.f14712c;
    }

    @Override // V.Q0
    public void invalidate() {
        V.T0 t6 = this.f14711b;
        if (t6 != null) {
            t6.g(this, null);
        }
    }

    public final boolean j() {
        return this.f14713d != null;
    }

    public final boolean k() {
        return (this.f14710a & 2) != 0;
    }

    public final boolean l() {
        return (this.f14710a & 4) != 0;
    }

    public final boolean m() {
        return (this.f14710a & 64) != 0;
    }

    public final boolean n() {
        return (this.f14710a & 8) != 0;
    }

    public final boolean p() {
        return (this.f14710a & 16) != 0;
    }

    public final boolean q() {
        return (this.f14710a & 1) != 0;
    }

    public final boolean r() {
        if (this.f14711b == null) {
            return false;
        }
        V.C1704d c1704d = this.f14712c;
        return c1704d != null ? c1704d.b() : false;
    }

    public final V.EnumC1696a0 s(java.lang.Object obj) {
        V.EnumC1696a0 enumC1696a0G;
        V.T0 t6 = this.f14711b;
        return (t6 == null || (enumC1696a0G = t6.g(this, obj)) == null) ? V.EnumC1696a0.IGNORED : enumC1696a0G;
    }

    public final boolean t() {
        return this.f14716g != null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[LOOP:0: B:18:0x002f->B:32:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[SYNTHETIC] */
    public final boolean u(java.lang.Object obj) {
        p170r.K k6;
        if (obj == null || (k6 = this.f14716g) == null) {
            return true;
        }
        if (obj instanceof V.J) {
            return f((V.J) obj, k6);
        }
        if (!(obj instanceof p170r.W)) {
            return true;
        }
        p170r.W w6 = (p170r.W) obj;
        if (w6.e()) {
            java.lang.Object[] objArr = w6.f53341b;
            long[] jArr = w6.f53340a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j6 = jArr[i6];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j6) < 128) {
                                java.lang.Object obj2 = objArr[(i6 << 3) + i11];
                                if (!(obj2 instanceof V.J) || f((V.J) obj2, k6)) {
                                    return true;
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
            }
        }
        return false;
    }

    public final void v(V.J j6, java.lang.Object obj) {
        p170r.K k6 = this.f14716g;
        if (k6 == null) {
            k6 = new p170r.K(0, 1, null);
            this.f14716g = k6;
        }
        k6.s(j6, obj);
    }

    public final boolean w(java.lang.Object obj) {
        if (o()) {
            return false;
        }
        p170r.H h6 = this.f14715f;
        if (h6 == null) {
            h6 = new p170r.H(0, 1, null);
            this.f14715f = h6;
        }
        return h6.p(obj, this.f14714e, -1) == this.f14714e;
    }

    public final void x() {
        V.T0 t6 = this.f14711b;
        if (t6 != null) {
            t6.f(this);
        }
        this.f14711b = null;
        this.f14715f = null;
        this.f14716g = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[EDGE_INSN: B:31:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void y() {
        p170r.H h6;
        V.T0 t6 = this.f14711b;
        if (t6 == null || (h6 = this.f14715f) == null) {
            return;
        }
        F(true);
        try {
            java.lang.Object[] objArr = h6.f53317b;
            int[] iArr = h6.f53318c;
            long[] jArr = h6.f53316a;
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
                                int i12 = (i6 << 3) + i11;
                                java.lang.Object obj = objArr[i12];
                                int i13 = iArr[i12];
                                t6.a(obj);
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
        } finally {
            F(false);
        }
    }

    public final void z() {
        G(true);
    }
}
