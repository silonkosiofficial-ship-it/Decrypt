package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2227Cb implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2227Cb> CREATOR = new com.google.android.gms.internal.ads.C5907za();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3274bb[] f26248C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f26249D;

    public C2227Cb(long j6, com.google.android.gms.internal.ads.InterfaceC3274bb... interfaceC3274bbArr) {
        this.f26249D = j6;
        this.f26248C = interfaceC3274bbArr;
    }

    C2227Cb(android.os.Parcel parcel) {
        this.f26248C = new com.google.android.gms.internal.ads.InterfaceC3274bb[parcel.readInt()];
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.InterfaceC3274bb[] interfaceC3274bbArr = this.f26248C;
            if (i6 >= interfaceC3274bbArr.length) {
                this.f26249D = parcel.readLong();
                return;
            } else {
                interfaceC3274bbArr[i6] = (com.google.android.gms.internal.ads.InterfaceC3274bb) parcel.readParcelable(com.google.android.gms.internal.ads.InterfaceC3274bb.class.getClassLoader());
                i6++;
            }
        }
    }

    public C2227Cb(java.util.List list) {
        this(-9223372036854775807L, (com.google.android.gms.internal.ads.InterfaceC3274bb[]) list.toArray(new com.google.android.gms.internal.ads.InterfaceC3274bb[0]));
    }

    public final int a() {
        return this.f26248C.length;
    }

    public final com.google.android.gms.internal.ads.InterfaceC3274bb b(int i6) {
        return this.f26248C[i6];
    }

    public final com.google.android.gms.internal.ads.C2227Cb c(com.google.android.gms.internal.ads.InterfaceC3274bb... interfaceC3274bbArr) {
        int length = interfaceC3274bbArr.length;
        if (length == 0) {
            return this;
        }
        long j6 = this.f26249D;
        com.google.android.gms.internal.ads.InterfaceC3274bb[] interfaceC3274bbArr2 = this.f26248C;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        int length2 = interfaceC3274bbArr2.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(interfaceC3274bbArr2, length2 + length);
        java.lang.System.arraycopy(interfaceC3274bbArr, 0, objArrCopyOf, length2, length);
        return new com.google.android.gms.internal.ads.C2227Cb(j6, (com.google.android.gms.internal.ads.InterfaceC3274bb[]) objArrCopyOf);
    }

    public final com.google.android.gms.internal.ads.C2227Cb d(com.google.android.gms.internal.ads.C2227Cb c2227Cb) {
        return c2227Cb == null ? this : c(c2227Cb.f26248C);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C2227Cb.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C2227Cb c2227Cb = (com.google.android.gms.internal.ads.C2227Cb) obj;
            if (java.util.Arrays.equals(this.f26248C, c2227Cb.f26248C) && this.f26249D == c2227Cb.f26249D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = java.util.Arrays.hashCode(this.f26248C) * 31;
        long j6 = this.f26249D;
        return iHashCode + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j6 = this.f26249D;
        java.lang.String string = java.util.Arrays.toString(this.f26248C);
        if (j6 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j6;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f26248C.length);
        for (com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bb : this.f26248C) {
            parcel.writeParcelable(interfaceC3274bb, 0);
        }
        parcel.writeLong(this.f26249D);
    }
}
