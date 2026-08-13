package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.core.view.H {
    private static java.lang.CharSequence b(android.content.Context context, android.content.ClipData.Item item, int i6) {
        if ((i6 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        java.lang.CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof android.text.Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    private static void c(android.text.Editable editable, java.lang.CharSequence charSequence) {
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        int iMax = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
        int iMax2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
        android.text.Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.H
    public androidx.core.view.C1996d a(android.view.View view, androidx.core.view.C1996d c1996d) {
        if (android.util.Log.isLoggable("ReceiveContent", 3)) {
            java.lang.String str = "onReceive: " + c1996d;
        }
        if (c1996d.d() == 2) {
            return c1996d;
        }
        android.content.ClipData clipDataB = c1996d.b();
        int iC = c1996d.c();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Editable editable = (android.text.Editable) textView.getText();
        android.content.Context context = textView.getContext();
        boolean z6 = false;
        for (int i6 = 0; i6 < clipDataB.getItemCount(); i6++) {
            java.lang.CharSequence charSequenceB = b(context, clipDataB.getItemAt(i6), iC);
            if (charSequenceB != null) {
                if (z6) {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), "\n");
                    editable.insert(android.text.Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
