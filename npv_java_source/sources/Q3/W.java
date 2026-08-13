package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends p045e4.b implements Q3.X {
    public static Q3.X y0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof Q3.X ? (Q3.X) iInterfaceQueryLocalInterface : new Q3.V(iBinder);
    }
}
