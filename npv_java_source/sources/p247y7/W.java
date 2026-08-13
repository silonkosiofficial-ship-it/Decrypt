package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W {
    public static java.util.Collection a(java.lang.Object obj) {
        if ((obj instanceof p256z7.a) && !(obj instanceof p256z7.b)) {
            r(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static java.lang.Iterable b(java.lang.Object obj) {
        if ((obj instanceof p256z7.a) && !(obj instanceof p256z7.c)) {
            r(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static java.util.List c(java.lang.Object obj) {
        if ((obj instanceof p256z7.a) && !(obj instanceof p256z7.d)) {
            r(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static java.util.Map d(java.lang.Object obj) {
        if ((obj instanceof p256z7.a) && !(obj instanceof p256z7.e)) {
            r(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static java.util.Set e(java.lang.Object obj) {
        if ((obj instanceof p256z7.a) && !(obj instanceof p256z7.f)) {
            r(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static java.lang.Object f(java.lang.Object obj, int i6) {
        if (obj != null && !m(obj, i6)) {
            r(obj, "kotlin.jvm.functions.Function" + i6);
        }
        return obj;
    }

    public static java.util.Collection g(java.lang.Object obj) {
        try {
            return (java.util.Collection) obj;
        } catch (java.lang.ClassCastException e6) {
            throw q(e6);
        }
    }

    public static java.lang.Iterable h(java.lang.Object obj) {
        try {
            return (java.lang.Iterable) obj;
        } catch (java.lang.ClassCastException e6) {
            throw q(e6);
        }
    }

    public static java.util.List i(java.lang.Object obj) {
        try {
            return (java.util.List) obj;
        } catch (java.lang.ClassCastException e6) {
            throw q(e6);
        }
    }

    public static java.util.Map j(java.lang.Object obj) {
        try {
            return (java.util.Map) obj;
        } catch (java.lang.ClassCastException e6) {
            throw q(e6);
        }
    }

    public static java.util.Set k(java.lang.Object obj) {
        try {
            return (java.util.Set) obj;
        } catch (java.lang.ClassCastException e6) {
            throw q(e6);
        }
    }

    public static int l(java.lang.Object obj) {
        if (obj instanceof p247y7.InterfaceC7346o) {
            return ((p247y7.InterfaceC7346o) obj).c();
        }
        if (obj instanceof p237x7.a) {
            return 0;
        }
        if (obj instanceof p237x7.l) {
            return 1;
        }
        if (obj instanceof p237x7.p) {
            return 2;
        }
        if (obj instanceof p237x7.q) {
            return 3;
        }
        if (obj instanceof p237x7.r) {
            return 4;
        }
        if (obj instanceof p237x7.s) {
            return 5;
        }
        if (obj instanceof p237x7.t) {
            return 6;
        }
        if (obj instanceof p237x7.u) {
            return 7;
        }
        if (obj instanceof p237x7.v) {
            return 8;
        }
        if (obj instanceof p237x7.w) {
            return 9;
        }
        if (obj instanceof p237x7.b) {
            return 10;
        }
        if (obj instanceof p237x7.c) {
            return 11;
        }
        if (obj instanceof p237x7.d) {
            return 12;
        }
        if (obj instanceof p237x7.e) {
            return 13;
        }
        if (obj instanceof p237x7.f) {
            return 14;
        }
        if (obj instanceof p237x7.g) {
            return 15;
        }
        if (obj instanceof p237x7.h) {
            return 16;
        }
        if (obj instanceof p237x7.i) {
            return 17;
        }
        if (obj instanceof p237x7.j) {
            return 18;
        }
        if (obj instanceof p237x7.k) {
            return 19;
        }
        if (obj instanceof p237x7.m) {
            return 20;
        }
        if (obj instanceof p237x7.n) {
            return 21;
        }
        return obj instanceof p237x7.o ? 22 : -1;
    }

    public static boolean m(java.lang.Object obj, int i6) {
        return (obj instanceof p087i7.InterfaceC6663i) && l(obj) == i6;
    }

    public static boolean n(java.lang.Object obj) {
        return (obj instanceof java.util.List) && (!(obj instanceof p256z7.a) || (obj instanceof p256z7.d));
    }

    public static boolean o(java.lang.Object obj) {
        return (obj instanceof java.util.Set) && (!(obj instanceof p256z7.a) || (obj instanceof p256z7.f));
    }

    private static java.lang.Throwable p(java.lang.Throwable th) {
        return p247y7.AbstractC7350t.k(th, p247y7.W.class.getName());
    }

    public static java.lang.ClassCastException q(java.lang.ClassCastException classCastException) {
        throw ((java.lang.ClassCastException) p(classCastException));
    }

    public static void r(java.lang.Object obj, java.lang.String str) {
        s((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void s(java.lang.String str) {
        throw q(new java.lang.ClassCastException(str));
    }
}
