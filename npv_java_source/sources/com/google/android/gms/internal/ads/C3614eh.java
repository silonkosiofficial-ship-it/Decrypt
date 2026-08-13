package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3614eh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        int iT2 = 0;
        boolean zM2 = false;
        int iT3 = 0;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        boolean zM4 = false;
        int iT6 = 0;
        p184s3.Q1 q6 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 3:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 4:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 5:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 6:
                    q6 = (p184s3.Q1) R3.b.e(parcel, iR, p184s3.Q1.CREATOR);
                    break;
                case 7:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 8:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case 9:
                    iT5 = R3.b.t(parcel, iR);
                    break;
                case 10:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                case 11:
                    iT6 = R3.b.t(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C3505dh(iT, zM, iT2, zM2, iT3, q6, zM3, iT4, iT5, zM4, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C3505dh[i6];
    }
}
