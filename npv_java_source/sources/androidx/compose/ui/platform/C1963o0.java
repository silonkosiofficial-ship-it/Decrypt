package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1963o0 extends androidx.compose.ui.platform.AbstractC1920a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20160K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f20161L;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.o0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f20163E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6) {
            super(2);
            this.f20163E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.ui.platform.C1963o0.this.b(interfaceC1734n, V.S0.a(this.f20163E | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public C1963o0(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f20160K = V.A1.d(null, null, 2, null);
    }

    public /* synthetic */ C1963o0(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i6);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void b(V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(420213850);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(this) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i10 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(420213850, i10, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            p237x7.p pVar = (p237x7.p) this.f20160K.getValue();
            if (pVar == null) {
                interfaceC1734nR.T(358373017);
            } else {
                interfaceC1734nR.T(150107752);
                pVar.u(interfaceC1734nR, 0);
            }
            interfaceC1734nR.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.ui.platform.C1963o0.a(i6));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return androidx.compose.ui.platform.C1963o0.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f20161L;
    }

    public final void setContent(p237x7.p pVar) {
        this.f20161L = true;
        this.f20160K.setValue(pVar);
        if (isAttachedToWindow()) {
            e();
        }
    }
}
