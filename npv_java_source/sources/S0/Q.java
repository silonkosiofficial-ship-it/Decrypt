package S0;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0.InterfaceC1611t f12273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private S0.V f12276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f12279g = new java.util.ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12280h = true;

    public Q(S0.V v6, S0.InterfaceC1611t interfaceC1611t, boolean z6) {
        this.f12273a = interfaceC1611t;
        this.f12274b = z6;
        this.f12276d = v6;
    }

    private final void b(S0.InterfaceC1601i interfaceC1601i) {
        c();
        try {
            this.f12279g.add(interfaceC1601i);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f12275c++;
        return true;
    }

    private final boolean d() {
        int i6 = this.f12275c - 1;
        this.f12275c = i6;
        if (i6 == 0 && (!this.f12279g.isEmpty())) {
            this.f12273a.d(p097j7.AbstractC6879v.W0(this.f12279g));
            this.f12279g.clear();
        }
        return this.f12275c > 0;
    }

    private final void e(int i6) {
        sendKeyEvent(new android.view.KeyEvent(0, i6));
        sendKeyEvent(new android.view.KeyEvent(1, i6));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z6 = this.f12280h;
        return z6 ? c() : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i6) {
        boolean z6 = this.f12280h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f12279g.clear();
        this.f12275c = 0;
        this.f12280h = false;
        this.f12273a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        boolean z6 = this.f12280h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i6, android.os.Bundle bundle) {
        boolean z6 = this.f12280h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z6 = this.f12280h;
        return z6 ? this.f12274b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i6) {
        boolean z6 = this.f12280h;
        if (z6) {
            b(new S0.C1593a(java.lang.String.valueOf(charSequence), i6));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i6, int i10) {
        boolean z6 = this.f12280h;
        if (!z6) {
            return z6;
        }
        b(new S0.C1599g(i6, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        boolean z6 = this.f12280h;
        if (!z6) {
            return z6;
        }
        b(new S0.C1600h(i6, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    public final void f(S0.V v6) {
        this.f12276d = v6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z6 = this.f12280h;
        if (!z6) {
            return z6;
        }
        b(new S0.C1606n());
        return true;
    }

    public final void g(S0.V v6, S0.InterfaceC1612u interfaceC1612u) {
        if (this.f12280h) {
            f(v6);
            if (this.f12278f) {
                interfaceC1612u.g(this.f12277e, S0.AbstractC1614w.a(v6));
            }
            M0.N nG = v6.g();
            int iL = nG != null ? M0.N.l(nG.r()) : -1;
            M0.N nG2 = v6.g();
            interfaceC1612u.h(M0.N.l(v6.h()), M0.N.k(v6.h()), iL, nG2 != null ? M0.N.k(nG2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i6) {
        return android.text.TextUtils.getCapsMode(this.f12276d.i(), M0.N.l(this.f12276d.h()), i6);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i6) {
        boolean z6 = (i6 & 1) != 0;
        this.f12278f = z6;
        if (z6) {
            this.f12277e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return S0.AbstractC1614w.a(this.f12276d);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getSelectedText(int i6) {
        if (M0.N.h(this.f12276d.h())) {
            return null;
        }
        return S0.W.a(this.f12276d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int i6, int i10) {
        return S0.W.b(this.f12276d, i6).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int i6, int i10) {
        return S0.W.c(this.f12276d, i6).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i6) {
        int i10;
        boolean z6 = this.f12280h;
        if (z6) {
            z6 = false;
            switch (i6) {
                case android.R.id.selectAll:
                    b(new S0.U(0, this.f12276d.i().length()));
                    break;
                case android.R.id.cut:
                    i10 = 277;
                    e(i10);
                    break;
                case android.R.id.copy:
                    i10 = 278;
                    e(i10);
                    break;
                case android.R.id.paste:
                    i10 = 279;
                    e(i10);
                    break;
            }
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i6) {
        int iA;
        boolean z6 = this.f12280h;
        if (!z6) {
            return z6;
        }
        if (i6 != 0) {
            switch (i6) {
                case 2:
                    iA = S0.r.f12375b.c();
                    break;
                case 3:
                    iA = S0.r.f12375b.g();
                    break;
                case 4:
                    iA = S0.r.f12375b.h();
                    break;
                case 5:
                    iA = S0.r.f12375b.d();
                    break;
                case 6:
                    iA = S0.r.f12375b.b();
                    break;
                case 7:
                    iA = S0.r.f12375b.f();
                    break;
                default:
                    java.lang.String str = "IME sends unsupported Editor Action: " + i6;
                    iA = S0.r.f12375b.a();
                    break;
            }
        } else {
            iA = S0.r.f12375b.a();
        }
        this.f12273a.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z6 = this.f12280h;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i6) {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = this.f12280h;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i6 & 1) != 0;
        boolean z16 = (i6 & 2) != 0;
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            boolean z17 = (i6 & 16) != 0;
            boolean z18 = (i6 & 8) != 0;
            boolean z19 = (i6 & 4) != 0;
            if (i10 >= 34 && (i6 & 32) != 0) {
                z14 = true;
            }
            if (z17 || z18 || z19 || z14) {
                z10 = z14;
                z6 = z19;
                z12 = z18;
                z11 = z17;
            } else if (i10 >= 34) {
                z11 = true;
                z12 = true;
                z6 = true;
                z10 = true;
            } else {
                z10 = z14;
                z11 = true;
                z12 = true;
                z6 = true;
            }
        } else {
            z6 = false;
            z10 = false;
            z11 = true;
            z12 = true;
        }
        this.f12273a.b(z15, z16, z11, z12, z6, z10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z6 = this.f12280h;
        if (!z6) {
            return z6;
        }
        this.f12273a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i6, int i10) {
        boolean z6 = this.f12280h;
        if (z6) {
            b(new S0.S(i6, i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i6) {
        boolean z6 = this.f12280h;
        if (z6) {
            b(new S0.T(java.lang.String.valueOf(charSequence), i6));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i6, int i10) {
        boolean z6 = this.f12280h;
        if (!z6) {
            return z6;
        }
        b(new S0.U(i6, i10));
        return true;
    }
}
