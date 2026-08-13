package S;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S.F f9975a = new S.F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p237x7.q f9976b = p031d0.c.c(818736383, false, S.F.a.f9977D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.F.a f9977D = new S.F.a();

        a() {
            super(3);
        }

        public final void a(S.U0 u6, V.InterfaceC1734n interfaceC1734n, int i6) {
            int i10;
            if ((i6 & 6) == 0) {
                i10 = i6 | (interfaceC1734n.S(u6) ? 4 : 2);
            } else {
                i10 = i6;
            }
            if ((i10 & 19) == 18 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(818736383, i10, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
            }
            S.Z0.d(u6, null, false, null, 0L, 0L, 0L, 0L, 0L, interfaceC1734n, i10 & 14, 510);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((S.U0) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    public final p237x7.q a() {
        return f9976b;
    }
}
