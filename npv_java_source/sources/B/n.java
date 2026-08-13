package B;

/* JADX INFO: loaded from: classes.dex */
final class n implements B.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B.D f383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B.k f384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.a f385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.c f386d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f388E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6) {
            super(2);
            this.f388E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-824725566, i6, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            B.k kVar = B.n.this.f384b;
            int i10 = this.f388E;
            B.n nVar = B.n.this;
            D.InterfaceC0867d.a aVar = kVar.f().get(i10);
            ((B.j) aVar.c()).a().o(nVar.f(), java.lang.Integer.valueOf(i10 - aVar.b()), interfaceC1734n, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f390E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f391F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f392G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, java.lang.Object obj, int i10) {
            super(2);
            this.f390E = i6;
            this.f391F = obj;
            this.f392G = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            B.n.this.g(this.f390E, this.f391F, interfaceC1734n, V.S0.a(this.f392G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public n(B.D d6, B.k kVar, androidx.compose.foundation.lazy.a aVar, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f383a = d6;
        this.f384b = kVar;
        this.f385c = aVar;
        this.f386d = cVar;
    }

    @Override // D.InterfaceC0881s
    public int a() {
        return this.f384b.g();
    }

    @Override // D.InterfaceC0881s
    public java.lang.Object b(int i6) {
        java.lang.Object objB = c().b(i6);
        return objB == null ? this.f384b.h(i6) : objB;
    }

    @Override // B.m
    public androidx.compose.foundation.lazy.layout.c c() {
        return this.f386d;
    }

    @Override // D.InterfaceC0881s
    public int d(java.lang.Object obj) {
        return c().d(obj);
    }

    @Override // D.InterfaceC0881s
    public java.lang.Object e(int i6) {
        return this.f384b.e(i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B.n) {
            return p247y7.AbstractC7350t.b(this.f384b, ((B.n) obj).f384b);
        }
        return false;
    }

    @Override // B.m
    public androidx.compose.foundation.lazy.a f() {
        return this.f385c;
    }

    @Override // D.InterfaceC0881s
    public void g(int i6, java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-462424778);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1734nR.i(i6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1734nR.l(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1734nR.S(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-462424778, i11, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            D.C.a(obj, i6, this.f383a.z(), p031d0.c.e(-824725566, true, new B.n.a(i6), interfaceC1734nR, 54), interfaceC1734nR, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new B.n.b(i6, obj, i10));
        }
    }

    @Override // B.m
    public java.util.List h() {
        return this.f384b.i();
    }

    public int hashCode() {
        return this.f384b.hashCode();
    }
}
