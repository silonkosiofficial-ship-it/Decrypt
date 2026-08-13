package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4315l2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4315l2> CREATOR = new com.google.android.gms.internal.ads.C4205k2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f37053D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f37054E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f37055F;

    C4315l2(android.os.Parcel parcel) {
        super("COMM");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f37053D = string;
        this.f37054E = parcel.readString();
        this.f37055F = parcel.readString();
    }

    public C4315l2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.f37053D = str;
        this.f37054E = str2;
        this.f37055F = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C4315l2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C4315l2 c4315l2 = (com.google.android.gms.internal.ads.C4315l2) obj;
            if (j$.util.Objects.equals(this.f37054E, c4315l2.f37054E) && j$.util.Objects.equals(this.f37053D, c4315l2.f37053D) && j$.util.Objects.equals(this.f37055F, c4315l2.f37055F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f37053D;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.f37054E;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = iHashCode + 527;
        java.lang.String str3 = this.f37055F;
        return (((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": language=" + this.f37053D + ", description=" + this.f37054E + ", text=" + this.f37055F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f38422C);
        parcel.writeString(this.f37053D);
        parcel.writeString(this.f37055F);
    }
}
