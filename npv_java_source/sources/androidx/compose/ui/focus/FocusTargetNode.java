package androidx.compose.ui.focus;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends androidx.compose.ui.d.c implements F0.InterfaceC0921h, p121m0.p, F0.i0, E0.i {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f19659P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19660Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p121m0.o f19661R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f19662S;

    @kotlin.Metadata(d1 = {"ߖ"}, d2 = {"ߗ", "ߘ", "ߙ", "ߚ", "ߛ", "ߜ", "ߝ", "ߞ", "ߟ", "ߠ", "ߡ", "", "ߢ", "ߣ", "", "ߤ", "", "ߥ", "ߦ", "ߧ"}, k = 1, mv = {1, 8, 0})
    public static final class FocusTargetElement extends F0.W {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement f19663b = new androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(java.lang.Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // F0.W
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.focus.FocusTargetNode g() {
            return new androidx.compose.ui.focus.FocusTargetNode();
        }

        @Override // F0.W
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19664a;

        static {
            int[] iArr = new int[p121m0.o.values().length];
            try {
                iArr[p121m0.o.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p121m0.o.Captured.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p121m0.o.ActiveParent.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p121m0.o.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f19664a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f19665D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19666E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p247y7.O o6, androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            super(0);
            this.f19665D = o6;
            this.f19666E = focusTargetNode;
        }

        public final void a() {
            this.f19665D.f57254C = this.f19666E.Y1();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private final void b2() {
        if (!(!e2(this))) {
            throw new java.lang.IllegalStateException("Re-initializing focus target node.".toString());
        }
        p121m0.s sVarD = p121m0.r.d(this);
        try {
            if (sVarD.f50224c) {
                sVarD.g();
            }
            sVarD.f();
            g2((d2(this) && c2(this)) ? p121m0.o.ActiveParent : p121m0.o.Inactive);
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            sVarD.h();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:61:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:8:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:8:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:66:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static final boolean c2(androidx.compose.ui.focus.FocusTargetNode r12) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.c2(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean d2(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(1024);
        if (!focusTargetNode.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = focusTargetNode.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = cVarX1;
                        X.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) cVarG;
                                if (e2(focusTargetNode2)) {
                                    int i6 = androidx.compose.ui.focus.FocusTargetNode.a.f19664a[focusTargetNode2.a2().ordinal()];
                                    if (i6 == 1 || i6 == 2) {
                                        return false;
                                    }
                                    if (i6 == 3) {
                                        return true;
                                    }
                                    if (i6 == 4) {
                                        return false;
                                    }
                                    throw new p087i7.s();
                                }
                            } else if ((cVarG.v1() & iA) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                                int i10 = 0;
                                for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            cVarG = F0.AbstractC0925k.g(bVar);
                        }
                    }
                    cVarX1 = cVarX1.x1();
                }
            }
            jM = jM.o0();
            cVarX1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
        return false;
    }

    private static final boolean e2(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        return focusTargetNode.f19661R != null;
    }

    @Override // E0.l
    public /* synthetic */ java.lang.Object D0(E0.c cVar) {
        return E0.h.a(this, cVar);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        int i6 = androidx.compose.ui.focus.FocusTargetNode.a.f19664a[a2().ordinal()];
        if (i6 == 1 || i6 == 2) {
            F0.AbstractC0925k.n(this).getFocusOwner().e(true, true, false, androidx.compose.ui.focus.d.f19669b.c());
            p121m0.r.c(this);
        } else if (i6 == 3) {
            p121m0.s sVarD = p121m0.r.d(this);
            try {
                if (sVarD.f50224c) {
                    sVarD.g();
                }
                sVarD.f();
                g2(p121m0.o.Inactive);
                p087i7.M m6 = p087i7.M.f46721a;
                sVarD.h();
            } catch (java.lang.Throwable th) {
                sVarD.h();
                throw th;
            }
        }
        this.f19661R = null;
    }

    @Override // F0.i0
    public void L0() {
        p121m0.o oVarA2 = a2();
        f2();
        if (oVarA2 != a2()) {
            p121m0.c.c(this);
        }
    }

    public final void X1() {
        p121m0.o oVarI = p121m0.r.d(this).i(this);
        if (oVarI != null) {
            this.f19661R = oVarI;
        } else {
            C0.a.c("committing a node that was not updated in the current transaction");
            throw new p087i7.C6665k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final androidx.compose.ui.focus.j Y1() {
        F0.C0910b0 c0910b0K0;
        androidx.compose.ui.focus.k kVar = new androidx.compose.ui.focus.k();
        int iA = F0.AbstractC0918f0.a(2048);
        int iA2 = F0.AbstractC0918f0.a(1024);
        androidx.compose.ui.d.c cVarE0 = E0();
        int i6 = iA | iA2;
        if (!E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarE1 = E0();
        F0.J jM = F0.AbstractC0925k.m(this);
        loop0: while (jM != null) {
            if ((jM.k0().k().q1() & i6) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.v1() & i6) != 0) {
                        if (cVarE1 != cVarE0 && (cVarE1.v1() & iA2) != 0) {
                            break loop0;
                        }
                        if ((cVarE1.v1() & iA) != 0) {
                            ?? G10 = cVarE1;
                            ?? bVar = 0;
                            while (G10 != 0) {
                                if (G10 instanceof p121m0.j) {
                                    ((p121m0.j) G10).Y(kVar);
                                } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                    androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                    int i10 = 0;
                                    G10 = G10;
                                    bVar = bVar;
                                    while (cVarU1 != null) {
                                        if ((cVarU1.v1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                bVar = bVar;
                                                G10 = cVarU1;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (G10 != 0) {
                                                    bVar.d(G10);
                                                    G10 = 0;
                                                }
                                                bVar.d(cVarU1);
                                            }
                                        }
                                        cVarU1 = cVarU1.r1();
                                        G10 = G10;
                                        bVar = bVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                G10 = F0.AbstractC0925k.g(bVar);
                            }
                        }
                    }
                    cVarE1 = cVarE1.x1();
                }
            }
            jM = jM.o0();
            cVarE1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
        return kVar;
    }

    public final D0.InterfaceC0886e Z1() {
        return (D0.InterfaceC0886e) D0(D0.AbstractC0887f.a());
    }

    public p121m0.o a2() {
        p121m0.o oVarI;
        p121m0.s sVarB = p121m0.r.b(this);
        if (sVarB != null && (oVarI = sVarB.i(this)) != null) {
            return oVarI;
        }
        p121m0.o oVar = this.f19661R;
        return oVar == null ? p121m0.o.Inactive : oVar;
    }

    public final void f2() {
        androidx.compose.ui.focus.j jVar;
        if (this.f19661R == null) {
            b2();
        }
        int i6 = androidx.compose.ui.focus.FocusTargetNode.a.f19664a[a2().ordinal()];
        if (i6 == 1 || i6 == 2) {
            p247y7.O o6 = new p247y7.O();
            F0.j0.a(this, new androidx.compose.ui.focus.FocusTargetNode.b(o6, this));
            java.lang.Object obj = o6.f57254C;
            if (obj == null) {
                p247y7.AbstractC7350t.p("focusProperties");
                jVar = null;
            } else {
                jVar = (androidx.compose.ui.focus.j) obj;
            }
            if (jVar.p()) {
                return;
            }
            F0.AbstractC0925k.n(this).getFocusOwner().n(true);
        }
    }

    public void g2(p121m0.o oVar) {
        p121m0.r.d(this).j(this, oVar);
    }

    @Override // E0.i
    public /* synthetic */ E0.g s0() {
        return E0.h.b(this);
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f19662S;
    }
}
