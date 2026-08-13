package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
final class f implements p141o0.C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p170r.I f19631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p141o0.C1 f19632b;

    @Override // p141o0.C1
    public void a(p171r0.C7053c c7053c) {
        p141o0.C1 c6 = this.f19632b;
        if (c6 != null) {
            c6.a(c7053c);
        }
    }

    @Override // p141o0.C1
    public p171r0.C7053c b() {
        p141o0.C1 c6 = this.f19632b;
        if (!(c6 != null)) {
            C0.a.b("GraphicsContext not provided");
        }
        p171r0.C7053c c7053cB = c6.b();
        p170r.I i6 = this.f19631a;
        if (i6 == null) {
            this.f19631a = p170r.Q.b(c7053cB);
        } else {
            i6.g(c7053cB);
        }
        return c7053cB;
    }

    public final p141o0.C1 c() {
        return this.f19632b;
    }

    public final void d() {
        p170r.I i6 = this.f19631a;
        if (i6 != null) {
            java.lang.Object[] objArr = i6.f53322a;
            int i10 = i6.f53323b;
            for (int i11 = 0; i11 < i10; i11++) {
                a((p171r0.C7053c) objArr[i11]);
            }
            i6.h();
        }
    }

    public final void e(p141o0.C1 c6) {
        d();
        this.f19632b = c6;
    }
}
