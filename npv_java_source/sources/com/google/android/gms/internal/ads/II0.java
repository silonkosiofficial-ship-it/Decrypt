package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class II0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Random f28438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f28439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f28440c;

    public II0(int i6) {
        this(0, new java.util.Random());
    }

    private II0(int i6, java.util.Random random) {
        this(new int[0], random);
    }

    private II0(int[] iArr, java.util.Random random) {
        this.f28439b = iArr;
        this.f28438a = random;
        this.f28440c = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f28440c[iArr[i6]] = i6;
        }
    }

    public final int a() {
        int[] iArr = this.f28439b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = this.f28439b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int c() {
        return this.f28439b.length;
    }

    public final int d(int i6) {
        int i10 = this.f28440c[i6] + 1;
        int[] iArr = this.f28439b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int e(int i6) {
        int i10 = this.f28440c[i6] - 1;
        if (i10 >= 0) {
            return this.f28439b[i10];
        }
        return -1;
    }

    public final com.google.android.gms.internal.ads.II0 f() {
        return new com.google.android.gms.internal.ads.II0(0, new java.util.Random(this.f28438a.nextLong()));
    }

    public final com.google.android.gms.internal.ads.II0 g(int i6, int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            iArr[i12] = this.f28438a.nextInt(this.f28439b.length + 1);
            int i13 = i12 + 1;
            int iNextInt = this.f28438a.nextInt(i13);
            iArr2[i12] = iArr2[iNextInt];
            iArr2[iNextInt] = i12;
            i12 = i13;
        }
        java.util.Arrays.sort(iArr);
        int[] iArr3 = new int[this.f28439b.length + i10];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.f28439b;
            if (i11 >= iArr4.length + i10) {
                return new com.google.android.gms.internal.ads.II0(iArr3, new java.util.Random(this.f28438a.nextLong()));
            }
            if (i14 >= i10 || i15 != iArr[i14]) {
                int i16 = i15 + 1;
                int i17 = iArr4[i15];
                iArr3[i11] = i17;
                if (i17 >= 0) {
                    iArr3[i11] = i17 + i10;
                }
                i15 = i16;
            } else {
                iArr3[i11] = iArr2[i14];
                i14++;
            }
            i11++;
        }
    }

    public final com.google.android.gms.internal.ads.II0 h(int i6, int i10) {
        int[] iArr = new int[this.f28439b.length - i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.f28439b;
            if (i11 >= iArr2.length) {
                return new com.google.android.gms.internal.ads.II0(iArr, new java.util.Random(this.f28438a.nextLong()));
            }
            int i13 = iArr2[i11];
            if (i13 < 0 || i13 >= i10) {
                int i14 = i11 - i12;
                if (i13 >= 0) {
                    i13 -= i10;
                }
                iArr[i14] = i13;
            } else {
                i12++;
            }
            i11++;
        }
    }
}
