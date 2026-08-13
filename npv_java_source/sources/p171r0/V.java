package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class V extends android.view.View {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final r0.V.b f53508M = new r0.V.b(null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final android.view.ViewOutlineProvider f53509N = new r0.V.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.view.View f53510C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p141o0.C6995r0 f53511D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p161q0.a f53512E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f53513F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.graphics.Outline f53514G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f53515H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Y0.e f53516I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Y0.v f53517J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private p237x7.l f53518K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private p171r0.C7053c f53519L;

    public static final class a extends android.view.ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, android.graphics.Outline outline) {
            android.graphics.Outline outline2;
            if (!(view instanceof p171r0.V) || (outline2 = ((p171r0.V) view).f53514G) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public V(android.view.View view, p141o0.C6995r0 c6995r0, p161q0.a aVar) {
        super(view.getContext());
        this.f53510C = view;
        this.f53511D = c6995r0;
        this.f53512E = aVar;
        setOutlineProvider(f53509N);
        this.f53515H = true;
        this.f53516I = p161q0.e.a();
        this.f53517J = Y0.v.Ltr;
        this.f53518K = p171r0.InterfaceC7055e.f53558a.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final void b(Y0.e eVar, Y0.v vVar, p171r0.C7053c c7053c, p237x7.l lVar) {
        this.f53516I = eVar;
        this.f53517J = vVar;
        this.f53518K = lVar;
        this.f53519L = c7053c;
    }

    public final boolean c(android.graphics.Outline outline) {
        this.f53514G = outline;
        return p171r0.L.f53501a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        p141o0.C6995r0 c6995r0 = this.f53511D;
        android.graphics.Canvas canvasA = c6995r0.a().a();
        c6995r0.a().w(canvas);
        p141o0.G gA = c6995r0.a();
        p161q0.a aVar = this.f53512E;
        Y0.e eVar = this.f53516I;
        Y0.v vVar = this.f53517J;
        long jA = p131n0.n.a(getWidth(), getHeight());
        p171r0.C7053c c7053c = this.f53519L;
        p237x7.l lVar = this.f53518K;
        Y0.e density = aVar.F0().getDensity();
        Y0.v layoutDirection = aVar.F0().getLayoutDirection();
        p141o0.InterfaceC6993q0 interfaceC6993q0H = aVar.F0().h();
        long jI = aVar.F0().i();
        p171r0.C7053c c7053cF = aVar.F0().f();
        p161q0.d dVarF0 = aVar.F0();
        dVarF0.a(eVar);
        dVarF0.b(vVar);
        dVarF0.g(gA);
        dVarF0.d(jA);
        dVarF0.e(c7053c);
        gA.m();
        try {
            lVar.l(aVar);
            gA.s();
            p161q0.d dVarF1 = aVar.F0();
            dVarF1.a(density);
            dVarF1.b(layoutDirection);
            dVarF1.g(interfaceC6993q0H);
            dVarF1.d(jI);
            dVarF1.e(c7053cF);
            c6995r0.a().w(canvasA);
            this.f53513F = false;
        } catch (java.lang.Throwable th) {
            gA.s();
            p161q0.d dVarF2 = aVar.F0();
            dVarF2.a(density);
            dVarF2.b(layoutDirection);
            dVarF2.g(interfaceC6993q0H);
            dVarF2.d(jI);
            dVarF2.e(c7053cF);
            throw th;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f53515H;
    }

    public final p141o0.C6995r0 getCanvasHolder() {
        return this.f53511D;
    }

    public final android.view.View getOwnerView() {
        return this.f53510C;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f53515H;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f53513F) {
            return;
        }
        this.f53513F = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z6) {
        if (this.f53515H != z6) {
            this.f53515H = z6;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z6) {
        this.f53513F = z6;
    }
}
