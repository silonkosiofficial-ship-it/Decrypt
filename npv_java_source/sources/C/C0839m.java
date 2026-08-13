package C;

/* JADX INFO: renamed from: C.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0839m implements C.InterfaceC0838l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.K f1098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.C0836j f1099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.c f1100c;

    /* JADX INFO: renamed from: C.m$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1102E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6) {
            super(2);
            this.f1102E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(726189336, i6, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            C.C0836j c0836j = C.C0839m.this.f1099b;
            int i10 = this.f1102E;
            D.InterfaceC0867d.a aVar = c0836j.f().get(i10);
            ((C.C0835i) aVar.c()).a().o(C.p.f1110a, java.lang.Integer.valueOf(i10 - aVar.b()), interfaceC1734n, 6);
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

    /* JADX INFO: renamed from: C.m$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1104E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1105F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f1106G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, java.lang.Object obj, int i10) {
            super(2);
            this.f1104E = i6;
            this.f1105F = obj;
            this.f1106G = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            C.C0839m.this.g(this.f1104E, this.f1105F, interfaceC1734n, V.S0.a(this.f1106G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public C0839m(C.K k6, C.C0836j c0836j, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f1098a = k6;
        this.f1099b = c0836j;
        this.f1100c = cVar;
    }

    @Override // D.InterfaceC0881s
    public int a() {
        return this.f1099b.g();
    }

    @Override // D.InterfaceC0881s
    public java.lang.Object b(int i6) {
        java.lang.Object objB = c().b(i6);
        return objB == null ? this.f1099b.h(i6) : objB;
    }

    @Override // C.InterfaceC0838l
    public androidx.compose.foundation.lazy.layout.c c() {
        return this.f1100c;
    }

    @Override // D.InterfaceC0881s
    public int d(java.lang.Object obj) {
        return c().d(obj);
    }

    @Override // D.InterfaceC0881s
    public java.lang.Object e(int i6) {
        return this.f1099b.e(i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C.C0839m) {
            return p247y7.AbstractC7350t.b(this.f1099b, ((C.C0839m) obj).f1099b);
        }
        return false;
    }

    @Override // D.InterfaceC0881s
    public void g(int i6, java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1493551140);
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
                V.AbstractC1741q.Q(1493551140, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            D.C.a(obj, i6, this.f1098a.u(), p031d0.c.e(726189336, true, new C.C0839m.a(i6), interfaceC1734nR, 54), interfaceC1734nR, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new C.C0839m.b(i6, obj, i10));
        }
    }

    public int hashCode() {
        return this.f1099b.hashCode();
    }

    @Override // C.InterfaceC0838l
    public C.J i() {
        return this.f1099b.k();
    }
}
