package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y1 implements com.google.android.gms.internal.play_billing.InterfaceC6227h3 {
    private static void b(java.util.List list, int i6) {
        java.lang.String str = "Element at index " + (list.size() - i6) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i6) {
                throw new java.lang.NullPointerException(str);
            }
            list.remove(size);
        }
    }

    protected static void c(java.lang.Iterable iterable, java.util.List list) {
        byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
        iterable.getClass();
        if (iterable instanceof com.google.android.gms.internal.play_billing.U2) {
            java.util.List listA = ((com.google.android.gms.internal.play_billing.U2) iterable).a();
            com.google.android.gms.internal.play_billing.U2 u6 = (com.google.android.gms.internal.play_billing.U2) list;
            int size = list.size();
            for (java.lang.Object obj : listA) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (u6.size() - size) + " is null.";
                    int size2 = u6.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new java.lang.NullPointerException(str);
                        }
                        u6.remove(size2);
                    }
                } else {
                    if (obj instanceof com.google.android.gms.internal.play_billing.AbstractC6268o2) {
                    } else if (obj instanceof byte[]) {
                        byte[] bArr2 = (byte[]) obj;
                        com.google.android.gms.internal.play_billing.AbstractC6268o2.C(bArr2, 0, bArr2.length);
                    } else {
                        u6.add((java.lang.String) obj);
                    }
                    u6.b();
                }
            }
            return;
        }
        if (iterable instanceof com.google.android.gms.internal.play_billing.InterfaceC6275p3) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if (iterable instanceof java.util.Collection) {
            int size3 = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof com.google.android.gms.internal.play_billing.C6286r3) {
                ((com.google.android.gms.internal.play_billing.C6286r3) list).f(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 == null) {
                    b(list, size4);
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
                b(list, size4);
            }
            list.add(obj3);
        }
    }
}
