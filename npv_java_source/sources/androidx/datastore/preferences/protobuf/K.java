package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class K implements androidx.datastore.preferences.protobuf.J {
    K() {
    }

    private static int i(int i6, java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.I i10 = (androidx.datastore.preferences.protobuf.I) obj;
        androidx.datastore.preferences.protobuf.H h6 = (androidx.datastore.preferences.protobuf.H) obj2;
        int iA = 0;
        if (i10.isEmpty()) {
            return 0;
        }
        for (java.util.Map.Entry entry : i10.entrySet()) {
            iA += h6.a(i6, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static androidx.datastore.preferences.protobuf.I j(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.I iP = (androidx.datastore.preferences.protobuf.I) obj;
        androidx.datastore.preferences.protobuf.I i6 = (androidx.datastore.preferences.protobuf.I) obj2;
        if (!i6.isEmpty()) {
            if (!iP.k()) {
                iP = iP.p();
            }
            iP.m(i6);
        }
        return iP;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public java.lang.Object b(java.lang.Object obj) {
        ((androidx.datastore.preferences.protobuf.I) obj).l();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public androidx.datastore.preferences.protobuf.H.a c(java.lang.Object obj) {
        return ((androidx.datastore.preferences.protobuf.H) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public java.util.Map d(java.lang.Object obj) {
        return (androidx.datastore.preferences.protobuf.I) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public java.lang.Object e(java.lang.Object obj) {
        return androidx.datastore.preferences.protobuf.I.d().p();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int f(int i6, java.lang.Object obj, java.lang.Object obj2) {
        return i(i6, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean g(java.lang.Object obj) {
        return !((androidx.datastore.preferences.protobuf.I) obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public java.util.Map h(java.lang.Object obj) {
        return (androidx.datastore.preferences.protobuf.I) obj;
    }
}
