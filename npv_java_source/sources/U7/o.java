package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends U7.t implements p048e8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Constructor f14606a;

    public o(java.lang.reflect.Constructor constructor) {
        p247y7.AbstractC7350t.f(constructor, "member");
        this.f14606a = constructor;
    }

    @Override // U7.t
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.Constructor Y() {
        return this.f14606a;
    }

    @Override // p048e8.z
    public java.util.List g() {
        java.lang.reflect.TypeVariable[] typeParameters = Y().getTypeParameters();
        p247y7.AbstractC7350t.e(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new U7.A(typeVariable));
        }
        return arrayList;
    }

    @Override // p048e8.k
    public java.util.List n() {
        java.lang.reflect.Type[] genericParameterTypes = Y().getGenericParameterTypes();
        p247y7.AbstractC7350t.c(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return p097j7.AbstractC6879v.m();
        }
        java.lang.Class declaringClass = Y().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (java.lang.reflect.Type[]) p097j7.AbstractC6872n.r(genericParameterTypes, 1, genericParameterTypes.length);
        }
        java.lang.annotation.Annotation[][] parameterAnnotations = Y().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new java.lang.IllegalStateException("Illegal generic signature: " + Y());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            p247y7.AbstractC7350t.c(parameterAnnotations);
            parameterAnnotations = (java.lang.annotation.Annotation[][]) p097j7.AbstractC6872n.r(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        p247y7.AbstractC7350t.c(genericParameterTypes);
        p247y7.AbstractC7350t.c(parameterAnnotations);
        return Z(genericParameterTypes, parameterAnnotations, Y().isVarArgs());
    }
}
