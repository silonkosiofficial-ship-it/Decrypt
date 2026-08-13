package N;

/* JADX INFO: renamed from: N.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1354d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.A1 f7413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p251z0.B f7415c;

    public C1354d(androidx.compose.ui.platform.A1 a6) {
        this.f7413a = a6;
    }

    public final int a() {
        return this.f7414b;
    }

    public final boolean b(p251z0.B b6, p251z0.B b10) {
        return N.s.f(this.f7413a, b6, b10);
    }

    public final boolean c(p251z0.B b6, p251z0.B b10) {
        return b10.o() - b6.o() < this.f7413a.a();
    }

    public final void d(p251z0.C7380p c7380p) {
        p251z0.B b6 = this.f7415c;
        p251z0.B b10 = (p251z0.B) c7380p.c().get(0);
        if (b6 != null && c(b6, b10) && b(b6, b10)) {
            this.f7414b++;
        } else {
            this.f7414b = 1;
        }
        this.f7415c = b10;
    }
}
