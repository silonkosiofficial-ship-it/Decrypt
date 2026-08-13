package F7;

/* JADX INFO: loaded from: classes3.dex */
final class t implements java.lang.reflect.TypeVariable, java.lang.reflect.Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7.p f2808a;

    public t(F7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "typeParameter");
        this.f2808a = pVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.TypeVariable) {
            java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) obj;
            if (p247y7.AbstractC7350t.b(getName(), typeVariable.getName()) && p247y7.AbstractC7350t.b(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.Type[] getBounds() {
        java.util.List upperBounds = this.f2808a.getUpperBounds();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(upperBounds, 10));
        java.util.Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(F7.u.c((F7.o) it.next(), true));
        }
        return (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
        throw new p087i7.t("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f2808a));
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.String getName() {
        return this.f2808a.getName();
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
