package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2041a implements androidx.datastore.preferences.protobuf.O {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0418a implements androidx.datastore.preferences.protobuf.O.a {
        protected static void e(java.lang.Iterable iterable, java.util.List list) {
            androidx.datastore.preferences.protobuf.AbstractC2064y.a(iterable);
            if (!(iterable instanceof androidx.datastore.preferences.protobuf.D)) {
                if (iterable instanceof androidx.datastore.preferences.protobuf.Y) {
                    list.addAll((java.util.Collection) iterable);
                    return;
                } else {
                    h(iterable, list);
                    return;
                }
            }
            java.util.List listH = ((androidx.datastore.preferences.protobuf.D) iterable).h();
            androidx.datastore.preferences.protobuf.D d6 = (androidx.datastore.preferences.protobuf.D) list;
            int size = list.size();
            for (java.lang.Object obj : listH) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (d6.size() - size) + " is null.";
                    for (int size2 = d6.size() - 1; size2 >= size; size2--) {
                        d6.remove(size2);
                    }
                    throw new java.lang.NullPointerException(str);
                }
                if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) {
                    d6.x((androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
                } else {
                    d6.add((java.lang.String) obj);
                }
            }
        }

        private static void h(java.lang.Iterable iterable, java.util.List list) {
            if ((list instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + ((java.util.Collection) iterable).size());
            }
            int size = list.size();
            for (java.lang.Object obj : iterable) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new java.lang.NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static androidx.datastore.preferences.protobuf.k0 j(androidx.datastore.preferences.protobuf.O o6) {
            return new androidx.datastore.preferences.protobuf.k0(o6);
        }
    }

    protected static void e(java.lang.Iterable iterable, java.util.List list) {
        androidx.datastore.preferences.protobuf.AbstractC2041a.AbstractC0418a.e(iterable, list);
    }

    abstract int f(androidx.datastore.preferences.protobuf.e0 e0Var);

    androidx.datastore.preferences.protobuf.k0 g() {
        return new androidx.datastore.preferences.protobuf.k0(this);
    }

    public void h(java.io.OutputStream outputStream) {
        androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050jY = androidx.datastore.preferences.protobuf.AbstractC2050j.Y(outputStream, androidx.datastore.preferences.protobuf.AbstractC2050j.C(b()));
        d(abstractC2050jY);
        abstractC2050jY.V();
    }
}
