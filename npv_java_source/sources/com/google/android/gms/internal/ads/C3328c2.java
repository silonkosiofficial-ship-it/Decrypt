package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3328c2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3328c2> CREATOR = new com.google.android.gms.internal.ads.C3219b2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f34418D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f34419E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f34420F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final byte[] f34421G;

    C3328c2(android.os.Parcel parcel) {
        super("APIC");
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f34418D = string;
        this.f34419E = parcel.readString();
        this.f34420F = parcel.readInt();
        this.f34421G = parcel.createByteArray();
    }

    public C3328c2(java.lang.String str, java.lang.String str2, int i6, byte[] bArr) {
        super("APIC");
        this.f34418D = str;
        this.f34419E = str2;
        this.f34420F = i6;
        this.f34421G = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3328c2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3328c2 c3328c2 = (com.google.android.gms.internal.ads.C3328c2) obj;
            if (this.f34420F == c3328c2.f34420F && j$.util.Objects.equals(this.f34418D, c3328c2.f34418D) && j$.util.Objects.equals(this.f34419E, c3328c2.f34419E) && java.util.Arrays.equals(this.f34421G, c3328c2.f34421G)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2, com.google.android.gms.internal.ads.InterfaceC3274bb
    public final void g(com.google.android.gms.internal.ads.S8 s10) {
        s10.t(this.f34421G, this.f34420F);
    }

    public final int hashCode() {
        java.lang.String str = this.f34418D;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i6 = this.f34420F;
        java.lang.String str2 = this.f34419E;
        return ((((((i6 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f34421G);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": mimeType=" + this.f34418D + ", description=" + this.f34419E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f34418D);
        parcel.writeString(this.f34419E);
        parcel.writeInt(this.f34420F);
        parcel.writeByteArray(this.f34421G);
    }
}
