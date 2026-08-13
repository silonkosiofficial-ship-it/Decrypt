package N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final float c(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        p087i7.u uVar;
        java.text.BreakIterator lineInstance = java.text.BreakIterator.getLineInstance(textPaint.getTextLocale());
        int next = 0;
        lineInstance.setText(new N0.H(charSequence, 0, charSequence.length()));
        java.util.PriorityQueue<p087i7.u> priorityQueue = new java.util.PriorityQueue(10, new java.util.Comparator() { // from class: N0.N
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return N0.O.d((p087i7.u) obj, (p087i7.u) obj2);
            }
        });
        while (true) {
            int i6 = next;
            next = lineInstance.next();
            if (next == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                uVar = new p087i7.u(java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(next));
            } else {
                p087i7.u uVar2 = (p087i7.u) priorityQueue.peek();
                if (uVar2 != null && ((java.lang.Number) uVar2.d()).intValue() - ((java.lang.Number) uVar2.c()).intValue() < next - i6) {
                    priorityQueue.poll();
                    uVar = new p087i7.u(java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(next));
                }
            }
            priorityQueue.add(uVar);
        }
        float fMax = 0.0f;
        for (p087i7.u uVar3 : priorityQueue) {
            fMax = java.lang.Math.max(fMax, android.text.Layout.getDesiredWidth(charSequence, ((java.lang.Number) uVar3.a()).intValue(), ((java.lang.Number) uVar3.b()).intValue(), textPaint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(p087i7.u uVar, p087i7.u uVar2) {
        return (((java.lang.Number) uVar.d()).intValue() - ((java.lang.Number) uVar.c()).intValue()) - (((java.lang.Number) uVar2.d()).intValue() - ((java.lang.Number) uVar2.c()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final boolean e(float f6, java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        if (f6 != 0.0f) {
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (!N0.T.a(spanned, P0.f.class) && !N0.T.a(spanned, P0.e.class)) {
                    if (textPaint.getLetterSpacing() == 0.0f) {
                    }
                }
            } else if (textPaint.getLetterSpacing() == 0.0f) {
            }
            return true;
        }
        return false;
    }
}
