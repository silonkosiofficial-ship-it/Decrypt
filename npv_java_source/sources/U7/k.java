package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends U7.z implements p048e8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Type f14590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U7.z f14591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Collection f14592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14593e;

    public k(java.lang.reflect.Type type) {
        U7.z.a aVar;
        java.lang.reflect.Type componentType;
        java.lang.String str;
        p247y7.AbstractC7350t.f(type, "reflectType");
        this.f14590b = type;
        java.lang.reflect.Type typeX = X();
        if (!(typeX instanceof java.lang.reflect.GenericArrayType)) {
            if (typeX instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) typeX;
                if (cls.isArray()) {
                    aVar = U7.z.f14616a;
                    componentType = cls.getComponentType();
                    str = "getComponentType(...)";
                }
            }
            throw new java.lang.IllegalArgumentException("Not an array type (" + X().getClass() + "): " + X());
        }
        aVar = U7.z.f14616a;
        componentType = ((java.lang.reflect.GenericArrayType) typeX).getGenericComponentType();
        str = "getGenericComponentType(...)";
        p247y7.AbstractC7350t.e(componentType, str);
        this.f14591c = aVar.a(componentType);
        this.f14592d = p097j7.AbstractC6879v.m();
    }

    @Override // U7.z
    protected java.lang.reflect.Type X() {
        return this.f14590b;
    }

    @Override // p048e8.f
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public U7.z p() {
        return this.f14591c;
    }

    @Override // p048e8.InterfaceC6538d
    public java.util.Collection k() {
        return this.f14592d;
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return this.f14593e;
    }
}
