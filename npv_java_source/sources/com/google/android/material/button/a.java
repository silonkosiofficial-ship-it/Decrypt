package com.google.android.material.button;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f43003u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f43004v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.button.MaterialButton f43005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E4.k f43006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f43013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.content.res.ColorStateList f43014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.content.res.ColorStateList f43015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.content.res.ColorStateList f43016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43017m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f43021q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private android.graphics.drawable.LayerDrawable f43023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43024t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f43018n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f43019o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f43020p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f43022r = true;

    a(com.google.android.material.button.MaterialButton materialButton, E4.k kVar) {
        this.f43005a = materialButton;
        this.f43006b = kVar;
    }

    private void G(int i6, int i10) {
        int iE = androidx.core.view.X.E(this.f43005a);
        int paddingTop = this.f43005a.getPaddingTop();
        int iD = androidx.core.view.X.D(this.f43005a);
        int paddingBottom = this.f43005a.getPaddingBottom();
        int i11 = this.f43009e;
        int i12 = this.f43010f;
        this.f43010f = i10;
        this.f43009e = i6;
        if (!this.f43019o) {
            H();
        }
        androidx.core.view.X.B0(this.f43005a, iE, (paddingTop + i6) - i11, iD, (paddingBottom + i10) - i12);
    }

    private void H() {
        this.f43005a.setInternalBackground(a());
        E4.g gVarF = f();
        if (gVarF != null) {
            gVarF.U(this.f43024t);
            gVarF.setState(this.f43005a.getDrawableState());
        }
    }

    private void I(E4.k kVar) {
        if (f43004v && !this.f43019o) {
            int iE = androidx.core.view.X.E(this.f43005a);
            int paddingTop = this.f43005a.getPaddingTop();
            int iD = androidx.core.view.X.D(this.f43005a);
            int paddingBottom = this.f43005a.getPaddingBottom();
            H();
            androidx.core.view.X.B0(this.f43005a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void J() {
        E4.g gVarF = f();
        E4.g gVarN = n();
        if (gVarF != null) {
            gVarF.a0(this.f43012h, this.f43015k);
            if (gVarN != null) {
                gVarN.Z(this.f43012h, this.f43018n ? p195t4.a.d(this.f43005a, p125m4.a.f50520n) : 0);
            }
        }
    }

    private android.graphics.drawable.InsetDrawable K(android.graphics.drawable.Drawable drawable) {
        return new android.graphics.drawable.InsetDrawable(drawable, this.f43007c, this.f43009e, this.f43008d, this.f43010f);
    }

    private android.graphics.drawable.Drawable a() {
        E4.g gVar = new E4.g(this.f43006b);
        gVar.K(this.f43005a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f43014j);
        android.graphics.PorterDuff.Mode mode = this.f43013i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.a0(this.f43012h, this.f43015k);
        E4.g gVar2 = new E4.g(this.f43006b);
        gVar2.setTint(0);
        gVar2.Z(this.f43012h, this.f43018n ? p195t4.a.d(this.f43005a, p125m4.a.f50520n) : 0);
        if (f43003u) {
            E4.g gVar3 = new E4.g(this.f43006b);
            this.f43017m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(C4.b.a(this.f43016l), K(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gVar2, gVar})), this.f43017m);
            this.f43023s = rippleDrawable;
            return rippleDrawable;
        }
        C4.a aVar = new C4.a(this.f43006b);
        this.f43017m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, C4.b.a(this.f43016l));
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gVar2, gVar, this.f43017m});
        this.f43023s = layerDrawable;
        return K(layerDrawable);
    }

    private E4.g g(boolean z6) {
        android.graphics.drawable.LayerDrawable layerDrawable = this.f43023s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (E4.g) (f43003u ? (android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) this.f43023s.getDrawable(0)).getDrawable() : this.f43023s).getDrawable(!z6 ? 1 : 0);
    }

    private E4.g n() {
        return g(true);
    }

    void A(boolean z6) {
        this.f43018n = z6;
        J();
    }

    void B(android.content.res.ColorStateList colorStateList) {
        if (this.f43015k != colorStateList) {
            this.f43015k = colorStateList;
            J();
        }
    }

    void C(int i6) {
        if (this.f43012h != i6) {
            this.f43012h = i6;
            J();
        }
    }

    void D(android.content.res.ColorStateList colorStateList) {
        if (this.f43014j != colorStateList) {
            this.f43014j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f43014j);
            }
        }
    }

    void E(android.graphics.PorterDuff.Mode mode) {
        if (this.f43013i != mode) {
            this.f43013i = mode;
            if (f() == null || this.f43013i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.f43013i);
        }
    }

    void F(boolean z6) {
        this.f43022r = z6;
    }

    int b() {
        return this.f43011g;
    }

    public int c() {
        return this.f43010f;
    }

    public int d() {
        return this.f43009e;
    }

    public E4.n e() {
        android.graphics.drawable.LayerDrawable layerDrawable = this.f43023s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (E4.n) (this.f43023s.getNumberOfLayers() > 2 ? this.f43023s.getDrawable(2) : this.f43023s.getDrawable(1));
    }

    E4.g f() {
        return g(false);
    }

    android.content.res.ColorStateList h() {
        return this.f43016l;
    }

    E4.k i() {
        return this.f43006b;
    }

    android.content.res.ColorStateList j() {
        return this.f43015k;
    }

    int k() {
        return this.f43012h;
    }

    android.content.res.ColorStateList l() {
        return this.f43014j;
    }

    android.graphics.PorterDuff.Mode m() {
        return this.f43013i;
    }

    boolean o() {
        return this.f43019o;
    }

    boolean p() {
        return this.f43021q;
    }

    boolean q() {
        return this.f43022r;
    }

    void r(android.content.res.TypedArray typedArray) {
        this.f43007c = typedArray.getDimensionPixelOffset(p125m4.j.f50755F2, 0);
        this.f43008d = typedArray.getDimensionPixelOffset(p125m4.j.f50763G2, 0);
        this.f43009e = typedArray.getDimensionPixelOffset(p125m4.j.f50771H2, 0);
        this.f43010f = typedArray.getDimensionPixelOffset(p125m4.j.f50779I2, 0);
        if (typedArray.hasValue(p125m4.j.f50811M2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(p125m4.j.f50811M2, -1);
            this.f43011g = dimensionPixelSize;
            z(this.f43006b.w(dimensionPixelSize));
            this.f43020p = true;
        }
        this.f43012h = typedArray.getDimensionPixelSize(p125m4.j.f50891W2, 0);
        this.f43013i = com.google.android.material.internal.n.i(typedArray.getInt(p125m4.j.f50803L2, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f43014j = B4.c.a(this.f43005a.getContext(), typedArray, p125m4.j.f50795K2);
        this.f43015k = B4.c.a(this.f43005a.getContext(), typedArray, p125m4.j.f50883V2);
        this.f43016l = B4.c.a(this.f43005a.getContext(), typedArray, p125m4.j.f50875U2);
        this.f43021q = typedArray.getBoolean(p125m4.j.f50787J2, false);
        this.f43024t = typedArray.getDimensionPixelSize(p125m4.j.f50819N2, 0);
        this.f43022r = typedArray.getBoolean(p125m4.j.f50899X2, true);
        int iE = androidx.core.view.X.E(this.f43005a);
        int paddingTop = this.f43005a.getPaddingTop();
        int iD = androidx.core.view.X.D(this.f43005a);
        int paddingBottom = this.f43005a.getPaddingBottom();
        if (typedArray.hasValue(p125m4.j.f50747E2)) {
            t();
        } else {
            H();
        }
        androidx.core.view.X.B0(this.f43005a, iE + this.f43007c, paddingTop + this.f43009e, iD + this.f43008d, paddingBottom + this.f43010f);
    }

    void s(int i6) {
        if (f() != null) {
            f().setTint(i6);
        }
    }

    void t() {
        this.f43019o = true;
        this.f43005a.setSupportBackgroundTintList(this.f43014j);
        this.f43005a.setSupportBackgroundTintMode(this.f43013i);
    }

    void u(boolean z6) {
        this.f43021q = z6;
    }

    void v(int i6) {
        if (this.f43020p && this.f43011g == i6) {
            return;
        }
        this.f43011g = i6;
        this.f43020p = true;
        z(this.f43006b.w(i6));
    }

    public void w(int i6) {
        G(this.f43009e, i6);
    }

    public void x(int i6) {
        G(i6, this.f43010f);
    }

    void y(android.content.res.ColorStateList colorStateList) {
        if (this.f43016l != colorStateList) {
            this.f43016l = colorStateList;
            boolean z6 = f43003u;
            if (z6 && (this.f43005a.getBackground() instanceof android.graphics.drawable.RippleDrawable)) {
                ((android.graphics.drawable.RippleDrawable) this.f43005a.getBackground()).setColor(C4.b.a(colorStateList));
            } else {
                if (z6 || !(this.f43005a.getBackground() instanceof C4.a)) {
                    return;
                }
                ((C4.a) this.f43005a.getBackground()).setTintList(C4.b.a(colorStateList));
            }
        }
    }

    void z(E4.k kVar) {
        this.f43006b = kVar;
        I(kVar);
    }
}
