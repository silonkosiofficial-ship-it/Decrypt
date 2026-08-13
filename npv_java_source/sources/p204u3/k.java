package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        java.lang.String strF5 = null;
        java.lang.String strF6 = null;
        java.lang.String strF7 = null;
        android.content.Intent intent = null;
        android.os.IBinder iBinderS = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 4:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 5:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 6:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 7:
                    strF6 = R3.b.f(parcel, iR);
                    break;
                case 8:
                    strF7 = R3.b.f(parcel, iR);
                    break;
                case 9:
                    intent = (android.content.Intent) R3.b.e(parcel, iR, android.content.Intent.CREATOR);
                    break;
                case 10:
                    iBinderS = R3.b.s(parcel, iR);
                    break;
                case 11:
                    zM = R3.b.m(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new p204u3.l(strF, strF2, strF3, strF4, strF5, strF6, strF7, intent, iBinderS, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p204u3.l[i6];
    }
}
