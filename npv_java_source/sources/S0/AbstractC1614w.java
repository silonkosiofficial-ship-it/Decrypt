package S0;

/* JADX INFO: renamed from: S0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1614w {
    public static final android.view.inputmethod.ExtractedText a(S0.V v6) {
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
