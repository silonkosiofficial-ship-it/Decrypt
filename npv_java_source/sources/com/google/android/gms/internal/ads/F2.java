package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class F2 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.F2> CREATOR = new com.google.android.gms.internal.ads.D2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f27270C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f27271D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f27272E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f27273F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f27274G;

    public F2(long j6, long j10, long j11, long j12, long j13) {
        this.f27270C = j6;
        this.f27271D = j10;
        this.f27272E = j11;
        this.f27273F = j12;
        this.f27274G = j13;
    }

    /* synthetic */ F2(android.os.Parcel parcel, com.google.android.gms.internal.ads.E2 e6) {
        this.f27270C = parcel.readLong();
        this.f27271D = parcel.readLong();
        this.f27272E = parcel.readLong();
        this.f27273F = parcel.readLong();
        this.f27274G = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.F2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.F2 f6 = (com.google.android.gms.internal.ads.F2) obj;
            if (this.f27270C == f6.f27270C && this.f27271D == f6.f27271D && this.f27272E == f6.f27272E && this.f27273F == f6.f27273F && this.f27274G == f6.f27274G) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        long j6 = this.f27270C;
        int i6 = (int) (j6 ^ (j6 >>> 32));
        long j10 = this.f27274G;
        long j11 = this.f27273F;
        long j12 = this.f27272E;
        long j13 = this.f27271D;
        return ((((((((i6 + 527) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final java.lang.String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f27270C + ", photoSize=" + this.f27271D + ", photoPresentationTimestampUs=" + this.f27272E + ", videoStartPosition=" + this.f27273F + ", videoSize=" + this.f27274G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeLong(this.f27270C);
        parcel.writeLong(this.f27271D);
        parcel.writeLong(this.f27272E);
        parcel.writeLong(this.f27273F);
        parcel.writeLong(this.f27274G);
    }
}
