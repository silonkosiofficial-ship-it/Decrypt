package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4863q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.InterfaceC3107a1 f38131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f38134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f38141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long[] f38142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f38143m;

    public C4863q1(int i6, int i10, long j6, int i11, com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        i10 = i10 != 1 ? 2 : i10;
        this.f38134d = j6;
        this.f38135e = i11;
        this.f38131a = interfaceC3107a1;
        this.f38132b = h(i6, i10 == 2 ? 1667497984 : 1651965952);
        this.f38133c = i10 == 2 ? h(i6, 1650720768) : -1;
        this.f38141k = -1L;
        this.f38142l = new long[512];
        this.f38143m = new int[512];
    }

    private static int h(int i6, int i10) {
        return (((i6 % 10) + 48) << 8) | ((i6 / 10) + 48) | i10;
    }

    private final long i(int i6) {
        return (this.f38134d * ((long) i6)) / ((long) this.f38135e);
    }

    private final com.google.android.gms.internal.ads.U0 j(int i6) {
        return new com.google.android.gms.internal.ads.U0(((long) this.f38143m[i6]) * i(1), this.f38142l[i6]);
    }

    public final com.google.android.gms.internal.ads.R0 a(long j6) {
        if (this.f38140j == 0) {
            com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(0L, this.f38141k);
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        int i6 = (int) (j6 / i(1));
        int iU = com.google.android.gms.internal.ads.EW.u(this.f38143m, i6, true, true);
        if (this.f38143m[iU] == i6) {
            com.google.android.gms.internal.ads.U0 u0J = j(iU);
            return new com.google.android.gms.internal.ads.R0(u0J, u0J);
        }
        com.google.android.gms.internal.ads.U0 u0J2 = j(iU);
        int i10 = iU + 1;
        return i10 < this.f38142l.length ? new com.google.android.gms.internal.ads.R0(u0J2, j(i10)) : new com.google.android.gms.internal.ads.R0(u0J2, u0J2);
    }

    public final void b(long j6, boolean z6) {
        if (this.f38141k == -1) {
            this.f38141k = j6;
        }
        if (z6) {
            if (this.f38140j == this.f38143m.length) {
                long[] jArr = this.f38142l;
                this.f38142l = java.util.Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f38143m;
                this.f38143m = java.util.Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f38142l;
            int i6 = this.f38140j;
            jArr2[i6] = j6;
            this.f38143m[i6] = this.f38139i;
            this.f38140j = i6 + 1;
        }
        this.f38139i++;
    }

    public final void c() {
        this.f38142l = java.util.Arrays.copyOf(this.f38142l, this.f38140j);
        this.f38143m = java.util.Arrays.copyOf(this.f38143m, this.f38140j);
    }

    public final void d(int i6) {
        this.f38136f = i6;
        this.f38137g = i6;
    }

    public final void e(long j6) {
        int i6;
        if (this.f38140j == 0) {
            i6 = 0;
        } else {
            i6 = this.f38143m[com.google.android.gms.internal.ads.EW.v(this.f38142l, j6, true, true)];
        }
        this.f38138h = i6;
    }

    public final boolean f(int i6) {
        return this.f38132b == i6 || this.f38133c == i6;
    }

    public final boolean g(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        int i6 = this.f38137g;
        int iE = i6 - this.f38131a.e(interfaceC5300u0, i6, false);
        this.f38137g = iE;
        boolean z6 = iE == 0;
        if (z6) {
            if (this.f38136f > 0) {
                this.f38131a.b(i(this.f38138h), java.util.Arrays.binarySearch(this.f38143m, this.f38138h) >= 0 ? 1 : 0, this.f38136f, 0, null);
            }
            this.f38138h++;
        }
        return z6;
    }
}
