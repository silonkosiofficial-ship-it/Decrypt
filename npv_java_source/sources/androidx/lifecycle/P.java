package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.List f22780a = p097j7.AbstractC6879v.p(android.app.Application.class, androidx.lifecycle.I.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.List f22781b = p097j7.AbstractC6879v.e(androidx.lifecycle.I.class);

    public static final java.lang.reflect.Constructor c(java.lang.Class cls, java.util.List list) {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        p247y7.AbstractC7350t.f(list, "signature");
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        p247y7.AbstractC7350t.e(constructors, "modelClass.constructors");
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            p247y7.AbstractC7350t.e(parameterTypes, "constructor.parameterTypes");
            java.util.List listR0 = p097j7.AbstractC6872n.R0(parameterTypes);
            if (p247y7.AbstractC7350t.b(list, listR0)) {
                p247y7.AbstractC7350t.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listR0.size() && listR0.containsAll(list)) {
                throw new java.lang.UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final androidx.lifecycle.T d(java.lang.Class cls, java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        p247y7.AbstractC7350t.f(constructor, "constructor");
        p247y7.AbstractC7350t.f(objArr, "params");
        try {
            return (androidx.lifecycle.T) constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Failed to access " + cls, e6);
        } catch (java.lang.InstantiationException e10) {
            throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (java.lang.reflect.InvocationTargetException e11) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
