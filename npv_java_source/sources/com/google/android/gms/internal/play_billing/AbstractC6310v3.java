package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6310v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.AbstractC6333z3 f41663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41664b = 0;

    static {
        int i6 = com.google.android.gms.internal.play_billing.C6281q3.f41638d;
        f41663a = new com.google.android.gms.internal.play_billing.B3();
    }

    public static void A(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.C(i6, list, z6);
    }

    public static void B(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.r(i6, list, z6);
    }

    public static void C(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.z(i6, list, z6);
    }

    public static void D(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.l(i6, list, z6);
    }

    public static void E(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.q(i6, list, z6);
    }

    public static void a(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.u(i6, list, z6);
    }

    public static void b(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.B(i6, list, z6);
    }

    public static void c(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.p(i6, list, z6);
    }

    public static void d(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.x(i6, list, z6);
    }

    static boolean e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(java.util.List list) {
        int iA;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.M2) {
            com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
            iA = 0;
            while (i6 < size) {
                iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(m6.e(i6));
                i6++;
            }
        } else {
            iA = 0;
            while (i6 < size) {
                iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iA;
    }

    static int g(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i6 << 3) + 4);
    }

    static int h(java.util.List list) {
        return list.size() * 4;
    }

    static int i(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i6 << 3) + 8);
    }

    static int j(java.util.List list) {
        return list.size() * 8;
    }

    static int k(java.util.List list) {
        int iA;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.M2) {
            com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
            iA = 0;
            while (i6 < size) {
                iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(m6.e(i6));
                i6++;
            }
        } else {
            iA = 0;
            while (i6 < size) {
                iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iA;
    }

    static int l(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Long) list.get(i6)).longValue());
        }
        return iA;
    }

    static int m(int i6, java.lang.Object obj, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        return com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i6 << 3) + com.google.android.gms.internal.play_billing.AbstractC6309v2.x((com.google.android.gms.internal.play_billing.InterfaceC6233i3) obj, interfaceC6298t3);
    }

    static int n(java.util.List list) {
        int iZ;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.M2) {
            com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
            iZ = 0;
            while (i6 < size) {
                int iE = m6.e(i6);
                iZ += com.google.android.gms.internal.play_billing.AbstractC6309v2.z((iE >> 31) ^ (iE + iE));
                i6++;
            }
        } else {
            iZ = 0;
            while (i6 < size) {
                int iIntValue = ((java.lang.Integer) list.get(i6)).intValue();
                iZ += com.google.android.gms.internal.play_billing.AbstractC6309v2.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i6++;
            }
        }
        return iZ;
    }

    static int o(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i6 = 0; i6 < size; i6++) {
            long jLongValue = ((java.lang.Long) list.get(i6)).longValue();
            iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iA;
    }

    static int p(java.util.List list) {
        int iZ;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.M2) {
            com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
            iZ = 0;
            while (i6 < size) {
                iZ += com.google.android.gms.internal.play_billing.AbstractC6309v2.z(m6.e(i6));
                i6++;
            }
        } else {
            iZ = 0;
            while (i6 < size) {
                iZ += com.google.android.gms.internal.play_billing.AbstractC6309v2.z(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iZ;
    }

    static int q(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Long) list.get(i6)).longValue());
        }
        return iA;
    }

    public static com.google.android.gms.internal.play_billing.AbstractC6333z3 r() {
        return f41663a;
    }

    static java.lang.Object s(java.lang.Object obj, int i6, int i10, java.lang.Object obj2, com.google.android.gms.internal.play_billing.AbstractC6333z3 abstractC6333z3) {
        com.google.android.gms.internal.play_billing.L2 l6;
        com.google.android.gms.internal.play_billing.A3 a6;
        java.lang.Object obj3 = obj2;
        if (obj2 == null && (a6 = (l6 = (com.google.android.gms.internal.play_billing.L2) obj).zzc) == com.google.android.gms.internal.play_billing.A3.c()) {
            obj3 = a6;
            com.google.android.gms.internal.play_billing.A3 a3F = com.google.android.gms.internal.play_billing.A3.f();
            l6.zzc = a3F;
            obj3 = a3F;
        }
        obj3 = a6;
        ((com.google.android.gms.internal.play_billing.A3) obj3).j(i6 << 3, java.lang.Long.valueOf(i10));
        return obj3;
    }

    static void t(com.google.android.gms.internal.play_billing.B2 b6, java.lang.Object obj, java.lang.Object obj2) {
        androidx.appcompat.app.D.a(obj2);
        throw null;
    }

    static void u(com.google.android.gms.internal.play_billing.AbstractC6333z3 abstractC6333z3, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.L2 l6 = (com.google.android.gms.internal.play_billing.L2) obj;
        com.google.android.gms.internal.play_billing.A3 a3E = l6.zzc;
        com.google.android.gms.internal.play_billing.A3 a6 = ((com.google.android.gms.internal.play_billing.L2) obj2).zzc;
        if (!com.google.android.gms.internal.play_billing.A3.c().equals(a6)) {
            if (com.google.android.gms.internal.play_billing.A3.c().equals(a3E)) {
                a3E = com.google.android.gms.internal.play_billing.A3.e(a3E, a6);
            } else {
                a3E.d(a6);
            }
        }
        l6.zzc = a3E;
    }

    public static void v(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.b(i6, list, z6);
    }

    public static void w(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.h(i6, list, z6);
    }

    public static void x(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.d(i6, list, z6);
    }

    public static void y(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.c(i6, list, z6);
    }

    public static void z(int i6, java.util.List list, com.google.android.gms.internal.play_billing.K3 k6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6.g(i6, list, z6);
    }
}
