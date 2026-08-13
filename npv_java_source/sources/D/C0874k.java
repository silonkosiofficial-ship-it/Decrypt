package D;

/* JADX INFO: renamed from: D.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874k implements E0.k, D0.InterfaceC0886e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D.C0874k.b f1680g = new D.C0874k.b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final D.C0874k.a f1681h = new D.C0874k.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D.InterfaceC0876m f1682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D.C0873j f1683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y0.v f1685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p230x.s f1686f;

    /* JADX INFO: renamed from: D.k$a */
    public static final class a implements D0.InterfaceC0886e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1687a;

        a() {
        }

        @Override // D0.InterfaceC0886e.a
        public boolean a() {
            return this.f1687a;
        }
    }

    /* JADX INFO: renamed from: D.k$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: D.k$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1688a;

        static {
            int[] iArr = new int[Y0.v.values().length];
            try {
                iArr[Y0.v.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.v.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f1688a = iArr;
        }
    }

    /* JADX INFO: renamed from: D.k$d */
    public static final class d implements D0.InterfaceC0886e.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p247y7.O f1690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1691c;

        d(p247y7.O o6, int i6) {
            this.f1690b = o6;
            this.f1691c = i6;
        }

        @Override // D0.InterfaceC0886e.a
        public boolean a() {
            return D.C0874k.this.n((D.C0873j.a) this.f1690b.f57254C, this.f1691c);
        }
    }

    public C0874k(D.InterfaceC0876m interfaceC0876m, D.C0873j c0873j, boolean z6, Y0.v vVar, p230x.s sVar) {
        this.f1682b = interfaceC0876m;
        this.f1683c = c0873j;
        this.f1684d = z6;
        this.f1685e = vVar;
        this.f1686f = sVar;
    }

    private final D.C0873j.a l(D.C0873j.a aVar, int i6) {
        int iB = aVar.b();
        int iA = aVar.a();
        if (o(i6)) {
            iA++;
        } else {
            iB--;
        }
        return this.f1683c.a(iB, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(D.C0873j.a aVar, int i6) {
        if (p(i6)) {
            return false;
        }
        if (o(i6)) {
            if (aVar.a() >= this.f1682b.a() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean o(int i6) {
        D0.InterfaceC0886e.b.a aVar = D0.InterfaceC0886e.b.f1830a;
        if (D0.InterfaceC0886e.b.h(i6, aVar.c())) {
            return false;
        }
        if (!D0.InterfaceC0886e.b.h(i6, aVar.b())) {
            if (!D0.InterfaceC0886e.b.h(i6, aVar.a())) {
                if (D0.InterfaceC0886e.b.h(i6, aVar.d())) {
                    if (this.f1684d) {
                        return false;
                    }
                } else if (D0.InterfaceC0886e.b.h(i6, aVar.e())) {
                    int i10 = D.C0874k.c.f1688a[this.f1685e.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new p087i7.s();
                        }
                        if (this.f1684d) {
                            return false;
                        }
                    }
                } else {
                    if (!D0.InterfaceC0886e.b.h(i6, aVar.f())) {
                        D.AbstractC0875l.c();
                        throw new p087i7.C6665k();
                    }
                    int i11 = D.C0874k.c.f1688a[this.f1685e.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new p087i7.s();
                        }
                    } else if (this.f1684d) {
                        return false;
                    }
                }
            }
            return this.f1684d;
        }
        return true;
    }

    private final boolean p(int i6) {
        D0.InterfaceC0886e.b.a aVar = D0.InterfaceC0886e.b.f1830a;
        if (!(D0.InterfaceC0886e.b.h(i6, aVar.a()) ? true : D0.InterfaceC0886e.b.h(i6, aVar.d()))) {
            if (!(D0.InterfaceC0886e.b.h(i6, aVar.e()) ? true : D0.InterfaceC0886e.b.h(i6, aVar.f()))) {
                if (!(D0.InterfaceC0886e.b.h(i6, aVar.c()) ? true : D0.InterfaceC0886e.b.h(i6, aVar.b()))) {
                    D.AbstractC0875l.c();
                    throw new p087i7.C6665k();
                }
            } else if (this.f1686f == p230x.s.Vertical) {
                return true;
            }
        } else if (this.f1686f == p230x.s.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return p071h0.g.b(this, obj, pVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ boolean d(p237x7.l lVar) {
        return p071h0.g.a(this, lVar);
    }

    @Override // D0.InterfaceC0886e
    public java.lang.Object g(int i6, p237x7.l lVar) {
        if (this.f1682b.a() <= 0 || !this.f1682b.d()) {
            return lVar.l(f1681h);
        }
        int iB = o(i6) ? this.f1682b.b() : this.f1682b.e();
        p247y7.O o6 = new p247y7.O();
        o6.f57254C = this.f1683c.a(iB, iB);
        java.lang.Object objL = null;
        while (objL == null && n((D.C0873j.a) o6.f57254C, i6)) {
            D.C0873j.a aVarL = l((D.C0873j.a) o6.f57254C, i6);
            this.f1683c.e((D.C0873j.a) o6.f57254C);
            o6.f57254C = aVarL;
            this.f1682b.c();
            objL = lVar.l(new D.C0874k.d(o6, i6));
        }
        this.f1683c.e((D.C0873j.a) o6.f57254C);
        this.f1682b.c();
        return objL;
    }

    @Override // E0.k
    public E0.m getKey() {
        return D0.AbstractC0887f.a();
    }

    @Override // E0.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public D0.InterfaceC0886e getValue() {
        return this;
    }
}
