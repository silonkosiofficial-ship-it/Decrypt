package p112l1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p122m1.l {

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final l1.b.a f49957q1 = new l1.b.a(null);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f49958r1 = 8;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private p122m1.f f49959T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private p122m1.e[] f49960U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private boolean f49961V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private int f49962W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f49963X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f49964Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f49965Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private float f49966a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private float f49967b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private java.lang.String f49968c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private java.lang.String f49969d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private java.lang.String f49970e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private java.lang.String f49971f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f49972g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f49973h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean[][] f49974i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private java.util.Set f49975j1 = new java.util.HashSet();

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int[][] f49976k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int[] f49977l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int[][] f49978m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f49979n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private boolean f49980o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f49981p1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: l1.b$b, reason: collision with other inner class name */
    static final class C0631b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p112l1.b.C0631b f49982D = new p112l1.b.C0631b();

        C0631b() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer u(java.lang.String str, java.lang.String str2) {
            java.util.List listM;
            java.util.List listM2;
            p247y7.AbstractC7350t.f(str, "span1");
            p247y7.AbstractC7350t.f(str2, "span2");
            java.util.List listG = new S8.o(":").g(str, 0);
            if (!listG.isEmpty()) {
                java.util.ListIterator listIterator = listG.listIterator(listG.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listM = p097j7.AbstractC6879v.m();
                        break;
                    }
                    if (((java.lang.String) listIterator.previous()).length() != 0) {
                        listM = p097j7.AbstractC6879v.M0(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listM = p097j7.AbstractC6879v.m();
                break;
            }
            int i6 = java.lang.Integer.parseInt(((java.lang.String[]) listM.toArray(new java.lang.String[0]))[0]);
            java.util.List listG2 = new S8.o(":").g(str2, 0);
            if (listG2.isEmpty()) {
                listM2 = p097j7.AbstractC6879v.m();
            } else {
                java.util.ListIterator listIterator2 = listG2.listIterator(listG2.size());
                while (listIterator2.hasPrevious()) {
                    if (((java.lang.String) listIterator2.previous()).length() != 0) {
                        listM2 = p097j7.AbstractC6879v.M0(listG2, listIterator2.nextIndex() + 1);
                    }
                }
                listM2 = p097j7.AbstractC6879v.m();
            }
            return java.lang.Integer.valueOf(i6 - java.lang.Integer.parseInt(((java.lang.String[]) listM2.toArray(new java.lang.String[0]))[0]));
        }
    }

    public b() {
        e3();
        K2();
    }

    private final void A2(p122m1.e eVar) {
        eVar.S1(-1.0f);
        eVar.c0().v();
        eVar.G().v();
        eVar.F().v();
    }

    private final void B2(p122m1.e eVar, int i6, int i10, int i11, int i12) {
        p122m1.d dVarL = eVar.L();
        p122m1.e[] eVarArr = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr);
        p122m1.e eVar2 = eVarArr[i10];
        p247y7.AbstractC7350t.c(eVar2);
        dVarL.a(eVar2.L(), 0);
        p122m1.d dVarC0 = eVar.c0();
        p122m1.e[] eVarArr2 = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr2);
        p122m1.e eVar3 = eVarArr2[i6];
        p247y7.AbstractC7350t.c(eVar3);
        dVarC0.a(eVar3.c0(), 0);
        p122m1.d dVarB0 = eVar.b0();
        p122m1.e[] eVarArr3 = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr3);
        p122m1.e eVar4 = eVarArr3[(i10 + i12) - 1];
        p247y7.AbstractC7350t.c(eVar4);
        dVarB0.a(eVar4.b0(), 0);
        p122m1.d dVarG = eVar.G();
        p122m1.e[] eVarArr4 = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr4);
        p122m1.e eVar5 = eVarArr4[(i6 + i11) - 1];
        p247y7.AbstractC7350t.c(eVar5);
        dVarG.a(eVar5.G(), 0);
    }

    private final void C2() {
        int iMax = java.lang.Math.max(this.f49962W0, this.f49964Y0);
        p122m1.e[] eVarArr = this.f49960U0;
        int i6 = 0;
        if (eVarArr == null) {
            p122m1.e[] eVarArr2 = new p122m1.e[iMax];
            this.f49960U0 = eVarArr2;
            p247y7.AbstractC7350t.c(eVarArr2);
            int length = eVarArr2.length;
            while (i6 < length) {
                p122m1.e[] eVarArr3 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr3);
                eVarArr3[i6] = N2();
                i6++;
            }
            return;
        }
        p247y7.AbstractC7350t.c(eVarArr);
        if (iMax != eVarArr.length) {
            p122m1.e[] eVarArr4 = new p122m1.e[iMax];
            while (i6 < iMax) {
                p122m1.e[] eVarArr5 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr5);
                if (i6 < eVarArr5.length) {
                    p122m1.e[] eVarArr6 = this.f49960U0;
                    p247y7.AbstractC7350t.c(eVarArr6);
                    eVarArr4[i6] = eVarArr6[i6];
                } else {
                    eVarArr4[i6] = N2();
                }
                i6++;
            }
            p122m1.e[] eVarArr7 = this.f49960U0;
            p247y7.AbstractC7350t.c(eVarArr7);
            int length2 = eVarArr7.length;
            while (iMax < length2) {
                p122m1.e[] eVarArr8 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr8);
                p122m1.e eVar = eVarArr8[iMax];
                p122m1.f fVar = this.f49959T0;
                p247y7.AbstractC7350t.c(fVar);
                p247y7.AbstractC7350t.c(eVar);
                fVar.f2(eVar);
                iMax++;
            }
            this.f49960U0 = eVarArr4;
        }
    }

    private final void D2(boolean z6) {
        if (z6) {
            boolean[][] zArr = this.f49974i1;
            p247y7.AbstractC7350t.c(zArr);
            int length = zArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                boolean[][] zArr2 = this.f49974i1;
                p247y7.AbstractC7350t.c(zArr2);
                int length2 = zArr2[0].length;
                for (int i10 = 0; i10 < length2; i10++) {
                    boolean[][] zArr3 = this.f49974i1;
                    p247y7.AbstractC7350t.c(zArr3);
                    zArr3[i6][i10] = true;
                }
            }
            int[][] iArr = this.f49976k1;
            p247y7.AbstractC7350t.c(iArr);
            int length3 = iArr.length;
            for (int i11 = 0; i11 < length3; i11++) {
                int[][] iArr2 = this.f49976k1;
                p247y7.AbstractC7350t.c(iArr2);
                int length4 = iArr2[0].length;
                for (int i12 = 0; i12 < length4; i12++) {
                    int[][] iArr3 = this.f49976k1;
                    p247y7.AbstractC7350t.c(iArr3);
                    iArr3[i11][i12] = -1;
                }
            }
        }
        this.f49973h1 = 0;
        java.lang.String str = this.f49971f1;
        if (str != null) {
            p247y7.AbstractC7350t.c(str);
            int length5 = str.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length5) {
                boolean z11 = p247y7.AbstractC7350t.g(str.charAt(!z10 ? i13 : length5), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length5--;
                    }
                } else if (z11) {
                    i13++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i13, length5 + 1).toString().length() > 0) {
                java.lang.String str2 = this.f49971f1;
                p247y7.AbstractC7350t.c(str2);
                int[][] iArrO2 = O2(str2, false);
                if (iArrO2 != null) {
                    I2(iArrO2);
                }
            }
        }
        java.lang.String str3 = this.f49970e1;
        if (str3 != null) {
            p247y7.AbstractC7350t.c(str3);
            int length6 = str3.length() - 1;
            int i14 = 0;
            boolean z12 = false;
            while (i14 <= length6) {
                boolean z13 = p247y7.AbstractC7350t.g(str3.charAt(!z12 ? i14 : length6), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length6--;
                    }
                } else if (z13) {
                    i14++;
                } else {
                    z12 = true;
                }
            }
            if (str3.subSequence(i14, length6 + 1).toString().length() > 0) {
                java.lang.String str4 = this.f49970e1;
                p247y7.AbstractC7350t.c(str4);
                int[][] iArrO3 = O2(str4, true);
                if (iArrO3 != null) {
                    J2(iArrO3);
                }
            }
        }
    }

    private final int E2(int i6) {
        return this.f49972g1 == 1 ? i6 / this.f49962W0 : i6 % this.f49964Y0;
    }

    private final int F2() {
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            i6 = this.f49973h1;
            if (i6 >= this.f49962W0 * this.f49964Y0) {
                return -1;
            }
            int iG2 = G2(i6);
            int iE2 = E2(this.f49973h1);
            boolean[][] zArr = this.f49974i1;
            p247y7.AbstractC7350t.c(zArr);
            if (zArr[iG2][iE2]) {
                boolean[][] zArr2 = this.f49974i1;
                p247y7.AbstractC7350t.c(zArr2);
                zArr2[iG2][iE2] = false;
                z6 = true;
            }
            this.f49973h1++;
        }
        return i6;
    }

    private final int G2(int i6) {
        return this.f49972g1 == 1 ? i6 % this.f49962W0 : i6 / this.f49964Y0;
    }

    private final void H2() {
        int[] iArr = this.f49977l1;
        if (iArr == null) {
            return;
        }
        p247y7.AbstractC7350t.c(iArr);
        for (int i6 : iArr) {
            if (i6 == 0) {
                this.f49981p1 = true;
            } else if (i6 == 1) {
                this.f49980o1 = true;
            }
        }
    }

    private final void I2(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!M2(G2(iArr2[0]), E2(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private final void J2(int[][] iArr) {
        if (this.f49980o1) {
            return;
        }
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            int iG2 = G2(iArr[i6][0]);
            int iE2 = E2(iArr[i6][0]);
            int[] iArr2 = iArr[i6];
            if (!M2(iG2, iE2, iArr2[1], iArr2[2])) {
                return;
            }
            p122m1.e eVar = d2()[i6];
            p247y7.AbstractC7350t.c(eVar);
            int[] iArr3 = iArr[i6];
            B2(eVar, iG2, iE2, iArr3[1], iArr3[2]);
            java.util.Set set = this.f49975j1;
            p122m1.e eVar2 = d2()[i6];
            p247y7.AbstractC7350t.c(eVar2);
            java.lang.String strS0 = eVar2.s0();
            p247y7.AbstractC7350t.c(strS0);
            set.add(strS0);
        }
    }

    private final void K2() {
        boolean[][] zArr;
        int[][] iArr = this.f49976k1;
        boolean z6 = false;
        if (iArr != null) {
            p247y7.AbstractC7350t.c(iArr);
            if (iArr.length == e2() && (zArr = this.f49974i1) != null) {
                p247y7.AbstractC7350t.c(zArr);
                if (zArr.length == this.f49962W0) {
                    boolean[][] zArr2 = this.f49974i1;
                    p247y7.AbstractC7350t.c(zArr2);
                    if (zArr2[0].length == this.f49964Y0) {
                        z6 = true;
                    }
                }
            }
        }
        if (!z6) {
            L2();
        }
        D2(z6);
    }

    private final void L2() {
        int i6 = this.f49962W0;
        boolean[][] zArr = new boolean[i6][];
        for (int i10 = 0; i10 < i6; i10++) {
            zArr[i10] = new boolean[this.f49964Y0];
        }
        this.f49974i1 = zArr;
        p247y7.AbstractC7350t.c(zArr);
        for (boolean[] zArr2 : zArr) {
            p097j7.AbstractC6872n.C(zArr2, true, 0, 0, 6, null);
        }
        if (e2() > 0) {
            int iE2 = e2();
            int[][] iArr = new int[iE2][];
            for (int i11 = 0; i11 < iE2; i11++) {
                iArr[i11] = new int[4];
            }
            this.f49976k1 = iArr;
            p247y7.AbstractC7350t.c(iArr);
            for (int[] iArr2 : iArr) {
                p097j7.AbstractC6872n.z(iArr2, -1, 0, 0, 6, null);
            }
        }
    }

    private final boolean M2(int i6, int i10, int i11, int i12) {
        int i13 = i11 + i6;
        while (i6 < i13) {
            int i14 = i10 + i12;
            for (int i15 = i10; i15 < i14; i15++) {
                boolean[][] zArr = this.f49974i1;
                p247y7.AbstractC7350t.c(zArr);
                if (i6 < zArr.length) {
                    boolean[][] zArr2 = this.f49974i1;
                    p247y7.AbstractC7350t.c(zArr2);
                    if (i15 < zArr2[0].length) {
                        boolean[][] zArr3 = this.f49974i1;
                        p247y7.AbstractC7350t.c(zArr3);
                        if (zArr3[i6][i15]) {
                            boolean[][] zArr4 = this.f49974i1;
                            p247y7.AbstractC7350t.c(zArr4);
                            zArr4[i6][i15] = false;
                        }
                    }
                }
                return false;
            }
            i6++;
        }
        return true;
    }

    private final p122m1.e N2() {
        p122m1.e eVar = new p122m1.e();
        m1.e.b[] bVarArrN = eVar.N();
        m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
        bVarArrN[0] = bVar;
        eVar.N()[1] = bVar;
        eVar.J1(java.lang.String.valueOf(eVar.hashCode()));
        return eVar;
    }

    private final int[][] O2(java.lang.String str, boolean z6) {
        java.util.List listM;
        java.util.List listM2;
        char c6;
        java.util.List listM3;
        java.util.List listM4;
        try {
            java.util.List listG = new S8.o(",").g(str, 0);
            if (listG.isEmpty()) {
                listM = p097j7.AbstractC6879v.m();
                break;
            }
            java.util.ListIterator listIterator = listG.listIterator(listG.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listM = p097j7.AbstractC6879v.m();
                    break;
                }
                if (((java.lang.String) listIterator.previous()).length() != 0) {
                    listM = p097j7.AbstractC6879v.M0(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
            java.lang.String[] strArr = (java.lang.String[]) listM.toArray(new java.lang.String[0]);
            final p112l1.b.C0631b c0631b = p112l1.b.C0631b.f49982D;
            p097j7.AbstractC6872n.K(strArr, new java.util.Comparator() { // from class: l1.a
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return p112l1.b.P2(c0631b, obj, obj2);
                }
            });
            int length = strArr.length;
            int[][] iArr = new int[length][];
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = new int[3];
            }
            if (this.f49962W0 != 1 && this.f49964Y0 != 1) {
                int length2 = strArr.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    java.lang.String str2 = strArr[i10];
                    int length3 = str2.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length3) {
                        boolean z11 = p247y7.AbstractC7350t.g(str2.charAt(!z10 ? i11 : length3), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length3--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    java.util.List listG2 = new S8.o(":").g(str2.subSequence(i11, length3 + 1).toString(), 0);
                    if (listG2.isEmpty()) {
                        listM3 = p097j7.AbstractC6879v.m();
                        break;
                    }
                    java.util.ListIterator listIterator2 = listG2.listIterator(listG2.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            listM3 = p097j7.AbstractC6879v.m();
                            break;
                        }
                        if (((java.lang.String) listIterator2.previous()).length() != 0) {
                            listM3 = p097j7.AbstractC6879v.M0(listG2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                    java.lang.String[] strArr2 = (java.lang.String[]) listM3.toArray(new java.lang.String[0]);
                    java.util.List listG3 = new S8.o("x").g(strArr2[1], 0);
                    if (listG3.isEmpty()) {
                        listM4 = p097j7.AbstractC6879v.m();
                        break;
                    }
                    java.util.ListIterator listIterator3 = listG3.listIterator(listG3.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            listM4 = p097j7.AbstractC6879v.m();
                            break;
                        }
                        if (((java.lang.String) listIterator3.previous()).length() != 0) {
                            listM4 = p097j7.AbstractC6879v.M0(listG3, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                    java.lang.String[] strArr3 = (java.lang.String[]) listM4.toArray(new java.lang.String[0]);
                    iArr[i10][0] = java.lang.Integer.parseInt(strArr2[0]);
                    if (this.f49981p1) {
                        iArr[i10][1] = java.lang.Integer.parseInt(strArr3[1]);
                        iArr[i10][2] = java.lang.Integer.parseInt(strArr3[0]);
                    } else {
                        iArr[i10][1] = java.lang.Integer.parseInt(strArr3[0]);
                        iArr[i10][2] = java.lang.Integer.parseInt(strArr3[1]);
                    }
                }
                return iArr;
            }
            int length4 = strArr.length;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < length4; i14++) {
                java.lang.String str3 = strArr[i14];
                int length5 = str3.length() - 1;
                int i15 = 0;
                boolean z12 = false;
                while (i15 <= length5) {
                    boolean z13 = p247y7.AbstractC7350t.g(str3.charAt(!z12 ? i15 : length5), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length5--;
                    } else if (z13) {
                        i15++;
                    } else {
                        z12 = true;
                    }
                }
                java.util.List listG4 = new S8.o(":").g(str3.subSequence(i15, length5 + 1).toString(), 0);
                if (listG4.isEmpty()) {
                    listM2 = p097j7.AbstractC6879v.m();
                    break;
                }
                java.util.ListIterator listIterator4 = listG4.listIterator(listG4.size());
                while (true) {
                    if (!listIterator4.hasPrevious()) {
                        listM2 = p097j7.AbstractC6879v.m();
                        break;
                    }
                    if (((java.lang.String) listIterator4.previous()).length() != 0) {
                        listM2 = p097j7.AbstractC6879v.M0(listG4, listIterator4.nextIndex() + 1);
                        break;
                    }
                }
                java.lang.String[] strArr4 = (java.lang.String[]) listM2.toArray(new java.lang.String[0]);
                iArr[i14][0] = java.lang.Integer.parseInt(strArr4[0]);
                int[] iArr2 = iArr[i14];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f49964Y0 == 1) {
                    iArr2[1] = java.lang.Integer.parseInt(strArr4[1]);
                    i12 += iArr[i14][1];
                    if (z6) {
                        i12--;
                    }
                }
                if (this.f49962W0 == 1) {
                    c6 = 2;
                    iArr[i14][2] = java.lang.Integer.parseInt(strArr4[1]);
                    i13 += iArr[i14][2];
                    if (z6) {
                        i13--;
                    }
                } else {
                    c6 = 2;
                }
            }
            if (i12 != 0 && !this.f49961V0) {
                Z2(this.f49962W0 + i12);
            }
            if (i13 != 0 && !this.f49961V0) {
                U2(this.f49964Y0 + i13);
            }
            this.f49961V0 = true;
            return iArr;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P2(p237x7.p pVar, java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(pVar, "$tmp0");
        return ((java.lang.Number) pVar.u(obj, obj2)).intValue();
    }

    private final float[] Q2(int i6, java.lang.String str) {
        java.util.List listM;
        float[] fArr = null;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z6 = false;
            while (i10 <= length) {
                boolean z10 = p247y7.AbstractC7350t.g(str.charAt(!z6 ? i10 : length), 32) <= 0;
                if (z6) {
                    if (!z10) {
                        break;
                    }
                    length--;
                } else if (z10) {
                    i10++;
                } else {
                    z6 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() != 0) {
                java.util.List listG = new S8.o(",").g(str, 0);
                if (listG.isEmpty()) {
                    listM = p097j7.AbstractC6879v.m();
                    break;
                }
                java.util.ListIterator listIterator = listG.listIterator(listG.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listM = p097j7.AbstractC6879v.m();
                        break;
                    }
                    if (((java.lang.String) listIterator.previous()).length() != 0) {
                        listM = p097j7.AbstractC6879v.M0(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                java.lang.String[] strArr = (java.lang.String[]) listM.toArray(new java.lang.String[0]);
                if (strArr.length != i6) {
                    return null;
                }
                fArr = new float[i6];
                for (int i11 = 0; i11 < i6; i11++) {
                    java.lang.String str2 = strArr[i11];
                    int length2 = str2.length() - 1;
                    int i12 = 0;
                    boolean z11 = false;
                    while (i12 <= length2) {
                        boolean z12 = p247y7.AbstractC7350t.g(str2.charAt(!z11 ? i12 : length2), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            }
                            length2--;
                        } else if (z12) {
                            i12++;
                        } else {
                            z11 = true;
                        }
                    }
                    fArr[i11] = java.lang.Float.parseFloat(str2.subSequence(i12, length2 + 1).toString());
                }
            }
        }
        return fArr;
    }

    private final void R2() {
        p122m1.d dVarL;
        p122m1.d dVarB0;
        p122m1.d dVarB1;
        int iMax = java.lang.Math.max(this.f49962W0, this.f49964Y0);
        p122m1.e[] eVarArr = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr);
        p122m1.e eVar = eVarArr[0];
        p247y7.AbstractC7350t.c(eVar);
        float[] fArrQ2 = Q2(this.f49964Y0, this.f49969d1);
        int i6 = this.f49964Y0;
        if (i6 == 1) {
            z2(eVar);
            eVar.L().a(L(), 0);
            eVar.b0().a(b0(), 0);
            return;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            p122m1.e[] eVarArr2 = this.f49960U0;
            p247y7.AbstractC7350t.c(eVarArr2);
            p122m1.e eVar2 = eVarArr2[i10];
            p247y7.AbstractC7350t.c(eVar2);
            z2(eVar2);
            if (fArrQ2 != null) {
                eVar2.u1(fArrQ2[i10]);
            }
            p122m1.d dVarL2 = eVar2.L();
            if (i10 > 0) {
                p122m1.e[] eVarArr3 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr3);
                p122m1.e eVar3 = eVarArr3[i10 - 1];
                p247y7.AbstractC7350t.c(eVar3);
                dVarL = eVar3.b0();
            } else {
                dVarL = L();
            }
            dVarL2.a(dVarL, 0);
            if (i10 < this.f49964Y0 - 1) {
                dVarB0 = eVar2.b0();
                p122m1.e[] eVarArr4 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr4);
                p122m1.e eVar4 = eVarArr4[i10 + 1];
                p247y7.AbstractC7350t.c(eVar4);
                dVarB1 = eVar4.L();
            } else {
                dVarB0 = eVar2.b0();
                dVarB1 = b0();
            }
            dVarB0.a(dVarB1, 0);
            if (i10 > 0) {
                eVar2.L().A((int) this.f49966a1);
            }
        }
        for (int i11 = this.f49964Y0; i11 < iMax; i11++) {
            p122m1.e[] eVarArr5 = this.f49960U0;
            p247y7.AbstractC7350t.c(eVarArr5);
            p122m1.e eVar5 = eVarArr5[i11];
            p247y7.AbstractC7350t.c(eVar5);
            z2(eVar5);
            eVar5.L().a(L(), 0);
            eVar5.b0().a(b0(), 0);
        }
    }

    private final void S2() {
        p122m1.d dVarC0;
        p122m1.d dVarG;
        p122m1.d dVarG2;
        int iMax = java.lang.Math.max(this.f49962W0, this.f49964Y0);
        p122m1.e[] eVarArr = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr);
        p122m1.e eVar = eVarArr[0];
        p247y7.AbstractC7350t.c(eVar);
        float[] fArrQ2 = Q2(this.f49962W0, this.f49968c1);
        int i6 = this.f49962W0;
        if (i6 == 1) {
            A2(eVar);
            eVar.c0().a(c0(), 0);
            eVar.G().a(G(), 0);
            return;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            p122m1.e[] eVarArr2 = this.f49960U0;
            p247y7.AbstractC7350t.c(eVarArr2);
            p122m1.e eVar2 = eVarArr2[i10];
            p247y7.AbstractC7350t.c(eVar2);
            A2(eVar2);
            if (fArrQ2 != null) {
                eVar2.S1(fArrQ2[i10]);
            }
            p122m1.d dVarC1 = eVar2.c0();
            if (i10 > 0) {
                p122m1.e[] eVarArr3 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr3);
                p122m1.e eVar3 = eVarArr3[i10 - 1];
                p247y7.AbstractC7350t.c(eVar3);
                dVarC0 = eVar3.G();
            } else {
                dVarC0 = c0();
            }
            dVarC1.a(dVarC0, 0);
            if (i10 < this.f49962W0 - 1) {
                dVarG = eVar2.G();
                p122m1.e[] eVarArr4 = this.f49960U0;
                p247y7.AbstractC7350t.c(eVarArr4);
                p122m1.e eVar4 = eVarArr4[i10 + 1];
                p247y7.AbstractC7350t.c(eVar4);
                dVarG2 = eVar4.c0();
            } else {
                dVarG = eVar2.G();
                dVarG2 = G();
            }
            dVarG.a(dVarG2, 0);
            if (i10 > 0) {
                eVar2.c0().A((int) this.f49967b1);
            }
        }
        for (int i11 = this.f49962W0; i11 < iMax; i11++) {
            p122m1.e[] eVarArr5 = this.f49960U0;
            p247y7.AbstractC7350t.c(eVarArr5);
            p122m1.e eVar5 = eVarArr5[i11];
            p247y7.AbstractC7350t.c(eVar5);
            A2(eVar5);
            eVar5.c0().a(c0(), 0);
            eVar5.G().a(G(), 0);
        }
    }

    private final void d3(boolean z6) {
        if (this.f49962W0 < 1 || this.f49964Y0 < 1) {
            return;
        }
        H2();
        if (z6) {
            boolean[][] zArr = this.f49974i1;
            p247y7.AbstractC7350t.c(zArr);
            int length = zArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                boolean[][] zArr2 = this.f49974i1;
                p247y7.AbstractC7350t.c(zArr2);
                int length2 = zArr2[0].length;
                for (int i10 = 0; i10 < length2; i10++) {
                    boolean[][] zArr3 = this.f49974i1;
                    p247y7.AbstractC7350t.c(zArr3);
                    zArr3[i6][i10] = true;
                }
            }
            this.f49975j1.clear();
        }
        this.f49973h1 = 0;
        java.lang.String str = this.f49971f1;
        if (str != null) {
            p247y7.AbstractC7350t.c(str);
            int length3 = str.length() - 1;
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= length3) {
                boolean z11 = p247y7.AbstractC7350t.g(str.charAt(!z10 ? i11 : length3), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length3--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i11, length3 + 1).toString().length() > 0) {
                java.lang.String str2 = this.f49971f1;
                p247y7.AbstractC7350t.c(str2);
                int[][] iArrO2 = O2(str2, false);
                if (iArrO2 != null) {
                    I2(iArrO2);
                }
            }
        }
        java.lang.String str3 = this.f49970e1;
        if (str3 != null) {
            p247y7.AbstractC7350t.c(str3);
            int length4 = str3.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length4) {
                boolean z13 = p247y7.AbstractC7350t.g(str3.charAt(!z12 ? i12 : length4), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length4--;
                    }
                } else if (z13) {
                    i12++;
                } else {
                    z12 = true;
                }
            }
            if (str3.subSequence(i12, length4 + 1).toString().length() > 0) {
                java.lang.String str4 = this.f49970e1;
                p247y7.AbstractC7350t.c(str4);
                this.f49978m1 = O2(str4, true);
            }
        }
        C2();
        int[][] iArr = this.f49978m1;
        if (iArr != null) {
            p247y7.AbstractC7350t.c(iArr);
            J2(iArr);
        }
    }

    private final void e3() {
        int iE2;
        int i6;
        int i10;
        int i11 = this.f49963X0;
        if (i11 != 0 && (i10 = this.f49965Z0) != 0) {
            this.f49962W0 = i11;
            this.f49964Y0 = i10;
            return;
        }
        int i12 = this.f49965Z0;
        if (i12 > 0) {
            this.f49964Y0 = i12;
            this.f49962W0 = ((e2() + this.f49964Y0) - 1) / this.f49965Z0;
            return;
        }
        if (i11 > 0) {
            this.f49962W0 = i11;
            iE2 = e2();
            i6 = this.f49963X0;
        } else {
            this.f49962W0 = (int) (java.lang.Math.sqrt(e2()) + 1.5d);
            iE2 = e2();
            i6 = this.f49962W0;
        }
        this.f49964Y0 = ((iE2 + i6) - 1) / i6;
    }

    private final void x2() {
        S2();
        R2();
        y2();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    private final void y2() {
        int[][] iArr;
        int iE2 = e2();
        for (int i6 = 0; i6 < iE2; i6++) {
            java.util.Set set = this.f49975j1;
            p122m1.e eVar = d2()[i6];
            p247y7.AbstractC7350t.c(eVar);
            if (!p097j7.AbstractC6879v.Z(set, eVar.s0())) {
                int iF2 = F2();
                int iG2 = G2(iF2);
                int iE3 = E2(iF2);
                if (iF2 == -1) {
                    return;
                }
                if (!this.f49980o1 || (iArr = this.f49978m1) == null) {
                    p122m1.e eVar2 = d2()[i6];
                    p247y7.AbstractC7350t.c(eVar2);
                    B2(eVar2, iG2, iE3, 1, 1);
                } else {
                    int i10 = this.f49979n1;
                    p247y7.AbstractC7350t.c(iArr);
                    if (i10 < iArr.length) {
                        int[][] iArr2 = this.f49978m1;
                        p247y7.AbstractC7350t.c(iArr2);
                        if (iArr2[this.f49979n1][0] == iF2) {
                            boolean[][] zArr = this.f49974i1;
                            p247y7.AbstractC7350t.c(zArr);
                            zArr[iG2][iE3] = true;
                            int[][] iArr3 = this.f49978m1;
                            p247y7.AbstractC7350t.c(iArr3);
                            int i11 = iArr3[this.f49979n1][1];
                            int[][] iArr4 = this.f49978m1;
                            p247y7.AbstractC7350t.c(iArr4);
                            if (M2(iG2, iE3, i11, iArr4[this.f49979n1][2])) {
                                p122m1.e eVar3 = d2()[i6];
                                p247y7.AbstractC7350t.c(eVar3);
                                int[][] iArr5 = this.f49978m1;
                                p247y7.AbstractC7350t.c(iArr5);
                                int i12 = iArr5[this.f49979n1][1];
                                int[][] iArr6 = this.f49978m1;
                                p247y7.AbstractC7350t.c(iArr6);
                                B2(eVar3, iG2, iE3, i12, iArr6[this.f49979n1][2]);
                                this.f49979n1++;
                            }
                        } else {
                            p122m1.e eVar4 = d2()[i6];
                            p247y7.AbstractC7350t.c(eVar4);
                            B2(eVar4, iG2, iE3, 1, 1);
                        }
                    } else {
                        p122m1.e eVar5 = d2()[i6];
                        p247y7.AbstractC7350t.c(eVar5);
                        B2(eVar5, iG2, iE3, 1, 1);
                    }
                }
            }
        }
    }

    private final void z2(p122m1.e eVar) {
        eVar.u1(-1.0f);
        eVar.L().v();
        eVar.b0().v();
    }

    public final void T2(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "columnWeights");
        java.lang.String str2 = this.f49969d1;
        if (str2 == null || !p247y7.AbstractC7350t.b(str2, str)) {
            this.f49969d1 = str;
        }
    }

    public final void U2(int i6) {
        if (i6 <= 50 && this.f49965Z0 != i6) {
            this.f49965Z0 = i6;
            e3();
            L2();
        }
    }

    public final void V2(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "flags");
        this.f49977l1 = iArr;
    }

    public final void W2(float f6) {
        if (f6 >= 0.0f && this.f49966a1 != f6) {
            this.f49966a1 = f6;
        }
    }

    public final void X2(int i6) {
        if ((i6 == 0 || i6 == 1) && this.f49972g1 != i6) {
            this.f49972g1 = i6;
        }
    }

    public final void Y2(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "rowWeights");
        java.lang.String str2 = this.f49968c1;
        if (str2 == null || !p247y7.AbstractC7350t.b(str2, str)) {
            this.f49968c1 = str;
        }
    }

    public final void Z2(int i6) {
        if (i6 <= 50 && this.f49963X0 != i6) {
            this.f49963X0 = i6;
            e3();
            L2();
        }
    }

    public final void a3(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "skips");
        java.lang.String str2 = this.f49971f1;
        if (str2 == null || !p247y7.AbstractC7350t.b(str2, str)) {
            this.f49961V0 = false;
            this.f49971f1 = str;
        }
    }

    public final void b3(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "spans");
        java.lang.String str = this.f49970e1;
        if (str == null || !p247y7.AbstractC7350t.b(str, charSequence.toString())) {
            this.f49961V0 = false;
            this.f49970e1 = charSequence.toString();
        }
    }

    public final void c3(float f6) {
        if (f6 >= 0.0f && this.f49967b1 != f6) {
            this.f49967b1 = f6;
        }
    }

    @Override // p122m1.e
    public void d(p042e1.d dVar, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "system");
        super.d(dVar, z6);
        x2();
    }

    @Override // p122m1.l
    public void m2(int i6, int i10, int i11, int i12) {
        super.m2(i6, i10, i11, i12);
        this.f49959T0 = (p122m1.f) o0();
        d3(false);
        p122m1.f fVar = this.f49959T0;
        p247y7.AbstractC7350t.c(fVar);
        p122m1.e[] eVarArr = this.f49960U0;
        p247y7.AbstractC7350t.c(eVarArr);
        p122m1.e[] eVarArr2 = (p122m1.e[]) p097j7.AbstractC6872n.W(eVarArr).toArray(new p122m1.e[0]);
        fVar.b2((p122m1.e[]) java.util.Arrays.copyOf(eVarArr2, eVarArr2.length));
    }
}
