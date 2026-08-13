package Z2;

/* JADX INFO: loaded from: classes.dex */
class k implements Z2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z2.k.a f16693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z2.i f16694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f16695c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f16696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Map f16697b = null;

        a(android.content.Context context) {
            this.f16696a = context;
        }

        private java.util.Map a(android.content.Context context) {
            android.os.Bundle bundleD = d(context);
            if (bundleD == null) {
                return java.util.Collections.emptyMap();
            }
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : bundleD.keySet()) {
                java.lang.Object obj = bundleD.get(str);
                if ((obj instanceof java.lang.String) && str.startsWith("backend:")) {
                    for (java.lang.String str2 : ((java.lang.String) obj).split(",", -1)) {
                        java.lang.String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private java.util.Map c() {
            if (this.f16697b == null) {
                this.f16697b = a(this.f16696a);
            }
            return this.f16697b;
        }

        private static android.os.Bundle d(android.content.Context context) {
            android.content.pm.ServiceInfo serviceInfo;
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class), 128)) != null) {
                    return serviceInfo.metaData;
                }
                return null;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        Z2.d b(java.lang.String str) {
            java.lang.String str2 = (java.lang.String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (Z2.d) java.lang.Class.forName(str2).asSubclass(Z2.d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.ClassNotFoundException e6) {
                java.lang.String.format("Class %s is not found.", str2);
                return null;
            } catch (java.lang.IllegalAccessException e10) {
                java.lang.String.format("Could not instantiate %s.", str2);
                return null;
            } catch (java.lang.InstantiationException e11) {
                java.lang.String.format("Could not instantiate %s.", str2);
                return null;
            } catch (java.lang.NoSuchMethodException e12) {
                java.lang.String.format("Could not instantiate %s", str2);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e13) {
                java.lang.String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    k(Z2.k.a aVar, Z2.i iVar) {
        this.f16695c = new java.util.HashMap();
        this.f16693a = aVar;
        this.f16694b = iVar;
    }

    k(android.content.Context context, Z2.i iVar) {
        this(new Z2.k.a(context), iVar);
    }

    @Override // Z2.e
    public synchronized Z2.m d(java.lang.String str) {
        if (this.f16695c.containsKey(str)) {
            return (Z2.m) this.f16695c.get(str);
        }
        Z2.d dVarB = this.f16693a.b(str);
        if (dVarB == null) {
            return null;
        }
        Z2.m mVarCreate = dVarB.create(this.f16694b.a(str));
        this.f16695c.put(str, mVarCreate);
        return mVarCreate;
    }
}
