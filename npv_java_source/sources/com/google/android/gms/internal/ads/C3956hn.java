package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3956hn extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3956hn> CREATOR = new com.google.android.gms.internal.ads.C4065in();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f36130C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f36131D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f36132E;

    C3956hn(int i6, int i10, int i11) {
        this.f36130C = i6;
        this.f36131D = i10;
        this.f36132E = i11;
    }

    public static com.google.android.gms.internal.ads.C3956hn e(p104k3.v vVar) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.C3956hn)) {
            com.google.android.gms.internal.ads.C3956hn c3956hn = (com.google.android.gms.internal.ads.C3956hn) obj;
            if (c3956hn.f36132E == this.f36132E && c3956hn.f36131D == this.f36131D && c3956hn.f36130C == this.f36130C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new int[]{this.f36130C, this.f36131D, this.f36132E});
    }

    public final java.lang.String toString() {
        return this.f36130C + "." + this.f36131D + "." + this.f36132E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f36130C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f36131D);
        R3.c.k(parcel, 3, this.f36132E);
        R3.c.b(parcel, iA);
    }
}
