package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends U7.z implements p048e8.C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.WildcardType f14562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Collection f14563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14564d;

    public C(java.lang.reflect.WildcardType wildcardType) {
        p247y7.AbstractC7350t.f(wildcardType, "reflectType");
        this.f14562b = wildcardType;
        this.f14563c = p097j7.AbstractC6879v.m();
    }

    @Override // p048e8.C
    public boolean P() {
        java.lang.reflect.Type[] upperBounds = X().getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
        return !p247y7.AbstractC7350t.b(p097j7.AbstractC6872n.Z(upperBounds), java.lang.Object.class);
    }

    @Override // p048e8.C
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public U7.z G() {
        java.lang.reflect.Type[] upperBounds = X().getUpperBounds();
        java.lang.reflect.Type[] lowerBounds = X().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new java.lang.UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + X());
        }
        if (lowerBounds.length == 1) {
            U7.z.a aVar = U7.z.f14616a;
            p247y7.AbstractC7350t.c(lowerBounds);
            java.lang.Object objF0 = p097j7.AbstractC6872n.F0(lowerBounds);
            p247y7.AbstractC7350t.e(objF0, "single(...)");
            return aVar.a((java.lang.reflect.Type) objF0);
        }
        if (upperBounds.length == 1) {
            p247y7.AbstractC7350t.c(upperBounds);
            java.lang.reflect.Type type = (java.lang.reflect.Type) p097j7.AbstractC6872n.F0(upperBounds);
            if (!p247y7.AbstractC7350t.b(type, java.lang.Object.class)) {
                U7.z.a aVar2 = U7.z.f14616a;
                p247y7.AbstractC7350t.c(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U7.z
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.WildcardType X() {
        return this.f14562b;
    }

    @Override // p048e8.InterfaceC6538d
    public java.util.Collection k() {
        return this.f14563c;
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return this.f14564d;
    }
}
