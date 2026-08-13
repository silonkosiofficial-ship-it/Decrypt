package p190t;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54504D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54505E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p200u.I f54506F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.lang.String f54507G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54508H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f54509I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f54510J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.Object obj, androidx.compose.ui.d dVar, p200u.I i6, java.lang.String str, p237x7.q qVar, int i10, int i11) {
            super(2);
            this.f54504D = obj;
            this.f54505E = dVar;
            this.f54506F = i6;
            this.f54507G = str;
            this.f54508H = qVar;
            this.f54509I = i10;
            this.f54510J = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.l.a(this.f54504D, this.f54505E, this.f54506F, this.f54507G, this.f54508H, interfaceC1734n, V.S0.a(this.f54509I | 1), this.f54510J);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final t.l.b f54511D = new t.l.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return obj;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54512D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p200u.s0 s0Var) {
            super(1);
            this.f54512D = s0Var;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(!p247y7.AbstractC7350t.b(obj, this.f54512D.p()));
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54513D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p200u.I f54514E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54515F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54516G;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f54517D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(1);
                this.f54517D = g6;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.b(t.l.d.f(this.f54517D));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p200u.I f54518D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p200u.I i6) {
                super(3);
                this.f54518D = i6;
            }

            public final p200u.I a(u.s0.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
                interfaceC1734n.T(438406499);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(438406499, i6, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
                }
                p200u.I i10 = this.f54518D;
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734n.J();
                return i10;
            }

            @Override // p237x7.q
            public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return a((u.s0.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p200u.s0 s0Var, p200u.I i6, java.lang.Object obj, p237x7.q qVar) {
            super(2);
            this.f54513D = s0Var;
            this.f54514E = i6;
            this.f54515F = obj;
            this.f54516G = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(V.G1 g6) {
            return ((java.lang.Number) g6.getValue()).floatValue();
        }

        public final void e(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1426421288, i6, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            p200u.s0 s0Var = this.f54513D;
            t.l.d.b bVar = new t.l.d.b(this.f54514E);
            java.lang.Object obj = this.f54515F;
            p200u.x0 x0VarI = p200u.z0.i(p247y7.C7344m.f57303a);
            java.lang.Object objI = s0Var.i();
            interfaceC1734n.T(-438678252);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f6 = p247y7.AbstractC7350t.b(objI, obj) ? 1.0f : 0.0f;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            java.lang.Float fValueOf = java.lang.Float.valueOf(f6);
            java.lang.Object objP = s0Var.p();
            interfaceC1734n.T(-438678252);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f10 = p247y7.AbstractC7350t.b(objP, obj) ? 1.0f : 0.0f;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            V.G1 g1D = p200u.u0.d(s0Var, fValueOf, java.lang.Float.valueOf(f10), (p200u.I) bVar.j(s0Var.n(), interfaceC1734n, 0), x0VarI, "FloatAnimation", interfaceC1734n, 0);
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zS = interfaceC1734n.S(g1D);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new t.l.d.a(g1D);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(aVar, (p237x7.l) objG);
            p237x7.q qVar = this.f54516G;
            java.lang.Object obj2 = this.f54515F;
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarA);
            F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
            p237x7.a aVarA = aVar2.a();
            if (!(interfaceC1734n.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734n.t();
            if (interfaceC1734n.o()) {
                interfaceC1734n.B(aVarA);
            } else {
                interfaceC1734n.H();
            }
            V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734n);
            V.L1.c(interfaceC1734nA, iH, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
            p237x7.p pVarB = aVar2.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            qVar.j(obj2, interfaceC1734n, 0);
            interfaceC1734n.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            e((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54519D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54520E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p200u.I f54521F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f54522G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54523H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f54524I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f54525J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p200u.s0 s0Var, androidx.compose.ui.d dVar, p200u.I i6, p237x7.l lVar, p237x7.q qVar, int i10, int i11) {
            super(2);
            this.f54519D = s0Var;
            this.f54520E = dVar;
            this.f54521F = i6;
            this.f54522G = lVar;
            this.f54523H = qVar;
            this.f54524I = i10;
            this.f54525J = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.l.b(this.f54519D, this.f54520E, this.f54521F, this.f54522G, this.f54523H, interfaceC1734n, V.S0.a(this.f54524I | 1), this.f54525J);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void a(java.lang.Object obj, androidx.compose.ui.d dVar, p200u.I i6, java.lang.String str, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        p200u.I i14;
        int i15;
        int i16;
        java.lang.String str2;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        p200u.I iL;
        java.lang.String str3;
        p200u.I i19;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-310686752);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? interfaceC1734nR.S(obj) : interfaceC1734nR.l(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= interfaceC1734nR.S(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    i14 = i6;
                    if (interfaceC1734nR.l(i14)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 8;
                if (i16 != 0) {
                    if ((i10 & 3072) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362 || !interfaceC1734nR.u()) {
                        if (i20 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i13 != 0) {
                            iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                        } else {
                            iL = i14;
                        }
                        if (i16 != 0) {
                            str3 = "Crossfade";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        int i21 = i12 & 58352;
                        java.lang.String str4 = str3;
                        b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i21, 4);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        str2 = str4;
                        i19 = iL;
                    } else {
                        interfaceC1734nR.A();
                        dVar3 = dVar2;
                        i19 = i14;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
                    }
                }
                i12 |= 3072;
                str2 = str;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    } else {
                        iL = i14;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    int i22 = i12 & 58352;
                    java.lang.String str5 = str3;
                    b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i22, 4);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    str2 = str5;
                    i19 = iL;
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    } else {
                        iL = i14;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    int i23 = i12 & 58352;
                    java.lang.String str6 = str3;
                    b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i23, 4);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    str2 = str6;
                    i19 = iL;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
                }
            }
            i12 |= 384;
            i14 = i6;
            i16 = i11 & 8;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i12 |= i17;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    } else {
                        iL = i14;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    int i24 = i12 & 58352;
                    java.lang.String str7 = str3;
                    b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i24, 4);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    str2 = str7;
                    i19 = iL;
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    } else {
                        iL = i14;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    int i25 = i12 & 58352;
                    java.lang.String str8 = str3;
                    b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i25, 4);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    str2 = str8;
                    i19 = iL;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
                }
            }
            i12 |= 3072;
            str2 = str;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                } else {
                    iL = i14;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                int i26 = i12 & 58352;
                java.lang.String str9 = str3;
                b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i26, 4);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                str2 = str9;
                i19 = iL;
            } else {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                } else {
                    iL = i14;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                int i27 = i12 & 58352;
                java.lang.String str10 = str3;
                b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i27, 4);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                str2 = str10;
                i19 = iL;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
            }
        }
        i12 |= 48;
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                i14 = i6;
                if (interfaceC1734nR.l(i14)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            }
            i16 = i11 & 8;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i12 |= i17;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    } else {
                        iL = i14;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    int i28 = i12 & 58352;
                    java.lang.String str11 = str3;
                    b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i28, 4);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    str2 = str11;
                    i19 = iL;
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    } else {
                        iL = i14;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    int i29 = i12 & 58352;
                    java.lang.String str12 = str3;
                    b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i29, 4);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    str2 = str12;
                    i19 = iL;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
                }
            }
            i12 |= 3072;
            str2 = str;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                } else {
                    iL = i14;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                int i210 = i12 & 58352;
                java.lang.String str13 = str3;
                b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i210, 4);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                str2 = str13;
                i19 = iL;
            } else {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                } else {
                    iL = i14;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                int i211 = i12 & 58352;
                java.lang.String str14 = str3;
                b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i211, 4);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                str2 = str14;
                i19 = iL;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
            }
        }
        i12 |= 384;
        i14 = i6;
        i16 = i11 & 8;
        if (i16 != 0) {
            if ((i10 & 3072) == 0) {
                str2 = str;
                if (interfaceC1734nR.S(str2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i12 |= i17;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                } else {
                    iL = i14;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                int i212 = i12 & 58352;
                java.lang.String str15 = str3;
                b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i212, 4);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                str2 = str15;
                i19 = iL;
            } else {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                } else {
                    iL = i14;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                int i213 = i12 & 58352;
                java.lang.String str16 = str3;
                b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i213, 4);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                str2 = str16;
                i19 = iL;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
            }
        }
        i12 |= 3072;
        str2 = str;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i12 |= i18;
        }
        if ((i12 & 9363) == 9362) {
            if (i20 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i13 != 0) {
                iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
            } else {
                iL = i14;
            }
            if (i16 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            int i214 = i12 & 58352;
            java.lang.String str17 = str3;
            b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i214, 4);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            str2 = str17;
            i19 = iL;
        } else {
            if (i20 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i13 != 0) {
                iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
            } else {
                iL = i14;
            }
            if (i16 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            int i215 = i12 & 58352;
            java.lang.String str18 = str3;
            b(p200u.u0.g(obj, str3, interfaceC1734nR, (i12 & 14) | ((i12 >> 6) & 112), 0), dVar3, iL, null, qVar, interfaceC1734nR, i215, 4);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            str2 = str18;
            i19 = iL;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.l.a(obj, dVar3, i19, str2, qVar, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:103:0x0169  */
    /* JADX WARN: Code duplicated, block: B:106:0x017a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0192 A[LOOP:0: B:104:0x0174->B:109:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0198  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b1 A[LOOP:1: B:115:0x01af->B:116:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:124:0x0205  */
    /* JADX WARN: Code duplicated, block: B:125:0x0209  */
    /* JADX WARN: Code duplicated, block: B:128:0x0228  */
    /* JADX WARN: Code duplicated, block: B:130:0x0236  */
    /* JADX WARN: Code duplicated, block: B:133:0x025a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0270  */
    /* JADX WARN: Code duplicated, block: B:136:0x027b  */
    /* JADX WARN: Code duplicated, block: B:140:0x029e  */
    /* JADX WARN: Code duplicated, block: B:144:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:146:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0143  */
    public static final void b(p200u.s0 s0Var, androidx.compose.ui.d dVar, p200u.I i6, p237x7.l lVar, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        p200u.I iL;
        int i14;
        int i15;
        p237x7.l lVar2;
        int i16;
        int i17;
        androidx.compose.ui.d dVar3;
        java.lang.Object objG;
        V.InterfaceC1734n.a aVar;
        java.lang.Object obj;
        p051f0.r rVar;
        java.lang.Object objG2;
        p170r.K k6;
        int iA;
        p237x7.a aVarA;
        V.InterfaceC1734n interfaceC1734nA;
        p237x7.p pVarB;
        int size;
        int i18;
        androidx.compose.ui.d dVar4;
        p237x7.p pVar;
        java.util.Iterator it;
        int i19;
        int i20;
        int size2;
        int i21;
        boolean z6;
        java.lang.Object objG3;
        p200u.I i22;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(679005231);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1734nR.S(s0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 1;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= interfaceC1734nR.S(dVar2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    iL = i6;
                    if (interfaceC1734nR.l(iL)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 4;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        lVar2 = lVar;
                        if (interfaceC1734nR.l(lVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 8) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) == 9362 || !interfaceC1734nR.u()) {
                        if (i23 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i13 != 0) {
                            iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                        }
                        if (i15 != 0) {
                            lVar2 = t.l.b.f54511D;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                        }
                        objG = interfaceC1734nR.g();
                        aVar = V.InterfaceC1734n.f14931a;
                        obj = objG;
                        if (objG == aVar.a()) {
                            p051f0.r rVarF = V.v1.f();
                            rVarF.add(s0Var.i());
                            interfaceC1734nR.K(rVarF);
                            obj = rVarF;
                        }
                        rVar = (p051f0.r) obj;
                        objG2 = interfaceC1734nR.g();
                        if (objG2 == aVar.a()) {
                            objG2 = p170r.V.d();
                            interfaceC1734nR.K(objG2);
                        }
                        k6 = (p170r.K) objG2;
                        if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                            interfaceC1734nR.T(860660313);
                            if (rVar.size() == 1 || !p247y7.AbstractC7350t.b(rVar.get(0), s0Var.p())) {
                                interfaceC1734nR.T(860794667);
                                if ((i12 & 14) == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objG3 = interfaceC1734nR.g();
                                if (z6 || objG3 == aVar.a()) {
                                    objG3 = new t.l.c(s0Var);
                                    interfaceC1734nR.K(objG3);
                                }
                                p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                                k6.i();
                            } else {
                                interfaceC1734nR.T(860984945);
                            }
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(860990897);
                        }
                        interfaceC1734nR.J();
                        if (k6.a(s0Var.p())) {
                            interfaceC1734nR.T(861812273);
                        } else {
                            interfaceC1734nR.T(861052122);
                            it = rVar.iterator();
                            i19 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i20 = -1;
                                    i19 = -1;
                                    break;
                                } else {
                                    if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                        i20 = -1;
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            if (i19 == i20) {
                                rVar.add(s0Var.p());
                            } else {
                                rVar.set(i19, s0Var.p());
                            }
                            k6.i();
                            size2 = rVar.size();
                            for (i21 = 0; i21 < size2; i21++) {
                                java.lang.Object obj2 = rVar.get(i21);
                                k6.s(obj2, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj2, qVar), interfaceC1734nR, 54));
                            }
                        }
                        interfaceC1734nR.J();
                        D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                        iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                        V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
                        androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                        F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
                        aVarA = aVar2.a();
                        if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                            V.AbstractC1725k.c();
                        }
                        interfaceC1734nR.t();
                        if (interfaceC1734nR.o()) {
                            interfaceC1734nR.B(aVarA);
                        } else {
                            interfaceC1734nR.H();
                        }
                        interfaceC1734nA = V.L1.a(interfaceC1734nR);
                        V.L1.c(interfaceC1734nA, iH, aVar2.c());
                        V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
                        pVarB = aVar2.b();
                        if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                            interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                            interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                        }
                        V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
                        androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
                        interfaceC1734nR.T(-187482432);
                        size = rVar.size();
                        for (i18 = 0; i18 < size; i18++) {
                            java.lang.Object obj3 = rVar.get(i18);
                            interfaceC1734nR.s(-1081873445, lVar2.l(obj3));
                            pVar = (p237x7.p) k6.c(obj3);
                            if (pVar == null) {
                                interfaceC1734nR.T(821713034);
                                interfaceC1734nR.J();
                            } else {
                                interfaceC1734nR.T(-1081871785);
                                pVar.u(interfaceC1734nR, 0);
                                interfaceC1734nR.J();
                            }
                            interfaceC1734nR.N();
                        }
                        interfaceC1734nR.J();
                        interfaceC1734nR.Q();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                    } else {
                        interfaceC1734nR.A();
                        dVar4 = dVar2;
                    }
                    i22 = iL;
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
                    }
                }
                i12 |= 3072;
                lVar2 = lVar;
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) == 9362) {
                    if (i23 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        lVar2 = t.l.b.f54511D;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objG = interfaceC1734nR.g();
                    aVar = V.InterfaceC1734n.f14931a;
                    obj = objG;
                    if (objG == aVar.a()) {
                        p051f0.r rVarF2 = V.v1.f();
                        rVarF2.add(s0Var.i());
                        interfaceC1734nR.K(rVarF2);
                        obj = rVarF2;
                    }
                    rVar = (p051f0.r) obj;
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar.a()) {
                        objG2 = p170r.V.d();
                        interfaceC1734nR.K(objG2);
                    }
                    k6 = (p170r.K) objG2;
                    if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                        interfaceC1734nR.T(860660313);
                        if (rVar.size() == 1) {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        } else {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        }
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(860990897);
                    }
                    interfaceC1734nR.J();
                    if (k6.a(s0Var.p())) {
                        interfaceC1734nR.T(861052122);
                        it = rVar.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i20 = -1;
                                i19 = -1;
                                break;
                            } else {
                                if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                    i20 = -1;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == i20) {
                            rVar.add(s0Var.p());
                        } else {
                            rVar.set(i19, s0Var.p());
                        }
                        k6.i();
                        size2 = rVar.size();
                        while (i21 < size2) {
                            java.lang.Object obj4 = rVar.get(i21);
                            k6.s(obj4, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj4, qVar), interfaceC1734nR, 54));
                        }
                    } else {
                        interfaceC1734nR.T(861812273);
                    }
                    interfaceC1734nR.J();
                    D0.I iH2 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF2 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                    F0.InterfaceC0919g.a aVar3 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar3.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH2, aVar3.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF2, aVar3.e());
                    pVarB = aVar3.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE2, aVar3.d());
                    androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f19260a;
                    interfaceC1734nR.T(-187482432);
                    size = rVar.size();
                    while (i18 < size) {
                        java.lang.Object obj5 = rVar.get(i18);
                        interfaceC1734nR.s(-1081873445, lVar2.l(obj5));
                        pVar = (p237x7.p) k6.c(obj5);
                        if (pVar == null) {
                            interfaceC1734nR.T(821713034);
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(-1081871785);
                            pVar.u(interfaceC1734nR, 0);
                            interfaceC1734nR.J();
                        }
                        interfaceC1734nR.N();
                    }
                    interfaceC1734nR.J();
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                } else {
                    if (i23 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        lVar2 = t.l.b.f54511D;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objG = interfaceC1734nR.g();
                    aVar = V.InterfaceC1734n.f14931a;
                    obj = objG;
                    if (objG == aVar.a()) {
                        p051f0.r rVarF3 = V.v1.f();
                        rVarF3.add(s0Var.i());
                        interfaceC1734nR.K(rVarF3);
                        obj = rVarF3;
                    }
                    rVar = (p051f0.r) obj;
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar.a()) {
                        objG2 = p170r.V.d();
                        interfaceC1734nR.K(objG2);
                    }
                    k6 = (p170r.K) objG2;
                    if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                        interfaceC1734nR.T(860660313);
                        if (rVar.size() == 1) {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        } else {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        }
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(860990897);
                    }
                    interfaceC1734nR.J();
                    if (k6.a(s0Var.p())) {
                        interfaceC1734nR.T(861052122);
                        it = rVar.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i20 = -1;
                                i19 = -1;
                                break;
                            } else {
                                if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                    i20 = -1;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == i20) {
                            rVar.add(s0Var.p());
                        } else {
                            rVar.set(i19, s0Var.p());
                        }
                        k6.i();
                        size2 = rVar.size();
                        while (i21 < size2) {
                            java.lang.Object obj6 = rVar.get(i21);
                            k6.s(obj6, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj6, qVar), interfaceC1734nR, 54));
                        }
                    } else {
                        interfaceC1734nR.T(861812273);
                    }
                    interfaceC1734nR.J();
                    D0.I iH3 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF3 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                    F0.InterfaceC0919g.a aVar4 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar4.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH3, aVar4.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF3, aVar4.e());
                    pVarB = aVar4.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE3, aVar4.d());
                    androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.f.f19260a;
                    interfaceC1734nR.T(-187482432);
                    size = rVar.size();
                    while (i18 < size) {
                        java.lang.Object obj7 = rVar.get(i18);
                        interfaceC1734nR.s(-1081873445, lVar2.l(obj7));
                        pVar = (p237x7.p) k6.c(obj7);
                        if (pVar == null) {
                            interfaceC1734nR.T(821713034);
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(-1081871785);
                            pVar.u(interfaceC1734nR, 0);
                            interfaceC1734nR.J();
                        }
                        interfaceC1734nR.N();
                    }
                    interfaceC1734nR.J();
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                }
                i22 = iL;
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
                }
            }
            i12 |= 384;
            iL = i6;
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    lVar2 = lVar;
                    if (interfaceC1734nR.l(lVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) == 9362) {
                    if (i23 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        lVar2 = t.l.b.f54511D;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objG = interfaceC1734nR.g();
                    aVar = V.InterfaceC1734n.f14931a;
                    obj = objG;
                    if (objG == aVar.a()) {
                        p051f0.r rVarF4 = V.v1.f();
                        rVarF4.add(s0Var.i());
                        interfaceC1734nR.K(rVarF4);
                        obj = rVarF4;
                    }
                    rVar = (p051f0.r) obj;
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar.a()) {
                        objG2 = p170r.V.d();
                        interfaceC1734nR.K(objG2);
                    }
                    k6 = (p170r.K) objG2;
                    if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                        interfaceC1734nR.T(860660313);
                        if (rVar.size() == 1) {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        } else {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        }
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(860990897);
                    }
                    interfaceC1734nR.J();
                    if (k6.a(s0Var.p())) {
                        interfaceC1734nR.T(861052122);
                        it = rVar.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i20 = -1;
                                i19 = -1;
                                break;
                            } else {
                                if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                    i20 = -1;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == i20) {
                            rVar.add(s0Var.p());
                        } else {
                            rVar.set(i19, s0Var.p());
                        }
                        k6.i();
                        size2 = rVar.size();
                        while (i21 < size2) {
                            java.lang.Object obj8 = rVar.get(i21);
                            k6.s(obj8, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj8, qVar), interfaceC1734nR, 54));
                        }
                    } else {
                        interfaceC1734nR.T(861812273);
                    }
                    interfaceC1734nR.J();
                    D0.I iH4 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF4 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                    F0.InterfaceC0919g.a aVar5 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar5.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH4, aVar5.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF4, aVar5.e());
                    pVarB = aVar5.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE4, aVar5.d());
                    androidx.compose.foundation.layout.f fVar4 = androidx.compose.foundation.layout.f.f19260a;
                    interfaceC1734nR.T(-187482432);
                    size = rVar.size();
                    while (i18 < size) {
                        java.lang.Object obj9 = rVar.get(i18);
                        interfaceC1734nR.s(-1081873445, lVar2.l(obj9));
                        pVar = (p237x7.p) k6.c(obj9);
                        if (pVar == null) {
                            interfaceC1734nR.T(821713034);
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(-1081871785);
                            pVar.u(interfaceC1734nR, 0);
                            interfaceC1734nR.J();
                        }
                        interfaceC1734nR.N();
                    }
                    interfaceC1734nR.J();
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                } else {
                    if (i23 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        lVar2 = t.l.b.f54511D;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objG = interfaceC1734nR.g();
                    aVar = V.InterfaceC1734n.f14931a;
                    obj = objG;
                    if (objG == aVar.a()) {
                        p051f0.r rVarF5 = V.v1.f();
                        rVarF5.add(s0Var.i());
                        interfaceC1734nR.K(rVarF5);
                        obj = rVarF5;
                    }
                    rVar = (p051f0.r) obj;
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar.a()) {
                        objG2 = p170r.V.d();
                        interfaceC1734nR.K(objG2);
                    }
                    k6 = (p170r.K) objG2;
                    if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                        interfaceC1734nR.T(860660313);
                        if (rVar.size() == 1) {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        } else {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        }
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(860990897);
                    }
                    interfaceC1734nR.J();
                    if (k6.a(s0Var.p())) {
                        interfaceC1734nR.T(861052122);
                        it = rVar.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i20 = -1;
                                i19 = -1;
                                break;
                            } else {
                                if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                    i20 = -1;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == i20) {
                            rVar.add(s0Var.p());
                        } else {
                            rVar.set(i19, s0Var.p());
                        }
                        k6.i();
                        size2 = rVar.size();
                        while (i21 < size2) {
                            java.lang.Object obj10 = rVar.get(i21);
                            k6.s(obj10, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj10, qVar), interfaceC1734nR, 54));
                        }
                    } else {
                        interfaceC1734nR.T(861812273);
                    }
                    interfaceC1734nR.J();
                    D0.I iH5 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF5 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                    F0.InterfaceC0919g.a aVar6 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar6.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH5, aVar6.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF5, aVar6.e());
                    pVarB = aVar6.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE5, aVar6.d());
                    androidx.compose.foundation.layout.f fVar5 = androidx.compose.foundation.layout.f.f19260a;
                    interfaceC1734nR.T(-187482432);
                    size = rVar.size();
                    while (i18 < size) {
                        java.lang.Object obj11 = rVar.get(i18);
                        interfaceC1734nR.s(-1081873445, lVar2.l(obj11));
                        pVar = (p237x7.p) k6.c(obj11);
                        if (pVar == null) {
                            interfaceC1734nR.T(821713034);
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(-1081871785);
                            pVar.u(interfaceC1734nR, 0);
                            interfaceC1734nR.J();
                        }
                        interfaceC1734nR.N();
                    }
                    interfaceC1734nR.J();
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                }
                i22 = iL;
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
                }
            }
            i12 |= 3072;
            lVar2 = lVar;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) == 9362) {
                if (i23 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    lVar2 = t.l.b.f54511D;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objG = interfaceC1734nR.g();
                aVar = V.InterfaceC1734n.f14931a;
                obj = objG;
                if (objG == aVar.a()) {
                    p051f0.r rVarF6 = V.v1.f();
                    rVarF6.add(s0Var.i());
                    interfaceC1734nR.K(rVarF6);
                    obj = rVarF6;
                }
                rVar = (p051f0.r) obj;
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar.a()) {
                    objG2 = p170r.V.d();
                    interfaceC1734nR.K(objG2);
                }
                k6 = (p170r.K) objG2;
                if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                    interfaceC1734nR.T(860660313);
                    if (rVar.size() == 1) {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    } else {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    }
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(860990897);
                }
                interfaceC1734nR.J();
                if (k6.a(s0Var.p())) {
                    interfaceC1734nR.T(861052122);
                    it = rVar.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i20 = -1;
                            i19 = -1;
                            break;
                        } else {
                            if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                i20 = -1;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == i20) {
                        rVar.add(s0Var.p());
                    } else {
                        rVar.set(i19, s0Var.p());
                    }
                    k6.i();
                    size2 = rVar.size();
                    while (i21 < size2) {
                        java.lang.Object obj12 = rVar.get(i21);
                        k6.s(obj12, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj12, qVar), interfaceC1734nR, 54));
                    }
                } else {
                    interfaceC1734nR.T(861812273);
                }
                interfaceC1734nR.J();
                D0.I iH6 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF6 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                F0.InterfaceC0919g.a aVar7 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar7.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH6, aVar7.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF6, aVar7.e());
                pVarB = aVar7.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE6, aVar7.d());
                androidx.compose.foundation.layout.f fVar6 = androidx.compose.foundation.layout.f.f19260a;
                interfaceC1734nR.T(-187482432);
                size = rVar.size();
                while (i18 < size) {
                    java.lang.Object obj13 = rVar.get(i18);
                    interfaceC1734nR.s(-1081873445, lVar2.l(obj13));
                    pVar = (p237x7.p) k6.c(obj13);
                    if (pVar == null) {
                        interfaceC1734nR.T(821713034);
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(-1081871785);
                        pVar.u(interfaceC1734nR, 0);
                        interfaceC1734nR.J();
                    }
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            } else {
                if (i23 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    lVar2 = t.l.b.f54511D;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objG = interfaceC1734nR.g();
                aVar = V.InterfaceC1734n.f14931a;
                obj = objG;
                if (objG == aVar.a()) {
                    p051f0.r rVarF7 = V.v1.f();
                    rVarF7.add(s0Var.i());
                    interfaceC1734nR.K(rVarF7);
                    obj = rVarF7;
                }
                rVar = (p051f0.r) obj;
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar.a()) {
                    objG2 = p170r.V.d();
                    interfaceC1734nR.K(objG2);
                }
                k6 = (p170r.K) objG2;
                if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                    interfaceC1734nR.T(860660313);
                    if (rVar.size() == 1) {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    } else {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    }
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(860990897);
                }
                interfaceC1734nR.J();
                if (k6.a(s0Var.p())) {
                    interfaceC1734nR.T(861052122);
                    it = rVar.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i20 = -1;
                            i19 = -1;
                            break;
                        } else {
                            if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                i20 = -1;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == i20) {
                        rVar.add(s0Var.p());
                    } else {
                        rVar.set(i19, s0Var.p());
                    }
                    k6.i();
                    size2 = rVar.size();
                    while (i21 < size2) {
                        java.lang.Object obj14 = rVar.get(i21);
                        k6.s(obj14, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj14, qVar), interfaceC1734nR, 54));
                    }
                } else {
                    interfaceC1734nR.T(861812273);
                }
                interfaceC1734nR.J();
                D0.I iH7 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF7 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                F0.InterfaceC0919g.a aVar8 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar8.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH7, aVar8.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF7, aVar8.e());
                pVarB = aVar8.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE7, aVar8.d());
                androidx.compose.foundation.layout.f fVar7 = androidx.compose.foundation.layout.f.f19260a;
                interfaceC1734nR.T(-187482432);
                size = rVar.size();
                while (i18 < size) {
                    java.lang.Object obj15 = rVar.get(i18);
                    interfaceC1734nR.s(-1081873445, lVar2.l(obj15));
                    pVar = (p237x7.p) k6.c(obj15);
                    if (pVar == null) {
                        interfaceC1734nR.T(821713034);
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(-1081871785);
                        pVar.u(interfaceC1734nR, 0);
                        interfaceC1734nR.J();
                    }
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            }
            i22 = iL;
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
            }
        }
        i12 |= 48;
        dVar2 = dVar;
        i13 = i11 & 2;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                iL = i6;
                if (interfaceC1734nR.l(iL)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    lVar2 = lVar;
                    if (interfaceC1734nR.l(lVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) == 9362) {
                    if (i23 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        lVar2 = t.l.b.f54511D;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objG = interfaceC1734nR.g();
                    aVar = V.InterfaceC1734n.f14931a;
                    obj = objG;
                    if (objG == aVar.a()) {
                        p051f0.r rVarF8 = V.v1.f();
                        rVarF8.add(s0Var.i());
                        interfaceC1734nR.K(rVarF8);
                        obj = rVarF8;
                    }
                    rVar = (p051f0.r) obj;
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar.a()) {
                        objG2 = p170r.V.d();
                        interfaceC1734nR.K(objG2);
                    }
                    k6 = (p170r.K) objG2;
                    if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                        interfaceC1734nR.T(860660313);
                        if (rVar.size() == 1) {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        } else {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        }
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(860990897);
                    }
                    interfaceC1734nR.J();
                    if (k6.a(s0Var.p())) {
                        interfaceC1734nR.T(861052122);
                        it = rVar.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i20 = -1;
                                i19 = -1;
                                break;
                            } else {
                                if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                    i20 = -1;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == i20) {
                            rVar.add(s0Var.p());
                        } else {
                            rVar.set(i19, s0Var.p());
                        }
                        k6.i();
                        size2 = rVar.size();
                        while (i21 < size2) {
                            java.lang.Object obj16 = rVar.get(i21);
                            k6.s(obj16, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj16, qVar), interfaceC1734nR, 54));
                        }
                    } else {
                        interfaceC1734nR.T(861812273);
                    }
                    interfaceC1734nR.J();
                    D0.I iH8 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF8 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                    F0.InterfaceC0919g.a aVar9 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar9.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH8, aVar9.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF8, aVar9.e());
                    pVarB = aVar9.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE8, aVar9.d());
                    androidx.compose.foundation.layout.f fVar8 = androidx.compose.foundation.layout.f.f19260a;
                    interfaceC1734nR.T(-187482432);
                    size = rVar.size();
                    while (i18 < size) {
                        java.lang.Object obj17 = rVar.get(i18);
                        interfaceC1734nR.s(-1081873445, lVar2.l(obj17));
                        pVar = (p237x7.p) k6.c(obj17);
                        if (pVar == null) {
                            interfaceC1734nR.T(821713034);
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(-1081871785);
                            pVar.u(interfaceC1734nR, 0);
                            interfaceC1734nR.J();
                        }
                        interfaceC1734nR.N();
                    }
                    interfaceC1734nR.J();
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                } else {
                    if (i23 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                    }
                    if (i15 != 0) {
                        lVar2 = t.l.b.f54511D;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objG = interfaceC1734nR.g();
                    aVar = V.InterfaceC1734n.f14931a;
                    obj = objG;
                    if (objG == aVar.a()) {
                        p051f0.r rVarF9 = V.v1.f();
                        rVarF9.add(s0Var.i());
                        interfaceC1734nR.K(rVarF9);
                        obj = rVarF9;
                    }
                    rVar = (p051f0.r) obj;
                    objG2 = interfaceC1734nR.g();
                    if (objG2 == aVar.a()) {
                        objG2 = p170r.V.d();
                        interfaceC1734nR.K(objG2);
                    }
                    k6 = (p170r.K) objG2;
                    if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                        interfaceC1734nR.T(860660313);
                        if (rVar.size() == 1) {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        } else {
                            interfaceC1734nR.T(860794667);
                            if ((i12 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objG3 = interfaceC1734nR.g();
                            if (z6) {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            } else {
                                objG3 = new t.l.c(s0Var);
                                interfaceC1734nR.K(objG3);
                            }
                            p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                            k6.i();
                        }
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(860990897);
                    }
                    interfaceC1734nR.J();
                    if (k6.a(s0Var.p())) {
                        interfaceC1734nR.T(861052122);
                        it = rVar.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i20 = -1;
                                i19 = -1;
                                break;
                            } else {
                                if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                    i20 = -1;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i19 == i20) {
                            rVar.add(s0Var.p());
                        } else {
                            rVar.set(i19, s0Var.p());
                        }
                        k6.i();
                        size2 = rVar.size();
                        while (i21 < size2) {
                            java.lang.Object obj18 = rVar.get(i21);
                            k6.s(obj18, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj18, qVar), interfaceC1734nR, 54));
                        }
                    } else {
                        interfaceC1734nR.T(861812273);
                    }
                    interfaceC1734nR.J();
                    D0.I iH9 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                    iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                    V.InterfaceC1758z interfaceC1758zF9 = interfaceC1734nR.F();
                    androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                    F0.InterfaceC0919g.a aVar10 = F0.InterfaceC0919g.f2641a;
                    aVarA = aVar10.a();
                    if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734nR.t();
                    if (interfaceC1734nR.o()) {
                        interfaceC1734nR.B(aVarA);
                    } else {
                        interfaceC1734nR.H();
                    }
                    interfaceC1734nA = V.L1.a(interfaceC1734nR);
                    V.L1.c(interfaceC1734nA, iH9, aVar10.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF9, aVar10.e());
                    pVarB = aVar10.b();
                    if (interfaceC1734nA.o()) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    } else {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE9, aVar10.d());
                    androidx.compose.foundation.layout.f fVar9 = androidx.compose.foundation.layout.f.f19260a;
                    interfaceC1734nR.T(-187482432);
                    size = rVar.size();
                    while (i18 < size) {
                        java.lang.Object obj19 = rVar.get(i18);
                        interfaceC1734nR.s(-1081873445, lVar2.l(obj19));
                        pVar = (p237x7.p) k6.c(obj19);
                        if (pVar == null) {
                            interfaceC1734nR.T(821713034);
                            interfaceC1734nR.J();
                        } else {
                            interfaceC1734nR.T(-1081871785);
                            pVar.u(interfaceC1734nR, 0);
                            interfaceC1734nR.J();
                        }
                        interfaceC1734nR.N();
                    }
                    interfaceC1734nR.J();
                    interfaceC1734nR.Q();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                }
                i22 = iL;
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
                }
            }
            i12 |= 3072;
            lVar2 = lVar;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) == 9362) {
                if (i23 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    lVar2 = t.l.b.f54511D;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objG = interfaceC1734nR.g();
                aVar = V.InterfaceC1734n.f14931a;
                obj = objG;
                if (objG == aVar.a()) {
                    p051f0.r rVarF10 = V.v1.f();
                    rVarF10.add(s0Var.i());
                    interfaceC1734nR.K(rVarF10);
                    obj = rVarF10;
                }
                rVar = (p051f0.r) obj;
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar.a()) {
                    objG2 = p170r.V.d();
                    interfaceC1734nR.K(objG2);
                }
                k6 = (p170r.K) objG2;
                if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                    interfaceC1734nR.T(860660313);
                    if (rVar.size() == 1) {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    } else {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    }
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(860990897);
                }
                interfaceC1734nR.J();
                if (k6.a(s0Var.p())) {
                    interfaceC1734nR.T(861052122);
                    it = rVar.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i20 = -1;
                            i19 = -1;
                            break;
                        } else {
                            if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                i20 = -1;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == i20) {
                        rVar.add(s0Var.p());
                    } else {
                        rVar.set(i19, s0Var.p());
                    }
                    k6.i();
                    size2 = rVar.size();
                    while (i21 < size2) {
                        java.lang.Object obj110 = rVar.get(i21);
                        k6.s(obj110, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj110, qVar), interfaceC1734nR, 54));
                    }
                } else {
                    interfaceC1734nR.T(861812273);
                }
                interfaceC1734nR.J();
                D0.I iH10 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF10 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                F0.InterfaceC0919g.a aVar11 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar11.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH10, aVar11.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF10, aVar11.e());
                pVarB = aVar11.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE10, aVar11.d());
                androidx.compose.foundation.layout.f fVar10 = androidx.compose.foundation.layout.f.f19260a;
                interfaceC1734nR.T(-187482432);
                size = rVar.size();
                while (i18 < size) {
                    java.lang.Object obj111 = rVar.get(i18);
                    interfaceC1734nR.s(-1081873445, lVar2.l(obj111));
                    pVar = (p237x7.p) k6.c(obj111);
                    if (pVar == null) {
                        interfaceC1734nR.T(821713034);
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(-1081871785);
                        pVar.u(interfaceC1734nR, 0);
                        interfaceC1734nR.J();
                    }
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            } else {
                if (i23 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    lVar2 = t.l.b.f54511D;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objG = interfaceC1734nR.g();
                aVar = V.InterfaceC1734n.f14931a;
                obj = objG;
                if (objG == aVar.a()) {
                    p051f0.r rVarF11 = V.v1.f();
                    rVarF11.add(s0Var.i());
                    interfaceC1734nR.K(rVarF11);
                    obj = rVarF11;
                }
                rVar = (p051f0.r) obj;
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar.a()) {
                    objG2 = p170r.V.d();
                    interfaceC1734nR.K(objG2);
                }
                k6 = (p170r.K) objG2;
                if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                    interfaceC1734nR.T(860660313);
                    if (rVar.size() == 1) {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    } else {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    }
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(860990897);
                }
                interfaceC1734nR.J();
                if (k6.a(s0Var.p())) {
                    interfaceC1734nR.T(861052122);
                    it = rVar.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i20 = -1;
                            i19 = -1;
                            break;
                        } else {
                            if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                i20 = -1;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == i20) {
                        rVar.add(s0Var.p());
                    } else {
                        rVar.set(i19, s0Var.p());
                    }
                    k6.i();
                    size2 = rVar.size();
                    while (i21 < size2) {
                        java.lang.Object obj112 = rVar.get(i21);
                        k6.s(obj112, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj112, qVar), interfaceC1734nR, 54));
                    }
                } else {
                    interfaceC1734nR.T(861812273);
                }
                interfaceC1734nR.J();
                D0.I iH11 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF11 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE11 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                F0.InterfaceC0919g.a aVar12 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar12.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH11, aVar12.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF11, aVar12.e());
                pVarB = aVar12.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE11, aVar12.d());
                androidx.compose.foundation.layout.f fVar11 = androidx.compose.foundation.layout.f.f19260a;
                interfaceC1734nR.T(-187482432);
                size = rVar.size();
                while (i18 < size) {
                    java.lang.Object obj113 = rVar.get(i18);
                    interfaceC1734nR.s(-1081873445, lVar2.l(obj113));
                    pVar = (p237x7.p) k6.c(obj113);
                    if (pVar == null) {
                        interfaceC1734nR.T(821713034);
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(-1081871785);
                        pVar.u(interfaceC1734nR, 0);
                        interfaceC1734nR.J();
                    }
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            }
            i22 = iL;
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
            }
        }
        i12 |= 384;
        iL = i6;
        i15 = i11 & 4;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                lVar2 = lVar;
                if (interfaceC1734nR.l(lVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) == 9362) {
                if (i23 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    lVar2 = t.l.b.f54511D;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objG = interfaceC1734nR.g();
                aVar = V.InterfaceC1734n.f14931a;
                obj = objG;
                if (objG == aVar.a()) {
                    p051f0.r rVarF12 = V.v1.f();
                    rVarF12.add(s0Var.i());
                    interfaceC1734nR.K(rVarF12);
                    obj = rVarF12;
                }
                rVar = (p051f0.r) obj;
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar.a()) {
                    objG2 = p170r.V.d();
                    interfaceC1734nR.K(objG2);
                }
                k6 = (p170r.K) objG2;
                if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                    interfaceC1734nR.T(860660313);
                    if (rVar.size() == 1) {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    } else {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    }
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(860990897);
                }
                interfaceC1734nR.J();
                if (k6.a(s0Var.p())) {
                    interfaceC1734nR.T(861052122);
                    it = rVar.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i20 = -1;
                            i19 = -1;
                            break;
                        } else {
                            if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                i20 = -1;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == i20) {
                        rVar.add(s0Var.p());
                    } else {
                        rVar.set(i19, s0Var.p());
                    }
                    k6.i();
                    size2 = rVar.size();
                    while (i21 < size2) {
                        java.lang.Object obj114 = rVar.get(i21);
                        k6.s(obj114, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj114, qVar), interfaceC1734nR, 54));
                    }
                } else {
                    interfaceC1734nR.T(861812273);
                }
                interfaceC1734nR.J();
                D0.I iH12 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF12 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                F0.InterfaceC0919g.a aVar13 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar13.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH12, aVar13.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF12, aVar13.e());
                pVarB = aVar13.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE12, aVar13.d());
                androidx.compose.foundation.layout.f fVar12 = androidx.compose.foundation.layout.f.f19260a;
                interfaceC1734nR.T(-187482432);
                size = rVar.size();
                while (i18 < size) {
                    java.lang.Object obj115 = rVar.get(i18);
                    interfaceC1734nR.s(-1081873445, lVar2.l(obj115));
                    pVar = (p237x7.p) k6.c(obj115);
                    if (pVar == null) {
                        interfaceC1734nR.T(821713034);
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(-1081871785);
                        pVar.u(interfaceC1734nR, 0);
                        interfaceC1734nR.J();
                    }
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            } else {
                if (i23 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
                }
                if (i15 != 0) {
                    lVar2 = t.l.b.f54511D;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objG = interfaceC1734nR.g();
                aVar = V.InterfaceC1734n.f14931a;
                obj = objG;
                if (objG == aVar.a()) {
                    p051f0.r rVarF13 = V.v1.f();
                    rVarF13.add(s0Var.i());
                    interfaceC1734nR.K(rVarF13);
                    obj = rVarF13;
                }
                rVar = (p051f0.r) obj;
                objG2 = interfaceC1734nR.g();
                if (objG2 == aVar.a()) {
                    objG2 = p170r.V.d();
                    interfaceC1734nR.K(objG2);
                }
                k6 = (p170r.K) objG2;
                if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                    interfaceC1734nR.T(860660313);
                    if (rVar.size() == 1) {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    } else {
                        interfaceC1734nR.T(860794667);
                        if ((i12 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objG3 = interfaceC1734nR.g();
                        if (z6) {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        } else {
                            objG3 = new t.l.c(s0Var);
                            interfaceC1734nR.K(objG3);
                        }
                        p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                        k6.i();
                    }
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(860990897);
                }
                interfaceC1734nR.J();
                if (k6.a(s0Var.p())) {
                    interfaceC1734nR.T(861052122);
                    it = rVar.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i20 = -1;
                            i19 = -1;
                            break;
                        } else {
                            if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                                i20 = -1;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == i20) {
                        rVar.add(s0Var.p());
                    } else {
                        rVar.set(i19, s0Var.p());
                    }
                    k6.i();
                    size2 = rVar.size();
                    while (i21 < size2) {
                        java.lang.Object obj116 = rVar.get(i21);
                        k6.s(obj116, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj116, qVar), interfaceC1734nR, 54));
                    }
                } else {
                    interfaceC1734nR.T(861812273);
                }
                interfaceC1734nR.J();
                D0.I iH13 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF13 = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
                F0.InterfaceC0919g.a aVar14 = F0.InterfaceC0919g.f2641a;
                aVarA = aVar14.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH13, aVar14.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF13, aVar14.e());
                pVarB = aVar14.b();
                if (interfaceC1734nA.o()) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                } else {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE13, aVar14.d());
                androidx.compose.foundation.layout.f fVar13 = androidx.compose.foundation.layout.f.f19260a;
                interfaceC1734nR.T(-187482432);
                size = rVar.size();
                while (i18 < size) {
                    java.lang.Object obj117 = rVar.get(i18);
                    interfaceC1734nR.s(-1081873445, lVar2.l(obj117));
                    pVar = (p237x7.p) k6.c(obj117);
                    if (pVar == null) {
                        interfaceC1734nR.T(821713034);
                        interfaceC1734nR.J();
                    } else {
                        interfaceC1734nR.T(-1081871785);
                        pVar.u(interfaceC1734nR, 0);
                        interfaceC1734nR.J();
                    }
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            }
            i22 = iL;
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
            }
        }
        i12 |= 3072;
        lVar2 = lVar;
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 9363) == 9362) {
            if (i23 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i13 != 0) {
                iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
            }
            if (i15 != 0) {
                lVar2 = t.l.b.f54511D;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
            }
            objG = interfaceC1734nR.g();
            aVar = V.InterfaceC1734n.f14931a;
            obj = objG;
            if (objG == aVar.a()) {
                p051f0.r rVarF14 = V.v1.f();
                rVarF14.add(s0Var.i());
                interfaceC1734nR.K(rVarF14);
                obj = rVarF14;
            }
            rVar = (p051f0.r) obj;
            objG2 = interfaceC1734nR.g();
            if (objG2 == aVar.a()) {
                objG2 = p170r.V.d();
                interfaceC1734nR.K(objG2);
            }
            k6 = (p170r.K) objG2;
            if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                interfaceC1734nR.T(860660313);
                if (rVar.size() == 1) {
                    interfaceC1734nR.T(860794667);
                    if ((i12 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objG3 = interfaceC1734nR.g();
                    if (z6) {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    }
                    p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                    k6.i();
                } else {
                    interfaceC1734nR.T(860794667);
                    if ((i12 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objG3 = interfaceC1734nR.g();
                    if (z6) {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    }
                    p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                    k6.i();
                }
                interfaceC1734nR.J();
            } else {
                interfaceC1734nR.T(860990897);
            }
            interfaceC1734nR.J();
            if (k6.a(s0Var.p())) {
                interfaceC1734nR.T(861052122);
                it = rVar.iterator();
                i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i20 = -1;
                        i19 = -1;
                        break;
                    } else {
                        if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                            i20 = -1;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 == i20) {
                    rVar.add(s0Var.p());
                } else {
                    rVar.set(i19, s0Var.p());
                }
                k6.i();
                size2 = rVar.size();
                while (i21 < size2) {
                    java.lang.Object obj118 = rVar.get(i21);
                    k6.s(obj118, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj118, qVar), interfaceC1734nR, 54));
                }
            } else {
                interfaceC1734nR.T(861812273);
            }
            interfaceC1734nR.J();
            D0.I iH14 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF14 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
            F0.InterfaceC0919g.a aVar15 = F0.InterfaceC0919g.f2641a;
            aVarA = aVar15.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, iH14, aVar15.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF14, aVar15.e());
            pVarB = aVar15.b();
            if (interfaceC1734nA.o()) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            } else {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE14, aVar15.d());
            androidx.compose.foundation.layout.f fVar14 = androidx.compose.foundation.layout.f.f19260a;
            interfaceC1734nR.T(-187482432);
            size = rVar.size();
            while (i18 < size) {
                java.lang.Object obj119 = rVar.get(i18);
                interfaceC1734nR.s(-1081873445, lVar2.l(obj119));
                pVar = (p237x7.p) k6.c(obj119);
                if (pVar == null) {
                    interfaceC1734nR.T(821713034);
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(-1081871785);
                    pVar.u(interfaceC1734nR, 0);
                    interfaceC1734nR.J();
                }
                interfaceC1734nR.N();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
        } else {
            if (i23 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i13 != 0) {
                iL = p200u.AbstractC7177k.l(0, 0, null, 7, null);
            }
            if (i15 != 0) {
                lVar2 = t.l.b.f54511D;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(679005231, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
            }
            objG = interfaceC1734nR.g();
            aVar = V.InterfaceC1734n.f14931a;
            obj = objG;
            if (objG == aVar.a()) {
                p051f0.r rVarF15 = V.v1.f();
                rVarF15.add(s0Var.i());
                interfaceC1734nR.K(rVarF15);
                obj = rVarF15;
            }
            rVar = (p051f0.r) obj;
            objG2 = interfaceC1734nR.g();
            if (objG2 == aVar.a()) {
                objG2 = p170r.V.d();
                interfaceC1734nR.K(objG2);
            }
            k6 = (p170r.K) objG2;
            if (p247y7.AbstractC7350t.b(s0Var.i(), s0Var.p())) {
                interfaceC1734nR.T(860660313);
                if (rVar.size() == 1) {
                    interfaceC1734nR.T(860794667);
                    if ((i12 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objG3 = interfaceC1734nR.g();
                    if (z6) {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    }
                    p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                    k6.i();
                } else {
                    interfaceC1734nR.T(860794667);
                    if ((i12 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objG3 = interfaceC1734nR.g();
                    if (z6) {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new t.l.c(s0Var);
                        interfaceC1734nR.K(objG3);
                    }
                    p097j7.AbstractC6879v.I(rVar, (p237x7.l) objG3);
                    k6.i();
                }
                interfaceC1734nR.J();
            } else {
                interfaceC1734nR.T(860990897);
            }
            interfaceC1734nR.J();
            if (k6.a(s0Var.p())) {
                interfaceC1734nR.T(861052122);
                it = rVar.iterator();
                i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i20 = -1;
                        i19 = -1;
                        break;
                    } else {
                        if (p247y7.AbstractC7350t.b(lVar2.l(it.next()), lVar2.l(s0Var.p()))) {
                            i20 = -1;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 == i20) {
                    rVar.add(s0Var.p());
                } else {
                    rVar.set(i19, s0Var.p());
                }
                k6.i();
                size2 = rVar.size();
                while (i21 < size2) {
                    java.lang.Object obj1110 = rVar.get(i21);
                    k6.s(obj1110, p031d0.c.e(-1426421288, true, new t.l.d(s0Var, iL, obj1110, qVar), interfaceC1734nR, 54));
                }
            } else {
                interfaceC1734nR.T(861812273);
            }
            interfaceC1734nR.J();
            D0.I iH15 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF15 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(interfaceC1734nR, dVar3);
            F0.InterfaceC0919g.a aVar16 = F0.InterfaceC0919g.f2641a;
            aVarA = aVar16.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, iH15, aVar16.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF15, aVar16.e());
            pVarB = aVar16.b();
            if (interfaceC1734nA.o()) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            } else {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE15, aVar16.d());
            androidx.compose.foundation.layout.f fVar15 = androidx.compose.foundation.layout.f.f19260a;
            interfaceC1734nR.T(-187482432);
            size = rVar.size();
            while (i18 < size) {
                java.lang.Object obj1111 = rVar.get(i18);
                interfaceC1734nR.s(-1081873445, lVar2.l(obj1111));
                pVar = (p237x7.p) k6.c(obj1111);
                if (pVar == null) {
                    interfaceC1734nR.T(821713034);
                    interfaceC1734nR.J();
                } else {
                    interfaceC1734nR.T(-1081871785);
                    pVar.u(interfaceC1734nR, 0);
                    interfaceC1734nR.J();
                }
                interfaceC1734nR.N();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
        }
        i22 = iL;
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.l.e(s0Var, dVar4, i22, lVar2, qVar, i10, i11));
        }
    }
}
