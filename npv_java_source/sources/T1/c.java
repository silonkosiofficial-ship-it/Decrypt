package T1;

/* JADX INFO: loaded from: classes.dex */
final class c extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.TextView f12902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T1.c.a f12903b;

    public static class a {
        public boolean a(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i6, int i10, boolean z6) {
            return androidx.emoji2.text.f.h(inputConnection, editable, i6, i10, z6);
        }

        public void b(android.view.inputmethod.EditorInfo editorInfo) {
            if (androidx.emoji2.text.f.k()) {
                androidx.emoji2.text.f.c().x(editorInfo);
            }
        }
    }

    c(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new T1.c.a());
    }

    c(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, T1.c.a aVar) {
        super(inputConnection, false);
        this.f12902a = textView;
        this.f12903b = aVar;
        aVar.b(editorInfo);
    }

    private android.text.Editable b() {
        return this.f12902a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i6, int i10) {
        return this.f12903b.a(this, b(), i6, i10, false) || super.deleteSurroundingText(i6, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        return this.f12903b.a(this, b(), i6, i10, true) || super.deleteSurroundingTextInCodePoints(i6, i10);
    }
}
