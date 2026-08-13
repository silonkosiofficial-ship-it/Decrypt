package T;

/* JADX INFO: loaded from: classes.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T.n f12845a = new T.n();

    private n() {
    }

    public final p200u.InterfaceC7175j a(p250z.i iVar) {
        if ((iVar instanceof z.n.b) || (iVar instanceof p250z.b) || (iVar instanceof p250z.g) || (iVar instanceof p250z.d)) {
            return T.o.f12847b;
        }
        return null;
    }

    public final p200u.InterfaceC7175j b(p250z.i iVar) {
        if (!(iVar instanceof z.n.b) && !(iVar instanceof p250z.b)) {
            if (iVar instanceof p250z.g) {
                return T.o.f12849d;
            }
            if (!(iVar instanceof p250z.d)) {
                return null;
            }
        }
        return T.o.f12848c;
    }
}
