package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class i implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.IBinder iBinderS = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                zM = R3.b.m(parcel, iR);
            } else if (iL != 2) {
                R3.b.x(parcel, iR);
            } else {
                iBinderS = R3.b.s(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p134n3.a(zM, iBinderS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p134n3.a[i6];
    }
}
