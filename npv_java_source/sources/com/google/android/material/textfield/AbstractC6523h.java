package com.google.android.material.textfield;

/* JADX INFO: renamed from: com.google.android.material.textfield.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6523h extends E4.g {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    com.google.android.material.textfield.AbstractC6523h.b f43724b0;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends E4.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final android.graphics.RectF f43725w;

        private b(E4.k kVar, android.graphics.RectF rectF) {
            super(kVar, null);
            this.f43725w = rectF;
        }

        private b(com.google.android.material.textfield.AbstractC6523h.b bVar) {
            super(bVar);
            this.f43725w = bVar.f43725w;
        }

        @Override // E4.g.c, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            com.google.android.material.textfield.AbstractC6523h abstractC6523hI0 = com.google.android.material.textfield.AbstractC6523h.i0(this);
            abstractC6523hI0.invalidateSelf();
            return abstractC6523hI0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    private static class c extends com.google.android.material.textfield.AbstractC6523h {
        c(com.google.android.material.textfield.AbstractC6523h.b bVar) {
            super(bVar);
        }

        @Override // E4.g
        protected void r(android.graphics.Canvas canvas) {
            if (this.f43724b0.f43725w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f43724b0.f43725w);
            } else {
                canvas.clipRect(this.f43724b0.f43725w, android.graphics.Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    private AbstractC6523h(com.google.android.material.textfield.AbstractC6523h.b bVar) {
        super(bVar);
        this.f43724b0 = bVar;
    }

    static com.google.android.material.textfield.AbstractC6523h h0(E4.k kVar) {
        if (kVar == null) {
            kVar = new E4.k();
        }
        return i0(new com.google.android.material.textfield.AbstractC6523h.b(kVar, new android.graphics.RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.material.textfield.AbstractC6523h i0(com.google.android.material.textfield.AbstractC6523h.b bVar) {
        return new com.google.android.material.textfield.AbstractC6523h.c(bVar);
    }

    boolean j0() {
        return !this.f43724b0.f43725w.isEmpty();
    }

    void k0() {
        l0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void l0(float f6, float f10, float f11, float f12) {
        if (f6 == this.f43724b0.f43725w.left && f10 == this.f43724b0.f43725w.top && f11 == this.f43724b0.f43725w.right && f12 == this.f43724b0.f43725w.bottom) {
            return;
        }
        this.f43724b0.f43725w.set(f6, f10, f11, f12);
        invalidateSelf();
    }

    void m0(android.graphics.RectF rectF) {
        l0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        this.f43724b0 = new com.google.android.material.textfield.AbstractC6523h.b(this.f43724b0);
        return this;
    }
}
