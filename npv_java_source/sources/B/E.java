package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f337a = Y0.i.q(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final B.s f338b = new B.s(null, 0, false, 0.0f, new B.E.a(), 0.0f, false, W8.O.a(p127m7.j.f51198C), Y0.g.b(1.0f, 0.0f, 2, null), Y0.c.b(0, 0, 0, 0, 15, null), p097j7.AbstractC6879v.m(), 0, 0, 0, false, p230x.s.Vertical, 0, 0, null);

    public static final class a implements D0.K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.Map f341c = p097j7.S.h();

        a() {
        }

        @Override // D0.K
        public java.util.Map f() {
            return this.f341c;
        }

        @Override // D0.K
        public int getHeight() {
            return this.f340b;
        }

        @Override // D0.K
        public int getWidth() {
            return this.f339a;
        }

        @Override // D0.K
        public void k() {
        }

        @Override // D0.K
        public /* synthetic */ p237x7.l l() {
            return D0.J.a(this);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f342D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f343E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, int i10) {
            super(0);
            this.f342D = i6;
            this.f343E = i10;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B.D b() {
            return new B.D(this.f342D, this.f343E);
        }
    }

    public static final B.D c(int i6, int i10, V.InterfaceC1734n interfaceC1734n, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i6 = 0;
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1470655220, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        p041e0.j jVarA = B.D.f290y.a();
        boolean z6 = ((((i11 & 14) ^ 6) > 4 && interfaceC1734n.i(i6)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC1734n.i(i10)) || (i11 & 48) == 32);
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new B.E.b(i6, i10);
            interfaceC1734n.K(objG);
        }
        B.D d6 = (B.D) p041e0.b.e(objArr, jVarA, null, (p237x7.a) objG, interfaceC1734n, 0, 4);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return d6;
    }
}
