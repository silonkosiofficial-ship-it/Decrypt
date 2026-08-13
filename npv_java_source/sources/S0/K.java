package S0;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static final S0.InterfaceInputConnectionC1617z a(android.view.inputmethod.InputConnection inputConnection, p237x7.l lVar) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            return new S0.J(inputConnection, lVar);
        }
        if (i6 >= 25) {
            return new S0.G(inputConnection, lVar);
        }
        return i6 >= 24 ? new S0.E(inputConnection, lVar) : new S0.A(inputConnection, lVar);
    }
}
