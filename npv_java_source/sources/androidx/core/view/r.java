package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.DisplayCutout f21769a;

    static class a {
        static android.view.DisplayCutout a(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
            return new android.view.DisplayCutout(rect, list);
        }

        static java.util.List<android.graphics.Rect> b(android.view.DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static android.view.DisplayCutout a(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, android.graphics.Insets insets2) {
            return new android.view.DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static android.graphics.Insets b(android.view.DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(android.view.DisplayCutout displayCutout) {
        this.f21769a = displayCutout;
    }

    static androidx.core.view.r f(android.view.DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new androidx.core.view.r(displayCutout);
    }

    public int a() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.r.a.c(this.f21769a);
        }
        return 0;
    }

    public int b() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.r.a.d(this.f21769a);
        }
        return 0;
    }

    public int c() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.r.a.e(this.f21769a);
        }
        return 0;
    }

    public int d() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.r.a.f(this.f21769a);
        }
        return 0;
    }

    public androidx.core.graphics.f e() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.f.d(androidx.core.view.r.b.b(this.f21769a)) : androidx.core.graphics.f.f21549e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.core.view.r.class != obj.getClass()) {
            return false;
        }
        return B1.c.a(this.f21769a, ((androidx.core.view.r) obj).f21769a);
    }

    public int hashCode() {
        android.view.DisplayCutout displayCutout = this.f21769a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.f21769a + "}";
    }
}
