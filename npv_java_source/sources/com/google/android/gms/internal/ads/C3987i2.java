package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3987i2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3987i2> CREATOR = new com.google.android.gms.internal.ads.C3877h2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f36214D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f36215E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f36216F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String[] f36217G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4974r2[] f36218H;

    C3987i2(android.os.Parcel parcel) {
        super("CTOC");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f36214D = string;
        this.f36215E = parcel.readByte() != 0;
        this.f36216F = parcel.readByte() != 0;
        this.f36217G = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f36218H = new com.google.android.gms.internal.ads.AbstractC4974r2[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f36218H[i11] = (com.google.android.gms.internal.ads.AbstractC4974r2) parcel.readParcelable(com.google.android.gms.internal.ads.AbstractC4974r2.class.getClassLoader());
        }
    }

    public C3987i2(java.lang.String str, boolean z6, boolean z10, java.lang.String[] strArr, com.google.android.gms.internal.ads.AbstractC4974r2[] abstractC4974r2Arr) {
        super("CTOC");
        this.f36214D = str;
        this.f36215E = z6;
        this.f36216F = z10;
        this.f36217G = strArr;
        this.f36218H = abstractC4974r2Arr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3987i2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3987i2 c3987i2 = (com.google.android.gms.internal.ads.C3987i2) obj;
            if (this.f36215E == c3987i2.f36215E && this.f36216F == c3987i2.f36216F && j$.util.Objects.equals(this.f36214D, c3987i2.f36214D) && java.util.Arrays.equals(this.f36217G, c3987i2.f36217G) && java.util.Arrays.equals(this.f36218H, c3987i2.f36218H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f36214D;
        return (((((this.f36215E ? 1 : 0) + 527) * 31) + (this.f36216F ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f36214D);
        parcel.writeByte(this.f36215E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f36216F ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f36217G);
        parcel.writeInt(this.f36218H.length);
        for (com.google.android.gms.internal.ads.AbstractC4974r2 abstractC4974r2 : this.f36218H) {
            parcel.writeParcelable(abstractC4974r2, 0);
        }
    }
}
