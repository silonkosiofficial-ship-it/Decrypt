package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements p121m0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.p f19637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f19638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.a f19639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.a f19640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.a f19641e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p121m0.d f19643g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p170r.F f19646j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.compose.ui.focus.FocusTargetNode f19642f = new androidx.compose.ui.focus.FocusTargetNode();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p121m0.s f19644h = new p121m0.s();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.compose.ui.d f19645i = androidx.compose.ui.focus.l.a(androidx.compose.ui.d.f19586a, androidx.compose.ui.focus.FocusOwnerImpl.e.f19652D).b(new F0.W() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public boolean equals(java.lang.Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return this.f19656b.r().hashCode();
        }

        @Override // F0.W
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.focus.FocusTargetNode g() {
            return this.f19656b.r();
        }

        @Override // F0.W
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        }
    });

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19647a;

        static {
            int[] iArr = new int[p121m0.a.values().length];
            try {
                iArr[p121m0.a.Redirected.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p121m0.a.Cancelled.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p121m0.a.RedirectCancelled.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p121m0.a.None.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f19647a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.focus.FocusOwnerImpl.b f19648D = new androidx.compose.ui.focus.FocusOwnerImpl.b();

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* synthetic */ class c extends p247y7.C7348q implements p237x7.a {
        c(java.lang.Object obj) {
            super(0, obj, androidx.compose.ui.focus.FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((androidx.compose.ui.focus.FocusOwnerImpl) this.f57287D).s();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19649D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusOwnerImpl f19650E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.l f19651F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusOwnerImpl focusOwnerImpl, p237x7.l lVar) {
            super(1);
            this.f19649D = focusTargetNode;
            this.f19650E = focusOwnerImpl;
            this.f19651F = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (p247y7.AbstractC7350t.b(focusTargetNode, this.f19649D)) {
                zBooleanValue = false;
            } else {
                if (p247y7.AbstractC7350t.b(focusTargetNode, this.f19650E.r())) {
                    throw new java.lang.IllegalStateException("Focus search landed at the root.".toString());
                }
                zBooleanValue = ((java.lang.Boolean) this.f19651F.l(focusTargetNode)).booleanValue();
            }
            return java.lang.Boolean.valueOf(zBooleanValue);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.focus.FocusOwnerImpl.e f19652D = new androidx.compose.ui.focus.FocusOwnerImpl.e();

        e() {
            super(1);
        }

        public final void a(androidx.compose.ui.focus.j jVar) {
            jVar.y(false);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.focus.j) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f19653D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f19654E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p247y7.O o6, int i6) {
            super(1);
            this.f19653D = o6;
            this.f19654E = i6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            this.f19653D.f57254C = androidx.compose.ui.focus.r.k(focusTargetNode, this.f19654E);
            java.lang.Boolean bool = (java.lang.Boolean) this.f19653D.f57254C;
            return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f19655D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i6) {
            super(1);
            this.f19655D = i6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            java.lang.Boolean boolK = androidx.compose.ui.focus.r.k(focusTargetNode, this.f19655D);
            return java.lang.Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    public FocusOwnerImpl(p237x7.l lVar, p237x7.p pVar, p237x7.l lVar2, p237x7.a aVar, p237x7.a aVar2, p237x7.a aVar3) {
        this.f19637a = pVar;
        this.f19638b = lVar2;
        this.f19639c = aVar;
        this.f19640d = aVar2;
        this.f19641e = aVar3;
        this.f19643g = new p121m0.d(lVar, new androidx.compose.ui.focus.FocusOwnerImpl.c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f19642f.a2() == p121m0.o.Inactive) {
            this.f19639c.b();
        }
    }

    private final androidx.compose.ui.d.c t(F0.InterfaceC0924j interfaceC0924j) {
        int iA = F0.AbstractC0918f0.a(1024) | F0.AbstractC0918f0.a(8192);
        if (!interfaceC0924j.E0().A1()) {
            C0.a.b("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.d.c cVarE0 = interfaceC0924j.E0();
        androidx.compose.ui.d.c cVar = null;
        if ((cVarE0.q1() & iA) != 0) {
            while (true) {
                cVarE0 = cVarE0.r1();
                if (cVarE0 == null) {
                    break;
                }
                if ((cVarE0.v1() & iA) != 0) {
                    if ((F0.AbstractC0918f0.a(1024) & cVarE0.v1()) != 0) {
                        return cVar;
                    }
                    cVar = cVarE0;
                }
            }
        }
        return cVar;
    }

    private final boolean v(android.view.KeyEvent keyEvent) {
        long jA = p231x0.d.a(keyEvent);
        int iB = p231x0.d.b(keyEvent);
        x0.c.a aVar = p231x0.c.f56893a;
        if (p231x0.c.e(iB, aVar.a())) {
            p170r.F f6 = this.f19646j;
            if (f6 == null) {
                f6 = new p170r.F(3);
                this.f19646j = f6;
            }
            f6.l(jA);
        } else if (p231x0.c.e(iB, aVar.b())) {
            p170r.F f10 = this.f19646j;
            if (f10 == null || !f10.a(jA)) {
                return false;
            }
            p170r.F f11 = this.f19646j;
            if (f11 != null) {
                f11.m(jA);
            }
        }
        return true;
    }

    @Override // p121m0.i
    public void a(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        this.f19643g.d(focusTargetNode);
    }

    @Override // p121m0.i
    public androidx.compose.ui.d b() {
        return this.f19645i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [X.b] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [X.b] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.b] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.b] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [X.b] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [X.b] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // p121m0.i
    public boolean c(B0.b bVar) {
        B0.a aVar;
        int size;
        F0.C0910b0 c0910b0K0;
        ?? G10;
        F0.C0910b0 c0910b0K1;
        if (!(!this.f19643g.b())) {
            throw new java.lang.IllegalStateException("Dispatching rotary event while focus system is invalidated.".toString());
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = androidx.compose.ui.focus.s.b(this.f19642f);
        if (focusTargetNodeB != null) {
            int iA = F0.AbstractC0918f0.a(16384);
            if (!focusTargetNodeB.E0().A1()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.d.c cVarE0 = focusTargetNodeB.E0();
            F0.J jM = F0.AbstractC0925k.m(focusTargetNodeB);
            loop0: while (true) {
                if (jM == null) {
                    G10 = 0;
                    break;
                }
                if ((jM.k0().k().q1() & iA) != 0) {
                    while (cVarE0 != null) {
                        if ((cVarE0.v1() & iA) != 0) {
                            ?? bVar2 = 0;
                            G10 = cVarE0;
                            while (G10 != 0) {
                                if (G10 instanceof B0.a) {
                                    break loop0;
                                }
                                if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                    androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                    int i6 = 0;
                                    while (cVarU1 != null) {
                                        if ((cVarU1.v1() & iA) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                G10 = G10;
                                                bVar2 = bVar2;
                                                bVar2 = bVar2;
                                                G10 = cVarU1;
                                            } else {
                                                if (bVar2 == 0) {
                                                    bVar2 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (G10 != 0) {
                                                    bVar2.d(G10);
                                                    G10 = 0;
                                                }
                                                bVar2.d(cVarU1);
                                            }
                                        } else {
                                            G10 = G10;
                                            bVar2 = bVar2;
                                        }
                                        cVarU1 = cVarU1.r1();
                                        G10 = G10;
                                        bVar2 = bVar2;
                                    }
                                    if (i6 == 1) {
                                        G10 = G10;
                                        bVar2 = bVar2;
                                    } else {
                                        G10 = G10;
                                        bVar2 = bVar2;
                                    }
                                }
                                G10 = F0.AbstractC0925k.g(bVar2);
                            }
                        }
                        cVarE0 = cVarE0.x1();
                    }
                }
                jM = jM.o0();
                cVarE0 = (jM == null || (c0910b0K1 = jM.k0()) == null) ? null : c0910b0K1.o();
            }
            aVar = (B0.a) G10;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int iA2 = F0.AbstractC0918f0.a(16384);
            if (!aVar.E0().A1()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.d.c cVarX1 = aVar.E0().x1();
            F0.J jM2 = F0.AbstractC0925k.m(aVar);
            java.util.ArrayList arrayList = null;
            while (jM2 != null) {
                if ((jM2.k0().k().q1() & iA2) != 0) {
                    while (cVarX1 != null) {
                        if ((cVarX1.v1() & iA2) != 0) {
                            androidx.compose.ui.d.c cVarG = cVarX1;
                            X.b bVar3 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof B0.a) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.v1() & iA2) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                                    int i10 = 0;
                                    for (androidx.compose.ui.d.c cVarU2 = ((F0.AbstractC0927m) cVarG).U1(); cVarU2 != null; cVarU2 = cVarU2.r1()) {
                                        if ((cVarU2.v1() & iA2) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarG = cVarU2;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar3.d(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar3.d(cVarU2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarG = F0.AbstractC0925k.g(bVar3);
                            }
                        }
                        cVarX1 = cVarX1.x1();
                    }
                }
                jM2 = jM2.o0();
                cVarX1 = (jM2 == null || (c0910b0K0 = jM2.k0()) == null) ? null : c0910b0K0.o();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i11 = size - 1;
                    if (((B0.a) arrayList.get(size)).r0(bVar)) {
                        return true;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    size = i11;
                }
            }
            ?? E10 = aVar.E0();
            ?? bVar4 = 0;
            while (E10 != 0) {
                if (E10 instanceof B0.a) {
                    if (((B0.a) E10).r0(bVar)) {
                        return true;
                    }
                } else if ((E10.v1() & iA2) != 0 && (E10 instanceof F0.AbstractC0927m)) {
                    androidx.compose.ui.d.c cVarU3 = ((F0.AbstractC0927m) E10).U1();
                    int i12 = 0;
                    while (cVarU3 != null) {
                        if ((cVarU3.v1() & iA2) != 0) {
                            i12++;
                            if (i12 == 1) {
                                E10 = E10;
                                bVar4 = bVar4;
                                bVar4 = bVar4;
                                E10 = cVarU3;
                            } else {
                                if (bVar4 == 0) {
                                    bVar4 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                }
                                if (E10 != 0) {
                                    bVar4.d(E10);
                                    E10 = 0;
                                }
                                bVar4.d(cVarU3);
                            }
                        } else {
                            E10 = E10;
                            bVar4 = bVar4;
                        }
                        cVarU3 = cVarU3.r1();
                        E10 = E10;
                        bVar4 = bVar4;
                    }
                    if (i12 == 1) {
                        E10 = E10;
                        bVar4 = bVar4;
                    } else {
                        E10 = E10;
                        bVar4 = bVar4;
                    }
                }
                E10 = F0.AbstractC0925k.g(bVar4);
            }
            ?? E11 = aVar.E0();
            ?? bVar5 = 0;
            while (E11 != 0) {
                if (E11 instanceof B0.a) {
                    if (((B0.a) E11).W(bVar)) {
                        return true;
                    }
                } else if ((E11.v1() & iA2) != 0 && (E11 instanceof F0.AbstractC0927m)) {
                    androidx.compose.ui.d.c cVarU4 = ((F0.AbstractC0927m) E11).U1();
                    int i13 = 0;
                    while (cVarU4 != null) {
                        if ((cVarU4.v1() & iA2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                E11 = E11;
                                bVar5 = bVar5;
                                bVar5 = bVar5;
                                E11 = cVarU4;
                            } else {
                                if (bVar5 == 0) {
                                    bVar5 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                }
                                if (E11 != 0) {
                                    bVar5.d(E11);
                                    E11 = 0;
                                }
                                bVar5.d(cVarU4);
                            }
                        } else {
                            E11 = E11;
                            bVar5 = bVar5;
                        }
                        cVarU4 = cVarU4.r1();
                        E11 = E11;
                        bVar5 = bVar5;
                    }
                    if (i13 == 1) {
                        E11 = E11;
                        bVar5 = bVar5;
                    } else {
                        E11 = E11;
                        bVar5 = bVar5;
                    }
                }
                E11 = F0.AbstractC0925k.g(bVar5);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (((B0.a) arrayList.get(i14)).W(bVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p121m0.i
    public void d(p121m0.j jVar) {
        this.f19643g.f(jVar);
    }

    @Override // p121m0.i
    public boolean e(boolean z6, boolean z10, boolean z11, int i6) {
        boolean zC;
        p121m0.s sVarG = g();
        androidx.compose.ui.focus.FocusOwnerImpl.b bVar = androidx.compose.ui.focus.FocusOwnerImpl.b.f19648D;
        try {
            if (sVarG.f50224c) {
                sVarG.g();
            }
            sVarG.f();
            if (bVar != null) {
                sVarG.f50223b.d(bVar);
            }
            if (!z6) {
                int i10 = androidx.compose.ui.focus.FocusOwnerImpl.a.f19647a[androidx.compose.ui.focus.r.e(this.f19642f, i6).ordinal()];
                zC = (i10 == 1 || i10 == 2 || i10 == 3) ? false : androidx.compose.ui.focus.r.c(this.f19642f, z6, z10);
            }
            sVarG.h();
            if (zC && z11) {
                this.f19639c.b();
            }
            return zC;
        } catch (java.lang.Throwable th) {
            sVarG.h();
            throw th;
        }
    }

    @Override // p121m0.i
    public p121m0.n f() {
        return this.f19642f.a2();
    }

    @Override // p121m0.i
    public p121m0.s g() {
        return this.f19644h;
    }

    @Override // p121m0.i
    public p131n0.i h() {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = androidx.compose.ui.focus.s.b(this.f19642f);
        if (focusTargetNodeB != null) {
            return androidx.compose.ui.focus.s.d(focusTargetNodeB);
        }
        return null;
    }

    @Override // p121m0.f
    public boolean i(int i6) {
        p247y7.O o6 = new p247y7.O();
        o6.f57254C = java.lang.Boolean.FALSE;
        java.lang.Boolean boolO = o(i6, (p131n0.i) this.f19640d.b(), new androidx.compose.ui.focus.FocusOwnerImpl.f(o6, i6));
        if (boolO == null || o6.f57254C == null) {
            return false;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (p247y7.AbstractC7350t.b(boolO, bool) && p247y7.AbstractC7350t.b(o6.f57254C, bool)) {
            return true;
        }
        if (androidx.compose.ui.focus.h.a(i6)) {
            return e(false, true, false, i6) && u(i6, null);
        }
        return ((java.lang.Boolean) this.f19638b.l(androidx.compose.ui.focus.d.i(i6))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0178  */
    /* JADX WARN: Code duplicated, block: B:230:0x031a  */
    /* JADX WARN: Code duplicated, block: B:304:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0172 A[EDGE_INSN: B:305:0x0172->B:103:0x0172 BREAK  A[LOOP:14: B:64:0x00f6->B:309:0x00f6, LOOP_LABEL: LOOP:14: B:64:0x00f6->B:309:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca A[PHI: r11
  0x00ca: PHI (r11v18 x0.e) = (r11v2 x0.e), (r11v21 x0.e) binds: [B:104:0x0174, B:57:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107 A[ADDED_TO_REGION, LOOP:15: B:67:0x0107->B:95:0x0159, LOOP_START, PHI: r10
  0x0107: PHI (r10v9 androidx.compose.ui.d$c) = (r10v4 androidx.compose.ui.d$c), (r10v10 androidx.compose.ui.d$c) binds: [B:66:0x0105, B:95:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [X.b] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [X.b] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p121m0.i
    public boolean j(android.view.KeyEvent keyEvent, p237x7.a aVar) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode;
        int iA;
        androidx.compose.ui.d.c cVarX1;
        F0.J jM;
        ?? G10;
        p231x0.e eVar;
        androidx.compose.ui.d.c cVarE0;
        F0.C0910b0 c0910b0K0;
        ?? bVar;
        ?? G11;
        F0.C0910b0 c0910b0K1;
        F0.C0910b0 c0910b0K2;
        if (this.f19643g.b()) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            return false;
        }
        if (!v(keyEvent)) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = androidx.compose.ui.focus.s.b(this.f19642f);
        if (focusTargetNodeB == null || (cVarE0 = t(focusTargetNodeB)) == null) {
            if (focusTargetNodeB != null) {
                int iA2 = F0.AbstractC0918f0.a(8192);
                if (!focusTargetNodeB.E0().A1()) {
                    throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                androidx.compose.ui.d.c cVarE1 = focusTargetNodeB.E0();
                F0.J jM2 = F0.AbstractC0925k.m(focusTargetNodeB);
                loop10: while (true) {
                    if (jM2 == null) {
                        G11 = 0;
                        break;
                    }
                    if ((jM2.k0().k().q1() & iA2) != 0) {
                        while (cVarE1 != null) {
                            if ((cVarE1.v1() & iA2) != 0) {
                                ?? bVar2 = 0;
                                G11 = cVarE1;
                                while (G11 != 0) {
                                    if (G11 instanceof p231x0.e) {
                                        break loop10;
                                    }
                                    if ((G11.v1() & iA2) != 0 && (G11 instanceof F0.AbstractC0927m)) {
                                        androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G11).U1();
                                        int i6 = 0;
                                        while (cVarU1 != null) {
                                            if ((cVarU1.v1() & iA2) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    G11 = G11;
                                                    bVar2 = bVar2;
                                                    bVar2 = bVar2;
                                                    G11 = cVarU1;
                                                } else {
                                                    if (bVar2 == 0) {
                                                        bVar2 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                    }
                                                    if (G11 != 0) {
                                                        bVar2.d(G11);
                                                        G11 = 0;
                                                    }
                                                    bVar2.d(cVarU1);
                                                }
                                            } else {
                                                G11 = G11;
                                                bVar2 = bVar2;
                                            }
                                            cVarU1 = cVarU1.r1();
                                            G11 = G11;
                                            bVar2 = bVar2;
                                        }
                                        if (i6 == 1) {
                                            G11 = G11;
                                            bVar2 = bVar2;
                                        } else {
                                            G11 = G11;
                                            bVar2 = bVar2;
                                        }
                                    }
                                    G11 = F0.AbstractC0925k.g(bVar2);
                                }
                            }
                            cVarE1 = cVarE1.x1();
                        }
                    }
                    jM2 = jM2.o0();
                    cVarE1 = (jM2 == null || (c0910b0K1 = jM2.k0()) == null) ? null : c0910b0K1.o();
                }
                eVar = (p231x0.e) G11;
                if (eVar != null) {
                    cVarE0 = eVar.E0();
                } else {
                    focusTargetNode = this.f19642f;
                    iA = F0.AbstractC0918f0.a(8192);
                    if (focusTargetNode.E0().A1()) {
                        throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                    cVarX1 = focusTargetNode.E0().x1();
                    jM = F0.AbstractC0925k.m(focusTargetNode);
                    loop14: while (true) {
                        if (jM != null) {
                            G10 = 0;
                            break;
                        }
                        if ((jM.k0().k().q1() & iA) != 0) {
                            while (cVarX1 != null) {
                                if ((cVarX1.v1() & iA) != 0) {
                                    bVar = 0;
                                    G10 = cVarX1;
                                    while (G10 != 0) {
                                        if (G10 instanceof p231x0.e) {
                                            break loop14;
                                        }
                                        if ((G10.v1() & iA) == 0 && (G10 instanceof F0.AbstractC0927m)) {
                                            androidx.compose.ui.d.c cVarU2 = ((F0.AbstractC0927m) G10).U1();
                                            int i10 = 0;
                                            while (cVarU2 != null) {
                                                if ((cVarU2.v1() & iA) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        G10 = G10;
                                                        bVar = bVar;
                                                        bVar = bVar;
                                                        G10 = cVarU2;
                                                    } else {
                                                        if (bVar == 0) {
                                                            bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                        }
                                                        if (G10 != 0) {
                                                            bVar.d(G10);
                                                            G10 = 0;
                                                        }
                                                        bVar.d(cVarU2);
                                                    }
                                                } else {
                                                    G10 = G10;
                                                    bVar = bVar;
                                                }
                                                cVarU2 = cVarU2.r1();
                                                G10 = G10;
                                                bVar = bVar;
                                            }
                                            if (i10 == 1) {
                                                G10 = G10;
                                                bVar = bVar;
                                            } else {
                                                G10 = G10;
                                                bVar = bVar;
                                            }
                                        }
                                        G10 = F0.AbstractC0925k.g(bVar);
                                    }
                                }
                                cVarX1 = cVarX1.x1();
                            }
                        }
                        jM = jM.o0();
                        cVarX1 = (jM != null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
                    }
                    eVar = (p231x0.e) G10;
                    if (eVar != null) {
                        cVarE0 = eVar.E0();
                    } else {
                        cVarE0 = null;
                    }
                }
            } else {
                focusTargetNode = this.f19642f;
                iA = F0.AbstractC0918f0.a(8192);
                if (focusTargetNode.E0().A1()) {
                    throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                cVarX1 = focusTargetNode.E0().x1();
                jM = F0.AbstractC0925k.m(focusTargetNode);
                loop14: while (true) {
                    if (jM != null) {
                        G10 = 0;
                        break;
                    }
                    if ((jM.k0().k().q1() & iA) != 0) {
                        while (cVarX1 != null) {
                            if ((cVarX1.v1() & iA) != 0) {
                                bVar = 0;
                                G10 = cVarX1;
                                while (G10 != 0) {
                                    if (G10 instanceof p231x0.e) {
                                        break loop14;
                                        break loop14;
                                    }
                                    if ((G10.v1() & iA) == 0) {
                                    }
                                    G10 = F0.AbstractC0925k.g(bVar);
                                }
                            }
                            cVarX1 = cVarX1.x1();
                        }
                    }
                    jM = jM.o0();
                    if (jM != null) {
                    }
                }
                eVar = (p231x0.e) G10;
                if (eVar != null) {
                    cVarE0 = eVar.E0();
                } else {
                    cVarE0 = null;
                }
            }
        }
        if (cVarE0 != null) {
            int iA3 = F0.AbstractC0918f0.a(8192);
            if (!cVarE0.E0().A1()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.d.c cVarX2 = cVarE0.E0().x1();
            F0.J jM3 = F0.AbstractC0925k.m(cVarE0);
            java.util.ArrayList arrayList = null;
            while (jM3 != null) {
                if ((jM3.k0().k().q1() & iA3) != 0) {
                    while (cVarX2 != null) {
                        if ((cVarX2.v1() & iA3) != 0) {
                            androidx.compose.ui.d.c cVarG = cVarX2;
                            X.b bVar3 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof p231x0.e) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.v1() & iA3) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                                    int i11 = 0;
                                    for (androidx.compose.ui.d.c cVarU3 = ((F0.AbstractC0927m) cVarG).U1(); cVarU3 != null; cVarU3 = cVarU3.r1()) {
                                        if ((cVarU3.v1() & iA3) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = cVarU3;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar3.d(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar3.d(cVarU3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = F0.AbstractC0925k.g(bVar3);
                            }
                        }
                        cVarX2 = cVarX2.x1();
                    }
                }
                jM3 = jM3.o0();
                cVarX2 = (jM3 == null || (c0910b0K2 = jM3.k0()) == null) ? null : c0910b0K2.o();
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (((p231x0.e) arrayList.get(size)).H(keyEvent)) {
                            return true;
                        }
                        if (i12 < 0) {
                            break;
                        }
                        size = i12;
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
            }
            ?? E10 = cVarE0.E0();
            ?? bVar4 = 0;
            while (E10 != 0) {
                if (E10 instanceof p231x0.e) {
                    if (((p231x0.e) E10).H(keyEvent)) {
                        return true;
                    }
                } else if ((E10.v1() & iA3) != 0 && (E10 instanceof F0.AbstractC0927m)) {
                    androidx.compose.ui.d.c cVarU4 = ((F0.AbstractC0927m) E10).U1();
                    int i13 = 0;
                    while (cVarU4 != null) {
                        if ((cVarU4.v1() & iA3) != 0) {
                            i13++;
                            if (i13 == 1) {
                                E10 = E10;
                                bVar4 = bVar4;
                                bVar4 = bVar4;
                                E10 = cVarU4;
                            } else {
                                if (bVar4 == 0) {
                                    bVar4 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                }
                                if (E10 != 0) {
                                    bVar4.d(E10);
                                    E10 = 0;
                                }
                                bVar4.d(cVarU4);
                            }
                        } else {
                            E10 = E10;
                            bVar4 = bVar4;
                        }
                        cVarU4 = cVarU4.r1();
                        E10 = E10;
                        bVar4 = bVar4;
                    }
                    if (i13 == 1) {
                        E10 = E10;
                        bVar4 = bVar4;
                    } else {
                        E10 = E10;
                        bVar4 = bVar4;
                    }
                }
                E10 = F0.AbstractC0925k.g(bVar4);
            }
            if (((java.lang.Boolean) aVar.b()).booleanValue()) {
                return true;
            }
            ?? E11 = cVarE0.E0();
            ?? bVar5 = 0;
            while (E11 != 0) {
                if (E11 instanceof p231x0.e) {
                    if (((p231x0.e) E11).b0(keyEvent)) {
                        return true;
                    }
                } else if ((E11.v1() & iA3) != 0 && (E11 instanceof F0.AbstractC0927m)) {
                    androidx.compose.ui.d.c cVarU5 = ((F0.AbstractC0927m) E11).U1();
                    int i14 = 0;
                    while (cVarU5 != null) {
                        if ((cVarU5.v1() & iA3) != 0) {
                            i14++;
                            if (i14 == 1) {
                                E11 = E11;
                                bVar5 = bVar5;
                                bVar5 = bVar5;
                                E11 = cVarU5;
                            } else {
                                if (bVar5 == 0) {
                                    bVar5 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                }
                                if (E11 != 0) {
                                    bVar5.d(E11);
                                    E11 = 0;
                                }
                                bVar5.d(cVarU5);
                            }
                        } else {
                            E11 = E11;
                            bVar5 = bVar5;
                        }
                        cVarU5 = cVarU5.r1();
                        E11 = E11;
                        bVar5 = bVar5;
                    }
                    if (i14 == 1) {
                        E11 = E11;
                        bVar5 = bVar5;
                    } else {
                        E11 = E11;
                        bVar5 = bVar5;
                    }
                }
                E11 = F0.AbstractC0925k.g(bVar5);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((p231x0.e) arrayList.get(i15)).b0(keyEvent)) {
                        return true;
                    }
                }
                p087i7.M m10 = p087i7.M.f46721a;
            }
            p087i7.M m11 = p087i7.M.f46721a;
        }
        return false;
    }

    @Override // p121m0.i
    public boolean k(androidx.compose.ui.focus.d dVar, p131n0.i iVar) {
        return ((java.lang.Boolean) this.f19637a.u(dVar, iVar)).booleanValue();
    }

    @Override // p121m0.i
    public boolean l(android.view.KeyEvent keyEvent) {
        F0.C0910b0 c0910b0K0;
        if (this.f19643g.b()) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = androidx.compose.ui.focus.s.b(this.f19642f);
        if (focusTargetNodeB != null) {
            int iA = F0.AbstractC0918f0.a(131072);
            if (!focusTargetNodeB.E0().A1()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.d.c cVarE0 = focusTargetNodeB.E0();
            F0.J jM = F0.AbstractC0925k.m(focusTargetNodeB);
            while (jM != null) {
                if ((jM.k0().k().q1() & iA) != 0) {
                    while (cVarE0 != null) {
                        if ((cVarE0.v1() & iA) != 0) {
                            androidx.compose.ui.d.c cVarG = cVarE0;
                            X.b bVar = null;
                            while (cVarG != null) {
                                if ((cVarG.v1() & iA) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                                    int i6 = 0;
                                    for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                                        if ((cVarU1.v1() & iA) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                cVarG = cVarU1;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar.d(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar.d(cVarU1);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                cVarG = F0.AbstractC0925k.g(bVar);
                            }
                        }
                        cVarE0 = cVarE0.x1();
                    }
                }
                jM = jM.o0();
                cVarE0 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
            }
            androidx.appcompat.app.D.a(null);
        }
        return false;
    }

    @Override // p121m0.i
    public void m() {
        p121m0.s sVarG = g();
        if (sVarG.f50224c) {
            androidx.compose.ui.focus.r.c(this.f19642f, true, true);
            return;
        }
        try {
            sVarG.f();
            androidx.compose.ui.focus.r.c(this.f19642f, true, true);
        } finally {
            sVarG.h();
        }
    }

    @Override // p121m0.f
    public void n(boolean z6) {
        e(z6, true, true, androidx.compose.ui.focus.d.f19669b.c());
    }

    @Override // p121m0.i
    public java.lang.Boolean o(int i6, p131n0.i iVar, p237x7.l lVar) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = androidx.compose.ui.focus.s.b(this.f19642f);
        if (focusTargetNodeB != null) {
            androidx.compose.ui.focus.n nVarA = androidx.compose.ui.focus.s.a(focusTargetNodeB, i6, (Y0.v) this.f19641e.b());
            androidx.compose.ui.focus.n.a aVar = androidx.compose.ui.focus.n.f19698b;
            if (p247y7.AbstractC7350t.b(nVarA, aVar.a())) {
                return null;
            }
            if (!p247y7.AbstractC7350t.b(nVarA, aVar.b())) {
                return java.lang.Boolean.valueOf(nVarA.c(lVar));
            }
        } else {
            focusTargetNodeB = null;
        }
        return androidx.compose.ui.focus.s.e(this.f19642f, i6, (Y0.v) this.f19641e.b(), iVar, new androidx.compose.ui.focus.FocusOwnerImpl.d(focusTargetNodeB, this, lVar));
    }

    @Override // p121m0.i
    public void p(p121m0.b bVar) {
        this.f19643g.e(bVar);
    }

    public final androidx.compose.ui.focus.FocusTargetNode r() {
        return this.f19642f;
    }

    public boolean u(int i6, p131n0.i iVar) {
        java.lang.Boolean boolO = o(i6, iVar, new androidx.compose.ui.focus.FocusOwnerImpl.g(i6));
        if (boolO != null) {
            return boolO.booleanValue();
        }
        return false;
    }
}
