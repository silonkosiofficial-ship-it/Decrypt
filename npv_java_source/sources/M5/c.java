package M5;

/* JADX INFO: loaded from: classes3.dex */
public class c implements M5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f7029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M5.d f7030b;

    c(java.util.Set set, M5.d dVar) {
        this.f7029a = e(set);
        this.f7030b = dVar;
    }

    public static p046e5.C6530c c() {
        return p046e5.C6530c.e(M5.i.class).b(p046e5.r.m(M5.f.class)).f(new p046e5.h() { // from class: M5.b
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return M5.c.d(interfaceC6532e);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ M5.i d(p046e5.InterfaceC6532e interfaceC6532e) {
        return new M5.c(interfaceC6532e.g(M5.f.class), M5.d.a());
    }

    private static java.lang.String e(java.util.Set set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            M5.f fVar = (M5.f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // M5.i
    public java.lang.String a() {
        if (this.f7030b.b().isEmpty()) {
            return this.f7029a;
        }
        return this.f7029a + ' ' + e(this.f7030b.b());
    }
}
