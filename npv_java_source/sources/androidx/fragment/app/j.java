package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p170r.Y f22564a = new p170r.Y();

    static boolean b(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return androidx.fragment.app.f.class.isAssignableFrom(c(classLoader, str));
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    private static java.lang.Class c(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.ClassNotFoundException {
        p170r.Y y6 = f22564a;
        p170r.Y y10 = (p170r.Y) y6.get(classLoader);
        if (y10 == null) {
            y10 = new p170r.Y();
            y6.put(classLoader, y10);
        }
        java.lang.Class cls = (java.lang.Class) y10.get(str);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        y10.put(str, cls2);
        return cls2;
    }

    public static java.lang.Class d(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return c(classLoader, str);
        } catch (java.lang.ClassCastException e6) {
            throw new androidx.fragment.app.f.i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e6);
        } catch (java.lang.ClassNotFoundException e10) {
            throw new androidx.fragment.app.f.i("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        }
    }

    public abstract androidx.fragment.app.f a(java.lang.ClassLoader classLoader, java.lang.String str);
}
