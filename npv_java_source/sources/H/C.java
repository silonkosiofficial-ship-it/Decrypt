package H;

/* JADX INFO: loaded from: classes.dex */
public enum C {
    Cut(android.R.string.cut),
    Copy(android.R.string.copy),
    Paste(android.R.string.paste),
    SelectAll(android.R.string.selectAll);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f3651C;

    C(int i6) {
        this.f3651C = i6;
    }

    public final java.lang.String g(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-309609081, i6, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        java.lang.String strA = I0.d.a(this.f3651C, interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return strA;
    }
}
