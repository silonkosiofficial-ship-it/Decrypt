package W9;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W9.d f15547a = new W9.d();

    private d() {
    }

    public static final W9.a.InterfaceC0294a b(final H9.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "client");
        return new W9.a.InterfaceC0294a() { // from class: W9.c
            @Override // W9.a.InterfaceC0294a
            public final W9.a a(H9.z zVar, W9.b bVar) {
                return W9.d.c(xVar, zVar, bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W9.a c(H9.x xVar, H9.z zVar, W9.b bVar) {
        p247y7.AbstractC7350t.f(xVar, "$client");
        p247y7.AbstractC7350t.f(zVar, "request");
        p247y7.AbstractC7350t.f(bVar, "listener");
        if (zVar.d("Accept") == null) {
            zVar = zVar.h().a("Accept", "text/event-stream").b();
        }
        T9.a aVar = new T9.a(zVar, bVar);
        aVar.e(xVar);
        return aVar;
    }
}
