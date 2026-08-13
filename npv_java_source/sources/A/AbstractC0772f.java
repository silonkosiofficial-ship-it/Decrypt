package A;

/* JADX INFO: renamed from: A.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0772f {

    /* JADX INFO: renamed from: A.f$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.I f105D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.q f106E;

        /* JADX INFO: renamed from: A.f$a$a, reason: collision with other inner class name */
        static final class C0005a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.q f107D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ A.C0774h f108E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0005a(p237x7.q qVar, A.C0774h c0774h) {
                super(2);
                this.f107D = qVar;
                this.f108E = c0774h;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1945019079, i6, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f107D.j(this.f108E, interfaceC1734n, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.I i6, p237x7.q qVar) {
            super(2);
            this.f105D = i6;
            this.f106E = qVar;
        }

        public final D0.K a(D0.j0 j0Var, long j6) {
            return this.f105D.b(j0Var, j0Var.c1(p087i7.M.f46721a, p031d0.c.c(-1945019079, true, new A.AbstractC0772f.a.C0005a(this.f106E, new A.C0774h(j0Var, j6, null)))), j6);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return a((D0.j0) obj, ((Y0.C1859b) obj2).r());
        }
    }

    /* JADX INFO: renamed from: A.f$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p071h0.c f110E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f111F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.q f112G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f113H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f114I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, p071h0.c cVar, boolean z6, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f109D = dVar;
            this.f110E = cVar;
            this.f111F = z6;
            this.f112G = qVar;
            this.f113H = i6;
            this.f114I = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            A.AbstractC0772f.a(this.f109D, this.f110E, this.f111F, this.f112G, interfaceC1734n, V.S0.a(this.f113H | 1), this.f114I);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, p071h0.c cVar, boolean z6, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1781813501);
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
            i11 |= interfaceC1734nR.S(cVar) ? 32 : 16;
        }
        int i14 = i10 & 4;
        if (i14 != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.d(z6) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i11 |= interfaceC1734nR.l(qVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (i13 != 0) {
                cVar = p071h0.c.f45778a.o();
            }
            if (i14 != 0) {
                z6 = false;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1781813501, i11, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            D0.I iH = androidx.compose.foundation.layout.d.h(cVar, z6);
            boolean zS = ((i11 & 7168) == 2048) | interfaceC1734nR.S(iH);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new A.AbstractC0772f.a(iH, qVar);
                interfaceC1734nR.K(objG);
            }
            D0.g0.b(dVar, (p237x7.p) objG, interfaceC1734nR, i11 & 14, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        p071h0.c cVar2 = cVar;
        boolean z10 = z6;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new A.AbstractC0772f.b(dVar2, cVar2, z10, qVar, i6, i10));
        }
    }
}
