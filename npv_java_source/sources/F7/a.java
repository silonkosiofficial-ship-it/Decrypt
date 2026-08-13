package F7;

/* JADX INFO: loaded from: classes3.dex */
final class a implements java.lang.reflect.GenericArrayType, java.lang.reflect.Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Type f2788a;

    public a(java.lang.reflect.Type type) {
        p247y7.AbstractC7350t.f(type, "elementType");
        this.f2788a = type;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.GenericArrayType) && p247y7.AbstractC7350t.b(getGenericComponentType(), ((java.lang.reflect.GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public java.lang.reflect.Type getGenericComponentType() {
        return this.f2788a;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return F7.u.h(this.f2788a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
