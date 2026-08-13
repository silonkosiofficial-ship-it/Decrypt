package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.D0 {
    public C0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static p184s3.D0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof p184s3.D0 ? (p184s3.D0) iInterfaceQueryLocalInterface : new p184s3.B0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strD;
        if (i6 == 1) {
            strD = d();
        } else {
            if (i6 != 2) {
                return false;
            }
            strD = e();
        }
        parcel2.writeNoException();
        parcel2.writeString(strD);
        return true;
    }
}
