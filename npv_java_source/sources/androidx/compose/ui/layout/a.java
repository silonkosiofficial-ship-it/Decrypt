package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final java.lang.Object a(D0.G g6) {
        java.lang.Object objZ = g6.Z();
        D0.InterfaceC0903w interfaceC0903w = objZ instanceof D0.InterfaceC0903w ? (D0.InterfaceC0903w) objZ : null;
        if (interfaceC0903w != null) {
            return interfaceC0903w.Q();
        }
        return null;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, java.lang.Object obj) {
        return dVar.b(new androidx.compose.ui.layout.LayoutIdElement(obj));
    }
}
