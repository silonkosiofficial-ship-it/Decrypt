package p210v;

/* JADX INFO: renamed from: v.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7215i {

    /* JADX INFO: renamed from: v.i$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f55713D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f55714E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f55715F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, p237x7.l lVar, int i6) {
            super(2);
            this.f55713D = dVar;
            this.f55714E = lVar;
            this.f55715F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p210v.AbstractC7215i.a(this.f55713D, this.f55714E, interfaceC1734n, V.S0.a(this.f55715F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-932836462);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(lVar) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-932836462, i10, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            A.N.a(androidx.compose.ui.draw.b.b(dVar, lVar), interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p210v.AbstractC7215i.a(dVar, lVar, i6));
        }
    }
}
