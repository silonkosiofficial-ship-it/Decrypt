package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6108q5 extends java.util.AbstractMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f41153C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f41154D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.Map f41155E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f41156F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile com.google.android.gms.internal.measurement.C6163x5 f41157G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.Map f41158H;

    private AbstractC6108q5() {
        this.f41155E = java.util.Collections.emptyMap();
        this.f41158H = java.util.Collections.emptyMap();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    private final int c(java.lang.Comparable comparable) {
        int i6;
        int i10;
        int i11;
        int iCompareTo;
        int i12 = this.f41154D;
        int i13 = i12 - 1;
        if (i13 < 0) {
            i6 = 0;
            while (i6 <= i13) {
                i11 = (i6 + i13) / 2;
                iCompareTo = comparable.compareTo((java.lang.Comparable) ((com.google.android.gms.internal.measurement.C6139u5) this.f41153C[i11]).getKey());
                if (iCompareTo < 0) {
                    i13 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i6 = i11 + 1;
                }
            }
            i10 = i6 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo((java.lang.Comparable) ((com.google.android.gms.internal.measurement.C6139u5) this.f41153C[i13]).getKey());
            if (iCompareTo2 > 0) {
                i10 = i12 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i6 = 0;
                while (i6 <= i13) {
                    i11 = (i6 + i13) / 2;
                    iCompareTo = comparable.compareTo((java.lang.Comparable) ((com.google.android.gms.internal.measurement.C6139u5) this.f41153C[i11]).getKey());
                    if (iCompareTo < 0) {
                        i13 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i6 = i11 + 1;
                    }
                }
                i10 = i6 + 1;
            }
        }
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object h(int i6) {
        s();
        java.lang.Object value = ((com.google.android.gms.internal.measurement.C6139u5) this.f41153C[i6]).getValue();
        java.lang.Object[] objArr = this.f41153C;
        java.lang.System.arraycopy(objArr, i6 + 1, objArr, i6, (this.f41154D - i6) - 1);
        this.f41154D--;
        if (!this.f41155E.isEmpty()) {
            java.util.Iterator it = r().entrySet().iterator();
            this.f41153C[this.f41154D] = new com.google.android.gms.internal.measurement.C6139u5(this, (java.util.Map.Entry) it.next());
            this.f41154D++;
            it.remove();
        }
        return value;
    }

    private final java.util.SortedMap r() {
        s();
        if (this.f41155E.isEmpty() && !(this.f41155E instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f41155E = treeMap;
            this.f41158H = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f41155E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f41156F) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.f41154D;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        s();
        if (this.f41154D != 0) {
            this.f41153C = null;
            this.f41154D = 0;
        }
        if (this.f41155E.isEmpty()) {
            return;
        }
        this.f41155E.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return c(comparable) >= 0 || this.f41155E.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        s();
        int iC = c(comparable);
        if (iC >= 0) {
            return ((com.google.android.gms.internal.measurement.C6139u5) this.f41153C[iC]).setValue(obj);
        }
        s();
        if (this.f41153C == null) {
            this.f41153C = new java.lang.Object[16];
        }
        int i6 = -(iC + 1);
        if (i6 >= 16) {
            return r().put(comparable, obj);
        }
        int i10 = this.f41154D;
        if (i10 == 16) {
            com.google.android.gms.internal.measurement.C6139u5 c6139u5 = (com.google.android.gms.internal.measurement.C6139u5) this.f41153C[15];
            this.f41154D = i10 - 1;
            r().put((java.lang.Comparable) c6139u5.getKey(), c6139u5.getValue());
        }
        java.lang.Object[] objArr = this.f41153C;
        java.lang.System.arraycopy(objArr, i6, objArr, i6 + 1, (objArr.length - i6) - 1);
        this.f41153C[i6] = new com.google.android.gms.internal.measurement.C6139u5(this, comparable, obj);
        this.f41154D++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f41157G == null) {
            this.f41157G = new com.google.android.gms.internal.measurement.C6163x5(this);
        }
        return this.f41157G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        java.lang.Object objEntrySet;
        java.lang.Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.AbstractC6108q5)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5 = (com.google.android.gms.internal.measurement.AbstractC6108q5) obj;
        int size = size();
        if (size != abstractC6108q5.size()) {
            return false;
        }
        int i6 = this.f41154D;
        if (i6 != abstractC6108q5.f41154D) {
            objEntrySet = entrySet();
            objEntrySet2 = abstractC6108q5.entrySet();
        } else {
            for (int i10 = 0; i10 < i6; i10++) {
                if (!f(i10).equals(abstractC6108q5.f(i10))) {
                    return false;
                }
            }
            if (i6 == size) {
                return true;
            }
            objEntrySet = this.f41155E;
            objEntrySet2 = abstractC6108q5.f41155E;
        }
        return objEntrySet.equals(objEntrySet2);
    }

    public final java.util.Map.Entry f(int i6) {
        if (i6 < this.f41154D) {
            return (com.google.android.gms.internal.measurement.C6139u5) this.f41153C[i6];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i6);
    }

    public final java.lang.Iterable g() {
        return this.f41155E.isEmpty() ? java.util.Collections.emptySet() : this.f41155E.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? ((com.google.android.gms.internal.measurement.C6139u5) this.f41153C[iC]).getValue() : this.f41155E.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i6 = this.f41154D;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            iHashCode += this.f41153C[i10].hashCode();
        }
        return this.f41155E.size() > 0 ? iHashCode + this.f41155E.hashCode() : iHashCode;
    }

    final java.util.Set l() {
        return new com.google.android.gms.internal.measurement.C6155w5(this);
    }

    public void m() {
        if (this.f41156F) {
            return;
        }
        this.f41155E = this.f41155E.isEmpty() ? java.util.Collections.emptyMap() : j$.util.DesugarCollections.unmodifiableMap(this.f41155E);
        this.f41158H = this.f41158H.isEmpty() ? java.util.Collections.emptyMap() : j$.util.DesugarCollections.unmodifiableMap(this.f41158H);
        this.f41156F = true;
    }

    public final boolean p() {
        return this.f41156F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        s();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iC = c(comparable);
        if (iC >= 0) {
            return h(iC);
        }
        if (this.f41155E.isEmpty()) {
            return null;
        }
        return this.f41155E.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f41154D + this.f41155E.size();
    }
}
