package F0;

/* JADX INFO: renamed from: F0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0.C0922h0 f2661a = new F0.C0922h0();

    /* JADX INFO: renamed from: F0.h0$a */
    private static final class a implements D0.G {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final D0.InterfaceC0895n f2662C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final F0.C0922h0.c f2663D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final F0.C0922h0.d f2664E;

        public a(D0.InterfaceC0895n interfaceC0895n, F0.C0922h0.c cVar, F0.C0922h0.d dVar) {
            this.f2662C = interfaceC0895n;
            this.f2663D = cVar;
            this.f2664E = dVar;
        }

        @Override // D0.InterfaceC0895n
        public int S(int i6) {
            return this.f2662C.S(i6);
        }

        @Override // D0.InterfaceC0895n
        public int T(int i6) {
            return this.f2662C.T(i6);
        }

        @Override // D0.G
        public D0.X U(long j6) {
            if (this.f2664E == F0.C0922h0.d.Width) {
                return new F0.C0922h0.b(this.f2663D == F0.C0922h0.c.Max ? this.f2662C.T(Y0.C1859b.k(j6)) : this.f2662C.S(Y0.C1859b.k(j6)), Y0.C1859b.g(j6) ? Y0.C1859b.k(j6) : 32767);
            }
            return new F0.C0922h0.b(Y0.C1859b.h(j6) ? Y0.C1859b.l(j6) : 32767, this.f2663D == F0.C0922h0.c.Max ? this.f2662C.t(Y0.C1859b.l(j6)) : this.f2662C.n0(Y0.C1859b.l(j6)));
        }

        @Override // D0.InterfaceC0895n
        public java.lang.Object Z() {
            return this.f2662C.Z();
        }

        @Override // D0.InterfaceC0895n
        public int n0(int i6) {
            return this.f2662C.n0(i6);
        }

        @Override // D0.InterfaceC0895n
        public int t(int i6) {
            return this.f2662C.t(i6);
        }
    }

    /* JADX INFO: renamed from: F0.h0$b */
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

    /* JADX INFO: renamed from: F0.h0$c */
    private enum c {
        Min,
        Max
    }

    /* JADX INFO: renamed from: F0.h0$d */
    private enum d {
        Width,
        Height
    }

    /* JADX INFO: renamed from: F0.h0$e */
    public interface e {
        D0.K f(D0.M m6, D0.G g6, long j6);
    }

    private C0922h0() {
    }

    public final int a(F0.C0922h0.e eVar, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return eVar.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new F0.C0922h0.a(interfaceC0895n, F0.C0922h0.c.Max, F0.C0922h0.d.Height), Y0.c.b(0, i6, 0, 0, 13, null)).getHeight();
    }

    public final int b(F0.C0922h0.e eVar, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return eVar.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new F0.C0922h0.a(interfaceC0895n, F0.C0922h0.c.Max, F0.C0922h0.d.Width), Y0.c.b(0, 0, 0, i6, 7, null)).getWidth();
    }

    public final int c(F0.C0922h0.e eVar, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return eVar.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new F0.C0922h0.a(interfaceC0895n, F0.C0922h0.c.Min, F0.C0922h0.d.Height), Y0.c.b(0, i6, 0, 0, 13, null)).getHeight();
    }

    public final int d(F0.C0922h0.e eVar, D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return eVar.f(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), new F0.C0922h0.a(interfaceC0895n, F0.C0922h0.c.Min, F0.C0922h0.d.Width), Y0.c.b(0, 0, 0, i6, 7, null)).getWidth();
    }
}
