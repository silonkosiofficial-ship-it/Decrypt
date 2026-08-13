package T7;

/* JADX INFO: loaded from: classes2.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T7.m f13311a = new T7.m();

    private m() {
    }

    public final java.lang.String a(java.lang.reflect.Constructor constructor) {
        p247y7.AbstractC7350t.f(constructor, "constructor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        p247y7.AbstractC7350t.e(parameterTypes, "getParameterTypes(...)");
        for (java.lang.Class<?> cls : parameterTypes) {
            p247y7.AbstractC7350t.c(cls);
            sb.append(U7.d.b(cls));
        }
        sb.append(")V");
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final java.lang.String b(java.lang.reflect.Field field) {
        p247y7.AbstractC7350t.f(field, "field");
        java.lang.Class<?> type = field.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        return U7.d.b(type);
    }

    public final java.lang.String c(java.lang.reflect.Method method) {
        p247y7.AbstractC7350t.f(method, "method");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        p247y7.AbstractC7350t.e(parameterTypes, "getParameterTypes(...)");
        for (java.lang.Class<?> cls : parameterTypes) {
            p247y7.AbstractC7350t.c(cls);
            sb.append(U7.d.b(cls));
        }
        sb.append(")");
        java.lang.Class<?> returnType = method.getReturnType();
        p247y7.AbstractC7350t.e(returnType, "getReturnType(...)");
        sb.append(U7.d.b(returnType));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
