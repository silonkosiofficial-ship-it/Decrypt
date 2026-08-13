package p046e5;

/* JADX INFO: renamed from: e5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6534g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f44707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p046e5.C6534g.c f44708b;

    /* JADX INFO: renamed from: e5.g$b */
    private static class b implements p046e5.C6534g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Class f44709a;

        private b(java.lang.Class cls) {
            this.f44709a = cls;
        }

        private android.os.Bundle b(android.content.Context context) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) this.f44709a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                java.lang.String str = this.f44709a + " has no service info.";
                return null;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // p046e5.C6534g.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.util.List a(android.content.Context context) {
            android.os.Bundle bundleB = b(context);
            if (bundleB == null) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: e5.g$c */
    interface c {
        java.util.List a(java.lang.Object obj);
    }

    C6534g(java.lang.Object obj, p046e5.C6534g.c cVar) {
        this.f44707a = obj;
        this.f44708b = cVar;
    }

    public static p046e5.C6534g c(android.content.Context context, java.lang.Class cls) {
        return new p046e5.C6534g(context, new p046e5.C6534g.b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.components.ComponentRegistrar d(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            if (com.google.firebase.components.ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (com.google.firebase.components.ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new p046e5.w(java.lang.String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.String.format("Class %s is not an found.", str);
            return null;
        } catch (java.lang.IllegalAccessException e6) {
            throw new p046e5.w(java.lang.String.format("Could not instantiate %s.", str), e6);
        } catch (java.lang.InstantiationException e10) {
            throw new p046e5.w(java.lang.String.format("Could not instantiate %s.", str), e10);
        } catch (java.lang.NoSuchMethodException e11) {
            throw new p046e5.w(java.lang.String.format("Could not instantiate %s", str), e11);
        } catch (java.lang.reflect.InvocationTargetException e12) {
            throw new p046e5.w(java.lang.String.format("Could not instantiate %s", str), e12);
        }
    }

    public java.util.List b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final java.lang.String str : this.f44708b.a(this.f44707a)) {
            arrayList.add(new F5.b() { // from class: e5.f
                @Override // F5.b
                public final java.lang.Object get() {
                    return p046e5.C6534g.d(str);
                }
            });
        }
        return arrayList;
    }
}
