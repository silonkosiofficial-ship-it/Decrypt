package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class F implements android.view.translation.ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.F f19861a = new androidx.compose.ui.platform.F();

    private F() {
    }

    public boolean onClearTranslation(android.view.View view) {
        p247y7.AbstractC7350t.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((androidx.compose.ui.platform.r) view).getContentCaptureManager$ui_release().r();
        return true;
    }

    public boolean onHideTranslation(android.view.View view) {
        p247y7.AbstractC7350t.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((androidx.compose.ui.platform.r) view).getContentCaptureManager$ui_release().t();
        return true;
    }

    public boolean onShowTranslation(android.view.View view) {
        p247y7.AbstractC7350t.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((androidx.compose.ui.platform.r) view).getContentCaptureManager$ui_release().w();
        return true;
    }
}
