package p069g9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    static final class a implements p115l4.InterfaceC6925f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f45712a;

        a(W8.InterfaceC1794l interfaceC1794l) {
            this.f45712a = interfaceC1794l;
        }

        @Override // p115l4.InterfaceC6925f
        public final void a(p115l4.AbstractC6931l abstractC6931l) {
            java.lang.Exception excK = abstractC6931l.k();
            if (excK != null) {
                W8.InterfaceC1794l interfaceC1794l = this.f45712a;
                i7.w.a aVar = p087i7.w.f46751D;
                interfaceC1794l.t(p087i7.w.b(p087i7.x.a(excK)));
            } else {
                if (abstractC6931l.m()) {
                    W8.InterfaceC1794l.a.a(this.f45712a, null, 1, null);
                    return;
                }
                W8.InterfaceC1794l interfaceC1794l2 = this.f45712a;
                i7.w.a aVar2 = p087i7.w.f46751D;
                interfaceC1794l2.t(p087i7.w.b(abstractC6931l.l()));
            }
        }
    }

    /* JADX INFO: renamed from: g9.b$b, reason: collision with other inner class name */
    static final class C0523b implements p237x7.l {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p115l4.C6921b f45713C;

        C0523b(p115l4.C6921b c6921b) {
            this.f45713C = c6921b;
        }

        public final void a(java.lang.Throwable th) {
            this.f45713C.a();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l, p127m7.e eVar) {
        return b(abstractC6931l, null, eVar);
    }

    private static final java.lang.Object b(p115l4.AbstractC6931l abstractC6931l, p115l4.C6921b c6921b, p127m7.e eVar) throws java.lang.Exception {
        if (!abstractC6931l.n()) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            abstractC6931l.b(p069g9.a.f45711C, new g9.b.a(c1798n));
            if (c6921b != null) {
                c1798n.G(new p069g9.b.C0523b(c6921b));
            }
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX;
        }
        java.lang.Exception excK = abstractC6931l.k();
        if (excK != null) {
            throw excK;
        }
        if (!abstractC6931l.m()) {
            return abstractC6931l.l();
        }
        throw new java.util.concurrent.CancellationException("Task " + abstractC6931l + " was cancelled normally.");
    }
}
