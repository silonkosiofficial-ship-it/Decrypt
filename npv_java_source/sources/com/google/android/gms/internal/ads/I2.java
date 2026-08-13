package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.I2> CREATOR = new com.google.android.gms.internal.ads.H2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f28375C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f28376D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f28377E;

    public I2(long j6, long j10, int i6) {
        com.google.android.gms.internal.ads.LC.d(j6 < j10);
        this.f28375C = j6;
        this.f28376D = j10;
        this.f28377E = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.I2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.I2 i6 = (com.google.android.gms.internal.ads.I2) obj;
            if (this.f28375C == i6.f28375C && this.f28376D == i6.f28376D && this.f28377E == i6.f28377E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f28375C), java.lang.Long.valueOf(this.f28376D), java.lang.Integer.valueOf(this.f28377E)});
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", java.lang.Long.valueOf(this.f28375C), java.lang.Long.valueOf(this.f28376D), java.lang.Integer.valueOf(this.f28377E));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeLong(this.f28375C);
        parcel.writeLong(this.f28376D);
        parcel.writeInt(this.f28377E);
    }
}
