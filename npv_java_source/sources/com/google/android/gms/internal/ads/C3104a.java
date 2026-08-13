package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3104a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33974i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.net.Uri[] f33977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.Q7[] f33978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f33979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f33980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f33981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f33982h;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
        java.lang.Integer.toString(8, 36);
    }

    public C3104a(long j6) {
        this(0L, -1, -1, new int[0], new com.google.android.gms.internal.ads.Q7[0], new long[0], 0L, false);
    }

    private C3104a(long j6, int i6, int i10, int[] iArr, com.google.android.gms.internal.ads.Q7[] q7Arr, long[] jArr, long j10, boolean z6) {
        android.net.Uri uri;
        int length = iArr.length;
        int length2 = q7Arr.length;
        int i11 = 0;
        com.google.android.gms.internal.ads.LC.d(length == length2);
        this.f33975a = 0L;
        this.f33976b = i6;
        this.f33979e = iArr;
        this.f33978d = q7Arr;
        this.f33980f = jArr;
        this.f33981g = 0L;
        this.f33982h = false;
        this.f33977c = new android.net.Uri[length2];
        while (true) {
            android.net.Uri[] uriArr = this.f33977c;
            if (i11 >= uriArr.length) {
                return;
            }
            com.google.android.gms.internal.ads.Q7 q10 = q7Arr[i11];
            if (q10 == null) {
                uri = null;
            } else {
                com.google.android.gms.internal.ads.C4651o5 c4651o5 = q10.f30898b;
                c4651o5.getClass();
                uri = c4651o5.f37715a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final int a(int i6) {
        int i10;
        int i11 = i6 + 1;
        while (true) {
            int[] iArr = this.f33979e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final com.google.android.gms.internal.ads.C3104a b(int i6) {
        int[] iArr = this.f33979e;
        int length = iArr.length;
        int iMax = java.lang.Math.max(0, length);
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iMax);
        java.util.Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f33980f;
        int length2 = jArr.length;
        int iMax2 = java.lang.Math.max(0, length2);
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax2);
        java.util.Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new com.google.android.gms.internal.ads.C3104a(0L, 0, -1, iArrCopyOf, (com.google.android.gms.internal.ads.Q7[]) java.util.Arrays.copyOf(this.f33978d, 0), jArrCopyOf, 0L, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3104a.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3104a c3104a = (com.google.android.gms.internal.ads.C3104a) obj;
            if (this.f33976b == c3104a.f33976b && java.util.Arrays.equals(this.f33978d, c3104a.f33978d) && java.util.Arrays.equals(this.f33979e, c3104a.f33979e) && java.util.Arrays.equals(this.f33980f, c3104a.f33980f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f33976b * 31) - 1) * 961) + java.util.Arrays.hashCode(this.f33978d)) * 31) + java.util.Arrays.hashCode(this.f33979e)) * 31) + java.util.Arrays.hashCode(this.f33980f)) * 961;
    }
}
