package K;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.inputmethod.ExtractedText b(S0.V v6) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        extractedText.text = v6.i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = v6.i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = M0.N.l(v6.h());
        extractedText.selectionEnd = M0.N.k(v6.h());
        extractedText.flags = !S8.r.b0(v6.i(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
