package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p237x7.l f44846a = f0.p.b.f44859D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.B1 f44847b = new V.B1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f44848c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p051f0.n f44849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f44850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p051f0.m f44851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p051f0.v f44852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static java.util.List f44853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static java.util.List f44854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f44855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p051f0.k f44856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static V.C1716h f44857l;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f0.p.a f44858D = new f0.p.a();

        a() {
            super(1);
        }

        public final void a(p051f0.n nVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p051f0.n) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f0.p.b f44859D = new f0.p.b();

        b() {
            super(1);
        }

        public final void a(p051f0.n nVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p051f0.n) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44860D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44861E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.l lVar, p237x7.l lVar2) {
            super(1);
            this.f44860D = lVar;
            this.f44861E = lVar2;
        }

        public final void a(java.lang.Object obj) {
            this.f44860D.l(obj);
            this.f44861E.l(obj);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44862D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44863E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p237x7.l lVar, p237x7.l lVar2) {
            super(1);
            this.f44862D = lVar;
            this.f44863E = lVar2;
        }

        public final void a(java.lang.Object obj) {
            this.f44862D.l(obj);
            this.f44863E.l(obj);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44864D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p237x7.l lVar) {
            super(1);
            this.f44864D = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p051f0.k l(p051f0.n nVar) {
            p051f0.k kVar = (p051f0.k) this.f44864D.l(nVar);
            synchronized (p051f0.p.I()) {
                p051f0.p.f44849d = p051f0.p.f44849d.N(kVar.f());
                p087i7.M m6 = p087i7.M.f46721a;
            }
            return kVar;
        }
    }

    static {
        f0.n.a aVar = p051f0.n.f44834G;
        f44849d = aVar.a();
        f44850e = 2;
        f44851f = new p051f0.m();
        f44852g = new p051f0.v();
        f44853h = p097j7.AbstractC6879v.m();
        f44854i = p097j7.AbstractC6879v.m();
        int i6 = f44850e;
        f44850e = i6 + 1;
        p051f0.C6539a c6539a = new p051f0.C6539a(i6, aVar.a());
        f44849d = f44849d.N(c6539a.f());
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(c6539a);
        f44855j = atomicReference;
        f44856k = (p051f0.k) atomicReference.get();
        f44857l = new V.C1716h(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x009f, LOOP:1: B:30:0x006f->B:42:0x00a8, LOOP_END, TryCatch #2 {all -> 0x009f, blocks: (B:25:0x0060, B:27:0x0065, B:30:0x006f, B:32:0x007f, B:34:0x008b, B:36:0x0094, B:39:0x00a1, B:42:0x00a8, B:43:0x00aa), top: B:54:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa A[EDGE_INSN: B:58:0x00aa->B:43:0x00aa BREAK  A[LOOP:1: B:30:0x006f->B:42:0x00a8], SYNTHETIC] */
    public static final java.lang.Object A(p237x7.l lVar) {
        java.lang.Object obj;
        p170r.L lE;
        java.lang.Object objA0;
        p051f0.k kVar = f44856k;
        p247y7.AbstractC7350t.d(kVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (I()) {
            try {
                obj = f44855j.get();
                lE = ((p051f0.C6539a) obj).E();
                if (lE != null) {
                    f44857l.a(1);
                }
                objA0 = a0((p051f0.k) obj, lVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (lE != null) {
            try {
                java.util.List list = f44853h;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((p237x7.p) list.get(i6)).u(X.e.a(lE), obj);
                }
                f44857l.a(-1);
            } catch (java.lang.Throwable th2) {
                f44857l.a(-1);
                throw th2;
            }
        }
        synchronized (I()) {
            try {
                C();
                if (lE != null) {
                    java.lang.Object[] objArr = lE.f53341b;
                    long[] jArr = lE.f53340a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j6 = jArr[i10];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i10 != length) {
                                    break;
                                    break;
                                }
                                i10++;
                            } else {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j6) < 128) {
                                        U((p051f0.y) objArr[(i10 << 3) + i12]);
                                    }
                                    j6 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                                if (i10 != length) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
        return objA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(f0.p.a.f44858D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        p051f0.v vVar = f44852g;
        int iE = vVar.e();
        int i6 = 0;
        int i10 = 0;
        while (true) {
            if (i6 >= iE) {
                break;
            }
            V.N1 n6 = vVar.f()[i6];
            java.lang.Object obj = n6 != null ? n6.get() : null;
            if (obj != null && !(!T((p051f0.y) obj))) {
                if (i10 != i6) {
                    vVar.f()[i10] = n6;
                    vVar.d()[i10] = vVar.d()[i6];
                }
                i10++;
            }
            i6++;
        }
        for (int i11 = i10; i11 < iE; i11++) {
            vVar.f()[i11] = null;
            vVar.d()[i11] = 0;
        }
        if (i10 != iE) {
            vVar.g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p051f0.k D(p051f0.k kVar, p237x7.l lVar, boolean z6) {
        boolean z10 = kVar instanceof p051f0.C6541c;
        if (z10 || kVar == null) {
            return new p051f0.C(z10 ? (p051f0.C6541c) kVar : null, lVar, null, false, z6);
        }
        return new p051f0.D(kVar, lVar, false, z6);
    }

    static /* synthetic */ p051f0.k E(p051f0.k kVar, p237x7.l lVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            lVar = null;
        }
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return D(kVar, lVar, z6);
    }

    public static final p051f0.A F(p051f0.A a6) {
        p051f0.A aW;
        f0.k.a aVar = p051f0.k.f44821e;
        p051f0.k kVarC = aVar.c();
        p051f0.A aW2 = W(a6, kVarC.f(), kVarC.g());
        if (aW2 != null) {
            return aW2;
        }
        synchronized (I()) {
            p051f0.k kVarC2 = aVar.c();
            aW = W(a6, kVarC2.f(), kVarC2.g());
        }
        if (aW != null) {
            return aW;
        }
        V();
        throw new p087i7.C6665k();
    }

    public static final p051f0.A G(p051f0.A a6, p051f0.k kVar) {
        p051f0.A aW = W(a6, kVar.f(), kVar.g());
        if (aW != null) {
            return aW;
        }
        V();
        throw new p087i7.C6665k();
    }

    public static final p051f0.k H() {
        p051f0.k kVar = (p051f0.k) f44847b.a();
        return kVar == null ? (p051f0.k) f44855j.get() : kVar;
    }

    public static final java.lang.Object I() {
        return f44848c;
    }

    public static final p051f0.k J() {
        return f44856k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.l K(p237x7.l lVar, p237x7.l lVar2, boolean z6) {
        if (!z6) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new f0.p.c(lVar, lVar2);
    }

    static /* synthetic */ p237x7.l L(p237x7.l lVar, p237x7.l lVar2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        return K(lVar, lVar2, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.l M(p237x7.l lVar, p237x7.l lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new f0.p.d(lVar, lVar2);
    }

    public static final p051f0.A N(p051f0.A a6, p051f0.y yVar) {
        p051f0.A aD0 = d0(yVar);
        if (aD0 != null) {
            aD0.h(Integer.MAX_VALUE);
            return aD0;
        }
        p051f0.A aD = a6.d();
        aD.h(Integer.MAX_VALUE);
        aD.g(yVar.e());
        p247y7.AbstractC7350t.d(aD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        yVar.C(aD);
        p247y7.AbstractC7350t.d(aD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return aD;
    }

    public static final p051f0.A O(p051f0.A a6, p051f0.y yVar, p051f0.k kVar) {
        p051f0.A aP;
        synchronized (I()) {
            aP = P(a6, yVar, kVar);
        }
        return aP;
    }

    private static final p051f0.A P(p051f0.A a6, p051f0.y yVar, p051f0.k kVar) {
        p051f0.A aN = N(a6, yVar);
        aN.c(a6);
        aN.h(kVar.f());
        return aN;
    }

    public static final void Q(p051f0.k kVar, p051f0.y yVar) {
        kVar.w(kVar.j() + 1);
        p237x7.l lVarK = kVar.k();
        if (lVarK != null) {
            lVarK.l(yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map R(p051f0.C6541c c6541c, p051f0.C6541c c6541c2, p051f0.n nVar) {
        long[] jArr;
        int i6;
        java.util.HashMap map;
        java.util.HashMap map2;
        int i10;
        p051f0.A aW;
        p170r.L lE = c6541c2.E();
        int iF = c6541c.f();
        java.util.HashMap map3 = null;
        if (lE == null) {
            return null;
        }
        p051f0.n nVarM = c6541c2.g().N(c6541c2.f()).M(c6541c2.F());
        java.lang.Object[] objArr = lE.f53341b;
        long[] jArr2 = lE.f53340a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            java.util.HashMap map4 = null;
            int i11 = 0;
            while (true) {
                long j6 = jArr2[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j6) < 128) {
                            p051f0.y yVar = (p051f0.y) objArr[(i11 << 3) + i14];
                            p051f0.A aE = yVar.e();
                            p051f0.A aW2 = W(aE, iF, nVar);
                            if (aW2 != null && (aW = W(aE, iF, nVarM)) != null && !p247y7.AbstractC7350t.b(aW2, aW)) {
                                p051f0.A aW3 = W(aE, c6541c2.f(), c6541c2.g());
                                if (aW3 == null) {
                                    V();
                                    throw new p087i7.C6665k();
                                }
                                p051f0.A aS = yVar.s(aW, aW2, aW3);
                                if (aS == null) {
                                    return null;
                                }
                                if (map4 == null) {
                                    map4 = new java.util.HashMap();
                                }
                                map4.put(aW2, aS);
                                map4 = map4;
                            }
                            map2 = null;
                            i10 = 8;
                        } else {
                            jArr2 = jArr2;
                            iF = iF;
                            map2 = map3;
                            i10 = i12;
                        }
                        j6 >>= i10;
                        i14++;
                        map3 = map2;
                        i12 = i10;
                        jArr2 = jArr2;
                        iF = iF;
                    }
                    jArr = jArr2;
                    i6 = iF;
                    map = map3;
                    if (i13 != i12) {
                        return map4;
                    }
                } else {
                    jArr = jArr2;
                    i6 = iF;
                    map = map3;
                }
                if (i11 != length) {
                    i11++;
                    map3 = map;
                    jArr2 = jArr;
                    iF = i6;
                } else {
                    map3 = map4;
                }
            }
        }
        return map3;
    }

    public static final p051f0.A S(p051f0.A a6, p051f0.y yVar, p051f0.k kVar, p051f0.A a10) {
        p051f0.A aN;
        if (kVar.i()) {
            kVar.p(yVar);
        }
        int iF = kVar.f();
        if (a10.f() == iF) {
            return a10;
        }
        synchronized (I()) {
            aN = N(a6, yVar);
        }
        aN.h(iF);
        if (a10.f() != 1) {
            kVar.p(yVar);
        }
        return aN;
    }

    private static final boolean T(p051f0.y yVar) {
        p051f0.A a6;
        int iE = f44851f.e(f44850e);
        p051f0.A a10 = null;
        p051f0.A aE = null;
        int i6 = 0;
        for (p051f0.A aE2 = yVar.e(); aE2 != null; aE2 = aE2.e()) {
            int iF = aE2.f();
            if (iF != 0) {
                if (iF >= iE) {
                    i6++;
                } else if (a10 == null) {
                    i6++;
                    a10 = aE2;
                } else {
                    if (aE2.f() < a10.f()) {
                        a6 = a10;
                        a10 = aE2;
                    } else {
                        a6 = aE2;
                    }
                    if (aE == null) {
                        aE = yVar.e();
                        p051f0.A a11 = aE;
                        while (true) {
                            if (aE == null) {
                                aE = a11;
                                break;
                            }
                            if (aE.f() >= iE) {
                                break;
                            }
                            if (a11.f() < aE.f()) {
                                a11 = aE;
                            }
                            aE = aE.e();
                        }
                    }
                    a10.h(0);
                    a10.c(aE);
                    a10 = a6;
                }
            }
        }
        return i6 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(p051f0.y yVar) {
        if (T(yVar)) {
            f44852g.a(yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void V() {
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p051f0.A W(p051f0.A a6, int i6, p051f0.n nVar) {
        p051f0.A a10 = null;
        while (a6 != null) {
            if (f0(a6, i6, nVar) && (a10 == null || a10.f() < a6.f())) {
                a10 = a6;
            }
            a6 = a6.e();
        }
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    public static final p051f0.A X(p051f0.A a6, p051f0.y yVar) {
        p051f0.A aW;
        f0.k.a aVar = p051f0.k.f44821e;
        p051f0.k kVarC = aVar.c();
        p237x7.l lVarH = kVarC.h();
        if (lVarH != null) {
            lVarH.l(yVar);
        }
        p051f0.A aW2 = W(a6, kVarC.f(), kVarC.g());
        if (aW2 != null) {
            return aW2;
        }
        synchronized (I()) {
            p051f0.k kVarC2 = aVar.c();
            p051f0.A aE = yVar.e();
            p247y7.AbstractC7350t.d(aE, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            aW = W(aE, kVarC2.f(), kVarC2.g());
            if (aW == null) {
                V();
                throw new p087i7.C6665k();
            }
        }
        return aW;
    }

    public static final void Y(int i6) {
        f44851f.f(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void Z() {
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object a0(p051f0.k kVar, p237x7.l lVar) {
        java.lang.Object objL = lVar.l(f44849d.C(kVar.f()));
        synchronized (I()) {
            int i6 = f44850e;
            f44850e = i6 + 1;
            f44849d = f44849d.C(kVar.f());
            f44855j.set(new p051f0.C6539a(i6, f44849d));
            kVar.d();
            f44849d = f44849d.N(i6);
            p087i7.M m6 = p087i7.M.f46721a;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p051f0.k b0(p237x7.l lVar) {
        return (p051f0.k) A(new f0.p.e(lVar));
    }

    public static final int c0(int i6, p051f0.n nVar) {
        int iA;
        int iE = nVar.E(i6);
        synchronized (I()) {
            iA = f44851f.a(iE);
        }
        return iA;
    }

    private static final p051f0.A d0(p051f0.y yVar) {
        int iE = f44851f.e(f44850e) - 1;
        p051f0.n nVarA = p051f0.n.f44834G.a();
        p051f0.A a6 = null;
        for (p051f0.A aE = yVar.e(); aE != null; aE = aE.e()) {
            if (aE.f() == 0) {
                return aE;
            }
            if (f0(aE, iE, nVarA)) {
                if (a6 != null) {
                    return aE.f() < a6.f() ? aE : a6;
                }
                a6 = aE;
            }
        }
        return null;
    }

    private static final boolean e0(int i6, int i10, p051f0.n nVar) {
        return (i10 == 0 || i10 > i6 || nVar.D(i10)) ? false : true;
    }

    private static final boolean f0(p051f0.A a6, int i6, p051f0.n nVar) {
        return e0(i6, a6.f(), nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(p051f0.k kVar) {
        int iE;
        if (f44849d.D(kVar.f())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Snapshot is not open: id=");
        sb.append(kVar.f());
        sb.append(", disposed=");
        sb.append(kVar.e());
        sb.append(", applied=");
        p051f0.C6541c c6541c = kVar instanceof p051f0.C6541c ? (p051f0.C6541c) kVar : null;
        sb.append(c6541c != null ? java.lang.Boolean.valueOf(c6541c.D()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (I()) {
            iE = f44851f.e(-1);
        }
        sb.append(iE);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final p051f0.A h0(p051f0.A a6, p051f0.y yVar, p051f0.k kVar) {
        p051f0.A aW;
        if (kVar.i()) {
            kVar.p(yVar);
        }
        int iF = kVar.f();
        p051f0.A aW2 = W(a6, iF, kVar.g());
        if (aW2 == null) {
            V();
            throw new p087i7.C6665k();
        }
        if (aW2.f() == kVar.f()) {
            return aW2;
        }
        synchronized (I()) {
            aW = W(yVar.e(), iF, kVar.g());
            if (aW == null) {
                V();
                throw new p087i7.C6665k();
            }
            if (aW.f() != iF) {
                aW = P(aW, yVar, kVar);
            }
        }
        p247y7.AbstractC7350t.d(aW, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (aW2.f() != 1) {
            kVar.p(yVar);
        }
        return aW;
    }

    public static final p051f0.n z(p051f0.n nVar, int i6, int i10) {
        while (i6 < i10) {
            nVar = nVar.N(i6);
            i6++;
        }
        return nVar;
    }
}
