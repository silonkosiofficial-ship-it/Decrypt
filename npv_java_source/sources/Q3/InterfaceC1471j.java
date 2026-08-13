package Q3;

/* JADX INFO: renamed from: Q3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1471j extends android.os.IInterface {

    /* JADX INFO: renamed from: Q3.j$a */
    public static abstract class a extends p045e4.b implements Q3.InterfaceC1471j {
        public static Q3.InterfaceC1471j y0(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof Q3.InterfaceC1471j ? (Q3.InterfaceC1471j) iInterfaceQueryLocalInterface : new Q3.t0(iBinder);
        }
    }

    android.accounts.Account b();
}
