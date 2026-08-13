package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3109a2 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3109a2> CREATOR = new com.google.android.gms.internal.ads.Z1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f33987C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f33988D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f33989E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f33990F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f33991G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f33992H;

    public C3109a2(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, int i10) {
        boolean z10 = true;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        }
        com.google.android.gms.internal.ads.LC.d(z10);
        this.f33987C = i6;
        this.f33988D = str;
        this.f33989E = str2;
        this.f33990F = str3;
        this.f33991G = z6;
        this.f33992H = i10;
    }

    C3109a2(android.os.Parcel parcel) {
        this.f33987C = parcel.readInt();
        this.f33988D = parcel.readString();
        this.f33989E = parcel.readString();
        this.f33990F = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f33991G = parcel.readInt() != 0;
        this.f33992H = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3109a2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3109a2 c3109a2 = (com.google.android.gms.internal.ads.C3109a2) obj;
            if (this.f33987C == c3109a2.f33987C && j$.util.Objects.equals(this.f33988D, c3109a2.f33988D) && j$.util.Objects.equals(this.f33989E, c3109a2.f33989E) && j$.util.Objects.equals(this.f33990F, c3109a2.f33990F) && this.f33991G == c3109a2.f33991G && this.f33992H == c3109a2.f33992H) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final void g(com.google.android.gms.internal.ads.S8 s10) {
        java.lang.String str = this.f33989E;
        if (str != null) {
            s10.I(str);
        }
        java.lang.String str2 = this.f33988D;
        if (str2 != null) {
            s10.B(str2);
        }
    }

    public final int hashCode() {
        java.lang.String str = this.f33988D;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i6 = this.f33987C;
        java.lang.String str2 = this.f33989E;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = ((i6 + 527) * 31) + iHashCode;
        java.lang.String str3 = this.f33990F;
        return (((((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f33991G ? 1 : 0)) * 31) + this.f33992H;
    }

    public final java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.f33989E + "\", genre=\"" + this.f33988D + "\", bitrate=" + this.f33987C + ", metadataInterval=" + this.f33992H;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f33987C);
        parcel.writeString(this.f33988D);
        parcel.writeString(this.f33989E);
        parcel.writeString(this.f33990F);
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        parcel.writeInt(this.f33991G ? 1 : 0);
        parcel.writeInt(this.f33992H);
    }
}
