package Q3;

/* JADX INFO: renamed from: Q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1462a extends Q3.InterfaceC1471j.a {
    public static android.accounts.Account L0(Q3.InterfaceC1471j interfaceC1471j) {
        android.accounts.Account accountB = null;
        if (interfaceC1471j != null) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                accountB = interfaceC1471j.b();
            } catch (android.os.RemoteException unused) {
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountB;
    }
}
