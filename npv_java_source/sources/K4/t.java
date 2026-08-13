package K4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends K4.n implements K4.u {
    public static K4.u y0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof K4.u ? (K4.u) iInterfaceQueryLocalInterface : new K4.s(iBinder);
    }
}
