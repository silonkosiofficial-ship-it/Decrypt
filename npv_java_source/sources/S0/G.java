package S0;

/* JADX INFO: loaded from: classes.dex */
class G extends S0.E {
    public G(android.view.inputmethod.InputConnection inputConnection, p237x7.l lVar) {
        super(inputConnection, lVar);
    }

    @Override // S0.A, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i6, android.os.Bundle bundle) {
        android.view.inputmethod.InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.commitContent(inputContentInfo, i6, bundle);
        }
        return false;
    }
}
