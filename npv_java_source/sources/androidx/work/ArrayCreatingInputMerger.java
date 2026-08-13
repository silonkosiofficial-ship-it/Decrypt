package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends I2.h {
    private java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        int length = java.lang.reflect.Array.getLength(obj);
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(obj2.getClass(), length + 1);
        java.lang.System.arraycopy(obj, 0, objNewInstance, 0, length);
        java.lang.reflect.Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }

    private java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        int length = java.lang.reflect.Array.getLength(obj);
        int length2 = java.lang.reflect.Array.getLength(obj2);
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(obj.getClass().getComponentType(), length + length2);
        java.lang.System.arraycopy(obj, 0, objNewInstance, 0, length);
        java.lang.System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    private java.lang.Object e(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(obj.getClass(), 2);
        java.lang.reflect.Array.set(objNewInstance, 0, obj);
        java.lang.reflect.Array.set(objNewInstance, 1, obj2);
        return objNewInstance;
    }

    private java.lang.Object f(java.lang.Object obj) {
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(obj.getClass(), 1);
        java.lang.reflect.Array.set(objNewInstance, 0, obj);
        return objNewInstance;
    }

    @Override // I2.h
    public androidx.work.b b(java.util.List list) {
        androidx.work.b.a aVar = new androidx.work.b.a();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((androidx.work.b) it.next()).h().entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.Class<?> cls = value.getClass();
                java.lang.Object obj = map.get(str);
                if (obj != null) {
                    java.lang.Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? d(obj, value) : e(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = c(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        value = c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = f(value);
                }
                map.put(str, value);
            }
        }
        aVar.d(map);
        return aVar.a();
    }
}
