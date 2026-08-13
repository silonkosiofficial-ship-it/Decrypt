package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5304u2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C5304u2> CREATOR = new com.google.android.gms.internal.ads.C5194t2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f39078D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f39079E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f39080F;

    C5304u2(android.os.Parcel parcel) {
        super("----");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f39078D = string;
        this.f39079E = parcel.readString();
        this.f39080F = parcel.readString();
    }

    public C5304u2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("----");
        this.f39078D = str;
        this.f39079E = str2;
        this.f39080F = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C5304u2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C5304u2 c5304u2 = (com.google.android.gms.internal.ads.C5304u2) obj;
            if (j$.util.Objects.equals(this.f39079E, c5304u2.f39079E) && j$.util.Objects.equals(this.f39078D, c5304u2.f39078D) && j$.util.Objects.equals(this.f39080F, c5304u2.f39080F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f39078D;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.f39079E;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i6 = iHashCode + 527;
        java.lang.String str3 = this.f39080F;
        return (((i6 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": domain=" + this.f39078D + ", description=" + this.f39079E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f38422C);
        parcel.writeString(this.f39078D);
        parcel.writeString(this.f39080F);
    }
}
