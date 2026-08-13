package N3;

/* JADX INFO: loaded from: classes.dex */
public final class D implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        java.lang.String strF = null;
        android.os.IBinder iBinderS = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 2:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 4:
                    iBinderS = R3.b.s(parcel, iR);
                    break;
                case 5:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 6:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new N3.C(strF, zM, zM2, iBinderS, zM3, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new N3.C[i6];
    }
}
