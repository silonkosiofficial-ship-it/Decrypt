package W;

/* JADX INFO: loaded from: classes.dex */
public final class g extends W.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W.g.a f15286i = new W.g.a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f15287j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15289b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15291d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15295h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W.d[] f15288a = new W.d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f15290c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Object[] f15292e = new java.lang.Object[16];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public final class b implements W.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f15298c;

        public b() {
        }

        @Override // W.e
        public java.lang.Object a(int i6) {
            return W.g.this.f15292e[this.f15298c + i6];
        }

        @Override // W.e
        public int b(int i6) {
            return W.g.this.f15290c[this.f15297b + i6];
        }

        public final W.d c() {
            W.d dVar = W.g.this.f15288a[this.f15296a];
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f15296a >= W.g.this.f15289b) {
                return false;
            }
            W.d dVarC = c();
            this.f15297b += dVarC.b();
            this.f15298c += dVarC.d();
            int i6 = this.f15296a + 1;
            this.f15296a = i6;
            return i6 < W.g.this.f15289b;
        }
    }

    public static final class c {
        public static W.g a(W.g gVar) {
            return gVar;
        }

        public static final W.d b(W.g gVar) {
            return gVar.v();
        }

        public static final void c(W.g gVar, int i6, int i10) {
            int i11 = 1 << i6;
            if (!((gVar.f15294g & i11) == 0)) {
                V.I0.b("Already pushed argument " + b(gVar).e(i6));
            }
            gVar.f15294g |= i11;
            gVar.f15290c[gVar.z(i6)] = i10;
        }

        public static final void d(W.g gVar, int i6, java.lang.Object obj) {
            int i10 = 1 << i6;
            if (!((gVar.f15295h & i10) == 0)) {
                V.I0.b("Already pushed argument " + b(gVar).f(i6));
            }
            gVar.f15295h |= i10;
            gVar.f15292e[gVar.A(i6)] = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i6) {
        return (this.f15293f - v().d()) + i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i6);
    }

    private final int o(int i6, int i10) {
        return E7.j.d(i6 + E7.j.g(i6, 1024), i10);
    }

    private final void p(int i6) {
        int[] iArr = this.f15290c;
        int length = iArr.length;
        if (i6 > length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, o(length, i6));
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15290c = iArrCopyOf;
        }
    }

    private final void q(int i6) {
        java.lang.Object[] objArr = this.f15292e;
        int length = objArr.length;
        if (i6 > length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, o(length, i6));
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15292e = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W.d v() {
        W.d dVar = this.f15288a[this.f15289b - 1];
        p247y7.AbstractC7350t.c(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int i6) {
        return (this.f15291d - v().b()) + i6;
    }

    public final void m() {
        this.f15289b = 0;
        this.f15291d = 0;
        p097j7.AbstractC6872n.w(this.f15292e, null, 0, this.f15293f);
        this.f15293f = 0;
    }

    public final void r(V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
        if (u()) {
            W.g.b bVar = new W.g.b();
            do {
                bVar.c().a(bVar, interfaceC1713g, c1727k1, y6);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f15289b;
    }

    public final boolean t() {
        return s() == 0;
    }

    public java.lang.String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final void w(W.g gVar) {
        if (t()) {
            throw new java.util.NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        W.d[] dVarArr = this.f15288a;
        int i6 = this.f15289b - 1;
        this.f15289b = i6;
        W.d dVar = dVarArr[i6];
        p247y7.AbstractC7350t.c(dVar);
        this.f15288a[this.f15289b] = null;
        gVar.y(dVar);
        int i10 = this.f15293f;
        int i11 = gVar.f15293f;
        int iD = dVar.d();
        for (int i12 = 0; i12 < iD; i12++) {
            i11--;
            i10--;
            java.lang.Object[] objArr = gVar.f15292e;
            java.lang.Object[] objArr2 = this.f15292e;
            objArr[i11] = objArr2[i10];
            objArr2[i10] = null;
        }
        int i13 = this.f15291d;
        int i14 = gVar.f15291d;
        int iB = dVar.b();
        for (int i15 = 0; i15 < iB; i15++) {
            i14--;
            i13--;
            int[] iArr = gVar.f15290c;
            int[] iArr2 = this.f15290c;
            iArr[i14] = iArr2[i13];
            iArr2[i13] = 0;
        }
        this.f15293f -= dVar.d();
        this.f15291d -= dVar.b();
    }

    public final void x(W.d dVar) {
        if (!(dVar.b() == 0 && dVar.d() == 0)) {
            V.I0.a("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.");
        }
        y(dVar);
    }

    public final void y(W.d dVar) {
        this.f15294g = 0;
        this.f15295h = 0;
        int i6 = this.f15289b;
        if (i6 == this.f15288a.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f15288a, this.f15289b + E7.j.g(i6, 1024));
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15288a = (W.d[]) objArrCopyOf;
        }
        p(this.f15291d + dVar.b());
        q(this.f15293f + dVar.d());
        W.d[] dVarArr = this.f15288a;
        int i10 = this.f15289b;
        this.f15289b = i10 + 1;
        dVarArr[i10] = dVar;
        this.f15291d += dVar.b();
        this.f15293f += dVar.d();
    }
}
