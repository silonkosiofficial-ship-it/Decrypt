package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2013l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.core.view.C2013l0.e f21726a;

    /* JADX INFO: renamed from: androidx.core.view.l0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.f f21727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.f f21728b;

        private a(android.view.WindowInsetsAnimation.Bounds bounds) {
            this.f21727a = androidx.core.view.C2013l0.d.g(bounds);
            this.f21728b = androidx.core.view.C2013l0.d.f(bounds);
        }

        public a(androidx.core.graphics.f fVar, androidx.core.graphics.f fVar2) {
            this.f21727a = fVar;
            this.f21728b = fVar2;
        }

        public static androidx.core.view.C2013l0.a d(android.view.WindowInsetsAnimation.Bounds bounds) {
            return new androidx.core.view.C2013l0.a(bounds);
        }

        public androidx.core.graphics.f a() {
            return this.f21727a;
        }

        public androidx.core.graphics.f b() {
            return this.f21728b;
        }

        public android.view.WindowInsetsAnimation.Bounds c() {
            return androidx.core.view.C2013l0.d.e(this);
        }

        public java.lang.String toString() {
            return "Bounds{lower=" + this.f21727a + " upper=" + this.f21728b + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        android.view.WindowInsets f21729C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f21730D;

        public b(int i6) {
            this.f21730D = i6;
        }

        public final int b() {
            return this.f21730D;
        }

        public void c(androidx.core.view.C2013l0 c2013l0) {
        }

        public void d(androidx.core.view.C2013l0 c2013l0) {
        }

        public abstract androidx.core.view.C2038y0 e(androidx.core.view.C2038y0 c2038y0, java.util.List list);

        public androidx.core.view.C2013l0.a f(androidx.core.view.C2013l0 c2013l0, androidx.core.view.C2013l0.a aVar) {
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l0$c */
    private static class c extends androidx.core.view.C2013l0.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final android.view.animation.Interpolator f21731e = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final android.view.animation.Interpolator f21732f = new Y1.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final android.view.animation.Interpolator f21733g = new android.view.animation.DecelerateInterpolator();

        /* JADX INFO: renamed from: androidx.core.view.l0$c$a */
        private static class a implements android.view.View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final androidx.core.view.C2013l0.b f21734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private androidx.core.view.C2038y0 f21735b;

            /* JADX INFO: renamed from: androidx.core.view.l0$c$a$a, reason: collision with other inner class name */
            class C0414a implements android.animation.ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.core.view.C2013l0 f21736a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.core.view.C2038y0 f21737b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.core.view.C2038y0 f21738c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f21739d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ android.view.View f21740e;

                C0414a(androidx.core.view.C2013l0 c2013l0, androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0 c2038y1, int i6, android.view.View view) {
                    this.f21736a = c2013l0;
                    this.f21737b = c2038y0;
                    this.f21738c = c2038y1;
                    this.f21739d = i6;
                    this.f21740e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    this.f21736a.e(valueAnimator.getAnimatedFraction());
                    androidx.core.view.C2013l0.c.k(this.f21740e, androidx.core.view.C2013l0.c.o(this.f21737b, this.f21738c, this.f21736a.b(), this.f21739d), java.util.Collections.singletonList(this.f21736a));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.l0$c$a$b */
            class b extends android.animation.AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.core.view.C2013l0 f21742a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ android.view.View f21743b;

                b(androidx.core.view.C2013l0 c2013l0, android.view.View view) {
                    this.f21742a = c2013l0;
                    this.f21743b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    this.f21742a.e(1.0f);
                    androidx.core.view.C2013l0.c.i(this.f21743b, this.f21742a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.l0$c$a$c, reason: collision with other inner class name */
            class RunnableC0415c implements java.lang.Runnable {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ android.view.View f21745C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ androidx.core.view.C2013l0 f21746D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ androidx.core.view.C2013l0.a f21747E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ android.animation.ValueAnimator f21748F;

                RunnableC0415c(android.view.View view, androidx.core.view.C2013l0 c2013l0, androidx.core.view.C2013l0.a aVar, android.animation.ValueAnimator valueAnimator) {
                    this.f21745C = view;
                    this.f21746D = c2013l0;
                    this.f21747E = aVar;
                    this.f21748F = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    androidx.core.view.C2013l0.c.l(this.f21745C, this.f21746D, this.f21747E);
                    this.f21748F.start();
                }
            }

            a(android.view.View view, androidx.core.view.C2013l0.b bVar) {
                this.f21734a = bVar;
                androidx.core.view.C2038y0 c2038y0F = androidx.core.view.X.F(view);
                this.f21735b = c2038y0F != null ? new androidx.core.view.C2038y0.b(c2038y0F).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                int iE;
                if (view.isLaidOut()) {
                    androidx.core.view.C2038y0 c2038y0X = androidx.core.view.C2038y0.x(windowInsets, view);
                    if (this.f21735b == null) {
                        this.f21735b = androidx.core.view.X.F(view);
                    }
                    if (this.f21735b != null) {
                        androidx.core.view.C2013l0.b bVarN = androidx.core.view.C2013l0.c.n(view);
                        if ((bVarN == null || !j$.util.Objects.equals(bVarN.f21729C, windowInsets)) && (iE = androidx.core.view.C2013l0.c.e(c2038y0X, this.f21735b)) != 0) {
                            androidx.core.view.C2038y0 c2038y0 = this.f21735b;
                            androidx.core.view.C2013l0 c2013l0 = new androidx.core.view.C2013l0(iE, androidx.core.view.C2013l0.c.g(iE, c2038y0X, c2038y0), 160L);
                            c2013l0.e(0.0f);
                            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2013l0.a());
                            androidx.core.view.C2013l0.a aVarF = androidx.core.view.C2013l0.c.f(c2038y0X, c2038y0, iE);
                            androidx.core.view.C2013l0.c.j(view, c2013l0, windowInsets, false);
                            duration.addUpdateListener(new androidx.core.view.C2013l0.c.a.C0414a(c2013l0, c2038y0X, c2038y0, iE, view));
                            duration.addListener(new androidx.core.view.C2013l0.c.a.b(c2013l0, view));
                            androidx.core.view.J.a(view, new androidx.core.view.C2013l0.c.a.RunnableC0415c(view, c2013l0, aVarF, duration));
                        }
                        return androidx.core.view.C2013l0.c.m(view, windowInsets);
                    }
                    this.f21735b = c2038y0X;
                } else {
                    this.f21735b = androidx.core.view.C2038y0.x(windowInsets, view);
                }
                return androidx.core.view.C2013l0.c.m(view, windowInsets);
            }
        }

        c(int i6, android.view.animation.Interpolator interpolator, long j6) {
            super(i6, interpolator, j6);
        }

        static int e(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0 c2038y1) {
            int i6 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if (!c2038y0.f(i10).equals(c2038y1.f(i10))) {
                    i6 |= i10;
                }
            }
            return i6;
        }

        static androidx.core.view.C2013l0.a f(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0 c2038y1, int i6) {
            androidx.core.graphics.f fVarF = c2038y0.f(i6);
            androidx.core.graphics.f fVarF2 = c2038y1.f(i6);
            return new androidx.core.view.C2013l0.a(androidx.core.graphics.f.b(java.lang.Math.min(fVarF.f21550a, fVarF2.f21550a), java.lang.Math.min(fVarF.f21551b, fVarF2.f21551b), java.lang.Math.min(fVarF.f21552c, fVarF2.f21552c), java.lang.Math.min(fVarF.f21553d, fVarF2.f21553d)), androidx.core.graphics.f.b(java.lang.Math.max(fVarF.f21550a, fVarF2.f21550a), java.lang.Math.max(fVarF.f21551b, fVarF2.f21551b), java.lang.Math.max(fVarF.f21552c, fVarF2.f21552c), java.lang.Math.max(fVarF.f21553d, fVarF2.f21553d)));
        }

        static android.view.animation.Interpolator g(int i6, androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0 c2038y1) {
            if ((i6 & 8) != 0) {
                return c2038y0.f(androidx.core.view.C2038y0.m.c()).f21553d > c2038y1.f(androidx.core.view.C2038y0.m.c()).f21553d ? f21731e : f21732f;
            }
            return f21733g;
        }

        private static android.view.View.OnApplyWindowInsetsListener h(android.view.View view, androidx.core.view.C2013l0.b bVar) {
            return new androidx.core.view.C2013l0.c.a(view, bVar);
        }

        static void i(android.view.View view, androidx.core.view.C2013l0 c2013l0) {
            androidx.core.view.C2013l0.b bVarN = n(view);
            if (bVarN != null) {
                bVarN.c(c2013l0);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    i(viewGroup.getChildAt(i6), c2013l0);
                }
            }
        }

        static void j(android.view.View view, androidx.core.view.C2013l0 c2013l0, android.view.WindowInsets windowInsets, boolean z6) {
            androidx.core.view.C2013l0.b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f21729C = windowInsets;
                if (!z6) {
                    bVarN.d(c2013l0);
                    z6 = bVarN.b() == 0;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    j(viewGroup.getChildAt(i6), c2013l0, windowInsets, z6);
                }
            }
        }

        static void k(android.view.View view, androidx.core.view.C2038y0 c2038y0, java.util.List list) {
            androidx.core.view.C2013l0.b bVarN = n(view);
            if (bVarN != null) {
                c2038y0 = bVarN.e(c2038y0, list);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    k(viewGroup.getChildAt(i6), c2038y0, list);
                }
            }
        }

        static void l(android.view.View view, androidx.core.view.C2013l0 c2013l0, androidx.core.view.C2013l0.a aVar) {
            androidx.core.view.C2013l0.b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f(c2013l0, aVar);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    l(viewGroup.getChildAt(i6), c2013l0, aVar);
                }
            }
        }

        static android.view.WindowInsets m(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.getTag(p202u1.c.f55383L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static androidx.core.view.C2013l0.b n(android.view.View view) {
            java.lang.Object tag = view.getTag(p202u1.c.f55390S);
            if (tag instanceof androidx.core.view.C2013l0.c.a) {
                return ((androidx.core.view.C2013l0.c.a) tag).f21734a;
            }
            return null;
        }

        static androidx.core.view.C2038y0 o(androidx.core.view.C2038y0 c2038y0, androidx.core.view.C2038y0 c2038y1, float f6, int i6) {
            androidx.core.graphics.f fVarN;
            androidx.core.view.C2038y0.b bVar = new androidx.core.view.C2038y0.b(c2038y0);
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i6 & i10) == 0) {
                    fVarN = c2038y0.f(i10);
                } else {
                    androidx.core.graphics.f fVarF = c2038y0.f(i10);
                    androidx.core.graphics.f fVarF2 = c2038y1.f(i10);
                    float f10 = 1.0f - f6;
                    fVarN = androidx.core.view.C2038y0.n(fVarF, (int) (((double) ((fVarF.f21550a - fVarF2.f21550a) * f10)) + 0.5d), (int) (((double) ((fVarF.f21551b - fVarF2.f21551b) * f10)) + 0.5d), (int) (((double) ((fVarF.f21552c - fVarF2.f21552c) * f10)) + 0.5d), (int) (((double) ((fVarF.f21553d - fVarF2.f21553d) * f10)) + 0.5d));
                }
                bVar.b(i10, fVarN);
            }
            return bVar.a();
        }

        static void p(android.view.View view, androidx.core.view.C2013l0.b bVar) {
            java.lang.Object tag = view.getTag(p202u1.c.f55383L);
            if (bVar == null) {
                view.setTag(p202u1.c.f55390S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, bVar);
            view.setTag(p202u1.c.f55390S, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l0$d */
    private static class d extends androidx.core.view.C2013l0.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final android.view.WindowInsetsAnimation f21750e;

        /* JADX INFO: renamed from: androidx.core.view.l0$d$a */
        private static class a extends android.view.WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.core.view.C2013l0.b f21751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private java.util.List f21752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private java.util.ArrayList f21753c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final java.util.HashMap f21754d;

            a(androidx.core.view.C2013l0.b bVar) {
                super(bVar.b());
                this.f21754d = new java.util.HashMap();
                this.f21751a = bVar;
            }

            private androidx.core.view.C2013l0 a(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                androidx.core.view.C2013l0 c2013l0 = (androidx.core.view.C2013l0) this.f21754d.get(windowInsetsAnimation);
                if (c2013l0 != null) {
                    return c2013l0;
                }
                androidx.core.view.C2013l0 c2013l0F = androidx.core.view.C2013l0.f(windowInsetsAnimation);
                this.f21754d.put(windowInsetsAnimation, c2013l0F);
                return c2013l0F;
            }

            public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                this.f21751a.c(a(windowInsetsAnimation));
                this.f21754d.remove(windowInsetsAnimation);
            }

            public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                this.f21751a.d(a(windowInsetsAnimation));
            }

            public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
                java.util.ArrayList arrayList = this.f21753c;
                if (arrayList == null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                    this.f21753c = arrayList2;
                    this.f21752b = j$.util.DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    android.view.WindowInsetsAnimation windowInsetsAnimationA = androidx.core.view.AbstractC2034w0.a(list.get(size));
                    androidx.core.view.C2013l0 c2013l0A = a(windowInsetsAnimationA);
                    c2013l0A.e(windowInsetsAnimationA.getFraction());
                    this.f21753c.add(c2013l0A);
                }
                return this.f21751a.e(androidx.core.view.C2038y0.w(windowInsets), this.f21752b).v();
            }

            public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
                return this.f21751a.f(a(windowInsetsAnimation), androidx.core.view.C2013l0.a.d(bounds)).c();
            }
        }

        d(int i6, android.view.animation.Interpolator interpolator, long j6) {
            this(androidx.core.view.AbstractC2028t0.a(i6, interpolator, j6));
        }

        d(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f21750e = windowInsetsAnimation;
        }

        public static android.view.WindowInsetsAnimation.Bounds e(androidx.core.view.C2013l0.a aVar) {
            androidx.core.view.AbstractC2032v0.a();
            return androidx.core.view.AbstractC2030u0.a(aVar.a().e(), aVar.b().e());
        }

        public static androidx.core.graphics.f f(android.view.WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.f.d(bounds.getUpperBound());
        }

        public static androidx.core.graphics.f g(android.view.WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.f.d(bounds.getLowerBound());
        }

        public static void h(android.view.View view, androidx.core.view.C2013l0.b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new androidx.core.view.C2013l0.d.a(bVar) : null);
        }

        @Override // androidx.core.view.C2013l0.e
        public long a() {
            return this.f21750e.getDurationMillis();
        }

        @Override // androidx.core.view.C2013l0.e
        public float b() {
            return this.f21750e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.C2013l0.e
        public int c() {
            return this.f21750e.getTypeMask();
        }

        @Override // androidx.core.view.C2013l0.e
        public void d(float f6) {
            this.f21750e.setFraction(f6);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.l0$e */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f21756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.view.animation.Interpolator f21757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f21758d;

        e(int i6, android.view.animation.Interpolator interpolator, long j6) {
            this.f21755a = i6;
            this.f21757c = interpolator;
            this.f21758d = j6;
        }

        public long a() {
            return this.f21758d;
        }

        public float b() {
            android.view.animation.Interpolator interpolator = this.f21757c;
            return interpolator != null ? interpolator.getInterpolation(this.f21756b) : this.f21756b;
        }

        public int c() {
            return this.f21755a;
        }

        public void d(float f6) {
            this.f21756b = f6;
        }
    }

    public C2013l0(int i6, android.view.animation.Interpolator interpolator, long j6) {
        this.f21726a = android.os.Build.VERSION.SDK_INT >= 30 ? new androidx.core.view.C2013l0.d(i6, interpolator, j6) : new androidx.core.view.C2013l0.c(i6, interpolator, j6);
    }

    private C2013l0(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.f21726a = new androidx.core.view.C2013l0.d(windowInsetsAnimation);
        }
    }

    static void d(android.view.View view, androidx.core.view.C2013l0.b bVar) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.C2013l0.d.h(view, bVar);
        } else {
            androidx.core.view.C2013l0.c.p(view, bVar);
        }
    }

    static androidx.core.view.C2013l0 f(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        return new androidx.core.view.C2013l0(windowInsetsAnimation);
    }

    public long a() {
        return this.f21726a.a();
    }

    public float b() {
        return this.f21726a.b();
    }

    public int c() {
        return this.f21726a.c();
    }

    public void e(float f6) {
        this.f21726a.d(f6);
    }
}
