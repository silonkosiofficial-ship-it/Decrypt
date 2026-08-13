package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Field f17358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f17359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.Class f17360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f17361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.lang.reflect.Field f17362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f17363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static java.lang.reflect.Field f17364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f17365h;

    static class a {
        static void a(android.util.LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    static void a(android.content.res.Resources resources) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            return;
        }
        if (i6 >= 24) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(android.content.res.Resources resources) {
        java.lang.Object obj;
        if (!f17359b) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mDrawableCache");
                f17358a = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e6) {
            }
            f17359b = true;
        }
        java.lang.reflect.Field field = f17358a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (java.lang.IllegalAccessException e10) {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        d(obj);
    }

    private static void c(android.content.res.Resources resources) {
        java.lang.Object obj;
        if (!f17365h) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mResourcesImpl");
                f17364g = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e6) {
            }
            f17365h = true;
        }
        java.lang.reflect.Field field = f17364g;
        if (field == null) {
            return;
        }
        java.lang.Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (java.lang.IllegalAccessException e10) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f17359b) {
            try {
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f17358a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e11) {
            }
            f17359b = true;
        }
        java.lang.reflect.Field field2 = f17358a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (java.lang.IllegalAccessException e12) {
            }
        }
        if (obj2 != null) {
            d(obj2);
        }
    }

    private static void d(java.lang.Object obj) {
        android.util.LongSparseArray longSparseArray;
        if (!f17361d) {
            try {
                f17360c = java.lang.Class.forName("android.content.res.ThemedResourceCache");
            } catch (java.lang.ClassNotFoundException e6) {
            }
            f17361d = true;
        }
        java.lang.Class cls = f17360c;
        if (cls == null) {
            return;
        }
        if (!f17363f) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f17362e = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e10) {
            }
            f17363f = true;
        }
        java.lang.reflect.Field field = f17362e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (android.util.LongSparseArray) field.get(obj);
        } catch (java.lang.IllegalAccessException e11) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            androidx.appcompat.app.A.a.a(longSparseArray);
        }
    }
}
