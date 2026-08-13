package P0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i6, int i10, int i11, int i12, int i13, java.lang.CharSequence charSequence, int i14, int i15, boolean z6, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i14)) != layout.getLineCount() - 1 || !N0.n0.m(layout, lineForOffset)) {
            return;
        }
        float fA = P0.d.a(layout, lineForOffset, paint) + P0.d.c(layout, lineForOffset, paint);
        if (fA == 0.0f) {
            return;
        }
        p247y7.AbstractC7350t.c(canvas);
        canvas.translate(fA, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z6) {
        return 0;
    }
}
