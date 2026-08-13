package p258z9;

/* JADX INFO: renamed from: z9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7409w extends p258z9.C7401n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p249y9.AbstractC7358b f57779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7409w(p258z9.A a6, p249y9.AbstractC7358b abstractC7358b) {
        super(a6);
        p247y7.AbstractC7350t.f(a6, "writer");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        this.f57779c = abstractC7358b;
    }

    @Override // p258z9.C7401n
    public void b() {
        o(true);
        this.f57780d++;
    }

    @Override // p258z9.C7401n
    public void c() {
        o(false);
        k("\n");
        int i6 = this.f57780d;
        for (int i10 = 0; i10 < i6; i10++) {
            k(this.f57779c.e().n());
        }
    }

    @Override // p258z9.C7401n
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // p258z9.C7401n
    public void p() {
        f(' ');
    }

    @Override // p258z9.C7401n
    public void q() {
        this.f57780d--;
    }
}
