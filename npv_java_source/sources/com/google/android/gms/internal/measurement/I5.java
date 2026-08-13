package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class I5 implements java.security.PrivilegedExceptionAction {
    I5() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ java.lang.Object run() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
