package V;

/* JADX INFO: renamed from: V.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1722j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V.C1722j f14896a = new V.C1722j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p237x7.p f14897b = p031d0.c.c(954879418, false, V.C1722j.a.f14899D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p237x7.p f14898c = p031d0.c.c(1918065384, false, V.C1722j.b.f14900D);

    /* JADX INFO: renamed from: V.j$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final V.C1722j.a f14899D = new V.C1722j.a();

        a() {
            super(2);
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(954879418, i6, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:623)");
            }
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

    /* JADX INFO: renamed from: V.j$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final V.C1722j.b f14900D = new V.C1722j.b();

        b() {
            super(2);
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1918065384, i6, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:757)");
            }
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
        return f14897b;
    }

    public final p237x7.p b() {
        return f14898c;
    }
}
