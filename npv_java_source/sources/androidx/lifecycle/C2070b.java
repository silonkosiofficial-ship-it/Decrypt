package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2070b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static androidx.lifecycle.C2070b f22806c = new androidx.lifecycle.C2070b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f22807a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f22808b = new java.util.HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.Map f22809a = new java.util.HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.Map f22810b;

        a(java.util.Map map) {
            this.f22810b = map;
            for (java.util.Map.Entry entry : map.entrySet()) {
                androidx.lifecycle.AbstractC2079k.a aVar = (androidx.lifecycle.AbstractC2079k.a) entry.getValue();
                java.util.List arrayList = (java.util.List) this.f22809a.get(aVar);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    this.f22809a.put(aVar, arrayList);
                }
                arrayList.add((androidx.lifecycle.C2070b.C0428b) entry.getKey());
            }
        }

        private static void b(java.util.List list, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar, java.lang.Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((androidx.lifecycle.C2070b.C0428b) list.get(size)).a(rVar, aVar, obj);
                }
            }
        }

        void a(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar, java.lang.Object obj) {
            b((java.util.List) this.f22809a.get(aVar), rVar, aVar, obj);
            b((java.util.List) this.f22809a.get(androidx.lifecycle.AbstractC2079k.a.ON_ANY), rVar, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0428b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f22811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.reflect.Method f22812b;

        C0428b(int i6, java.lang.reflect.Method method) {
            this.f22811a = i6;
            this.f22812b = method;
            method.setAccessible(true);
        }

        void a(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar, java.lang.Object obj) {
            try {
                int i6 = this.f22811a;
                if (i6 == 0) {
                    this.f22812b.invoke(obj, null);
                } else if (i6 == 1) {
                    this.f22812b.invoke(obj, rVar);
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    this.f22812b.invoke(obj, rVar, aVar);
                }
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.RuntimeException(e6);
            } catch (java.lang.reflect.InvocationTargetException e10) {
                throw new java.lang.RuntimeException("Failed to call observer method", e10.getCause());
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.lifecycle.C2070b.C0428b)) {
                return false;
            }
            androidx.lifecycle.C2070b.C0428b c0428b = (androidx.lifecycle.C2070b.C0428b) obj;
            return this.f22811a == c0428b.f22811a && this.f22812b.getName().equals(c0428b.f22812b.getName());
        }

        public int hashCode() {
            return (this.f22811a * 31) + this.f22812b.getName().hashCode();
        }
    }

    C2070b() {
    }

    private androidx.lifecycle.C2070b.a a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i6;
        androidx.lifecycle.C2070b.a aVarC;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap map = new java.util.HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f22810b);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            for (java.util.Map.Entry entry : c(cls2).f22810b.entrySet()) {
                e(map, (androidx.lifecycle.C2070b.C0428b) entry.getKey(), (androidx.lifecycle.AbstractC2079k.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z6 = false;
        for (java.lang.reflect.Method method : methodArr) {
            androidx.lifecycle.B b6 = (androidx.lifecycle.B) method.getAnnotation(androidx.lifecycle.B.class);
            if (b6 != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i6 = 0;
                } else {
                    if (!androidx.lifecycle.r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i6 = 1;
                }
                androidx.lifecycle.AbstractC2079k.a aVarValue = b6.value();
                if (parameterTypes.length > 1) {
                    if (!androidx.lifecycle.AbstractC2079k.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != androidx.lifecycle.AbstractC2079k.a.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i6 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new androidx.lifecycle.C2070b.C0428b(i6, method), aVarValue, cls);
                z6 = true;
            }
        }
        androidx.lifecycle.C2070b.a aVar = new androidx.lifecycle.C2070b.a(map);
        this.f22807a.put(cls, aVar);
        this.f22808b.put(cls, java.lang.Boolean.valueOf(z6));
        return aVar;
    }

    private java.lang.reflect.Method[] b(java.lang.Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (java.lang.NoClassDefFoundError e6) {
            throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
        }
    }

    private void e(java.util.Map map, androidx.lifecycle.C2070b.C0428b c0428b, androidx.lifecycle.AbstractC2079k.a aVar, java.lang.Class cls) {
        androidx.lifecycle.AbstractC2079k.a aVar2 = (androidx.lifecycle.AbstractC2079k.a) map.get(c0428b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0428b, aVar);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + c0428b.f22812b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    androidx.lifecycle.C2070b.a c(java.lang.Class cls) {
        androidx.lifecycle.C2070b.a aVar = (androidx.lifecycle.C2070b.a) this.f22807a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(java.lang.Class cls) {
        java.lang.Boolean bool = (java.lang.Boolean) this.f22808b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.reflect.Method[] methodArrB = b(cls);
        for (java.lang.reflect.Method method : methodArrB) {
            if (((androidx.lifecycle.B) method.getAnnotation(androidx.lifecycle.B.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f22808b.put(cls, java.lang.Boolean.FALSE);
        return false;
    }
}
