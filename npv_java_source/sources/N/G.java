package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    static final class a implements N.InterfaceC1359i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ N.F f7330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7331b;

        a(N.F f6, boolean z6) {
            this.f7330a = f6;
            this.f7331b = z6;
        }

        @Override // N.InterfaceC1359i
        public final long a() {
            return this.f7330a.G(this.f7331b);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f7332G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f7333H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ H.F f7334I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(H.F f6, p127m7.e eVar) {
            super(2, eVar);
            this.f7334I = f6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f7332G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f7333H;
                H.F f6 = this.f7334I;
                this.f7332G = 1;
                if (H.AbstractC1231x.c(k6, f6, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((N.G.b) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            N.G.b bVar = new N.G.b(this.f7334I, eVar);
            bVar.f7333H = obj;
            return bVar;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f7335D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ X0.i f7336E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ N.F f7337F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f7338G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z6, X0.i iVar, N.F f6, int i6) {
            super(2);
            this.f7335D = z6;
            this.f7336E = iVar;
            this.f7337F = f6;
            this.f7338G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            N.G.a(this.f7335D, this.f7336E, this.f7337F, interfaceC1734n, V.S0.a(this.f7338G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7339a;

        static {
            int[] iArr = new int[H.EnumC1219k.values().length];
            try {
                iArr[H.EnumC1219k.Cursor.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[H.EnumC1219k.SelectionStart.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[H.EnumC1219k.SelectionEnd.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f7339a = iArr;
        }
    }

    public static final void a(boolean z6, X0.i iVar, N.F f6, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1344558920);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.d(z6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(iVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(f6) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1344558920, i10, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i11 = i10 & 14;
            boolean zS = (i11 == 4) | interfaceC1734nR.S(f6);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = f6.Q(z6);
                interfaceC1734nR.K(objG);
            }
            H.F f10 = (H.F) objG;
            boolean zL = interfaceC1734nR.l(f6) | (i11 == 4);
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (zL || objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = new N.G.a(f6, z6);
                interfaceC1734nR.K(objG2);
            }
            N.InterfaceC1359i interfaceC1359i = (N.InterfaceC1359i) objG2;
            boolean zM = M0.N.m(f6.O().h());
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zL2 = interfaceC1734nR.l(f10);
            java.lang.Object objG3 = interfaceC1734nR.g();
            if (zL2 || objG3 == V.InterfaceC1734n.f14931a.a()) {
                objG3 = new N.G.b(f10, null);
                interfaceC1734nR.K(objG3);
            }
            N.AbstractC1351a.b(interfaceC1359i, z6, iVar, zM, 0L, p251z0.U.d(aVar, f10, (p237x7.p) objG3), interfaceC1734nR, (i10 << 3) & 1008, 16);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new N.G.c(z6, iVar, f6, i6));
        }
    }

    public static final long b(N.F f6, long j6) {
        int iN;
        H.V vJ;
        H.D dV;
        M0.C1332d c1332dK;
        p131n0.g gVarA = f6.A();
        if (gVarA == null) {
            return p131n0.g.f51312b.b();
        }
        long jV = gVarA.v();
        M0.C1332d c1332dN = f6.N();
        if (c1332dN == null || c1332dN.length() == 0) {
            return p131n0.g.f51312b.b();
        }
        H.EnumC1219k enumC1219kC = f6.C();
        int i6 = enumC1219kC == null ? -1 : N.G.d.f7339a[enumC1219kC.ordinal()];
        if (i6 == -1) {
            return p131n0.g.f51312b.b();
        }
        if (i6 == 1 || i6 == 2) {
            iN = M0.N.n(f6.O().h());
        } else {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            iN = M0.N.i(f6.O().h());
        }
        H.C1230w c1230wL = f6.L();
        if (c1230wL == null || (vJ = c1230wL.j()) == null) {
            return p131n0.g.f51312b.b();
        }
        H.C1230w c1230wL2 = f6.L();
        if (c1230wL2 == null || (dV = c1230wL2.v()) == null || (c1332dK = dV.k()) == null) {
            return p131n0.g.f51312b.b();
        }
        int iK = E7.j.k(f6.J().b(iN), 0, c1332dK.length());
        float fM = p131n0.g.m(vJ.j(jV));
        M0.K kF = vJ.f();
        int iQ = kF.q(iK);
        float fS = kF.s(iQ);
        float fT = kF.t(iQ);
        float fJ = E7.j.j(fM, java.lang.Math.min(fS, fT), java.lang.Math.max(fS, fT));
        if (!Y0.t.e(j6, Y0.t.f16230b.a()) && java.lang.Math.abs(fM - fJ) > Y0.t.g(j6) / 2) {
            return p131n0.g.f51312b.b();
        }
        float fV = kF.v(iQ);
        return p131n0.h.a(fJ, ((kF.m(iQ) - fV) / 2) + fV);
    }

    public static final boolean c(N.F f6, boolean z6) {
        D0.InterfaceC0900t interfaceC0900tI;
        p131n0.i iVarB;
        H.C1230w c1230wL = f6.L();
        if (c1230wL == null || (interfaceC0900tI = c1230wL.i()) == null || (iVarB = N.z.b(interfaceC0900tI)) == null) {
            return false;
        }
        return N.z.a(iVarB, f6.G(z6));
    }
}
