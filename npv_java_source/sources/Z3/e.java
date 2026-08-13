package Z3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends Z3.b implements Z3.f {
    public static Z3.f q0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof Z3.f ? (Z3.f) iInterfaceQueryLocalInterface : new Z3.d(iBinder);
    }
}
