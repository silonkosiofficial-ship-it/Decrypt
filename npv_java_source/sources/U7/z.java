package U7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z implements p048e8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U7.z.a f14616a = new U7.z.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final U7.z a(java.lang.reflect.Type type) {
            U7.z kVar;
            p247y7.AbstractC7350t.f(type, "type");
            boolean z6 = type instanceof java.lang.Class;
            if (z6) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    return new U7.x(cls);
                }
            }
            if ((type instanceof java.lang.reflect.GenericArrayType) || (z6 && ((java.lang.Class) type).isArray())) {
                kVar = new U7.k(type);
            } else {
                kVar = type instanceof java.lang.reflect.WildcardType ? new U7.C((java.lang.reflect.WildcardType) type) : new U7.n(type);
            }
            return kVar;
        }
    }

    protected abstract java.lang.reflect.Type X();

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof U7.z) && p247y7.AbstractC7350t.b(X(), ((U7.z) obj).X());
    }

    public int hashCode() {
        return X().hashCode();
    }

    @Override // p048e8.InterfaceC6538d
    public p048e8.InterfaceC6535a j(p138n8.c cVar) {
        java.lang.Object obj;
        java.lang.Object next;
        p138n8.b bVarC;
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.Iterator it = k().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                bVarC = ((p048e8.InterfaceC6535a) next).c();
            }
            return (p048e8.InterfaceC6535a) obj;
        } while (!p247y7.AbstractC7350t.b(bVarC != null ? bVarC.b() : null, cVar));
        obj = next;
        return (p048e8.InterfaceC6535a) obj;
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + X();
    }
}
