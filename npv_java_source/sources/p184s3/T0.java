package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.U0 {
    public T0() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static p184s3.U0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof p184s3.U0 ? (p184s3.U0) iInterfaceQueryLocalInterface : new p184s3.S0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strI;
        android.os.Parcelable parcelableE;
        switch (i6) {
            case 1:
                strI = i();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 2:
                strI = h();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 3:
                java.util.List listJ = j();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 4:
                parcelableE = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableE);
                return true;
            case 5:
                parcelableE = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableE);
                return true;
            case 6:
                strI = g();
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            default:
                return false;
        }
    }
}
