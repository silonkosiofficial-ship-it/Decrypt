package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f10086a = Y0.i.q(16);

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.v f10087D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ A.S f10088E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T.v vVar, A.S s6) {
            super(1);
            this.f10087D = vVar;
            this.f10088E = s6;
        }

        public final void a(A.S s6) {
            this.f10087D.f(A.U.c(this.f10088E, s6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((A.S) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f10089D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10090E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10091F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10092G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10093H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ T.v f10094I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10095J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, p237x7.p pVar, p237x7.q qVar, p237x7.p pVar2, p237x7.p pVar3, T.v vVar, p237x7.p pVar4) {
            super(2);
            this.f10089D = i6;
            this.f10090E = pVar;
            this.f10091F = qVar;
            this.f10092G = pVar2;
            this.f10093H = pVar3;
            this.f10094I = vVar;
            this.f10095J = pVar4;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1979205334, i6, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            S.L0.b(this.f10089D, this.f10090E, this.f10091F, this.f10092G, this.f10093H, this.f10094I, this.f10095J, interfaceC1734n, 0);
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

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10096D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10097E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10098F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10099G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10100H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f10101I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f10102J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f10103K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ A.S f10104L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10105M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f10106N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f10107O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, p237x7.p pVar, p237x7.p pVar2, p237x7.p pVar3, p237x7.p pVar4, int i6, long j6, long j10, A.S s6, p237x7.q qVar, int i10, int i11) {
            super(2);
            this.f10096D = dVar;
            this.f10097E = pVar;
            this.f10098F = pVar2;
            this.f10099G = pVar3;
            this.f10100H = pVar4;
            this.f10101I = i6;
            this.f10102J = j6;
            this.f10103K = j10;
            this.f10104L = s6;
            this.f10105M = qVar;
            this.f10106N = i10;
            this.f10107O = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.L0.a(this.f10096D, this.f10097E, this.f10098F, this.f10099G, this.f10100H, this.f10101I, this.f10102J, this.f10103K, this.f10104L, this.f10105M, interfaceC1734n, V.S0.a(this.f10106N | 1), this.f10107O);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10108D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10109E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10110F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f10111G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ A.S f10112H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10113I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10114J;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.util.List f10115D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ java.util.List f10116E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ java.util.List f10117F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ java.util.List f10118G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ S.C1535b0 f10119H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ int f10120I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ int f10121J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ A.S f10122K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ D0.j0 f10123L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ int f10124M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ int f10125N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ java.lang.Integer f10126O;

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            final /* synthetic */ java.util.List f10127P;

            /* JADX INFO: renamed from: Q, reason: collision with root package name */
            final /* synthetic */ java.lang.Integer f10128Q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, S.C1535b0 c1535b0, int i6, int i10, A.S s6, D0.j0 j0Var, int i11, int i12, java.lang.Integer num, java.util.List list5, java.lang.Integer num2) {
                super(1);
                this.f10115D = list;
                this.f10116E = list2;
                this.f10117F = list3;
                this.f10118G = list4;
                this.f10119H = c1535b0;
                this.f10120I = i6;
                this.f10121J = i10;
                this.f10122K = s6;
                this.f10123L = j0Var;
                this.f10124M = i11;
                this.f10125N = i12;
                this.f10126O = num;
                this.f10127P = list5;
                this.f10128Q = num2;
            }

            public final void a(D0.X.a aVar) {
                java.util.List list = this.f10115D;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    D0.X.a.h(aVar, (D0.X) list.get(i6), 0, 0, 0.0f, 4, null);
                }
                java.util.List list2 = this.f10116E;
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    D0.X.a.h(aVar, (D0.X) list2.get(i10), 0, 0, 0.0f, 4, null);
                }
                java.util.List list3 = this.f10117F;
                int i11 = this.f10120I;
                int i12 = this.f10121J;
                A.S s6 = this.f10122K;
                D0.j0 j0Var = this.f10123L;
                int i13 = this.f10124M;
                int i14 = this.f10125N;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    D0.X.a.h(aVar, (D0.X) list3.get(i15), ((i11 - i12) / 2) + s6.d(j0Var, j0Var.getLayoutDirection()), i13 - i14, 0.0f, 4, null);
                }
                java.util.List list4 = this.f10118G;
                int i16 = this.f10124M;
                java.lang.Integer num = this.f10126O;
                int size4 = list4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    D0.X.a.h(aVar, (D0.X) list4.get(i17), 0, i16 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                S.C1535b0 c1535b0 = this.f10119H;
                if (c1535b0 != null) {
                    java.util.List list5 = this.f10127P;
                    int i18 = this.f10124M;
                    java.lang.Integer num2 = this.f10128Q;
                    int size5 = list5.size();
                    for (int i19 = 0; i19 < size5; i19++) {
                        D0.X x6 = (D0.X) list5.get(i19);
                        int iB = c1535b0.b();
                        p247y7.AbstractC7350t.c(num2);
                        D0.X.a.h(aVar, x6, iB, i18 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ A.S f10129D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ D0.j0 f10130E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ java.util.List f10131F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ int f10132G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ java.util.List f10133H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ java.lang.Integer f10134I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p237x7.q f10135J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(A.S s6, D0.j0 j0Var, java.util.List list, int i6, java.util.List list2, java.lang.Integer num, p237x7.q qVar) {
                super(2);
                this.f10129D = s6;
                this.f10130E = j0Var;
                this.f10131F = list;
                this.f10132G = i6;
                this.f10133H = list2;
                this.f10134I = num;
                this.f10135J = qVar;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                java.lang.Integer num;
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1213360416, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                A.B b6 = A.U.b(this.f10129D, this.f10130E);
                this.f10135J.j(androidx.compose.foundation.layout.m.d(androidx.compose.foundation.layout.m.g(b6, this.f10130E.getLayoutDirection()), this.f10131F.isEmpty() ? b6.d() : this.f10130E.o0(this.f10132G), androidx.compose.foundation.layout.m.f(b6, this.f10130E.getLayoutDirection()), (this.f10133H.isEmpty() || (num = this.f10134I) == null) ? b6.c() : this.f10130E.o0(num.intValue())), interfaceC1734n, 0);
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

        static final class c extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.p f10136D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(p237x7.p pVar) {
                super(2);
                this.f10136D = pVar;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-2146438447, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.f10136D.u(interfaceC1734n, 0);
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
        d(p237x7.p pVar, p237x7.p pVar2, p237x7.p pVar3, int i6, A.S s6, p237x7.p pVar4, p237x7.q qVar) {
            super(2);
            this.f10108D = pVar;
            this.f10109E = pVar2;
            this.f10110F = pVar3;
            this.f10111G = i6;
            this.f10112H = s6;
            this.f10113I = pVar4;
            this.f10114J = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:96:0x0236  */
        /* JADX WARN: Code duplicated, block: B:97:0x023f  */
        public final D0.K a(D0.j0 j0Var, long j6) {
            java.lang.Object obj;
            java.lang.Object obj2;
            java.lang.Object obj3;
            S.C1535b0 c1535b0;
            java.lang.Object obj4;
            java.lang.Integer numValueOf;
            int iIntValue;
            int iA;
            int iB;
            java.lang.Object obj5;
            java.lang.Object obj6;
            int iS0;
            int iL = Y0.C1859b.l(j6);
            int iK = Y0.C1859b.k(j6);
            long jD = Y0.C1859b.d(j6, 0, 0, 0, 0, 10, null);
            java.util.List listC1 = j0Var.c1(S.M0.TopBar, this.f10108D);
            java.util.ArrayList arrayList = new java.util.ArrayList(listC1.size());
            int size = listC1.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(((D0.G) listC1.get(i6)).U(jD));
            }
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(0);
                int iW0 = ((D0.X) obj).w0();
                int iO = p097j7.AbstractC6879v.o(arrayList);
                if (1 <= iO) {
                    int i10 = 1;
                    while (true) {
                        java.lang.Object obj7 = arrayList.get(i10);
                        int iW1 = ((D0.X) obj7).w0();
                        if (iW0 < iW1) {
                            obj = obj7;
                            iW0 = iW1;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                obj = null;
            }
            D0.X x6 = (D0.X) obj;
            int iW2 = x6 != null ? x6.w0() : 0;
            java.util.List listC2 = j0Var.c1(S.M0.Snackbar, this.f10109E);
            A.S s6 = this.f10112H;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(listC2.size());
            int size2 = listC2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(((D0.G) listC2.get(i11)).U(Y0.c.n(jD, (-s6.d(j0Var, j0Var.getLayoutDirection())) - s6.a(j0Var, j0Var.getLayoutDirection()), -s6.b(j0Var))));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int iW3 = ((D0.X) obj2).w0();
                int iO2 = p097j7.AbstractC6879v.o(arrayList2);
                if (1 <= iO2) {
                    java.lang.Object obj8 = obj2;
                    int i12 = iW3;
                    int i13 = 1;
                    while (true) {
                        java.lang.Object obj9 = arrayList2.get(i13);
                        int iW4 = ((D0.X) obj9).w0();
                        if (i12 < iW4) {
                            obj8 = obj9;
                            i12 = iW4;
                        }
                        if (i13 == iO2) {
                            break;
                        }
                        i13++;
                    }
                    obj2 = obj8;
                }
            }
            D0.X x10 = (D0.X) obj2;
            int iW5 = x10 != null ? x10.w0() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int iI0 = ((D0.X) obj3).I0();
                int iO3 = p097j7.AbstractC6879v.o(arrayList2);
                if (1 <= iO3) {
                    java.lang.Object obj10 = obj3;
                    int i14 = iI0;
                    int i15 = 1;
                    while (true) {
                        java.lang.Object obj11 = arrayList2.get(i15);
                        int iI1 = ((D0.X) obj11).I0();
                        if (i14 < iI1) {
                            obj10 = obj11;
                            i14 = iI1;
                        }
                        if (i15 == iO3) {
                            break;
                        }
                        i15++;
                    }
                    obj3 = obj10;
                }
            }
            D0.X x11 = (D0.X) obj3;
            int iI2 = x11 != null ? x11.I0() : 0;
            java.util.List listC3 = j0Var.c1(S.M0.Fab, this.f10110F);
            A.S s10 = this.f10112H;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(listC3.size());
            int size3 = listC3.size();
            int i16 = 0;
            while (i16 < size3) {
                java.util.List list = listC3;
                int i17 = size3;
                A.S s11 = s10;
                D0.X xU = ((D0.G) listC3.get(i16)).U(Y0.c.n(jD, (-s10.d(j0Var, j0Var.getLayoutDirection())) - s10.a(j0Var, j0Var.getLayoutDirection()), -s10.b(j0Var)));
                if (xU.w0() == 0 || xU.I0() == 0) {
                    xU = null;
                }
                if (xU != null) {
                    arrayList3.add(xU);
                }
                i16++;
                s10 = s11;
                listC3 = list;
                size3 = i17;
            }
            if (!arrayList3.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                    obj5 = arrayList3.get(0);
                    int iI3 = ((D0.X) obj5).I0();
                    int iO4 = p097j7.AbstractC6879v.o(arrayList3);
                    if (1 <= iO4) {
                        int i18 = iI3;
                        int i19 = 1;
                        while (true) {
                            java.lang.Object obj12 = arrayList3.get(i19);
                            int iI4 = ((D0.X) obj12).I0();
                            if (i18 < iI4) {
                                obj5 = obj12;
                                i18 = iI4;
                            }
                            if (i19 == iO4) {
                                break;
                            }
                            i19++;
                        }
                    }
                } else {
                    obj5 = null;
                }
                p247y7.AbstractC7350t.c(obj5);
                int iI5 = ((D0.X) obj5).I0();
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int iW6 = ((D0.X) obj6).w0();
                    int iO5 = p097j7.AbstractC6879v.o(arrayList3);
                    if (1 <= iO5) {
                        java.lang.Object obj13 = obj6;
                        int i20 = iW6;
                        int i21 = 1;
                        while (true) {
                            java.lang.Object obj14 = arrayList3.get(i21);
                            java.lang.Object obj15 = obj13;
                            int iW7 = ((D0.X) obj14).w0();
                            if (i20 < iW7) {
                                i20 = iW7;
                                obj13 = obj14;
                            } else {
                                obj13 = obj15;
                            }
                            if (i21 == iO5) {
                                break;
                            }
                            i21++;
                        }
                        obj6 = obj13;
                    }
                }
                p247y7.AbstractC7350t.c(obj6);
                int iW8 = ((D0.X) obj6).w0();
                int i22 = this.f10111G;
                S.AbstractC1538c0.a aVar = S.AbstractC1538c0.f10823a;
                if (!S.AbstractC1538c0.e(i22, aVar.c())) {
                    if (!(S.AbstractC1538c0.e(i22, aVar.a()) ? true : S.AbstractC1538c0.e(i22, aVar.b()))) {
                        iS0 = (iL - iI5) / 2;
                    } else if (j0Var.getLayoutDirection() == Y0.v.Ltr) {
                        iS0 = (iL - j0Var.S0(S.L0.f10086a)) - iI5;
                    } else {
                        iS0 = j0Var.S0(S.L0.f10086a);
                    }
                } else if (j0Var.getLayoutDirection() == Y0.v.Ltr) {
                    iS0 = j0Var.S0(S.L0.f10086a);
                } else {
                    iS0 = (iL - j0Var.S0(S.L0.f10086a)) - iI5;
                }
                c1535b0 = new S.C1535b0(iS0, iI5, iW8);
            } else {
                c1535b0 = null;
            }
            java.util.List listC4 = j0Var.c1(S.M0.BottomBar, p031d0.c.c(-2146438447, true, new S.L0.d.c(this.f10113I)));
            java.util.ArrayList arrayList4 = new java.util.ArrayList(listC4.size());
            int size4 = listC4.size();
            for (int i23 = 0; i23 < size4; i23++) {
                arrayList4.add(((D0.G) listC4.get(i23)).U(jD));
            }
            if (!arrayList4.isEmpty()) {
                obj4 = arrayList4.get(0);
                int iW9 = ((D0.X) obj4).w0();
                int iO6 = p097j7.AbstractC6879v.o(arrayList4);
                if (1 <= iO6) {
                    int i24 = 1;
                    while (true) {
                        java.lang.Object obj16 = arrayList4.get(i24);
                        int iW10 = ((D0.X) obj16).w0();
                        if (iW9 < iW10) {
                            iW9 = iW10;
                            obj4 = obj16;
                        }
                        if (i24 == iO6) {
                            break;
                        }
                        i24++;
                    }
                }
            } else {
                obj4 = null;
            }
            D0.X x12 = (D0.X) obj4;
            java.lang.Integer numValueOf2 = x12 != null ? java.lang.Integer.valueOf(x12.w0()) : null;
            if (c1535b0 != null) {
                int i25 = this.f10111G;
                A.S s12 = this.f10112H;
                if (numValueOf2 == null || S.AbstractC1538c0.e(i25, S.AbstractC1538c0.f10823a.b())) {
                    iA = c1535b0.a() + j0Var.S0(S.L0.f10086a);
                    iB = s12.b(j0Var);
                } else {
                    iA = numValueOf2.intValue() + c1535b0.a();
                    iB = j0Var.S0(S.L0.f10086a);
                }
                numValueOf = java.lang.Integer.valueOf(iA + iB);
            } else {
                numValueOf = null;
            }
            if (iW5 != 0) {
                iIntValue = iW5 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : this.f10112H.b(j0Var));
            } else {
                iIntValue = 0;
            }
            int i26 = iI2;
            java.util.List listC5 = j0Var.c1(S.M0.MainContent, p031d0.c.c(-1213360416, true, new S.L0.d.b(this.f10112H, j0Var, arrayList, iW2, arrayList4, numValueOf2, this.f10114J)));
            java.util.ArrayList arrayList5 = new java.util.ArrayList(listC5.size());
            int size5 = listC5.size();
            for (int i27 = 0; i27 < size5; i27++) {
                arrayList5.add(((D0.G) listC5.get(i27)).U(jD));
            }
            return D0.L.b(j0Var, iL, iK, null, new S.L0.d.a(arrayList5, arrayList, arrayList2, arrayList4, c1535b0, iL, i26, this.f10112H, j0Var, iK, iIntValue, numValueOf2, arrayList3, numValueOf), 4, null);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return a((D0.j0) obj, ((Y0.C1859b) obj2).r());
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f10137D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10138E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10139F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10140G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10141H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ A.S f10142I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10143J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f10144K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i6, p237x7.p pVar, p237x7.q qVar, p237x7.p pVar2, p237x7.p pVar3, A.S s6, p237x7.p pVar4, int i10) {
            super(2);
            this.f10137D = i6;
            this.f10138E = pVar;
            this.f10139F = qVar;
            this.f10140G = pVar2;
            this.f10141H = pVar3;
            this.f10142I = s6;
            this.f10143J = pVar4;
            this.f10144K = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.L0.b(this.f10137D, this.f10138E, this.f10139F, this.f10140G, this.f10141H, this.f10142I, this.f10143J, interfaceC1734n, V.S0.a(this.f10144K | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:102:0x0119  */
    /* JADX WARN: Code duplicated, block: B:104:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x0128  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186 A[PHI: r0 r2 r3 r5 r6 r7 r8 r9 r10
  0x0186: PHI (r0v13 androidx.compose.ui.d) = (r0v10 androidx.compose.ui.d), (r0v18 androidx.compose.ui.d) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r2v7 x7.p) = (r2v2 x7.p), (r2v8 x7.p) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r3v10 long) = (r3v6 long), (r3v11 long) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r5v7 x7.p) = (r5v2 x7.p), (r5v8 x7.p) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r6v9 x7.p) = (r6v4 x7.p), (r6v10 x7.p) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r7v10 x7.p) = (r7v6 x7.p), (r7v11 x7.p) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r8v8 int) = (r8v4 int), (r8v9 int) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r9v19 int) = (r9v8 int), (r9v20 int) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r10v21 long) = (r10v5 long), (r10v4 long) binds: [B:157:0x01ed, B:129:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x01da  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x0202  */
    /* JADX WARN: Code duplicated, block: B:164:0x0215  */
    /* JADX WARN: Code duplicated, block: B:166:0x021b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0225 A[PHI: r38
  0x0225: PHI (r38v2 long) = (r38v0 long), (r38v3 long) binds: [B:169:0x0223, B:167:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0227  */
    /* JADX WARN: Code duplicated, block: B:174:0x022e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0236  */
    /* JADX WARN: Code duplicated, block: B:179:0x0249  */
    /* JADX WARN: Code duplicated, block: B:181:0x024f  */
    /* JADX WARN: Code duplicated, block: B:187:0x025e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0266  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(androidx.compose.ui.d dVar, p237x7.p pVar, p237x7.p pVar2, p237x7.p pVar3, p237x7.p pVar4, int i6, long j6, long j10, A.S s6, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        p237x7.p pVar5;
        int i13;
        p237x7.p pVar6;
        int i14;
        int i15;
        int i16;
        int i17;
        p237x7.p pVar7;
        int i18;
        int i19;
        int i20;
        long jC;
        int i21;
        androidx.compose.ui.d dVar2;
        p237x7.p pVarA;
        p237x7.p pVarB;
        p237x7.p pVarC;
        p237x7.p pVarD;
        int iA;
        int i22;
        long jA;
        A.S sA;
        int i23;
        long j11;
        boolean z6;
        java.lang.Object objG;
        T.v vVar;
        boolean zS;
        java.lang.Object objG2;
        long j12;
        p237x7.p pVar8;
        p237x7.p pVar9;
        p237x7.p pVar10;
        A.S s10;
        long j13;
        androidx.compose.ui.d dVar3;
        V.InterfaceC1709e1 interfaceC1709e1X;
        int i24;
        int i25;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1219521777);
        int i26 = i11 & 1;
        if (i26 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i27 = i11 & 2;
        if (i27 == 0) {
            if ((i10 & 48) == 0) {
                pVar5 = pVar;
                i12 |= interfaceC1734nR.l(pVar5) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    pVar6 = pVar2;
                    if (interfaceC1734nR.l(pVar6)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (interfaceC1734nR.l(pVar3)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            pVar7 = pVar4;
                            if (interfaceC1734nR.l(pVar7)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (interfaceC1734nR.i(i6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i10 & 1572864) != 0) {
                            if ((i11 & 64) == 0 || !interfaceC1734nR.j(j6)) {
                                i25 = 524288;
                            } else {
                                i25 = 1048576;
                            }
                            i12 |= i25;
                        }
                        if ((i10 & 12582912) == 0) {
                            jC = j10;
                            if ((i11 & 128) == 0 || !interfaceC1734nR.j(jC)) {
                                i24 = 4194304;
                            } else {
                                i24 = 8388608;
                            }
                            i12 |= i24;
                        } else {
                            jC = j10;
                        }
                        if ((i10 & 100663296) != 0) {
                            i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                        }
                        if ((i11 & 512) != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (interfaceC1734nR.l(qVar)) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 306783379) == 306783378 || !interfaceC1734nR.u()) {
                                interfaceC1734nR.q();
                                if ((i10 & 1) != 0 || interfaceC1734nR.G()) {
                                    if (i26 != 0) {
                                        dVar2 = androidx.compose.ui.d.f19586a;
                                    } else {
                                        dVar2 = dVar;
                                    }
                                    if (i27 != 0) {
                                        pVarA = S.E.f9965a.a();
                                    } else {
                                        pVarA = pVar5;
                                    }
                                    if (i13 != 0) {
                                        pVarB = S.E.f9965a.b();
                                    } else {
                                        pVarB = pVar6;
                                    }
                                    if (i15 != 0) {
                                        pVarC = S.E.f9965a.c();
                                    } else {
                                        pVarC = pVar3;
                                    }
                                    if (i17 != 0) {
                                        pVarD = S.E.f9965a.d();
                                    } else {
                                        pVarD = pVar7;
                                    }
                                    if (i19 != 0) {
                                        iA = S.AbstractC1538c0.f10823a.a();
                                    } else {
                                        iA = i6;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i22 = i12 & (-3670017);
                                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                    } else {
                                        i22 = i12;
                                        jA = j6;
                                    }
                                    if ((i11 & 128) != 0) {
                                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                        i22 &= -29360129;
                                    }
                                    if ((i11 & 256) != 0) {
                                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                        i22 &= -234881025;
                                    }
                                    interfaceC1734nR.R();
                                    if (V.AbstractC1741q.H()) {
                                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                                    }
                                    i23 = (234881024 & i22) ^ 100663296;
                                    if (i23 > 67108864 || !interfaceC1734nR.S(sA)) {
                                        j11 = jC;
                                        if ((i22 & 100663296) != 67108864) {
                                            z6 = false;
                                        }
                                        objG = interfaceC1734nR.g();
                                        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                                            objG = new T.v(sA);
                                            interfaceC1734nR.K(objG);
                                        }
                                        vVar = (T.v) objG;
                                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                                        objG2 = interfaceC1734nR.g();
                                        if (zS || objG2 == V.InterfaceC1734n.f14931a.a()) {
                                            objG2 = new S.L0.a(vVar, sA);
                                            interfaceC1734nR.K(objG2);
                                        }
                                        int i28 = i22 >> 12;
                                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i28 & 896) | 12582912 | (i28 & 7168), 114);
                                        if (V.AbstractC1741q.H()) {
                                            V.AbstractC1741q.P();
                                        }
                                        j12 = jA;
                                        pVar8 = pVarB;
                                        pVar9 = pVarC;
                                        pVar10 = pVarD;
                                        s10 = sA;
                                        j13 = j11;
                                        pVar5 = pVarA;
                                        dVar3 = dVar2;
                                    } else {
                                        j11 = jC;
                                    }
                                    z6 = true;
                                    objG = interfaceC1734nR.g();
                                    if (z6) {
                                        objG = new T.v(sA);
                                        interfaceC1734nR.K(objG);
                                    } else {
                                        objG = new T.v(sA);
                                        interfaceC1734nR.K(objG);
                                    }
                                    vVar = (T.v) objG;
                                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                                    objG2 = interfaceC1734nR.g();
                                    if (zS) {
                                        objG2 = new S.L0.a(vVar, sA);
                                        interfaceC1734nR.K(objG2);
                                    } else {
                                        objG2 = new S.L0.a(vVar, sA);
                                        interfaceC1734nR.K(objG2);
                                    }
                                    int i29 = i22 >> 12;
                                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i29 & 896) | 12582912 | (i29 & 7168), 114);
                                    if (V.AbstractC1741q.H()) {
                                        V.AbstractC1741q.P();
                                    }
                                    j12 = jA;
                                    pVar8 = pVarB;
                                    pVar9 = pVarC;
                                    pVar10 = pVarD;
                                    s10 = sA;
                                    j13 = j11;
                                    pVar5 = pVarA;
                                    dVar3 = dVar2;
                                } else {
                                    interfaceC1734nR.A();
                                    if ((i11 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i12 &= -29360129;
                                    }
                                    if ((i11 & 256) != 0) {
                                        i12 &= -234881025;
                                    }
                                    dVar2 = dVar;
                                    i22 = i12;
                                    pVarA = pVar5;
                                    pVarB = pVar6;
                                    pVarD = pVar7;
                                    pVarC = pVar3;
                                    iA = i6;
                                    jA = j6;
                                }
                                sA = s6;
                                interfaceC1734nR.R();
                                if (V.AbstractC1741q.H()) {
                                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                                }
                                i23 = (234881024 & i22) ^ 100663296;
                                if (i23 > 67108864) {
                                    j11 = jC;
                                    if ((i22 & 100663296) != 67108864) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                } else {
                                    j11 = jC;
                                    if ((i22 & 100663296) != 67108864) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                                objG = interfaceC1734nR.g();
                                if (z6) {
                                    objG = new T.v(sA);
                                    interfaceC1734nR.K(objG);
                                } else {
                                    objG = new T.v(sA);
                                    interfaceC1734nR.K(objG);
                                }
                                vVar = (T.v) objG;
                                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                                objG2 = interfaceC1734nR.g();
                                if (zS) {
                                    objG2 = new S.L0.a(vVar, sA);
                                    interfaceC1734nR.K(objG2);
                                } else {
                                    objG2 = new S.L0.a(vVar, sA);
                                    interfaceC1734nR.K(objG2);
                                }
                                int i210 = i22 >> 12;
                                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i210 & 896) | 12582912 | (i210 & 7168), 114);
                                if (V.AbstractC1741q.H()) {
                                    V.AbstractC1741q.P();
                                }
                                j12 = jA;
                                pVar8 = pVarB;
                                pVar9 = pVarC;
                                pVar10 = pVarD;
                                s10 = sA;
                                j13 = j11;
                                pVar5 = pVarA;
                                dVar3 = dVar2;
                            } else {
                                interfaceC1734nR.A();
                                dVar3 = dVar;
                                pVar9 = pVar3;
                                s10 = s6;
                                pVar8 = pVar6;
                                pVar10 = pVar7;
                                iA = i6;
                                j13 = jC;
                                j12 = j6;
                            }
                            interfaceC1709e1X = interfaceC1734nR.x();
                            if (interfaceC1709e1X != null) {
                                interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                            }
                        }
                        i12 |= 805306368;
                        if ((i12 & 306783379) == 306783378) {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i211 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211 & 896) | 12582912 | (i211 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        } else {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i212 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i212 & 896) | 12582912 | (i212 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    pVar7 = pVar4;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (interfaceC1734nR.i(i6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    if ((i10 & 12582912) == 0) {
                        jC = j10;
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    } else {
                        jC = j10;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) == 306783378) {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i213 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i213 & 896) | 12582912 | (i213 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        } else {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i214 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i214 & 896) | 12582912 | (i214 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i215 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i215 & 896) | 12582912 | (i215 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i216 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i216 & 896) | 12582912 | (i216 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 3072;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar7 = pVar4;
                        if (interfaceC1734nR.l(pVar7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (interfaceC1734nR.i(i6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    if ((i10 & 12582912) == 0) {
                        jC = j10;
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    } else {
                        jC = j10;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) == 306783378) {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i217 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i217 & 896) | 12582912 | (i217 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        } else {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i218 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i218 & 896) | 12582912 | (i218 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i219 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i219 & 896) | 12582912 | (i219 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2110 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2110 & 896) | 12582912 | (i2110 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 24576;
                pVar7 = pVar4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (interfaceC1734nR.i(i6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    jC = j10;
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                } else {
                    jC = j10;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2111 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111 & 896) | 12582912 | (i2111 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2112 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2112 & 896) | 12582912 | (i2112 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2113 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2113 & 896) | 12582912 | (i2113 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2114 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2114 & 896) | 12582912 | (i2114 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 384;
            pVar6 = pVar2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (interfaceC1734nR.l(pVar3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar7 = pVar4;
                        if (interfaceC1734nR.l(pVar7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (interfaceC1734nR.i(i6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    if ((i10 & 12582912) == 0) {
                        jC = j10;
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    } else {
                        jC = j10;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) == 306783378) {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i2115 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2115 & 896) | 12582912 | (i2115 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        } else {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i2116 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2116 & 896) | 12582912 | (i2116 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2117 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2117 & 896) | 12582912 | (i2117 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2118 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2118 & 896) | 12582912 | (i2118 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 24576;
                pVar7 = pVar4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (interfaceC1734nR.i(i6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    jC = j10;
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                } else {
                    jC = j10;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2119 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2119 & 896) | 12582912 | (i2119 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i21110 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21110 & 896) | 12582912 | (i21110 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21111 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111 & 896) | 12582912 | (i21111 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21112 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21112 & 896) | 12582912 | (i21112 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 3072;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar7 = pVar4;
                    if (interfaceC1734nR.l(pVar7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (interfaceC1734nR.i(i6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    jC = j10;
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                } else {
                    jC = j10;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i21113 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21113 & 896) | 12582912 | (i21113 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i21114 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21114 & 896) | 12582912 | (i21114 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21115 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21115 & 896) | 12582912 | (i21115 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21116 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21116 & 896) | 12582912 | (i21116 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 24576;
            pVar7 = pVar4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (interfaceC1734nR.i(i6)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            if ((i10 & 12582912) == 0) {
                jC = j10;
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            } else {
                jC = j10;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21117 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21117 & 896) | 12582912 | (i21117 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21118 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21118 & 896) | 12582912 | (i21118 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i21119 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21119 & 896) | 12582912 | (i21119 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i211110 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211110 & 896) | 12582912 | (i211110 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
            }
        }
        i12 |= 48;
        pVar5 = pVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                pVar6 = pVar2;
                if (interfaceC1734nR.l(pVar6)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (interfaceC1734nR.l(pVar3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar7 = pVar4;
                        if (interfaceC1734nR.l(pVar7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (interfaceC1734nR.i(i6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    if ((i10 & 12582912) == 0) {
                        jC = j10;
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    } else {
                        jC = j10;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) == 306783378) {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i211111 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211111 & 896) | 12582912 | (i211111 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        } else {
                            interfaceC1734nR.q();
                            if ((i10 & 1) != 0) {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            } else {
                                if (i26 != 0) {
                                    dVar2 = androidx.compose.ui.d.f19586a;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i27 != 0) {
                                    pVarA = S.E.f9965a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i13 != 0) {
                                    pVarB = S.E.f9965a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i15 != 0) {
                                    pVarC = S.E.f9965a.c();
                                } else {
                                    pVarC = pVar3;
                                }
                                if (i17 != 0) {
                                    pVarD = S.E.f9965a.d();
                                } else {
                                    pVarD = pVar7;
                                }
                                if (i19 != 0) {
                                    iA = S.AbstractC1538c0.f10823a.a();
                                } else {
                                    iA = i6;
                                }
                                if ((i11 & 64) != 0) {
                                    i22 = i12 & (-3670017);
                                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                                } else {
                                    i22 = i12;
                                    jA = j6;
                                }
                                if ((i11 & 128) != 0) {
                                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                    i22 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                    i22 &= -234881025;
                                } else {
                                    sA = s6;
                                }
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            i23 = (234881024 & i22) ^ 100663296;
                            if (i23 > 67108864) {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                j11 = jC;
                                if ((i22 & 100663296) != 67108864) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            objG = interfaceC1734nR.g();
                            if (z6) {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new T.v(sA);
                                interfaceC1734nR.K(objG);
                            }
                            vVar = (T.v) objG;
                            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                            objG2 = interfaceC1734nR.g();
                            if (zS) {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            } else {
                                objG2 = new S.L0.a(vVar, sA);
                                interfaceC1734nR.K(objG2);
                            }
                            int i211112 = i22 >> 12;
                            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211112 & 896) | 12582912 | (i211112 & 7168), 114);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            j12 = jA;
                            pVar8 = pVarB;
                            pVar9 = pVarC;
                            pVar10 = pVarD;
                            s10 = sA;
                            j13 = j11;
                            pVar5 = pVarA;
                            dVar3 = dVar2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i211113 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211113 & 896) | 12582912 | (i211113 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i211114 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211114 & 896) | 12582912 | (i211114 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 24576;
                pVar7 = pVar4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (interfaceC1734nR.i(i6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    jC = j10;
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                } else {
                    jC = j10;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i211115 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211115 & 896) | 12582912 | (i211115 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i211116 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211116 & 896) | 12582912 | (i211116 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i211117 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211117 & 896) | 12582912 | (i211117 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i211118 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211118 & 896) | 12582912 | (i211118 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 3072;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar7 = pVar4;
                    if (interfaceC1734nR.l(pVar7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (interfaceC1734nR.i(i6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    jC = j10;
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                } else {
                    jC = j10;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i211119 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211119 & 896) | 12582912 | (i211119 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2111110 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111110 & 896) | 12582912 | (i2111110 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2111111 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111111 & 896) | 12582912 | (i2111111 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2111112 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111112 & 896) | 12582912 | (i2111112 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 24576;
            pVar7 = pVar4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (interfaceC1734nR.i(i6)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            if ((i10 & 12582912) == 0) {
                jC = j10;
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            } else {
                jC = j10;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2111113 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111113 & 896) | 12582912 | (i2111113 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2111114 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111114 & 896) | 12582912 | (i2111114 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i2111115 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111115 & 896) | 12582912 | (i2111115 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i2111116 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111116 & 896) | 12582912 | (i2111116 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
            }
        }
        i12 |= 384;
        pVar6 = pVar2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (interfaceC1734nR.l(pVar3)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar7 = pVar4;
                    if (interfaceC1734nR.l(pVar7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (interfaceC1734nR.i(i6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    jC = j10;
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                } else {
                    jC = j10;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378) {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2111117 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111117 & 896) | 12582912 | (i2111117 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    } else {
                        interfaceC1734nR.q();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        } else {
                            if (i26 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i27 != 0) {
                                pVarA = S.E.f9965a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i13 != 0) {
                                pVarB = S.E.f9965a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i15 != 0) {
                                pVarC = S.E.f9965a.c();
                            } else {
                                pVarC = pVar3;
                            }
                            if (i17 != 0) {
                                pVarD = S.E.f9965a.d();
                            } else {
                                pVarD = pVar7;
                            }
                            if (i19 != 0) {
                                iA = S.AbstractC1538c0.f10823a.a();
                            } else {
                                iA = i6;
                            }
                            if ((i11 & 64) != 0) {
                                i22 = i12 & (-3670017);
                                jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                            } else {
                                i22 = i12;
                                jA = j6;
                            }
                            if ((i11 & 128) != 0) {
                                jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                                i22 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                                i22 &= -234881025;
                            } else {
                                sA = s6;
                            }
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        i23 = (234881024 & i22) ^ 100663296;
                        if (i23 > 67108864) {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            j11 = jC;
                            if ((i22 & 100663296) != 67108864) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        objG = interfaceC1734nR.g();
                        if (z6) {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new T.v(sA);
                            interfaceC1734nR.K(objG);
                        }
                        vVar = (T.v) objG;
                        zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                        objG2 = interfaceC1734nR.g();
                        if (zS) {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        } else {
                            objG2 = new S.L0.a(vVar, sA);
                            interfaceC1734nR.K(objG2);
                        }
                        int i2111118 = i22 >> 12;
                        S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111118 & 896) | 12582912 | (i2111118 & 7168), 114);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        j12 = jA;
                        pVar8 = pVarB;
                        pVar9 = pVarC;
                        pVar10 = pVarD;
                        s10 = sA;
                        j13 = j11;
                        pVar5 = pVarA;
                        dVar3 = dVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i2111119 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i2111119 & 896) | 12582912 | (i2111119 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21111110 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111110 & 896) | 12582912 | (i21111110 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 24576;
            pVar7 = pVar4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (interfaceC1734nR.i(i6)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            if ((i10 & 12582912) == 0) {
                jC = j10;
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            } else {
                jC = j10;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21111111 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111111 & 896) | 12582912 | (i21111111 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21111112 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111112 & 896) | 12582912 | (i21111112 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i21111113 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111113 & 896) | 12582912 | (i21111113 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i21111114 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111114 & 896) | 12582912 | (i21111114 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
            }
        }
        i12 |= 3072;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                pVar7 = pVar4;
                if (interfaceC1734nR.l(pVar7)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (interfaceC1734nR.i(i6)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            if ((i10 & 12582912) == 0) {
                jC = j10;
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            } else {
                jC = j10;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) == 306783378) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21111115 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111115 & 896) | 12582912 | (i21111115 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                } else {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    } else {
                        if (i26 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            pVarA = S.E.f9965a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i13 != 0) {
                            pVarB = S.E.f9965a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i15 != 0) {
                            pVarC = S.E.f9965a.c();
                        } else {
                            pVarC = pVar3;
                        }
                        if (i17 != 0) {
                            pVarD = S.E.f9965a.d();
                        } else {
                            pVarD = pVar7;
                        }
                        if (i19 != 0) {
                            iA = S.AbstractC1538c0.f10823a.a();
                        } else {
                            iA = i6;
                        }
                        if ((i11 & 64) != 0) {
                            i22 = i12 & (-3670017);
                            jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                        } else {
                            i22 = i12;
                            jA = j6;
                        }
                        if ((i11 & 128) != 0) {
                            jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                            i22 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                            i22 &= -234881025;
                        } else {
                            sA = s6;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    i23 = (234881024 & i22) ^ 100663296;
                    if (i23 > 67108864) {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        j11 = jC;
                        if ((i22 & 100663296) != 67108864) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objG = interfaceC1734nR.g();
                    if (z6) {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new T.v(sA);
                        interfaceC1734nR.K(objG);
                    }
                    vVar = (T.v) objG;
                    zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                    objG2 = interfaceC1734nR.g();
                    if (zS) {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new S.L0.a(vVar, sA);
                        interfaceC1734nR.K(objG2);
                    }
                    int i21111116 = i22 >> 12;
                    S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111116 & 896) | 12582912 | (i21111116 & 7168), 114);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    j12 = jA;
                    pVar8 = pVarB;
                    pVar9 = pVarC;
                    pVar10 = pVarD;
                    s10 = sA;
                    j13 = j11;
                    pVar5 = pVarA;
                    dVar3 = dVar2;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i21111117 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111117 & 896) | 12582912 | (i21111117 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i21111118 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111118 & 896) | 12582912 | (i21111118 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
            }
        }
        i12 |= 24576;
        pVar7 = pVar4;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (interfaceC1734nR.i(i6)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i25 = 524288;
            } else {
                i25 = 524288;
            }
            i12 |= i25;
        }
        if ((i10 & 12582912) == 0) {
            jC = j10;
            if ((i11 & 128) == 0) {
                i24 = 4194304;
            } else {
                i24 = 4194304;
            }
            i12 |= i24;
        } else {
            jC = j10;
        }
        if ((i10 & 100663296) != 0) {
            i12 |= ((i11 & 256) == 0 || !interfaceC1734nR.S(s6)) ? 33554432 : 67108864;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((i12 & 306783379) == 306783378) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i21111119 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i21111119 & 896) | 12582912 | (i21111119 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                } else {
                    if (i26 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        pVarA = S.E.f9965a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i13 != 0) {
                        pVarB = S.E.f9965a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i15 != 0) {
                        pVarC = S.E.f9965a.c();
                    } else {
                        pVarC = pVar3;
                    }
                    if (i17 != 0) {
                        pVarD = S.E.f9965a.d();
                    } else {
                        pVarD = pVar7;
                    }
                    if (i19 != 0) {
                        iA = S.AbstractC1538c0.f10823a.a();
                    } else {
                        iA = i6;
                    }
                    if ((i11 & 64) != 0) {
                        i22 = i12 & (-3670017);
                        jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                    } else {
                        i22 = i12;
                        jA = j6;
                    }
                    if ((i11 & 128) != 0) {
                        jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                        i22 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                        i22 &= -234881025;
                    } else {
                        sA = s6;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                i23 = (234881024 & i22) ^ 100663296;
                if (i23 > 67108864) {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    j11 = jC;
                    if ((i22 & 100663296) != 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objG = interfaceC1734nR.g();
                if (z6) {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new T.v(sA);
                    interfaceC1734nR.K(objG);
                }
                vVar = (T.v) objG;
                zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
                objG2 = interfaceC1734nR.g();
                if (zS) {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new S.L0.a(vVar, sA);
                    interfaceC1734nR.K(objG2);
                }
                int i211111110 = i22 >> 12;
                S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211111110 & 896) | 12582912 | (i211111110 & 7168), 114);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                j12 = jA;
                pVar8 = pVarB;
                pVar9 = pVarC;
                pVar10 = pVarD;
                s10 = sA;
                j13 = j11;
                pVar5 = pVarA;
                dVar3 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) == 306783378) {
            interfaceC1734nR.q();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    pVarA = S.E.f9965a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i13 != 0) {
                    pVarB = S.E.f9965a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i15 != 0) {
                    pVarC = S.E.f9965a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i17 != 0) {
                    pVarD = S.E.f9965a.d();
                } else {
                    pVarD = pVar7;
                }
                if (i19 != 0) {
                    iA = S.AbstractC1538c0.f10823a.a();
                } else {
                    iA = i6;
                }
                if ((i11 & 64) != 0) {
                    i22 = i12 & (-3670017);
                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                } else {
                    i22 = i12;
                    jA = j6;
                }
                if ((i11 & 128) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                    i22 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                    i22 &= -234881025;
                } else {
                    sA = s6;
                }
            } else {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    pVarA = S.E.f9965a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i13 != 0) {
                    pVarB = S.E.f9965a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i15 != 0) {
                    pVarC = S.E.f9965a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i17 != 0) {
                    pVarD = S.E.f9965a.d();
                } else {
                    pVarD = pVar7;
                }
                if (i19 != 0) {
                    iA = S.AbstractC1538c0.f10823a.a();
                } else {
                    iA = i6;
                }
                if ((i11 & 64) != 0) {
                    i22 = i12 & (-3670017);
                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                } else {
                    i22 = i12;
                    jA = j6;
                }
                if ((i11 & 128) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                    i22 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                    i22 &= -234881025;
                } else {
                    sA = s6;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            i23 = (234881024 & i22) ^ 100663296;
            if (i23 > 67108864) {
                j11 = jC;
                if ((i22 & 100663296) != 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                j11 = jC;
                if ((i22 & 100663296) != 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            objG = interfaceC1734nR.g();
            if (z6) {
                objG = new T.v(sA);
                interfaceC1734nR.K(objG);
            } else {
                objG = new T.v(sA);
                interfaceC1734nR.K(objG);
            }
            vVar = (T.v) objG;
            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
            objG2 = interfaceC1734nR.g();
            if (zS) {
                objG2 = new S.L0.a(vVar, sA);
                interfaceC1734nR.K(objG2);
            } else {
                objG2 = new S.L0.a(vVar, sA);
                interfaceC1734nR.K(objG2);
            }
            int i211111111 = i22 >> 12;
            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211111111 & 896) | 12582912 | (i211111111 & 7168), 114);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            j12 = jA;
            pVar8 = pVarB;
            pVar9 = pVarC;
            pVar10 = pVarD;
            s10 = sA;
            j13 = j11;
            pVar5 = pVarA;
            dVar3 = dVar2;
        } else {
            interfaceC1734nR.q();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    pVarA = S.E.f9965a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i13 != 0) {
                    pVarB = S.E.f9965a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i15 != 0) {
                    pVarC = S.E.f9965a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i17 != 0) {
                    pVarD = S.E.f9965a.d();
                } else {
                    pVarD = pVar7;
                }
                if (i19 != 0) {
                    iA = S.AbstractC1538c0.f10823a.a();
                } else {
                    iA = i6;
                }
                if ((i11 & 64) != 0) {
                    i22 = i12 & (-3670017);
                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                } else {
                    i22 = i12;
                    jA = j6;
                }
                if ((i11 & 128) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                    i22 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                    i22 &= -234881025;
                } else {
                    sA = s6;
                }
            } else {
                if (i26 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    pVarA = S.E.f9965a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i13 != 0) {
                    pVarB = S.E.f9965a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i15 != 0) {
                    pVarC = S.E.f9965a.c();
                } else {
                    pVarC = pVar3;
                }
                if (i17 != 0) {
                    pVarD = S.E.f9965a.d();
                } else {
                    pVarD = pVar7;
                }
                if (i19 != 0) {
                    iA = S.AbstractC1538c0.f10823a.a();
                } else {
                    iA = i6;
                }
                if ((i11 & 64) != 0) {
                    i22 = i12 & (-3670017);
                    jA = S.C1562o0.f11478a.a(interfaceC1734nR, 6).a();
                } else {
                    i22 = i12;
                    jA = j6;
                }
                if ((i11 & 128) != 0) {
                    jC = S.A.c(jA, interfaceC1734nR, (i22 >> 18) & 14);
                    i22 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    sA = S.K0.f10075a.a(interfaceC1734nR, 6);
                    i22 &= -234881025;
                } else {
                    sA = s6;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1219521777, i22, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            i23 = (234881024 & i22) ^ 100663296;
            if (i23 > 67108864) {
                j11 = jC;
                if ((i22 & 100663296) != 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                j11 = jC;
                if ((i22 & 100663296) != 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            objG = interfaceC1734nR.g();
            if (z6) {
                objG = new T.v(sA);
                interfaceC1734nR.K(objG);
            } else {
                objG = new T.v(sA);
                interfaceC1734nR.K(objG);
            }
            vVar = (T.v) objG;
            zS = interfaceC1734nR.S(vVar) | ((i23 <= 67108864 && interfaceC1734nR.S(sA)) || (100663296 & i22) == 67108864);
            objG2 = interfaceC1734nR.g();
            if (zS) {
                objG2 = new S.L0.a(vVar, sA);
                interfaceC1734nR.K(objG2);
            } else {
                objG2 = new S.L0.a(vVar, sA);
                interfaceC1734nR.K(objG2);
            }
            int i211111112 = i22 >> 12;
            S.c1.a(A.V.b(dVar2, (p237x7.l) objG2), null, jA, j11, 0.0f, 0.0f, null, p031d0.c.e(-1979205334, true, new S.L0.b(iA, pVarA, qVar, pVarC, pVarD, vVar, pVarB), interfaceC1734nR, 54), interfaceC1734nR, (i211111112 & 896) | 12582912 | (i211111112 & 7168), 114);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            j12 = jA;
            pVar8 = pVarB;
            pVar9 = pVarC;
            pVar10 = pVarD;
            s10 = sA;
            j13 = j11;
            pVar5 = pVarA;
            dVar3 = dVar2;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.L0.c(dVar3, pVar5, pVar8, pVar9, pVar10, iA, j12, j13, s10, qVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(int i6, p237x7.p pVar, p237x7.q qVar, p237x7.p pVar2, p237x7.p pVar3, A.S s6, p237x7.p pVar4, V.InterfaceC1734n interfaceC1734n, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-975511942);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1734nR.i(i6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1734nR.l(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1734nR.l(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC1734nR.l(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC1734nR.S(s6) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= interfaceC1734nR.l(pVar4) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-975511942, i11, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z6 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048) | ((458752 & i11) == 131072) | ((57344 & i11) == 16384) | ((i11 & 14) == 4) | ((3670016 & i11) == 1048576) | ((i11 & 896) == 256);
            java.lang.Object objG = interfaceC1734nR.g();
            if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.L0.d(pVar, pVar2, pVar3, i6, s6, pVar4, qVar);
                interfaceC1734nR.K(objG);
            }
            D0.g0.b(null, (p237x7.p) objG, interfaceC1734nR, 0, 1);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.L0.e(i6, pVar, qVar, pVar2, pVar3, s6, pVar4, i10));
        }
    }
}
