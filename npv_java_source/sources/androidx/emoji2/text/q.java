package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.emoji2.text.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static android.graphics.Paint f22342g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.text.TextPaint f22343f;

    public q(androidx.emoji2.text.p pVar) {
        super(pVar);
    }

    private android.text.TextPaint c(java.lang.CharSequence charSequence, int i6, int i10, android.graphics.Paint paint) {
        if (!(charSequence instanceof android.text.Spanned)) {
            if (paint instanceof android.text.TextPaint) {
                return (android.text.TextPaint) paint;
            }
            return null;
        }
        android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) ((android.text.Spanned) charSequence).getSpans(i6, i10, android.text.style.CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                android.text.TextPaint textPaint = this.f22343f;
                if (textPaint == null) {
                    textPaint = new android.text.TextPaint();
                    this.f22343f = textPaint;
                }
                textPaint.set(paint);
                for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof android.text.TextPaint) {
            return (android.text.TextPaint) paint;
        }
        return null;
    }

    private static android.graphics.Paint e() {
        if (f22342g == null) {
            android.text.TextPaint textPaint = new android.text.TextPaint();
            f22342g = textPaint;
            textPaint.setColor(androidx.emoji2.text.f.c().e());
            f22342g.setStyle(android.graphics.Paint.Style.FILL);
        }
        return f22342g;
    }

    void d(android.graphics.Canvas canvas, android.text.TextPaint textPaint, float f6, float f10, float f11, float f12) {
        int color = textPaint.getColor();
        android.graphics.Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawRect(f6, f11, f10, f12, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i6, int i10, float f6, int i11, int i12, int i13, android.graphics.Paint paint) {
        android.graphics.Paint paint2 = paint;
        android.text.TextPaint textPaintC = c(charSequence, i6, i10, paint2);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f6, f6 + b(), i11, i13);
        }
        if (androidx.emoji2.text.f.c().l()) {
            canvas.drawRect(f6, i11, f6 + b(), i13, e());
        }
        androidx.emoji2.text.p pVarA = a();
        float f10 = i12;
        if (textPaintC != null) {
            paint2 = textPaintC;
        }
        pVarA.a(canvas, f6, f10, paint2);
    }
}
