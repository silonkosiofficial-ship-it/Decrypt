package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6114r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f41170a = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    static com.google.android.gms.internal.measurement.C6018g4 a(java.lang.Class cls) {
        java.lang.String str;
        java.lang.ClassLoader classLoader = com.google.android.gms.internal.measurement.AbstractC6114r4.class.getClassLoader();
        if (cls.equals(com.google.android.gms.internal.measurement.C6018g4.class)) {
            str = f41170a;
        } else {
            if (!cls.getPackage().equals(com.google.android.gms.internal.measurement.AbstractC6114r4.class.getPackage())) {
                throw new java.lang.IllegalArgumentException(cls.getName());
            }
            str = java.lang.String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        androidx.appcompat.app.D.a(java.lang.Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (java.lang.InstantiationException e6) {
                        throw new java.lang.IllegalStateException(e6);
                    }
                } catch (java.lang.IllegalAccessException e10) {
                    throw new java.lang.IllegalStateException(e10);
                }
            } catch (java.lang.NoSuchMethodException e11) {
                throw new java.lang.IllegalStateException(e11);
            } catch (java.lang.reflect.InvocationTargetException e12) {
                throw new java.lang.IllegalStateException(e12);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            java.util.Iterator it = java.util.ServiceLoader.load(com.google.android.gms.internal.measurement.AbstractC6114r4.class, classLoader).iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                try {
                    androidx.appcompat.app.D.a(it.next());
                    throw null;
                } catch (java.util.ServiceConfigurationError e13) {
                    java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.AbstractC5982c4.class.getName()).logp(java.util.logging.Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + cls.getSimpleName(), (java.lang.Throwable) e13);
                }
            }
            if (arrayList.size() == 1) {
                return (com.google.android.gms.internal.measurement.C6018g4) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (com.google.android.gms.internal.measurement.C6018g4) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
            } catch (java.lang.IllegalAccessException e14) {
                throw new java.lang.IllegalStateException(e14);
            } catch (java.lang.NoSuchMethodException e15) {
                throw new java.lang.IllegalStateException(e15);
            } catch (java.lang.reflect.InvocationTargetException e16) {
                throw new java.lang.IllegalStateException(e16);
            }
        }
    }
}
