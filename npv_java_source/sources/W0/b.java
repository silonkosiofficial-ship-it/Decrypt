package W0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p141o0.a2 f15301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f15303c = V.A1.d(p131n0.m.c(p131n0.m.f51333b.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.G1 f15304d = V.v1.e(new W0.b.a());

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.graphics.Shader b() {
            if (W0.b.this.b() == 9205357640488583168L || p131n0.m.k(W0.b.this.b())) {
                return null;
            }
            return W0.b.this.a().b(W0.b.this.b());
        }
    }

    public b(p141o0.a2 a2Var, float f6) {
        this.f15301a = a2Var;
        this.f15302b = f6;
    }

    public final p141o0.a2 a() {
        return this.f15301a;
    }

    public final long b() {
        return ((p131n0.m) this.f15303c.getValue()).m();
    }

    public final void c(long j6) {
        this.f15303c.setValue(p131n0.m.c(j6));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        U0.h.a(textPaint, this.f15302b);
        textPaint.setShader((android.graphics.Shader) this.f15304d.getValue());
    }
}
