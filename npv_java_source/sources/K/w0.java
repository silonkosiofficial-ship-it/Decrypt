package K;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K.k0 f5924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H.C1230w f5926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N.F f5927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.compose.ui.platform.A1 f5928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private S0.V f5930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f5933j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5934k = true;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(S0.InterfaceC1601i interfaceC1601i) {
            K.w0.this.c(interfaceC1601i);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((S0.InterfaceC1601i) obj);
            return p087i7.M.f46721a;
        }
    }

    public w0(S0.V v6, K.k0 k0Var, boolean z6, H.C1230w c1230w, N.F f6, androidx.compose.ui.platform.A1 a6) {
        this.f5924a = k0Var;
        this.f5925b = z6;
        this.f5926c = c1230w;
        this.f5927d = f6;
        this.f5928e = a6;
        this.f5930g = v6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(S0.InterfaceC1601i interfaceC1601i) {
        d();
        try {
            this.f5933j.add(interfaceC1601i);
        } finally {
            e();
        }
    }

    private final boolean d() {
        this.f5929f++;
        return true;
    }

    private final boolean e() {
        int i6 = this.f5929f - 1;
        this.f5929f = i6;
        if (i6 == 0 && (!this.f5933j.isEmpty())) {
            this.f5924a.d(p097j7.AbstractC6879v.W0(this.f5933j));
            this.f5933j.clear();
        }
        return this.f5929f > 0;
    }

    private final void f(int i6) {
        sendKeyEvent(new android.view.KeyEvent(0, i6));
        sendKeyEvent(new android.view.KeyEvent(1, i6));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z6 = this.f5934k;
        return z6 ? d() : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i6) {
        boolean z6 = this.f5934k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f5933j.clear();
        this.f5929f = 0;
        this.f5934k = false;
        this.f5924a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        boolean z6 = this.f5934k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i6, android.os.Bundle bundle) {
        boolean z6 = this.f5934k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z6 = this.f5934k;
        return z6 ? this.f5925b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i6) {
        boolean z6 = this.f5934k;
        if (z6) {
            c(new S0.C1593a(java.lang.String.valueOf(charSequence), i6));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i6, int i10) {
        boolean z6 = this.f5934k;
        if (!z6) {
            return z6;
        }
        c(new S0.C1599g(i6, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        boolean z6 = this.f5934k;
        if (!z6) {
            return z6;
        }
        c(new S0.C1600h(i6, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z6 = this.f5934k;
        if (!z6) {
            return z6;
        }
        c(new S0.C1606n());
        return true;
    }

    public final void g(S0.V v6) {
        this.f5930g = v6;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i6) {
        return android.text.TextUtils.getCapsMode(this.f5930g.i(), M0.N.l(this.f5930g.h()), i6);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i6) {
        boolean z6 = (i6 & 1) != 0;
        this.f5932i = z6;
        if (z6) {
            this.f5931h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return K.x0.b(this.f5930g);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getSelectedText(int i6) {
        if (M0.N.h(this.f5930g.h())) {
            return null;
        }
        return S0.W.a(this.f5930g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int i6, int i10) {
        return S0.W.b(this.f5930g, i6).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int i6, int i10) {
        return S0.W.c(this.f5930g, i6).toString();
    }

    public final void h(S0.V v6, K.l0 l0Var) {
        if (this.f5934k) {
            g(v6);
            if (this.f5932i) {
                l0Var.g(this.f5931h, K.x0.b(v6));
            }
            M0.N nG = v6.g();
            int iL = nG != null ? M0.N.l(nG.r()) : -1;
            M0.N nG2 = v6.g();
            l0Var.h(M0.N.l(v6.h()), M0.N.k(v6.h()), iL, nG2 != null ? M0.N.k(nG2.r()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i6) {
        int i10;
        boolean z6 = this.f5934k;
        if (z6) {
            z6 = false;
            switch (i6) {
                case android.R.id.selectAll:
                    c(new S0.U(0, this.f5930g.i().length()));
                    break;
                case android.R.id.cut:
                    i10 = 277;
                    f(i10);
                    break;
                case android.R.id.copy:
                    i10 = 278;
                    f(i10);
                    break;
                case android.R.id.paste:
                    i10 = 279;
                    f(i10);
                    break;
            }
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i6) {
        int iA;
        boolean z6 = this.f5934k;
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
        this.f5924a.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            K.C1281c.f5858a.b(this.f5926c, this.f5927d, handwritingGesture, this.f5928e, executor, intConsumer, new K.w0.a());
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z6 = this.f5934k;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return K.C1281c.f5858a.d(this.f5926c, this.f5927d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
        boolean z13 = this.f5934k;
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
        this.f5924a.b(z15, z16, z11, z12, z6, z10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z6 = this.f5934k;
        if (!z6) {
            return z6;
        }
        this.f5924a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i6, int i10) {
        boolean z6 = this.f5934k;
        if (z6) {
            c(new S0.S(i6, i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i6) {
        boolean z6 = this.f5934k;
        if (z6) {
            c(new S0.T(java.lang.String.valueOf(charSequence), i6));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i6, int i10) {
        boolean z6 = this.f5934k;
        if (!z6) {
            return z6;
        }
        c(new S0.U(i6, i10));
        return true;
    }
}
