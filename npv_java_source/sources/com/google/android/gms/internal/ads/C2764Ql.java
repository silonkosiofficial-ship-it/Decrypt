package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2764Ql {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.lang.Object f31037o = new java.lang.Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Q7 f31038p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f31040b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.gms.internal.ads.N4 f31047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f31049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f31050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31052n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f31039a = f31037o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.ads.Q7 f31041c = f31038p;

    static {
        com.google.android.gms.internal.ads.I1 i6 = new com.google.android.gms.internal.ads.I1();
        i6.a("androidx.media3.common.Timeline");
        i6.b(android.net.Uri.EMPTY);
        f31038p = i6.c();
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
        java.lang.Integer.toString(8, 36);
        java.lang.Integer.toString(9, 36);
        java.lang.Integer.toString(10, 36);
        java.lang.Integer.toString(11, 36);
        java.lang.Integer.toString(12, 36);
        java.lang.Integer.toString(13, 36);
    }

    public final com.google.android.gms.internal.ads.C2764Ql a(java.lang.Object obj, com.google.android.gms.internal.ads.Q7 q10, java.lang.Object obj2, long j6, long j10, long j11, boolean z6, boolean z10, com.google.android.gms.internal.ads.N4 n6, long j12, long j13, int i6, int i10, long j14) {
        this.f31039a = obj;
        this.f31041c = q10 == null ? f31038p : q10;
        this.f31040b = null;
        this.f31042d = -9223372036854775807L;
        this.f31043e = -9223372036854775807L;
        this.f31044f = -9223372036854775807L;
        this.f31045g = z6;
        this.f31046h = z10;
        this.f31047i = n6;
        this.f31049k = 0L;
        this.f31050l = j13;
        this.f31051m = 0;
        this.f31052n = 0;
        this.f31048j = false;
        return this;
    }

    public final boolean b() {
        return this.f31047i != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C2764Ql.class.equals(obj.getClass())) {
            com.google.android.gms.internal.ads.C2764Ql c2764Ql = (com.google.android.gms.internal.ads.C2764Ql) obj;
            if (j$.util.Objects.equals(this.f31039a, c2764Ql.f31039a) && j$.util.Objects.equals(this.f31041c, c2764Ql.f31041c) && j$.util.Objects.equals(this.f31047i, c2764Ql.f31047i) && this.f31042d == c2764Ql.f31042d && this.f31043e == c2764Ql.f31043e && this.f31044f == c2764Ql.f31044f && this.f31045g == c2764Ql.f31045g && this.f31046h == c2764Ql.f31046h && this.f31048j == c2764Ql.f31048j && this.f31050l == c2764Ql.f31050l && this.f31051m == c2764Ql.f31051m && this.f31052n == c2764Ql.f31052n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f31039a.hashCode() + 217) * 31) + this.f31041c.hashCode();
        com.google.android.gms.internal.ads.N4 n6 = this.f31047i;
        int iHashCode2 = ((iHashCode * 961) + (n6 == null ? 0 : n6.hashCode())) * 31;
        long j6 = this.f31042d;
        int i6 = (iHashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f31043e;
        int i10 = (i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f31044f;
        int i11 = ((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f31045g ? 1 : 0)) * 31) + (this.f31046h ? 1 : 0)) * 31) + (this.f31048j ? 1 : 0);
        long j12 = this.f31050l;
        return ((((((i11 * 961) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f31051m) * 31) + this.f31052n) * 31;
    }
}
