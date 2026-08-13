package p184s3;

/* JADX INFO: renamed from: s3.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7127r0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7130s0 {
    public AbstractBinderC7127r0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static p184s3.InterfaceC7130s0 asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7130s0 ? (p184s3.InterfaceC7130s0) iInterfaceQueryLocalInterface : new p184s3.C7125q0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            p184s3.C7134t1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, liteSdkVersion);
        } else {
            if (i6 != 2) {
                return false;
            }
            com.google.android.gms.internal.ads.InterfaceC2945Vl adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, adapterCreator);
        }
        return true;
    }
}
