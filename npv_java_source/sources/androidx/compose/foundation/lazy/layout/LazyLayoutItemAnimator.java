package androidx.compose.foundation.lazy.layout;

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
public final class LazyLayoutItemAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.compose.foundation.lazy.layout.c f19353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19354c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private F0.InterfaceC0932s f19361j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.K f19352a = p170r.V.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p170r.L f19355d = p170r.X.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f19356e = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f19357f = new java.util.ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f19358g = new java.util.ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f19359h = new java.util.ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f19360i = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.compose.ui.d f19362k = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsElement(this);

    @kotlin.Metadata(d1 = {"Ӈ"}, d2 = {"ӈ", "Ӊ", "ӊ", "Ӌ", "ӌ", "Ӎ", "ӎ", "ӏ", "Ӑ", "ӑ", "Ӓ", "ӓ", "Ӕ", "", "ӕ", "Ӗ", "", "ӗ", "Ә", "", "ә", "", "Ӛ", "ӛ", "Ӝ", "ӝ", "Ӟ"}, k = 1, mv = {1, 8, 0})
    private static final class DisplayingDisappearingItemsElement extends F0.W {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator f19363b;

        public DisplayingDisappearingItemsElement(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f19363b = lazyLayoutItemAnimator;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsElement) && p247y7.AbstractC7350t.b(this.f19363b, ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsElement) obj).f19363b);
        }

        public int hashCode() {
            return this.f19363b.hashCode();
        }

        @Override // F0.W
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.a g() {
            return new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.a(this.f19363b);
        }

        @Override // F0.W
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.a aVar) {
            aVar.T1(this.f19363b);
        }

        public java.lang.String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f19363b + ')';
        }
    }

    private static final class a extends androidx.compose.ui.d.c implements F0.InterfaceC0932s {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator f19364P;

        public a(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f19364P = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.d.c
        public void D1() {
            this.f19364P.f19361j = this;
        }

        @Override // androidx.compose.ui.d.c
        public void E1() {
            this.f19364P.n();
        }

        public final void T1(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (p247y7.AbstractC7350t.b(this.f19364P, lazyLayoutItemAnimator) || !E0().A1()) {
                return;
            }
            this.f19364P.n();
            lazyLayoutItemAnimator.f19361j = this;
            this.f19364P = lazyLayoutItemAnimator;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.a) && p247y7.AbstractC7350t.b(this.f19364P, ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.a) obj).f19364P);
        }

        public int hashCode() {
            return this.f19364P.hashCode();
        }

        @Override // F0.InterfaceC0932s
        public /* synthetic */ void m0() {
            F0.r.a(this);
        }

        public java.lang.String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f19364P + ')';
        }

        @Override // F0.InterfaceC0932s
        public void y(p161q0.c cVar) {
            java.util.List list = this.f19364P.f19360i;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i6);
                p171r0.C7053c c7053cE = bVar.e();
                if (c7053cE != null) {
                    float fH = Y0.p.h(bVar.d());
                    float fI = Y0.p.i(bVar.d());
                    float fH2 = fH - Y0.p.h(c7053cE.w());
                    float fI2 = fI - Y0.p.i(c7053cE.w());
                    cVar.F0().c().d(fH2, fI2);
                    try {
                        p171r0.AbstractC7056f.a(cVar, c7053cE);
                        cVar.F0().c().d(-fH2, -fI2);
                    } catch (java.lang.Throwable th) {
                        cVar.F0().c().d(-fH2, -fI2);
                        throw th;
                    }
                }
            }
            cVar.l1();
        }
    }

    private final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Y0.C1859b f19366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19368d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19371g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.compose.foundation.lazy.layout.b[] f19365a = D.AbstractC0879p.f1692a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19369e = 1;

        public b() {
        }

        private final boolean h() {
            for (androidx.compose.foundation.lazy.layout.b bVar : this.f19365a) {
            }
            return false;
        }

        public static /* synthetic */ void l(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar, D.y yVar, W8.N n6, p141o0.C1 c6, int i6, int i10, int i11, int i12, java.lang.Object obj) {
            if ((i12 & 32) != 0) {
                i11 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.this.e(yVar);
            }
            bVar.k(yVar, n6, c6, i6, i10, i11);
        }

        public final androidx.compose.foundation.lazy.layout.b[] a() {
            return this.f19365a;
        }

        public final Y0.C1859b b() {
            return this.f19366b;
        }

        public final int c() {
            return this.f19367c;
        }

        public final int d() {
            return this.f19368d;
        }

        public final int e() {
            return this.f19371g;
        }

        public final int f() {
            return this.f19370f;
        }

        public final int g() {
            return this.f19369e;
        }

        public final void i(int i6) {
            this.f19368d = i6;
        }

        public final void j(int i6) {
            this.f19369e = i6;
        }

        public final void k(D.y yVar, W8.N n6, p141o0.C1 c6, int i6, int i10, int i11) {
            if (!h()) {
                this.f19370f = i6;
                this.f19371g = i10;
            }
            int length = this.f19365a.length;
            for (int iB = yVar.b(); iB < length; iB++) {
                androidx.compose.foundation.lazy.layout.b bVar = this.f19365a[iB];
            }
            if (this.f19365a.length != yVar.b()) {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f19365a, yVar.b());
                p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
                this.f19365a = (androidx.compose.foundation.lazy.layout.b[]) objArrCopyOf;
            }
            this.f19366b = Y0.C1859b.a(yVar.h());
            this.f19367c = i11;
            this.f19368d = yVar.k();
            this.f19369e = yVar.f();
            int iB2 = yVar.b();
            for (int i12 = 0; i12 < iB2; i12++) {
                D.AbstractC0879p.b(yVar.g(i12));
                androidx.compose.foundation.lazy.layout.b bVar2 = this.f19365a[i12];
                this.f19365a[i12] = null;
            }
        }
    }

    public static final class c implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f19373C;

        public c(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f19373C = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(this.f19373C.d(((D.y) obj).getKey())), java.lang.Integer.valueOf(this.f19373C.d(((D.y) obj2).getKey())));
        }
    }

    public static final class d implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f19374C;

        public d(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f19374C = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(this.f19374C.d(((D.y) obj).getKey())), java.lang.Integer.valueOf(this.f19374C.d(((D.y) obj2).getKey())));
        }
    }

    public static final class e implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f19375C;

        public e(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f19375C = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(this.f19375C.d(((D.y) obj2).getKey())), java.lang.Integer.valueOf(this.f19375C.d(((D.y) obj).getKey())));
        }
    }

    public static final class f implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f19376C;

        public f(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f19376C = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(this.f19376C.d(((D.y) obj2).getKey())), java.lang.Integer.valueOf(this.f19376C.d(((D.y) obj).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e(D.y yVar) {
        long j6 = yVar.j(0);
        return !yVar.i() ? Y0.p.i(j6) : Y0.p.h(j6);
    }

    private final boolean f(D.y yVar) {
        int iB = yVar.b();
        for (int i6 = 0; i6 < iB; i6++) {
            D.AbstractC0879p.b(yVar.g(i6));
        }
        return false;
    }

    private final int g(D.y yVar) {
        long j6 = yVar.j(0);
        return yVar.i() ? Y0.p.i(j6) : Y0.p.h(j6);
    }

    private final void j(D.y yVar, int i6, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar) {
        int i10;
        java.lang.Object obj;
        int i11;
        int i12;
        long j6 = yVar.j(0);
        if (yVar.i()) {
            i10 = 1;
            obj = null;
            i12 = 0;
            i11 = i6;
        } else {
            i10 = 2;
            obj = null;
            i11 = 0;
            i12 = i6;
        }
        Y0.p.e(j6, i12, i11, i10, obj);
        for (androidx.compose.foundation.lazy.layout.b bVar2 : bVar.a()) {
        }
    }

    static /* synthetic */ void k(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, D.y yVar, int i6, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            java.lang.Object objC = lazyLayoutItemAnimator.f19352a.c(yVar.getKey());
            p247y7.AbstractC7350t.c(objC);
            bVar = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) objC;
        }
        lazyLayoutItemAnimator.j(yVar, i6, bVar);
    }

    private final void m(java.lang.Object obj) {
        androidx.compose.foundation.lazy.layout.b[] bVarArrA;
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) this.f19352a.p(obj);
        if (bVar == null || (bVarArrA = bVar.a()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.b bVar2 : bVarArrA) {
        }
    }

    private final void o(D.y yVar, boolean z6) {
        java.lang.Object objC = this.f19352a.c(yVar.getKey());
        p247y7.AbstractC7350t.c(objC);
        for (androidx.compose.foundation.lazy.layout.b bVar : ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) objC).a()) {
        }
    }

    static /* synthetic */ void p(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, D.y yVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        lazyLayoutItemAnimator.o(yVar, z6);
    }

    private final int q(int[] iArr, D.y yVar) {
        int iK = yVar.k();
        int iF = yVar.f() + iK;
        int iMax = 0;
        while (iK < iF) {
            int iE = iArr[iK] + yVar.e();
            iArr[iK] = iE;
            iMax = java.lang.Math.max(iMax, iE);
            iK++;
        }
        return iMax;
    }

    public final androidx.compose.foundation.lazy.layout.b d(java.lang.Object obj, int i6) {
        androidx.compose.foundation.lazy.layout.b[] bVarArrA;
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) this.f19352a.c(obj);
        if (bVar == null || (bVarArrA = bVar.a()) == null) {
            return null;
        }
        return bVarArrA[i6];
    }

    public final long h() {
        long jA = Y0.t.f16230b.a();
        java.util.List list = this.f19360i;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i6);
            p171r0.C7053c c7053cE = bVar.e();
            if (c7053cE != null) {
                jA = Y0.u.a(java.lang.Math.max(Y0.t.g(jA), Y0.p.h(bVar.h()) + Y0.t.g(c7053cE.v())), java.lang.Math.max(Y0.t.f(jA), Y0.p.i(bVar.h()) + Y0.t.f(c7053cE.v())));
            }
        }
        return jA;
    }

    public final androidx.compose.ui.d i() {
        return this.f19362k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i6, int i10, int i11, java.util.List list, androidx.compose.foundation.lazy.layout.c cVar, D.z zVar, boolean z6, boolean z10, int i12, boolean z11, int i13, int i14, W8.N n6, p141o0.C1 c6) {
        androidx.compose.foundation.lazy.layout.c cVar2;
        java.lang.Object[] objArr;
        int[] iArr;
        int i15;
        int i16;
        int[] iArr2;
        long[] jArr;
        java.lang.Object[] objArr2;
        long[] jArr2;
        java.lang.Object[] objArr3;
        androidx.compose.foundation.lazy.layout.c cVar3;
        int i17;
        int iD;
        long[] jArr3;
        int i18;
        int i19 = i12;
        androidx.compose.foundation.lazy.layout.c cVar4 = this.f19353b;
        this.f19353b = cVar;
        int size = list.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size) {
                if (!this.f19352a.f()) {
                    break;
                }
                n();
                return;
            } else if (f((D.y) list.get(i20))) {
                break;
            } else {
                i20++;
            }
        }
        int i21 = this.f19354c;
        D.y yVar = (D.y) p097j7.AbstractC6879v.k0(list);
        this.f19354c = yVar != null ? yVar.getIndex() : 0;
        if (z6) {
            Y0.q.a(0, i6);
        } else {
            Y0.q.a(i6, 0);
        }
        java.lang.Object[] objArr4 = z10 || !z11;
        p170r.K k6 = this.f19352a;
        java.lang.Object[] objArr5 = k6.f53334b;
        long[] jArr4 = k6.f53333a;
        int length = jArr4.length - 2;
        int i22 = 8;
        if (length >= 0) {
            int i23 = 0;
            objArr = objArr4;
            while (true) {
                long j6 = jArr4[i23];
                cVar2 = cVar4;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i24 = 8 - ((~(i23 - length)) >>> 31);
                    int i25 = 0;
                    while (i25 < i24) {
                        if ((j6 & 255) < 128) {
                            this.f19355d.h(objArr5[(i23 << 3) + i25]);
                            i22 = 8;
                        }
                        j6 >>= i22;
                        i25++;
                        jArr4 = jArr4;
                    }
                    jArr3 = jArr4;
                    i18 = 1;
                    if (i24 != i22) {
                        break;
                    }
                } else {
                    jArr3 = jArr4;
                    i18 = 1;
                }
                if (i23 == length) {
                    break;
                }
                i23 += i18;
                cVar4 = cVar2;
                jArr4 = jArr3;
            }
        } else {
            cVar2 = cVar4;
            objArr = objArr4;
        }
        int size2 = list.size();
        int i26 = 0;
        while (i26 < size2) {
            D.y yVar2 = (D.y) list.get(i26);
            this.f19355d.x(yVar2.getKey());
            if (f(yVar2)) {
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) this.f19352a.c(yVar2.getKey());
                if (cVar2 != null) {
                    cVar3 = cVar2;
                    iD = cVar3.d(yVar2.getKey());
                } else {
                    cVar3 = cVar2;
                    iD = -1;
                }
                boolean z12 = iD == -1 && cVar3 != null;
                if (bVar == null) {
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar2 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b();
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(bVar2, yVar2, n6, c6, i13, i14, 0, 32, null);
                    this.f19352a.s(yVar2.getKey(), bVar2);
                    if (yVar2.getIndex() == iD || iD == -1) {
                        long j10 = yVar2.j(0);
                        j(yVar2, yVar2.i() ? Y0.p.i(j10) : Y0.p.h(j10), bVar2);
                        if (z12) {
                            androidx.compose.foundation.lazy.layout.b[] bVarArrA = bVar2.a();
                            for (androidx.compose.foundation.lazy.layout.b bVar3 : bVarArrA) {
                            }
                        }
                    } else {
                        (iD < i21 ? this.f19356e : this.f19357f).add(yVar2);
                    }
                } else if (objArr != false) {
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(bVar, yVar2, n6, c6, i13, i14, 0, 32, null);
                    androidx.compose.foundation.lazy.layout.b[] bVarArrA2 = bVar.a();
                    int i27 = 0;
                    for (int length2 = bVarArrA2.length; i27 < length2; length2 = length2) {
                        androidx.compose.foundation.lazy.layout.b bVar4 = bVarArrA2[i27];
                        i27++;
                    }
                    i17 = 1;
                    if (z12) {
                        for (androidx.compose.foundation.lazy.layout.b bVar5 : bVar.a()) {
                        }
                    }
                    p(this, yVar2, false, 2, null);
                }
                i17 = 1;
            } else {
                cVar3 = cVar2;
                i17 = 1;
                m(yVar2.getKey());
            }
            i26 += i17;
            cVar2 = cVar3;
        }
        androidx.compose.foundation.lazy.layout.c cVar5 = cVar2;
        int i28 = 0;
        int i29 = 2;
        int[] iArr3 = new int[i19];
        int i30 = 0;
        while (i30 < i19) {
            iArr3[i30] = i28;
            i30++;
            i28 = 0;
        }
        if (!objArr == true || cVar5 == null) {
            iArr = iArr3;
            i15 = 2;
        } else {
            if (!this.f19356e.isEmpty()) {
                java.util.List list2 = this.f19356e;
                if (list2.size() > 1) {
                    p097j7.AbstractC6879v.B(list2, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e(cVar5));
                }
                java.util.List list3 = this.f19356e;
                int size3 = list3.size();
                int i31 = 0;
                while (i31 < size3) {
                    D.y yVar3 = (D.y) list3.get(i31);
                    int i32 = i29;
                    k(this, yVar3, i13 - q(iArr3, yVar3), null, 4, null);
                    p(this, yVar3, false, i32, null);
                    i31++;
                    i29 = i32;
                    size3 = size3;
                    iArr3 = iArr3;
                }
                iArr = iArr3;
                i15 = i29;
                p097j7.AbstractC6872n.z(iArr, 0, 0, 0, 6, null);
            } else {
                iArr = iArr3;
                i15 = 2;
            }
            if (!this.f19357f.isEmpty()) {
                java.util.List list4 = this.f19357f;
                if (list4.size() > 1) {
                    p097j7.AbstractC6879v.B(list4, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.c(cVar5));
                }
                java.util.List list5 = this.f19357f;
                int i33 = 0;
                for (int size4 = list5.size(); i33 < size4; size4 = size4) {
                    D.y yVar4 = (D.y) list5.get(i33);
                    k(this, yVar4, (i14 + q(iArr, yVar4)) - yVar4.e(), null, 4, null);
                    p(this, yVar4, false, i15, null);
                    i33++;
                }
                p097j7.AbstractC6872n.z(iArr, 0, 0, 0, 6, null);
            }
        }
        p170r.L l6 = this.f19355d;
        java.lang.Object[] objArr6 = l6.f53341b;
        long[] jArr5 = l6.f53340a;
        int length3 = jArr5.length - i15;
        if (length3 >= 0) {
            int i34 = 0;
            while (true) {
                long j11 = jArr5[i34];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i35 = 8 - ((~(i34 - length3)) >>> 31);
                    int i36 = 0;
                    while (i36 < i35) {
                        if ((j11 & 255) < 128) {
                            java.lang.Object obj = objArr6[(i34 << 3) + i36];
                            java.lang.Object objC = this.f19352a.c(obj);
                            p247y7.AbstractC7350t.c(objC);
                            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar6 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) objC;
                            int iD2 = cVar.d(obj);
                            jArr2 = jArr5;
                            bVar6.j(java.lang.Math.min(i19, bVar6.g()));
                            objArr3 = objArr6;
                            bVar6.i(java.lang.Math.min(i19 - bVar6.g(), bVar6.d()));
                            if (iD2 == -1) {
                                for (androidx.compose.foundation.lazy.layout.b bVar7 : bVar6.a()) {
                                }
                            } else {
                                Y0.C1859b c1859bB = bVar6.b();
                                p247y7.AbstractC7350t.c(c1859bB);
                                D.y yVarA = zVar.a(iD2, bVar6.d(), bVar6.g(), c1859bB.r());
                                yVarA.d(true);
                                for (androidx.compose.foundation.lazy.layout.b bVar8 : bVar6.a()) {
                                }
                                if (cVar5 == null || iD2 != cVar5.d(obj)) {
                                    bVar6.k(yVarA, n6, c6, i13, i14, bVar6.c());
                                    (iD2 < this.f19354c ? this.f19358g : this.f19359h).add(yVarA);
                                }
                            }
                            m(obj);
                        } else {
                            jArr2 = jArr5;
                            objArr3 = objArr6;
                        }
                        j11 >>= 8;
                        i36++;
                        i19 = i12;
                        jArr5 = jArr2;
                        objArr6 = objArr3;
                    }
                    jArr = jArr5;
                    objArr2 = objArr6;
                    i16 = 1;
                    if (i35 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr5;
                    objArr2 = objArr6;
                    i16 = 1;
                }
                if (i34 == length3) {
                    break;
                }
                i34 += i16;
                i19 = i12;
                jArr5 = jArr;
                objArr6 = objArr2;
            }
        } else {
            i16 = 1;
        }
        if (((this.f19358g.isEmpty() ? 1 : 0) ^ i16) != 0) {
            java.util.List list6 = this.f19358g;
            if (list6.size() > i16) {
                p097j7.AbstractC6879v.B(list6, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.f(cVar));
            }
            java.util.List list7 = this.f19358g;
            int size5 = list7.size();
            int i37 = 0;
            while (i37 < size5) {
                D.y yVar5 = (D.y) list7.get(i37);
                java.lang.Object objC2 = this.f19352a.c(yVar5.getKey());
                p247y7.AbstractC7350t.c(objC2);
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar9 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) objC2;
                int[] iArr4 = iArr;
                yVar5.n((z10 ? g((D.y) p097j7.AbstractC6879v.i0(list)) : bVar9.f()) - q(iArr4, yVar5), bVar9.c(), i10, i11);
                if (objArr != false) {
                    o(yVar5, true);
                }
                i37++;
                iArr = iArr4;
            }
            iArr2 = iArr;
            p097j7.AbstractC6872n.z(iArr2, 0, 0, 0, 6, null);
        } else {
            iArr2 = iArr;
        }
        if (!this.f19359h.isEmpty()) {
            java.util.List list8 = this.f19359h;
            if (list8.size() > 1) {
                p097j7.AbstractC6879v.B(list8, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.d(cVar));
            }
            java.util.List list9 = this.f19359h;
            int size6 = list9.size();
            for (int i38 = 0; i38 < size6; i38++) {
                D.y yVar6 = (D.y) list9.get(i38);
                java.lang.Object objC3 = this.f19352a.c(yVar6.getKey());
                p247y7.AbstractC7350t.c(objC3);
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b bVar10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) objC3;
                yVar6.n((z10 ? g((D.y) p097j7.AbstractC6879v.t0(list)) : bVar10.e() - yVar6.e()) + q(iArr2, yVar6), bVar10.c(), i10, i11);
                if (objArr != false) {
                    o(yVar6, true);
                }
            }
        }
        java.util.List list10 = this.f19358g;
        p097j7.AbstractC6879v.V(list10);
        p087i7.M m6 = p087i7.M.f46721a;
        list.addAll(0, list10);
        list.addAll(this.f19359h);
        this.f19356e.clear();
        this.f19357f.clear();
        this.f19358g.clear();
        this.f19359h.clear();
        this.f19355d.m();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[LOOP:0: B:7:0x0015->B:19:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[EDGE_INSN: B:24:0x0059->B:20:0x0059 BREAK  A[LOOP:0: B:7:0x0015->B:19:0x0056], SYNTHETIC] */
    public final void n() {
        if (this.f19352a.g()) {
            p170r.K k6 = this.f19352a;
            java.lang.Object[] objArr = k6.f53335c;
            long[] jArr = k6.f53333a;
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
                                for (androidx.compose.foundation.lazy.layout.b bVar : ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) objArr[(i6 << 3) + i11]).a()) {
                                }
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
            this.f19352a.i();
        }
        this.f19353b = androidx.compose.foundation.lazy.layout.c.f19387a;
        this.f19354c = -1;
    }
}
