package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        long jU = 0;
        boolean zM = false;
        int iT = 0;
        int iT2 = 0;
        boolean zM2 = false;
        p204u3.l lVar = null;
        android.os.IBinder iBinderS = null;
        android.os.IBinder iBinderS2 = null;
        android.os.IBinder iBinderS3 = null;
        android.os.IBinder iBinderS4 = null;
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        android.os.IBinder iBinderS5 = null;
        java.lang.String strF3 = null;
        p224w3.a aVar = null;
        java.lang.String strF4 = null;
        p174r3.l lVar2 = null;
        android.os.IBinder iBinderS6 = null;
        java.lang.String strF5 = null;
        java.lang.String strF6 = null;
        java.lang.String strF7 = null;
        android.os.IBinder iBinderS7 = null;
        android.os.IBinder iBinderS8 = null;
        android.os.IBinder iBinderS9 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    lVar = (p204u3.l) R3.b.e(parcel, iR, p204u3.l.CREATOR);
                    break;
                case 3:
                    iBinderS = R3.b.s(parcel, iR);
                    break;
                case 4:
                    iBinderS2 = R3.b.s(parcel, iR);
                    break;
                case 5:
                    iBinderS3 = R3.b.s(parcel, iR);
                    break;
                case 6:
                    iBinderS4 = R3.b.s(parcel, iR);
                    break;
                case 7:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 8:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 9:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 10:
                    iBinderS5 = R3.b.s(parcel, iR);
                    break;
                case 11:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 12:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 13:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 14:
                    aVar = (p224w3.a) R3.b.e(parcel, iR, p224w3.a.CREATOR);
                    break;
                case 15:
                case 20:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                default:
                    R3.b.x(parcel, iR);
                    break;
                case 16:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 17:
                    lVar2 = (p174r3.l) R3.b.e(parcel, iR, p174r3.l.CREATOR);
                    break;
                case 18:
                    iBinderS6 = R3.b.s(parcel, iR);
                    break;
                case 19:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 24:
                    strF6 = R3.b.f(parcel, iR);
                    break;
                case 25:
                    strF7 = R3.b.f(parcel, iR);
                    break;
                case 26:
                    iBinderS7 = R3.b.s(parcel, iR);
                    break;
                case 27:
                    iBinderS8 = R3.b.s(parcel, iR);
                    break;
                case 28:
                    iBinderS9 = R3.b.s(parcel, iR);
                    break;
                case 29:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 30:
                    jU = R3.b.u(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(lVar, iBinderS, iBinderS2, iBinderS3, iBinderS4, strF, zM, strF2, iBinderS5, iT, iT2, strF3, aVar, strF4, lVar2, iBinderS6, strF5, strF6, strF7, iBinderS7, iBinderS8, iBinderS9, zM2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel[i6];
    }
}
