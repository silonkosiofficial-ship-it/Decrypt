package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.google.android.material.progressindicator.g {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.material.progressindicator.h f43551R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private com.google.android.material.progressindicator.i f43552S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43553T;

    j(android.content.Context context, com.google.android.material.progressindicator.b bVar, com.google.android.material.progressindicator.h hVar, com.google.android.material.progressindicator.i iVar) {
        super(context, bVar);
        y(hVar);
        x(iVar);
    }

    static com.google.android.material.progressindicator.j t(android.content.Context context, com.google.android.material.progressindicator.e eVar, com.google.android.material.progressindicator.c cVar) {
        com.google.android.material.progressindicator.j jVar = new com.google.android.material.progressindicator.j(context, eVar, cVar, new com.google.android.material.progressindicator.d(eVar));
        jVar.z(androidx.vectordrawable.graphics.drawable.h.b(context.getResources(), p125m4.d.f50599b, null));
        return jVar;
    }

    private boolean w() {
        p255z4.a aVar = this.f43530E;
        return aVar != null && aVar.a(this.f43528C.getContentResolver()) == 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.google.android.material.progressindicator.h hVar;
        android.graphics.Paint paint;
        float f6;
        float f10;
        int i6;
        int i10;
        int i11;
        android.graphics.drawable.Drawable drawable;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f43553T) != null) {
                drawable.setBounds(getBounds());
                androidx.core.graphics.drawable.a.n(this.f43553T, this.f43529D.f43493c[0]);
                this.f43553T.draw(canvas);
                return;
            }
            canvas.save();
            this.f43551R.g(canvas, getBounds(), h(), k(), j());
            int i12 = this.f43529D.f43497g;
            int alpha = getAlpha();
            if (i12 == 0) {
                hVar = this.f43551R;
                paint = this.f43540O;
                i6 = this.f43529D.f43494d;
                i11 = 0;
                f6 = 0.0f;
                f10 = 1.0f;
                i10 = alpha;
            } else {
                com.google.android.material.progressindicator.h.a aVar = (com.google.android.material.progressindicator.h.a) this.f43552S.f43550b.get(0);
                java.util.List list = this.f43552S.f43550b;
                com.google.android.material.progressindicator.h.a aVar2 = (com.google.android.material.progressindicator.h.a) list.get(list.size() - 1);
                com.google.android.material.progressindicator.h hVar2 = this.f43551R;
                android.graphics.Paint paint2 = this.f43540O;
                float f11 = aVar2.f43546b;
                float f12 = aVar.f43545a + 1.0f;
                alpha = 0;
                hVar = hVar2;
                paint = paint2;
                f6 = f11;
                f10 = f12;
                i6 = this.f43529D.f43494d;
                i10 = 0;
                i11 = i12;
            }
            hVar.d(canvas, paint, f6, f10, i6, i10, i11);
            for (int i13 = 0; i13 < this.f43552S.f43550b.size(); i13++) {
                com.google.android.material.progressindicator.h.a aVar3 = (com.google.android.material.progressindicator.h.a) this.f43552S.f43550b.get(i13);
                this.f43551R.c(canvas, this.f43540O, aVar3, getAlpha());
                if (i13 > 0 && i12 > 0) {
                    this.f43551R.d(canvas, this.f43540O, ((com.google.android.material.progressindicator.h.a) this.f43552S.f43550b.get(i13 - 1)).f43546b, aVar3.f43545a, this.f43529D.f43494d, alpha, i12);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f43551R.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f43551R.f();
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

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean q(boolean z6, boolean z10, boolean z11) {
        return super.q(z6, z10, z11);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean r(boolean z6, boolean z10, boolean z11) {
        android.graphics.drawable.Drawable drawable;
        boolean zR = super.r(z6, z10, z11);
        if (w() && (drawable = this.f43553T) != null) {
            return drawable.setVisible(z6, z10);
        }
        if (!isRunning()) {
            this.f43552S.a();
        }
        if (z6 && z11) {
            this.f43552S.g();
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

    com.google.android.material.progressindicator.i u() {
        return this.f43552S;
    }

    com.google.android.material.progressindicator.h v() {
        return this.f43551R;
    }

    void x(com.google.android.material.progressindicator.i iVar) {
        this.f43552S = iVar;
        iVar.e(this);
    }

    void y(com.google.android.material.progressindicator.h hVar) {
        this.f43551R = hVar;
    }

    public void z(android.graphics.drawable.Drawable drawable) {
        this.f43553T = drawable;
    }
}
