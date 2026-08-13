package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends U7.z implements p048e8.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Type f14604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p048e8.i f14605c;

    public n(java.lang.reflect.Type type) {
        p048e8.i lVar;
        p247y7.AbstractC7350t.f(type, "reflectType");
        this.f14604b = type;
        java.lang.reflect.Type typeX = X();
        if (typeX instanceof java.lang.Class) {
            lVar = new U7.l((java.lang.Class) typeX);
        } else if (typeX instanceof java.lang.reflect.TypeVariable) {
            lVar = new U7.A((java.lang.reflect.TypeVariable) typeX);
        } else {
            if (!(typeX instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Not a classifier type (" + typeX.getClass() + "): " + typeX);
            }
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) typeX).getRawType();
            p247y7.AbstractC7350t.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            lVar = new U7.l((java.lang.Class) rawType);
        }
        this.f14605c = lVar;
    }

    @Override // p048e8.j
    public boolean B() {
        java.lang.reflect.Type typeX = X();
        if (!(typeX instanceof java.lang.Class)) {
            return false;
        }
        java.lang.reflect.TypeVariable[] typeParameters = ((java.lang.Class) typeX).getTypeParameters();
        p247y7.AbstractC7350t.e(typeParameters, "getTypeParameters(...)");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // p048e8.j
    public java.lang.String C() {
        throw new java.lang.UnsupportedOperationException("Type not found: " + X());
    }

    @Override // p048e8.j
    public java.util.List K() {
        java.util.List listD = U7.d.d(X());
        U7.z.a aVar = U7.z.f14616a;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listD, 10));
        java.util.Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // U7.z
    public java.lang.reflect.Type X() {
        return this.f14604b;
    }

    @Override // p048e8.j
    public p048e8.i b() {
        return this.f14605c;
    }

    @Override // U7.z, p048e8.InterfaceC6538d
    public p048e8.InterfaceC6535a j(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return null;
    }

    @Override // p048e8.InterfaceC6538d
    public java.util.Collection k() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return false;
    }

    @Override // p048e8.j
    public java.lang.String s() {
        return X().toString();
    }
}
