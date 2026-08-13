package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5195t20 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C5195t20> CREATOR = new com.google.android.gms.internal.ads.C4644o10();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f38848C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float f38849D;

    public C5195t20(float f6, float f10) {
        boolean z6 = false;
        if (f6 >= -90.0f && f6 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.e(z6, "Invalid latitude or longitude");
        this.f38848C = f6;
        this.f38849D = f10;
    }

    /* synthetic */ C5195t20(android.os.Parcel parcel, com.google.android.gms.internal.ads.P10 p10) {
        this.f38848C = parcel.readFloat();
        this.f38849D = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C5195t20.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C5195t20 c5195t20 = (com.google.android.gms.internal.ads.C5195t20) obj;
            if (this.f38848C == c5195t20.f38848C && this.f38849D == c5195t20.f38849D) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        return ((java.lang.Float.valueOf(this.f38848C).hashCode() + 527) * 31) + java.lang.Float.valueOf(this.f38849D).hashCode();
    }

    public final java.lang.String toString() {
        return "xyz: latitude=" + this.f38848C + ", longitude=" + this.f38849D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeFloat(this.f38848C);
        parcel.writeFloat(this.f38849D);
    }
}
