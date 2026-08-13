package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        if (obj instanceof W8.A) {
            i7.w.a aVar = p087i7.w.f46751D;
            obj = p087i7.x.a(((W8.A) obj).f15423a);
        }
        return p087i7.w.b(obj);
    }

    public static final java.lang.Object b(java.lang.Object obj) {
        java.lang.Throwable thE = p087i7.w.e(obj);
        return thE == null ? obj : new W8.A(thE, false, 2, null);
    }

    public static final java.lang.Object c(java.lang.Object obj, W8.InterfaceC1794l interfaceC1794l) {
        java.lang.Throwable thE = p087i7.w.e(obj);
        return thE == null ? obj : new W8.A(thE, false, 2, null);
    }
}
