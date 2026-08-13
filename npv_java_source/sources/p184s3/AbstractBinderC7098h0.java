package p184s3;

/* JADX INFO: renamed from: s3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7098h0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7101i0 {
    public AbstractBinderC7098h0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static p184s3.InterfaceC7101i0 o6(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7101i0 ? (p184s3.InterfaceC7101i0) iInterfaceQueryLocalInterface : new p184s3.C7095g0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        java.lang.String string = parcel.readString();
        java.lang.String string2 = parcel.readString();
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        E0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
