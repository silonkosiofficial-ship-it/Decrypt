package R;

/* JADX INFO: loaded from: classes.dex */
final class v extends android.graphics.drawable.RippleDrawable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final R.v.a f9273G = new R.v.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f9274C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p141o0.C7016y0 f9275D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Integer f9276E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f9277F;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final R.v.b f9278a = new R.v.b();

        private b() {
        }

        public final void a(android.graphics.drawable.RippleDrawable rippleDrawable, int i6) {
            rippleDrawable.setRadius(i6);
        }
    }

    public v(boolean z6) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z6 ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.f9274C = z6;
    }

    private final long a(long j6, float f6) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            f6 *= 2;
        }
        return p141o0.C7016y0.m(j6, E7.j.f(f6, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j6, float f6) {
        long jA = a(j6, f6);
        p141o0.C7016y0 c7016y0 = this.f9275D;
        if (c7016y0 == null ? false : p141o0.C7016y0.o(c7016y0.w(), jA)) {
            return;
        }
        this.f9275D = p141o0.C7016y0.i(jA);
        setColor(android.content.res.ColorStateList.valueOf(p141o0.A0.k(jA)));
    }

    public final void c(int i6) {
        java.lang.Integer num = this.f9276E;
        if (num != null && num.intValue() == i6) {
            return;
        }
        this.f9276E = java.lang.Integer.valueOf(i6);
        R.v.b.f9278a.a(this, i6);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
        if (!this.f9274C) {
            this.f9277F = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.f9277F = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f9277F;
    }
}
