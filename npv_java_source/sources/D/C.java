package D;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D.B f1577D;

        /* JADX INFO: renamed from: D.C$a$a, reason: collision with other inner class name */
        public static final class C0031a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ D.B f1578a;

            public C0031a(D.B b6) {
                this.f1578a = b6;
            }

            @Override // V.M
            public void e() {
                this.f1578a.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D.B b6) {
            super(1);
            this.f1577D = b6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            return new D.C.a.C0031a(this.f1577D);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1579D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1580E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D.D f1581F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1582G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f1583H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Object obj, int i6, D.D d6, p237x7.p pVar, int i10) {
            super(2);
            this.f1579D = obj;
            this.f1580E = i6;
            this.f1581F = d6;
            this.f1582G = pVar;
            this.f1583H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D.C.a(this.f1579D, this.f1580E, this.f1581F, this.f1582G, interfaceC1734n, V.S0.a(this.f1583H | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(java.lang.Object obj, int i6, D.D d6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-2079116560);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1734nR.l(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1734nR.i(i6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1734nR.l(d6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2079116560, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean zS = interfaceC1734nR.S(obj) | interfaceC1734nR.S(d6);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new D.B(obj, d6);
                interfaceC1734nR.K(objG);
            }
            D.B b6 = (D.B) objG;
            b6.h(i6);
            b6.j((D0.V) interfaceC1734nR.n(D0.W.a()));
            boolean zS2 = interfaceC1734nR.S(b6);
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = new D.C.a(b6);
                interfaceC1734nR.K(objG2);
            }
            V.Q.b(b6, (p237x7.l) objG2, interfaceC1734nR, 0);
            V.AbstractC1756y.a(D0.W.a().d(b6), pVar, interfaceC1734nR, ((i11 >> 6) & 112) | V.P0.f14698i);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D.C.b(obj, i6, d6, pVar, i10));
        }
    }
}
