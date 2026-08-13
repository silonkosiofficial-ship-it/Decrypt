package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class N2 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.N2> CREATOR = new com.google.android.gms.internal.ads.L2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f30140C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f30141D;

    public N2(float f6, int i6) {
        this.f30140C = f6;
        this.f30141D = i6;
    }

    /* synthetic */ N2(android.os.Parcel parcel, com.google.android.gms.internal.ads.M2 m6) {
        this.f30140C = parcel.readFloat();
        this.f30141D = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.N2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.N2 n6 = (com.google.android.gms.internal.ads.N2) obj;
            if (this.f30140C == n6.f30140C && this.f30141D == n6.f30141D) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        return ((java.lang.Float.valueOf(this.f30140C).hashCode() + 527) * 31) + this.f30141D;
    }

    public final java.lang.String toString() {
        return "smta: captureFrameRate=" + this.f30140C + ", svcTemporalLayerCount=" + this.f30141D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeFloat(this.f30140C);
        parcel.writeInt(this.f30141D);
    }
}
