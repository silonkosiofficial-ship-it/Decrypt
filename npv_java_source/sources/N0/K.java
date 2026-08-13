package N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static final int a(android.text.Layout layout, int i6, boolean z6) {
        if (i6 <= 0) {
            return 0;
        }
        if (i6 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i6);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i6 && lineEnd != i6) {
            return lineForOffset;
        }
        if (lineStart == i6) {
            return z6 ? lineForOffset - 1 : lineForOffset;
        }
        return z6 ? lineForOffset : lineForOffset + 1;
    }
}
