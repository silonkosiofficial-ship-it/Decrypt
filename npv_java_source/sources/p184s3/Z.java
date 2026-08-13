package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7077a0 {
    public static p184s3.InterfaceC7077a0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7077a0 ? (p184s3.InterfaceC7077a0) iInterfaceQueryLocalInterface : new p184s3.Y(iBinder);
    }
}
