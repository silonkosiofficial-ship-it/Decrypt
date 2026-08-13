package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f19151a = V.AbstractC1756y.f(androidx.compose.foundation.h.a.f19152D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.foundation.h.a f19152D = new androidx.compose.foundation.h.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p210v.G b() {
            return androidx.compose.foundation.g.f18976a;
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p250z.j f19153D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p210v.G f19154E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p250z.j jVar, p210v.G g6) {
            super(1);
            this.f19153D = jVar;
            this.f19154E = g6;
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
        final /* synthetic */ p210v.G f19155D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p250z.j f19156E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p210v.G g6, p250z.j jVar) {
            super(3);
            this.f19155D = g6;
            this.f19156E = jVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-353972293);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-353972293, i6, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            p210v.H hB = this.f19155D.b(this.f19156E, interfaceC1734n, 0);
            boolean zS = interfaceC1734n.S(hB);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new androidx.compose.foundation.i(hB);
                interfaceC1734n.K(objG);
            }
            androidx.compose.foundation.i iVar = (androidx.compose.foundation.i) objG;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return iVar;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final V.O0 a() {
        return f19151a;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, p250z.j jVar, p210v.G g6) {
        if (g6 == null) {
            return dVar;
        }
        if (g6 instanceof p210v.I) {
            return dVar.b(new androidx.compose.foundation.IndicationModifierElement(jVar, (p210v.I) g6));
        }
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.h.b(jVar, g6) : androidx.compose.ui.platform.E0.a(), new androidx.compose.foundation.h.c(g6, jVar));
    }
}
