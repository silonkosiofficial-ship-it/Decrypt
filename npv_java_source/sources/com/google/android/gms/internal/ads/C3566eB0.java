package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3566eB0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KB0 f34919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5666xI f34920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f34921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3126aA0 f34924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3238bB0 f34925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3238bB0 f34926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3238bB0 f34927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3238bB0 f34928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.lang.Object f34930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f34931o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.JA0 f34933q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4830pl f34917a = new com.google.android.gms.internal.ads.C4830pl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2764Ql f34918b = new com.google.android.gms.internal.ads.C2764Ql();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.util.List f34932p = new java.util.ArrayList();

    public C3566eB0(com.google.android.gms.internal.ads.KB0 kb0, com.google.android.gms.internal.ads.InterfaceC5666xI interfaceC5666xI, com.google.android.gms.internal.ads.JA0 ja0, com.google.android.gms.internal.ads.C3126aA0 c3126aA0) {
        this.f34919c = kb0;
        this.f34920d = interfaceC5666xI;
        this.f34933q = ja0;
        this.f34924h = c3126aA0;
    }

    static boolean C(long j6, long j10) {
        return j6 == -9223372036854775807L || j6 == j10;
    }

    private final long K(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, int i6) {
        abstractC4942qm.n(obj, this.f34917a);
        this.f34917a.g(i6);
        long j6 = this.f34917a.f38064g.a(i6).f33981g;
        return 0L;
    }

    private final long a(java.lang.Object obj) {
        for (int i6 = 0; i6 < this.f34932p.size(); i6++) {
            com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = (com.google.android.gms.internal.ads.C3238bB0) this.f34932p.get(i6);
            if (c3238bB0.f34238b.equals(obj)) {
                return c3238bB0.f34243g.f34462a.f29457d;
            }
        }
        return -1L;
    }

    private final com.google.android.gms.internal.ads.C3347cB0 b(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.C3238bB0 c3238bB0, long j6) {
        int iE;
        java.lang.Object obj;
        long j10;
        long j11;
        long jMax;
        java.lang.Object obj2;
        int i6;
        long j12;
        long j13;
        com.google.android.gms.internal.ads.C3347cB0 c3347cB0 = c3238bB0.f34243g;
        long jE = (c3238bB0.e() + c3347cB0.f34466e) - j6;
        if (c3347cB0.f34468g) {
            long j14 = 0;
            int i10 = abstractC4942qm.i(abstractC4942qm.a(c3347cB0.f34462a.f29454a), this.f34917a, this.f34918b, this.f34922f, this.f34923g);
            if (i10 != -1) {
                int i11 = abstractC4942qm.d(i10, this.f34917a, true).f38060c;
                java.lang.Object obj3 = this.f34917a.f38059b;
                obj3.getClass();
                long jA = c3347cB0.f34462a.f29457d;
                if (abstractC4942qm.e(i11, this.f34918b, 0L).f31051m == i10) {
                    android.util.Pair pairM = abstractC4942qm.m(this.f34918b, this.f34917a, i11, -9223372036854775807L, java.lang.Math.max(0L, jE));
                    if (pairM != null) {
                        obj3 = pairM.first;
                        long jLongValue = ((java.lang.Long) pairM.second).longValue();
                        com.google.android.gms.internal.ads.C3238bB0 c3238bB0G = c3238bB0.g();
                        if (c3238bB0G == null || !c3238bB0G.f34238b.equals(obj3)) {
                            jA = a(obj3);
                            if (jA == -1) {
                                jA = this.f34921e;
                                this.f34921e = 1 + jA;
                            }
                        } else {
                            jA = c3238bB0G.f34243g.f34462a.f29457d;
                        }
                        j13 = jLongValue;
                        j14 = -9223372036854775807L;
                    }
                } else {
                    j13 = 0;
                }
                com.google.android.gms.internal.ads.LH0 lh0F = f(abstractC4942qm, obj3, j13, jA, this.f34918b, this.f34917a);
                if (j14 != -9223372036854775807L && c3347cB0.f34464c != -9223372036854775807L) {
                    abstractC4942qm.n(c3347cB0.f34462a.f29454a, this.f34917a).b();
                    int i12 = this.f34917a.f38064g.f26259c;
                }
                return c(abstractC4942qm, lh0F, j14, j13);
            }
        } else {
            com.google.android.gms.internal.ads.LH0 lh0 = c3347cB0.f34462a;
            abstractC4942qm.n(lh0.f29454a, this.f34917a);
            if (!lh0.b()) {
                int i13 = lh0.f29458e;
                if (i13 != -1) {
                    this.f34917a.j(i13);
                }
                com.google.android.gms.internal.ads.C4830pl c4830pl = this.f34917a;
                int i14 = lh0.f29458e;
                iE = c4830pl.e(i14);
                c4830pl.k(i14);
                if (iE != this.f34917a.a(lh0.f29458e)) {
                    obj2 = lh0.f29454a;
                    i6 = lh0.f29458e;
                    j12 = c3347cB0.f34466e;
                    return d(abstractC4942qm, obj2, i6, iE, j12, lh0.f29457d);
                }
                K(abstractC4942qm, lh0.f29454a, lh0.f29458e);
                obj = lh0.f29454a;
                j10 = c3347cB0.f34466e;
                j11 = lh0.f29457d;
                jMax = 0;
                return e(abstractC4942qm, obj, jMax, j10, j11);
            }
            i6 = lh0.f29455b;
            if (this.f34917a.a(i6) != -1) {
                iE = this.f34917a.f38064g.a(i6).a(lh0.f29456c);
                if (iE < 0) {
                    obj2 = lh0.f29454a;
                    j12 = c3347cB0.f34464c;
                    return d(abstractC4942qm, obj2, i6, iE, j12, lh0.f29457d);
                }
                long jLongValue2 = c3347cB0.f34464c;
                if (jLongValue2 == -9223372036854775807L) {
                    com.google.android.gms.internal.ads.C2764Ql c2764Ql = this.f34918b;
                    com.google.android.gms.internal.ads.C4830pl c4830pl2 = this.f34917a;
                    android.util.Pair pairM2 = abstractC4942qm.m(c2764Ql, c4830pl2, c4830pl2.f38060c, -9223372036854775807L, java.lang.Math.max(0L, jE));
                    if (pairM2 != null) {
                        jLongValue2 = ((java.lang.Long) pairM2.second).longValue();
                    }
                }
                K(abstractC4942qm, lh0.f29454a, lh0.f29455b);
                obj = lh0.f29454a;
                jMax = java.lang.Math.max(0L, jLongValue2);
                j10 = c3347cB0.f34464c;
                j11 = lh0.f29457d;
                return e(abstractC4942qm, obj, jMax, j10, j11);
            }
        }
        return null;
    }

    private final com.google.android.gms.internal.ads.C3347cB0 c(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0, long j6, long j10) {
        abstractC4942qm.n(lh0.f29454a, this.f34917a);
        boolean zB = lh0.b();
        java.lang.Object obj = lh0.f29454a;
        return zB ? d(abstractC4942qm, obj, lh0.f29455b, lh0.f29456c, j6, lh0.f29457d) : e(abstractC4942qm, obj, j10, j6, lh0.f29457d);
    }

    private final com.google.android.gms.internal.ads.C3347cB0 d(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, int i6, int i10, long j6, long j10) {
        com.google.android.gms.internal.ads.LH0 lh0 = new com.google.android.gms.internal.ads.LH0(obj, i6, i10, j10);
        long jF = abstractC4942qm.n(lh0.f29454a, this.f34917a).f(lh0.f29455b, lh0.f29456c);
        if (i10 == this.f34917a.e(i6)) {
            this.f34917a.h();
        }
        this.f34917a.k(lh0.f29455b);
        return new com.google.android.gms.internal.ads.C3347cB0(lh0, (jF == -9223372036854775807L || jF > 0) ? 0L : java.lang.Math.max(0L, (-1) + jF), j6, -9223372036854775807L, jF, false, false, false, false);
    }

    private final com.google.android.gms.internal.ads.C3347cB0 e(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, long j6, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long jMax = j6;
        abstractC4942qm.n(obj, this.f34917a);
        int iC = this.f34917a.c(jMax);
        if (iC != -1) {
            this.f34917a.j(iC);
        }
        com.google.android.gms.internal.ads.C4830pl c4830pl = this.f34917a;
        if (iC == -1) {
            c4830pl.b();
        } else {
            c4830pl.k(iC);
        }
        com.google.android.gms.internal.ads.LH0 lh0 = new com.google.android.gms.internal.ads.LH0(obj, j11, iC);
        boolean zK = k(lh0);
        boolean zI = i(abstractC4942qm, lh0);
        boolean zH = h(abstractC4942qm, lh0, zK);
        if (iC != -1) {
            this.f34917a.k(iC);
        }
        if (iC != -1) {
            this.f34917a.g(iC);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != -9223372036854775807L) {
            j13 = 0;
            j14 = 0;
        } else {
            j13 = j12;
            j14 = this.f34917a.f38061d;
        }
        if (j14 != -9223372036854775807L && jMax >= j14) {
            jMax = java.lang.Math.max(0L, j14 - 1);
        }
        return new com.google.android.gms.internal.ads.C3347cB0(lh0, jMax, j10, j13, j14, false, zK, zI, zH);
    }

    private static com.google.android.gms.internal.ads.LH0 f(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, long j6, long j10, com.google.android.gms.internal.ads.C2764Ql c2764Ql, com.google.android.gms.internal.ads.C4830pl c4830pl) {
        abstractC4942qm.n(obj, c4830pl);
        abstractC4942qm.e(c4830pl.f38060c, c2764Ql, 0L);
        abstractC4942qm.a(obj);
        c4830pl.b();
        abstractC4942qm.n(obj, c4830pl);
        int iD = c4830pl.d(j6);
        return iD == -1 ? new com.google.android.gms.internal.ads.LH0(obj, j10, c4830pl.c(j6)) : new com.google.android.gms.internal.ads.LH0(obj, iD, c4830pl.e(iD), j10);
    }

    private final void g() {
        final com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        for (com.google.android.gms.internal.ads.C3238bB0 c3238bB0G = this.f34925i; c3238bB0G != null; c3238bB0G = c3238bB0G.g()) {
            c3083Zh0.g(c3238bB0G.f34243g.f34462a);
        }
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34926j;
        final com.google.android.gms.internal.ads.LH0 lh0 = c3238bB0 == null ? null : c3238bB0.f34243g.f34462a;
        this.f34920d.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.dB0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34657C.x(c3083Zh0, lh0);
            }
        });
    }

    private final boolean h(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0, boolean z6) {
        int iA = abstractC4942qm.a(lh0.f29454a);
        return !abstractC4942qm.e(abstractC4942qm.d(iA, this.f34917a, false).f38060c, this.f34918b, 0L).f31046h && abstractC4942qm.i(iA, this.f34917a, this.f34918b, this.f34922f, this.f34923g) == -1 && z6;
    }

    private final boolean i(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0) {
        if (k(lh0)) {
            return abstractC4942qm.e(abstractC4942qm.n(lh0.f29454a, this.f34917a).f38060c, this.f34918b, 0L).f31052n == abstractC4942qm.a(lh0.f29454a);
        }
        return false;
    }

    private final boolean j(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0G = this.f34925i;
        if (c3238bB0G == null) {
            return true;
        }
        int iA = abstractC4942qm.a(c3238bB0G.f34238b);
        while (true) {
            iA = abstractC4942qm.i(iA, this.f34917a, this.f34918b, this.f34922f, this.f34923g);
            while (true) {
                c3238bB0G.getClass();
                if (c3238bB0G.g() == null || c3238bB0G.f34243g.f34468g) {
                    break;
                }
                c3238bB0G = c3238bB0G.g();
            }
            com.google.android.gms.internal.ads.C3238bB0 c3238bB0G2 = c3238bB0G.g();
            if (iA == -1 || c3238bB0G2 == null || abstractC4942qm.a(c3238bB0G2.f34238b) != iA) {
                break;
            }
            c3238bB0G = c3238bB0G2;
        }
        boolean zF = F(c3238bB0G);
        c3238bB0G.f34243g = u(abstractC4942qm, c3238bB0G.f34243g);
        return !zF;
    }

    private static final boolean k(com.google.android.gms.internal.ads.LH0 lh0) {
        return !lh0.b() && lh0.f29458e == -1;
    }

    public final void A() {
        if (this.f34932p.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < this.f34932p.size(); i6++) {
            ((com.google.android.gms.internal.ads.C3238bB0) this.f34932p.get(i6)).o();
        }
        this.f34932p = arrayList;
        this.f34928l = null;
        y();
    }

    public final void B(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.C3126aA0 c3126aA0) {
        this.f34924h = c3126aA0;
        long j6 = c3126aA0.f34023a;
        A();
    }

    public final boolean D(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34927k;
        return c3238bB0 != null && c3238bB0.f34237a == jh0;
    }

    public final boolean E(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34928l;
        return c3238bB0 != null && c3238bB0.f34237a == jh0;
    }

    public final boolean F(com.google.android.gms.internal.ads.C3238bB0 c3238bB0) {
        com.google.android.gms.internal.ads.LC.b(c3238bB0);
        boolean z6 = false;
        if (c3238bB0.equals(this.f34927k)) {
            return false;
        }
        this.f34927k = c3238bB0;
        while (c3238bB0.g() != null) {
            c3238bB0 = c3238bB0.g();
            c3238bB0.getClass();
            if (c3238bB0 == this.f34926j) {
                this.f34926j = this.f34925i;
                z6 = true;
            }
            c3238bB0.o();
            this.f34929m--;
        }
        com.google.android.gms.internal.ads.C3238bB0 c3238bB1 = this.f34927k;
        c3238bB1.getClass();
        c3238bB1.p(null);
        g();
        return z6;
    }

    public final boolean G() {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34927k;
        if (c3238bB0 == null) {
            return true;
        }
        if (c3238bB0.f34243g.f34470i || !c3238bB0.s() || this.f34927k.f34243g.f34466e == -9223372036854775807L) {
            return false;
        }
        return this.f34929m < 100;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public final boolean H(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, long j6, long j10) {
        com.google.android.gms.internal.ads.C3347cB0 c3347cB0U;
        boolean z6;
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = null;
        for (com.google.android.gms.internal.ads.C3238bB0 c3238bB0G = this.f34925i; c3238bB0G != null; c3238bB0G = c3238bB0G.g()) {
            com.google.android.gms.internal.ads.C3347cB0 c3347cB0 = c3238bB0G.f34243g;
            if (c3238bB0 == null) {
                c3347cB0U = u(abstractC4942qm, c3347cB0);
            } else {
                com.google.android.gms.internal.ads.C3347cB0 c3347cB0B = b(abstractC4942qm, c3238bB0, j6);
                if (c3347cB0B == null) {
                    return !F(c3238bB0);
                }
                if (c3347cB0.f34463b != c3347cB0B.f34463b || !c3347cB0.f34462a.equals(c3347cB0B.f34462a)) {
                    return !F(c3238bB0);
                }
                c3347cB0U = c3347cB0B;
            }
            c3238bB0G.f34243g = c3347cB0U.a(c3347cB0.f34464c);
            if (!C(c3347cB0.f34466e, c3347cB0U.f34466e)) {
                c3238bB0G.r();
                long j11 = c3347cB0U.f34466e;
                long jE = j11 == -9223372036854775807L ? Long.MAX_VALUE : j11 + c3238bB0G.e();
                if (c3238bB0G == this.f34926j) {
                    boolean z10 = c3238bB0G.f34243g.f34467f;
                    if (j10 == Long.MIN_VALUE || j10 >= jE) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                return (F(c3238bB0G) || z6) ? false : true;
            }
            c3238bB0 = c3238bB0G;
        }
        return true;
    }

    public final boolean I(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, int i6) {
        this.f34922f = i6;
        return j(abstractC4942qm);
    }

    public final boolean J(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, boolean z6) {
        this.f34923g = z6;
        return j(abstractC4942qm);
    }

    public final com.google.android.gms.internal.ads.C3238bB0 l() {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34925i;
        if (c3238bB0 == null) {
            return null;
        }
        if (c3238bB0 == this.f34926j) {
            this.f34926j = c3238bB0.g();
        }
        c3238bB0.o();
        int i6 = this.f34929m - 1;
        this.f34929m = i6;
        if (i6 == 0) {
            this.f34927k = null;
            com.google.android.gms.internal.ads.C3238bB0 c3238bB1 = this.f34925i;
            this.f34930n = c3238bB1.f34238b;
            this.f34931o = c3238bB1.f34243g.f34462a.f29457d;
        }
        this.f34925i = this.f34925i.g();
        g();
        return this.f34925i;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 m() {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34926j;
        com.google.android.gms.internal.ads.LC.b(c3238bB0);
        this.f34926j = c3238bB0.g();
        g();
        com.google.android.gms.internal.ads.C3238bB0 c3238bB1 = this.f34926j;
        com.google.android.gms.internal.ads.LC.b(c3238bB1);
        return c3238bB1;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 n(com.google.android.gms.internal.ads.C3347cB0 c3347cB0) {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0Y;
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34927k;
        long jE = c3238bB0 == null ? 1000000000000L : (c3238bB0.e() + c3238bB0.f34243g.f34466e) - c3347cB0.f34463b;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f34932p.size()) {
                c3238bB0Y = null;
                break;
            }
            com.google.android.gms.internal.ads.C3347cB0 c3347cB1 = ((com.google.android.gms.internal.ads.C3238bB0) this.f34932p.get(i6)).f34243g;
            if (C(c3347cB1.f34466e, c3347cB0.f34466e) && c3347cB1.f34463b == c3347cB0.f34463b && c3347cB1.f34462a.equals(c3347cB0.f34462a)) {
                c3238bB0Y = (com.google.android.gms.internal.ads.C3238bB0) this.f34932p.remove(i6);
                break;
            }
            i6++;
        }
        if (c3238bB0Y == null) {
            c3238bB0Y = com.google.android.gms.internal.ads.SA0.Y(this.f34933q.f28641a, c3347cB0, jE);
        } else {
            c3238bB0Y.f34243g = c3347cB0;
            c3238bB0Y.q(jE);
        }
        com.google.android.gms.internal.ads.C3238bB0 c3238bB1 = this.f34927k;
        if (c3238bB1 != null) {
            c3238bB1.p(c3238bB0Y);
        } else {
            this.f34925i = c3238bB0Y;
            this.f34926j = c3238bB0Y;
        }
        this.f34930n = null;
        this.f34927k = c3238bB0Y;
        this.f34929m++;
        g();
        return c3238bB0Y;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 o() {
        return this.f34927k;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 p() {
        return this.f34925i;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 q(com.google.android.gms.internal.ads.JH0 jh0) {
        for (int i6 = 0; i6 < this.f34932p.size(); i6++) {
            com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = (com.google.android.gms.internal.ads.C3238bB0) this.f34932p.get(i6);
            if (c3238bB0.f34237a == jh0) {
                return c3238bB0;
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 r() {
        return this.f34928l;
    }

    public final com.google.android.gms.internal.ads.C3238bB0 s() {
        return this.f34926j;
    }

    public final com.google.android.gms.internal.ads.C3347cB0 t(long j6, com.google.android.gms.internal.ads.C5103sB0 c5103sB0) {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34927k;
        return c3238bB0 == null ? c(c5103sB0.f38680a, c5103sB0.f38681b, c5103sB0.f38682c, c5103sB0.f38698s) : b(c5103sB0.f38680a, c3238bB0, j6);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    public final com.google.android.gms.internal.ads.C3347cB0 u(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.C3347cB0 c3347cB0) {
        long j6;
        long jF;
        long j10;
        long j11;
        int i6;
        int i10;
        com.google.android.gms.internal.ads.LH0 lh0 = c3347cB0.f34462a;
        boolean zK = k(lh0);
        boolean zI = i(abstractC4942qm, lh0);
        boolean zH = h(abstractC4942qm, lh0, zK);
        abstractC4942qm.n(c3347cB0.f34462a.f29454a, this.f34917a);
        if (lh0.b() || (i10 = lh0.f29458e) == -1) {
            j6 = -9223372036854775807L;
        } else {
            this.f34917a.g(i10);
            j6 = 0;
        }
        if (!lh0.b()) {
            if (j6 != -9223372036854775807L) {
                j10 = 0;
                j11 = 0;
            } else {
                jF = this.f34917a.f38061d;
            }
            if (lh0.b()) {
                this.f34917a.k(lh0.f29455b);
            } else {
                i6 = lh0.f29458e;
                if (i6 != -1) {
                    this.f34917a.k(i6);
                }
            }
            return new com.google.android.gms.internal.ads.C3347cB0(lh0, c3347cB0.f34463b, c3347cB0.f34464c, j10, j11, false, zK, zI, zH);
        }
        jF = this.f34917a.f(lh0.f29455b, lh0.f29456c);
        j10 = j6;
        j11 = jF;
        if (lh0.b()) {
            this.f34917a.k(lh0.f29455b);
        } else {
            i6 = lh0.f29458e;
            if (i6 != -1) {
                this.f34917a.k(i6);
            }
        }
        return new com.google.android.gms.internal.ads.C3347cB0(lh0, c3347cB0.f34463b, c3347cB0.f34464c, j10, j11, false, zK, zI, zH);
    }

    public final com.google.android.gms.internal.ads.LH0 v(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, long j6) {
        long jA;
        int iA;
        int i6 = abstractC4942qm.n(obj, this.f34917a).f38060c;
        java.lang.Object obj2 = this.f34930n;
        if (obj2 == null || (iA = abstractC4942qm.a(obj2)) == -1 || abstractC4942qm.d(iA, this.f34917a, false).f38060c != i6) {
            com.google.android.gms.internal.ads.C3238bB0 c3238bB0G = this.f34925i;
            while (true) {
                if (c3238bB0G == null) {
                    c3238bB0G = this.f34925i;
                    while (true) {
                        if (c3238bB0G == null) {
                            jA = a(obj);
                            if (jA != -1) {
                                break;
                            }
                            jA = this.f34921e;
                            this.f34921e = 1 + jA;
                            if (this.f34925i != null) {
                                break;
                            }
                            this.f34930n = obj;
                            this.f34931o = jA;
                            break;
                        }
                        int iA2 = abstractC4942qm.a(c3238bB0G.f34238b);
                        if (iA2 == -1 || abstractC4942qm.d(iA2, this.f34917a, false).f38060c != i6) {
                            c3238bB0G = c3238bB0G.g();
                        }
                    }
                } else if (!c3238bB0G.f34238b.equals(obj)) {
                    c3238bB0G = c3238bB0G.g();
                }
                jA = c3238bB0G.f34243g.f34462a.f29457d;
                break;
            }
        } else {
            jA = this.f34931o;
        }
        long j10 = jA;
        abstractC4942qm.n(obj, this.f34917a);
        abstractC4942qm.e(this.f34917a.f38060c, this.f34918b, 0L);
        int iA3 = abstractC4942qm.a(obj);
        java.lang.Object obj3 = obj;
        while (true) {
            com.google.android.gms.internal.ads.C2764Ql c2764Ql = this.f34918b;
            if (iA3 < c2764Ql.f31051m) {
                return f(abstractC4942qm, obj3, j6, j10, c2764Ql, this.f34917a);
            }
            abstractC4942qm.d(iA3, this.f34917a, true);
            this.f34917a.b();
            com.google.android.gms.internal.ads.C4830pl c4830pl = this.f34917a;
            if (c4830pl.d(c4830pl.f38061d) != -1) {
                obj3 = this.f34917a.f38059b;
                obj3.getClass();
            }
            iA3--;
        }
    }

    public final void w() {
        if (this.f34929m == 0) {
            return;
        }
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0G = this.f34925i;
        com.google.android.gms.internal.ads.LC.b(c3238bB0G);
        this.f34930n = c3238bB0G.f34238b;
        this.f34931o = c3238bB0G.f34243g.f34462a.f29457d;
        while (c3238bB0G != null) {
            c3238bB0G.o();
            c3238bB0G = c3238bB0G.g();
        }
        this.f34925i = null;
        this.f34927k = null;
        this.f34926j = null;
        this.f34929m = 0;
        g();
    }

    final /* synthetic */ void x(com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0, com.google.android.gms.internal.ads.LH0 lh0) {
        this.f34919c.n(c3083Zh0.j(), lh0);
    }

    public final void y() {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34928l;
        if (c3238bB0 == null || c3238bB0.t()) {
            this.f34928l = null;
            for (int i6 = 0; i6 < this.f34932p.size(); i6++) {
                com.google.android.gms.internal.ads.C3238bB0 c3238bB1 = (com.google.android.gms.internal.ads.C3238bB0) this.f34932p.get(i6);
                if (!c3238bB1.t()) {
                    this.f34928l = c3238bB1;
                    return;
                }
            }
        }
    }

    public final void z(long j6) {
        com.google.android.gms.internal.ads.C3238bB0 c3238bB0 = this.f34927k;
        if (c3238bB0 != null) {
            c3238bB0.n(j6);
        }
    }
}
