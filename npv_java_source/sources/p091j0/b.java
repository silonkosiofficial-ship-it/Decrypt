package p091j0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p091j0.m, androidx.lifecycle.InterfaceC2073e, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f49032C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p237x7.a f49033D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.compose.ui.platform.coreshims.d f49034E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p170r.C f49035F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p170r.D f49036G;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p170r.C7027b f49040K;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f49044O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private androidx.compose.ui.platform.C1964o1 f49046Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f49047R;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f49037H = 100;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private j0.b.a f49038I = j0.b.a.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f49039J = true;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Y8.j f49041L = Y8.m.b(1, null, null, 6, null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final android.os.Handler f49042M = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p170r.AbstractC7039n f49043N = p170r.AbstractC7040o.a();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p170r.C f49045P = p170r.AbstractC7040o.b();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final java.lang.Runnable f49048S = new java.lang.Runnable() { // from class: j0.a
        @Override // java.lang.Runnable
        public final void run() {
            p091j0.b.j(this.f49031C);
        }
    };

    private enum a {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0.b$b, reason: collision with other inner class name */
    static final class C0610b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p091j0.b.C0610b f49052a = new p091j0.b.C0610b();

        private C0610b() {
        }

        private final void b(p091j0.b bVar, android.util.LongSparseArray longSparseArray) {
            android.view.translation.TranslationResponseValue value;
            java.lang.CharSequence text;
            androidx.compose.ui.platform.C1967p1 c1967p1;
            K0.o oVarB;
            K0.a aVar;
            p237x7.l lVar;
            p097j7.P pA = B1.b.a(longSparseArray);
            while (pA.hasNext()) {
                long jB = pA.b();
                android.view.translation.ViewTranslationResponse viewTranslationResponseA = p091j0.i.a(longSparseArray.get(jB));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (c1967p1 = (androidx.compose.ui.platform.C1967p1) bVar.k().c((int) jB)) != null && (oVarB = c1967p1.b()) != null && (aVar = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.z())) != null && (lVar = (p237x7.l) aVar.a()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(p091j0.b bVar, android.util.LongSparseArray longSparseArray) {
            f49052a.b(bVar, longSparseArray);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0073  */
        public final void c(p091j0.b bVar, long[] jArr, int[] iArr, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> consumer) {
            K0.o oVarB;
            java.lang.String strE;
            for (long j6 : jArr) {
                androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) bVar.k().c((int) j6);
                if (c1967p1 != null && (oVarB = c1967p1.b()) != null) {
                    p091j0.h.a();
                    android.view.translation.ViewTranslationRequest.Builder builderA = p091j0.g.a(bVar.l().getAutofillId(), oVarB.o());
                    java.util.List list = (java.util.List) K0.l.a(oVarB.w(), K0.r.f6030a.D());
                    if (list != null && (strE = p002a1.a.e(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderA.setValue("android:text", android.view.translation.TranslationRequestValue.forText(new M0.C1332d(strE, null, null, 6, null)));
                        consumer.o(builderA.build());
                    }
                }
            }
        }

        public final void d(final p091j0.b bVar, final android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> longSparseArray) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (p247y7.AbstractC7350t.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
                b(bVar, longSparseArray);
            } else {
                bVar.l().post(new java.lang.Runnable() { // from class: j0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        p091j0.b.C0610b.e(bVar, longSparseArray);
                    }
                });
            }
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f49053F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f49054G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f49055H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f49057J;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f49055H = obj;
            this.f49057J |= Integer.MIN_VALUE;
            return p091j0.b.this.b(this);
        }
    }

    public b(androidx.compose.ui.platform.r rVar, p237x7.a aVar) {
        this.f49032C = rVar;
        this.f49033D = aVar;
        int i6 = 0;
        int i10 = 1;
        p247y7.AbstractC7342k abstractC7342k = null;
        this.f49035F = new p170r.C(i6, i10, abstractC7342k);
        this.f49036G = new p170r.D(i6, i10, abstractC7342k);
        this.f49040K = new p170r.C7027b(i6, i10, abstractC7342k);
        this.f49046Q = new androidx.compose.ui.platform.C1964o1(rVar.getSemanticsOwner().a(), p170r.AbstractC7040o.a());
    }

    private final void A(int i6, java.lang.String str) {
        androidx.compose.ui.platform.coreshims.d dVar;
        if (android.os.Build.VERSION.SDK_INT >= 29 && (dVar = this.f49034E) != null) {
            android.view.autofill.AutofillId autofillIdA = dVar.a(i6);
            if (autofillIdA != null) {
                dVar.c(autofillIdA, str);
            } else {
                C0.a.c("Invalid content capture ID");
                throw new p087i7.C6665k();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[LOOP:1: B:15:0x0057->B:27:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0093 A[EDGE_INSN: B:45:0x0093->B:28:0x0093 BREAK  A[LOOP:1: B:15:0x0057->B:27:0x0090], SYNTHETIC] */
    private final void B(K0.o oVar, androidx.compose.ui.platform.C1964o1 c1964o1) {
        int i6 = 0;
        p170r.D d6 = new p170r.D(i6, 1, null);
        java.util.List listT = oVar.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            K0.o oVar2 = (K0.o) listT.get(i10);
            if (k().a(oVar2.o())) {
                if (!c1964o1.a().a(oVar2.o())) {
                    q(oVar.q());
                    return;
                }
                d6.f(oVar2.o());
            }
        }
        p170r.D dA = c1964o1.a();
        int[] iArr = dA.f53400b;
        long[] jArr = dA.f53399a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j6) < 128 && !d6.a(iArr[(i11 << 3) + i13])) {
                            q(oVar.q());
                            return;
                        }
                        j6 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        java.util.List listT2 = oVar.t();
        int size2 = listT2.size();
        while (i6 < size2) {
            K0.o oVar3 = (K0.o) listT2.get(i6);
            if (k().a(oVar3.o())) {
                java.lang.Object objC = this.f49045P.c(oVar3.o());
                if (objC == null) {
                    C0.a.c("node not present in pruned tree before this change");
                    throw new p087i7.C6665k();
                }
                B(oVar3, (androidx.compose.ui.platform.C1964o1) objC);
            }
            i6++;
        }
    }

    private final void C() {
        K0.a aVar;
        p237x7.l lVar;
        p170r.AbstractC7039n abstractC7039nK = k();
        java.lang.Object[] objArr = abstractC7039nK.f53395c;
        long[] jArr = abstractC7039nK.f53393a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        K0.k kVarW = ((androidx.compose.ui.platform.C1967p1) objArr[(i6 << 3) + i11]).b().w();
                        if (p247y7.AbstractC7350t.b(K0.l.a(kVarW, K0.r.f6030a.r()), java.lang.Boolean.FALSE) && (aVar = (K0.a) K0.l.a(kVarW, K0.j.f5973a.A())) != null && (lVar = (p237x7.l) aVar.a()) != null) {
                        }
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    private final androidx.compose.ui.platform.coreshims.f E(K0.o oVar) {
        androidx.compose.ui.platform.coreshims.b bVarA;
        android.view.autofill.AutofillId autofillIdA;
        java.lang.String strI;
        androidx.compose.ui.platform.coreshims.d dVar = this.f49034E;
        if (dVar == null || android.os.Build.VERSION.SDK_INT < 29 || (bVarA = androidx.compose.ui.platform.coreshims.e.a(this.f49032C)) == null) {
            return null;
        }
        K0.o oVarR = oVar.r();
        if (oVarR != null) {
            autofillIdA = dVar.a(oVarR.o());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = bVarA.a();
        }
        androidx.compose.ui.platform.coreshims.f fVarB = dVar.b(autofillIdA, oVar.o());
        if (fVarB == null) {
            return null;
        }
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        if (kVarW.f(rVar.w())) {
            return null;
        }
        android.os.Bundle bundleA = fVarB.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.f49044O);
        }
        java.lang.String str = (java.lang.String) K0.l.a(kVarW, rVar.C());
        if (str != null) {
            fVarB.e(oVar.o(), null, null, str);
        }
        java.util.List list = (java.util.List) K0.l.a(kVarW, rVar.D());
        if (list != null) {
            fVarB.b("android.widget.TextView");
            fVarB.f(p002a1.a.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        M0.C1332d c1332d = (M0.C1332d) K0.l.a(kVarW, rVar.g());
        if (c1332d != null) {
            fVarB.b("android.widget.EditText");
            fVarB.f(c1332d);
        }
        java.util.List list2 = (java.util.List) K0.l.a(kVarW, rVar.d());
        if (list2 != null) {
            fVarB.c(p002a1.a.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        K0.h hVar = (K0.h) K0.l.a(kVarW, rVar.y());
        if (hVar != null && (strI = androidx.compose.ui.platform.AbstractC1970q1.i(hVar.n())) != null) {
            fVarB.b(strI);
        }
        M0.K kE = androidx.compose.ui.platform.AbstractC1970q1.e(kVarW);
        if (kE != null) {
            M0.J jL = kE.l();
            fVarB.g(Y0.x.h(jL.i().l()) * jL.b().getDensity() * jL.b().v0(), 0, 0, 0);
        }
        p131n0.i iVarH = oVar.h();
        fVarB.d((int) iVarH.i(), (int) iVarH.l(), 0, 0, (int) iVarH.n(), (int) iVarH.h());
        return fVarB;
    }

    private final void F(K0.o oVar) {
        if (n()) {
            J(oVar);
            c(oVar.o(), E(oVar));
            java.util.List listT = oVar.t();
            int size = listT.size();
            for (int i6 = 0; i6 < size; i6++) {
                F((K0.o) listT.get(i6));
            }
        }
    }

    private final void G(K0.o oVar) {
        if (n()) {
            d(oVar.o());
            java.util.List listT = oVar.t();
            int size = listT.size();
            for (int i6 = 0; i6 < size; i6++) {
                G((K0.o) listT.get(i6));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0017->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005f], SYNTHETIC] */
    private final void I() {
        this.f49045P.i();
        p170r.AbstractC7039n abstractC7039nK = k();
        int[] iArr = abstractC7039nK.f53394b;
        java.lang.Object[] objArr = abstractC7039nK.f53395c;
        long[] jArr = abstractC7039nK.f53393a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            int i12 = (i6 << 3) + i11;
                            this.f49045P.s(iArr[i12], new androidx.compose.ui.platform.C1964o1(((androidx.compose.ui.platform.C1967p1) objArr[i12]).b(), k()));
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i6 != length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        this.f49046Q = new androidx.compose.ui.platform.C1964o1(this.f49032C.getSemanticsOwner().a(), k());
    }

    private final void J(K0.o oVar) {
        K0.a aVar;
        p237x7.l lVar;
        java.lang.Boolean bool;
        K0.k kVarW = oVar.w();
        java.lang.Boolean bool2 = (java.lang.Boolean) K0.l.a(kVarW, K0.r.f6030a.r());
        if (this.f49038I == j0.b.a.SHOW_ORIGINAL && p247y7.AbstractC7350t.b(bool2, java.lang.Boolean.TRUE)) {
            K0.a aVar2 = (K0.a) K0.l.a(kVarW, K0.j.f5973a.A());
            if (aVar2 == null || (lVar = (p237x7.l) aVar2.a()) == null) {
                return;
            } else {
                bool = java.lang.Boolean.FALSE;
            }
        } else if (this.f49038I != j0.b.a.SHOW_TRANSLATED || !p247y7.AbstractC7350t.b(bool2, java.lang.Boolean.FALSE) || (aVar = (K0.a) K0.l.a(kVarW, K0.j.f5973a.A())) == null || (lVar = (p237x7.l) aVar.a()) == null) {
            return;
        } else {
            bool = java.lang.Boolean.TRUE;
        }
    }

    private final void c(int i6, androidx.compose.ui.platform.coreshims.f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.f49036G.a(i6)) {
            this.f49036G.q(i6);
        } else {
            this.f49035F.s(i6, fVar);
        }
    }

    private final void d(int i6) {
        if (this.f49035F.b(i6)) {
            this.f49035F.p(i6);
        } else {
            this.f49036G.f(i6);
        }
    }

    private final void e(p170r.AbstractC7039n abstractC7039n) {
        int i6;
        int[] iArr = abstractC7039n.f53394b;
        long[] jArr = abstractC7039n.f53393a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j6) < 128) {
                        int i14 = iArr[(i10 << 3) + i13];
                        androidx.compose.ui.platform.C1964o1 c1964o1 = (androidx.compose.ui.platform.C1964o1) this.f49045P.c(i14);
                        androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) abstractC7039n.c(i14);
                        K0.o oVarB = c1967p1 != null ? c1967p1.b() : null;
                        if (oVarB == null) {
                            C0.a.c("no value for specified key");
                            throw new p087i7.C6665k();
                        }
                        if (c1964o1 == null) {
                            java.util.Iterator it = oVarB.w().iterator();
                            while (it.hasNext()) {
                                java.lang.Object key = ((java.util.Map.Entry) it.next()).getKey();
                                K0.r rVar = K0.r.f6030a;
                                if (p247y7.AbstractC7350t.b(key, rVar.D())) {
                                    java.util.List list = (java.util.List) K0.l.a(oVarB.w(), rVar.D());
                                    A(oVarB.o(), java.lang.String.valueOf(list != null ? (M0.C1332d) p097j7.AbstractC6879v.k0(list) : null));
                                }
                            }
                        } else {
                            java.util.Iterator it2 = oVarB.w().iterator();
                            while (it2.hasNext()) {
                                K0.v vVar = (K0.v) ((java.util.Map.Entry) it2.next()).getKey();
                                K0.r rVar2 = K0.r.f6030a;
                                if (p247y7.AbstractC7350t.b(vVar, rVar2.D())) {
                                    java.util.List list2 = (java.util.List) K0.l.a(c1964o1.b(), rVar2.D());
                                    M0.C1332d c1332d = list2 != null ? (M0.C1332d) p097j7.AbstractC6879v.k0(list2) : null;
                                    java.util.List list3 = (java.util.List) K0.l.a(oVarB.w(), rVar2.D());
                                    M0.C1332d c1332d2 = list3 != null ? (M0.C1332d) p097j7.AbstractC6879v.k0(list3) : null;
                                    if (!p247y7.AbstractC7350t.b(c1332d, c1332d2)) {
                                        A(oVarB.o(), java.lang.String.valueOf(c1332d2));
                                    }
                                }
                            }
                        }
                        i6 = 8;
                    } else {
                        i6 = i11;
                    }
                    j6 >>= i6;
                    i13++;
                    i11 = i6;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void h() {
        K0.a aVar;
        p237x7.a aVar2;
        p170r.AbstractC7039n abstractC7039nK = k();
        java.lang.Object[] objArr = abstractC7039nK.f53395c;
        long[] jArr = abstractC7039nK.f53393a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        K0.k kVarW = ((androidx.compose.ui.platform.C1967p1) objArr[(i6 << 3) + i11]).b().w();
                        if (K0.l.a(kVarW, K0.r.f6030a.r()) != null && (aVar = (K0.a) K0.l.a(kVarW, K0.j.f5973a.a())) != null && (aVar2 = (p237x7.a) aVar.a()) != null) {
                        }
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(p091j0.b bVar) {
        if (bVar.n()) {
            F0.n0.c(bVar.f49032C, false, 1, null);
            bVar.B(bVar.f49032C.getSemanticsOwner().a(), bVar.f49046Q);
            bVar.z(bVar.f49032C.getSemanticsOwner().a(), bVar.f49046Q);
            bVar.e(bVar.k());
            bVar.I();
            bVar.f49047R = false;
        }
    }

    private final void m() {
        K0.a aVar;
        p237x7.l lVar;
        p170r.AbstractC7039n abstractC7039nK = k();
        java.lang.Object[] objArr = abstractC7039nK.f53395c;
        long[] jArr = abstractC7039nK.f53393a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        K0.k kVarW = ((androidx.compose.ui.platform.C1967p1) objArr[(i6 << 3) + i11]).b().w();
                        if (p247y7.AbstractC7350t.b(K0.l.a(kVarW, K0.r.f6030a.r()), java.lang.Boolean.TRUE) && (aVar = (K0.a) K0.l.a(kVarW, K0.j.f5973a.A())) != null && (lVar = (p237x7.l) aVar.a()) != null) {
                        }
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[LOOP:0: B:13:0x0031->B:23:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x006d A[EDGE_INSN: B:53:0x006d->B:24:0x006d BREAK  A[LOOP:0: B:13:0x0031->B:23:0x0066], SYNTHETIC] */
    private final void p() {
        androidx.compose.ui.platform.coreshims.d dVar = this.f49034E;
        if (dVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
            long j6 = 255;
            char c6 = 7;
            if (this.f49035F.g()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                p170r.C c10 = this.f49035F;
                java.lang.Object[] objArr = c10.f53395c;
                long[] jArr = c10.f53393a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j10 = jArr[i6];
                        long[] jArr2 = jArr;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i6 - length)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j10 & j6) < 128) {
                                    arrayList.add((androidx.compose.ui.platform.coreshims.f) objArr[(i6 << 3) + i11]);
                                }
                                j10 >>= 8;
                                i11++;
                                j6 = 255;
                            }
                            if (i10 != 8) {
                                break;
                            }
                            if (i6 != length) {
                                break;
                            }
                            i6++;
                            jArr = jArr2;
                            j6 = 255;
                        } else if (i6 != length) {
                            break;
                            break;
                        } else {
                            i6++;
                            jArr = jArr2;
                            j6 = 255;
                        }
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList2.add(((androidx.compose.ui.platform.coreshims.f) arrayList.get(i12)).h());
                }
                dVar.d(arrayList2);
                this.f49035F.i();
            }
            if (this.f49036G.c()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                p170r.D d6 = this.f49036G;
                int[] iArr = d6.f53400b;
                long[] jArr3 = d6.f53399a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j11 = jArr3[i13];
                        if ((((~j11) << c6) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j11 & 255) < 128) {
                                    arrayList3.add(java.lang.Integer.valueOf(iArr[(i13 << 3) + i15]));
                                }
                                j11 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length2) {
                            break;
                        }
                        i13++;
                        c6 = 7;
                    }
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    arrayList4.add(java.lang.Long.valueOf(((java.lang.Number) arrayList3.get(i16)).intValue()));
                }
                dVar.e(p097j7.AbstractC6879v.U0(arrayList4));
                this.f49036G.h();
            }
        }
    }

    private final void q(F0.J j6) {
        if (this.f49040K.add(j6)) {
            this.f49041L.j(p087i7.M.f46721a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[LOOP:1: B:13:0x0040->B:25:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[EDGE_INSN: B:44:0x0082->B:26:0x0082 BREAK  A[LOOP:1: B:13:0x0040->B:25:0x007f], SYNTHETIC] */
    private final void z(K0.o oVar, androidx.compose.ui.platform.C1964o1 c1964o1) {
        java.util.List listT = oVar.t();
        int size = listT.size();
        for (int i6 = 0; i6 < size; i6++) {
            K0.o oVar2 = (K0.o) listT.get(i6);
            if (k().a(oVar2.o()) && !c1964o1.a().a(oVar2.o())) {
                F(oVar2);
            }
        }
        p170r.C c6 = this.f49045P;
        int[] iArr = c6.f53394b;
        long[] jArr = c6.f53393a;
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
                            int i13 = iArr[(i10 << 3) + i12];
                            if (!k().a(i13)) {
                                d(i13);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        java.util.List listT2 = oVar.t();
        int size2 = listT2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            K0.o oVar3 = (K0.o) listT2.get(i14);
            if (k().a(oVar3.o()) && this.f49045P.a(oVar3.o())) {
                java.lang.Object objC = this.f49045P.c(oVar3.o());
                if (objC == null) {
                    C0.a.c("node not present in pruned tree before this change");
                    throw new p087i7.C6665k();
                }
                z(oVar3, (androidx.compose.ui.platform.C1964o1) objC);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void D(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.b(this, rVar);
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public void H(androidx.lifecycle.r rVar) {
        this.f49034E = (androidx.compose.ui.platform.coreshims.d) this.f49033D.b();
        F(this.f49032C.getSemanticsOwner().a());
        p();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p127m7.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof j0.b.c
            if (r0 == 0) goto L13
            r0 = r10
            j0.b$c r0 = (j0.b.c) r0
            int r1 = r0.f49057J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49057J = r1
            goto L18
        L13:
            j0.b$c r0 = new j0.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f49055H
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f49057J
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.f49054G
            Y8.l r2 = (Y8.l) r2
            java.lang.Object r5 = r0.f49053F
            j0.b r5 = (p091j0.b) r5
            p087i7.x.b(r10)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r2
            goto L56
        L35:
            r10 = move-exception
            goto La5
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r2 = r0.f49054G
            Y8.l r2 = (Y8.l) r2
            java.lang.Object r5 = r0.f49053F
            j0.b r5 = (p091j0.b) r5
            p087i7.x.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4c:
            p087i7.x.b(r10)
            Y8.j r10 = r9.f49041L     // Catch: java.lang.Throwable -> La3
            Y8.l r10 = r10.iterator()     // Catch: java.lang.Throwable -> La3
            r5 = r9
        L56:
            r0.f49053F = r5     // Catch: java.lang.Throwable -> L35
            r0.f49054G = r10     // Catch: java.lang.Throwable -> L35
            r0.f49057J = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            return r1
        L63:
            r8 = r2
            r2 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L9b
            r2.next()     // Catch: java.lang.Throwable -> L35
            boolean r10 = r5.n()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            r5.p()     // Catch: java.lang.Throwable -> L35
        L7a:
            boolean r10 = r5.f49047R     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L87
            r5.f49047R = r4     // Catch: java.lang.Throwable -> L35
            android.os.Handler r10 = r5.f49042M     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r6 = r5.f49048S     // Catch: java.lang.Throwable -> L35
            r10.post(r6)     // Catch: java.lang.Throwable -> L35
        L87:
            r.b r10 = r5.f49040K     // Catch: java.lang.Throwable -> L35
            r10.clear()     // Catch: java.lang.Throwable -> L35
            long r6 = r5.f49037H     // Catch: java.lang.Throwable -> L35
            r0.f49053F = r5     // Catch: java.lang.Throwable -> L35
            r0.f49054G = r2     // Catch: java.lang.Throwable -> L35
            r0.f49057J = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = W8.Y.a(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L33
            return r1
        L9b:
            r.b r10 = r5.f49040K
            r10.clear()
            i7.M r10 = p087i7.M.f46721a
            return r10
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            r.b r0 = r5.f49040K
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p091j0.b.b(m7.e):java.lang.Object");
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void f(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.d(this, rVar);
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void g(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.a(this, rVar);
    }

    public final p170r.AbstractC7039n k() {
        if (this.f49039J) {
            this.f49039J = false;
            this.f49043N = androidx.compose.ui.platform.AbstractC1970q1.b(this.f49032C.getSemanticsOwner());
            this.f49044O = java.lang.System.currentTimeMillis();
        }
        return this.f49043N;
    }

    public final androidx.compose.ui.platform.r l() {
        return this.f49032C;
    }

    public final boolean n() {
        return p091j0.m.f49060z.a() && this.f49034E != null;
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void o(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.c(this, rVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f49042M.removeCallbacks(this.f49048S);
        this.f49034E = null;
    }

    public final void r() {
        this.f49038I = j0.b.a.SHOW_ORIGINAL;
        h();
    }

    public final void s(long[] jArr, int[] iArr, java.util.function.Consumer consumer) {
        p091j0.b.C0610b.f49052a.c(this, jArr, iArr, consumer);
    }

    public final void t() {
        this.f49038I = j0.b.a.SHOW_ORIGINAL;
        m();
    }

    public final void u(F0.J j6) {
        this.f49039J = true;
        if (n()) {
            q(j6);
        }
    }

    public final void v() {
        this.f49039J = true;
        if (!n() || this.f49047R) {
            return;
        }
        this.f49047R = true;
        this.f49042M.post(this.f49048S);
    }

    public final void w() {
        this.f49038I = j0.b.a.SHOW_TRANSLATED;
        C();
    }

    public final void x(p091j0.b bVar, android.util.LongSparseArray longSparseArray) {
        p091j0.b.C0610b.f49052a.d(bVar, longSparseArray);
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public void y(androidx.lifecycle.r rVar) {
        G(this.f49032C.getSemanticsOwner().a());
        p();
        this.f49034E = null;
    }
}
