package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends U7.t implements p048e8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Method f14610a;

    public u(java.lang.reflect.Method method) {
        p247y7.AbstractC7350t.f(method, "member");
        this.f14610a = method;
    }

    @Override // p048e8.r
    public boolean R() {
        return v() != null;
    }

    @Override // U7.t
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.Method Y() {
        return this.f14610a;
    }

    @Override // p048e8.r
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public U7.z l() {
        U7.z.a aVar = U7.z.f14616a;
        java.lang.reflect.Type genericReturnType = Y().getGenericReturnType();
        p247y7.AbstractC7350t.e(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // p048e8.z
    public java.util.List g() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = Y().getTypeParameters();
        p247y7.AbstractC7350t.e(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeParameters) {
            arrayList.add(new U7.A(typeVariable));
        }
        return arrayList;
    }

    @Override // p048e8.r
    public java.util.List n() {
        java.lang.reflect.Type[] genericParameterTypes = Y().getGenericParameterTypes();
        p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
        java.lang.annotation.Annotation[][] parameterAnnotations = Y().getParameterAnnotations();
        p247y7.AbstractC7350t.e(parameterAnnotations, "getParameterAnnotations(...)");
        return Z(genericParameterTypes, parameterAnnotations, Y().isVarArgs());
    }

    @Override // p048e8.r
    public p048e8.InterfaceC6536b v() {
        java.lang.Object defaultValue = Y().getDefaultValue();
        if (defaultValue != null) {
            return U7.f.f14586b.a(defaultValue, null);
        }
        return null;
    }
}
