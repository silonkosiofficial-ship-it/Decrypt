package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5744y2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C5744y2> CREATOR = new com.google.android.gms.internal.ads.C5634x2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f39974D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final byte[] f39975E;

    C5744y2(android.os.Parcel parcel) {
        super("PRIV");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f39974D = string;
        this.f39975E = parcel.createByteArray();
    }

    public C5744y2(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.f39974D = str;
        this.f39975E = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C5744y2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C5744y2 c5744y2 = (com.google.android.gms.internal.ads.C5744y2) obj;
            if (j$.util.Objects.equals(this.f39974D, c5744y2.f39974D) && java.util.Arrays.equals(this.f39975E, c5744y2.f39975E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f39974D;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + java.util.Arrays.hashCode(this.f39975E);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": owner=" + this.f39974D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f39974D);
        parcel.writeByteArray(this.f39975E);
    }
}
