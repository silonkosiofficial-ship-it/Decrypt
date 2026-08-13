package S;

/* JADX INFO: renamed from: S.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1587x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f11910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11911b = Y0.i.q(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f11912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f11913d;

    /* JADX INFO: renamed from: S.x$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f11914D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f11915E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar, boolean z6) {
            super(0);
            this.f11914D = lVar;
            this.f11915E = z6;
        }

        public final void a() {
            this.f11914D.l(java.lang.Boolean.valueOf(!this.f11915E));
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.x$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f11916D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f11917E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11918F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f11919G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.C1583v f11920H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.l f11921I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f11922J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f11923K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, p237x7.l lVar, androidx.compose.ui.d dVar, boolean z10, S.C1583v c1583v, p250z.l lVar2, int i6, int i10) {
            super(2);
            this.f11916D = z6;
            this.f11917E = lVar;
            this.f11918F = dVar;
            this.f11919G = z10;
            this.f11920H = c1583v;
            this.f11921I = lVar2;
            this.f11922J = i6;
            this.f11923K = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1587x.a(this.f11916D, this.f11917E, this.f11918F, this.f11919G, this.f11920H, this.f11921I, interfaceC1734n, V.S0.a(this.f11922J | 1), this.f11923K);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.x$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f11924D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.G1 f11925E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ V.G1 f11926F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.G1 f11927G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ V.G1 f11928H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ S.C1581u f11929I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V.G1 g6, V.G1 g10, V.G1 g11, V.G1 g12, V.G1 g13, S.C1581u c1581u) {
            super(1);
            this.f11924D = g6;
            this.f11925E = g10;
            this.f11926F = g11;
            this.f11927G = g12;
            this.f11928H = g13;
            this.f11929I = c1581u;
        }

        public final void a(p161q0.g gVar) {
            float fFloor = (float) java.lang.Math.floor(gVar.B0(S.AbstractC1587x.f11912c));
            S.AbstractC1587x.i(gVar, ((p141o0.C7016y0) this.f11924D.getValue()).w(), ((p141o0.C7016y0) this.f11925E.getValue()).w(), gVar.B0(S.AbstractC1587x.f11913d), fFloor);
            S.AbstractC1587x.j(gVar, ((p141o0.C7016y0) this.f11926F.getValue()).w(), ((java.lang.Number) this.f11927G.getValue()).floatValue(), ((java.lang.Number) this.f11928H.getValue()).floatValue(), fFloor, this.f11929I);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.x$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f11930D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ L0.a f11931E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11932F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ S.C1583v f11933G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f11934H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z6, L0.a aVar, androidx.compose.ui.d dVar, S.C1583v c1583v, int i6) {
            super(2);
            this.f11930D = z6;
            this.f11931E = aVar;
            this.f11932F = dVar;
            this.f11933G = c1583v;
            this.f11934H = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1587x.b(this.f11930D, this.f11931E, this.f11932F, this.f11933G, interfaceC1734n, V.S0.a(this.f11934H | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.x$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.AbstractC1587x.e f11935D = new S.AbstractC1587x.e();

        e() {
            super(3);
        }

        public final p200u.I a(u.s0.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            p200u.I iG;
            interfaceC1734n.T(-1324481169);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1324481169, i6, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:293)");
            }
            java.lang.Object objB = bVar.b();
            L0.a aVar = L0.a.Off;
            if (objB == aVar) {
                iG = p200u.AbstractC7177k.h(0, 1, null);
            } else {
                iG = bVar.d() == aVar ? p200u.AbstractC7177k.g(100) : p200u.AbstractC7177k.l(100, 0, null, 6, null);
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return iG;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((u.s0.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: S.x$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.AbstractC1587x.f f11936D = new S.AbstractC1587x.f();

        f() {
            super(3);
        }

        public final p200u.I a(u.s0.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            p200u.I iG;
            interfaceC1734n.T(1373301606);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1373301606, i6, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:276)");
            }
            java.lang.Object objB = bVar.b();
            L0.a aVar = L0.a.Off;
            if (objB == aVar) {
                iG = p200u.AbstractC7177k.l(100, 0, null, 6, null);
            } else {
                iG = bVar.d() == aVar ? p200u.AbstractC7177k.g(100) : p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return iG;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((u.s0.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: S.x$g */
    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ L0.a f11937D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f11938E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11939F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f11940G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.C1583v f11941H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.l f11942I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f11943J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f11944K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(L0.a aVar, p237x7.a aVar2, androidx.compose.ui.d dVar, boolean z6, S.C1583v c1583v, p250z.l lVar, int i6, int i10) {
            super(2);
            this.f11937D = aVar;
            this.f11938E = aVar2;
            this.f11939F = dVar;
            this.f11940G = z6;
            this.f11941H = c1583v;
            this.f11942I = lVar;
            this.f11943J = i6;
            this.f11944K = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1587x.c(this.f11937D, this.f11938E, this.f11939F, this.f11940G, this.f11941H, this.f11942I, interfaceC1734n, V.S0.a(this.f11943J | 1), this.f11944K);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S.x$h */
    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11945a;

        static {
            int[] iArr = new int[L0.a.values().length];
            try {
                iArr[L0.a.On.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[L0.a.Off.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[L0.a.Indeterminate.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f11945a = iArr;
        }
    }

    static {
        float f6 = 2;
        f11910a = Y0.i.q(f6);
        f11912c = Y0.i.q(f6);
        f11913d = Y0.i.q(f6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0178  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df A[PHI: r4 r9 r11 r12
  0x00df: PHI (r4v23 int) = (r4v18 int), (r4v17 int), (r4v24 int) binds: [B:90:0x0100, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r9v9 androidx.compose.ui.d) = (r9v3 androidx.compose.ui.d), (r9v2 androidx.compose.ui.d), (r9v2 androidx.compose.ui.d) binds: [B:90:0x0100, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r11v8 boolean) = (r11v3 boolean), (r11v2 boolean), (r11v2 boolean) binds: [B:90:0x0100, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r12v11 S.v) = (r12v7 S.v), (r12v6 S.v), (r12v6 S.v) binds: [B:90:0x0100, B:79:0x00db, B:80:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x00c2, please report this as an issue */
    public static final void a(boolean z6, p237x7.l lVar, androidx.compose.ui.d dVar, boolean z10, S.C1583v c1583v, p250z.l lVar2, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        boolean z11;
        int i13;
        S.C1583v c1583vA;
        int i14;
        p250z.l lVar3;
        int i15;
        boolean z12;
        S.C1583v c1583v2;
        p250z.l lVar4;
        int i16;
        p237x7.a aVar;
        boolean z13;
        S.C1583v c1583v3;
        p250z.l lVar5;
        boolean z14;
        boolean z15;
        java.lang.Object objG;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1406741137);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.d(z6) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(lVar) ? 32 : 16;
        }
        int i17 = i10 & 4;
        if (i17 == 0) {
            if ((i6 & 384) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i6 & 3072) == 0) {
                    z11 = z10;
                    if (interfaceC1734nR.d(z11)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                if ((i6 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        c1583vA = c1583v;
                        int i18 = interfaceC1734nR.S(c1583vA) ? 16384 : 8192;
                        i11 |= i18;
                    } else {
                        c1583vA = c1583v;
                    }
                    i11 |= i18;
                } else {
                    c1583vA = c1583v;
                }
                i14 = i10 & 32;
                if (i14 != 0) {
                    if ((196608 & i6) == 0) {
                        lVar3 = lVar2;
                        if (interfaceC1734nR.S(lVar3)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i11 |= i15;
                    }
                    if ((74899 & i11) == 74898 || !interfaceC1734nR.u()) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                            if (i17 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            }
                            if (i12 != 0) {
                                z11 = true;
                            }
                            if ((i10 & 16) != 0) {
                                i11 &= -57345;
                                c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                            }
                            if (i14 != 0) {
                                z12 = z11;
                                c1583v2 = c1583vA;
                                lVar4 = null;
                            }
                            androidx.compose.ui.d dVar3 = dVar2;
                            i16 = i11;
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                            }
                            L0.a aVarA = L0.b.a(z6);
                            interfaceC1734nR.T(1046936362);
                            if (lVar != null) {
                                if ((i16 & 112) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z14 | ((i16 & 14) == 4);
                                objG = interfaceC1734nR.g();
                                if (z15 || objG == V.InterfaceC1734n.f14931a.a()) {
                                    objG = new S.AbstractC1587x.a(lVar, z6);
                                    interfaceC1734nR.K(objG);
                                }
                                aVar = (p237x7.a) objG;
                            } else {
                                aVar = null;
                            }
                            interfaceC1734nR.J();
                            c(aVarA, aVar, dVar3, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            dVar2 = dVar3;
                            z13 = z12;
                            c1583v3 = c1583v2;
                            lVar5 = lVar4;
                        } else {
                            interfaceC1734nR.A();
                            if ((i10 & 16) != 0) {
                                i11 &= -57345;
                            }
                        }
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                        androidx.compose.ui.d dVar4 = dVar2;
                        i16 = i11;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                        }
                        L0.a aVarA2 = L0.b.a(z6);
                        interfaceC1734nR.T(1046936362);
                        if (lVar != null) {
                            if ((i16 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | ((i16 & 14) == 4);
                            objG = interfaceC1734nR.g();
                            if (z15) {
                                objG = new S.AbstractC1587x.a(lVar, z6);
                                interfaceC1734nR.K(objG);
                            } else {
                                objG = new S.AbstractC1587x.a(lVar, z6);
                                interfaceC1734nR.K(objG);
                            }
                            aVar = (p237x7.a) objG;
                        } else {
                            aVar = null;
                        }
                        interfaceC1734nR.J();
                        c(aVarA2, aVar, dVar4, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar2 = dVar4;
                        z13 = z12;
                        c1583v3 = c1583v2;
                        lVar5 = lVar4;
                    } else {
                        interfaceC1734nR.A();
                        z13 = z11;
                        c1583v3 = c1583vA;
                        lVar5 = lVar3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
                    }
                }
                i11 |= 196608;
                lVar3 = lVar2;
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    }
                    androidx.compose.ui.d dVar5 = dVar2;
                    i16 = i11;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                    }
                    L0.a aVarA3 = L0.b.a(z6);
                    interfaceC1734nR.T(1046936362);
                    if (lVar != null) {
                        if ((i16 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i16 & 14) == 4);
                        objG = interfaceC1734nR.g();
                        if (z15) {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        }
                        aVar = (p237x7.a) objG;
                    } else {
                        aVar = null;
                    }
                    interfaceC1734nR.J();
                    c(aVarA3, aVar, dVar5, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar5;
                    z13 = z12;
                    c1583v3 = c1583v2;
                    lVar5 = lVar4;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    }
                    androidx.compose.ui.d dVar6 = dVar2;
                    i16 = i11;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                    }
                    L0.a aVarA4 = L0.b.a(z6);
                    interfaceC1734nR.T(1046936362);
                    if (lVar != null) {
                        if ((i16 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i16 & 14) == 4);
                        objG = interfaceC1734nR.g();
                        if (z15) {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        }
                        aVar = (p237x7.a) objG;
                    } else {
                        aVar = null;
                    }
                    interfaceC1734nR.J();
                    c(aVarA4, aVar, dVar6, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar6;
                    z13 = z12;
                    c1583v3 = c1583v2;
                    lVar5 = lVar4;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
                }
            }
            i11 |= 3072;
            z11 = z10;
            if ((i6 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    c1583vA = c1583v;
                    if (interfaceC1734nR.S(c1583vA)) {
                    }
                    i11 |= i18;
                } else {
                    c1583vA = c1583v;
                }
                i11 |= i18;
            } else {
                c1583vA = c1583v;
            }
            i14 = i10 & 32;
            if (i14 != 0) {
                if ((196608 & i6) == 0) {
                    lVar3 = lVar2;
                    if (interfaceC1734nR.S(lVar3)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i11 |= i15;
                }
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    }
                    androidx.compose.ui.d dVar7 = dVar2;
                    i16 = i11;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                    }
                    L0.a aVarA5 = L0.b.a(z6);
                    interfaceC1734nR.T(1046936362);
                    if (lVar != null) {
                        if ((i16 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i16 & 14) == 4);
                        objG = interfaceC1734nR.g();
                        if (z15) {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        }
                        aVar = (p237x7.a) objG;
                    } else {
                        aVar = null;
                    }
                    interfaceC1734nR.J();
                    c(aVarA5, aVar, dVar7, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar7;
                    z13 = z12;
                    c1583v3 = c1583v2;
                    lVar5 = lVar4;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    }
                    androidx.compose.ui.d dVar8 = dVar2;
                    i16 = i11;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                    }
                    L0.a aVarA6 = L0.b.a(z6);
                    interfaceC1734nR.T(1046936362);
                    if (lVar != null) {
                        if ((i16 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i16 & 14) == 4);
                        objG = interfaceC1734nR.g();
                        if (z15) {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        }
                        aVar = (p237x7.a) objG;
                    } else {
                        aVar = null;
                    }
                    interfaceC1734nR.J();
                    c(aVarA6, aVar, dVar8, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar8;
                    z13 = z12;
                    c1583v3 = c1583v2;
                    lVar5 = lVar4;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
                }
            }
            i11 |= 196608;
            lVar3 = lVar2;
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                }
                androidx.compose.ui.d dVar9 = dVar2;
                i16 = i11;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                }
                L0.a aVarA7 = L0.b.a(z6);
                interfaceC1734nR.T(1046936362);
                if (lVar != null) {
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i16 & 14) == 4);
                    objG = interfaceC1734nR.g();
                    if (z15) {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    }
                    aVar = (p237x7.a) objG;
                } else {
                    aVar = null;
                }
                interfaceC1734nR.J();
                c(aVarA7, aVar, dVar9, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar9;
                z13 = z12;
                c1583v3 = c1583v2;
                lVar5 = lVar4;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                }
                androidx.compose.ui.d dVar10 = dVar2;
                i16 = i11;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                }
                L0.a aVarA8 = L0.b.a(z6);
                interfaceC1734nR.T(1046936362);
                if (lVar != null) {
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i16 & 14) == 4);
                    objG = interfaceC1734nR.g();
                    if (z15) {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    }
                    aVar = (p237x7.a) objG;
                } else {
                    aVar = null;
                }
                interfaceC1734nR.J();
                c(aVarA8, aVar, dVar10, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar10;
                z13 = z12;
                c1583v3 = c1583v2;
                lVar5 = lVar4;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
            }
        }
        i11 |= 384;
        dVar2 = dVar;
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i6 & 3072) == 0) {
                z11 = z10;
                if (interfaceC1734nR.d(z11)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            if ((i6 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    c1583vA = c1583v;
                    if (interfaceC1734nR.S(c1583vA)) {
                    }
                    i11 |= i18;
                } else {
                    c1583vA = c1583v;
                }
                i11 |= i18;
            } else {
                c1583vA = c1583v;
            }
            i14 = i10 & 32;
            if (i14 != 0) {
                if ((196608 & i6) == 0) {
                    lVar3 = lVar2;
                    if (interfaceC1734nR.S(lVar3)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i11 |= i15;
                }
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    }
                    androidx.compose.ui.d dVar11 = dVar2;
                    i16 = i11;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                    }
                    L0.a aVarA9 = L0.b.a(z6);
                    interfaceC1734nR.T(1046936362);
                    if (lVar != null) {
                        if ((i16 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i16 & 14) == 4);
                        objG = interfaceC1734nR.g();
                        if (z15) {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        }
                        aVar = (p237x7.a) objG;
                    } else {
                        aVar = null;
                    }
                    interfaceC1734nR.J();
                    c(aVarA9, aVar, dVar11, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar11;
                    z13 = z12;
                    c1583v3 = c1583v2;
                    lVar5 = lVar4;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = null;
                        } else {
                            z12 = z11;
                            c1583v2 = c1583vA;
                            lVar4 = lVar3;
                        }
                    }
                    androidx.compose.ui.d dVar12 = dVar2;
                    i16 = i11;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                    }
                    L0.a aVarA10 = L0.b.a(z6);
                    interfaceC1734nR.T(1046936362);
                    if (lVar != null) {
                        if ((i16 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i16 & 14) == 4);
                        objG = interfaceC1734nR.g();
                        if (z15) {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.AbstractC1587x.a(lVar, z6);
                            interfaceC1734nR.K(objG);
                        }
                        aVar = (p237x7.a) objG;
                    } else {
                        aVar = null;
                    }
                    interfaceC1734nR.J();
                    c(aVarA10, aVar, dVar12, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar12;
                    z13 = z12;
                    c1583v3 = c1583v2;
                    lVar5 = lVar4;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
                }
            }
            i11 |= 196608;
            lVar3 = lVar2;
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                }
                androidx.compose.ui.d dVar13 = dVar2;
                i16 = i11;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                }
                L0.a aVarA11 = L0.b.a(z6);
                interfaceC1734nR.T(1046936362);
                if (lVar != null) {
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i16 & 14) == 4);
                    objG = interfaceC1734nR.g();
                    if (z15) {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    }
                    aVar = (p237x7.a) objG;
                } else {
                    aVar = null;
                }
                interfaceC1734nR.J();
                c(aVarA11, aVar, dVar13, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar13;
                z13 = z12;
                c1583v3 = c1583v2;
                lVar5 = lVar4;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                }
                androidx.compose.ui.d dVar14 = dVar2;
                i16 = i11;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                }
                L0.a aVarA12 = L0.b.a(z6);
                interfaceC1734nR.T(1046936362);
                if (lVar != null) {
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i16 & 14) == 4);
                    objG = interfaceC1734nR.g();
                    if (z15) {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    }
                    aVar = (p237x7.a) objG;
                } else {
                    aVar = null;
                }
                interfaceC1734nR.J();
                c(aVarA12, aVar, dVar14, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar14;
                z13 = z12;
                c1583v3 = c1583v2;
                lVar5 = lVar4;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
            }
        }
        i11 |= 3072;
        z11 = z10;
        if ((i6 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                c1583vA = c1583v;
                if (interfaceC1734nR.S(c1583vA)) {
                }
                i11 |= i18;
            } else {
                c1583vA = c1583v;
            }
            i11 |= i18;
        } else {
            c1583vA = c1583v;
        }
        i14 = i10 & 32;
        if (i14 != 0) {
            if ((196608 & i6) == 0) {
                lVar3 = lVar2;
                if (interfaceC1734nR.S(lVar3)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i11 |= i15;
            }
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                }
                androidx.compose.ui.d dVar15 = dVar2;
                i16 = i11;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                }
                L0.a aVarA13 = L0.b.a(z6);
                interfaceC1734nR.T(1046936362);
                if (lVar != null) {
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i16 & 14) == 4);
                    objG = interfaceC1734nR.g();
                    if (z15) {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    }
                    aVar = (p237x7.a) objG;
                } else {
                    aVar = null;
                }
                interfaceC1734nR.J();
                c(aVarA13, aVar, dVar15, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar15;
                z13 = z12;
                c1583v3 = c1583v2;
                lVar5 = lVar4;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = null;
                    } else {
                        z12 = z11;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    }
                }
                androidx.compose.ui.d dVar16 = dVar2;
                i16 = i11;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
                }
                L0.a aVarA14 = L0.b.a(z6);
                interfaceC1734nR.T(1046936362);
                if (lVar != null) {
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i16 & 14) == 4);
                    objG = interfaceC1734nR.g();
                    if (z15) {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.AbstractC1587x.a(lVar, z6);
                        interfaceC1734nR.K(objG);
                    }
                    aVar = (p237x7.a) objG;
                } else {
                    aVar = null;
                }
                interfaceC1734nR.J();
                c(aVarA14, aVar, dVar16, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar16;
                z13 = z12;
                c1583v3 = c1583v2;
                lVar5 = lVar4;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
            }
        }
        i11 |= 196608;
        lVar3 = lVar2;
        if ((74899 & i11) == 74898) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = null;
                } else {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
            } else {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = null;
                } else {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
            }
            androidx.compose.ui.d dVar17 = dVar2;
            i16 = i11;
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
            }
            L0.a aVarA15 = L0.b.a(z6);
            interfaceC1734nR.T(1046936362);
            if (lVar != null) {
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | ((i16 & 14) == 4);
                objG = interfaceC1734nR.g();
                if (z15) {
                    objG = new S.AbstractC1587x.a(lVar, z6);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1587x.a(lVar, z6);
                    interfaceC1734nR.K(objG);
                }
                aVar = (p237x7.a) objG;
            } else {
                aVar = null;
            }
            interfaceC1734nR.J();
            c(aVarA15, aVar, dVar17, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar2 = dVar17;
            z13 = z12;
            c1583v3 = c1583v2;
            lVar5 = lVar4;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = null;
                } else {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
            } else {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = null;
                } else {
                    z12 = z11;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
            }
            androidx.compose.ui.d dVar18 = dVar2;
            i16 = i11;
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1406741137, i16, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
            }
            L0.a aVarA16 = L0.b.a(z6);
            interfaceC1734nR.T(1046936362);
            if (lVar != null) {
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | ((i16 & 14) == 4);
                objG = interfaceC1734nR.g();
                if (z15) {
                    objG = new S.AbstractC1587x.a(lVar, z6);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.AbstractC1587x.a(lVar, z6);
                    interfaceC1734nR.K(objG);
                }
                aVar = (p237x7.a) objG;
            } else {
                aVar = null;
            }
            interfaceC1734nR.J();
            c(aVarA16, aVar, dVar18, z12, c1583v2, lVar4, interfaceC1734nR, i16 & 524160, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar2 = dVar18;
            z13 = z12;
            c1583v3 = c1583v2;
            lVar5 = lVar4;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1587x.b(z6, lVar, dVar2, z13, c1583v3, lVar5, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static final void b(boolean z6, L0.a aVar, androidx.compose.ui.d dVar, S.C1583v c1583v, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        float f6;
        float f10;
        int i11;
        float f11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(2007131616);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.d(z6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(aVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.S(dVar) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= interfaceC1734nR.S(c1583v) ? 2048 : 1024;
        }
        int i12 = i10;
        if ((i12 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2007131616, i12, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:271)");
            }
            int i13 = i12 >> 3;
            int i14 = i13 & 14;
            p200u.s0 s0VarG = p200u.u0.g(aVar, null, interfaceC1734nR, i14, 2);
            S.AbstractC1587x.f fVar = S.AbstractC1587x.f.f11936D;
            p247y7.C7344m c7344m = p247y7.C7344m.f57303a;
            p200u.x0 x0VarI = p200u.z0.i(c7344m);
            L0.a aVar2 = (L0.a) s0VarG.i();
            interfaceC1734nR.T(1800065638);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
            }
            int[] iArr = S.AbstractC1587x.h.f11945a;
            int i15 = iArr[aVar2.ordinal()];
            float f12 = 0.0f;
            if (i15 == 1) {
                f6 = 1.0f;
            } else if (i15 != 2) {
                if (i15 != 3) {
                    throw new p087i7.s();
                }
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf = java.lang.Float.valueOf(f6);
            L0.a aVar3 = (L0.a) s0VarG.p();
            interfaceC1734nR.T(1800065638);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
            }
            int i16 = iArr[aVar3.ordinal()];
            if (i16 == 1) {
                f10 = 1.0f;
            } else if (i16 != 2) {
                if (i16 != 3) {
                    throw new p087i7.s();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            V.G1 g1D = p200u.u0.d(s0VarG, fValueOf, java.lang.Float.valueOf(f10), (p200u.I) fVar.j(s0VarG.n(), interfaceC1734nR, 0), x0VarI, "FloatAnimation", interfaceC1734nR, 0);
            S.AbstractC1587x.e eVar = S.AbstractC1587x.e.f11935D;
            p200u.x0 x0VarI2 = p200u.z0.i(c7344m);
            L0.a aVar4 = (L0.a) s0VarG.i();
            interfaceC1734nR.T(-1426969489);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
            }
            int i17 = iArr[aVar4.ordinal()];
            if (i17 == 1 || i17 == 2) {
                i11 = 3;
                f11 = 0.0f;
            } else {
                i11 = 3;
                if (i17 != 3) {
                    throw new p087i7.s();
                }
                f11 = 1.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f11);
            L0.a aVar5 = (L0.a) s0VarG.p();
            interfaceC1734nR.T(-1426969489);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
            }
            int i18 = iArr[aVar5.ordinal()];
            if (i18 != 1 && i18 != 2) {
                if (i18 != i11) {
                    throw new p087i7.s();
                }
                f12 = 1.0f;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734nR.J();
            V.G1 g1D2 = p200u.u0.d(s0VarG, fValueOf2, java.lang.Float.valueOf(f12), (p200u.I) eVar.j(s0VarG.n(), interfaceC1734nR, 0), x0VarI2, "FloatAnimation", interfaceC1734nR, 0);
            java.lang.Object objG = interfaceC1734nR.g();
            V.InterfaceC1734n.a aVar6 = V.InterfaceC1734n.f14931a;
            if (objG == aVar6.a()) {
                objG = new S.C1581u(null, null, null, 7, null);
                interfaceC1734nR.K(objG);
            }
            S.C1581u c1581u = (S.C1581u) objG;
            V.G1 g1C = c1583v.c(aVar, interfaceC1734nR, i14 | ((i12 >> 6) & 112));
            int i19 = (i13 & 896) | (i12 & 126);
            V.G1 g1B = c1583v.b(z6, aVar, interfaceC1734nR, i19);
            V.G1 g1A = c1583v.a(z6, aVar, interfaceC1734nR, i19);
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.p.z(dVar, p071h0.c.f45778a.e(), false, 2, null), f11911b);
            boolean zS = interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C) | interfaceC1734nR.S(g1D) | interfaceC1734nR.S(g1D2);
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (zS || objG2 == aVar6.a()) {
                objG2 = new S.AbstractC1587x.c(g1B, g1A, g1C, g1D, g1D2, c1581u);
                interfaceC1734nR.K(objG2);
            }
            p210v.AbstractC7215i.a(dVarK, (p237x7.l) objG2, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1587x.d(z6, aVar, dVar, c1583v, i6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x016a  */
    /* JADX WARN: Code duplicated, block: B:106:0x019b  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static final void c(L0.a aVar, p237x7.a aVar2, androidx.compose.ui.d dVar, boolean z6, S.C1583v c1583v, p250z.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        boolean z10;
        int i13;
        S.C1583v c1583vA;
        int i14;
        p250z.l lVar2;
        int i15;
        p250z.l lVar3;
        int i16;
        androidx.compose.ui.d dVarA;
        androidx.compose.ui.d dVarB;
        androidx.compose.ui.d dVar3;
        boolean z11;
        S.C1583v c1583v2;
        p250z.l lVar4;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1608358065);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(aVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(aVar2) ? 32 : 16;
        }
        int i17 = i10 & 4;
        if (i17 == 0) {
            if ((i6 & 384) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i6 & 3072) == 0) {
                    z10 = z6;
                    if (interfaceC1734nR.d(z10)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                if ((i6 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        c1583vA = c1583v;
                        int i18 = interfaceC1734nR.S(c1583vA) ? 16384 : 8192;
                        i11 |= i18;
                    } else {
                        c1583vA = c1583v;
                    }
                    i11 |= i18;
                } else {
                    c1583vA = c1583v;
                }
                i14 = i10 & 32;
                if (i14 != 0) {
                    if ((196608 & i6) == 0) {
                        lVar2 = lVar;
                        if (interfaceC1734nR.S(lVar2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i11 |= i15;
                    }
                    if ((74899 & i11) == 74898 || !interfaceC1734nR.u()) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                            if (i17 != 0) {
                                dVar2 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar2 = dVar2;
                            }
                            if (i12 != 0) {
                                z10 = true;
                            }
                            if ((i10 & 16) != 0) {
                                i11 &= -57345;
                                c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                            }
                            if (i14 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar2;
                            }
                            i16 = i11;
                        } else {
                            interfaceC1734nR.A();
                            if ((i10 & 16) != 0) {
                                i11 &= -57345;
                            }
                            i16 = i11;
                            z10 = z10;
                            c1583vA = c1583vA;
                            lVar3 = lVar2;
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                        }
                        interfaceC1734nR.T(-97239746);
                        if (aVar2 != null) {
                            dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                        } else {
                            dVarA = androidx.compose.ui.d.f19586a;
                        }
                        interfaceC1734nR.J();
                        dVarB = androidx.compose.ui.d.f19586a;
                        if (aVar2 != null) {
                            dVarB = S.AbstractC1554k0.b(dVarB);
                        }
                        b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar3 = dVar2;
                        z11 = z10;
                        c1583v2 = c1583vA;
                        lVar4 = lVar3;
                    } else {
                        interfaceC1734nR.A();
                        dVar3 = dVar2;
                        z11 = z10;
                        c1583v2 = c1583vA;
                        interfaceC1734nR = interfaceC1734nR;
                        lVar4 = lVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
                    }
                }
                i11 |= 196608;
                lVar2 = lVar;
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                    }
                    interfaceC1734nR.T(-97239746);
                    if (aVar2 != null) {
                        dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                    } else {
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar2 != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar3 = dVar2;
                    z11 = z10;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                    }
                    interfaceC1734nR.T(-97239746);
                    if (aVar2 != null) {
                        dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                    } else {
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar2 != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar3 = dVar2;
                    z11 = z10;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
                }
            }
            i11 |= 3072;
            z10 = z6;
            if ((i6 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    c1583vA = c1583v;
                    if (interfaceC1734nR.S(c1583vA)) {
                    }
                    i11 |= i18;
                } else {
                    c1583vA = c1583v;
                }
                i11 |= i18;
            } else {
                c1583vA = c1583v;
            }
            i14 = i10 & 32;
            if (i14 != 0) {
                if ((196608 & i6) == 0) {
                    lVar2 = lVar;
                    if (interfaceC1734nR.S(lVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i11 |= i15;
                }
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                    }
                    interfaceC1734nR.T(-97239746);
                    if (aVar2 != null) {
                        dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                    } else {
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar2 != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar3 = dVar2;
                    z11 = z10;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                    }
                    interfaceC1734nR.T(-97239746);
                    if (aVar2 != null) {
                        dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                    } else {
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar2 != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar3 = dVar2;
                    z11 = z10;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
                }
            }
            i11 |= 196608;
            lVar2 = lVar;
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                }
                interfaceC1734nR.T(-97239746);
                if (aVar2 != null) {
                    dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                } else {
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar2 != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar3 = dVar2;
                z11 = z10;
                c1583v2 = c1583vA;
                lVar4 = lVar3;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                }
                interfaceC1734nR.T(-97239746);
                if (aVar2 != null) {
                    dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                } else {
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar2 != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar3 = dVar2;
                z11 = z10;
                c1583v2 = c1583vA;
                lVar4 = lVar3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
            }
        }
        i11 |= 384;
        dVar2 = dVar;
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i6 & 3072) == 0) {
                z10 = z6;
                if (interfaceC1734nR.d(z10)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            if ((i6 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    c1583vA = c1583v;
                    if (interfaceC1734nR.S(c1583vA)) {
                    }
                    i11 |= i18;
                } else {
                    c1583vA = c1583v;
                }
                i11 |= i18;
            } else {
                c1583vA = c1583v;
            }
            i14 = i10 & 32;
            if (i14 != 0) {
                if ((196608 & i6) == 0) {
                    lVar2 = lVar;
                    if (interfaceC1734nR.S(lVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i11 |= i15;
                }
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                    }
                    interfaceC1734nR.T(-97239746);
                    if (aVar2 != null) {
                        dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                    } else {
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar2 != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar3 = dVar2;
                    z11 = z10;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    } else {
                        if (i17 != 0) {
                            dVar2 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar2 = dVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar2;
                        }
                        i16 = i11;
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                    }
                    interfaceC1734nR.T(-97239746);
                    if (aVar2 != null) {
                        dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                    } else {
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar2 != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar3 = dVar2;
                    z11 = z10;
                    c1583v2 = c1583vA;
                    lVar4 = lVar3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
                }
            }
            i11 |= 196608;
            lVar2 = lVar;
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                }
                interfaceC1734nR.T(-97239746);
                if (aVar2 != null) {
                    dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                } else {
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar2 != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar3 = dVar2;
                z11 = z10;
                c1583v2 = c1583vA;
                lVar4 = lVar3;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                }
                interfaceC1734nR.T(-97239746);
                if (aVar2 != null) {
                    dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                } else {
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar2 != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar3 = dVar2;
                z11 = z10;
                c1583v2 = c1583vA;
                lVar4 = lVar3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
            }
        }
        i11 |= 3072;
        z10 = z6;
        if ((i6 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                c1583vA = c1583v;
                if (interfaceC1734nR.S(c1583vA)) {
                }
                i11 |= i18;
            } else {
                c1583vA = c1583v;
            }
            i11 |= i18;
        } else {
            c1583vA = c1583v;
        }
        i14 = i10 & 32;
        if (i14 != 0) {
            if ((196608 & i6) == 0) {
                lVar2 = lVar;
                if (interfaceC1734nR.S(lVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i11 |= i15;
            }
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                }
                interfaceC1734nR.T(-97239746);
                if (aVar2 != null) {
                    dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                } else {
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar2 != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar3 = dVar2;
                z11 = z10;
                c1583v2 = c1583vA;
                lVar4 = lVar3;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                } else {
                    if (i17 != 0) {
                        dVar2 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar2 = dVar2;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar2;
                    }
                    i16 = i11;
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
                }
                interfaceC1734nR.T(-97239746);
                if (aVar2 != null) {
                    dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
                } else {
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar2 != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar3 = dVar2;
                z11 = z10;
                c1583v2 = c1583vA;
                lVar4 = lVar3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
            }
        }
        i11 |= 196608;
        lVar2 = lVar;
        if ((74899 & i11) == 74898) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar2;
                }
                if (i12 != 0) {
                    z10 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar2;
                }
                i16 = i11;
            } else {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar2;
                }
                if (i12 != 0) {
                    z10 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar2;
                }
                i16 = i11;
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
            }
            interfaceC1734nR.T(-97239746);
            if (aVar2 != null) {
                dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
            } else {
                dVarA = androidx.compose.ui.d.f19586a;
            }
            interfaceC1734nR.J();
            dVarB = androidx.compose.ui.d.f19586a;
            if (aVar2 != null) {
                dVarB = S.AbstractC1554k0.b(dVarB);
            }
            b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar3 = dVar2;
            z11 = z10;
            c1583v2 = c1583vA;
            lVar4 = lVar3;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar2;
                }
                if (i12 != 0) {
                    z10 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar2;
                }
                i16 = i11;
            } else {
                if (i17 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar2 = dVar2;
                }
                if (i12 != 0) {
                    z10 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    c1583vA = S.C1585w.f11833a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar2;
                }
                i16 = i11;
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1608358065, i16, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
            }
            interfaceC1734nR.T(-97239746);
            if (aVar2 != null) {
                dVarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.d.f19586a, aVar, lVar3, S.I0.c(false, Y0.i.q(U.C1679b.f13677a.d() / 2), 0L, interfaceC1734nR, 54, 4), z10, K0.h.h(K0.h.f5956b.b()), aVar2);
            } else {
                dVarA = androidx.compose.ui.d.f19586a;
            }
            interfaceC1734nR.J();
            dVarB = androidx.compose.ui.d.f19586a;
            if (aVar2 != null) {
                dVarB = S.AbstractC1554k0.b(dVarB);
            }
            b(z10, aVar, androidx.compose.foundation.layout.m.i(dVar2.b(dVarB).b(dVarA), f11910a), c1583vA, interfaceC1734nR, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar3 = dVar2;
            z11 = z10;
            c1583v2 = c1583vA;
            lVar4 = lVar3;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1587x.g(aVar, aVar2, dVar3, z11, c1583v2, lVar4, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(p161q0.g gVar, long j6, long j10, float f6, float f10) {
        float f11 = f10 / 2.0f;
        p161q0.m mVar = new p161q0.m(f10, 0.0f, 0, 0, null, 30, null);
        float fI = p131n0.m.i(gVar.i());
        if (p141o0.C7016y0.o(j6, j10)) {
            p161q0.f.o(gVar, j6, 0L, p131n0.n.a(fI, fI), p131n0.b.b(f6, 0.0f, 2, null), p161q0.l.f52928a, 0.0f, null, 0, 226, null);
            return;
        }
        float f12 = fI - (2 * f10);
        p161q0.f.o(gVar, j6, p131n0.h.a(f10, f10), p131n0.n.a(f12, f12), p131n0.b.b(java.lang.Math.max(0.0f, f6 - f10), 0.0f, 2, null), p161q0.l.f52928a, 0.0f, null, 0, 224, null);
        float f13 = fI - f10;
        p161q0.f.o(gVar, j10, p131n0.h.a(f11, f11), p131n0.n.a(f13, f13), p131n0.b.b(f6 - f11, 0.0f, 2, null), mVar, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(p161q0.g gVar, long j6, float f6, float f10, float f11, S.C1581u c1581u) {
        p161q0.m mVar = new p161q0.m(f11, 0.0f, p141o0.g2.f52226a.c(), 0, null, 26, null);
        float fI = p131n0.m.i(gVar.i());
        float fB = p002a1.b.b(0.4f, 0.5f, f10);
        float fB2 = p002a1.b.b(0.7f, 0.5f, f10);
        float fB3 = p002a1.b.b(0.5f, 0.5f, f10);
        float fB4 = p002a1.b.b(0.3f, 0.5f, f10);
        c1581u.a().a();
        c1581u.a().l(0.2f * fI, fB3 * fI);
        c1581u.a().r(fB * fI, fB2 * fI);
        c1581u.a().r(0.8f * fI, fI * fB4);
        c1581u.b().b(c1581u.a(), false);
        c1581u.c().a();
        c1581u.b().c(0.0f, c1581u.b().a() * f6, c1581u.c(), true);
        p161q0.f.k(gVar, c1581u.c(), j6, 0.0f, mVar, null, 0, 52, null);
    }
}
