package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class W30 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.W30> CREATOR = new com.google.android.gms.internal.ads.U20();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f32658C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f32659D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f32660E;

    public W30(long j6, long j10, long j11) {
        this.f32658C = j6;
        this.f32659D = j10;
        this.f32660E = j11;
    }

    /* synthetic */ W30(android.os.Parcel parcel, com.google.android.gms.internal.ads.AbstractC5417v30 abstractC5417v30) {
        this.f32658C = parcel.readLong();
        this.f32659D = parcel.readLong();
        this.f32660E = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.W30)) {
            return false;
        }
        com.google.android.gms.internal.ads.W30 w30 = (com.google.android.gms.internal.ads.W30) obj;
        return this.f32658C == w30.f32658C && this.f32659D == w30.f32659D && this.f32660E == w30.f32660E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        long j6 = this.f32658C;
        int i6 = (int) (j6 ^ (j6 >>> 32));
        long j10 = this.f32660E;
        long j11 = this.f32659D;
        return ((((i6 + 527) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final java.lang.String toString() {
        return "Mp4Timestamp: creation time=" + this.f32658C + ", modification time=" + this.f32659D + ", timescale=" + this.f32660E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeLong(this.f32658C);
        parcel.writeLong(this.f32659D);
        parcel.writeLong(this.f32660E);
    }
}
