package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends U7.p implements U7.h, p048e8.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.TypeVariable f14557a;

    public A(java.lang.reflect.TypeVariable typeVariable) {
        p247y7.AbstractC7350t.f(typeVariable, "typeVariable");
        this.f14557a = typeVariable;
    }

    @Override // U7.h
    public java.lang.reflect.AnnotatedElement A() {
        java.lang.reflect.TypeVariable typeVariable = this.f14557a;
        if (typeVariable instanceof java.lang.reflect.AnnotatedElement) {
            return (java.lang.reflect.AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // p048e8.y
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public java.util.List getUpperBounds() {
        java.lang.reflect.Type[] bounds = this.f14557a.getBounds();
        p247y7.AbstractC7350t.e(bounds, "getBounds(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(bounds.length);
        for (java.lang.reflect.Type type : bounds) {
            arrayList.add(new U7.n(type));
        }
        U7.n nVar = (U7.n) p097j7.AbstractC6879v.I0(arrayList);
        return p247y7.AbstractC7350t.b(nVar != null ? nVar.X() : null, java.lang.Object.class) ? p097j7.AbstractC6879v.m() : arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof U7.A) && p247y7.AbstractC7350t.b(this.f14557a, ((U7.A) obj).f14557a);
    }

    @Override // p048e8.t
    public p138n8.f getName() {
        p138n8.f fVarO = p138n8.f.o(this.f14557a.getName());
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        return fVarO;
    }

    public int hashCode() {
        return this.f14557a.hashCode();
    }

    @Override // U7.h, p048e8.InterfaceC6538d
    public U7.e j(p138n8.c cVar) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.lang.reflect.AnnotatedElement annotatedElementA = A();
        if (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null) {
            return null;
        }
        return U7.i.a(declaredAnnotations, cVar);
    }

    @Override // p048e8.InterfaceC6538d
    public /* bridge */ /* synthetic */ p048e8.InterfaceC6535a j(p138n8.c cVar) {
        return j(cVar);
    }

    @Override // p048e8.InterfaceC6538d
    public /* bridge */ /* synthetic */ java.util.Collection k() {
        return k();
    }

    @Override // U7.h, p048e8.InterfaceC6538d
    public java.util.List k() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List listB;
        java.lang.reflect.AnnotatedElement annotatedElementA = A();
        return (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null || (listB = U7.i.b(declaredAnnotations)) == null) ? p097j7.AbstractC6879v.m() : listB;
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return false;
    }

    public java.lang.String toString() {
        return U7.A.class.getName() + ": " + this.f14557a;
    }
}
