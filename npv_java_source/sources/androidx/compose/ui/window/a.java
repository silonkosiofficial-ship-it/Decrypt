package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.ui.window.a$a, reason: collision with other inner class name */
    static final class C0388a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.k f20568D;

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$a$a, reason: collision with other inner class name */
        public static final class C0389a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.window.k f20569a;

            public C0389a(androidx.compose.ui.window.k kVar) {
                this.f20569a = kVar;
            }

            @Override // V.M
            public void e() {
                this.f20569a.dismiss();
                this.f20569a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0388a(androidx.compose.ui.window.k kVar) {
            super(1);
            this.f20568D = kVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            this.f20568D.show();
            return new androidx.compose.ui.window.a.C0388a.C0389a(this.f20568D);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.k f20570D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f20571E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f20572F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ Y0.v f20573G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.window.k kVar, p237x7.a aVar, androidx.compose.ui.window.i iVar, Y0.v vVar) {
            super(0);
            this.f20570D = kVar;
            this.f20571E = aVar;
            this.f20572F = iVar;
            this.f20573G = vVar;
        }

        public final void a() {
            this.f20570D.q(this.f20571E, this.f20572F, this.f20573G);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f20574D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f20575E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f20576F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f20577G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f20578H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.a aVar, androidx.compose.ui.window.i iVar, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f20574D = aVar;
            this.f20575E = iVar;
            this.f20576F = pVar;
            this.f20577G = i6;
            this.f20578H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.ui.window.a.a(this.f20574D, this.f20575E, this.f20576F, interfaceC1734n, V.S0.a(this.f20577G | 1), this.f20578H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f20579D;

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$d$a, reason: collision with other inner class name */
        static final class C0390a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final androidx.compose.ui.window.a.d.C0390a f20580D = new androidx.compose.ui.window.a.d.C0390a();

            C0390a() {
                super(1);
            }

            public final void a(K0.w wVar) {
                K0.u.i(wVar);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((K0.w) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f20581D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(V.G1 g6) {
                super(2);
                this.f20581D = g6;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-533674951, i6, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                }
                androidx.compose.ui.window.a.b(this.f20581D).u(interfaceC1734n, 0);
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
        d(V.G1 g6) {
            super(2);
            this.f20579D = g6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(488261145, i6, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
            }
            androidx.compose.ui.window.a.c(K0.n.d(androidx.compose.ui.d.f19586a, false, androidx.compose.ui.window.a.d.C0390a.f20580D, 1, null), p031d0.c.e(-533674951, true, new androidx.compose.ui.window.a.d.b(this.f20579D), interfaceC1734n, 54), interfaceC1734n, 48, 0);
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

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.window.a.e f20582D = new androidx.compose.ui.window.a.e();

        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.UUID b() {
            return java.util.UUID.randomUUID();
        }
    }

    static final class f implements D0.I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.compose.ui.window.a.f f20583a = new androidx.compose.ui.window.a.f();

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$f$a, reason: collision with other inner class name */
        static final class C0391a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.util.List f20584D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0391a(java.util.List list) {
                super(1);
                this.f20584D = list;
            }

            public final void a(D0.X.a aVar) {
                java.util.List list = this.f20584D;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    D0.X.a.l(aVar, (D0.X) list.get(i6), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        f() {
        }

        @Override // D0.I
        public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.b(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public final D0.K b(D0.M m6, java.util.List list, long j6) {
            java.lang.Object obj;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(((D0.G) list.get(i6)).U(j6));
            }
            java.lang.Object obj2 = null;
            int i10 = 1;
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(0);
                int iI0 = ((D0.X) obj).I0();
                int iO = p097j7.AbstractC6879v.o(arrayList);
                if (1 <= iO) {
                    int i11 = 1;
                    while (true) {
                        java.lang.Object obj3 = arrayList.get(i11);
                        int iI1 = ((D0.X) obj3).I0();
                        if (iI0 < iI1) {
                            obj = obj3;
                            iI0 = iI1;
                        }
                        if (i11 == iO) {
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                obj = null;
            }
            D0.X x6 = (D0.X) obj;
            int iI2 = x6 != null ? x6.I0() : Y0.C1859b.n(j6);
            if (!arrayList.isEmpty()) {
                java.lang.Object obj4 = arrayList.get(0);
                int iW0 = ((D0.X) obj4).w0();
                int iO2 = p097j7.AbstractC6879v.o(arrayList);
                if (1 <= iO2) {
                    while (true) {
                        java.lang.Object obj5 = arrayList.get(i10);
                        int iW1 = ((D0.X) obj5).w0();
                        if (iW0 < iW1) {
                            obj4 = obj5;
                            iW0 = iW1;
                        }
                        if (i10 == iO2) {
                            break;
                        }
                        i10++;
                    }
                }
                obj2 = obj4;
            }
            D0.X x10 = (D0.X) obj2;
            return D0.L.b(m6, iI2, x10 != null ? x10.w0() : Y0.C1859b.m(j6), null, new androidx.compose.ui.window.a.f.C0391a(arrayList), 4, null);
        }

        @Override // D0.I
        public /* synthetic */ int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.d(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public /* synthetic */ int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.c(this, interfaceC0896o, list, i6);
        }

        @Override // D0.I
        public /* synthetic */ int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return D0.H.a(this, interfaceC0896o, list, i6);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f20585D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f20586E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f20587F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f20588G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.d dVar, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f20585D = dVar;
            this.f20586E = pVar;
            this.f20587F = i6;
            this.f20588G = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.ui.window.a.c(this.f20585D, this.f20586E, interfaceC1734n, V.S0.a(this.f20587F | 1), this.f20588G);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(p237x7.a aVar, androidx.compose.ui.window.i iVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.window.i iVar2;
        int i12;
        android.view.View view;
        Y0.e eVar;
        Y0.v vVar;
        V.AbstractC1744s abstractC1744sD;
        V.G1 g1N;
        java.util.UUID uuid;
        boolean zS;
        java.lang.Object obj;
        V.InterfaceC1734n interfaceC1734n2;
        androidx.compose.ui.window.k kVar;
        boolean zL;
        java.lang.Object objG;
        boolean z6;
        boolean zS2;
        java.lang.Object objG2;
        androidx.compose.ui.window.i iVar3;
        androidx.compose.ui.window.i iVar4;
        V.InterfaceC1734n interfaceC1734n3;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-2032877254);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(aVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i13 = i10 & 2;
        if (i13 == 0) {
            if ((i6 & 48) == 0) {
                iVar2 = iVar;
                i11 |= interfaceC1734nR.S(iVar2) ? 32 : 16;
            }
            if ((i10 & 4) != 0) {
                i11 |= 384;
            } else if ((i6 & 384) == 0) {
                if (interfaceC1734nR.l(pVar)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i11 |= i12;
            }
            if ((i11 & 147) == 146 || !interfaceC1734nR.u()) {
                if (i13 != 0) {
                    iVar2 = new androidx.compose.ui.window.i(false, false, false, 7, (p247y7.AbstractC7342k) null);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-2032877254, i11, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
                }
                view = (android.view.View) interfaceC1734nR.n(androidx.compose.ui.platform.T.i());
                eVar = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
                vVar = (Y0.v) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.k());
                abstractC1744sD = V.AbstractC1725k.d(interfaceC1734nR, 0);
                g1N = V.v1.n(pVar, interfaceC1734nR, (i11 >> 6) & 14);
                uuid = (java.util.UUID) p041e0.b.e(new java.lang.Object[0], null, null, androidx.compose.ui.window.a.e.f20582D, interfaceC1734nR, 3072, 6);
                zS = interfaceC1734nR.S(view) | interfaceC1734nR.S(eVar);
                java.lang.Object objG3 = interfaceC1734nR.g();
                if (!zS || objG3 == V.InterfaceC1734n.f14931a.a()) {
                    V.InterfaceC1734n interfaceC1734n4 = interfaceC1734nR;
                    androidx.compose.ui.window.k kVar2 = new androidx.compose.ui.window.k(aVar, iVar2, view, vVar, eVar, uuid);
                    kVar2.l(abstractC1744sD, p031d0.c.c(488261145, true, new androidx.compose.ui.window.a.d(g1N)));
                    interfaceC1734n4.K(kVar2);
                    interfaceC1734n2 = interfaceC1734n4;
                    obj = kVar2;
                } else {
                    interfaceC1734n2 = interfaceC1734nR;
                    obj = objG3;
                }
                kVar = (androidx.compose.ui.window.k) obj;
                zL = interfaceC1734n2.l(kVar);
                objG = interfaceC1734n2.g();
                if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = new androidx.compose.ui.window.a.C0388a(kVar);
                    interfaceC1734n2.K(objG);
                }
                V.Q.b(kVar, (p237x7.l) objG, interfaceC1734n2, 0);
                boolean zL2 = interfaceC1734n2.l(kVar);
                if ((i11 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zS2 = zL2 | z6 | ((i11 & 112) == 32) | interfaceC1734n2.S(vVar);
                objG2 = interfaceC1734n2.g();
                if (!zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                    iVar3 = iVar2;
                    objG2 = new androidx.compose.ui.window.a.b(kVar, aVar, iVar3, vVar);
                    interfaceC1734n2.K(objG2);
                } else {
                    iVar3 = iVar2;
                }
                V.Q.f((p237x7.a) objG2, interfaceC1734n2, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                iVar4 = iVar3;
                interfaceC1734n3 = interfaceC1734n2;
            } else {
                interfaceC1734nR.A();
                iVar4 = iVar2;
                interfaceC1734n3 = interfaceC1734nR;
            }
            interfaceC1709e1X = interfaceC1734n3.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new androidx.compose.ui.window.a.c(aVar, iVar4, pVar, i6, i10));
            }
        }
        i11 |= 48;
        iVar2 = iVar;
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            if (interfaceC1734nR.l(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146) {
            if (i13 != 0) {
                iVar2 = new androidx.compose.ui.window.i(false, false, false, 7, (p247y7.AbstractC7342k) null);
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2032877254, i11, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
            }
            view = (android.view.View) interfaceC1734nR.n(androidx.compose.ui.platform.T.i());
            eVar = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
            vVar = (Y0.v) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.k());
            abstractC1744sD = V.AbstractC1725k.d(interfaceC1734nR, 0);
            g1N = V.v1.n(pVar, interfaceC1734nR, (i11 >> 6) & 14);
            uuid = (java.util.UUID) p041e0.b.e(new java.lang.Object[0], null, null, androidx.compose.ui.window.a.e.f20582D, interfaceC1734nR, 3072, 6);
            zS = interfaceC1734nR.S(view) | interfaceC1734nR.S(eVar);
            java.lang.Object objG4 = interfaceC1734nR.g();
            if (zS) {
                V.InterfaceC1734n interfaceC1734n5 = interfaceC1734nR;
                androidx.compose.ui.window.k kVar3 = new androidx.compose.ui.window.k(aVar, iVar2, view, vVar, eVar, uuid);
                kVar3.l(abstractC1744sD, p031d0.c.c(488261145, true, new androidx.compose.ui.window.a.d(g1N)));
                interfaceC1734n5.K(kVar3);
                interfaceC1734n2 = interfaceC1734n5;
                obj = kVar3;
            } else {
                V.InterfaceC1734n interfaceC1734n6 = interfaceC1734nR;
                androidx.compose.ui.window.k kVar4 = new androidx.compose.ui.window.k(aVar, iVar2, view, vVar, eVar, uuid);
                kVar4.l(abstractC1744sD, p031d0.c.c(488261145, true, new androidx.compose.ui.window.a.d(g1N)));
                interfaceC1734n6.K(kVar4);
                interfaceC1734n2 = interfaceC1734n6;
                obj = kVar4;
            }
            kVar = (androidx.compose.ui.window.k) obj;
            zL = interfaceC1734n2.l(kVar);
            objG = interfaceC1734n2.g();
            if (zL) {
                objG = new androidx.compose.ui.window.a.C0388a(kVar);
                interfaceC1734n2.K(objG);
            } else {
                objG = new androidx.compose.ui.window.a.C0388a(kVar);
                interfaceC1734n2.K(objG);
            }
            V.Q.b(kVar, (p237x7.l) objG, interfaceC1734n2, 0);
            boolean zL3 = interfaceC1734n2.l(kVar);
            if ((i11 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            zS2 = zL3 | z6 | ((i11 & 112) == 32) | interfaceC1734n2.S(vVar);
            objG2 = interfaceC1734n2.g();
            if (zS2) {
                iVar3 = iVar2;
                objG2 = new androidx.compose.ui.window.a.b(kVar, aVar, iVar3, vVar);
                interfaceC1734n2.K(objG2);
            } else {
                iVar3 = iVar2;
                objG2 = new androidx.compose.ui.window.a.b(kVar, aVar, iVar3, vVar);
                interfaceC1734n2.K(objG2);
            }
            V.Q.f((p237x7.a) objG2, interfaceC1734n2, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            iVar4 = iVar3;
            interfaceC1734n3 = interfaceC1734n2;
        } else {
            if (i13 != 0) {
                iVar2 = new androidx.compose.ui.window.i(false, false, false, 7, (p247y7.AbstractC7342k) null);
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2032877254, i11, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
            }
            view = (android.view.View) interfaceC1734nR.n(androidx.compose.ui.platform.T.i());
            eVar = (Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e());
            vVar = (Y0.v) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.k());
            abstractC1744sD = V.AbstractC1725k.d(interfaceC1734nR, 0);
            g1N = V.v1.n(pVar, interfaceC1734nR, (i11 >> 6) & 14);
            uuid = (java.util.UUID) p041e0.b.e(new java.lang.Object[0], null, null, androidx.compose.ui.window.a.e.f20582D, interfaceC1734nR, 3072, 6);
            zS = interfaceC1734nR.S(view) | interfaceC1734nR.S(eVar);
            java.lang.Object objG5 = interfaceC1734nR.g();
            if (zS) {
                V.InterfaceC1734n interfaceC1734n7 = interfaceC1734nR;
                androidx.compose.ui.window.k kVar5 = new androidx.compose.ui.window.k(aVar, iVar2, view, vVar, eVar, uuid);
                kVar5.l(abstractC1744sD, p031d0.c.c(488261145, true, new androidx.compose.ui.window.a.d(g1N)));
                interfaceC1734n7.K(kVar5);
                interfaceC1734n2 = interfaceC1734n7;
                obj = kVar5;
            } else {
                V.InterfaceC1734n interfaceC1734n8 = interfaceC1734nR;
                androidx.compose.ui.window.k kVar6 = new androidx.compose.ui.window.k(aVar, iVar2, view, vVar, eVar, uuid);
                kVar6.l(abstractC1744sD, p031d0.c.c(488261145, true, new androidx.compose.ui.window.a.d(g1N)));
                interfaceC1734n8.K(kVar6);
                interfaceC1734n2 = interfaceC1734n8;
                obj = kVar6;
            }
            kVar = (androidx.compose.ui.window.k) obj;
            zL = interfaceC1734n2.l(kVar);
            objG = interfaceC1734n2.g();
            if (zL) {
                objG = new androidx.compose.ui.window.a.C0388a(kVar);
                interfaceC1734n2.K(objG);
            } else {
                objG = new androidx.compose.ui.window.a.C0388a(kVar);
                interfaceC1734n2.K(objG);
            }
            V.Q.b(kVar, (p237x7.l) objG, interfaceC1734n2, 0);
            boolean zL4 = interfaceC1734n2.l(kVar);
            if ((i11 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            zS2 = zL4 | z6 | ((i11 & 112) == 32) | interfaceC1734n2.S(vVar);
            objG2 = interfaceC1734n2.g();
            if (zS2) {
                iVar3 = iVar2;
                objG2 = new androidx.compose.ui.window.a.b(kVar, aVar, iVar3, vVar);
                interfaceC1734n2.K(objG2);
            } else {
                iVar3 = iVar2;
                objG2 = new androidx.compose.ui.window.a.b(kVar, aVar, iVar3, vVar);
                interfaceC1734n2.K(objG2);
            }
            V.Q.f((p237x7.a) objG2, interfaceC1734n2, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            iVar4 = iVar3;
            interfaceC1734n3 = interfaceC1734n2;
        }
        interfaceC1709e1X = interfaceC1734n3.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.ui.window.a.c(aVar, iVar4, pVar, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.p b(V.G1 g6) {
        return (p237x7.p) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.d dVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1177876616);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1177876616, i11, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            androidx.compose.ui.window.a.f fVar = androidx.compose.ui.window.a.f.f20583a;
            int i13 = ((i11 >> 3) & 14) | 384 | ((i11 << 3) & 112);
            int iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar);
            F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar.a();
            int i14 = ((i13 << 6) & 896) | 6;
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, fVar, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            pVar.u(interfaceC1734nR, java.lang.Integer.valueOf((i14 >> 6) & 14));
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.ui.window.a.g(dVar, pVar, i6, i10));
        }
    }
}
