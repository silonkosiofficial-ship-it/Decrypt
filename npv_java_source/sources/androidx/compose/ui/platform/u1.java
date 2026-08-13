package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.u1 f20334a = new androidx.compose.ui.platform.u1();

    private u1() {
    }

    public final void a(android.view.ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final android.view.ActionMode b(android.view.View view, android.view.ActionMode.Callback callback, int i6) {
        return view.startActionMode(callback, i6);
    }
}
