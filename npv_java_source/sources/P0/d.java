package P0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8237a;

        static {
            int[] iArr = new int[android.text.Layout.Alignment.values().length];
            try {
                iArr[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            f8237a = iArr;
        }
    }

    public static final float a(android.text.Layout layout, int i6, android.graphics.Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i6);
        if (!N0.n0.m(layout, i6) || layout.getParagraphDirection(i6) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i6) + layout.getEllipsisStart(i6)) - lineLeft) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i6);
        if ((paragraphAlignment == null ? -1 : P0.d.a.f8237a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = java.lang.Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = java.lang.Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float b(android.text.Layout layout, int i6, android.graphics.Paint paint, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i6, paint);
    }

    public static final float c(android.text.Layout layout, int i6, android.graphics.Paint paint) {
        float width;
        float width2;
        if (!N0.n0.m(layout, i6)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i6) != -1 || layout.getWidth() >= layout.getLineRight(i6)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i6) - layout.getPrimaryHorizontal(layout.getLineStart(i6) + layout.getEllipsisStart(i6))) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i6);
        if ((paragraphAlignment != null ? P0.d.a.f8237a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i6);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i6);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(android.text.Layout layout, int i6, android.graphics.Paint paint, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i6, paint);
    }
}
