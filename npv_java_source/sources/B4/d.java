package B4;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.ColorStateList f768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.res.ColorStateList f769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.res.ColorStateList f770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.content.res.ColorStateList f780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f783p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.graphics.Typeface f784q;

    class a extends androidx.core.content.res.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B4.f f785a;

        a(B4.f fVar) {
            this.f785a = fVar;
        }

        @Override // androidx.core.content.res.h.e
        /* JADX INFO: renamed from: h */
        public void f(int i6) {
            B4.d.this.f783p = true;
            this.f785a.a(i6);
        }

        @Override // androidx.core.content.res.h.e
        /* JADX INFO: renamed from: i */
        public void g(android.graphics.Typeface typeface) {
            B4.d dVar = B4.d.this;
            dVar.f784q = android.graphics.Typeface.create(typeface, dVar.f772e);
            B4.d.this.f783p = true;
            this.f785a.b(B4.d.this.f784q, false);
        }
    }

    class b extends B4.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.text.TextPaint f788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B4.f f789c;

        b(android.content.Context context, android.text.TextPaint textPaint, B4.f fVar) {
            this.f787a = context;
            this.f788b = textPaint;
            this.f789c = fVar;
        }

        @Override // B4.f
        public void a(int i6) {
            this.f789c.a(i6);
        }

        @Override // B4.f
        public void b(android.graphics.Typeface typeface, boolean z6) {
            B4.d.this.p(this.f787a, this.f788b, typeface);
            this.f789c.b(typeface, z6);
        }
    }

    public d(android.content.Context context, int i6) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, p125m4.j.f51123z5);
        l(typedArrayObtainStyledAttributes.getDimension(p125m4.j.f50720A5, 0.0f));
        k(B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50742D5));
        this.f768a = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50750E5);
        this.f769b = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50758F5);
        this.f772e = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50734C5, 0);
        this.f773f = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50727B5, 1);
        int iE = B4.c.e(typedArrayObtainStyledAttributes, p125m4.j.f50806L5, p125m4.j.f50798K5);
        this.f782o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f771d = typedArrayObtainStyledAttributes.getString(iE);
        this.f774g = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50814M5, false);
        this.f770c = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50766G5);
        this.f775h = typedArrayObtainStyledAttributes.getFloat(p125m4.j.f50774H5, 0.0f);
        this.f776i = typedArrayObtainStyledAttributes.getFloat(p125m4.j.f50782I5, 0.0f);
        this.f777j = typedArrayObtainStyledAttributes.getFloat(p125m4.j.f50790J5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i6, p125m4.j.f50868T3);
        this.f778k = typedArrayObtainStyledAttributes2.hasValue(p125m4.j.f50876U3);
        this.f779l = typedArrayObtainStyledAttributes2.getFloat(p125m4.j.f50876U3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        android.graphics.Typeface typeface;
        java.lang.String str;
        if (this.f784q == null && (str = this.f771d) != null) {
            this.f784q = android.graphics.Typeface.create(str, this.f772e);
        }
        if (this.f784q == null) {
            int i6 = this.f773f;
            if (i6 == 1) {
                typeface = android.graphics.Typeface.SANS_SERIF;
            } else if (i6 != 2) {
                typeface = i6 != 3 ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.MONOSPACE;
            } else {
                typeface = android.graphics.Typeface.SERIF;
            }
            this.f784q = typeface;
            this.f784q = android.graphics.Typeface.create(this.f784q, this.f772e);
        }
    }

    private boolean m(android.content.Context context) {
        if (B4.e.a()) {
            return true;
        }
        int i6 = this.f782o;
        return (i6 != 0 ? androidx.core.content.res.h.c(context, i6) : null) != null;
    }

    public android.graphics.Typeface e() {
        d();
        return this.f784q;
    }

    public android.graphics.Typeface f(android.content.Context context) {
        if (this.f783p) {
            return this.f784q;
        }
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface typefaceG = androidx.core.content.res.h.g(context, this.f782o);
                this.f784q = typefaceG;
                if (typefaceG != null) {
                    this.f784q = android.graphics.Typeface.create(typefaceG, this.f772e);
                }
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            } catch (java.lang.Exception e6) {
                java.lang.String str = "Error loading font " + this.f771d;
            }
        }
        d();
        this.f783p = true;
        return this.f784q;
    }

    public void g(android.content.Context context, B4.f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i6 = this.f782o;
        if (i6 == 0) {
            this.f783p = true;
        }
        if (this.f783p) {
            fVar.b(this.f784q, true);
            return;
        }
        try {
            androidx.core.content.res.h.i(context, i6, new B4.d.a(fVar), null);
        } catch (android.content.res.Resources.NotFoundException unused) {
            this.f783p = true;
            fVar.a(1);
        } catch (java.lang.Exception e6) {
            java.lang.String str = "Error loading font " + this.f771d;
            this.f783p = true;
            fVar.a(-3);
        }
    }

    public void h(android.content.Context context, android.text.TextPaint textPaint, B4.f fVar) {
        p(context, textPaint, e());
        g(context, new B4.d.b(context, textPaint, fVar));
    }

    public android.content.res.ColorStateList i() {
        return this.f780m;
    }

    public float j() {
        return this.f781n;
    }

    public void k(android.content.res.ColorStateList colorStateList) {
        this.f780m = colorStateList;
    }

    public void l(float f6) {
        this.f781n = f6;
    }

    public void n(android.content.Context context, android.text.TextPaint textPaint, B4.f fVar) {
        o(context, textPaint, fVar);
        android.content.res.ColorStateList colorStateList = this.f780m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f6 = this.f777j;
        float f10 = this.f775h;
        float f11 = this.f776i;
        android.content.res.ColorStateList colorStateList2 = this.f770c;
        textPaint.setShadowLayer(f6, f10, f11, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(android.content.Context context, android.text.TextPaint textPaint, B4.f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(android.content.Context context, android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        android.graphics.Typeface typefaceA = B4.h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i6 = this.f772e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i6 & 1) != 0);
        textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f781n);
        if (this.f778k) {
            textPaint.setLetterSpacing(this.f779l);
        }
    }
}
