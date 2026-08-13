package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E3 implements com.google.android.gms.internal.measurement.Z4 {
    protected static void j(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.gms.internal.measurement.L3 l3S;
        com.google.android.gms.internal.measurement.AbstractC6146v4.e(iterable);
        if (iterable instanceof com.google.android.gms.internal.measurement.H4) {
            java.util.List listA = ((com.google.android.gms.internal.measurement.H4) iterable).a();
            com.google.android.gms.internal.measurement.H4 h6 = (com.google.android.gms.internal.measurement.H4) list;
            int size = list.size();
            for (java.lang.Object obj : listA) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (h6.size() - size) + " is null.";
                    for (int size2 = h6.size() - 1; size2 >= size; size2--) {
                        h6.remove(size2);
                    }
                    throw new java.lang.NullPointerException(str);
                }
                if (obj instanceof com.google.android.gms.internal.measurement.L3) {
                    l3S = (com.google.android.gms.internal.measurement.L3) obj;
                } else if (obj instanceof byte[]) {
                    l3S = com.google.android.gms.internal.measurement.L3.s((byte[]) obj);
                } else {
                    h6.add((java.lang.String) obj);
                }
                h6.J(l3S);
            }
            return;
        }
        if (iterable instanceof com.google.android.gms.internal.measurement.InterfaceC6055k5) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if (iterable instanceof java.util.Collection) {
            int size3 = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof com.google.android.gms.internal.measurement.C6064l5) {
                ((com.google.android.gms.internal.measurement.C6064l5) list).e(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 == null) {
                    k(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size5 = list2.size();
        for (int i6 = 0; i6 < size5; i6++) {
            java.lang.Object obj3 = list2.get(i6);
            if (obj3 == null) {
                k(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void k(java.util.List list, int i6) {
        java.lang.String str = "Element at index " + (list.size() - i6) + " is null.";
        for (int size = list.size() - 1; size >= i6; size--) {
            list.remove(size);
        }
        throw new java.lang.NullPointerException(str);
    }

    public abstract /* synthetic */ java.lang.Object clone();

    public abstract com.google.android.gms.internal.measurement.E3 e(byte[] bArr, int i6, int i10);

    @Override // com.google.android.gms.internal.measurement.Z4
    public final /* synthetic */ com.google.android.gms.internal.measurement.Z4 e0(byte[] bArr, com.google.android.gms.internal.measurement.C6018g4 c6018g4) {
        return h(bArr, 0, bArr.length, c6018g4);
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final /* synthetic */ com.google.android.gms.internal.measurement.Z4 f(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public abstract com.google.android.gms.internal.measurement.E3 h(byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.C6018g4 c6018g4);
}
