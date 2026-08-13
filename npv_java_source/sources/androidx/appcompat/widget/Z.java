package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Z extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f18404c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.util.ArrayList f18405d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.Resources f18406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.Resources.Theme f18407b;

    private Z(android.content.Context context) {
        super(context);
        if (!androidx.appcompat.widget.m0.c()) {
            this.f18406a = new androidx.appcompat.widget.b0(this, context.getResources());
            this.f18407b = null;
            return;
        }
        androidx.appcompat.widget.m0 m0Var = new androidx.appcompat.widget.m0(this, context.getResources());
        this.f18406a = m0Var;
        android.content.res.Resources.Theme themeNewTheme = m0Var.newTheme();
        this.f18407b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(android.content.Context context) {
        if ((context instanceof androidx.appcompat.widget.Z) || (context.getResources() instanceof androidx.appcompat.widget.b0) || (context.getResources() instanceof androidx.appcompat.widget.m0)) {
            return false;
        }
        return androidx.appcompat.widget.m0.c();
    }

    public static android.content.Context b(android.content.Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f18404c) {
            try {
                java.util.ArrayList arrayList = f18405d;
                if (arrayList == null) {
                    f18405d = new java.util.ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f18405d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f18405d.remove(size);
                        }
                    }
                    for (int size2 = f18405d.size() - 1; size2 >= 0; size2--) {
                        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) f18405d.get(size2);
                        androidx.appcompat.widget.Z z6 = weakReference2 != null ? (androidx.appcompat.widget.Z) weakReference2.get() : null;
                        if (z6 != null && z6.getBaseContext() == context) {
                            return z6;
                        }
                    }
                }
                androidx.appcompat.widget.Z z10 = new androidx.appcompat.widget.Z(context);
                f18405d.add(new java.lang.ref.WeakReference(z10));
                return z10;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return this.f18406a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.f18406a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.f18407b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        android.content.res.Resources.Theme theme = this.f18407b;
        if (theme == null) {
            super.setTheme(i6);
        } else {
            theme.applyStyle(i6, true);
        }
    }
}
