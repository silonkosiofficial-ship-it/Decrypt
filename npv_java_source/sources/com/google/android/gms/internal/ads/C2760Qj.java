package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2760Qj implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        long jU = 0;
        boolean zM = false;
        int iT = 0;
        boolean zM2 = false;
        java.lang.String strF = null;
        byte[] bArrB = null;
        java.lang.String[] strArrG = null;
        java.lang.String[] strArrG2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 4:
                    bArrB = R3.b.b(parcel, iR);
                    break;
                case 5:
                    strArrG = R3.b.g(parcel, iR);
                    break;
                case 6:
                    strArrG2 = R3.b.g(parcel, iR);
                    break;
                case 7:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 8:
                    jU = R3.b.u(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C2723Pj(zM, strF, iT, bArrB, strArrG, strArrG2, zM2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C2723Pj[i6];
    }
}
