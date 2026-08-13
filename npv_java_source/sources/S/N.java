package S;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S.N f10176a = new S.N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E7.i f10177b = new E7.i(1900, 2100);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f10178c = U.C1687j.f13928a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final S.P0 f10179d = new S.N.a();

    public static final class a implements S.P0 {
        a() {
        }

        @Override // S.P0
        public /* synthetic */ boolean a(long j6) {
            return S.O0.a(this, j6);
        }

        @Override // S.P0
        public /* synthetic */ boolean b(int i6) {
            return S.O0.b(this, i6);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f10180D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.String str) {
            super(1);
            this.f10180D = str;
        }

        public final void a(K0.w wVar) {
            K0.u.U(wVar, K0.f.f5947b.b());
            K0.u.O(wVar, this.f10180D);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Long f10182E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f10183F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ S.Q f10184G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10185H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f10186I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f10187J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.Long l6, int i6, S.Q q6, androidx.compose.ui.d dVar, int i10, int i11) {
            super(2);
            this.f10182E = l6;
            this.f10183F = i6;
            this.f10184G = q6;
            this.f10185H = dVar;
            this.f10186I = i10;
            this.f10187J = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.N.this.a(this.f10182E, this.f10183F, this.f10184G, this.f10185H, interfaceC1734n, V.S0.a(this.f10186I | 1), this.f10187J);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f10189E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10190F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f10191G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f10192H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i6, androidx.compose.ui.d dVar, int i10, int i11) {
            super(2);
            this.f10189E = i6;
            this.f10190F = dVar;
            this.f10191G = i10;
            this.f10192H = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.N.this.b(this.f10189E, this.f10190F, interfaceC1734n, V.S0.a(this.f10191G | 1), this.f10192H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final class e implements p240y.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ p240y.i f10193a;

        e(p240y.i iVar) {
            this.f10193a = iVar;
        }

        @Override // p240y.i
        public float a(float f6, float f10) {
            return 0.0f;
        }

        @Override // p240y.i
        public float b(float f6) {
            return this.f10193a.b(f6);
        }
    }

    private N() {
    }

    public static /* synthetic */ S.Q e(S.N n6, java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str = "yMMMM";
        }
        if ((i6 & 2) != 0) {
            str2 = "yMMMd";
        }
        if ((i6 & 4) != 0) {
            str3 = "yMMMMEEEEd";
        }
        return n6.d(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x018a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    public final void a(java.lang.Long l6, int i6, S.Q q6, androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        java.lang.String strA;
        java.lang.String strA2;
        S.Y.a aVar;
        int i13;
        java.lang.String str;
        boolean zS;
        java.lang.Object objG;
        V.InterfaceC1734n interfaceC1734n2;
        androidx.compose.ui.d dVar4;
        S.Y.a aVar2;
        int i14;
        S.Y.a aVar3;
        int i15;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1502835813);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1734nR.S(l6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1734nR.i(i6) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? interfaceC1734nR.S(q6) : interfaceC1734nR.l(q6) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 3072) == 0) {
                dVar2 = dVar;
                i12 |= interfaceC1734nR.S(dVar2) ? 2048 : 1024;
            }
            if ((i12 & 1171) == 1170 || !interfaceC1734nR.u()) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1502835813, i12, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
                }
                java.util.Locale localeA = S.AbstractC1561o.a(interfaceC1734nR, 0);
                strA = S.P.a(q6, l6, localeA, false, 4, null);
                strA2 = q6.a(l6, localeA, true);
                interfaceC1734nR.T(1148835145);
                java.lang.String strA3 = "";
                if (strA2 == null) {
                    aVar3 = S.Y.f10606b;
                    if (S.Y.f(i6, aVar3.b())) {
                        interfaceC1734nR.T(1148842944);
                        T.x.a aVar4 = T.x.f12882a;
                        i15 = S.C0.f9937l;
                    } else if (S.Y.f(i6, aVar3.a())) {
                        interfaceC1734nR.T(1148845915);
                        T.x.a aVar5 = T.x.f12882a;
                        i15 = S.C0.f9932g;
                    } else {
                        interfaceC1734nR.T(1254558033);
                        interfaceC1734nR.J();
                        strA2 = "";
                    }
                    strA2 = T.y.a(T.x.a(i15), interfaceC1734nR, 0);
                    interfaceC1734nR.J();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.T(1148850481);
                if (strA == null) {
                    aVar2 = S.Y.f10606b;
                    if (S.Y.f(i6, aVar2.b())) {
                        interfaceC1734nR.T(1148853330);
                        T.x.a aVar6 = T.x.f12882a;
                        i14 = S.C0.f9934i;
                    } else if (S.Y.f(i6, aVar2.a())) {
                        interfaceC1734nR.T(1148855857);
                        T.x.a aVar7 = T.x.f12882a;
                        i14 = S.C0.f9926a;
                    } else {
                        interfaceC1734nR.T(1254856625);
                        interfaceC1734nR.J();
                        strA = "";
                    }
                    strA = T.y.a(T.x.a(i14), interfaceC1734nR, 0);
                    interfaceC1734nR.J();
                }
                interfaceC1734nR.J();
                aVar = S.Y.f10606b;
                if (S.Y.f(i6, aVar.b())) {
                    interfaceC1734nR.T(1148862013);
                    T.x.a aVar8 = T.x.f12882a;
                    i13 = S.C0.f9935j;
                } else {
                    if (S.Y.f(i6, aVar.a())) {
                        interfaceC1734nR.T(1148864764);
                        T.x.a aVar9 = T.x.f12882a;
                        i13 = S.C0.f9927b;
                    } else {
                        interfaceC1734nR.T(1255139345);
                    }
                    interfaceC1734nR.J();
                    str = java.lang.String.format(strA3, java.util.Arrays.copyOf(new java.lang.Object[]{strA2}, 1));
                    p247y7.AbstractC7350t.e(str, "format(this, *args)");
                    zS = interfaceC1734nR.S(str);
                    objG = interfaceC1734nR.g();
                    if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                        objG = new S.N.b(str);
                        interfaceC1734nR.K(objG);
                    }
                    androidx.compose.ui.d dVarD = K0.n.d(dVar3, false, (p237x7.l) objG, 1, null);
                    androidx.compose.ui.d dVar5 = dVar3;
                    interfaceC1734n2 = interfaceC1734nR;
                    S.m1.b(strA, dVarD, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, interfaceC1734n2, 0, 3072, 122876);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar5;
                }
                strA3 = T.y.a(T.x.a(i13), interfaceC1734nR, 0);
                interfaceC1734nR.J();
                str = java.lang.String.format(strA3, java.util.Arrays.copyOf(new java.lang.Object[]{strA2}, 1));
                p247y7.AbstractC7350t.e(str, "format(this, *args)");
                zS = interfaceC1734nR.S(str);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.N.b(str);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.N.b(str);
                    interfaceC1734nR.K(objG);
                }
                androidx.compose.ui.d dVarD2 = K0.n.d(dVar3, false, (p237x7.l) objG, 1, null);
                androidx.compose.ui.d dVar6 = dVar3;
                interfaceC1734n2 = interfaceC1734nR;
                S.m1.b(strA, dVarD2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, interfaceC1734n2, 0, 3072, 122876);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar6;
            } else {
                interfaceC1734nR.A();
                dVar4 = dVar2;
                interfaceC1734n2 = interfaceC1734nR;
            }
            interfaceC1709e1X = interfaceC1734n2.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.N.c(l6, i6, q6, dVar4, i10, i11));
            }
        }
        i12 |= 3072;
        dVar2 = dVar;
        if ((i12 & 1171) == 1170) {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1502835813, i12, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
            }
            java.util.Locale localeA2 = S.AbstractC1561o.a(interfaceC1734nR, 0);
            strA = S.P.a(q6, l6, localeA2, false, 4, null);
            strA2 = q6.a(l6, localeA2, true);
            interfaceC1734nR.T(1148835145);
            java.lang.String strA4 = "";
            if (strA2 == null) {
                aVar3 = S.Y.f10606b;
                if (S.Y.f(i6, aVar3.b())) {
                    interfaceC1734nR.T(1148842944);
                    T.x.a aVar10 = T.x.f12882a;
                    i15 = S.C0.f9937l;
                } else if (S.Y.f(i6, aVar3.a())) {
                    interfaceC1734nR.T(1148845915);
                    T.x.a aVar11 = T.x.f12882a;
                    i15 = S.C0.f9932g;
                } else {
                    interfaceC1734nR.T(1254558033);
                    interfaceC1734nR.J();
                    strA2 = "";
                }
                strA2 = T.y.a(T.x.a(i15), interfaceC1734nR, 0);
                interfaceC1734nR.J();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.T(1148850481);
            if (strA == null) {
                aVar2 = S.Y.f10606b;
                if (S.Y.f(i6, aVar2.b())) {
                    interfaceC1734nR.T(1148853330);
                    T.x.a aVar12 = T.x.f12882a;
                    i14 = S.C0.f9934i;
                } else if (S.Y.f(i6, aVar2.a())) {
                    interfaceC1734nR.T(1148855857);
                    T.x.a aVar13 = T.x.f12882a;
                    i14 = S.C0.f9926a;
                } else {
                    interfaceC1734nR.T(1254856625);
                    interfaceC1734nR.J();
                    strA = "";
                }
                strA = T.y.a(T.x.a(i14), interfaceC1734nR, 0);
                interfaceC1734nR.J();
            }
            interfaceC1734nR.J();
            aVar = S.Y.f10606b;
            if (S.Y.f(i6, aVar.b())) {
                interfaceC1734nR.T(1148862013);
                T.x.a aVar14 = T.x.f12882a;
                i13 = S.C0.f9935j;
            } else {
                if (S.Y.f(i6, aVar.a())) {
                    interfaceC1734nR.T(1148864764);
                    T.x.a aVar15 = T.x.f12882a;
                    i13 = S.C0.f9927b;
                } else {
                    interfaceC1734nR.T(1255139345);
                }
                interfaceC1734nR.J();
                str = java.lang.String.format(strA4, java.util.Arrays.copyOf(new java.lang.Object[]{strA2}, 1));
                p247y7.AbstractC7350t.e(str, "format(this, *args)");
                zS = interfaceC1734nR.S(str);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.N.b(str);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.N.b(str);
                    interfaceC1734nR.K(objG);
                }
                androidx.compose.ui.d dVarD3 = K0.n.d(dVar3, false, (p237x7.l) objG, 1, null);
                androidx.compose.ui.d dVar7 = dVar3;
                interfaceC1734n2 = interfaceC1734nR;
                S.m1.b(strA, dVarD3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, interfaceC1734n2, 0, 3072, 122876);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar7;
            }
            strA4 = T.y.a(T.x.a(i13), interfaceC1734nR, 0);
            interfaceC1734nR.J();
            str = java.lang.String.format(strA4, java.util.Arrays.copyOf(new java.lang.Object[]{strA2}, 1));
            p247y7.AbstractC7350t.e(str, "format(this, *args)");
            zS = interfaceC1734nR.S(str);
            objG = interfaceC1734nR.g();
            if (zS) {
                objG = new S.N.b(str);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.N.b(str);
                interfaceC1734nR.K(objG);
            }
            androidx.compose.ui.d dVarD4 = K0.n.d(dVar3, false, (p237x7.l) objG, 1, null);
            androidx.compose.ui.d dVar8 = dVar3;
            interfaceC1734n2 = interfaceC1734nR;
            S.m1.b(strA, dVarD4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, interfaceC1734n2, 0, 3072, 122876);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar8;
        } else {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1502835813, i12, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
            }
            java.util.Locale localeA3 = S.AbstractC1561o.a(interfaceC1734nR, 0);
            strA = S.P.a(q6, l6, localeA3, false, 4, null);
            strA2 = q6.a(l6, localeA3, true);
            interfaceC1734nR.T(1148835145);
            java.lang.String strA5 = "";
            if (strA2 == null) {
                aVar3 = S.Y.f10606b;
                if (S.Y.f(i6, aVar3.b())) {
                    interfaceC1734nR.T(1148842944);
                    T.x.a aVar16 = T.x.f12882a;
                    i15 = S.C0.f9937l;
                } else if (S.Y.f(i6, aVar3.a())) {
                    interfaceC1734nR.T(1148845915);
                    T.x.a aVar17 = T.x.f12882a;
                    i15 = S.C0.f9932g;
                } else {
                    interfaceC1734nR.T(1254558033);
                    interfaceC1734nR.J();
                    strA2 = "";
                }
                strA2 = T.y.a(T.x.a(i15), interfaceC1734nR, 0);
                interfaceC1734nR.J();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.T(1148850481);
            if (strA == null) {
                aVar2 = S.Y.f10606b;
                if (S.Y.f(i6, aVar2.b())) {
                    interfaceC1734nR.T(1148853330);
                    T.x.a aVar18 = T.x.f12882a;
                    i14 = S.C0.f9934i;
                } else if (S.Y.f(i6, aVar2.a())) {
                    interfaceC1734nR.T(1148855857);
                    T.x.a aVar19 = T.x.f12882a;
                    i14 = S.C0.f9926a;
                } else {
                    interfaceC1734nR.T(1254856625);
                    interfaceC1734nR.J();
                    strA = "";
                }
                strA = T.y.a(T.x.a(i14), interfaceC1734nR, 0);
                interfaceC1734nR.J();
            }
            interfaceC1734nR.J();
            aVar = S.Y.f10606b;
            if (S.Y.f(i6, aVar.b())) {
                interfaceC1734nR.T(1148862013);
                T.x.a aVar110 = T.x.f12882a;
                i13 = S.C0.f9935j;
            } else {
                if (S.Y.f(i6, aVar.a())) {
                    interfaceC1734nR.T(1148864764);
                    T.x.a aVar111 = T.x.f12882a;
                    i13 = S.C0.f9927b;
                } else {
                    interfaceC1734nR.T(1255139345);
                }
                interfaceC1734nR.J();
                str = java.lang.String.format(strA5, java.util.Arrays.copyOf(new java.lang.Object[]{strA2}, 1));
                p247y7.AbstractC7350t.e(str, "format(this, *args)");
                zS = interfaceC1734nR.S(str);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.N.b(str);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.N.b(str);
                    interfaceC1734nR.K(objG);
                }
                androidx.compose.ui.d dVarD5 = K0.n.d(dVar3, false, (p237x7.l) objG, 1, null);
                androidx.compose.ui.d dVar9 = dVar3;
                interfaceC1734n2 = interfaceC1734nR;
                S.m1.b(strA, dVarD5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, interfaceC1734n2, 0, 3072, 122876);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar9;
            }
            strA5 = T.y.a(T.x.a(i13), interfaceC1734nR, 0);
            interfaceC1734nR.J();
            str = java.lang.String.format(strA5, java.util.Arrays.copyOf(new java.lang.Object[]{strA2}, 1));
            p247y7.AbstractC7350t.e(str, "format(this, *args)");
            zS = interfaceC1734nR.S(str);
            objG = interfaceC1734nR.g();
            if (zS) {
                objG = new S.N.b(str);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.N.b(str);
                interfaceC1734nR.K(objG);
            }
            androidx.compose.ui.d dVarD6 = K0.n.d(dVar3, false, (p237x7.l) objG, 1, null);
            androidx.compose.ui.d dVar10 = dVar3;
            interfaceC1734n2 = interfaceC1734nR;
            S.m1.b(strA, dVarD6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, interfaceC1734n2, 0, 3072, 122876);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar10;
        }
        interfaceC1709e1X = interfaceC1734n2.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.N.c(l6, i6, q6, dVar4, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public final void b(int i6, androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        androidx.compose.ui.d dVar3;
        S.Y.a aVar;
        V.InterfaceC1734n interfaceC1734n2;
        int i14;
        androidx.compose.ui.d dVar4;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(327413563);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = i10 | (interfaceC1734nR.i(i6) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= interfaceC1734nR.S(dVar2) ? 32 : 16;
            }
            i13 = i12;
            if ((i13 & 19) == 18 || !interfaceC1734nR.u()) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(327413563, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
                }
                aVar = S.Y.f10606b;
                if (S.Y.f(i6, aVar.b())) {
                    interfaceC1734nR.T(406439148);
                    T.x.a aVar2 = T.x.f12882a;
                    i14 = S.C0.f9946u;
                } else {
                    if (S.Y.f(i6, aVar.a())) {
                        interfaceC1734nR.T(406443211);
                        T.x.a aVar3 = T.x.f12882a;
                        i14 = S.C0.f9933h;
                    } else {
                        interfaceC1734n2 = interfaceC1734nR;
                        interfaceC1734n2.T(-285079389);
                    }
                    interfaceC1734n2.J();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                }
                interfaceC1734n2 = interfaceC1734nR;
                S.m1.b(T.y.a(T.x.a(i14), interfaceC1734nR, 0), dVar3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1734n2, i13 & 112, 0, 131068);
                interfaceC1734n2.J();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            } else {
                interfaceC1734nR.A();
                interfaceC1734n2 = interfaceC1734nR;
                dVar4 = dVar2;
            }
            interfaceC1709e1X = interfaceC1734n2.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.N.d(i6, dVar4, i10, i11));
            }
        }
        i12 |= 48;
        dVar2 = dVar;
        i13 = i12;
        if ((i13 & 19) == 18) {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(327413563, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
            }
            aVar = S.Y.f10606b;
            if (S.Y.f(i6, aVar.b())) {
                interfaceC1734nR.T(406439148);
                T.x.a aVar4 = T.x.f12882a;
                i14 = S.C0.f9946u;
            } else {
                if (S.Y.f(i6, aVar.a())) {
                    interfaceC1734nR.T(406443211);
                    T.x.a aVar5 = T.x.f12882a;
                    i14 = S.C0.f9933h;
                } else {
                    interfaceC1734n2 = interfaceC1734nR;
                    interfaceC1734n2.T(-285079389);
                }
                interfaceC1734n2.J();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            }
            interfaceC1734n2 = interfaceC1734nR;
            S.m1.b(T.y.a(T.x.a(i14), interfaceC1734nR, 0), dVar3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1734n2, i13 & 112, 0, 131068);
            interfaceC1734n2.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
        } else {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(327413563, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
            }
            aVar = S.Y.f10606b;
            if (S.Y.f(i6, aVar.b())) {
                interfaceC1734nR.T(406439148);
                T.x.a aVar6 = T.x.f12882a;
                i14 = S.C0.f9946u;
            } else {
                if (S.Y.f(i6, aVar.a())) {
                    interfaceC1734nR.T(406443211);
                    T.x.a aVar7 = T.x.f12882a;
                    i14 = S.C0.f9933h;
                } else {
                    interfaceC1734n2 = interfaceC1734nR;
                    interfaceC1734n2.T(-285079389);
                }
                interfaceC1734n2.J();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
            }
            interfaceC1734n2 = interfaceC1734nR;
            S.m1.b(T.y.a(T.x.a(i14), interfaceC1734nR, 0), dVar3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1734n2, i13 & 112, 0, 131068);
            interfaceC1734n2.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
        }
        interfaceC1709e1X = interfaceC1734n2.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.N.d(i6, dVar4, i10, i11));
        }
    }

    public final S.M c(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-275219611, i6, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
        }
        S.M mG = g(S.C1562o0.f11478a.a(interfaceC1734n, 6), interfaceC1734n, (i6 << 3) & 112);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return mG;
    }

    public final S.Q d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new S.S(str, str2, str3);
    }

    public final S.P0 f() {
        return f10179d;
    }

    public final S.M g(S.C1591z c1591z, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1180555308, i6, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
        }
        S.M mF = c1591z.f();
        interfaceC1734n.T(-653681037);
        if (mF == null) {
            U.C1683f c1683f = U.C1683f.f13870a;
            mF = new S.M(S.A.f(c1591z, c1683f.a()), S.A.f(c1591z, c1683f.r()), S.A.f(c1591z, c1683f.p()), S.A.f(c1591z, c1683f.D()), S.A.f(c1591z, c1683f.u()), c1591z.E(), S.A.f(c1591z, c1683f.C()), p141o0.C7016y0.m(S.A.f(c1591z, c1683f.C()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), S.A.f(c1591z, c1683f.m()), S.A.f(c1591z, c1683f.A()), p141o0.C7016y0.m(S.A.f(c1591z, c1683f.A()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), S.A.f(c1591z, c1683f.z()), p141o0.C7016y0.m(S.A.f(c1591z, c1683f.z()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), S.A.f(c1591z, c1683f.n()), p141o0.C7016y0.m(S.A.f(c1591z, c1683f.n()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), S.A.f(c1591z, c1683f.h()), p141o0.C7016y0.m(S.A.f(c1591z, c1683f.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), S.A.f(c1591z, c1683f.g()), p141o0.C7016y0.m(S.A.f(c1591z, c1683f.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), S.A.f(c1591z, c1683f.m()), S.A.f(c1591z, c1683f.k()), S.A.f(c1591z, c1683f.t()), S.A.f(c1591z, c1683f.v()), S.A.f(c1591z, U.C1685h.f13911a.a()), S.C1588x0.f11946a.f(c1591z, interfaceC1734n, (i6 & 14) | 48), null);
            c1591z.e0(mF);
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return mF;
    }

    public final p141o0.e2 h(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(700927667, i6, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
        }
        p141o0.e2 e2VarE = S.T0.e(U.C1683f.f13870a.c(), interfaceC1734n, 6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return e2VarE;
    }

    public final float i() {
        return f10178c;
    }

    public final E7.i j() {
        return f10177b;
    }

    public final p230x.p k(B.D d6, p200u.B b6, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 2) != 0) {
            b6 = p200u.D.c(0.0f, 0.0f, 3, null);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-2036003494, i6, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
        }
        boolean zS = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(d6)) || (i6 & 6) == 4) | interfaceC1734n.S(b6);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = p240y.h.n(new S.N.e(p240y.f.b(d6, null, 2, null)), b6, p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null));
            interfaceC1734n.K(objG);
        }
        p230x.F f6 = (p230x.F) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return f6;
    }
}
