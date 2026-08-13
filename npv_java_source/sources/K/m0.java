package K;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements K.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f5866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5867b = p087i7.AbstractC6669o.a(p087i7.r.NONE, new K.m0.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.L f5868c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.inputmethod.InputMethodManager b() {
            java.lang.Object systemService = K.m0.this.f5866a.getContext().getSystemService("input_method");
            p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    }

    public m0(android.view.View view) {
        this.f5866a = view;
        this.f5868c = new androidx.core.view.L(view);
    }

    private final android.view.inputmethod.InputMethodManager b() {
        return (android.view.inputmethod.InputMethodManager) this.f5867b.getValue();
    }

    @Override // K.l0
    public boolean f() {
        return b().isActive(this.f5866a);
    }

    @Override // K.l0
    public void g(int i6, android.view.inputmethod.ExtractedText extractedText) {
        b().updateExtractedText(this.f5866a, i6, extractedText);
    }

    @Override // K.l0
    public void h(int i6, int i10, int i11, int i12) {
        b().updateSelection(this.f5866a, i6, i10, i11, i12);
    }

    @Override // K.l0
    public void i() {
        b().restartInput(this.f5866a);
    }

    @Override // K.l0
    public void j(android.view.inputmethod.CursorAnchorInfo cursorAnchorInfo) {
        b().updateCursorAnchorInfo(this.f5866a, cursorAnchorInfo);
    }

    @Override // K.l0
    public void k() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            K.C1283e.f5859a.a(b(), this.f5866a);
        }
    }
}
