package R1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements R1.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final R1.b.p f9372m = new R1.b.f("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final R1.b.p f9373n = new R1.b.g("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final R1.b.p f9374o = new R1.b.h("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final R1.b.p f9375p = new R1.b.i("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final R1.b.p f9376q = new R1.b.j("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final R1.b.p f9377r = new R1.b.k("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final R1.b.p f9378s = new R1.b.l("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final R1.b.p f9379t = new R1.b.m("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final R1.b.p f9380u = new R1.b.n("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final R1.b.p f9381v = new R1.b.a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final R1.b.p f9382w = new R1.b.C0217b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final R1.b.p f9383x = new R1.b.c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final R1.b.p f9384y = new R1.b.d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final R1.b.p f9385z = new R1.b.e("scrollY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.lang.Object f9389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final R1.c f9390e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f9395j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f9386a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f9387b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f9388c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f9391f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f9392g = Float.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f9393h = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9394i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.ArrayList f9396k = new java.util.ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.ArrayList f9397l = new java.util.ArrayList();

    static class a extends R1.b.p {
        a(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getY();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setY(f6);
        }
    }

    /* JADX INFO: renamed from: R1.b$b, reason: collision with other inner class name */
    static class C0217b extends R1.b.p {
        C0217b(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return androidx.core.view.X.L(view);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            androidx.core.view.X.H0(view, f6);
        }
    }

    static class c extends R1.b.p {
        c(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getAlpha();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setAlpha(f6);
        }
    }

    static class d extends R1.b.p {
        d(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getScrollX();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setScrollX((int) f6);
        }
    }

    static class e extends R1.b.p {
        e(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getScrollY();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setScrollY((int) f6);
        }
    }

    static class f extends R1.b.p {
        f(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getTranslationX();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setTranslationX(f6);
        }
    }

    static class g extends R1.b.p {
        g(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getTranslationY();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setTranslationY(f6);
        }
    }

    static class h extends R1.b.p {
        h(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return androidx.core.view.X.I(view);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            androidx.core.view.X.F0(view, f6);
        }
    }

    static class i extends R1.b.p {
        i(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getScaleX();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setScaleX(f6);
        }
    }

    static class j extends R1.b.p {
        j(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getScaleY();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setScaleY(f6);
        }
    }

    static class k extends R1.b.p {
        k(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getRotation();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setRotation(f6);
        }
    }

    static class l extends R1.b.p {
        l(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getRotationX();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setRotationX(f6);
        }
    }

    static class m extends R1.b.p {
        m(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getRotationY();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setRotationY(f6);
        }
    }

    static class n extends R1.b.p {
        n(java.lang.String str) {
            super(str, null);
        }

        @Override // R1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(android.view.View view) {
            return view.getX();
        }

        @Override // R1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(android.view.View view, float f6) {
            view.setX(f6);
        }
    }

    static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f9398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f9399b;

        o() {
        }
    }

    public static abstract class p extends R1.c {
        private p(java.lang.String str) {
            super(str);
        }

        /* synthetic */ p(java.lang.String str, R1.b.f fVar) {
            this(str);
        }
    }

    b(java.lang.Object obj, R1.c cVar) {
        float f6;
        this.f9389d = obj;
        this.f9390e = cVar;
        if (cVar == f9377r || cVar == f9378s || cVar == f9379t) {
            f6 = 0.1f;
        } else {
            if (cVar == f9383x || cVar == f9375p || cVar == f9376q) {
                this.f9395j = 0.00390625f;
                return;
            }
            f6 = 1.0f;
        }
        this.f9395j = f6;
    }

    private void b(boolean z6) {
        this.f9391f = false;
        R1.a.d().g(this);
        this.f9394i = 0L;
        this.f9388c = false;
        for (int i6 = 0; i6 < this.f9396k.size(); i6++) {
            if (this.f9396k.get(i6) != null) {
                androidx.appcompat.app.D.a(this.f9396k.get(i6));
                throw null;
            }
        }
        f(this.f9396k);
    }

    private float c() {
        return this.f9390e.a(this.f9389d);
    }

    private static void f(java.util.ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (this.f9391f) {
            return;
        }
        this.f9391f = true;
        if (!this.f9388c) {
            this.f9387b = c();
        }
        float f6 = this.f9387b;
        if (f6 > this.f9392g || f6 < this.f9393h) {
            throw new java.lang.IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        R1.a.d().a(this, 0L);
    }

    @Override // R1.a.b
    public boolean a(long j6) {
        long j10 = this.f9394i;
        if (j10 == 0) {
            this.f9394i = j6;
            g(this.f9387b);
            return false;
        }
        this.f9394i = j6;
        boolean zK = k(j6 - j10);
        float fMin = java.lang.Math.min(this.f9387b, this.f9392g);
        this.f9387b = fMin;
        float fMax = java.lang.Math.max(fMin, this.f9393h);
        this.f9387b = fMax;
        g(fMax);
        if (zK) {
            b(false);
        }
        return zK;
    }

    float d() {
        return this.f9395j * 0.75f;
    }

    public boolean e() {
        return this.f9391f;
    }

    void g(float f6) {
        this.f9390e.b(this.f9389d, f6);
        for (int i6 = 0; i6 < this.f9397l.size(); i6++) {
            if (this.f9397l.get(i6) != null) {
                androidx.appcompat.app.D.a(this.f9397l.get(i6));
                throw null;
            }
        }
        f(this.f9397l);
    }

    public R1.b h(float f6) {
        this.f9387b = f6;
        this.f9388c = true;
        return this;
    }

    public void i() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9391f) {
            return;
        }
        j();
    }

    abstract boolean k(long j6);
}
