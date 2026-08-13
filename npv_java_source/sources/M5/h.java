package M5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public interface a {
        java.lang.String a(java.lang.Object obj);
    }

    public static p046e5.C6530c b(java.lang.String str, java.lang.String str2) {
        return p046e5.C6530c.l(M5.f.a(str, str2), M5.f.class);
    }

    public static p046e5.C6530c c(final java.lang.String str, final M5.h.a aVar) {
        return p046e5.C6530c.m(M5.f.class).b(p046e5.r.j(android.content.Context.class)).f(new p046e5.h() { // from class: M5.g
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return M5.h.d(str, aVar, interfaceC6532e);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ M5.f d(java.lang.String str, M5.h.a aVar, p046e5.InterfaceC6532e interfaceC6532e) {
        return M5.f.a(str, aVar.a((android.content.Context) interfaceC6532e.a(android.content.Context.class)));
    }
}
