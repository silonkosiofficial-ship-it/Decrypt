package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2399Gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2728Pm f27896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f27898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f27899e;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    public C2399Gp(com.google.android.gms.internal.ads.C2728Pm c2728Pm, boolean z6, int[] iArr, boolean[] zArr) {
        int i6 = c2728Pm.f30777a;
        this.f27895a = i6;
        com.google.android.gms.internal.ads.LC.d(i6 == iArr.length && i6 == zArr.length);
        this.f27896b = c2728Pm;
        this.f27897c = z6 && i6 > 1;
        this.f27898d = (int[]) iArr.clone();
        this.f27899e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f27896b.f30779c;
    }

    public final com.google.android.gms.internal.ads.D b(int i6) {
        return this.f27896b.b(i6);
    }

    public final boolean c() {
        for (boolean z6 : this.f27899e) {
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i6) {
        return this.f27899e[i6];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C2399Gp.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C2399Gp c2399Gp = (com.google.android.gms.internal.ads.C2399Gp) obj;
            if (this.f27897c == c2399Gp.f27897c && this.f27896b.equals(c2399Gp.f27896b) && java.util.Arrays.equals(this.f27898d, c2399Gp.f27898d) && java.util.Arrays.equals(this.f27899e, c2399Gp.f27899e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f27896b.hashCode() * 31) + (this.f27897c ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.f27898d)) * 31) + java.util.Arrays.hashCode(this.f27899e);
    }
}
