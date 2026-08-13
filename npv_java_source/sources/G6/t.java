package G6;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends java.lang.IllegalArgumentException implements W8.D {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p067g7.b f3130C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p067g7.b bVar) {
        super("Unsupported frame type: " + bVar);
        p247y7.AbstractC7350t.f(bVar, "frame");
        this.f3130C = bVar;
    }

    @Override // W8.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public G6.t a() {
        G6.t tVar = new G6.t(this.f3130C);
        tVar.initCause(this);
        return tVar;
    }
}
