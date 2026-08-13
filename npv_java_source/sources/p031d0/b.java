package p031d0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p031d0.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f44260C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f44261D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Object f44262E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private V.Q0 f44263F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f44264G;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44266E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f44267F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.Object obj, int i6) {
            super(2);
            this.f44266E = obj;
            this.f44267F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p031d0.b.this.e(this.f44266E, interfaceC1734n, V.S0.a(this.f44267F) | 1);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: d0.b$b, reason: collision with other inner class name */
    static final class C0488b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44269E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44270F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f44271G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0488b(java.lang.Object obj, java.lang.Object obj2, int i6) {
            super(2);
            this.f44269E = obj;
            this.f44270F = obj2;
            this.f44271G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p031d0.b.this.f(this.f44269E, this.f44270F, interfaceC1734n, V.S0.a(this.f44271G) | 1);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44273E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44274F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44275G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f44276H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i6) {
            super(2);
            this.f44273E = obj;
            this.f44274F = obj2;
            this.f44275G = obj3;
            this.f44276H = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p031d0.b.this.g(this.f44273E, this.f44274F, this.f44275G, interfaceC1734n, V.S0.a(this.f44276H) | 1);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public b(int i6, boolean z6, java.lang.Object obj) {
        this.f44260C = i6;
        this.f44261D = z6;
        this.f44262E = obj;
    }

    private final void k(V.InterfaceC1734n interfaceC1734n) {
        V.Q0 q0B;
        if (!this.f44261D || (q0B = interfaceC1734n.b()) == null) {
            return;
        }
        interfaceC1734n.z(q0B);
        if (p031d0.c.f(this.f44263F, q0B)) {
            this.f44263F = q0B;
            return;
        }
        java.util.List arrayList = this.f44264G;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f44264G = arrayList;
        } else {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (p031d0.c.f((V.Q0) arrayList.get(i6), q0B)) {
                    arrayList.set(i6, q0B);
                    return;
                }
            }
        }
        arrayList.add(q0B);
    }

    private final void m() {
        if (this.f44261D) {
            V.Q0 q6 = this.f44263F;
            if (q6 != null) {
                q6.invalidate();
                this.f44263F = null;
            }
            java.util.List list = this.f44264G;
            if (list != null) {
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((V.Q0) list.get(i6)).invalidate();
                }
                list.clear();
            }
        }
    }

    public java.lang.Object a(V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(this.f44260C);
        k(interfaceC1734nR);
        int iD = i6 | (interfaceC1734nR.S(this) ? p031d0.c.d(0) : p031d0.c.g(0));
        java.lang.Object obj = this.f44262E;
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        java.lang.Object objU = ((p237x7.p) p247y7.W.f(obj, 2)).u(interfaceC1734nR, java.lang.Integer.valueOf(iD));
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            interfaceC1709e1X.a((p237x7.p) p247y7.W.f(this, 2));
        }
        return objU;
    }

    public java.lang.Object e(java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(this.f44260C);
        k(interfaceC1734nR);
        int iD = interfaceC1734nR.S(this) ? p031d0.c.d(1) : p031d0.c.g(1);
        java.lang.Object obj2 = this.f44262E;
        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        java.lang.Object objJ = ((p237x7.q) p247y7.W.f(obj2, 3)).j(obj, interfaceC1734nR, java.lang.Integer.valueOf(iD | i6));
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new d0.b.a(obj, i6));
        }
        return objJ;
    }

    public java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(this.f44260C);
        k(interfaceC1734nR);
        int iD = interfaceC1734nR.S(this) ? p031d0.c.d(2) : p031d0.c.g(2);
        java.lang.Object obj3 = this.f44262E;
        p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        java.lang.Object objO = ((p237x7.r) p247y7.W.f(obj3, 4)).o(obj, obj2, interfaceC1734nR, java.lang.Integer.valueOf(iD | i6));
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p031d0.b.C0488b(obj, obj2, i6));
        }
        return objO;
    }

    public java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(this.f44260C);
        k(interfaceC1734nR);
        int iD = interfaceC1734nR.S(this) ? p031d0.c.d(3) : p031d0.c.g(3);
        java.lang.Object obj4 = this.f44262E;
        p247y7.AbstractC7350t.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        java.lang.Object objV = ((p237x7.s) p247y7.W.f(obj4, 5)).v(obj, obj2, obj3, interfaceC1734nR, java.lang.Integer.valueOf(iD | i6));
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new d0.b.c(obj, obj2, obj3, i6));
        }
        return objV;
    }

    @Override // p237x7.q
    public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return e(obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
    }

    public final void n(java.lang.Object obj) {
        if (p247y7.AbstractC7350t.b(this.f44262E, obj)) {
            return;
        }
        boolean z6 = this.f44262E == null;
        this.f44262E = obj;
        if (z6) {
            return;
        }
        m();
    }

    @Override // p237x7.r
    public /* bridge */ /* synthetic */ java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return f(obj, obj2, (V.InterfaceC1734n) obj3, ((java.lang.Number) obj4).intValue());
    }

    @Override // p237x7.p
    public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
        return a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
    }

    @Override // p237x7.s
    public /* bridge */ /* synthetic */ java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return g(obj, obj2, obj3, (V.InterfaceC1734n) obj4, ((java.lang.Number) obj5).intValue());
    }
}
