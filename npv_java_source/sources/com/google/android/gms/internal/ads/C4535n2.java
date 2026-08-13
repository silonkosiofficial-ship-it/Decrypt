package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4535n2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4535n2> CREATOR = new com.google.android.gms.internal.ads.C4425m2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f37479D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f37480E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f37481F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final byte[] f37482G;

    C4535n2(android.os.Parcel parcel) {
        super("GEOB");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f37479D = string;
        this.f37480E = parcel.readString();
        this.f37481F = parcel.readString();
        this.f37482G = parcel.createByteArray();
    }

    public C4535n2(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.f37479D = str;
        this.f37480E = str2;
        this.f37481F = str3;
        this.f37482G = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C4535n2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C4535n2 c4535n2 = (com.google.android.gms.internal.ads.C4535n2) obj;
            if (j$.util.Objects.equals(this.f37479D, c4535n2.f37479D) && j$.util.Objects.equals(this.f37480E, c4535n2.f37480E) && j$.util.Objects.equals(this.f37481F, c4535n2.f37481F) && java.util.Arrays.equals(this.f37482G, c4535n2.f37482G)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f37479D;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.f37480E;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = iHashCode + 527;
        java.lang.String str3 = this.f37481F;
        return (((((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f37482G);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": mimeType=" + this.f37479D + ", filename=" + this.f37480E + ", description=" + this.f37481F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f37479D);
        parcel.writeString(this.f37480E);
        parcel.writeString(this.f37481F);
        parcel.writeByteArray(this.f37482G);
    }
}
