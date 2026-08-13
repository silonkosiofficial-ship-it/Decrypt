package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.E f21927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.E f21928b;

    private static final class b extends androidx.datastore.preferences.protobuf.E {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final java.lang.Class f21929c = j$.util.DesugarCollections.unmodifiableList(java.util.Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static java.util.List f(java.lang.Object obj, long j6) {
            return (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, j6);
        }

        private static java.util.List g(java.lang.Object obj, long j6, int i6) {
            java.util.List listU;
            java.util.List list;
            java.util.List listF = f(obj, j6);
            if (!listF.isEmpty()) {
                if (f21929c.isAssignableFrom(listF.getClass())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(listF.size() + i6);
                    arrayList.addAll(listF);
                    list = arrayList;
                } else if (listF instanceof androidx.datastore.preferences.protobuf.o0) {
                    androidx.datastore.preferences.protobuf.C c6 = new androidx.datastore.preferences.protobuf.C(listF.size() + i6);
                    c6.addAll((androidx.datastore.preferences.protobuf.o0) listF);
                    list = c6;
                } else {
                    if (!(listF instanceof androidx.datastore.preferences.protobuf.Y) || !(listF instanceof androidx.datastore.preferences.protobuf.AbstractC2064y.b)) {
                        return listF;
                    }
                    androidx.datastore.preferences.protobuf.AbstractC2064y.b bVar = (androidx.datastore.preferences.protobuf.AbstractC2064y.b) listF;
                    if (bVar.I()) {
                        return listF;
                    }
                    listU = bVar.u(listF.size() + i6);
                }
                androidx.datastore.preferences.protobuf.p0.R(obj, j6, list);
                return list;
            }
            if (listF instanceof androidx.datastore.preferences.protobuf.D) {
                listU = new androidx.datastore.preferences.protobuf.C(i6);
            } else {
                listU = ((listF instanceof androidx.datastore.preferences.protobuf.Y) && (listF instanceof androidx.datastore.preferences.protobuf.AbstractC2064y.b)) ? ((androidx.datastore.preferences.protobuf.AbstractC2064y.b) listF).u(i6) : new java.util.ArrayList(i6);
            }
            androidx.datastore.preferences.protobuf.p0.R(obj, j6, listU);
            return listU;
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void c(java.lang.Object obj, long j6) {
            java.lang.Object objUnmodifiableList;
            java.util.List list = (java.util.List) androidx.datastore.preferences.protobuf.p0.C(obj, j6);
            if (list instanceof androidx.datastore.preferences.protobuf.D) {
                objUnmodifiableList = ((androidx.datastore.preferences.protobuf.D) list).l();
            } else {
                if (f21929c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof androidx.datastore.preferences.protobuf.Y) && (list instanceof androidx.datastore.preferences.protobuf.AbstractC2064y.b)) {
                    androidx.datastore.preferences.protobuf.AbstractC2064y.b bVar = (androidx.datastore.preferences.protobuf.AbstractC2064y.b) list;
                    if (bVar.I()) {
                        bVar.q();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(list);
            }
            androidx.datastore.preferences.protobuf.p0.R(obj, j6, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void d(java.lang.Object obj, java.lang.Object obj2, long j6) {
            java.util.List listF = f(obj2, j6);
            java.util.List listG = g(obj, j6, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            androidx.datastore.preferences.protobuf.p0.R(obj, j6, listF);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        java.util.List e(java.lang.Object obj, long j6) {
            return g(obj, j6, 10);
        }
    }

    private static final class c extends androidx.datastore.preferences.protobuf.E {
        private c() {
            super();
        }

        static androidx.datastore.preferences.protobuf.AbstractC2064y.b f(java.lang.Object obj, long j6) {
            return (androidx.datastore.preferences.protobuf.AbstractC2064y.b) androidx.datastore.preferences.protobuf.p0.C(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void c(java.lang.Object obj, long j6) {
            f(obj, j6).q();
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void d(java.lang.Object obj, java.lang.Object obj2, long j6) {
            androidx.datastore.preferences.protobuf.AbstractC2064y.b bVarF = f(obj, j6);
            androidx.datastore.preferences.protobuf.AbstractC2064y.b bVarF2 = f(obj2, j6);
            int size = bVarF.size();
            int size2 = bVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!bVarF.I()) {
                    bVarF = bVarF.u(size2 + size);
                }
                bVarF.addAll(bVarF2);
            }
            if (size > 0) {
                bVarF2 = bVarF;
            }
            androidx.datastore.preferences.protobuf.p0.R(obj, j6, bVarF2);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        java.util.List e(java.lang.Object obj, long j6) {
            androidx.datastore.preferences.protobuf.AbstractC2064y.b bVarF = f(obj, j6);
            if (bVarF.I()) {
                return bVarF;
            }
            int size = bVarF.size();
            androidx.datastore.preferences.protobuf.AbstractC2064y.b bVarU = bVarF.u(size == 0 ? 10 : size * 2);
            androidx.datastore.preferences.protobuf.p0.R(obj, j6, bVarU);
            return bVarU;
        }
    }

    static {
        f21927a = new androidx.datastore.preferences.protobuf.E.b();
        f21928b = new androidx.datastore.preferences.protobuf.E.c();
    }

    private E() {
    }

    static androidx.datastore.preferences.protobuf.E a() {
        return f21927a;
    }

    static androidx.datastore.preferences.protobuf.E b() {
        return f21928b;
    }

    abstract void c(java.lang.Object obj, long j6);

    abstract void d(java.lang.Object obj, java.lang.Object obj2, long j6);

    abstract java.util.List e(java.lang.Object obj, long j6);
}
