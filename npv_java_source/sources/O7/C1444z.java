package O7;

/* JADX INFO: renamed from: O7.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1444z extends O7.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.f f8202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J8.j f8203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444z(p138n8.f fVar, J8.j jVar) {
        super(null);
        p247y7.AbstractC7350t.f(fVar, "underlyingPropertyName");
        p247y7.AbstractC7350t.f(jVar, "underlyingType");
        this.f8202a = fVar;
        this.f8203b = jVar;
    }

    @Override // O7.h0
    public boolean a(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return p247y7.AbstractC7350t.b(this.f8202a, fVar);
    }

    @Override // O7.h0
    public java.util.List b() {
        return p097j7.AbstractC6879v.e(p087i7.B.a(this.f8202a, this.f8203b));
    }

    public final p138n8.f d() {
        return this.f8202a;
    }

    public final J8.j e() {
        return this.f8203b;
    }

    public java.lang.String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f8202a + ", underlyingType=" + this.f8203b + ')';
    }
}
