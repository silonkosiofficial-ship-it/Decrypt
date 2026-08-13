package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f27617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f27618b;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public G0(java.lang.String str, java.lang.String str2) {
        this.f27617a = com.google.android.gms.internal.ads.EW.e(str);
        this.f27618b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.G0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.G0 g6 = (com.google.android.gms.internal.ads.G0) obj;
            if (j$.util.Objects.equals(this.f27617a, g6.f27617a) && j$.util.Objects.equals(this.f27618b, g6.f27618b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f27618b.hashCode() * 31;
        java.lang.String str = this.f27617a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
