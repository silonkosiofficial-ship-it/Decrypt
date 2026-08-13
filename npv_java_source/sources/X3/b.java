package X3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends X3.a.AbstractBinderC0301a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f15863C;

    private b(java.lang.Object obj) {
        this.f15863C = obj;
    }

    public static java.lang.Object L0(X3.a aVar) {
        if (aVar instanceof X3.b) {
            return ((X3.b) aVar).f15863C;
        }
        android.os.IBinder iBinderAsBinder = aVar.asBinder();
        java.lang.reflect.Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i6 = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i6++;
                field = field2;
            }
        }
        if (i6 != 1) {
            throw new java.lang.IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        Q3.AbstractC1477p.l(field);
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e6);
        } catch (java.lang.NullPointerException e10) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e10);
        }
    }

    public static X3.a c2(java.lang.Object obj) {
        return new X3.b(obj);
    }
}
