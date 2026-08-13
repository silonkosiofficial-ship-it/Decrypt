package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends U7.f implements p048e8.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Enum f14607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p138n8.f fVar, java.lang.Enum r6) {
        super(fVar, null);
        p247y7.AbstractC7350t.f(r6, "value");
        this.f14607c = r6;
    }

    @Override // p048e8.m
    public p138n8.b b() {
        java.lang.Class<?> enclosingClass = this.f14607c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        p247y7.AbstractC7350t.c(enclosingClass);
        return U7.d.a(enclosingClass);
    }

    @Override // p048e8.m
    public p138n8.f d() {
        return p138n8.f.o(this.f14607c.name());
    }
}
