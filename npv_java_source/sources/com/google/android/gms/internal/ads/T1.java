package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T1 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.T1> CREATOR;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f31832C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f31833D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f31834E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f31835F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final byte[] f31836G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f31837H;

    static {
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B("application/id3");
        c4682oK0.H();
        com.google.android.gms.internal.ads.C4682oK0 c4682oK1 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK1.B("application/x-scte35");
        c4682oK1.H();
        CREATOR = new com.google.android.gms.internal.ads.S1();
    }

    T1(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f31832C = string;
        this.f31833D = parcel.readString();
        this.f31834E = parcel.readLong();
        this.f31835F = parcel.readLong();
        this.f31836G = parcel.createByteArray();
    }

    public T1(java.lang.String str, java.lang.String str2, long j6, long j10, byte[] bArr) {
        this.f31832C = str;
        this.f31833D = str2;
        this.f31834E = j6;
        this.f31835F = j10;
        this.f31836G = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.T1.class == obj.getClass()) {
            com.google.android.gms.internal.ads.T1 t6 = (com.google.android.gms.internal.ads.T1) obj;
            if (this.f31834E == t6.f31834E && this.f31835F == t6.f31835F && j$.util.Objects.equals(this.f31832C, t6.f31832C) && j$.util.Objects.equals(this.f31833D, t6.f31833D) && java.util.Arrays.equals(this.f31836G, t6.f31836G)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        int i6 = this.f31837H;
        if (i6 != 0) {
            return i6;
        }
        java.lang.String str = this.f31832C;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.f31833D;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j6 = this.f31834E;
        long j10 = this.f31835F;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.f31836G);
        this.f31837H = iHashCode3;
        return iHashCode3;
    }

    public final java.lang.String toString() {
        return "EMSG: scheme=" + this.f31832C + ", id=" + this.f31835F + ", durationMs=" + this.f31834E + ", value=" + this.f31833D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f31832C);
        parcel.writeString(this.f31833D);
        parcel.writeLong(this.f31834E);
        parcel.writeLong(this.f31835F);
        parcel.writeByteArray(this.f31836G);
    }
}
