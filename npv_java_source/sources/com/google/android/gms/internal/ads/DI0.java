package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DI0 implements com.google.android.gms.internal.ads.InterfaceC3107a1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f26639A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private com.google.android.gms.internal.ads.YF0 f26640B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5667xI0 f26641a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XF0 f26644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SF0 f26645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.BI0 f26646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f26647g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26658r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f26662v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f26665y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5887zI0 f26642b = new com.google.android.gms.internal.ads.C5887zI0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26648h = 1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long[] f26649i = new long[1000];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f26650j = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f26653m = new long[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f26652l = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f26651k = new int[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Z0[] f26654n = new com.google.android.gms.internal.ads.Z0[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KI0 f26643c = new com.google.android.gms.internal.ads.KI0(new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.yI0
        @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
        public final void b(java.lang.Object obj) {
            com.google.android.gms.internal.ads.WF0 wf0 = ((com.google.android.gms.internal.ads.AI0) obj).f25131b;
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f26659s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f26660t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f26661u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f26664x = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f26663w = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f26666z = true;

    protected DI0(com.google.android.gms.internal.ads.YJ0 yj0, com.google.android.gms.internal.ads.XF0 xf0, com.google.android.gms.internal.ads.SF0 sf0) {
        this.f26644d = xf0;
        this.f26645e = sf0;
        this.f26641a = new com.google.android.gms.internal.ads.C5667xI0(yj0);
    }

    private final int i(int i6, int i10, long j6, boolean z6) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f26653m[i6];
            if (j10 > j6) {
                break;
            }
            if (!z6 || (this.f26652l[i6] & 1) != 0) {
                i11 = i12;
                if (j10 == j6) {
                    break;
                }
            }
            i6++;
            if (i6 == this.f26648h) {
                i6 = 0;
            }
        }
        return i11;
    }

    private final int j(int i6) {
        int i10 = this.f26657q + i6;
        int i11 = this.f26648h;
        return i10 < i11 ? i10 : i10 - i11;
    }

    private final synchronized int k(com.google.android.gms.internal.ads.UA0 ua0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, boolean z6, boolean z10, com.google.android.gms.internal.ads.C5887zI0 c5887zI0) {
        try {
            c5518vz0.f39487e = false;
            if (!s()) {
                if (!z10 && !this.f26662v) {
                    com.google.android.gms.internal.ads.D d6 = this.f26665y;
                    if (d6 == null || (!z6 && d6 == this.f26647g)) {
                        return -3;
                    }
                    p(d6, ua0);
                    return -5;
                }
                c5518vz0.c(4);
                c5518vz0.f39488f = Long.MIN_VALUE;
                return -4;
            }
            com.google.android.gms.internal.ads.D d10 = ((com.google.android.gms.internal.ads.AI0) this.f26643c.a(this.f26656p + this.f26658r)).f25130a;
            if (!z6 && d10 == this.f26647g) {
                int iJ = j(this.f26658r);
                if (!t(iJ)) {
                    c5518vz0.f39487e = true;
                    return -3;
                }
                c5518vz0.c(this.f26652l[iJ]);
                if (this.f26658r == this.f26655o - 1 && (z10 || this.f26662v)) {
                    c5518vz0.a(536870912);
                }
                c5518vz0.f39488f = this.f26653m[iJ];
                c5887zI0.f40277a = this.f26651k[iJ];
                c5887zI0.f40278b = this.f26650j[iJ];
                c5887zI0.f40279c = this.f26654n[iJ];
                return -4;
            }
            p(d10, ua0);
            return -5;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized long l(long j6, boolean z6, boolean z10) {
        int i6;
        try {
            int i10 = this.f26655o;
            if (i10 != 0) {
                long[] jArr = this.f26653m;
                int i11 = this.f26657q;
                if (j6 >= jArr[i11]) {
                    if (z10 && (i6 = this.f26658r) != i10) {
                        i10 = i6 + 1;
                    }
                    int i12 = i(i11, i10, j6, false);
                    if (i12 != -1) {
                        return n(i12);
                    }
                }
            }
            return -1L;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized long m() {
        int i6 = this.f26655o;
        if (i6 == 0) {
            return -1L;
        }
        return n(i6);
    }

    private final long n(int i6) {
        long j6 = this.f26660t;
        long jMax = Long.MIN_VALUE;
        if (i6 != 0) {
            int iJ = j(i6 - 1);
            for (int i10 = 0; i10 < i6; i10++) {
                jMax = java.lang.Math.max(jMax, this.f26653m[iJ]);
                if ((this.f26652l[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f26648h - 1;
                }
            }
        }
        this.f26660t = java.lang.Math.max(j6, jMax);
        this.f26655o -= i6;
        int i11 = this.f26656p + i6;
        this.f26656p = i11;
        int i12 = this.f26657q + i6;
        this.f26657q = i12;
        int i13 = this.f26648h;
        if (i12 >= i13) {
            this.f26657q = i12 - i13;
        }
        int i14 = this.f26658r - i6;
        this.f26658r = i14;
        if (i14 < 0) {
            this.f26658r = 0;
        }
        this.f26643c.e(i11);
        if (this.f26655o != 0) {
            return this.f26650j[this.f26657q];
        }
        int i15 = this.f26657q;
        if (i15 == 0) {
            i15 = this.f26648h;
        }
        int i16 = i15 - 1;
        return this.f26650j[i16] + ((long) this.f26651k[i16]);
    }

    private final synchronized void o(long j6, int i6, long j10, int i10, com.google.android.gms.internal.ads.Z0 z6) {
        try {
            int i11 = this.f26655o;
            if (i11 > 0) {
                int iJ = j(i11 - 1);
                com.google.android.gms.internal.ads.LC.d(this.f26650j[iJ] + ((long) this.f26651k[iJ]) <= j10);
            }
            this.f26662v = (536870912 & i6) != 0;
            this.f26661u = java.lang.Math.max(this.f26661u, j6);
            int iJ2 = j(this.f26655o);
            this.f26653m[iJ2] = j6;
            this.f26650j[iJ2] = j10;
            this.f26651k[iJ2] = i10;
            this.f26652l[iJ2] = i6;
            this.f26654n[iJ2] = z6;
            this.f26649i[iJ2] = 0;
            if (this.f26643c.f() || !((com.google.android.gms.internal.ads.AI0) this.f26643c.b()).f25130a.equals(this.f26665y)) {
                com.google.android.gms.internal.ads.D d6 = this.f26665y;
                if (d6 == null) {
                    throw null;
                }
                this.f26643c.c(this.f26656p + this.f26655o, new com.google.android.gms.internal.ads.AI0(d6, this.f26644d.b(this.f26645e, d6), null));
            }
            int i12 = this.f26655o + 1;
            this.f26655o = i12;
            int i13 = this.f26648h;
            if (i12 == i13) {
                int i14 = i13 + 1000;
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr = new int[i14];
                int[] iArr2 = new int[i14];
                com.google.android.gms.internal.ads.Z0[] z0Arr = new com.google.android.gms.internal.ads.Z0[i14];
                int i15 = this.f26657q;
                int i16 = i13 - i15;
                java.lang.System.arraycopy(this.f26650j, i15, jArr2, 0, i16);
                java.lang.System.arraycopy(this.f26653m, this.f26657q, jArr3, 0, i16);
                java.lang.System.arraycopy(this.f26652l, this.f26657q, iArr, 0, i16);
                java.lang.System.arraycopy(this.f26651k, this.f26657q, iArr2, 0, i16);
                java.lang.System.arraycopy(this.f26654n, this.f26657q, z0Arr, 0, i16);
                java.lang.System.arraycopy(this.f26649i, this.f26657q, jArr, 0, i16);
                int i17 = this.f26657q;
                java.lang.System.arraycopy(this.f26650j, 0, jArr2, i16, i17);
                java.lang.System.arraycopy(this.f26653m, 0, jArr3, i16, i17);
                java.lang.System.arraycopy(this.f26652l, 0, iArr, i16, i17);
                java.lang.System.arraycopy(this.f26651k, 0, iArr2, i16, i17);
                java.lang.System.arraycopy(this.f26654n, 0, z0Arr, i16, i17);
                java.lang.System.arraycopy(this.f26649i, 0, jArr, i16, i17);
                this.f26650j = jArr2;
                this.f26653m = jArr3;
                this.f26652l = iArr;
                this.f26651k = iArr2;
                this.f26654n = z0Arr;
                this.f26649i = jArr;
                this.f26657q = 0;
                this.f26648h = i14;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final void p(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.UA0 ua0) {
        com.google.android.gms.internal.ads.D d10 = this.f26647g;
        com.google.android.gms.internal.ads.EH0 eh0 = d10 == null ? null : d10.f26578s;
        this.f26647g = d6;
        com.google.android.gms.internal.ads.EH0 eh1 = d6.f26578s;
        ua0.f32158a = d6.c(this.f26644d.a(d6));
        ua0.f32159b = this.f26640B;
        if (d10 == null || !j$.util.Objects.equals(eh0, eh1)) {
            com.google.android.gms.internal.ads.YF0 yf0C = this.f26644d.c(this.f26645e, d6);
            this.f26640B = yf0C;
            ua0.f32159b = yf0C;
        }
    }

    private final void q() {
        if (this.f26640B != null) {
            this.f26640B = null;
            this.f26647g = null;
        }
    }

    private final synchronized void r() {
        this.f26658r = 0;
        this.f26641a.g();
    }

    private final boolean s() {
        return this.f26658r != this.f26655o;
    }

    private final boolean t(int i6) {
        if (this.f26640B != null) {
            return (this.f26652l[i6] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean u(com.google.android.gms.internal.ads.D d6) {
        try {
            this.f26664x = false;
            if (j$.util.Objects.equals(d6, this.f26665y)) {
                return false;
            }
            if (!this.f26643c.f() && ((com.google.android.gms.internal.ads.AI0) this.f26643c.b()).f25130a.equals(d6)) {
                d6 = ((com.google.android.gms.internal.ads.AI0) this.f26643c.b()).f25130a;
            }
            this.f26665y = d6;
            boolean z6 = this.f26666z;
            com.google.android.gms.internal.ads.D d10 = this.f26665y;
            this.f26666z = z6 & com.google.android.gms.internal.ads.AbstractC3606ed.f(d10.f26574o, d10.f26570k);
            this.f26639A = false;
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized long A() {
        return this.f26661u;
    }

    public final synchronized com.google.android.gms.internal.ads.D B() {
        if (this.f26664x) {
            return null;
        }
        return this.f26665y;
    }

    public final void C(long j6, boolean z6, boolean z10) {
        this.f26641a.c(l(j6, false, z10));
    }

    public final void D() {
        this.f26641a.c(m());
    }

    public final void E() throws com.google.android.gms.internal.ads.PF0 {
        com.google.android.gms.internal.ads.YF0 yf0 = this.f26640B;
        if (yf0 != null) {
            throw yf0.a();
        }
    }

    public final void F() {
        D();
        q();
    }

    public final void G() {
        H(true);
        q();
    }

    public final void H(boolean z6) {
        this.f26641a.f();
        this.f26655o = 0;
        this.f26656p = 0;
        this.f26657q = 0;
        this.f26658r = 0;
        this.f26663w = true;
        this.f26659s = Long.MIN_VALUE;
        this.f26660t = Long.MIN_VALUE;
        this.f26661u = Long.MIN_VALUE;
        this.f26662v = false;
        this.f26643c.d();
        if (z6) {
            this.f26665y = null;
            this.f26664x = true;
            this.f26666z = true;
        }
    }

    public final void I(long j6) {
        this.f26659s = j6;
    }

    public final void J(com.google.android.gms.internal.ads.BI0 bi0) {
        this.f26646f = bi0;
    }

    public final synchronized void K(int i6) {
        boolean z6 = false;
        if (i6 >= 0) {
            try {
                if (this.f26658r + i6 <= this.f26655o) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f26658r += i6;
    }

    public final synchronized boolean L() {
        return this.f26662v;
    }

    public final synchronized boolean M(boolean z6) {
        boolean z10 = true;
        if (s()) {
            if (((com.google.android.gms.internal.ads.AI0) this.f26643c.a(this.f26656p + this.f26658r)).f25130a != this.f26647g) {
                return true;
            }
            return t(j(this.f26658r));
        }
        if (!z6 && !this.f26662v) {
            com.google.android.gms.internal.ads.D d6 = this.f26665y;
            if (d6 == null) {
                z10 = false;
            } else if (d6 == this.f26647g) {
                return false;
            }
        }
        return z10;
    }

    public final synchronized boolean N(int i6) {
        r();
        int i10 = this.f26656p;
        if (i6 >= i10 && i6 <= this.f26655o + i10) {
            this.f26659s = Long.MIN_VALUE;
            this.f26658r = i6 - i10;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        com.google.android.gms.internal.ads.Y0.b(this, c5128sR, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void b(long j6, int i6, int i10, int i11, com.google.android.gms.internal.ads.Z0 z6) {
        if (this.f26663w) {
            if ((i6 & 1) == 0) {
                return;
            } else {
                this.f26663w = false;
            }
        }
        if (this.f26666z) {
            if (j6 < this.f26659s) {
                return;
            }
            if ((i6 & 1) == 0) {
                if (!this.f26639A) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(java.lang.String.valueOf(this.f26665y)));
                    this.f26639A = true;
                }
                i6 |= 1;
            }
        }
        int i12 = i6;
        o(j6, i12, (this.f26641a.b() - ((long) i10)) - ((long) i11), i10, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void c(com.google.android.gms.internal.ads.D d6) {
        boolean zU = u(d6);
        com.google.android.gms.internal.ads.BI0 bi0 = this.f26646f;
        if (bi0 == null || !zU) {
            return;
        }
        bi0.n(d6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ void d(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ int e(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6) {
        return com.google.android.gms.internal.ads.Y0.a(this, interfaceC4884qB0, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final int f(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6, int i10) {
        return this.f26641a.a(interfaceC4884qB0, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void g(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10) {
        this.f26641a.h(c5128sR, i6);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046 A[EDGE_INSN: B:25:0x0046->B:28:0x0054 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[EDGE_INSN: B:26:0x0047->B:28:0x0054 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x003d A[SYNTHETIC] */
    public final synchronized boolean h(long j6, boolean z6) {
        int i6;
        int i10;
        try {
            r();
            int i11 = this.f26658r;
            int iJ = j(i11);
            if (s() && j6 >= this.f26653m[iJ]) {
                if (j6 <= this.f26661u) {
                    if (this.f26666z) {
                        i6 = this.f26655o - i11;
                        i10 = 0;
                        while (true) {
                            if (i10 < i6) {
                                if (z6) {
                                    i6 = -1;
                                    break;
                                }
                                break;
                            }
                            if (this.f26653m[iJ] < j6) {
                                i6 = i10;
                                break;
                            }
                            iJ++;
                            if (iJ == this.f26648h) {
                                iJ = 0;
                            }
                            i10++;
                        }
                    } else {
                        i6 = i(iJ, this.f26655o - i11, j6, true);
                    }
                    if (i6 == -1) {
                        this.f26659s = j6;
                        this.f26658r += i6;
                        return true;
                    }
                } else if (z6) {
                    z6 = true;
                    if (this.f26666z) {
                        i6 = this.f26655o - i11;
                        i10 = 0;
                        while (true) {
                            if (i10 < i6) {
                                if (z6) {
                                    i6 = -1;
                                    break;
                                }
                                break;
                                break;
                            }
                            if (this.f26653m[iJ] < j6) {
                                i6 = i10;
                                break;
                            }
                            iJ++;
                            if (iJ == this.f26648h) {
                                iJ = 0;
                            }
                            i10++;
                        }
                    } else {
                        i6 = i(iJ, this.f26655o - i11, j6, true);
                    }
                    if (i6 == -1) {
                        this.f26659s = j6;
                        this.f26658r += i6;
                        return true;
                    }
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final int v() {
        return this.f26656p;
    }

    public final int w() {
        return this.f26656p + this.f26658r;
    }

    public final synchronized int x(long j6, boolean z6) {
        int i6 = this.f26658r;
        int iJ = j(i6);
        if (s() && j6 >= this.f26653m[iJ]) {
            if (j6 > this.f26661u && z6) {
                return this.f26655o - i6;
            }
            int i10 = i(iJ, this.f26655o - i6, j6, true);
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }
        return 0;
    }

    public final int y() {
        return this.f26656p + this.f26655o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(com.google.android.gms.internal.ads.UA0 r9, com.google.android.gms.internal.ads.C5518vz0 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zI0 r7 = r8.f26642b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.k(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.f()
            if (r9 != 0) goto L2b
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L35
            if (r9 == 0) goto L2d
            com.google.android.gms.internal.ads.xI0 r9 = r8.f26641a
            com.google.android.gms.internal.ads.zI0 r11 = r8.f26642b
            r9.d(r10, r11)
        L2b:
            r9 = r12
            goto L3e
        L2d:
            com.google.android.gms.internal.ads.xI0 r9 = r8.f26641a
            com.google.android.gms.internal.ads.zI0 r11 = r8.f26642b
            r9.e(r10, r11)
            goto L38
        L35:
            if (r9 == 0) goto L38
            goto L2b
        L38:
            int r9 = r8.f26658r
            int r9 = r9 + r1
            r8.f26658r = r9
            return r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DI0.z(com.google.android.gms.internal.ads.UA0, com.google.android.gms.internal.ads.vz0, int, boolean):int");
    }
}
