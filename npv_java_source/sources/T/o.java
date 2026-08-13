package T;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.F f12846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p200u.w0 f12847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p200u.w0 f12848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p200u.w0 f12849d;

    static {
        p200u.C7198z c7198z = new p200u.C7198z(0.4f, 0.0f, 0.6f, 1.0f);
        f12846a = c7198z;
        f12847b = new p200u.w0(120, 0, p200u.H.d(), 2, null);
        f12848c = new p200u.w0(150, 0, c7198z, 2, null);
        f12849d = new p200u.w0(120, 0, c7198z, 2, null);
    }

    public static final java.lang.Object d(p200u.C7157a c7157a, float f6, p250z.i iVar, p250z.i iVar2, p127m7.e eVar) {
        p200u.InterfaceC7175j interfaceC7175jB;
        if (iVar2 != null) {
            interfaceC7175jB = T.n.f12845a.a(iVar2);
        } else {
            interfaceC7175jB = iVar != null ? T.n.f12845a.b(iVar) : null;
        }
        p200u.InterfaceC7175j interfaceC7175j = interfaceC7175jB;
        if (interfaceC7175j != null) {
            java.lang.Object objF = p200u.C7157a.f(c7157a, Y0.i.m(f6), interfaceC7175j, null, null, eVar, 12, null);
            return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
        }
        java.lang.Object objS = c7157a.s(Y0.i.m(f6), eVar);
        return objS == p137n7.b.g() ? objS : p087i7.M.f46721a;
    }
}
