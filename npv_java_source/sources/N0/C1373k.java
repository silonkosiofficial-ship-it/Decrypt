package N0;

/* JADX INFO: renamed from: N0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1373k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C1373k f7582a = new N0.C1373k();

    private C1373k() {
    }

    public final android.text.BoringLayout a(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i6, android.text.BoringLayout.Metrics metrics, android.text.Layout.Alignment alignment, boolean z6, boolean z10, android.text.TextUtils.TruncateAt truncateAt, int i10) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("negative width".toString());
        }
        if (i10 >= 0) {
            return android.os.Build.VERSION.SDK_INT >= 33 ? N0.C1372j.a(charSequence, textPaint, i6, alignment, 1.0f, 0.0f, metrics, z6, z10, truncateAt, i10) : N0.C1374l.a(charSequence, textPaint, i6, alignment, 1.0f, 0.0f, metrics, z6, truncateAt, i10);
        }
        throw new java.lang.IllegalArgumentException("negative ellipsized width".toString());
    }

    public final boolean b(android.text.BoringLayout boringLayout) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return N0.C1372j.c(boringLayout);
        }
        return false;
    }

    public final android.text.BoringLayout.Metrics c(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic) {
        return android.os.Build.VERSION.SDK_INT >= 33 ? N0.C1372j.b(charSequence, textPaint, textDirectionHeuristic) : N0.C1374l.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
