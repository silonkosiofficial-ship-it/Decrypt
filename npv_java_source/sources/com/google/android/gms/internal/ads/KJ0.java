package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f28890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PI0[] f28891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f28892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[][][] f28893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PI0 f28894e;

    KJ0(java.lang.String[] strArr, int[] iArr, com.google.android.gms.internal.ads.PI0[] pi0Arr, int[] iArr2, int[][][] iArr3, com.google.android.gms.internal.ads.PI0 pi0) {
        this.f28890a = iArr;
        this.f28891b = pi0Arr;
        this.f28893d = iArr3;
        this.f28892c = iArr2;
        this.f28894e = pi0;
    }

    public final int a(int i6, int i10, boolean z6) {
        int i11 = this.f28891b[i6].b(i10).f30777a;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if ((this.f28893d[i6][i10][i14] & 7) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i13);
        java.lang.String str = null;
        int i15 = 0;
        int iMin = 16;
        boolean z10 = false;
        while (i12 < iArrCopyOf.length) {
            java.lang.String str2 = this.f28891b[i6].b(i10).b(iArrCopyOf[i12]).f26574o;
            int i16 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z10 |= !j$.util.Objects.equals(str, str2);
            }
            iMin = java.lang.Math.min(iMin, this.f28893d[i6][i10][i12] & 24);
            i12++;
            i15 = i16;
        }
        return z10 ? java.lang.Math.min(iMin, this.f28892c[i6]) : iMin;
    }

    public final int b(int i6, int i10, int i11) {
        return this.f28893d[i6][i10][i11];
    }

    public final int c(int i6) {
        return this.f28890a[i6];
    }

    public final com.google.android.gms.internal.ads.PI0 d(int i6) {
        return this.f28891b[i6];
    }

    public final com.google.android.gms.internal.ads.PI0 e() {
        return this.f28894e;
    }
}
