package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class C2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2> CREATOR = new com.google.android.gms.internal.ads.B2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f26131D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f26132E;

    /* JADX WARN: Illegal instructions before constructor call */
    C2(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        super(string);
        this.f26131D = parcel.readString();
        this.f26132E = parcel.readString();
    }

    public C2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f26131D = str2;
        this.f26132E = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C2 c6 = (com.google.android.gms.internal.ads.C2) obj;
            if (this.f38422C.equals(c6.f38422C) && j$.util.Objects.equals(this.f26131D, c6.f26131D) && j$.util.Objects.equals(this.f26132E, c6.f26132E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f38422C.hashCode() + 527;
        java.lang.String str = this.f26131D;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i6 = iHashCode * 31;
        java.lang.String str2 = this.f26132E;
        return ((i6 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": url=" + this.f26132E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f38422C);
        parcel.writeString(this.f26131D);
        parcel.writeString(this.f26132E);
    }
}
