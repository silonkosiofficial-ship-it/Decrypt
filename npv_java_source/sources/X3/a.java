package X3;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.os.IInterface {

    /* JADX INFO: renamed from: X3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0301a extends p045e4.b implements X3.a {
        public AbstractBinderC0301a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static X3.a y0(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof X3.a ? (X3.a) iInterfaceQueryLocalInterface : new X3.d(iBinder);
        }
    }
}
