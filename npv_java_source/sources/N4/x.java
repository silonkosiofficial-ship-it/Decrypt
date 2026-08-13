package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {
    static boolean a(java.util.List list, java.lang.Object obj) {
        if (obj == M4.h.i(list)) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list2 = (java.util.List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof java.util.RandomAccess) || !(list2 instanceof java.util.RandomAccess)) {
            return N4.w.b(list.iterator(), list2.iterator());
        }
        for (int i6 = 0; i6 < size; i6++) {
            if (!M4.f.a(list.get(i6), list2.get(i6))) {
                return false;
            }
        }
        return true;
    }

    static int b(java.util.List list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return c(list, obj);
        }
        java.util.ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (M4.f.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int c(java.util.List list, java.lang.Object obj) {
        int size = list.size();
        int i6 = 0;
        if (obj == null) {
            while (i6 < size) {
                if (list.get(i6) == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        while (i6 < size) {
            if (obj.equals(list.get(i6))) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    static int d(java.util.List list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return e(list, obj);
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (M4.f.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int e(java.util.List list, java.lang.Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static java.util.ArrayList f() {
        return new java.util.ArrayList();
    }

    public static java.util.ArrayList g(java.util.Iterator it) {
        java.util.ArrayList arrayListF = f();
        N4.w.a(arrayListF, it);
        return arrayListF;
    }
}
