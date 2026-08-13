package T1;

/* JADX INFO: loaded from: classes.dex */
final class e implements android.text.method.KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.text.method.KeyListener f12908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T1.e.a f12909b;

    public static class a {
        public boolean a(android.text.Editable editable, int i6, android.view.KeyEvent keyEvent) {
            return androidx.emoji2.text.f.i(editable, i6, keyEvent);
        }
    }

    e(android.text.method.KeyListener keyListener) {
        this(keyListener, new T1.e.a());
    }

    e(android.text.method.KeyListener keyListener, T1.e.a aVar) {
        this.f12908a = keyListener;
        this.f12909b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(android.view.View view, android.text.Editable editable, int i6) {
        this.f12908a.clearMetaKeyState(view, editable, i6);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f12908a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(android.view.View view, android.text.Editable editable, int i6, android.view.KeyEvent keyEvent) {
        return this.f12909b.a(editable, i6, keyEvent) || this.f12908a.onKeyDown(view, editable, i6, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(android.view.View view, android.text.Editable editable, android.view.KeyEvent keyEvent) {
        return this.f12908a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(android.view.View view, android.text.Editable editable, int i6, android.view.KeyEvent keyEvent) {
        return this.f12908a.onKeyUp(view, editable, i6, keyEvent);
    }
}
