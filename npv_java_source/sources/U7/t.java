package U7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends U7.p implements U7.h, U7.v, p048e8.q {
    @Override // U7.h
    public java.lang.reflect.AnnotatedElement A() {
        java.lang.reflect.Member memberY = Y();
        p247y7.AbstractC7350t.d(memberY, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (java.lang.reflect.AnnotatedElement) memberY;
    }

    @Override // U7.v
    public int I() {
        return Y().getModifiers();
    }

    @Override // p048e8.s
    public boolean N() {
        return java.lang.reflect.Modifier.isAbstract(I());
    }

    @Override // p048e8.s
    public boolean W() {
        return java.lang.reflect.Modifier.isStatic(I());
    }

    @Override // p048e8.q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public U7.l V() {
        java.lang.Class<?> declaringClass = Y().getDeclaringClass();
        p247y7.AbstractC7350t.e(declaringClass, "getDeclaringClass(...)");
        return new U7.l(declaringClass);
    }

    public abstract java.lang.reflect.Member Y();

    protected final java.util.List Z(java.lang.reflect.Type[] typeArr, java.lang.annotation.Annotation[][] annotationArr, boolean z6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.String str;
        p247y7.AbstractC7350t.f(typeArr, "parameterTypes");
        p247y7.AbstractC7350t.f(annotationArr, "parameterAnnotations");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeArr.length);
        java.util.List listB = U7.C1694c.f14575a.b(Y());
        int size = listB != null ? listB.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i6 = 0;
        while (i6 < length) {
            U7.z zVarA = U7.z.f14616a.a(typeArr[i6]);
            if (listB != null) {
                str = (java.lang.String) p097j7.AbstractC6879v.l0(listB, i6 + size);
                if (str == null) {
                    throw new java.lang.IllegalStateException(("No parameter with index " + i6 + '+' + size + " (name=" + getName() + " type=" + zVarA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new U7.B(zVarA, annotationArr[i6], str, z6 && i6 == p097j7.AbstractC6872n.e0(typeArr)));
            i6++;
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof U7.t) && p247y7.AbstractC7350t.b(Y(), ((U7.t) obj).Y());
    }

    @Override // p048e8.t
    public p138n8.f getName() {
        java.lang.String name = Y().getName();
        p138n8.f fVarO = name != null ? p138n8.f.o(name) : null;
        return fVarO == null ? p138n8.h.f51965b : fVarO;
    }

    @Override // p048e8.s
    public O7.n0 h() {
        int I10 = I();
        if (java.lang.reflect.Modifier.isPublic(I10)) {
            return O7.m0.h.f8177c;
        }
        if (java.lang.reflect.Modifier.isPrivate(I10)) {
            return O7.m0.e.f8174c;
        }
        if (java.lang.reflect.Modifier.isProtected(I10)) {
            return java.lang.reflect.Modifier.isStatic(I10) ? S7.c.f12616c : S7.b.f12615c;
        }
        return S7.a.f12614c;
    }

    public int hashCode() {
        return Y().hashCode();
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

    @Override // p048e8.s
    public boolean q() {
        return java.lang.reflect.Modifier.isFinal(I());
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + Y();
    }
}
