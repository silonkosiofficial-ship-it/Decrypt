package F8;

/* JADX INFO: loaded from: classes2.dex */
final class O extends F8.r {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F8.a0 f2852E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(F8.M m6, F8.a0 a0Var) {
        super(m6);
        p247y7.AbstractC7350t.f(m6, "delegate");
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        this.f2852E = a0Var;
    }

    @Override // F8.AbstractC0956q, F8.E
    public F8.a0 V0() {
        return this.f2852E;
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public F8.O h1(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        return new F8.O(m6, V0());
    }
}
