package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C.u f1050a;

    public static final class a implements D0.K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.Map f1053c = p097j7.S.h();

        a() {
        }

        @Override // D0.K
        public java.util.Map f() {
            return this.f1053c;
        }

        @Override // D0.K
        public int getHeight() {
            return this.f1052b;
        }

        @Override // D0.K
        public int getWidth() {
            return this.f1051a;
        }

        @Override // D0.K
        public void k() {
        }

        @Override // D0.K
        public /* synthetic */ p237x7.l l() {
            return D0.J.a(this);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final C.L.b f1054D = new C.L.b();

        b() {
            super(1);
        }

        public final java.util.List a(int i6) {
            return p097j7.AbstractC6879v.m();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f1055D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1056E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i6, int i10) {
            super(0);
            this.f1055D = i6;
            this.f1056E = i10;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C.K b() {
            return new C.K(this.f1055D, this.f1056E);
        }
    }

    static {
        C.L.a aVar = new C.L.a();
        java.util.List listM = p097j7.AbstractC6879v.m();
        p230x.s sVar = p230x.s.Vertical;
        f1050a = new C.u(null, 0, false, 0.0f, aVar, false, W8.O.a(p127m7.j.f51198C), Y0.g.b(1.0f, 0.0f, 2, null), 0, C.L.b.f1054D, listM, 0, 0, 0, false, sVar, 0, 0);
    }

    public static final C.K b(int i6, int i10, V.InterfaceC1734n interfaceC1734n, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i6 = 0;
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(29186956, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        p041e0.j jVarA = C.K.f1010v.a();
        boolean z6 = ((((i11 & 14) ^ 6) > 4 && interfaceC1734n.i(i6)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC1734n.i(i10)) || (i11 & 48) == 32);
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new C.L.c(i6, i10);
            interfaceC1734n.K(objG);
        }
        C.K k6 = (C.K) p041e0.b.e(objArr, jVarA, null, (p237x7.a) objG, interfaceC1734n, 0, 4);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return k6;
    }
}
