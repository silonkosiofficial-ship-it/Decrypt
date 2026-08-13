package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f10018a = V.AbstractC1756y.f(S.I0.b.f10023D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.O0 f10019b = V.AbstractC1756y.d(null, S.I0.a.f10022D, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final S.J0 f10020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final S.J0 f10021d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.I0.a f10022D = new S.I0.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S.G0 b() {
            return new S.G0(0L, null, 3, null);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.I0.b f10023D = new S.I0.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.FALSE;
        }
    }

    static {
        Y0.i.a aVar = Y0.i.f16208D;
        float fC = aVar.c();
        p141o0.C7016y0.a aVar2 = p141o0.C7016y0.f52264b;
        f10020c = new S.J0(true, fC, aVar2.g(), (p247y7.AbstractC7342k) null);
        f10021d = new S.J0(false, aVar.c(), aVar2.g(), (p247y7.AbstractC7342k) null);
    }

    public static final V.O0 a() {
        return f10019b;
    }

    public static final p210v.I b(boolean z6, float f6, long j6) {
        if (Y0.i.s(f6, Y0.i.f16208D.c()) && p141o0.C7016y0.o(j6, p141o0.C7016y0.f52264b.g())) {
            return z6 ? f10020c : f10021d;
        }
        return new S.J0(z6, f6, j6, (p247y7.AbstractC7342k) null);
    }

    public static final p210v.G c(boolean z6, float f6, long j6, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        boolean z10 = z6;
        if ((i10 & 2) != 0) {
            f6 = Y0.i.f16208D.c();
        }
        float f10 = f6;
        if ((i10 & 4) != 0) {
            j6 = p141o0.C7016y0.f52264b.g();
        }
        long j10 = j6;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1315814667, i6, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        interfaceC1734n.T(-1280632857);
        p210v.G gF = ((java.lang.Boolean) interfaceC1734n.n(f10018a)).booleanValue() ? R.p.f(z10, f10, j10, interfaceC1734n, i6 & 1022, 0) : b(z10, f10, j10);
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return gF;
    }
}
