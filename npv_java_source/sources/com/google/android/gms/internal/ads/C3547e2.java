package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3547e2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3547e2> CREATOR = new com.google.android.gms.internal.ads.C3438d2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final byte[] f34869D;

    /* JADX WARN: Illegal instructions before constructor call */
    C3547e2(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        super(string);
        this.f34869D = parcel.createByteArray();
    }

    public C3547e2(java.lang.String str, byte[] bArr) {
        super(str);
        this.f34869D = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C3547e2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C3547e2 c3547e2 = (com.google.android.gms.internal.ads.C3547e2) obj;
            if (this.f38422C.equals(c3547e2.f38422C) && java.util.Arrays.equals(this.f34869D, c3547e2.f34869D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38422C.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.f34869D);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f38422C);
        parcel.writeByteArray(this.f34869D);
    }
}
