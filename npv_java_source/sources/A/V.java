package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E0.m f57a = E0.e.a(A.V.a.f58D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final A.V.a f58D = new A.V.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A.S b() {
            return A.U.a(0, 0, 0, 0);
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f59D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p237x7.l lVar) {
            super(1);
            this.f59D = lVar;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f60D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.l lVar) {
            super(3);
            this.f60D = lVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1608161351);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1608161351, i6, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean zS = interfaceC1734n.S(this.f60D);
            p237x7.l lVar = this.f60D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new A.C0779m(lVar);
                interfaceC1734n.K(objG);
            }
            A.C0779m c0779m = (A.C0779m) objG;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return c0779m;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.S f61D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(A.S s6) {
            super(1);
            this.f61D = s6;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.S f62D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(A.S s6) {
            super(3);
            this.f62D = s6;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1415685722);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1415685722, i6, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            boolean zS = interfaceC1734n.S(this.f62D);
            A.S s6 = this.f62D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new A.C0786u(s6);
                interfaceC1734n.K(objG);
            }
            A.C0786u c0786u = (A.C0786u) objG;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return c0786u;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final E0.m a() {
        return f57a;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new A.V.b(lVar) : androidx.compose.ui.platform.E0.a(), new A.V.c(lVar));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, A.S s6) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new A.V.d(s6) : androidx.compose.ui.platform.E0.a(), new A.V.e(s6));
    }
}
