package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1950k implements androidx.compose.ui.platform.InterfaceC1957m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.ClipboardManager f20143a;

    public C1950k(android.content.ClipboardManager clipboardManager) {
        this.f20143a = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1950k(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("clipboard");
        p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((android.content.ClipboardManager) systemService);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1957m0
    public M0.C1332d a() {
        android.content.ClipData primaryClip = this.f20143a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
        return androidx.compose.ui.platform.AbstractC1953l.a(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1957m0
    public void b(M0.C1332d c1332d) {
        this.f20143a.setPrimaryClip(android.content.ClipData.newPlainText("plain text", androidx.compose.ui.platform.AbstractC1953l.b(c1332d)));
    }

    @Override // androidx.compose.ui.platform.InterfaceC1957m0
    public boolean c() {
        android.content.ClipDescription primaryClipDescription = this.f20143a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
