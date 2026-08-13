package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.B f19814a = new androidx.compose.ui.platform.B();

    private B() {
    }

    public final void a(android.view.ViewStructure viewStructure, android.view.View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
