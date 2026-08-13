package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class W1 extends X3.c {
    public W1() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof p184s3.C7092f0 ? (p184s3.C7092f0) iInterfaceQueryLocalInterface : new p184s3.C7092f0(iBinder);
    }
}
