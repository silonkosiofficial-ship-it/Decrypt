package V;

/* JADX INFO: renamed from: V.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1705d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f14843a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f14844b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.List f14845c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14846d = true;

    /* JADX INFO: renamed from: V.d0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f14848E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W8.InterfaceC1794l interfaceC1794l) {
            super(1);
            this.f14848E = interfaceC1794l;
        }

        public final void a(java.lang.Throwable th) {
            java.lang.Object obj = V.C1705d0.this.f14843a;
            V.C1705d0 c1705d0 = V.C1705d0.this;
            W8.InterfaceC1794l interfaceC1794l = this.f14848E;
            synchronized (obj) {
                c1705d0.f14844b.remove(interfaceC1794l);
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public final java.lang.Object c(p127m7.e eVar) {
        if (e()) {
            return p087i7.M.f46721a;
        }
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        synchronized (this.f14843a) {
            this.f14844b.add(c1798n);
        }
        c1798n.G(new V.C1705d0.a(c1798n));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    public final void d() {
        synchronized (this.f14843a) {
            this.f14846d = false;
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final boolean e() {
        boolean z6;
        synchronized (this.f14843a) {
            z6 = this.f14846d;
        }
        return z6;
    }

    public final void f() {
        synchronized (this.f14843a) {
            try {
                if (e()) {
                    return;
                }
                java.util.List list = this.f14844b;
                this.f14844b = this.f14845c;
                this.f14845c = list;
                this.f14846d = true;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    p127m7.e eVar = (p127m7.e) list.get(i6);
                    i7.w.a aVar = p087i7.w.f46751D;
                    eVar.t(p087i7.w.b(p087i7.M.f46721a));
                }
                list.clear();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
