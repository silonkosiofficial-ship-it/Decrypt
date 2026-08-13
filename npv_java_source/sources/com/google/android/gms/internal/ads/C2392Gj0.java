package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2392Gj0 implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int[] f27869C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f27870D;

    private C2392Gj0(int[] iArr, int i6, int i10) {
        this.f27869C = iArr;
        this.f27870D = i10;
    }

    public static com.google.android.gms.internal.ads.C2392Gj0 b(int[] iArr) {
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
        return new com.google.android.gms.internal.ads.C2392Gj0(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final int a(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f27870D, "index");
        return this.f27869C[i6];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C2392Gj0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C2392Gj0 c2392Gj0 = (com.google.android.gms.internal.ads.C2392Gj0) obj;
        if (this.f27870D != c2392Gj0.f27870D) {
            return false;
        }
        for (int i6 = 0; i6 < this.f27870D; i6++) {
            if (a(i6) != c2392Gj0.a(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i6 = 1;
        for (int i10 = 0; i10 < this.f27870D; i10++) {
            i6 = (i6 * 31) + this.f27869C[i10];
        }
        return i6;
    }

    public final java.lang.String toString() {
        int i6 = this.f27870D;
        if (i6 == 0) {
            return "[]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i6 * 5);
        sb.append('[');
        sb.append(this.f27869C[0]);
        for (int i10 = 1; i10 < this.f27870D; i10++) {
            sb.append(", ");
            sb.append(this.f27869C[i10]);
        }
        sb.append(']');
        return sb.toString();
    }
}
