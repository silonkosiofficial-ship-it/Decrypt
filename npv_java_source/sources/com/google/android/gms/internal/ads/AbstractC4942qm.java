package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4942qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.AbstractC4942qm f38311a = new com.google.android.gms.internal.ads.C2688Ok();

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
    }

    protected AbstractC4942qm() {
    }

    public abstract int a(java.lang.Object obj);

    public abstract int b();

    public abstract int c();

    public abstract com.google.android.gms.internal.ads.C4830pl d(int i6, com.google.android.gms.internal.ads.C4830pl c4830pl, boolean z6);

    public abstract com.google.android.gms.internal.ads.C2764Ql e(int i6, com.google.android.gms.internal.ads.C2764Ql c2764Ql, long j6);

    public final boolean equals(java.lang.Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.AbstractC4942qm)) {
            return false;
        }
        com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm = (com.google.android.gms.internal.ads.AbstractC4942qm) obj;
        if (abstractC4942qm.c() == c() && abstractC4942qm.b() == b()) {
            com.google.android.gms.internal.ads.C2764Ql c2764Ql = new com.google.android.gms.internal.ads.C2764Ql();
            com.google.android.gms.internal.ads.C4830pl c4830pl = new com.google.android.gms.internal.ads.C4830pl();
            com.google.android.gms.internal.ads.C2764Ql c2764Ql2 = new com.google.android.gms.internal.ads.C2764Ql();
            com.google.android.gms.internal.ads.C4830pl c4830pl2 = new com.google.android.gms.internal.ads.C4830pl();
            for (int i6 = 0; i6 < c(); i6++) {
                if (!e(i6, c2764Ql, 0L).equals(abstractC4942qm.e(i6, c2764Ql2, 0L))) {
                    return false;
                }
            }
            for (int i10 = 0; i10 < b(); i10++) {
                if (!d(i10, c4830pl, true).equals(abstractC4942qm.d(i10, c4830pl2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == abstractC4942qm.g(true) && (iH = h(true)) == abstractC4942qm.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != abstractC4942qm.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract java.lang.Object f(int i6);

    public int g(boolean z6) {
        return o() ? -1 : 0;
    }

    public int h(boolean z6) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i6;
        com.google.android.gms.internal.ads.C2764Ql c2764Ql = new com.google.android.gms.internal.ads.C2764Ql();
        com.google.android.gms.internal.ads.C4830pl c4830pl = new com.google.android.gms.internal.ads.C4830pl();
        int iC = c() + 217;
        int i10 = 0;
        while (true) {
            i6 = iC * 31;
            if (i10 >= c()) {
                break;
            }
            iC = i6 + e(i10, c2764Ql, 0L).hashCode();
            i10++;
        }
        int iB = i6 + b();
        for (int i11 = 0; i11 < b(); i11++) {
            iB = (iB * 31) + d(i11, c4830pl, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i6, com.google.android.gms.internal.ads.C4830pl c4830pl, com.google.android.gms.internal.ads.C2764Ql c2764Ql, int i10, boolean z6) {
        int i11 = d(i6, c4830pl, false).f38060c;
        if (e(i11, c2764Ql, 0L).f31052n != i6) {
            return i6 + 1;
        }
        int iJ = j(i11, i10, z6);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, c2764Ql, 0L).f31051m;
    }

    public int j(int i6, int i10, boolean z6) {
        if (i10 == 0) {
            if (i6 == h(z6)) {
                return -1;
            }
            return i6 + 1;
        }
        if (i10 == 1) {
            return i6;
        }
        if (i10 == 2) {
            return i6 == h(z6) ? g(z6) : i6 + 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public int k(int i6, int i10, boolean z6) {
        if (i6 == g(false)) {
            return -1;
        }
        return i6 - 1;
    }

    public final android.util.Pair l(com.google.android.gms.internal.ads.C2764Ql c2764Ql, com.google.android.gms.internal.ads.C4830pl c4830pl, int i6, long j6) {
        android.util.Pair pairM = m(c2764Ql, c4830pl, i6, j6, 0L);
        pairM.getClass();
        return pairM;
    }

    public final android.util.Pair m(com.google.android.gms.internal.ads.C2764Ql c2764Ql, com.google.android.gms.internal.ads.C4830pl c4830pl, int i6, long j6, long j10) {
        com.google.android.gms.internal.ads.LC.a(i6, 0, c());
        e(i6, c2764Ql, j10);
        if (j6 == -9223372036854775807L) {
            long j11 = c2764Ql.f31049k;
            j6 = 0;
        }
        int i10 = c2764Ql.f31051m;
        d(i10, c4830pl, false);
        while (i10 < c2764Ql.f31052n) {
            long j12 = c4830pl.f38062e;
            if (j6 == 0) {
                break;
            }
            int i11 = i10 + 1;
            long j13 = d(i11, c4830pl, false).f38062e;
            if (j6 < 0) {
                break;
            }
            i10 = i11;
        }
        d(i10, c4830pl, true);
        long j14 = c4830pl.f38062e;
        long j15 = c4830pl.f38061d;
        if (j15 != -9223372036854775807L) {
            j6 = java.lang.Math.min(j6, j15 - 1);
        }
        long jMax = java.lang.Math.max(0L, j6);
        java.lang.Object obj = c4830pl.f38059b;
        obj.getClass();
        return android.util.Pair.create(obj, java.lang.Long.valueOf(jMax));
    }

    public com.google.android.gms.internal.ads.C4830pl n(java.lang.Object obj, com.google.android.gms.internal.ads.C4830pl c4830pl) {
        return d(a(obj), c4830pl, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
