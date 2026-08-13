package S0;

/* JADX INFO: loaded from: classes.dex */
class A implements S0.InterfaceInputConnectionC1617z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f12261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.inputmethod.InputConnection f12262b;

    public A(android.view.inputmethod.InputConnection inputConnection, p237x7.l lVar) {
        this.f12261a = lVar;
        this.f12262b = inputConnection;
    }

    @Override // S0.InterfaceInputConnectionC1617z
    public final void a() {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f12262b = null;
        }
    }

    protected void b(android.view.inputmethod.InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    protected final android.view.inputmethod.InputConnection c() {
        return this.f12262b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f12262b != null) {
            a();
            this.f12261a.l(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i6, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i6, int i10) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i6, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i6);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getSelectedText(int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int i6, int i10) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i6, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int i6, int i10) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i6, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i6, int i10) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i6, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i6) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i6, int i10) {
        android.view.inputmethod.InputConnection inputConnection = this.f12262b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i6, i10);
        }
        return false;
    }
}
