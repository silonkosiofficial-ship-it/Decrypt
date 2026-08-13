package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements D8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p068g8.t f45704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.t f45705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D8.e f45707e;

    public v(p068g8.t tVar, B8.t tVar2, boolean z6, D8.e eVar) {
        p247y7.AbstractC7350t.f(tVar, "binaryClass");
        p247y7.AbstractC7350t.f(eVar, "abiStability");
        this.f45704b = tVar;
        this.f45705c = tVar2;
        this.f45706d = z6;
        this.f45707e = eVar;
    }

    @Override // O7.a0
    public O7.b0 a() {
        O7.b0 b0Var = O7.b0.f8149a;
        p247y7.AbstractC7350t.e(b0Var, "NO_SOURCE_FILE");
        return b0Var;
    }

    @Override // D8.f
    public java.lang.String c() {
        return "Class '" + this.f45704b.c().b().b() + '\'';
    }

    public final p068g8.t d() {
        return this.f45704b;
    }

    public java.lang.String toString() {
        return p068g8.v.class.getSimpleName() + ": " + this.f45704b;
    }
}
