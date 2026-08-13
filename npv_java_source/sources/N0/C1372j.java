package N0;

/* JADX INFO: renamed from: N0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1372j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C1372j f7578a = new N0.C1372j();

    private C1372j() {
    }

    public static final android.text.BoringLayout a(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i6, android.text.Layout.Alignment alignment, float f6, float f10, android.text.BoringLayout.Metrics metrics, boolean z6, boolean z10, android.text.TextUtils.TruncateAt truncateAt, int i10) {
        return N0.AbstractC1369g.a(charSequence, textPaint, i6, alignment, f6, f10, metrics, z6, truncateAt, i10, z10);
    }

    public static final android.text.BoringLayout.Metrics b(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic) {
        return android.text.BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean c(android.text.BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
