package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.window.e f20629a = new androidx.compose.ui.window.e();

    private e() {
    }

    public static final android.window.OnBackInvokedCallback b(final p237x7.a aVar) {
        return new android.window.OnBackInvokedCallback() { // from class: androidx.compose.ui.window.d
            public final void onBackInvoked() {
                androidx.compose.ui.window.e.c(aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p237x7.a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public static final void d(android.view.View view, java.lang.Object obj) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof android.window.OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) obj);
    }

    public static final void e(android.view.View view, java.lang.Object obj) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof android.window.OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj);
    }
}
