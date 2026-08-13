package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class R1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.R1 f19969a = new androidx.compose.ui.platform.R1();

    private R1() {
    }

    public final void a(androidx.compose.ui.platform.r rVar) {
        android.view.ViewParent parent = rVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(rVar, rVar);
        }
    }
}
