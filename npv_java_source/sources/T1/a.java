package T1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T1.a.b f12894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12895b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12896c = 0;

    /* JADX INFO: renamed from: T1.a$a, reason: collision with other inner class name */
    private static class C0274a extends T1.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.widget.EditText f12897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T1.g f12898b;

        C0274a(android.widget.EditText editText, boolean z6) {
            this.f12897a = editText;
            T1.g gVar = new T1.g(editText, z6);
            this.f12898b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(T1.b.getInstance());
        }

        @Override // T1.a.b
        android.text.method.KeyListener a(android.text.method.KeyListener keyListener) {
            if (keyListener instanceof T1.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof android.text.method.NumberKeyListener ? keyListener : new T1.e(keyListener);
        }

        @Override // T1.a.b
        android.view.inputmethod.InputConnection b(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
            return inputConnection instanceof T1.c ? inputConnection : new T1.c(this.f12897a, inputConnection, editorInfo);
        }

        @Override // T1.a.b
        void c(boolean z6) {
            this.f12898b.c(z6);
        }
    }

    static class b {
        b() {
        }

        abstract android.text.method.KeyListener a(android.text.method.KeyListener keyListener);

        abstract android.view.inputmethod.InputConnection b(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo);

        abstract void c(boolean z6);
    }

    public a(android.widget.EditText editText, boolean z6) {
        B1.i.h(editText, "editText cannot be null");
        this.f12894a = new T1.a.C0274a(editText, z6);
    }

    public android.text.method.KeyListener a(android.text.method.KeyListener keyListener) {
        return this.f12894a.a(keyListener);
    }

    public android.view.inputmethod.InputConnection b(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f12894a.b(inputConnection, editorInfo);
    }

    public void c(boolean z6) {
        this.f12894a.c(z6);
    }
}
