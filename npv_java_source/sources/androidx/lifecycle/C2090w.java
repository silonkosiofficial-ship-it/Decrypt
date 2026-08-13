package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2090w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.lifecycle.C2090w f22849a = new androidx.lifecycle.C2090w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f22850b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f22851c = new java.util.HashMap();

    private C2090w() {
    }

    private final androidx.lifecycle.InterfaceC2076h a(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = constructor.newInstance(obj);
            p247y7.AbstractC7350t.e(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            androidx.appcompat.app.D.a(objNewInstance);
            return null;
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException(e6);
        } catch (java.lang.InstantiationException e10) {
            throw new java.lang.RuntimeException(e10);
        } catch (java.lang.reflect.InvocationTargetException e11) {
            throw new java.lang.RuntimeException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.reflect.Constructor b(java.lang.Class cls) {
        try {
            java.lang.Package r6 = cls.getPackage();
            java.lang.String canonicalName = cls.getCanonicalName();
            java.lang.String name = r6 != null ? r6.getName() : "";
            p247y7.AbstractC7350t.e(name, "fullPackage");
            if (name.length() != 0) {
                p247y7.AbstractC7350t.e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                p247y7.AbstractC7350t.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            p247y7.AbstractC7350t.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            java.lang.String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            java.lang.Class<?> cls2 = java.lang.Class.forName(strC);
            p247y7.AbstractC7350t.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            java.lang.reflect.Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.NoSuchMethodException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    public static final java.lang.String c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "className");
        return S8.r.R(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(java.lang.Class cls) {
        java.util.Map map = f22850b;
        java.lang.Integer num = (java.lang.Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, java.lang.Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(java.lang.Class cls) {
        return cls != null && androidx.lifecycle.InterfaceC2085q.class.isAssignableFrom(cls);
    }

    public static final androidx.lifecycle.InterfaceC2083o f(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "object");
        boolean z6 = obj instanceof androidx.lifecycle.InterfaceC2083o;
        boolean z10 = obj instanceof androidx.lifecycle.InterfaceC2073e;
        if (z6 && z10) {
            return new androidx.lifecycle.C2074f((androidx.lifecycle.InterfaceC2073e) obj, (androidx.lifecycle.InterfaceC2083o) obj);
        }
        if (z10) {
            return new androidx.lifecycle.C2074f((androidx.lifecycle.InterfaceC2073e) obj, null);
        }
        if (z6) {
            return (androidx.lifecycle.InterfaceC2083o) obj;
        }
        java.lang.Class<?> cls = obj.getClass();
        androidx.lifecycle.C2090w c2090w = f22849a;
        if (c2090w.d(cls) != 2) {
            return new androidx.lifecycle.E(obj);
        }
        java.lang.Object obj2 = f22851c.get(cls);
        p247y7.AbstractC7350t.c(obj2);
        java.util.List list = (java.util.List) obj2;
        if (list.size() == 1) {
            c2090w.a((java.lang.reflect.Constructor) list.get(0), obj);
            return new androidx.lifecycle.S(null);
        }
        int size = list.size();
        androidx.lifecycle.InterfaceC2076h[] interfaceC2076hArr = new androidx.lifecycle.InterfaceC2076h[size];
        for (int i6 = 0; i6 < size; i6++) {
            f22849a.a((java.lang.reflect.Constructor) list.get(i6), obj);
            interfaceC2076hArr[i6] = null;
        }
        return new androidx.lifecycle.C2071c(interfaceC2076hArr);
    }

    private final int g(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        java.lang.reflect.Constructor constructorB = b(cls);
        if (constructorB != null) {
            f22851c.put(cls, p097j7.AbstractC6879v.e(constructorB));
            return 2;
        }
        if (androidx.lifecycle.C2070b.f22806c.d(cls)) {
            return 1;
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            p247y7.AbstractC7350t.e(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            java.lang.Object obj = f22851c.get(superclass);
            p247y7.AbstractC7350t.c(obj);
            arrayList = new java.util.ArrayList((java.util.Collection) obj);
        } else {
            arrayList = null;
        }
        java.lang.Class<?>[] interfaces = cls.getInterfaces();
        p247y7.AbstractC7350t.e(interfaces, "klass.interfaces");
        for (java.lang.Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                p247y7.AbstractC7350t.e(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                java.lang.Object obj2 = f22851c.get(cls2);
                p247y7.AbstractC7350t.c(obj2);
                arrayList.addAll((java.util.Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f22851c.put(cls, arrayList);
        return 2;
    }
}
