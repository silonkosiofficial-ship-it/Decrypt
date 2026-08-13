package D;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D.F f1600D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.q f1601E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D.F f6, p237x7.q qVar) {
            super(2);
            this.f1600D = f6;
            this.f1601E = qVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1863926504, i6, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f1600D.i(p041e0.f.a(interfaceC1734n, 0));
            this.f1601E.j(this.f1600D, interfaceC1734n, 0);
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

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.q f1602D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1603E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.q qVar, int i6) {
            super(2);
            this.f1602D = qVar;
            this.f1603E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D.G.a(this.f1602D, interfaceC1734n, V.S0.a(this.f1603E | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p041e0.g f1604D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p041e0.g gVar) {
            super(0);
            this.f1604D = gVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D.F b() {
            return new D.F(this.f1604D, p097j7.S.h());
        }
    }

    public static final void a(p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(674185128);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(qVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i10 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(674185128, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            p041e0.g gVar = (p041e0.g) interfaceC1734nR.n(p041e0.i.d());
            java.lang.Object[] objArr = {gVar};
            p041e0.j jVarA = D.F.f1585d.a(gVar);
            boolean zL = interfaceC1734nR.l(gVar);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new D.G.c(gVar);
                interfaceC1734nR.K(objG);
            }
            D.F f6 = (D.F) p041e0.b.e(objArr, jVarA, null, (p237x7.a) objG, interfaceC1734nR, 0, 4);
            V.AbstractC1756y.a(p041e0.i.d().d(f6), p031d0.c.e(1863926504, true, new D.G.a(f6, qVar), interfaceC1734nR, 54), interfaceC1734nR, V.P0.f14698i | 48);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D.G.b(qVar, i6));
        }
    }
}
