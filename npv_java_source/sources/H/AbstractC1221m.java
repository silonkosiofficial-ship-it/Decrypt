package H;

/* JADX INFO: renamed from: H.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1221m {

    /* JADX INFO: renamed from: H.m$a */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f4103D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f4104E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M0.P f4105F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i6, int i10, M0.P p6) {
            super(1);
            this.f4103D = i6;
            this.f4104E = i10;
            this.f4105F = p6;
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

    /* JADX INFO: renamed from: H.m$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f4106D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f4107E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M0.P f4108F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, int i10, M0.P p6) {
            super(3);
            this.f4106D = i6;
            this.f4107E = i10;
            this.f4108F = p6;
        }

        private static final java.lang.Object e(V.G1 g6) {
            return g6.getValue();
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(408240218);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(408240218, i6, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            H.AbstractC1221m.b(this.f4106D, this.f4107E);
            if (this.f4106D == 1 && this.f4107E == Integer.MAX_VALUE) {
                androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734n.J();
                return aVar;
            }
            Y0.e eVar = (Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e());
            R0.AbstractC1494h.b bVar = (R0.AbstractC1494h.b) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.g());
            Y0.v vVar = (Y0.v) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.k());
            boolean zS = interfaceC1734n.S(this.f4108F) | interfaceC1734n.S(vVar);
            M0.P p6 = this.f4108F;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = M0.Q.d(p6, vVar);
                interfaceC1734n.K(objG);
            }
            M0.P p10 = (M0.P) objG;
            boolean zS2 = interfaceC1734n.S(bVar) | interfaceC1734n.S(p10);
            java.lang.Object objG2 = interfaceC1734n.g();
            if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                R0.AbstractC1494h abstractC1494hJ = p10.j();
                R0.q qVarO = p10.o();
                if (qVarO == null) {
                    qVarO = R0.q.f9331D.d();
                }
                R0.o oVarM = p10.m();
                int i10 = oVarM != null ? oVarM.i() : R0.o.f9321b.b();
                R0.p pVarN = p10.n();
                objG2 = bVar.a(abstractC1494hJ, qVarO, i10, pVarN != null ? pVarN.k() : R0.p.f9325b.a());
                interfaceC1734n.K(objG2);
            }
            V.G1 g6 = (V.G1) objG2;
            boolean zS3 = interfaceC1734n.S(e(g6)) | interfaceC1734n.S(eVar) | interfaceC1734n.S(bVar) | interfaceC1734n.S(this.f4108F) | interfaceC1734n.S(vVar);
            java.lang.Object objG3 = interfaceC1734n.g();
            if (zS3 || objG3 == V.InterfaceC1734n.f14931a.a()) {
                objG3 = java.lang.Integer.valueOf(Y0.t.f(H.I.a(p10, eVar, bVar, H.I.c(), 1)));
                interfaceC1734n.K(objG3);
            }
            int iIntValue = ((java.lang.Number) objG3).intValue();
            boolean zS4 = interfaceC1734n.S(vVar) | interfaceC1734n.S(eVar) | interfaceC1734n.S(bVar) | interfaceC1734n.S(this.f4108F) | interfaceC1734n.S(e(g6));
            java.lang.Object objG4 = interfaceC1734n.g();
            if (zS4 || objG4 == V.InterfaceC1734n.f14931a.a()) {
                objG4 = java.lang.Integer.valueOf(Y0.t.f(H.I.a(p10, eVar, bVar, H.I.c() + '\n' + H.I.c(), 2)));
                interfaceC1734n.K(objG4);
            }
            int iIntValue2 = ((java.lang.Number) objG4).intValue() - iIntValue;
            int i11 = this.f4106D;
            java.lang.Integer numValueOf = i11 == 1 ? null : java.lang.Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue);
            int i12 = this.f4107E;
            java.lang.Integer numValueOf2 = i12 != Integer.MAX_VALUE ? java.lang.Integer.valueOf(iIntValue + (iIntValue2 * (i12 - 1))) : null;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.p.h(androidx.compose.ui.d.f19586a, numValueOf != null ? eVar.o0(numValueOf.intValue()) : Y0.i.f16208D.c(), numValueOf2 != null ? eVar.o0(numValueOf2.intValue()) : Y0.i.f16208D.c());
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarH;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, M0.P p6, int i6, int i10) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new H.AbstractC1221m.a(i6, i10, p6) : androidx.compose.ui.platform.E0.a(), new H.AbstractC1221m.b(i6, i10, p6));
    }

    public static final void b(int i6, int i10) {
        if (i6 <= 0 || i10 <= 0) {
            throw new java.lang.IllegalArgumentException(("both minLines " + i6 + " and maxLines " + i10 + " must be greater than zero").toString());
        }
        if (i6 <= i10) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("minLines " + i6 + " must be less than or equal to maxLines " + i10).toString());
    }
}
