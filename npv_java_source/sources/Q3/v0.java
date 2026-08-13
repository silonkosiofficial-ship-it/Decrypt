package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends p045e4.b implements Q3.S {
    public v0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static Q3.S y0(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof Q3.S ? (Q3.S) iInterfaceQueryLocalInterface : new Q3.u0(iBinder);
    }

    @Override // p045e4.b
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            X3.a aVarF = f();
            parcel2.writeNoException();
            p045e4.c.d(parcel2, aVarF);
        } else {
            if (i6 != 2) {
                return false;
            }
            int iC = c();
            parcel2.writeNoException();
            parcel2.writeInt(iC);
        }
        return true;
    }
}
