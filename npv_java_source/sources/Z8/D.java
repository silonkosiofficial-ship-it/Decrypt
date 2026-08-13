package Z8;

/* JADX INFO: loaded from: classes2.dex */
public class D extends p009a9.AbstractC1885b implements Z8.x, Z8.InterfaceC1869f, p009a9.q {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f16729G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f16730H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Y8.EnumC1863d f16731I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.Object[] f16732J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f16733K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f16734L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f16735M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f16736N;

    private static final class a implements W8.InterfaceC1783f0 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final Z8.D f16737C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public long f16738D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public final java.lang.Object f16739E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public final p127m7.e f16740F;

        public a(Z8.D d6, long j6, java.lang.Object obj, p127m7.e eVar) {
            this.f16737C = d6;
            this.f16738D = j6;
            this.f16739E = obj;
            this.f16740F = eVar;
        }

        @Override // W8.InterfaceC1783f0
        public void e() {
            this.f16737C.B(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16741a;

        static {
            int[] iArr = new int[Y8.EnumC1863d.values().length];
            try {
                iArr[Y8.EnumC1863d.SUSPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Y8.EnumC1863d.DROP_LATEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Y8.EnumC1863d.DROP_OLDEST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f16741a = iArr;
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16742F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16743G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f16744H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f16745I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16746J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f16748L;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16746J = obj;
            this.f16748L |= Integer.MIN_VALUE;
            return Z8.D.D(Z8.D.this, null, this);
        }
    }

    public D(int i6, int i10, Y8.EnumC1863d enumC1863d) {
        this.f16729G = i6;
        this.f16730H = i10;
        this.f16731I = enumC1863d;
    }

    private final java.lang.Object A(Z8.F f6, p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        synchronized (this) {
            try {
                if (W(f6) < 0) {
                    f6.f16751b = c1798n;
                } else {
                    i7.w.a aVar = p087i7.w.f46751D;
                    c1798n.t(p087i7.w.b(p087i7.M.f46721a));
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Z8.D.a aVar) {
        synchronized (this) {
            if (aVar.f16738D < N()) {
                return;
            }
            java.lang.Object[] objArr = this.f16732J;
            p247y7.AbstractC7350t.c(objArr);
            if (Z8.E.f(objArr, aVar.f16738D) != aVar) {
                return;
            }
            Z8.E.g(objArr, aVar.f16738D, Z8.E.f16749a);
            C();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    private final void C() {
        if (this.f16730H != 0 || this.f16736N > 1) {
            java.lang.Object[] objArr = this.f16732J;
            p247y7.AbstractC7350t.c(objArr);
            while (this.f16736N > 0 && Z8.E.f(objArr, (N() + ((long) S())) - 1) == Z8.E.f16749a) {
                this.f16736N--;
                Z8.E.g(objArr, N() + ((long) S()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ java.lang.Object D(Z8.D d6, Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) throws java.lang.Throwable {
        Z8.D.c cVar;
        Z8.D d10;
        java.lang.Throwable th;
        Z8.F f6;
        Z8.InterfaceC1870g interfaceC1870g2;
        W8.InterfaceC1822z0 interfaceC1822z0;
        if (eVar instanceof Z8.D.c) {
            cVar = (Z8.D.c) eVar;
            int i6 = cVar.f16748L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f16748L = i6 - Integer.MIN_VALUE;
            } else {
                cVar = d6.new c(eVar);
            }
        } else {
            cVar = d6.new c(eVar);
        }
        java.lang.Object obj = cVar.f16746J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f16748L;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (Z8.F) cVar.f16744H;
                Z8.InterfaceC1870g interfaceC1870g3 = (Z8.InterfaceC1870g) cVar.f16743G;
                Z8.D d11 = (Z8.D) cVar.f16742F;
                try {
                    p087i7.x.b(obj);
                    interfaceC1870g2 = interfaceC1870g3;
                    d6 = d11;
                    try {
                        interfaceC1822z0 = (W8.InterfaceC1822z0) cVar.getContext().i(W8.InterfaceC1822z0.f15544h);
                    } catch (java.lang.Throwable th2) {
                        d10 = d6;
                        th = th2;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    d10 = d11;
                }
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W8.InterfaceC1822z0 interfaceC1822z1 = (W8.InterfaceC1822z0) cVar.f16745I;
                f6 = (Z8.F) cVar.f16744H;
                Z8.InterfaceC1870g interfaceC1870g4 = (Z8.InterfaceC1870g) cVar.f16743G;
                d10 = (Z8.D) cVar.f16742F;
                try {
                    p087i7.x.b(obj);
                    interfaceC1870g2 = interfaceC1870g4;
                    interfaceC1822z0 = interfaceC1822z1;
                    d6 = d10;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
            d10.k(f6);
            throw th;
        }
        p087i7.x.b(obj);
        Z8.F f10 = (Z8.F) d6.h();
        try {
            if (interfaceC1870g instanceof Z8.S) {
                cVar.f16742F = d6;
                cVar.f16743G = interfaceC1870g;
                cVar.f16744H = f10;
                cVar.f16748L = 1;
                if (((Z8.S) interfaceC1870g).b(cVar) == objG) {
                    return objG;
                }
            }
            interfaceC1870g2 = interfaceC1870g;
            f6 = f10;
            interfaceC1822z0 = (W8.InterfaceC1822z0) cVar.getContext().i(W8.InterfaceC1822z0.f15544h);
        } catch (java.lang.Throwable th5) {
            d10 = d6;
            th = th5;
            f6 = f10;
        }
        while (true) {
            java.lang.Object objX = d6.X(f6);
            if (objX == Z8.E.f16749a) {
                cVar.f16742F = d6;
                cVar.f16743G = interfaceC1870g2;
                cVar.f16744H = f6;
                cVar.f16745I = interfaceC1822z0;
                cVar.f16748L = 2;
                if (d6.A(f6, cVar) == objG) {
                    return objG;
                }
            } else {
                if (interfaceC1822z0 != null) {
                    W8.C0.k(interfaceC1822z0);
                }
                cVar.f16742F = d6;
                cVar.f16743G = interfaceC1870g2;
                cVar.f16744H = f6;
                cVar.f16745I = interfaceC1822z0;
                cVar.f16748L = 3;
                if (interfaceC1870g2.a(objX, cVar) == objG) {
                    return objG;
                }
            }
        }
    }

    private final void E(long j6) {
        p009a9.d[] dVarArr;
        if (((p009a9.AbstractC1885b) this).f17157D != 0 && (dVarArr = ((p009a9.AbstractC1885b) this).f17156C) != null) {
            for (p009a9.d dVar : dVarArr) {
                if (dVar != null) {
                    Z8.F f6 = (Z8.F) dVar;
                    long j10 = f6.f16750a;
                    if (j10 >= 0 && j10 < j6) {
                        f6.f16750a = j6;
                    }
                }
            }
        }
        this.f16734L = j6;
    }

    private final void H() {
        java.lang.Object[] objArr = this.f16732J;
        p247y7.AbstractC7350t.c(objArr);
        Z8.E.g(objArr, N(), null);
        this.f16735M--;
        long jN = N() + 1;
        if (this.f16733K < jN) {
            this.f16733K = jN;
        }
        if (this.f16734L < jN) {
            E(jN);
        }
    }

    static /* synthetic */ java.lang.Object I(Z8.D d6, java.lang.Object obj, p127m7.e eVar) {
        java.lang.Object objJ;
        return (!d6.n(obj) && (objJ = d6.J(obj, eVar)) == p137n7.b.g()) ? objJ : p087i7.M.f46721a;
    }

    private final java.lang.Object J(java.lang.Object obj, p127m7.e eVar) {
        p127m7.e[] eVarArrL;
        Z8.D.a aVar;
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        p127m7.e[] eVarArrL2 = p009a9.AbstractC1886c.f17160a;
        synchronized (this) {
            try {
                if (U(obj)) {
                    i7.w.a aVar2 = p087i7.w.f46751D;
                    c1798n.t(p087i7.w.b(p087i7.M.f46721a));
                    eVarArrL = L(eVarArrL2);
                    aVar = null;
                } else {
                    Z8.D.a aVar3 = new Z8.D.a(this, ((long) S()) + N(), obj, c1798n);
                    K(aVar3);
                    this.f16736N++;
                    if (this.f16730H == 0) {
                        eVarArrL2 = L(eVarArrL2);
                    }
                    eVarArrL = eVarArrL2;
                    aVar = aVar3;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            W8.AbstractC1802p.a(c1798n, aVar);
        }
        for (p127m7.e eVar2 : eVarArrL) {
            if (eVar2 != null) {
                i7.w.a aVar4 = p087i7.w.f46751D;
                eVar2.t(p087i7.w.b(p087i7.M.f46721a));
            }
        }
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(java.lang.Object obj) {
        int iS = S();
        java.lang.Object[] objArrT = this.f16732J;
        if (objArrT == null) {
            objArrT = T(null, 0, 2);
        } else if (iS >= objArrT.length) {
            objArrT = T(objArrT, iS, objArrT.length * 2);
        }
        Z8.E.g(objArrT, N() + ((long) iS), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [m7.e[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p127m7.e[] L(p127m7.e[] eVarArr) {
        p009a9.d[] dVarArr;
        Z8.F f6;
        p127m7.e eVar;
        int length = eVarArr.length;
        if (((p009a9.AbstractC1885b) this).f17157D != 0 && (dVarArr = ((p009a9.AbstractC1885b) this).f17156C) != null) {
            int length2 = dVarArr.length;
            int i6 = 0;
            while (i6 < length2) {
                p009a9.d dVar = dVarArr[i6];
                if (dVar == null || (eVar = (f6 = (Z8.F) dVar).f16751b) == null || W(f6) < 0) {
                    eVarArr = eVarArr;
                } else {
                    if (length >= eVarArr.length) {
                        eVarArr = eVarArr;
                        eVarArr = eVarArr;
                        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) eVarArr, java.lang.Math.max(2, eVarArr.length * 2));
                        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
                        eVarArr = objArrCopyOf;
                    }
                    eVarArr = eVarArr;
                    eVarArr = eVarArr;
                    ((p127m7.e[]) eVarArr)[length] = eVar;
                    f6.f16751b = null;
                    length++;
                }
                i6++;
                eVarArr = eVarArr;
            }
            eVarArr = eVarArr;
        }
        return (p127m7.e[]) eVarArr;
    }

    private final long M() {
        return N() + ((long) this.f16735M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long N() {
        return java.lang.Math.min(this.f16734L, this.f16733K);
    }

    private final java.lang.Object P(long j6) {
        java.lang.Object[] objArr = this.f16732J;
        p247y7.AbstractC7350t.c(objArr);
        java.lang.Object objF = Z8.E.f(objArr, j6);
        return objF instanceof Z8.D.a ? ((Z8.D.a) objF).f16739E : objF;
    }

    private final long Q() {
        return N() + ((long) this.f16735M) + ((long) this.f16736N);
    }

    private final int R() {
        return (int) ((N() + ((long) this.f16735M)) - this.f16733K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S() {
        return this.f16735M + this.f16736N;
    }

    private final java.lang.Object[] T(java.lang.Object[] objArr, int i6, int i10) {
        if (i10 <= 0) {
            throw new java.lang.IllegalStateException("Buffer size overflow".toString());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i10];
        this.f16732J = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jN = N();
        for (int i11 = 0; i11 < i6; i11++) {
            long j6 = ((long) i11) + jN;
            Z8.E.g(objArr2, j6, Z8.E.f(objArr, j6));
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U(java.lang.Object obj) {
        if (l() == 0) {
            return V(obj);
        }
        if (this.f16735M >= this.f16730H && this.f16734L <= this.f16733K) {
            int i6 = Z8.D.b.f16741a[this.f16731I.ordinal()];
            if (i6 == 1) {
                return false;
            }
            if (i6 == 2) {
                return true;
            }
            if (i6 != 3) {
                throw new p087i7.s();
            }
        }
        K(obj);
        int i10 = this.f16735M + 1;
        this.f16735M = i10;
        if (i10 > this.f16730H) {
            H();
        }
        if (R() > this.f16729G) {
            Y(this.f16733K + 1, this.f16734L, M(), Q());
        }
        return true;
    }

    private final boolean V(java.lang.Object obj) {
        if (this.f16729G == 0) {
            return true;
        }
        K(obj);
        int i6 = this.f16735M + 1;
        this.f16735M = i6;
        if (i6 > this.f16729G) {
            H();
        }
        this.f16734L = N() + ((long) this.f16735M);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long W(Z8.F f6) {
        long j6 = f6.f16750a;
        if (j6 < M()) {
            return j6;
        }
        if (this.f16730H <= 0 && j6 <= N() && this.f16736N != 0) {
            return j6;
        }
        return -1L;
    }

    private final java.lang.Object X(Z8.F f6) {
        java.lang.Object obj;
        p127m7.e[] eVarArrZ = p009a9.AbstractC1886c.f17160a;
        synchronized (this) {
            try {
                long jW = W(f6);
                if (jW < 0) {
                    obj = Z8.E.f16749a;
                } else {
                    long j6 = f6.f16750a;
                    java.lang.Object objP = P(jW);
                    f6.f16750a = jW + 1;
                    eVarArrZ = Z(j6);
                    obj = objP;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        for (p127m7.e eVar : eVarArrZ) {
            if (eVar != null) {
                i7.w.a aVar = p087i7.w.f46751D;
                eVar.t(p087i7.w.b(p087i7.M.f46721a));
            }
        }
        return obj;
    }

    private final void Y(long j6, long j10, long j11, long j12) {
        long jMin = java.lang.Math.min(j10, j6);
        for (long jN = N(); jN < jMin; jN++) {
            java.lang.Object[] objArr = this.f16732J;
            p247y7.AbstractC7350t.c(objArr);
            Z8.E.g(objArr, jN, null);
        }
        this.f16733K = j6;
        this.f16734L = j10;
        this.f16735M = (int) (j11 - jMin);
        this.f16736N = (int) (j12 - j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p009a9.AbstractC1885b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Z8.F i() {
        return new Z8.F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p009a9.AbstractC1885b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Z8.F[] j(int i6) {
        return new Z8.F[i6];
    }

    protected final java.lang.Object O() {
        java.lang.Object[] objArr = this.f16732J;
        p247y7.AbstractC7350t.c(objArr);
        return Z8.E.f(objArr, (this.f16733K + ((long) R())) - 1);
    }

    public final p127m7.e[] Z(long j6) {
        long j10;
        long j11;
        long j12;
        p009a9.d[] dVarArr;
        if (j6 > this.f16734L) {
            return p009a9.AbstractC1886c.f17160a;
        }
        long jN = N();
        long j13 = ((long) this.f16735M) + jN;
        if (this.f16730H == 0 && this.f16736N > 0) {
            j13++;
        }
        if (((p009a9.AbstractC1885b) this).f17157D != 0 && (dVarArr = ((p009a9.AbstractC1885b) this).f17156C) != null) {
            for (p009a9.d dVar : dVarArr) {
                if (dVar != null) {
                    long j14 = ((Z8.F) dVar).f16750a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.f16734L) {
            return p009a9.AbstractC1886c.f17160a;
        }
        long jM = M();
        int iMin = l() > 0 ? java.lang.Math.min(this.f16736N, this.f16730H - ((int) (jM - j13))) : this.f16736N;
        p127m7.e[] eVarArr = p009a9.AbstractC1886c.f17160a;
        long j15 = ((long) this.f16736N) + jM;
        if (iMin > 0) {
            eVarArr = new p127m7.e[iMin];
            java.lang.Object[] objArr = this.f16732J;
            p247y7.AbstractC7350t.c(objArr);
            long j16 = jM;
            int i6 = 0;
            while (true) {
                if (jM >= j15) {
                    j10 = j13;
                    j11 = j15;
                    break;
                }
                java.lang.Object objF = Z8.E.f(objArr, jM);
                j10 = j13;
                p019b9.D d6 = Z8.E.f16749a;
                if (objF != d6) {
                    p247y7.AbstractC7350t.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Z8.D.a aVar = (Z8.D.a) objF;
                    int i10 = i6 + 1;
                    j11 = j15;
                    eVarArr[i6] = aVar.f16740F;
                    Z8.E.g(objArr, jM, d6);
                    Z8.E.g(objArr, j16, aVar.f16739E);
                    j12 = 1;
                    j16++;
                    if (i10 >= iMin) {
                        break;
                    }
                    i6 = i10;
                } else {
                    j11 = j15;
                    j12 = 1;
                }
                jM += j12;
                j13 = j10;
                j15 = j11;
            }
            jM = j16;
        } else {
            j10 = j13;
            j11 = j15;
        }
        int i11 = (int) (jM - jN);
        long j17 = l() == 0 ? jM : j10;
        long jMax = java.lang.Math.max(this.f16733K, jM - ((long) java.lang.Math.min(this.f16729G, i11)));
        if (this.f16730H == 0 && jMax < j11) {
            java.lang.Object[] objArr2 = this.f16732J;
            p247y7.AbstractC7350t.c(objArr2);
            if (p247y7.AbstractC7350t.b(Z8.E.f(objArr2, jMax), Z8.E.f16749a)) {
                jM++;
                jMax++;
            }
        }
        Y(jMax, j17, jM, j11);
        C();
        return (eVarArr.length == 0) ^ true ? L(eVarArr) : eVarArr;
    }

    @Override // Z8.x, Z8.InterfaceC1870g
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        return I(this, obj, eVar);
    }

    public final long a0() {
        long j6 = this.f16733K;
        if (j6 < this.f16734L) {
            this.f16734L = j6;
        }
        return j6;
    }

    @Override // Z8.C, Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        return D(this, interfaceC1870g, eVar);
    }

    @Override // Z8.C
    public java.util.List c() {
        synchronized (this) {
            int iR = R();
            if (iR == 0) {
                return p097j7.AbstractC6879v.m();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(iR);
            java.lang.Object[] objArr = this.f16732J;
            p247y7.AbstractC7350t.c(objArr);
            for (int i6 = 0; i6 < iR; i6++) {
                arrayList.add(Z8.E.f(objArr, this.f16733K + ((long) i6)));
            }
            return arrayList;
        }
    }

    @Override // p009a9.q
    public Z8.InterfaceC1869f d(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return Z8.E.e(this, iVar, i6, enumC1863d);
    }

    @Override // Z8.x
    public void m() {
        synchronized (this) {
            Y(M(), this.f16734L, M(), Q());
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    @Override // Z8.x
    public boolean n(java.lang.Object obj) {
        int i6;
        boolean z6;
        p127m7.e[] eVarArrL = p009a9.AbstractC1886c.f17160a;
        synchronized (this) {
            if (U(obj)) {
                eVarArrL = L(eVarArrL);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (p127m7.e eVar : eVarArrL) {
            if (eVar != null) {
                i7.w.a aVar = p087i7.w.f46751D;
                eVar.t(p087i7.w.b(p087i7.M.f46721a));
            }
        }
        return z6;
    }
}
