package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends U7.t implements p048e8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Field f14608a;

    public r(java.lang.reflect.Field field) {
        p247y7.AbstractC7350t.f(field, "member");
        this.f14608a = field;
    }

    @Override // p048e8.n
    public boolean L() {
        return Y().isEnumConstant();
    }

    @Override // p048e8.n
    public boolean U() {
        return false;
    }

    @Override // U7.t
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.Field Y() {
        return this.f14608a;
    }

    @Override // p048e8.n
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public U7.z getType() {
        U7.z.a aVar = U7.z.f14616a;
        java.lang.reflect.Type genericType = Y().getGenericType();
        p247y7.AbstractC7350t.e(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
