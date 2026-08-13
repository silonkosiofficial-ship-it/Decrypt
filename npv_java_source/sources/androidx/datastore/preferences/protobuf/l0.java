package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class l0 {
    l0() {
    }

    abstract void a(java.lang.Object obj, int i6, int i10);

    abstract void b(java.lang.Object obj, int i6, long j6);

    abstract void c(java.lang.Object obj, int i6, java.lang.Object obj2);

    abstract void d(java.lang.Object obj, int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g);

    abstract void e(java.lang.Object obj, int i6, long j6);

    abstract java.lang.Object f(java.lang.Object obj);

    abstract java.lang.Object g(java.lang.Object obj);

    abstract int h(java.lang.Object obj);

    abstract int i(java.lang.Object obj);

    abstract void j(java.lang.Object obj);

    abstract java.lang.Object k(java.lang.Object obj, java.lang.Object obj2);

    final void l(java.lang.Object obj, androidx.datastore.preferences.protobuf.d0 d0Var) {
        while (d0Var.A() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    final boolean m(java.lang.Object obj, androidx.datastore.preferences.protobuf.d0 d0Var) throws androidx.datastore.preferences.protobuf.C2065z {
        int iU = d0Var.u();
        int iA = androidx.datastore.preferences.protobuf.r0.a(iU);
        int iB = androidx.datastore.preferences.protobuf.r0.b(iU);
        if (iB == 0) {
            e(obj, iA, d0Var.N());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, d0Var.c());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, d0Var.D());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            a(obj, iA, d0Var.g());
            return true;
        }
        java.lang.Object objN = n();
        int iC = androidx.datastore.preferences.protobuf.r0.c(iA, 4);
        l(objN, d0Var);
        if (iC != d0Var.u()) {
            throw androidx.datastore.preferences.protobuf.C2065z.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract java.lang.Object n();

    abstract void o(java.lang.Object obj, java.lang.Object obj2);

    abstract void p(java.lang.Object obj, java.lang.Object obj2);

    abstract boolean q(androidx.datastore.preferences.protobuf.d0 d0Var);

    abstract java.lang.Object r(java.lang.Object obj);

    abstract void s(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var);

    abstract void t(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var);
}
