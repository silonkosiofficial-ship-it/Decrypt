package S;

/* JADX INFO: renamed from: S.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1532a0 {

    /* JADX INFO: renamed from: S.a0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f10706D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f10707E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f6, long j6) {
            super(1);
            this.f10706D = f6;
            this.f10707E = j6;
        }

        public final void a(p161q0.g gVar) {
            float f6 = 2;
            p161q0.f.i(gVar, this.f10707E, p131n0.h.a(0.0f, gVar.B0(this.f10706D) / f6), p131n0.h.a(p131n0.m.i(gVar.i()), gVar.B0(this.f10706D) / f6), gVar.B0(this.f10706D), 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.a0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10708D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f10709E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f10710F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f10711G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f10712H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, float f6, long j6, int i6, int i10) {
            super(2);
            this.f10708D = dVar;
            this.f10709E = f6;
            this.f10710F = j6;
            this.f10711G = i6;
            this.f10712H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1532a0.a(this.f10708D, this.f10709E, this.f10710F, interfaceC1734n, V.S0.a(this.f10711G | 1), this.f10712H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, float f6, long j6, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(75144485);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i13 = i10 & 2;
        if (i13 != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.h(f6) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i11 |= ((i10 & 4) == 0 && interfaceC1734nR.j(j6)) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) == 0 || interfaceC1734nR.G()) {
                if (i12 != 0) {
                    dVar = androidx.compose.ui.d.f19586a;
                }
                if (i13 != 0) {
                    f6 = S.Z.f10625a.b();
                }
                if ((i10 & 4) != 0) {
                    j6 = S.Z.f10625a.a(interfaceC1734nR, 6);
                    i11 &= -897;
                }
            } else {
                interfaceC1734nR.A();
                if ((i10 & 4) != 0) {
                    i11 &= -897;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(75144485, i11, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:54)");
            }
            boolean z6 = true;
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.p.g(androidx.compose.foundation.layout.p.f(dVar, 0.0f, 1, null), f6);
            boolean z10 = (i11 & 112) == 32;
            if ((((i11 & 896) ^ 384) <= 256 || !interfaceC1734nR.j(j6)) && (i11 & 384) != 256) {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            java.lang.Object objG = interfaceC1734nR.g();
            if (z11 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.AbstractC1532a0.a(f6, j6);
                interfaceC1734nR.K(objG);
            }
            p210v.AbstractC7215i.a(dVarG, (p237x7.l) objG, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        float f10 = f6;
        long j10 = j6;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1532a0.b(dVar2, f10, j10, i6, i10));
        }
    }
}
