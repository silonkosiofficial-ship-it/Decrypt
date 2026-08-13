package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4218k80 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 4:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case 5:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 6:
                    iT5 = R3.b.t(parcel, iR);
                    break;
                case 7:
                    iT6 = R3.b.t(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C4108j80(iT, iT2, iT3, iT4, strF, iT5, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C4108j80[i6];
    }
}
