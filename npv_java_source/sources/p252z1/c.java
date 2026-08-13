package p252z1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1.c.a f57622b = new z1.c.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p252z1.c.C0763c f57623a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p252z1.c a(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "<this>");
            p252z1.c cVar = new p252z1.c(activity, null);
            cVar.b();
            return cVar;
        }
    }

    private static final class b extends p252z1.c.C0763c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f57624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final android.view.ViewGroup.OnHierarchyChangeListener f57625i;

        public static final class a implements android.view.ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ android.app.Activity f57627D;

            a(android.app.Activity activity) {
                this.f57627D = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(android.view.View view, android.view.View view2) {
                if (p252z1.h.a(view2)) {
                    z1.c.b bVar = z1.c.b.this;
                    bVar.e(bVar.d(p252z1.i.a(view2)));
                    ((android.view.ViewGroup) this.f57627D.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(android.view.View view, android.view.View view2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(android.app.Activity activity) {
            super(activity);
            p247y7.AbstractC7350t.f(activity, "activity");
            this.f57624h = true;
            this.f57625i = new z1.c.b.a(activity);
        }

        @Override // p252z1.c.C0763c
        public void b() {
            android.content.res.Resources.Theme theme = a().getTheme();
            p247y7.AbstractC7350t.e(theme, "activity.theme");
            c(theme, new android.util.TypedValue());
            ((android.view.ViewGroup) a().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f57625i);
        }

        public final boolean d(android.window.SplashScreenView splashScreenView) {
            p247y7.AbstractC7350t.f(splashScreenView, "child");
            android.view.WindowInsets windowInsetsBuild = p252z1.g.a().build();
            p247y7.AbstractC7350t.e(windowInsetsBuild, "Builder().build()");
            android.graphics.Rect rect = new android.graphics.Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void e(boolean z6) {
            this.f57624h = z6;
        }
    }

    /* JADX INFO: renamed from: z1.c$c, reason: collision with other inner class name */
    private static class C0763c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.app.Activity f57628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f57629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Integer f57630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Integer f57631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.graphics.drawable.Drawable f57632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f57633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private z1.c.d f57634g;

        public C0763c(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            this.f57628a = activity;
            this.f57634g = new z1.c.d() { // from class: z1.d
            };
        }

        public final android.app.Activity a() {
            return this.f57628a;
        }

        public void b() {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme theme = this.f57628a.getTheme();
            if (theme.resolveAttribute(p252z1.a.f57620d, typedValue, true)) {
                this.f57630c = java.lang.Integer.valueOf(typedValue.resourceId);
                this.f57631d = java.lang.Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(p252z1.a.f57619c, typedValue, true)) {
                this.f57632e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(p252z1.a.f57618b, typedValue, true)) {
                this.f57633f = typedValue.resourceId == p252z1.b.f57621a;
            }
            p247y7.AbstractC7350t.e(theme, "currentTheme");
            c(theme, typedValue);
        }

        protected final void c(android.content.res.Resources.Theme theme, android.util.TypedValue typedValue) {
            p247y7.AbstractC7350t.f(theme, "currentTheme");
            p247y7.AbstractC7350t.f(typedValue, "typedValue");
            if (theme.resolveAttribute(p252z1.a.f57617a, typedValue, true)) {
                int i6 = typedValue.resourceId;
                this.f57629b = i6;
                if (i6 != 0) {
                    this.f57628a.setTheme(i6);
                }
            }
        }
    }

    public interface d {
    }

    private c(android.app.Activity activity) {
        this.f57623a = android.os.Build.VERSION.SDK_INT >= 31 ? new z1.c.b(activity) : new p252z1.c.C0763c(activity);
    }

    public /* synthetic */ c(android.app.Activity activity, p247y7.AbstractC7342k abstractC7342k) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f57623a.b();
    }
}
