package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.google.android.material.progressindicator.g {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final R1.c f43521W = new com.google.android.material.progressindicator.f.a("indicatorLevel");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.material.progressindicator.h f43522R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final R1.e f43523S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final R1.d f43524T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final com.google.android.material.progressindicator.h.a f43525U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f43526V;

    class a extends R1.c {
        a(java.lang.String str) {
            super(str);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(com.google.android.material.progressindicator.f fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(com.google.android.material.progressindicator.f fVar, float f6) {
            fVar.z(f6 / 10000.0f);
        }
    }

    f(android.content.Context context, com.google.android.material.progressindicator.b bVar, com.google.android.material.progressindicator.h hVar) {
        super(context, bVar);
        this.f43526V = false;
        y(hVar);
        this.f43525U = new com.google.android.material.progressindicator.h.a();
        R1.e eVar = new R1.e();
        this.f43523S = eVar;
        eVar.d(1.0f);
        eVar.f(50.0f);
        R1.d dVar = new R1.d(this, f43521W);
        this.f43524T = dVar;
        dVar.p(eVar);
        n(1.0f);
    }

    static com.google.android.material.progressindicator.f v(android.content.Context context, com.google.android.material.progressindicator.e eVar, com.google.android.material.progressindicator.c cVar) {
        return new com.google.android.material.progressindicator.f(context, eVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x() {
        return this.f43525U.f43546b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(float f6) {
        this.f43525U.f43546b = f6;
        invalidateSelf();
    }

    void A(float f6) {
        setLevel((int) (f6 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.google.android.material.progressindicator.h hVar;
        android.graphics.Paint paint;
        int i6;
        int alpha;
        int iA;
        float fX;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f43522R.g(canvas, getBounds(), h(), k(), j());
            this.f43540O.setStyle(android.graphics.Paint.Style.FILL);
            this.f43540O.setAntiAlias(true);
            com.google.android.material.progressindicator.h.a aVar = this.f43525U;
            com.google.android.material.progressindicator.b bVar = this.f43529D;
            aVar.f43547c = bVar.f43493c[0];
            int i10 = bVar.f43497g;
            if (i10 > 0) {
                iA = (int) ((i10 * p222w1.a.a(x(), 0.0f, 0.01f)) / 0.01f);
                hVar = this.f43522R;
                paint = this.f43540O;
                fX = x();
                i6 = this.f43529D.f43494d;
                alpha = getAlpha();
            } else {
                hVar = this.f43522R;
                paint = this.f43540O;
                i6 = bVar.f43494d;
                alpha = getAlpha();
                iA = 0;
                fX = 0.0f;
            }
            hVar.d(canvas, paint, fX, 1.0f, i6, alpha, iA);
            this.f43522R.c(canvas, this.f43540O, this.f43525U, getAlpha());
            this.f43522R.b(canvas, this.f43540O, this.f43529D.f43493c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f43522R.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f43522R.f();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f43524T.q();
        z(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        if (this.f43526V) {
            this.f43524T.q();
            z(i6 / 10000.0f);
            return true;
        }
        this.f43524T.h(x() * 10000.0f);
        this.f43524T.l(i6);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean q(boolean z6, boolean z10, boolean z11) {
        return super.q(z6, z10, z11);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean r(boolean z6, boolean z10, boolean z11) {
        boolean zR = super.r(z6, z10, z11);
        float fA = this.f43530E.a(this.f43528C.getContentResolver());
        if (fA == 0.0f) {
            this.f43526V = true;
        } else {
            this.f43526V = false;
            this.f43523S.f(50.0f / fA);
        }
        return zR;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.s(bVar);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i6) {
        super.setAlpha(i6);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z6, boolean z10) {
        return super.setVisible(z6, z10);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    com.google.android.material.progressindicator.h w() {
        return this.f43522R;
    }

    void y(com.google.android.material.progressindicator.h hVar) {
        this.f43522R = hVar;
    }
}
