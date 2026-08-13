package D0;

/* JADX INFO: loaded from: classes.dex */
final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D0.P f1790a = new D0.P();

    private static final class a implements D0.G {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final D0.InterfaceC0895n f1791C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final D0.P.c f1792D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final D0.P.d f1793E;

        public a(D0.InterfaceC0895n interfaceC0895n, D0.P.c cVar, D0.P.d dVar) {
            this.f1791C = interfaceC0895n;
            this.f1792D = cVar;
            this.f1793E = dVar;
        }

        @Override // D0.InterfaceC0895n
        public int S(int i6) {
            return this.f1791C.S(i6);
        }

        @Override // D0.InterfaceC0895n
        public int T(int i6) {
            return this.f1791C.T(i6);
        }

        @Override // D0.G
        public D0.X U(long j6) {
            if (this.f1793E == D0.P.d.Width) {
                return new D0.P.b(this.f1792D == D0.P.c.Max ? this.f1791C.T(Y0.C1859b.k(j6)) : this.f1791C.S(Y0.C1859b.k(j6)), Y0.C1859b.g(j6) ? Y0.C1859b.k(j6) : 32767);
            }
            return new D0.P.b(Y0.C1859b.h(j6) ? Y0.C1859b.l(j6) : 32767, this.f1792D == D0.P.c.Max ? this.f1791C.t(Y0.C1859b.l(j6)) : this.f1791C.n0(Y0.C1859b.l(j6)));
        }

        @Override // D0.InterfaceC0895n
        public java.lang.Object Z() {
            return this.f1791C.Z();
        }

        @Override // D0.InterfaceC0895n
        public int n0(int i6) {
            return this.f1791C.n0(i6);
        }

        @Override // D0.InterfaceC0895n
        public int t(int i6) {
            return this.f1791C.t(i6);
        }
    }

    private static final class b extends D0.X {
        public b(int i6, int i10) {
            Y0(Y0.u.a(i6, i10));
        }

        @Override // D0.O
        public int Q(D0.AbstractC0882a abstractC0882a) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // D0.X
        public void R0(long j6, float f6, p237x7.l lVar) {
        }
    }

    private enum c {
        Min,
        Max
    }

    private enum d {
        Width,
        Height
    }

    private P() {
    }

    public final int a(D0.A a6, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return a6.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new D0.P.a(interfaceC0895n, D0.P.c.Max, D0.P.d.Height), Y0.c.b(0, i6, 0, 0, 13, null)).getHeight();
    }

    public final int b(D0.A a6, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return a6.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new D0.P.a(interfaceC0895n, D0.P.c.Max, D0.P.d.Width), Y0.c.b(0, 0, 0, i6, 7, null)).getWidth();
    }

    public final int c(D0.A a6, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return a6.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new D0.P.a(interfaceC0895n, D0.P.c.Min, D0.P.d.Height), Y0.c.b(0, i6, 0, 0, 13, null)).getHeight();
    }

    public final int d(D0.A a6, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return a6.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new D0.P.a(interfaceC0895n, D0.P.c.Min, D0.P.d.Width), Y0.c.b(0, 0, 0, i6, 7, null)).getWidth();
    }
}
