package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
abstract class b implements java.util.Collection, java.io.Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.util.concurrent.ConcurrentHashMap f48073a;

    b(j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f48073a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f48073a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(java.lang.Object obj);

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if (collection == this) {
            return true;
        }
        for (java.lang.Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f48073a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract java.util.Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(java.lang.Object obj);

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        j$.util.concurrent.l[] lVarArr = this.f48073a.f48058a;
        boolean zRemove = false;
        if (lVarArr == null) {
            return false;
        }
        if (!(collection instanceof java.util.Set) || collection.size() <= lVarArr.length) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
        } else {
            java.util.Iterator it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    zRemove = true;
                }
            }
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator it = iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f48073a.size();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        long j6 = this.f48073a.j();
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 > 2147483639) {
            throw new java.lang.OutOfMemoryError("Required array size too large");
        }
        int i6 = (int) j6;
        java.lang.Object[] objArrCopyOf = new java.lang.Object[i6];
        int i10 = 0;
        for (java.lang.Object obj : this) {
            if (i10 == i6) {
                if (i6 >= 2147483639) {
                    throw new java.lang.OutOfMemoryError("Required array size too large");
                }
                int i11 = i6 < 1073741819 ? (i6 >>> 1) + 1 + i6 : 2147483639;
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i11);
                i6 = i11;
            }
            objArrCopyOf[i10] = obj;
            i10++;
        }
        return i10 == i6 ? objArrCopyOf : java.util.Arrays.copyOf(objArrCopyOf, i10);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        long j6 = this.f48073a.j();
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 > 2147483639) {
            throw new java.lang.OutOfMemoryError("Required array size too large");
        }
        int i6 = (int) j6;
        java.lang.Object[] objArrCopyOf = objArr.length >= i6 ? objArr : (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i6);
        int length = objArrCopyOf.length;
        int i10 = 0;
        for (java.lang.Object obj : this) {
            if (i10 == length) {
                if (length >= 2147483639) {
                    throw new java.lang.OutOfMemoryError("Required array size too large");
                }
                int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i11);
                length = i11;
            }
            objArrCopyOf[i10] = obj;
            i10++;
        }
        if (objArr != objArrCopyOf || i10 >= length) {
            return i10 == length ? objArrCopyOf : java.util.Arrays.copyOf(objArrCopyOf, i10);
        }
        objArrCopyOf[i10] = null;
        return objArrCopyOf;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                java.lang.Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
