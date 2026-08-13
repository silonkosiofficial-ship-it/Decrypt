package S0;

/* JADX INFO: renamed from: S0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1613v implements S0.InterfaceC1612u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f12394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f12395b = p087i7.AbstractC6669o.a(p087i7.r.NONE, new S0.C1613v.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.L f12396c;

    /* JADX INFO: renamed from: S0.v$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.inputmethod.InputMethodManager b() {
            java.lang.Object systemService = S0.C1613v.this.f12394a.getContext().getSystemService("input_method");
            p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    }

    public C1613v(android.view.View view) {
        this.f12394a = view;
        this.f12396c = new androidx.core.view.L(view);
    }

    private final android.view.inputmethod.InputMethodManager d() {
        return (android.view.inputmethod.InputMethodManager) this.f12395b.getValue();
    }

    @Override // S0.InterfaceC1612u
    public void a() {
        this.f12396c.a();
    }

    @Override // S0.InterfaceC1612u
    public void b() {
        this.f12396c.b();
    }

    @Override // S0.InterfaceC1612u
    public boolean f() {
        return d().isActive(this.f12394a);
    }

    @Override // S0.InterfaceC1612u
    public void g(int i6, android.view.inputmethod.ExtractedText extractedText) {
        d().updateExtractedText(this.f12394a, i6, extractedText);
    }

    @Override // S0.InterfaceC1612u
    public void h(int i6, int i10, int i11, int i12) {
        d().updateSelection(this.f12394a, i6, i10, i11, i12);
    }

    @Override // S0.InterfaceC1612u
    public void i() {
        d().restartInput(this.f12394a);
    }

    @Override // S0.InterfaceC1612u
    public void j(android.view.inputmethod.CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f12394a, cursorAnchorInfo);
    }
}
