package androidx.compose.ui.viewinterop;

/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.compose.ui.viewinterop.c implements androidx.compose.ui.platform.G1 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final android.view.View f20555f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final p241y0.c f20556g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final p041e0.g f20557h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final int f20558i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final java.lang.String f20559j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private e0.g.a f20560k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private p237x7.l f20561l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private p237x7.l f20562m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private p237x7.l f20563n0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        public final java.lang.Object b() {
            android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            androidx.compose.ui.viewinterop.i.this.f20555f0.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.viewinterop.i.this.getReleaseBlock().l(androidx.compose.ui.viewinterop.i.this.f20555f0);
            androidx.compose.ui.viewinterop.i.this.z();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.viewinterop.i.this.getResetBlock().l(androidx.compose.ui.viewinterop.i.this.f20555f0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.viewinterop.i.this.getUpdateBlock().l(androidx.compose.ui.viewinterop.i.this.f20555f0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private i(android.content.Context context, V.AbstractC1744s abstractC1744s, android.view.View view, p241y0.c cVar, p041e0.g gVar, int i6, F0.o0 o0Var) {
        super(context, abstractC1744s, i6, cVar, view, o0Var);
        this.f20555f0 = view;
        this.f20556g0 = cVar;
        this.f20557h0 = gVar;
        this.f20558i0 = i6;
        setClipChildren(false);
        java.lang.String strValueOf = java.lang.String.valueOf(i6);
        this.f20559j0 = strValueOf;
        java.lang.Object objC = gVar != null ? gVar.c(strValueOf) : null;
        android.util.SparseArray<android.os.Parcelable> sparseArray = objC instanceof android.util.SparseArray ? (android.util.SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        y();
        this.f20561l0 = androidx.compose.ui.viewinterop.e.e();
        this.f20562m0 = androidx.compose.ui.viewinterop.e.e();
        this.f20563n0 = androidx.compose.ui.viewinterop.e.e();
    }

    /* synthetic */ i(android.content.Context context, V.AbstractC1744s abstractC1744s, android.view.View view, p241y0.c cVar, p041e0.g gVar, int i6, F0.o0 o0Var, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(context, (i10 & 2) != 0 ? null : abstractC1744s, view, (i10 & 8) != 0 ? new p241y0.c() : cVar, gVar, i6, o0Var);
    }

    public i(android.content.Context context, p237x7.l lVar, V.AbstractC1744s abstractC1744s, p041e0.g gVar, int i6, F0.o0 o0Var) {
        this(context, abstractC1744s, (android.view.View) lVar.l(context), null, gVar, i6, o0Var, 8, null);
    }

    private final void setSavableRegistryEntry(e0.g.a aVar) {
        e0.g.a aVar2 = this.f20560k0;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f20560k0 = aVar;
    }

    private final void y() {
        p041e0.g gVar = this.f20557h0;
        if (gVar != null) {
            setSavableRegistryEntry(gVar.e(this.f20559j0, new androidx.compose.ui.viewinterop.i.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        setSavableRegistryEntry(null);
    }

    public final p241y0.c getDispatcher() {
        return this.f20556g0;
    }

    public final p237x7.l getReleaseBlock() {
        return this.f20563n0;
    }

    public final p237x7.l getResetBlock() {
        return this.f20562m0;
    }

    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.AbstractC1920a getSubCompositionView() {
        return androidx.compose.ui.platform.F1.a(this);
    }

    public final p237x7.l getUpdateBlock() {
        return this.f20561l0;
    }

    public android.view.View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(p237x7.l lVar) {
        this.f20563n0 = lVar;
        setRelease(new androidx.compose.ui.viewinterop.i.b());
    }

    public final void setResetBlock(p237x7.l lVar) {
        this.f20562m0 = lVar;
        setReset(new androidx.compose.ui.viewinterop.i.c());
    }

    public final void setUpdateBlock(p237x7.l lVar) {
        this.f20561l0 = lVar;
        setUpdate(new androidx.compose.ui.viewinterop.i.d());
    }
}
