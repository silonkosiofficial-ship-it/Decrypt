package D6;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends D6.b {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final byte[] f1933J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f1934K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C6.c cVar, O6.b bVar, Q6.c cVar2, byte[] bArr) {
        super(cVar);
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(bVar, "request");
        p247y7.AbstractC7350t.f(cVar2, "response");
        p247y7.AbstractC7350t.f(bArr, "responseBody");
        this.f1933J = bArr;
        h(new D6.f(this, bVar));
        i(new D6.g(this, bArr, cVar2));
        D6.h.a(T6.AbstractC1677z.b(cVar2), bArr.length, bVar.u0());
        this.f1934K = true;
    }

    @Override // D6.b
    protected boolean b() {
        return this.f1934K;
    }

    @Override // D6.b
    protected java.lang.Object f(p127m7.e eVar) {
        return io.ktor.utils.io.b.c(this.f1933J, 0, 0, 6, null);
    }
}
