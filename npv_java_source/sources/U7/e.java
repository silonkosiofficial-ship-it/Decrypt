package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends U7.p implements p048e8.InterfaceC6535a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.annotation.Annotation f14585a;

    public e(java.lang.annotation.Annotation annotation) {
        p247y7.AbstractC7350t.f(annotation, "annotation");
        this.f14585a = annotation;
    }

    public final java.lang.annotation.Annotation X() {
        return this.f14585a;
    }

    @Override // p048e8.InterfaceC6535a
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public U7.l D() {
        return new U7.l(p227w7.a.b(p227w7.a.a(this.f14585a)));
    }

    @Override // p048e8.InterfaceC6535a
    public java.util.Collection a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method[] declaredMethods = p227w7.a.b(p227w7.a.a(this.f14585a)).getDeclaredMethods();
        p247y7.AbstractC7350t.e(declaredMethods, "getDeclaredMethods(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            U7.f.a aVar = U7.f.f14586b;
            java.lang.Object objInvoke = method.invoke(this.f14585a, null);
            p247y7.AbstractC7350t.e(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, p138n8.f.o(method.getName())));
        }
        return arrayList;
    }

    @Override // p048e8.InterfaceC6535a
    public p138n8.b c() {
        return U7.d.a(p227w7.a.b(p227w7.a.a(this.f14585a)));
    }

    @Override // p048e8.InterfaceC6535a
    public boolean d() {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof U7.e) && this.f14585a == ((U7.e) obj).f14585a;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.f14585a);
    }

    public java.lang.String toString() {
        return U7.e.class.getName() + ": " + this.f14585a;
    }

    @Override // p048e8.InterfaceC6535a
    public boolean z() {
        return false;
    }
}
