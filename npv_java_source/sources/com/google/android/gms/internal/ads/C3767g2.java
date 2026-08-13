package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3767g2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3767g2> CREATOR = new com.google.android.gms.internal.ads.C3657f2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f35508D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f35509E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f35510F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f35511G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f35512H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4974r2[] f35513I;

    C3767g2(android.os.Parcel parcel) {
        super("CHAP");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f35508D = string;
        this.f35509E = parcel.readInt();
        this.f35510F = parcel.readInt();
        this.f35511G = parcel.readLong();
        this.f35512H = parcel.readLong();
        int i10 = parcel.readInt();
        this.f35513I = new com.google.android.gms.internal.ads.AbstractC4974r2[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35513I[i11] = (com.google.android.gms.internal.ads.AbstractC4974r2) parcel.readParcelable(com.google.android.gms.internal.ads.AbstractC4974r2.class.getClassLoader());
        }
    }

    public C3767g2(java.lang.String str, int i6, int i10, long j6, long j10, com.google.android.gms.internal.ads.AbstractC4974r2[] abstractC4974r2Arr) {
        super("CHAP");
        this.f35508D = str;
        this.f35509E = i6;
        this.f35510F = i10;
        this.f35511G = j6;
        this.f35512H = j10;
        this.f35513I = abstractC4974r2Arr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3767g2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3767g2 c3767g2 = (com.google.android.gms.internal.ads.C3767g2) obj;
            if (this.f35509E == c3767g2.f35509E && this.f35510F == c3767g2.f35510F && this.f35511G == c3767g2.f35511G && this.f35512H == c3767g2.f35512H && j$.util.Objects.equals(this.f35508D, c3767g2.f35508D) && java.util.Arrays.equals(this.f35513I, c3767g2.f35513I)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f35508D;
        return ((((((((this.f35509E + 527) * 31) + this.f35510F) * 31) + ((int) this.f35511G)) * 31) + ((int) this.f35512H)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f35508D);
        parcel.writeInt(this.f35509E);
        parcel.writeInt(this.f35510F);
        parcel.writeLong(this.f35511G);
        parcel.writeLong(this.f35512H);
        parcel.writeInt(this.f35513I.length);
        for (com.google.android.gms.internal.ads.AbstractC4974r2 abstractC4974r2 : this.f35513I) {
            parcel.writeParcelable(abstractC4974r2, 0);
        }
    }
}
