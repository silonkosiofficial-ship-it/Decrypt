package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
class q implements androidx.compose.ui.window.n {
    @Override // androidx.compose.ui.window.n
    public void a(android.view.WindowManager windowManager, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // androidx.compose.ui.window.n
    public void b(android.view.View view, int i6, int i10) {
    }

    @Override // androidx.compose.ui.window.n
    public void c(android.view.View view, android.graphics.Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }
}
