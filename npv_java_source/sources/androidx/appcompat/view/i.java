package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements android.view.Window.Callback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final android.view.Window.Callback f17723C;

    static class a {
        static boolean a(android.view.Window.Callback callback, android.view.SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static android.view.ActionMode b(android.view.Window.Callback callback, android.view.ActionMode.Callback callback2, int i6) {
            return callback.onWindowStartingActionMode(callback2, i6);
        }
    }

    static class b {
        static void a(android.view.Window.Callback callback, java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i6) {
            callback.onProvideKeyboardShortcuts(list, menu, i6);
        }
    }

    static class c {
        static void a(android.view.Window.Callback callback, boolean z6) {
            callback.onPointerCaptureChanged(z6);
        }
    }

    public i(android.view.Window.Callback callback) {
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("Window callback may not be null");
        }
        this.f17723C = callback;
    }

    public final android.view.Window.Callback a() {
        return this.f17723C;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.f17723C.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f17723C.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.f17723C.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f17723C.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f17723C.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.f17723C.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.f17723C.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.f17723C.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f17723C.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, android.view.Menu menu) {
        return this.f17723C.onCreatePanelMenu(i6, menu);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i6) {
        return this.f17723C.onCreatePanelView(i6);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f17723C.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, android.view.MenuItem menuItem) {
        return this.f17723C.onMenuItemSelected(i6, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i6, android.view.Menu menu) {
        return this.f17723C.onMenuOpened(i6, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i6, android.view.Menu menu) {
        this.f17723C.onPanelClosed(i6, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z6) {
        androidx.appcompat.view.i.c.a(this.f17723C, z6);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i6, android.view.View view, android.view.Menu menu) {
        return this.f17723C.onPreparePanel(i6, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i6) {
        androidx.appcompat.view.i.b.a(this.f17723C, list, menu, i6);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f17723C.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return androidx.appcompat.view.i.a.a(this.f17723C, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.f17723C.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        this.f17723C.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i6) {
        return androidx.appcompat.view.i.a.b(this.f17723C, callback, i6);
    }
}
