package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3140aH0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3140aH0> CREATOR = new com.google.android.gms.internal.ads.C5223tG0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f34034C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.util.UUID f34035D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f34036E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f34037F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final byte[] f34038G;

    C3140aH0(android.os.Parcel parcel) {
        this.f34035D = new java.util.UUID(parcel.readLong(), parcel.readLong());
        this.f34036E = parcel.readString();
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f34037F = string;
        this.f34038G = parcel.createByteArray();
    }

    public C3140aH0(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
        uuid.getClass();
        this.f34035D = uuid;
        this.f34036E = null;
        this.f34037F = com.google.android.gms.internal.ads.AbstractC3606ed.e(str2);
        this.f34038G = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C3140aH0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.gms.internal.ads.C3140aH0 c3140aH0 = (com.google.android.gms.internal.ads.C3140aH0) obj;
        return j$.util.Objects.equals(this.f34036E, c3140aH0.f34036E) && j$.util.Objects.equals(this.f34037F, c3140aH0.f34037F) && j$.util.Objects.equals(this.f34035D, c3140aH0.f34035D) && java.util.Arrays.equals(this.f34038G, c3140aH0.f34038G);
    }

    public final int hashCode() {
        int i6 = this.f34034C;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = this.f34035D.hashCode() * 31;
        java.lang.String str = this.f34036E;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f34037F.hashCode()) * 31) + java.util.Arrays.hashCode(this.f34038G);
        this.f34034C = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeLong(this.f34035D.getMostSignificantBits());
        parcel.writeLong(this.f34035D.getLeastSignificantBits());
        parcel.writeString(this.f34036E);
        parcel.writeString(this.f34037F);
        parcel.writeByteArray(this.f34038G);
    }
}
