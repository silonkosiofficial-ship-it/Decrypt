package O7;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends O7.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f8115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f8116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(java.util.List list) {
        super(null);
        p247y7.AbstractC7350t.f(list, "underlyingPropertyNamesToTypes");
        this.f8115a = list;
        java.util.Map mapQ = p097j7.S.q(b());
        if (mapQ.size() != b().size()) {
            throw new java.lang.IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f8116b = mapQ;
    }

    @Override // O7.h0
    public boolean a(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return this.f8116b.containsKey(fVar);
    }

    @Override // O7.h0
    public java.util.List b() {
        return this.f8115a;
    }

    public java.lang.String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + b() + ')';
    }
}
