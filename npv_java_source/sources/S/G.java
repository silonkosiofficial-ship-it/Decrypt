package S;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S.G f9991a = new S.G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p237x7.p f9992b = p031d0.c.c(-505750804, false, S.G.a.f9993D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.G.a f9993D = new S.G.a();

        a() {
            super(2);
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-505750804, i6, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:231)");
            }
            p201u0.d dVarA = Q.AbstractC1456g.a(O.b.a.f7940a);
            T.x.a aVar = T.x.f12882a;
            S.AbstractC1550i0.b(dVarA, T.y.a(T.x.a(S.C0.f9917B), interfaceC1734n, 0), null, 0L, interfaceC1734n, 0, 12);
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

    public final p237x7.p a() {
        return f9992b;
    }
}
