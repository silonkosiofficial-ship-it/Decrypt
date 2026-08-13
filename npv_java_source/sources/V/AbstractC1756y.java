package V;

/* JADX INFO: renamed from: V.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1756y {

    /* JADX INFO: renamed from: V.y$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.P0[] f15064D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f15065E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f15066F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V.P0[] p0Arr, p237x7.p pVar, int i6) {
            super(2);
            this.f15064D = p0Arr;
            this.f15065E = pVar;
            this.f15066F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            V.P0[] p0Arr = this.f15064D;
            V.AbstractC1756y.b((V.P0[]) java.util.Arrays.copyOf(p0Arr, p0Arr.length), this.f15065E, interfaceC1734n, V.S0.a(this.f15066F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: V.y$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.P0 f15067D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f15068E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f15069F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.P0 p6, p237x7.p pVar, int i6) {
            super(2);
            this.f15067D = p6;
            this.f15068E = pVar;
            this.f15069F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            V.AbstractC1756y.a(this.f15067D, this.f15068E, interfaceC1734n, V.S0.a(this.f15069F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(V.P0 p6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1350970552);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1350970552, i6, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        interfaceC1734nR.c(p6);
        pVar.u(interfaceC1734nR, java.lang.Integer.valueOf((i6 >> 3) & 14));
        interfaceC1734nR.O();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new V.AbstractC1756y.b(p6, pVar, i6));
        }
    }

    public static final void b(V.P0[] p0Arr, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1390796515);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1390796515, i6, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        interfaceC1734nR.I(p0Arr);
        pVar.u(interfaceC1734nR, java.lang.Integer.valueOf((i6 >> 3) & 14));
        interfaceC1734nR.E();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new V.AbstractC1756y.a(p0Arr, pVar, i6));
        }
    }

    public static final V.O0 c(V.u1 u1Var, p237x7.a aVar) {
        return new V.O(u1Var, aVar);
    }

    public static /* synthetic */ V.O0 d(V.u1 u1Var, p237x7.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            u1Var = V.v1.p();
        }
        return c(u1Var, aVar);
    }

    public static final V.O0 e(p237x7.l lVar) {
        return new V.E(lVar);
    }

    public static final V.O0 f(p237x7.a aVar) {
        return new V.H1(aVar);
    }
}
