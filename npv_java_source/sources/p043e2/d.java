package p043e2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p043e2.d f44638a = new p043e2.d();

    private d() {
    }

    public final androidx.lifecycle.T a(java.lang.Class cls) throws java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        try {
            java.lang.Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            p247y7.AbstractC7350t.e(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (androidx.lifecycle.T) objNewInstance;
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (java.lang.InstantiationException e10) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (java.lang.NoSuchMethodException e11) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }
}
