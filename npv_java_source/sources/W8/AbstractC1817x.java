package W8;

/* JADX INFO: renamed from: W8.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1817x {
    public static final W8.InterfaceC1813v a(W8.InterfaceC1822z0 interfaceC1822z0) {
        return new W8.C1815w(interfaceC1822z0);
    }

    public static /* synthetic */ W8.InterfaceC1813v b(W8.InterfaceC1822z0 interfaceC1822z0, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            interfaceC1822z0 = null;
        }
        return a(interfaceC1822z0);
    }

    public static final boolean c(W8.InterfaceC1813v interfaceC1813v, java.lang.Object obj) {
        java.lang.Throwable thE = p087i7.w.e(obj);
        return thE == null ? interfaceC1813v.R0(obj) : interfaceC1813v.g(thE);
    }
}
