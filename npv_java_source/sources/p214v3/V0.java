package p214v3;

/* JADX INFO: loaded from: classes.dex */
public class V0 extends p214v3.P0 {
    static final /* synthetic */ android.view.WindowInsets m(android.app.Activity activity, android.view.View view, android.view.WindowInsets windowInsets) {
        if (p174r3.v.s().j().j() == null) {
            android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            java.lang.String strConcat = "";
            if (displayCutout != null) {
                p214v3.InterfaceC7268s0 interfaceC7268s0J = p174r3.v.s().j();
                for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                    java.lang.String str = java.lang.String.format(java.util.Locale.US, "%d,%d,%d,%d", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
                    if (!android.text.TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                interfaceC7268s0J.D(strConcat);
            } else {
                p174r3.v.s().j().D("");
            }
        }
        n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void n(boolean z6, android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i6 = attributes.layoutInDisplayCutoutMode;
        int i10 = true != z6 ? 2 : 1;
        if (i10 != i6) {
            attributes.layoutInDisplayCutoutMode = i10;
            window.setAttributes(attributes);
        }
    }

    @Override // p214v3.AbstractC7234b
    public final int i(android.media.AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // p214v3.AbstractC7234b
    public final void j(final android.app.Activity activity) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25643o1)).booleanValue() && p174r3.v.s().j().j() == null && !activity.isInMultiWindowMode()) {
            n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(this) { // from class: v3.Q0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    return p214v3.V0.m(activity, view, windowInsets);
                }
            });
        }
    }
}
