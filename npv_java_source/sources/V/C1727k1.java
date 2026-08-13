package V;

/* JADX INFO: renamed from: V.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1727k1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final V.C1727k1.a f14904y = new V.C1727k1.a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f14905z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.C1718h1 f14906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f14907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object[] f14908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.ArrayList f14909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.HashMap f14910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p170r.C f14911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14920o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p170r.C f14924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f14926u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f14928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private V.L0 f14929x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final V.X f14921p = new V.X();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final V.X f14922q = new V.X();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final V.X f14923r = new V.X();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14927v = -1;

    /* JADX INFO: renamed from: V.k1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final java.util.List b(V.C1727k1 c1727k1, int i6, V.C1727k1 c1727k2, boolean z6, boolean z10, boolean z11) {
            boolean z12;
            java.util.List listM;
            int iK0 = c1727k1.k0(i6);
            int i10 = i6 + iK0;
            int iP = c1727k1.P(i6);
            int iP2 = c1727k1.P(i10);
            int i11 = iP2 - iP;
            boolean zM = c1727k1.M(i6);
            c1727k2.o0(iK0);
            c1727k2.p0(i11, c1727k2.a0());
            if (c1727k1.f14912g < i10) {
                c1727k1.x0(i10);
            }
            if (c1727k1.f14916k < iP2) {
                c1727k1.z0(iP2, i10);
            }
            int[] iArr = c1727k2.f14907b;
            int iA0 = c1727k2.a0();
            p097j7.AbstractC6872n.j(c1727k1.f14907b, iArr, iA0 * 5, i6 * 5, i10 * 5);
            java.lang.Object[] objArr = c1727k2.f14908c;
            int i12 = c1727k2.f14914i;
            p097j7.AbstractC6872n.l(c1727k1.f14908c, objArr, i12, iP, iP2);
            int iC0 = c1727k2.c0();
            V.AbstractC1724j1.b0(iArr, iA0, iC0);
            int i13 = iA0 - i6;
            int i14 = iA0 + iK0;
            int iQ = i12 - c1727k2.Q(iArr, iA0);
            int i15 = c1727k2.f14918m;
            int i16 = c1727k2.f14917l;
            int length = objArr.length;
            int i17 = i15;
            int i18 = iA0;
            while (true) {
                z12 = 0;
                if (i18 >= i14) {
                    break;
                }
                if (i18 != iA0) {
                    V.AbstractC1724j1.b0(iArr, i18, V.AbstractC1724j1.T(iArr, i18) + i13);
                }
                int i19 = iQ;
                V.AbstractC1724j1.X(iArr, i18, c1727k2.S(c1727k2.Q(iArr, i18) + iQ, i17 >= i18 ? c1727k2.f14916k : 0, i16, length));
                if (i18 == i17) {
                    i17++;
                }
                i18++;
                iQ = i19;
                i14 = i14;
            }
            int i20 = i14;
            c1727k2.f14918m = i17;
            int iP3 = V.AbstractC1724j1.P(c1727k1.f14909d, i6, c1727k1.d0());
            int iP4 = V.AbstractC1724j1.P(c1727k1.f14909d, i10, c1727k1.d0());
            if (iP3 < iP4) {
                java.util.ArrayList arrayList = c1727k1.f14909d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(iP4 - iP3);
                for (int i21 = iP3; i21 < iP4; i21++) {
                    V.C1704d c1704d = (V.C1704d) arrayList.get(i21);
                    c1704d.c(c1704d.a() + i13);
                    arrayList2.add(c1704d);
                }
                c1727k2.f14909d.addAll(V.AbstractC1724j1.P(c1727k2.f14909d, c1727k2.a0(), c1727k2.d0()), arrayList2);
                arrayList.subList(iP3, iP4).clear();
                listM = arrayList2;
            } else {
                listM = p097j7.AbstractC6879v.m();
            }
            if (!listM.isEmpty()) {
                java.util.HashMap map = c1727k1.f14910e;
                java.util.HashMap map2 = c1727k2.f14910e;
                if (map != null && map2 != null) {
                    int size = listM.size();
                    for (int i22 = 0; i22 < size; i22++) {
                    }
                }
            }
            c1727k2.c0();
            c1727k2.e1(iC0);
            int iE0 = c1727k1.E0(i6);
            if (z11) {
                if (z6) {
                    boolean z13 = iE0 >= 0;
                    if (z13) {
                        c1727k1.g1();
                        c1727k1.D(iE0 - c1727k1.a0());
                        c1727k1.g1();
                    }
                    c1727k1.D(i6 - c1727k1.a0());
                    boolean zL0 = c1727k1.L0();
                    if (z13) {
                        c1727k1.W0();
                        c1727k1.T();
                        c1727k1.W0();
                        c1727k1.T();
                    }
                    z12 = zL0;
                } else {
                    boolean zM0 = c1727k1.M0(i6, iK0);
                    c1727k1.N0(iP, i11, i6 - 1);
                    z12 = zM0;
                }
            }
            if ((!z12) == 0) {
                V.AbstractC1741q.r("Unexpectedly removed anchors");
            }
            c1727k2.f14920o += V.AbstractC1724j1.N(iArr, iA0) ? 1 : V.AbstractC1724j1.Q(iArr, iA0);
            if (z10) {
                c1727k2.f14925t = i20;
                c1727k2.f14914i = i12 + i11;
            }
            if (zM) {
                c1727k2.p1(iC0);
            }
            return listM;
        }

        static /* synthetic */ java.util.List c(V.C1727k1.a aVar, V.C1727k1 c1727k1, int i6, V.C1727k1 c1727k2, boolean z6, boolean z10, boolean z11, int i10, java.lang.Object obj) {
            if ((i10 & 32) != 0) {
                z11 = true;
            }
            return aVar.b(c1727k1, i6, c1727k2, z6, z10, z11);
        }
    }

    public C1727k1(V.C1718h1 c1718h1) {
        this.f14906a = c1718h1;
        this.f14907b = c1718h1.M();
        this.f14908c = c1718h1.O();
        this.f14909d = c1718h1.D();
        this.f14910e = c1718h1.Q();
        this.f14911f = c1718h1.E();
        this.f14912g = c1718h1.N();
        this.f14913h = (this.f14907b.length / 5) - c1718h1.N();
        this.f14916k = c1718h1.P();
        this.f14917l = this.f14908c.length - c1718h1.P();
        this.f14918m = c1718h1.N();
        this.f14926u = c1718h1.N();
    }

    private final int D0(int[] iArr, int i6) {
        return Q(iArr, i6);
    }

    private final int F0(int[] iArr, int i6) {
        return G0(V.AbstractC1724j1.T(iArr, h0(i6)));
    }

    private final int G0(int i6) {
        return i6 > -2 ? i6 : d0() + i6 + 2;
    }

    private final int H(int[] iArr, int i6) {
        return Q(iArr, i6) + V.AbstractC1724j1.E(V.AbstractC1724j1.H(iArr, i6) >> 29);
    }

    private final int H0(int i6, int i10) {
        return i6 < i10 ? i6 : -((d0() - i6) + 2);
    }

    private final java.lang.Object I0(java.lang.Object obj) {
        java.lang.Object objU0 = U0();
        T0(obj);
        return objU0;
    }

    private final boolean J(int i6) {
        int iK0 = i6 + 1;
        int iK1 = i6 + k0(i6);
        while (iK0 < iK1) {
            if (V.AbstractC1724j1.C(this.f14907b, h0(iK0))) {
                return true;
            }
            iK0 += k0(iK0);
        }
        return false;
    }

    private final void J0() {
        V.L0 l6 = this.f14929x;
        if (l6 != null) {
            while (l6.b()) {
                q1(l6.d(), l6);
            }
        }
    }

    private final void K() {
        int i6 = this.f14916k;
        p097j7.AbstractC6872n.w(this.f14908c, null, i6, this.f14917l + i6);
    }

    private final boolean K0(int i6, int i10, java.util.HashMap map) {
        int i11 = i10 + i6;
        int iP = V.AbstractC1724j1.P(this.f14909d, i11, Y() - this.f14913h);
        if (iP >= this.f14909d.size()) {
            iP--;
        }
        int i12 = iP + 1;
        int i13 = 0;
        while (iP >= 0) {
            V.C1704d c1704d = (V.C1704d) this.f14909d.get(iP);
            int iF = F(c1704d);
            if (iF < i6) {
                break;
            }
            if (iF < i11) {
                c1704d.c(Integer.MIN_VALUE);
                if (map != null) {
                }
                if (i13 == 0) {
                    i13 = iP + 1;
                }
                i12 = iP;
            }
            iP--;
        }
        boolean z6 = i12 < i13;
        if (z6) {
            this.f14909d.subList(i12, i13).clear();
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int i6) {
        return i6 >= 0 && V.AbstractC1724j1.C(this.f14907b, h0(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0(int i6, int i10) {
        boolean zK0 = false;
        if (i10 > 0) {
            java.util.ArrayList arrayList = this.f14909d;
            x0(i6);
            zK0 = arrayList.isEmpty() ^ true ? K0(i6, i10, this.f14910e) : false;
            this.f14912g = i6;
            this.f14913h += i10;
            int i11 = this.f14918m;
            if (i11 > i6) {
                this.f14918m = java.lang.Math.max(i6, i11 - i10);
            }
            int i12 = this.f14926u;
            if (i12 >= this.f14912g) {
                this.f14926u = i12 - i10;
            }
            int i13 = this.f14927v;
            if (N(i13)) {
                p1(i13);
            }
        }
        return zK0;
    }

    private final boolean N(int i6) {
        return i6 >= 0 && V.AbstractC1724j1.D(this.f14907b, h0(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(int i6, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f14917l;
            int i13 = i6 + i10;
            z0(i13, i11);
            this.f14916k = i6;
            this.f14917l = i12 + i10;
            p097j7.AbstractC6872n.w(this.f14908c, null, i6, i13);
            int i14 = this.f14915j;
            if (i14 >= i6) {
                this.f14915j = i14 - i10;
            }
        }
    }

    private final int O(int i6, int i10, int i11) {
        return i6 < 0 ? (i11 - i10) + i6 + 1 : i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int i6) {
        return Q(this.f14907b, h0(i6));
    }

    private final int P0() {
        int iY = (Y() - this.f14913h) - this.f14922q.i();
        this.f14926u = iY;
        return iY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i6) {
        return i6 >= Y() ? this.f14908c.length - this.f14917l : O(V.AbstractC1724j1.F(iArr, i6), this.f14917l, this.f14908c.length);
    }

    private final void Q0() {
        this.f14922q.j((Y() - this.f14913h) - this.f14926u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int i6) {
        return i6 < this.f14916k ? i6 : i6 + this.f14917l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int i6, int i10, int i11, int i12) {
        return i6 > i10 ? -(((i12 - i11) - i6) + 1) : i6;
    }

    private final void X(int i6, int i10, int i11) {
        int iH0 = H0(i6, this.f14912g);
        while (i11 < i10) {
            V.AbstractC1724j1.b0(this.f14907b, h0(i11), iH0);
            int I10 = V.AbstractC1724j1.I(this.f14907b, h0(i11)) + i11;
            X(i11, I10, i11 + 1);
            i11 = I10;
        }
    }

    private final int Y() {
        return this.f14907b.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z0(int[] iArr, int i6) {
        return i6 >= Y() ? this.f14908c.length - this.f14917l : O(V.AbstractC1724j1.V(iArr, i6), this.f14917l, this.f14908c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V.W e1(int i6) {
        V.C1704d c1704dL1;
        java.util.HashMap map = this.f14910e;
        if (map == null || (c1704dL1 = l1(i6)) == null) {
            return null;
        }
        return (V.W) map.get(c1704dL1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h0(int i6) {
        return i6 < this.f14912g ? i6 : i6 + this.f14913h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i1(int i6, java.lang.Object obj, boolean z6, java.lang.Object obj2) {
        int I10;
        int i10 = this.f14927v;
        java.lang.Object[] objArr = this.f14919n > 0;
        this.f14923r.j(this.f14920o);
        if (objArr == true) {
            int i11 = this.f14925t;
            int iQ = Q(this.f14907b, h0(i11));
            o0(1);
            this.f14914i = iQ;
            this.f14915j = iQ;
            int iH0 = h0(i11);
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            int i12 = obj != aVar.a() ? 1 : 0;
            int i13 = (z6 || obj2 == aVar.a()) ? 0 : 1;
            int iS = S(iQ, this.f14916k, this.f14917l, this.f14908c.length);
            if (iS >= 0 && this.f14918m < i11) {
                iS = -(((this.f14908c.length - this.f14917l) - iS) + 1);
            }
            V.AbstractC1724j1.M(this.f14907b, iH0, i6, z6, i12, i13, this.f14927v, iS);
            int i14 = (z6 ? 1 : 0) + i12 + i13;
            if (i14 > 0) {
                p0(i14, i11);
                java.lang.Object[] objArr2 = this.f14908c;
                int i15 = this.f14914i;
                if (z6) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                if (i12 != 0) {
                    objArr2[i15] = obj;
                    i15++;
                }
                if (i13 != 0) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                this.f14914i = i15;
            }
            this.f14920o = 0;
            I10 = i11 + 1;
            this.f14927v = i11;
            this.f14925t = I10;
            if (i10 >= 0) {
                e1(i10);
            }
        } else {
            this.f14921p.j(i10);
            Q0();
            int i16 = this.f14925t;
            int iH1 = h0(i16);
            if (!p247y7.AbstractC7350t.b(obj2, V.InterfaceC1734n.f14931a.a())) {
                if (z6) {
                    t1(obj2);
                } else {
                    o1(obj2);
                }
            }
            this.f14914i = Z0(this.f14907b, iH1);
            this.f14915j = Q(this.f14907b, h0(this.f14925t + 1));
            this.f14920o = V.AbstractC1724j1.Q(this.f14907b, iH1);
            this.f14927v = i16;
            this.f14925t = i16 + 1;
            I10 = i16 + V.AbstractC1724j1.I(this.f14907b, iH1);
        }
        this.f14926u = I10;
    }

    private final void n1(int i6, int i10) {
        V.C1704d c1704d;
        int iA;
        V.C1704d c1704d2;
        int iA2;
        int i11;
        int iY = Y() - this.f14913h;
        if (i6 >= i10) {
            for (int iP = V.AbstractC1724j1.P(this.f14909d, i10, iY); iP < this.f14909d.size() && (iA = (c1704d = (V.C1704d) this.f14909d.get(iP)).a()) >= 0; iP++) {
                c1704d.c(-(iY - iA));
            }
            return;
        }
        for (int iP2 = V.AbstractC1724j1.P(this.f14909d, i6, iY); iP2 < this.f14909d.size() && (iA2 = (c1704d2 = (V.C1704d) this.f14909d.get(iP2)).a()) < 0 && (i11 = iA2 + iY) < i10; iP2++) {
            c1704d2.c(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(int i6) {
        if (i6 > 0) {
            int i10 = this.f14925t;
            x0(i10);
            int i11 = this.f14912g;
            int i12 = this.f14913h;
            int[] iArr = this.f14907b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i6) {
                int iMax = java.lang.Math.max(java.lang.Math.max(length * 2, i13 + i6), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                p097j7.AbstractC6872n.j(iArr, iArr2, 0, 0, i11 * 5);
                p097j7.AbstractC6872n.j(iArr, iArr2, (i11 + i14) * 5, (i12 + i11) * 5, length * 5);
                this.f14907b = iArr2;
                i12 = i14;
            }
            int i15 = this.f14926u;
            if (i15 >= i11) {
                this.f14926u = i15 + i6;
            }
            int i16 = i11 + i6;
            this.f14912g = i16;
            this.f14913h = i12 - i6;
            int iS = S(i13 > 0 ? P(i10 + i6) : 0, this.f14918m >= i11 ? this.f14916k : 0, this.f14917l, this.f14908c.length);
            for (int i17 = i11; i17 < i16; i17++) {
                V.AbstractC1724j1.X(this.f14907b, i17, iS);
            }
            int i18 = this.f14918m;
            if (i18 >= i11) {
                this.f14918m = i18 + i6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i6, int i10) {
        if (i6 > 0) {
            z0(this.f14914i, i10);
            int i11 = this.f14916k;
            int i12 = this.f14917l;
            if (i12 < i6) {
                java.lang.Object[] objArr = this.f14908c;
                int length = objArr.length;
                int i13 = length - i12;
                int iMax = java.lang.Math.max(java.lang.Math.max(length * 2, i13 + i6), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[iMax];
                for (int i14 = 0; i14 < iMax; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = iMax - i13;
                p097j7.AbstractC6872n.l(objArr, objArr2, 0, 0, i11);
                p097j7.AbstractC6872n.l(objArr, objArr2, i11 + i15, i12 + i11, length);
                this.f14908c = objArr2;
                i12 = i15;
            }
            int i16 = this.f14915j;
            if (i16 >= i11) {
                this.f14915j = i16 + i6;
            }
            this.f14916k = i11 + i6;
            this.f14917l = i12 - i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(int i6) {
        if (i6 >= 0) {
            V.L0 l6 = this.f14929x;
            if (l6 == null) {
                l6 = new V.L0(null, 1, 0 == true ? 1 : 0);
                this.f14929x = l6;
            }
            l6.a(i6);
        }
    }

    private final void q1(int i6, V.L0 l6) {
        int iH0 = h0(i6);
        boolean zJ = J(i6);
        if (V.AbstractC1724j1.D(this.f14907b, iH0) != zJ) {
            V.AbstractC1724j1.W(this.f14907b, iH0, zJ);
            int iE0 = E0(i6);
            if (iE0 >= 0) {
                l6.a(iE0);
            }
        }
    }

    private final void r1(int[] iArr, int i6, int i10) {
        V.AbstractC1724j1.X(iArr, i6, S(i10, this.f14916k, this.f14917l, this.f14908c.length));
    }

    public static /* synthetic */ void t0(V.C1727k1 c1727k1, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = c1727k1.f14927v;
        }
        c1727k1.s0(i6);
    }

    private final void u0(int i6, int i10, int i11) {
        V.C1704d c1704d;
        int iF;
        int i12 = i11 + i6;
        int iD0 = d0();
        int iP = V.AbstractC1724j1.P(this.f14909d, i6, iD0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iP >= 0) {
            while (iP < this.f14909d.size() && (iF = F((c1704d = (V.C1704d) this.f14909d.get(iP)))) >= i6 && iF < i12) {
                arrayList.add(c1704d);
                this.f14909d.remove(iP);
            }
        }
        int i13 = i10 - i6;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            V.C1704d c1704d2 = (V.C1704d) arrayList.get(i14);
            int iF2 = F(c1704d2) + i13;
            if (iF2 >= this.f14912g) {
                c1704d2.c(-(iD0 - iF2));
            } else {
                c1704d2.c(iF2);
            }
            this.f14909d.add(V.AbstractC1724j1.P(this.f14909d, iF2, iD0), c1704d2);
        }
    }

    private final void u1(int i6, java.lang.Object obj) {
        int iH0 = h0(i6);
        int[] iArr = this.f14907b;
        if (!(iH0 < iArr.length && V.AbstractC1724j1.N(iArr, iH0))) {
            V.AbstractC1741q.r("Updating the node of a group at " + i6 + " that was not created with as a node group");
        }
        this.f14908c[R(D0(this.f14907b, iH0))] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i6) {
        int i10 = this.f14913h;
        int i11 = this.f14912g;
        if (i11 != i6) {
            if (!this.f14909d.isEmpty()) {
                n1(i11, i6);
            }
            if (i10 > 0) {
                int[] iArr = this.f14907b;
                int i12 = i6 * 5;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                if (i6 < i11) {
                    p097j7.AbstractC6872n.j(iArr, iArr, i13 + i12, i12, i14);
                } else {
                    p097j7.AbstractC6872n.j(iArr, iArr, i14, i14 + i13, i12 + i13);
                }
            }
            if (i6 < i11) {
                i11 = i6 + i10;
            }
            int iY = Y();
            V.AbstractC1741q.O(i11 < iY);
            while (i11 < iY) {
                int iT = V.AbstractC1724j1.T(this.f14907b, i11);
                int iH0 = H0(G0(iT), i6);
                if (iH0 != iT) {
                    V.AbstractC1724j1.b0(this.f14907b, i11, iH0);
                }
                i11++;
                if (i11 == i6) {
                    i11 += i10;
                }
            }
        }
        this.f14912g = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int i6, int i10) {
        int i11 = this.f14917l;
        int i12 = this.f14916k;
        int i13 = this.f14918m;
        if (i12 != i6) {
            java.lang.Object[] objArr = this.f14908c;
            if (i6 < i12) {
                p097j7.AbstractC6872n.l(objArr, objArr, i6 + i11, i6, i12);
            } else {
                p097j7.AbstractC6872n.l(objArr, objArr, i12, i12 + i11, i6 + i11);
            }
        }
        int iMin = java.lang.Math.min(i10 + 1, d0());
        if (i13 != iMin) {
            int length = this.f14908c.length - i11;
            if (iMin < i13) {
                int iH0 = h0(iMin);
                int iH1 = h0(i13);
                int i14 = this.f14912g;
                while (iH0 < iH1) {
                    int iF = V.AbstractC1724j1.F(this.f14907b, iH0);
                    if (!(iF >= 0)) {
                        V.AbstractC1741q.r("Unexpected anchor value, expected a positive anchor");
                    }
                    V.AbstractC1724j1.X(this.f14907b, iH0, -((length - iF) + 1));
                    iH0++;
                    if (iH0 == i14) {
                        iH0 += this.f14913h;
                    }
                }
            } else {
                int iH2 = h0(i13);
                int iH3 = h0(iMin);
                while (iH2 < iH3) {
                    int iF2 = V.AbstractC1724j1.F(this.f14907b, iH2);
                    if (!(iF2 < 0)) {
                        V.AbstractC1741q.r("Unexpected anchor value, expected a negative anchor");
                    }
                    V.AbstractC1724j1.X(this.f14907b, iH2, iF2 + length + 1);
                    iH2++;
                    if (iH2 == this.f14912g) {
                        iH2 += this.f14913h;
                    }
                }
            }
            this.f14918m = iMin;
        }
        this.f14916k = i6;
    }

    public final java.lang.Object A0(int i6) {
        int iH0 = h0(i6);
        if (V.AbstractC1724j1.N(this.f14907b, iH0)) {
            return this.f14908c[R(D0(this.f14907b, iH0))];
        }
        return null;
    }

    public final java.lang.Object B0(V.C1704d c1704d) {
        return A0(c1704d.e(this));
    }

    public final int C0(int i6) {
        return V.AbstractC1724j1.Q(this.f14907b, h0(i6));
    }

    public final void D(int i6) {
        boolean z6 = false;
        if (!(i6 >= 0)) {
            V.AbstractC1741q.r("Cannot seek backwards");
        }
        if (!(this.f14919n <= 0)) {
            V.I0.b("Cannot call seek() while inserting");
        }
        if (i6 == 0) {
            return;
        }
        int i10 = this.f14925t + i6;
        if (i10 >= this.f14927v && i10 <= this.f14926u) {
            z6 = true;
        }
        if (!z6) {
            V.AbstractC1741q.r("Cannot seek outside the current group (" + this.f14927v + '-' + this.f14926u + ')');
        }
        this.f14925t = i10;
        int iQ = Q(this.f14907b, h0(i10));
        this.f14914i = iQ;
        this.f14915j = iQ;
    }

    public final V.C1704d E(int i6) {
        java.util.ArrayList arrayList = this.f14909d;
        int iU = V.AbstractC1724j1.U(arrayList, i6, d0());
        if (iU >= 0) {
            return (V.C1704d) arrayList.get(iU);
        }
        if (i6 > this.f14912g) {
            i6 = -(d0() - i6);
        }
        V.C1704d c1704d = new V.C1704d(i6);
        arrayList.add(-(iU + 1), c1704d);
        return c1704d;
    }

    public final int E0(int i6) {
        return F0(this.f14907b, i6);
    }

    public final int F(V.C1704d c1704d) {
        int iA = c1704d.a();
        return iA < 0 ? iA + d0() : iA;
    }

    public final void G(V.C1704d c1704d, java.lang.Object obj) {
        if (!(this.f14919n == 0)) {
            V.AbstractC1741q.r("Can only append a slot if not current inserting");
        }
        int i6 = this.f14914i;
        int i10 = this.f14915j;
        int iF = F(c1704d);
        int iQ = Q(this.f14907b, h0(iF + 1));
        this.f14914i = iQ;
        this.f14915j = iQ;
        p0(1, iF);
        if (i6 >= iQ) {
            i6++;
            i10++;
        }
        this.f14908c[iQ] = obj;
        this.f14914i = i6;
        this.f14915j = i10;
    }

    public final void I() {
        int i6 = this.f14919n;
        this.f14919n = i6 + 1;
        if (i6 == 0) {
            Q0();
        }
    }

    public final void L(boolean z6) {
        this.f14928w = true;
        if (z6 && this.f14921p.d()) {
            x0(d0());
            z0(this.f14908c.length - this.f14917l, this.f14912g);
            K();
            J0();
        }
        this.f14906a.g(this, this.f14907b, this.f14912g, this.f14908c, this.f14916k, this.f14909d, this.f14910e, this.f14911f);
    }

    public final boolean L0() {
        if (!(this.f14919n == 0)) {
            V.AbstractC1741q.r("Cannot remove group while inserting");
        }
        int i6 = this.f14925t;
        int i10 = this.f14914i;
        int iQ = Q(this.f14907b, h0(i6));
        int iV0 = V0();
        e1(this.f14927v);
        V.L0 l6 = this.f14929x;
        if (l6 != null) {
            while (l6.b() && l6.c() >= i6) {
                l6.d();
            }
        }
        boolean zM0 = M0(i6, this.f14925t - i6);
        N0(iQ, this.f14914i - iQ, i6 - 1);
        this.f14925t = i6;
        this.f14914i = i10;
        this.f14920o -= iV0;
        return zM0;
    }

    public final void O0() {
        if (!(this.f14919n == 0)) {
            V.AbstractC1741q.r("Cannot reset when inserting");
        }
        J0();
        this.f14925t = 0;
        this.f14926u = Y() - this.f14913h;
        this.f14914i = 0;
        this.f14915j = 0;
        this.f14920o = 0;
    }

    public final java.lang.Object R0(int i6, int i10, java.lang.Object obj) {
        int iR = R(a1(i6, i10));
        java.lang.Object[] objArr = this.f14908c;
        java.lang.Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    public final java.lang.Object S0(int i6, java.lang.Object obj) {
        return R0(this.f14925t, i6, obj);
    }

    public final int T() {
        p170r.I i6;
        boolean z6 = this.f14919n > 0;
        int i10 = this.f14925t;
        int i11 = this.f14926u;
        int i12 = this.f14927v;
        int iH0 = h0(i12);
        int i13 = this.f14920o;
        int i14 = i10 - i12;
        boolean zN = V.AbstractC1724j1.N(this.f14907b, iH0);
        if (z6) {
            p170r.C c6 = this.f14924s;
            if (c6 != null && (i6 = (p170r.I) c6.c(i12)) != null) {
                java.lang.Object[] objArr = i6.f53322a;
                int i15 = i6.f53323b;
                for (int i16 = 0; i16 < i15; i16++) {
                    I0(objArr[i16]);
                }
            }
            V.AbstractC1724j1.Y(this.f14907b, iH0, i14);
            V.AbstractC1724j1.a0(this.f14907b, iH0, i13);
            this.f14920o = this.f14923r.i() + (zN ? 1 : i13);
            int iF0 = F0(this.f14907b, i12);
            this.f14927v = iF0;
            int iD0 = iF0 < 0 ? d0() : h0(iF0 + 1);
            int iQ = iD0 >= 0 ? Q(this.f14907b, iD0) : 0;
            this.f14914i = iQ;
            this.f14915j = iQ;
        } else {
            if (!(i10 == i11)) {
                V.AbstractC1741q.r("Expected to be at the end of a group");
            }
            int I10 = V.AbstractC1724j1.I(this.f14907b, iH0);
            int iQ2 = V.AbstractC1724j1.Q(this.f14907b, iH0);
            V.AbstractC1724j1.Y(this.f14907b, iH0, i14);
            V.AbstractC1724j1.a0(this.f14907b, iH0, i13);
            int i17 = this.f14921p.i();
            P0();
            this.f14927v = i17;
            int iF1 = F0(this.f14907b, i12);
            int i18 = this.f14923r.i();
            this.f14920o = i18;
            if (iF1 == i17) {
                this.f14920o = i18 + (zN ? 0 : i13 - iQ2);
            } else {
                int i19 = i14 - I10;
                int i20 = zN ? 0 : i13 - iQ2;
                if (i19 != 0 || i20 != 0) {
                    while (iF1 != 0 && iF1 != i17 && (i20 != 0 || i19 != 0)) {
                        int iH1 = h0(iF1);
                        if (i19 != 0) {
                            V.AbstractC1724j1.Y(this.f14907b, iH1, V.AbstractC1724j1.I(this.f14907b, iH1) + i19);
                        }
                        if (i20 != 0) {
                            int[] iArr = this.f14907b;
                            V.AbstractC1724j1.a0(iArr, iH1, V.AbstractC1724j1.Q(iArr, iH1) + i20);
                        }
                        if (V.AbstractC1724j1.N(this.f14907b, iH1)) {
                            i20 = 0;
                        }
                        iF1 = F0(this.f14907b, iF1);
                    }
                }
                this.f14920o += i20;
            }
        }
        return i13;
    }

    public final void T0(java.lang.Object obj) {
        if (!(this.f14914i <= this.f14915j)) {
            V.AbstractC1741q.r("Writing to an invalid slot");
        }
        this.f14908c[R(this.f14914i - 1)] = obj;
    }

    public final void U() {
        if (!(this.f14919n > 0)) {
            V.I0.b("Unbalanced begin/end insert");
        }
        int i6 = this.f14919n - 1;
        this.f14919n = i6;
        if (i6 == 0) {
            if (!(this.f14923r.b() == this.f14921p.b())) {
                V.AbstractC1741q.r("startGroup/endGroup mismatch while inserting");
            }
            P0();
        }
    }

    public final java.lang.Object U0() {
        if (this.f14919n > 0) {
            p0(1, this.f14927v);
        }
        java.lang.Object[] objArr = this.f14908c;
        int i6 = this.f14914i;
        this.f14914i = i6 + 1;
        return objArr[R(i6)];
    }

    public final void V(int i6) {
        boolean z6 = false;
        if (!(this.f14919n <= 0)) {
            V.AbstractC1741q.r("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f14927v;
        if (i10 != i6) {
            if (i6 >= i10 && i6 < this.f14926u) {
                z6 = true;
            }
            if (!z6) {
                V.AbstractC1741q.r("Started group at " + i6 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f14925t;
            int i12 = this.f14914i;
            int i13 = this.f14915j;
            this.f14925t = i6;
            g1();
            this.f14925t = i11;
            this.f14914i = i12;
            this.f14915j = i13;
        }
    }

    public final int V0() {
        int iH0 = h0(this.f14925t);
        int I10 = this.f14925t + V.AbstractC1724j1.I(this.f14907b, iH0);
        this.f14925t = I10;
        this.f14914i = Q(this.f14907b, h0(I10));
        if (V.AbstractC1724j1.N(this.f14907b, iH0)) {
            return 1;
        }
        return V.AbstractC1724j1.Q(this.f14907b, iH0);
    }

    public final void W(V.C1704d c1704d) {
        V(c1704d.e(this));
    }

    public final void W0() {
        int i6 = this.f14926u;
        this.f14925t = i6;
        this.f14914i = Q(this.f14907b, h0(i6));
    }

    public final java.lang.Object X0(int i6, int i10) {
        int iZ0 = Z0(this.f14907b, h0(i6));
        int iQ = Q(this.f14907b, h0(i6 + 1));
        int i11 = i10 + iZ0;
        if (iZ0 > i11 || i11 >= iQ) {
            return V.InterfaceC1734n.f14931a.a();
        }
        return this.f14908c[R(i11)];
    }

    public final java.lang.Object Y0(V.C1704d c1704d, int i6) {
        return X0(F(c1704d), i6);
    }

    public final boolean Z() {
        return this.f14928w;
    }

    public final int a0() {
        return this.f14925t;
    }

    public final int a1(int i6, int i10) {
        int iZ0 = Z0(this.f14907b, h0(i6));
        int i11 = iZ0 + i10;
        if (!(i11 >= iZ0 && i11 < Q(this.f14907b, h0(i6 + 1)))) {
            V.AbstractC1741q.r("Write to an invalid slot index " + i10 + " for group " + i6);
        }
        return i11;
    }

    public final int b0() {
        return this.f14926u;
    }

    public final int b1(int i6) {
        return Q(this.f14907b, h0(i6 + k0(i6)));
    }

    public final int c0() {
        return this.f14927v;
    }

    public final int c1(int i6) {
        return Q(this.f14907b, h0(i6 + 1));
    }

    public final int d0() {
        return Y() - this.f14913h;
    }

    public final int d1(int i6) {
        return Z0(this.f14907b, h0(i6));
    }

    public final int e0() {
        return this.f14908c.length - this.f14917l;
    }

    public final V.C1718h1 f0() {
        return this.f14906a;
    }

    public final void f1(int i6, java.lang.Object obj, java.lang.Object obj2) {
        i1(i6, obj, false, obj2);
    }

    public final java.lang.Object g0(int i6) {
        int iH0 = h0(i6);
        return V.AbstractC1724j1.J(this.f14907b, iH0) ? this.f14908c[H(this.f14907b, iH0)] : V.InterfaceC1734n.f14931a.a();
    }

    public final void g1() {
        if (!(this.f14919n == 0)) {
            V.AbstractC1741q.r("Key must be supplied when inserting");
        }
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        i1(0, aVar.a(), false, aVar.a());
    }

    public final void h1(int i6, java.lang.Object obj) {
        i1(i6, obj, false, V.InterfaceC1734n.f14931a.a());
    }

    public final int i0(int i6) {
        return V.AbstractC1724j1.O(this.f14907b, h0(i6));
    }

    public final java.lang.Object j0(int i6) {
        int iH0 = h0(i6);
        if (V.AbstractC1724j1.L(this.f14907b, iH0)) {
            return this.f14908c[V.AbstractC1724j1.S(this.f14907b, iH0)];
        }
        return null;
    }

    public final void j1(int i6, java.lang.Object obj) {
        i1(i6, obj, true, V.InterfaceC1734n.f14931a.a());
    }

    public final int k0(int i6) {
        return V.AbstractC1724j1.I(this.f14907b, h0(i6));
    }

    public final void k1(int i6) {
        V.AbstractC1741q.O(i6 > 0);
        int i10 = this.f14927v;
        int iZ0 = Z0(this.f14907b, h0(i10));
        int iQ = Q(this.f14907b, h0(i10 + 1)) - i6;
        V.AbstractC1741q.O(iQ >= iZ0);
        N0(iQ, i6, i10);
        int i11 = this.f14914i;
        if (i11 >= iZ0) {
            this.f14914i = i11 - i6;
        }
    }

    public final boolean l0(int i6) {
        return m0(i6, this.f14925t);
    }

    public final V.C1704d l1(int i6) {
        if (i6 < 0 || i6 >= d0()) {
            return null;
        }
        return V.AbstractC1724j1.G(this.f14909d, i6, d0());
    }

    public final boolean m0(int i6, int i10) {
        int iC;
        int iY;
        if (i10 == this.f14927v) {
            iY = this.f14926u;
        } else {
            iY = (i10 <= this.f14921p.h(0) && (iC = this.f14921p.c(i10)) >= 0) ? (Y() - this.f14913h) - this.f14922q.f(iC) : k0(i10) + i10;
        }
        return i6 > i10 && i6 < iY;
    }

    public final java.lang.Object m1(java.lang.Object obj) {
        if (this.f14919n <= 0 || this.f14914i == this.f14916k) {
            return I0(obj);
        }
        p170r.C c6 = this.f14924s;
        p247y7.AbstractC7342k abstractC7342k = null;
        int i6 = 1;
        int i10 = 0;
        if (c6 == null) {
            c6 = new p170r.C(i10, i6, abstractC7342k);
        }
        this.f14924s = c6;
        int i11 = this.f14927v;
        java.lang.Object objC = c6.c(i11);
        if (objC == null) {
            objC = new p170r.I(i10, i6, abstractC7342k);
            c6.s(i11, objC);
        }
        ((p170r.I) objC).g(obj);
        return V.InterfaceC1734n.f14931a.a();
    }

    public final boolean n0(int i6) {
        int i10 = this.f14927v;
        return (i6 > i10 && i6 < this.f14926u) || (i10 == 0 && i6 == 0);
    }

    public final void o1(java.lang.Object obj) {
        int iH0 = h0(this.f14925t);
        if (!V.AbstractC1724j1.J(this.f14907b, iH0)) {
            V.AbstractC1741q.r("Updating the data of a group that was not created with a data slot");
        }
        this.f14908c[R(H(this.f14907b, iH0))] = obj;
    }

    public final boolean q0() {
        int i6 = this.f14925t;
        return i6 < this.f14926u && V.AbstractC1724j1.N(this.f14907b, h0(i6));
    }

    public final boolean r0(int i6) {
        return V.AbstractC1724j1.N(this.f14907b, h0(i6));
    }

    public final void s0(int i6) {
        int iH0 = h0(i6);
        if (V.AbstractC1724j1.K(this.f14907b, iH0)) {
            return;
        }
        V.AbstractC1724j1.Z(this.f14907b, iH0, true);
        if (V.AbstractC1724j1.D(this.f14907b, iH0)) {
            return;
        }
        p1(E0(i6));
    }

    public final void s1(V.C1704d c1704d, java.lang.Object obj) {
        u1(c1704d.e(this), obj);
    }

    public final void t1(java.lang.Object obj) {
        u1(this.f14925t, obj);
    }

    public java.lang.String toString() {
        return "SlotWriter(current = " + this.f14925t + " end=" + this.f14926u + " size = " + d0() + " gap=" + this.f14912g + '-' + (this.f14912g + this.f14913h) + ')';
    }

    public final java.util.List v0(V.C1718h1 c1718h1, int i6, boolean z6) {
        boolean z10 = false;
        V.AbstractC1741q.O(this.f14919n > 0 ? true : z10);
        if (i6 != 0 || this.f14925t != 0 || this.f14906a.N() != 0 || V.AbstractC1724j1.I(c1718h1.M(), i6) != c1718h1.N()) {
            V.C1727k1 c1727k1V = c1718h1.V();
            try {
                return f14904y.b(c1727k1V, i6, this, true, true, z6);
            } finally {
                c1727k1V.L(z10);
            }
        }
        int[] iArr = this.f14907b;
        java.lang.Object[] objArr = this.f14908c;
        java.util.ArrayList arrayList = this.f14909d;
        java.util.HashMap map = this.f14910e;
        p170r.C c6 = this.f14911f;
        int[] iArrM = c1718h1.M();
        int iN = c1718h1.N();
        java.lang.Object[] objArrO = c1718h1.O();
        int iP = c1718h1.P();
        java.util.HashMap mapQ = c1718h1.Q();
        p170r.C cE = c1718h1.E();
        this.f14907b = iArrM;
        this.f14908c = objArrO;
        this.f14909d = c1718h1.D();
        this.f14912g = iN;
        this.f14913h = (iArrM.length / 5) - iN;
        this.f14916k = iP;
        this.f14917l = objArrO.length - iP;
        this.f14918m = iN;
        this.f14910e = mapQ;
        this.f14911f = cE;
        c1718h1.X(iArr, 0, objArr, 0, arrayList, map, c6);
        return this.f14909d;
    }

    public final void v1() {
        this.f14910e = this.f14906a.Q();
        this.f14911f = this.f14906a.E();
    }

    public final void w0(int i6) {
        if (!(this.f14919n == 0)) {
            V.AbstractC1741q.r("Cannot move a group while inserting");
        }
        if (!(i6 >= 0)) {
            V.AbstractC1741q.r("Parameter offset is out of bounds");
        }
        if (i6 == 0) {
            return;
        }
        int i10 = this.f14925t;
        int i11 = this.f14927v;
        int i12 = this.f14926u;
        int I10 = i10;
        for (int i13 = i6; i13 > 0; i13--) {
            I10 += V.AbstractC1724j1.I(this.f14907b, h0(I10));
            if (!(I10 <= i12)) {
                V.AbstractC1741q.r("Parameter offset is out of bounds");
            }
        }
        int I11 = V.AbstractC1724j1.I(this.f14907b, h0(I10));
        int iQ = Q(this.f14907b, h0(this.f14925t));
        int iQ2 = Q(this.f14907b, h0(I10));
        int i14 = I10 + I11;
        int iQ3 = Q(this.f14907b, h0(i14));
        int i15 = iQ3 - iQ2;
        p0(i15, java.lang.Math.max(this.f14925t - 1, 0));
        o0(I11);
        int[] iArr = this.f14907b;
        int iH0 = h0(i14) * 5;
        p097j7.AbstractC6872n.j(iArr, iArr, h0(i10) * 5, iH0, (I11 * 5) + iH0);
        if (i15 > 0) {
            java.lang.Object[] objArr = this.f14908c;
            p097j7.AbstractC6872n.l(objArr, objArr, iQ, R(iQ2 + i15), R(iQ3 + i15));
        }
        int i16 = iQ2 + i15;
        int i17 = i16 - iQ;
        int i18 = this.f14916k;
        int i19 = this.f14917l;
        int length = this.f14908c.length;
        int i20 = this.f14918m;
        int i21 = i10 + I11;
        int i22 = i10;
        while (i22 < i21) {
            int iH1 = h0(i22);
            int i23 = i18;
            int i24 = i17;
            r1(iArr, iH1, S(Q(iArr, iH1) - i17, i20 < iH1 ? 0 : i23, i19, length));
            i22++;
            i18 = i23;
            i17 = i24;
        }
        u0(i14, i10, I11);
        if (!(!M0(i14, I11))) {
            V.AbstractC1741q.r("Unexpectedly removed anchors");
        }
        X(i11, this.f14926u, i10);
        if (i15 > 0) {
            N0(i16, i15, i14 - 1);
        }
    }

    public final java.util.List y0(int i6, V.C1718h1 c1718h1, int i10) {
        V.AbstractC1741q.O(this.f14919n <= 0 && k0(this.f14925t + i6) == 1);
        int i11 = this.f14925t;
        int i12 = this.f14914i;
        int i13 = this.f14915j;
        D(i6);
        g1();
        I();
        V.C1727k1 c1727k1V = c1718h1.V();
        try {
            java.util.List listC = V.C1727k1.a.c(f14904y, c1727k1V, i10, this, false, true, false, 32, null);
            c1727k1V.L(true);
            U();
            T();
            this.f14925t = i11;
            this.f14914i = i12;
            this.f14915j = i13;
            return listC;
        } catch (java.lang.Throwable th) {
            c1727k1V.L(false);
            throw th;
        }
    }
}
