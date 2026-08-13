package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final A.AbstractC0780n a(A.H h6) {
        if (h6 != null) {
            return h6.a();
        }
        return null;
    }

    public static final boolean b(A.H h6) {
        if (h6 != null) {
            return h6.b();
        }
        return true;
    }

    public static final A.H c(D0.InterfaceC0895n interfaceC0895n) {
        java.lang.Object objZ = interfaceC0895n.Z();
        if (objZ instanceof A.H) {
            return (A.H) objZ;
        }
        return null;
    }

    public static final A.H d(D0.X x6) {
        java.lang.Object objZ = x6.Z();
        if (objZ instanceof A.H) {
            return (A.H) objZ;
        }
        return null;
    }

    public static final float e(A.H h6) {
        if (h6 != null) {
            return h6.d();
        }
        return 0.0f;
    }

    public static final boolean f(A.H h6) {
        A.AbstractC0780n abstractC0780nA = a(h6);
        if (abstractC0780nA != null) {
            return abstractC0780nA.c();
        }
        return false;
    }
}
