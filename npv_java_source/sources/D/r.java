package D;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D.InterfaceC0881s f1705D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1706E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1707F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D.InterfaceC0881s interfaceC0881s, int i6, java.lang.Object obj) {
            super(2);
            this.f1705D = interfaceC0881s;
            this.f1706E = i6;
            this.f1707F = obj;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(980966366, i6, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
            }
            this.f1705D.g(this.f1706E, this.f1707F, interfaceC1734n, 0);
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
        final /* synthetic */ D.InterfaceC0881s f1708D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1709E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f1710F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1711G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f1712H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D.InterfaceC0881s interfaceC0881s, java.lang.Object obj, int i6, java.lang.Object obj2, int i10) {
            super(2);
            this.f1708D = interfaceC0881s;
            this.f1709E = obj;
            this.f1710F = i6;
            this.f1711G = obj2;
            this.f1712H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D.r.a(this.f1708D, this.f1709E, this.f1710F, this.f1711G, interfaceC1734n, V.S0.a(this.f1712H | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D.InterfaceC0881s interfaceC0881s, java.lang.Object obj, int i6, java.lang.Object obj2, V.InterfaceC1734n interfaceC1734n, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1439843069);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1734nR.S(interfaceC0881s) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1734nR.S(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1734nR.i(i6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1734nR.S(obj2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1439843069, i11, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((p041e0.d) obj).d(obj2, p031d0.c.e(980966366, true, new D.r.a(interfaceC0881s, i6, obj2), interfaceC1734nR, 54), interfaceC1734nR, 48);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D.r.b(interfaceC0881s, obj, i6, obj2, i10));
        }
    }
}
