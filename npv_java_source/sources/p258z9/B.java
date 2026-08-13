package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends p229w9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p258z9.AbstractC7388a f57666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A9.b f57667c;

    public B(p258z9.AbstractC7388a abstractC7388a, p249y9.AbstractC7358b abstractC7358b) {
        p247y7.AbstractC7350t.f(abstractC7388a, "lexer");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        this.f57666b = abstractC7388a;
        this.f57667c = abstractC7358b.f();
    }

    @Override // p229w9.a, p229w9.h
    public short A() {
        p258z9.AbstractC7388a abstractC7388a = this.f57666b;
        java.lang.String strS = abstractC7388a.s();
        try {
            return S8.N.k(strS);
        } catch (java.lang.IllegalArgumentException unused) {
            p258z9.AbstractC7388a.y(abstractC7388a, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new p087i7.C6665k();
        }
    }

    @Override // p229w9.a, p229w9.h
    public int m() {
        p258z9.AbstractC7388a abstractC7388a = this.f57666b;
        java.lang.String strS = abstractC7388a.s();
        try {
            return S8.N.d(strS);
        } catch (java.lang.IllegalArgumentException unused) {
            p258z9.AbstractC7388a.y(abstractC7388a, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new p087i7.C6665k();
        }
    }

    @Override // p229w9.a, p229w9.h
    public long q() {
        p258z9.AbstractC7388a abstractC7388a = this.f57666b;
        java.lang.String strS = abstractC7388a.s();
        try {
            return S8.N.h(strS);
        } catch (java.lang.IllegalArgumentException unused) {
            p258z9.AbstractC7388a.y(abstractC7388a, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new p087i7.C6665k();
        }
    }

    @Override // p229w9.d
    public int r(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        throw new java.lang.IllegalStateException("unsupported".toString());
    }

    @Override // p229w9.a, p229w9.h
    public byte y() {
        p258z9.AbstractC7388a abstractC7388a = this.f57666b;
        java.lang.String strS = abstractC7388a.s();
        try {
            return S8.N.a(strS);
        } catch (java.lang.IllegalArgumentException unused) {
            p258z9.AbstractC7388a.y(abstractC7388a, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new p087i7.C6665k();
        }
    }
}
