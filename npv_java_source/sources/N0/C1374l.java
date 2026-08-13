package N0;

/* JADX INFO: renamed from: N0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1374l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C1374l f7584a = new N0.C1374l();

    private C1374l() {
    }

    public static final android.text.BoringLayout a(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i6, android.text.Layout.Alignment alignment, float f6, float f10, android.text.BoringLayout.Metrics metrics, boolean z6, android.text.TextUtils.TruncateAt truncateAt, int i10) {
        return new android.text.BoringLayout(charSequence, textPaint, i6, alignment, f6, f10, metrics, z6, truncateAt, i10);
    }

    public static final android.text.BoringLayout.Metrics b(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return android.text.BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
