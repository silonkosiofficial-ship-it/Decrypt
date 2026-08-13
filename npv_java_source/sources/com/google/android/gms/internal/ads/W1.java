package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class W1 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.W1> CREATOR = new com.google.android.gms.internal.ads.V1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f32647C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f32648D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f32649E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f32650F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f32651G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f32652H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f32653I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final byte[] f32654J;

    public W1(int i6, java.lang.String str, java.lang.String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f32647C = i6;
        this.f32648D = str;
        this.f32649E = str2;
        this.f32650F = i10;
        this.f32651G = i11;
        this.f32652H = i12;
        this.f32653I = i13;
        this.f32654J = bArr;
    }

    W1(android.os.Parcel parcel) {
        this.f32647C = parcel.readInt();
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f32648D = string;
        this.f32649E = parcel.readString();
        this.f32650F = parcel.readInt();
        this.f32651G = parcel.readInt();
        this.f32652H = parcel.readInt();
        this.f32653I = parcel.readInt();
        this.f32654J = parcel.createByteArray();
    }

    public static com.google.android.gms.internal.ads.W1 a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iW = c5128sR.w();
        java.lang.String strE = com.google.android.gms.internal.ads.AbstractC3606ed.e(c5128sR.b(c5128sR.w(), java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.String strB = c5128sR.b(c5128sR.w(), java.nio.charset.StandardCharsets.UTF_8);
        int iW2 = c5128sR.w();
        int iW3 = c5128sR.w();
        int iW4 = c5128sR.w();
        int iW5 = c5128sR.w();
        int iW6 = c5128sR.w();
        byte[] bArr = new byte[iW6];
        c5128sR.h(bArr, 0, iW6);
        return new com.google.android.gms.internal.ads.W1(iW, strE, strB, iW2, iW3, iW4, iW5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.W1.class == obj.getClass()) {
            com.google.android.gms.internal.ads.W1 w6 = (com.google.android.gms.internal.ads.W1) obj;
            if (this.f32647C == w6.f32647C && this.f32648D.equals(w6.f32648D) && this.f32649E.equals(w6.f32649E) && this.f32650F == w6.f32650F && this.f32651G == w6.f32651G && this.f32652H == w6.f32652H && this.f32653I == w6.f32653I && java.util.Arrays.equals(this.f32654J, w6.f32654J)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final void g(com.google.android.gms.internal.ads.S8 s10) {
        s10.t(this.f32654J, this.f32647C);
    }

    public final int hashCode() {
        return ((((((((((((((this.f32647C + 527) * 31) + this.f32648D.hashCode()) * 31) + this.f32649E.hashCode()) * 31) + this.f32650F) * 31) + this.f32651G) * 31) + this.f32652H) * 31) + this.f32653I) * 31) + java.util.Arrays.hashCode(this.f32654J);
    }

    public final java.lang.String toString() {
        return "Picture: mimeType=" + this.f32648D + ", description=" + this.f32649E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f32647C);
        parcel.writeString(this.f32648D);
        parcel.writeString(this.f32649E);
        parcel.writeInt(this.f32650F);
        parcel.writeInt(this.f32651G);
        parcel.writeInt(this.f32652H);
        parcel.writeInt(this.f32653I);
        parcel.writeByteArray(this.f32654J);
    }
}
