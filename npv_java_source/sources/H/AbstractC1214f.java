package H;

/* JADX INFO: renamed from: H.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1214f {

    /* JADX INFO: renamed from: H.f$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p220w.i f3896D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p220w.i iVar) {
            super(0);
            this.f3896D = iVar;
        }

        public final void a() {
            p220w.j.a(this.f3896D);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.f$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.F f3897D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f3898E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f3899F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N.F f6, p237x7.p pVar, int i6) {
            super(2);
            this.f3897D = f6;
            this.f3898E = pVar;
            this.f3899F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            H.AbstractC1214f.a(this.f3897D, this.f3898E, interfaceC1734n, V.S0.a(this.f3899F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(N.F f6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1985516685);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(f6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1985516685, i10, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            java.lang.Object objG = interfaceC1734nR.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                objG = new p220w.i(null, 1, null);
                interfaceC1734nR.K(objG);
            }
            p220w.i iVar = (p220w.i) objG;
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (objG2 == aVar.a()) {
                objG2 = new H.AbstractC1214f.a(iVar);
                interfaceC1734nR.K(objG2);
            }
            p220w.a.b(iVar, (p237x7.a) objG2, N.H.a(f6, iVar), null, f6.E(), pVar, interfaceC1734nR, ((i10 << 12) & 458752) | 54, 8);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new H.AbstractC1214f.b(f6, pVar, i6));
        }
    }
}
