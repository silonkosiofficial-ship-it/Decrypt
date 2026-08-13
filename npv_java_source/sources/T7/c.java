package T7;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T7.c f13297a = new T7.c();

    private c() {
    }

    private final p198t8.f a(java.lang.Class cls) {
        int i6 = 0;
        while (cls.isArray()) {
            i6++;
            cls = cls.getComponentType();
            p247y7.AbstractC7350t.e(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            p138n8.b bVarA = U7.d.a(cls);
            N7.c cVar = N7.c.f7820a;
            p138n8.c cVarB = bVarA.b();
            p247y7.AbstractC7350t.e(cVarB, "asSingleFqName(...)");
            p138n8.b bVarM = cVar.m(cVarB);
            if (bVarM != null) {
                bVarA = bVarM;
            }
            return new p198t8.f(bVarA, i6);
        }
        if (p247y7.AbstractC7350t.b(cls, java.lang.Void.TYPE)) {
            p138n8.b bVarM2 = p138n8.b.m(L7.j.a.f6375f.l());
            p247y7.AbstractC7350t.e(bVarM2, "topLevel(...)");
            return new p198t8.f(bVarM2, i6);
        }
        L7.h hVarO = p228w8.e.i(cls.getName()).o();
        p247y7.AbstractC7350t.e(hVarO, "getPrimitiveType(...)");
        if (i6 > 0) {
            p138n8.b bVarM3 = p138n8.b.m(hVarO.g());
            p247y7.AbstractC7350t.e(bVarM3, "topLevel(...)");
            return new p198t8.f(bVarM3, i6 - 1);
        }
        p138n8.b bVarM4 = p138n8.b.m(hVarO.m());
        p247y7.AbstractC7350t.e(bVarM4, "topLevel(...)");
        return new p198t8.f(bVarM4, i6);
    }

    private final void c(java.lang.Class cls, g8.t.d dVar) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Constructor<?>[] constructorArr;
        int i6;
        java.lang.reflect.Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        p247y7.AbstractC7350t.e(declaredConstructors, "getDeclaredConstructors(...)");
        int length = declaredConstructors.length;
        int i10 = 0;
        while (i10 < length) {
            java.lang.reflect.Constructor<?> constructor = declaredConstructors[i10];
            p138n8.f fVar = p138n8.h.f51972i;
            T7.m mVar = T7.m.f13311a;
            p247y7.AbstractC7350t.c(constructor);
            g8.t.e eVarB = dVar.b(fVar, mVar.a(constructor));
            if (eVarB == null) {
                constructorArr = declaredConstructors;
                i6 = length;
            } else {
                java.lang.annotation.Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                p247y7.AbstractC7350t.e(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                    p247y7.AbstractC7350t.c(annotation);
                    f(eVarB, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                p247y7.AbstractC7350t.c(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        java.lang.annotation.Annotation[] annotationArr = parameterAnnotations[i11];
                        p247y7.AbstractC7350t.c(annotationArr);
                        int length4 = annotationArr.length;
                        int i12 = 0;
                        while (i12 < length4) {
                            java.lang.annotation.Annotation annotation2 = annotationArr[i12];
                            java.lang.Class clsB = p227w7.a.b(p227w7.a.a(annotation2));
                            java.lang.reflect.Constructor<?>[] constructorArr2 = declaredConstructors;
                            p138n8.b bVarA = U7.d.a(clsB);
                            int i13 = length;
                            p247y7.AbstractC7350t.c(annotation2);
                            g8.t.a aVarB = eVarB.b(i11 + length2, bVarA, new T7.b(annotation2));
                            if (aVarB != null) {
                                f13297a.h(aVarB, annotation2, clsB);
                            }
                            i12++;
                            declaredConstructors = constructorArr2;
                            length = i13;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i6 = length;
                eVarB.a();
            }
            i10++;
            declaredConstructors = constructorArr;
            length = i6;
        }
    }

    private final void d(java.lang.Class cls, g8.t.d dVar) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        p247y7.AbstractC7350t.e(declaredFields, "getDeclaredFields(...)");
        for (java.lang.reflect.Field field : declaredFields) {
            p138n8.f fVarO = p138n8.f.o(field.getName());
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            T7.m mVar = T7.m.f13311a;
            p247y7.AbstractC7350t.c(field);
            g8.t.c cVarA = dVar.a(fVarO, mVar.b(field), null);
            if (cVarA != null) {
                java.lang.annotation.Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                p247y7.AbstractC7350t.e(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                    p247y7.AbstractC7350t.c(annotation);
                    f(cVarA, annotation);
                }
                cVarA.a();
            }
        }
    }

    private final void e(java.lang.Class cls, g8.t.d dVar) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        p247y7.AbstractC7350t.e(declaredMethods, "getDeclaredMethods(...)");
        for (java.lang.reflect.Method method : declaredMethods) {
            p138n8.f fVarO = p138n8.f.o(method.getName());
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            T7.m mVar = T7.m.f13311a;
            p247y7.AbstractC7350t.c(method);
            g8.t.e eVarB = dVar.b(fVarO, mVar.c(method));
            if (eVarB != null) {
                java.lang.annotation.Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                p247y7.AbstractC7350t.e(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                    p247y7.AbstractC7350t.c(annotation);
                    f(eVarB, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                p247y7.AbstractC7350t.e(parameterAnnotations, "getParameterAnnotations(...)");
                java.lang.annotation.Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    java.lang.annotation.Annotation[] annotationArr2 = annotationArr[i6];
                    p247y7.AbstractC7350t.c(annotationArr2);
                    for (java.lang.annotation.Annotation annotation2 : annotationArr2) {
                        java.lang.Class clsB = p227w7.a.b(p227w7.a.a(annotation2));
                        p138n8.b bVarA = U7.d.a(clsB);
                        p247y7.AbstractC7350t.c(annotation2);
                        g8.t.a aVarB = eVarB.b(i6, bVarA, new T7.b(annotation2));
                        if (aVarB != null) {
                            f13297a.h(aVarB, annotation2, clsB);
                        }
                    }
                }
                eVarB.a();
            }
        }
    }

    private final void f(g8.t.c cVar, java.lang.annotation.Annotation annotation) throws java.lang.reflect.InvocationTargetException {
        java.lang.Class clsB = p227w7.a.b(p227w7.a.a(annotation));
        g8.t.a aVarC = cVar.c(U7.d.a(clsB), new T7.b(annotation));
        if (aVarC != null) {
            f13297a.h(aVarC, annotation, clsB);
        }
    }

    private final void g(g8.t.a aVar, p138n8.f fVar, java.lang.Object obj) throws java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> enclosingClass = obj.getClass();
        if (p247y7.AbstractC7350t.b(enclosingClass, java.lang.Class.class)) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.c(fVar, a((java.lang.Class) obj));
            return;
        }
        if (T7.i.f13304a.contains(enclosingClass)) {
            aVar.f(fVar, obj);
            return;
        }
        if (U7.d.h(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            p247y7.AbstractC7350t.c(enclosingClass);
            p138n8.b bVarA = U7.d.a(enclosingClass);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            p138n8.f fVarO = p138n8.f.o(((java.lang.Enum) obj).name());
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            aVar.e(fVar, bVarA, fVarO);
            return;
        }
        if (java.lang.annotation.Annotation.class.isAssignableFrom(enclosingClass)) {
            java.lang.Class<?>[] interfaces = enclosingClass.getInterfaces();
            p247y7.AbstractC7350t.e(interfaces, "getInterfaces(...)");
            java.lang.Class cls = (java.lang.Class) p097j7.AbstractC6872n.F0(interfaces);
            p247y7.AbstractC7350t.c(cls);
            g8.t.a aVarB = aVar.b(fVar, U7.d.a(cls));
            if (aVarB == null) {
                return;
            }
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarB, (java.lang.annotation.Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new java.lang.UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        g8.t.b bVarD = aVar.d(fVar);
        if (bVarD == null) {
            return;
        }
        java.lang.Class<?> componentType = enclosingClass.getComponentType();
        int i6 = 0;
        if (componentType.isEnum()) {
            p247y7.AbstractC7350t.c(componentType);
            p138n8.b bVarA2 = U7.d.a(componentType);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            int length = objArr.length;
            while (i6 < length) {
                java.lang.Object obj2 = objArr[i6];
                p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                p138n8.f fVarO2 = p138n8.f.o(((java.lang.Enum) obj2).name());
                p247y7.AbstractC7350t.e(fVarO2, "identifier(...)");
                bVarD.b(bVarA2, fVarO2);
                i6++;
            }
        } else if (p247y7.AbstractC7350t.b(componentType, java.lang.Class.class)) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
            int length2 = objArr2.length;
            while (i6 < length2) {
                java.lang.Object obj3 = objArr2[i6];
                p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarD.e(a((java.lang.Class) obj3));
                i6++;
            }
        } else {
            boolean zIsAssignableFrom = java.lang.annotation.Annotation.class.isAssignableFrom(componentType);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
            if (zIsAssignableFrom) {
                int length3 = objArr3.length;
                while (i6 < length3) {
                    java.lang.Object obj4 = objArr3[i6];
                    p247y7.AbstractC7350t.c(componentType);
                    g8.t.a aVarD = bVarD.d(U7.d.a(componentType));
                    if (aVarD != null) {
                        p247y7.AbstractC7350t.d(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                        h(aVarD, (java.lang.annotation.Annotation) obj4, componentType);
                    }
                    i6++;
                }
            } else {
                int length4 = objArr3.length;
                while (i6 < length4) {
                    bVarD.c(objArr3[i6]);
                    i6++;
                }
            }
        }
        bVarD.a();
    }

    private final void h(g8.t.a aVar, java.lang.annotation.Annotation annotation, java.lang.Class cls) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        p247y7.AbstractC7350t.e(declaredMethods, "getDeclaredMethods(...)");
        for (java.lang.reflect.Method method : declaredMethods) {
            try {
                java.lang.Object objInvoke = method.invoke(annotation, null);
                p247y7.AbstractC7350t.c(objInvoke);
                p138n8.f fVarO = p138n8.f.o(method.getName());
                p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
                g(aVar, fVarO, objInvoke);
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(java.lang.Class cls, g8.t.c cVar) throws java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cls, "klass");
        p247y7.AbstractC7350t.f(cVar, "visitor");
        java.lang.annotation.Annotation[] annotationArrQdg = com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a.qdg(cls);
        p247y7.AbstractC7350t.e(annotationArrQdg, "getDeclaredAnnotations(...)");
        for (java.lang.annotation.Annotation annotation : annotationArrQdg) {
            p247y7.AbstractC7350t.c(annotation);
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(java.lang.Class cls, g8.t.d dVar) throws java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cls, "klass");
        p247y7.AbstractC7350t.f(dVar, "memberVisitor");
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
