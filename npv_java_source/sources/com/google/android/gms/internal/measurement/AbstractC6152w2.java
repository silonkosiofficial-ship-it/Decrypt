package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6152w2 {
    public static double a(double d6) {
        if (java.lang.Double.isNaN(d6)) {
            return 0.0d;
        }
        if (java.lang.Double.isInfinite(d6) || d6 == 0.0d || d6 == -0.0d) {
            return d6;
        }
        return ((double) (d6 > 0.0d ? 1 : -1)) * java.lang.Math.floor(java.lang.Math.abs(d6));
    }

    public static int b(com.google.android.gms.internal.measurement.C5963a3 c5963a3) {
        int i6 = i(c5963a3.c("runtime.counter").d().doubleValue() + 1.0d);
        if (i6 > 1000000) {
            throw new java.lang.IllegalStateException("Instructions allowed exceeded");
        }
        c5963a3.h("runtime.counter", new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(i6)));
        return i6;
    }

    public static com.google.android.gms.internal.measurement.Z c(java.lang.String str) {
        com.google.android.gms.internal.measurement.Z zE = (str == null || str.isEmpty()) ? null : com.google.android.gms.internal.measurement.Z.e(java.lang.Integer.parseInt(str));
        if (zE != null) {
            return zE;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported commandId %s", str));
    }

    public static java.lang.Object d(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (com.google.android.gms.internal.measurement.InterfaceC6117s.f41175p.equals(interfaceC6117s)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o.equals(interfaceC6117s)) {
            return "";
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.r) {
            return e((com.google.android.gms.internal.measurement.r) interfaceC6117s);
        }
        if (!(interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6013g)) {
            return !interfaceC6117s.d().isNaN() ? interfaceC6117s.d() : interfaceC6117s.e();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((com.google.android.gms.internal.measurement.C6013g) interfaceC6117s).iterator();
        while (it.hasNext()) {
            java.lang.Object objD = d((com.google.android.gms.internal.measurement.InterfaceC6117s) it.next());
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        return arrayList;
    }

    public static java.util.Map e(com.google.android.gms.internal.measurement.r rVar) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : rVar.a()) {
            java.lang.Object objD = d(rVar.o(str));
            if (objD != null) {
                map.put(str, objD);
            }
        }
        return map;
    }

    public static void f(com.google.android.gms.internal.measurement.Z z6, int i6, java.util.List list) {
        g(z6.name(), i6, list);
    }

    public static void g(java.lang.String str, int i6, java.util.List list) {
        if (list.size() != i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires %s parameters found %s", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static boolean h(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2) {
        if (!interfaceC6117s.getClass().equals(interfaceC6117s2.getClass())) {
            return false;
        }
        if ((interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6173z) || (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6102q)) {
            return true;
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6049k) {
            if (java.lang.Double.isNaN(interfaceC6117s.d().doubleValue()) || java.lang.Double.isNaN(interfaceC6117s2.d().doubleValue())) {
                return false;
            }
            return interfaceC6117s.d().equals(interfaceC6117s2.d());
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6133u) {
            return interfaceC6117s.e().equals(interfaceC6117s2.e());
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6022h) {
            return interfaceC6117s.f().equals(interfaceC6117s2.f());
        }
        return interfaceC6117s == interfaceC6117s2;
    }

    public static int i(double d6) {
        if (java.lang.Double.isNaN(d6) || java.lang.Double.isInfinite(d6) || d6 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d6 > 0.0d ? 1 : -1)) * java.lang.Math.floor(java.lang.Math.abs(d6))) % 4.294967296E9d);
    }

    public static void j(com.google.android.gms.internal.measurement.Z z6, int i6, java.util.List list) {
        k(z6.name(), i6, list);
    }

    public static void k(java.lang.String str, int i6, java.util.List list) {
        if (list.size() < i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires at least %s parameters found %s", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static boolean l(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (interfaceC6117s == null) {
            return false;
        }
        java.lang.Double d6 = interfaceC6117s.d();
        return !d6.isNaN() && d6.doubleValue() >= 0.0d && d6.equals(java.lang.Double.valueOf(java.lang.Math.floor(d6.doubleValue())));
    }

    public static long m(double d6) {
        return ((long) i(d6)) & 4294967295L;
    }

    public static void n(java.lang.String str, int i6, java.util.List list) {
        if (list.size() > i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires at most %s parameters found %s", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(list.size())));
        }
    }
}
