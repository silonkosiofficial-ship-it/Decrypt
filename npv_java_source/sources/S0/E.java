package S0;

/* JADX INFO: loaded from: classes.dex */
class E extends S0.A {
    public E(android.view.inputmethod.InputConnection inputConnection, p237x7.l lVar) {
        super(inputConnection, lVar);
    }

    @Override // S0.A
    protected final void b(android.view.inputmethod.InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // S0.A, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        android.view.inputmethod.InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.deleteSurroundingTextInCodePoints(i6, i10);
        }
        return false;
    }

    @Override // S0.A, android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        android.view.inputmethod.InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.getHandler();
        }
        return null;
    }
}
