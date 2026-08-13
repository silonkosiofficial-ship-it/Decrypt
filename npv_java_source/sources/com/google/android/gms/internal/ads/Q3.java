package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.N3 f30865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f30867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f30868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f30870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f30871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f30872h;

    public Q3(com.google.android.gms.internal.ads.N3 n6, long[] jArr, int[] iArr, int i6, long[] jArr2, int[] iArr2, long j6) {
        int length = iArr.length;
        int length2 = jArr2.length;
        com.google.android.gms.internal.ads.LC.d(length == length2);
        int length3 = jArr.length;
        com.google.android.gms.internal.ads.LC.d(length3 == length2);
        int length4 = iArr2.length;
        com.google.android.gms.internal.ads.LC.d(length4 == length2);
        this.f30865a = n6;
        this.f30867c = jArr;
        this.f30868d = iArr;
        this.f30869e = i6;
        this.f30870f = jArr2;
        this.f30871g = iArr2;
        this.f30872h = j6;
        this.f30866b = length3;
        if (length4 > 0) {
            int i10 = length4 - 1;
            iArr2[i10] = iArr2[i10] | 536870912;
        }
    }

    public final int a(long j6) {
        for (int iV = com.google.android.gms.internal.ads.EW.v(this.f30870f, j6, true, false); iV >= 0; iV--) {
            if ((this.f30871g[iV] & 1) != 0) {
                return iV;
            }
        }
        return -1;
    }

    public final int b(long j6) {
        for (int iS = com.google.android.gms.internal.ads.EW.s(this.f30870f, j6, true, false); iS < this.f30870f.length; iS++) {
            if ((this.f30871g[iS] & 1) != 0) {
                return iS;
            }
        }
        return -1;
    }
}
