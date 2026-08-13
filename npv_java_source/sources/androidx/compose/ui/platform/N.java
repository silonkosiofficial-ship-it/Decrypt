package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.N f19887a = new androidx.compose.ui.platform.N();

    private N() {
    }

    public final void a(android.view.View view, p251z0.InterfaceC7386w interfaceC7386w) {
        android.view.PointerIcon systemIcon = interfaceC7386w instanceof p251z0.C7365a ? android.view.PointerIcon.getSystemIcon(view.getContext(), ((p251z0.C7365a) interfaceC7386w).a()) : android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (p247y7.AbstractC7350t.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
