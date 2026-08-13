package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.K0 {
    public static p184s3.K0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof p184s3.K0 ? (p184s3.K0) iInterfaceQueryLocalInterface : new p184s3.I0(iBinder);
    }
}
