package p200u;

import u.S.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54762D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ u.S.a f54763E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54764F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p200u.Q f54765G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.Object obj, u.S.a aVar, java.lang.Object obj2, p200u.Q q6) {
            super(0);
            this.f54762D = obj;
            this.f54763E = aVar;
            this.f54764F = obj2;
            this.f54765G = q6;
        }

        public final void a() {
            if (p247y7.AbstractC7350t.b(this.f54762D, this.f54763E.e()) && p247y7.AbstractC7350t.b(this.f54764F, this.f54763E.g())) {
                return;
            }
            this.f54763E.t(this.f54762D, this.f54764F, this.f54765G);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p200u.S f54766D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ u.S.a f54767E;

        public static final class a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p200u.S f54768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u.S.a f54769b;

            public a(p200u.S s6, u.S.a aVar) {
                this.f54768a = s6;
                this.f54769b = aVar;
            }

            @Override // V.M
            public void e() {
                this.f54768a.j(this.f54769b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p200u.S s6, u.S.a aVar) {
            super(1);
            this.f54766D = s6;
            this.f54767E = aVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            this.f54766D.f(this.f54767E);
            return new u.T.b.a(this.f54766D, this.f54767E);
        }
    }

    public static final V.G1 a(p200u.S s6, float f6, float f10, p200u.Q q6, java.lang.String str, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        java.lang.String str2 = (i10 & 8) != 0 ? "FloatAnimation" : str;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-644770905, i6, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i11 = i6 << 3;
        V.G1 g1B = b(s6, java.lang.Float.valueOf(f6), java.lang.Float.valueOf(f10), p200u.z0.i(p247y7.C7344m.f57303a), q6, str2, interfaceC1734n, (i6 & 1022) | (57344 & i11) | (i11 & 458752), 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1B;
    }

    public static final V.G1 b(p200u.S s6, java.lang.Object obj, java.lang.Object obj2, p200u.x0 x0Var, p200u.Q q6, java.lang.String str, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 16) != 0) {
            str = "ValueAnimation";
        }
        java.lang.String str2 = str;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1062847727, i6, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = s6.new a(obj, obj2, x0Var, q6, str2);
            interfaceC1734n.K(objG);
        }
        u.S.a aVar2 = (u.S.a) objG;
        boolean z6 = true;
        boolean z10 = ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.l(obj)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && interfaceC1734n.l(obj2)) || (i6 & 384) == 256);
        if ((((57344 & i6) ^ 24576) <= 16384 || !interfaceC1734n.l(q6)) && (i6 & 24576) != 16384) {
            z6 = false;
        }
        boolean z11 = z10 | z6;
        java.lang.Object objG2 = interfaceC1734n.g();
        if (z11 || objG2 == aVar.a()) {
            objG2 = new u.T.a(obj, aVar2, obj2, q6);
            interfaceC1734n.K(objG2);
        }
        V.Q.f((p237x7.a) objG2, interfaceC1734n, 0);
        boolean zL = interfaceC1734n.l(s6);
        java.lang.Object objG3 = interfaceC1734n.g();
        if (zL || objG3 == aVar.a()) {
            objG3 = new u.T.b(s6, aVar2);
            interfaceC1734n.K(objG3);
        }
        V.Q.b(aVar2, (p237x7.l) objG3, interfaceC1734n, 6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return aVar2;
    }

    public static final p200u.S c(java.lang.String str, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1013651573, i6, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new p200u.S(str);
            interfaceC1734n.K(objG);
        }
        p200u.S s6 = (p200u.S) objG;
        s6.k(interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return s6;
    }
}
