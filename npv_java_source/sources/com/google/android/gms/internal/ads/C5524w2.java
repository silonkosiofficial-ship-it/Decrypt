package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5524w2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C5524w2> CREATOR = new com.google.android.gms.internal.ads.C5414v2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f39500D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f39501E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f39502F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f39503G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int[] f39504H;

    public C5524w2(int i6, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f39500D = i6;
        this.f39501E = i10;
        this.f39502F = i11;
        this.f39503G = iArr;
        this.f39504H = iArr2;
    }

    C5524w2(android.os.Parcel parcel) {
        super("MLLT");
        this.f39500D = parcel.readInt();
        this.f39501E = parcel.readInt();
        this.f39502F = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f39503G = iArrCreateIntArray;
        this.f39504H = parcel.createIntArray();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C5524w2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C5524w2 c5524w2 = (com.google.android.gms.internal.ads.C5524w2) obj;
            if (this.f39500D == c5524w2.f39500D && this.f39501E == c5524w2.f39501E && this.f39502F == c5524w2.f39502F && java.util.Arrays.equals(this.f39503G, c5524w2.f39503G) && java.util.Arrays.equals(this.f39504H, c5524w2.f39504H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f39500D + 527) * 31) + this.f39501E) * 31) + this.f39502F) * 31) + java.util.Arrays.hashCode(this.f39503G)) * 31) + java.util.Arrays.hashCode(this.f39504H);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f39500D);
        parcel.writeInt(this.f39501E);
        parcel.writeInt(this.f39502F);
        parcel.writeIntArray(this.f39503G);
        parcel.writeIntArray(this.f39504H);
    }
}
