package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2728Pm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D[] f30780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30781e;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public C2728Pm(java.lang.String str, com.google.android.gms.internal.ads.D... dArr) {
        int length = dArr.length;
        int i6 = 1;
        com.google.android.gms.internal.ads.LC.d(length > 0);
        this.f30778b = str;
        this.f30780d = dArr;
        this.f30777a = length;
        int iB = com.google.android.gms.internal.ads.AbstractC3606ed.b(dArr[0].f26574o);
        this.f30779c = iB == -1 ? com.google.android.gms.internal.ads.AbstractC3606ed.b(dArr[0].f26573n) : iB;
        java.lang.String strC = c(dArr[0].f26563d);
        int i10 = dArr[0].f26565f | 16384;
        while (true) {
            com.google.android.gms.internal.ads.D[] dArr2 = this.f30780d;
            if (i6 >= dArr2.length) {
                return;
            }
            if (!strC.equals(c(dArr2[i6].f26563d))) {
                com.google.android.gms.internal.ads.D[] dArr3 = this.f30780d;
                d("languages", dArr3[0].f26563d, dArr3[i6].f26563d, i6);
                return;
            } else {
                com.google.android.gms.internal.ads.D[] dArr4 = this.f30780d;
                if (i10 != (dArr4[i6].f26565f | 16384)) {
                    d("role flags", java.lang.Integer.toBinaryString(dArr4[0].f26565f), java.lang.Integer.toBinaryString(this.f30780d[i6].f26565f), i6);
                    return;
                }
                i6++;
            }
        }
    }

    private static java.lang.String c(java.lang.String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i6) {
        com.google.android.gms.internal.ads.AbstractC3586eM.d("TrackGroup", "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i6 + ")"));
    }

    public final int a(com.google.android.gms.internal.ads.D d6) {
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.D[] dArr = this.f30780d;
            if (i6 >= dArr.length) {
                return -1;
            }
            if (d6 == dArr[i6]) {
                return i6;
            }
            i6++;
        }
    }

    public final com.google.android.gms.internal.ads.D b(int i6) {
        return this.f30780d[i6];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C2728Pm.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C2728Pm c2728Pm = (com.google.android.gms.internal.ads.C2728Pm) obj;
            if (this.f30778b.equals(c2728Pm.f30778b) && java.util.Arrays.equals(this.f30780d, c2728Pm.f30780d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f30781e;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = ((this.f30778b.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.f30780d);
        this.f30781e = iHashCode;
        return iHashCode;
    }
}
