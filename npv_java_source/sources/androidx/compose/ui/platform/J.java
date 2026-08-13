package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.J f19870a = new androidx.compose.ui.platform.J();

    private J() {
    }

    public final void a(android.view.View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(android.view.View view) {
        view.setViewTranslationCallback(androidx.compose.ui.platform.G.a(androidx.compose.ui.platform.F.f19861a));
    }
}
