package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class d extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static android.content.res.Configuration f17654f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.Resources.Theme f17656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.LayoutInflater f17657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.content.res.Configuration f17658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.content.res.Resources f17659e;

    static class a {
        static android.content.Context a(androidx.appcompat.view.d dVar, android.content.res.Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(android.content.Context context, int i6) {
        super(context);
        this.f17655a = i6;
    }

    public d(android.content.Context context, android.content.res.Resources.Theme theme) {
        super(context);
        this.f17656b = theme;
    }

    private android.content.res.Resources a() {
        if (this.f17659e == null) {
            android.content.res.Configuration configuration = this.f17658d;
            this.f17659e = (configuration == null || (android.os.Build.VERSION.SDK_INT >= 26 && d(configuration))) ? super.getResources() : androidx.appcompat.view.d.a.a(this, this.f17658d).getResources();
        }
        return this.f17659e;
    }

    private void c() {
        boolean z6 = this.f17656b == null;
        if (z6) {
            this.f17656b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17656b.setTo(theme);
            }
        }
        e(this.f17656b, this.f17655a, z6);
    }

    private static boolean d(android.content.res.Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f17654f == null) {
            android.content.res.Configuration configuration2 = new android.content.res.Configuration();
            configuration2.fontScale = 0.0f;
            f17654f = configuration2;
        }
        return configuration.equals(f17654f);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f17655a;
    }

    protected void e(android.content.res.Resources.Theme theme, int i6, boolean z6) {
        theme.applyStyle(i6, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f17657c == null) {
            this.f17657c = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f17657c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.f17656b;
        if (theme != null) {
            return theme;
        }
        if (this.f17655a == 0) {
            this.f17655a = p090j.i.f48793c;
        }
        c();
        return this.f17656b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        if (this.f17655a != i6) {
            this.f17655a = i6;
            c();
        }
    }
}
