package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class M0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.N0 {
    public M0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static p184s3.N0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof p184s3.N0 ? (p184s3.N0) iInterfaceQueryLocalInterface : new p184s3.L0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            p184s3.e2 e2Var = (p184s3.e2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.e2.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            C2(e2Var);
            parcel2.writeNoException();
        } else {
            if (i6 != 2) {
                return false;
            }
            boolean zE = e();
            parcel2.writeNoException();
            int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
            parcel2.writeInt(zE ? 1 : 0);
        }
        return true;
    }
}
