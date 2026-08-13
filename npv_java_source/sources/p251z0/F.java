package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.J f57491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p251z0.C7371g f57492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p251z0.C f57493c = new p251z0.C();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F0.C0935v f57494d = new F0.C0935v();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f57495e;

    public F(F0.J j6) {
        this.f57491a = j6;
        this.f57492b = new p251z0.C7371g(j6.l());
    }

    public final void a() {
        this.f57492b.b();
    }

    public final int b(p251z0.D d6, p251z0.Q q6, boolean z6) {
        int i6;
        boolean z10;
        if (this.f57495e) {
            return p251z0.G.a(false, false);
        }
        boolean z11 = true;
        try {
            this.f57495e = true;
            p251z0.C7372h c7372hB = this.f57493c.b(d6, q6);
            int iQ = c7372hB.b().q();
            while (true) {
                if (i6 >= iQ) {
                    z10 = true;
                    break;
                }
                p251z0.B b6 = (p251z0.B) c7372hB.b().r(i6);
                i6 = (b6.i() || b6.l()) ? 0 : i6 + 1;
                z10 = false;
                break;
            }
            int iQ2 = c7372hB.b().q();
            for (int i10 = 0; i10 < iQ2; i10++) {
                p251z0.B b10 = (p251z0.B) c7372hB.b().r(i10);
                if (z10 || p251z0.AbstractC7381q.b(b10)) {
                    F0.J.y0(this.f57491a, b10.h(), this.f57494d, p251z0.P.g(b10.n(), p251z0.P.f57513a.d()), false, 8, null);
                    if (!this.f57494d.isEmpty()) {
                        this.f57492b.a(b10.f(), this.f57494d, p251z0.AbstractC7381q.b(b10));
                        this.f57494d.clear();
                    }
                }
            }
            this.f57492b.e();
            boolean zC = this.f57492b.c(c7372hB, z6);
            if (c7372hB.d()) {
                z11 = false;
                break;
            }
            int iQ3 = c7372hB.b().q();
            int i11 = 0;
            while (true) {
                if (i11 >= iQ3) {
                    z11 = false;
                    break;
                }
                p251z0.B b11 = (p251z0.B) c7372hB.b().r(i11);
                if (p251z0.AbstractC7381q.j(b11) && b11.p()) {
                    break;
                }
                i11++;
            }
            return p251z0.G.a(zC, z11);
        } finally {
            this.f57495e = false;
        }
    }

    public final void c() {
        if (this.f57495e) {
            return;
        }
        this.f57493c.a();
        this.f57492b.d();
    }
}
