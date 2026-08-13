package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Nu0 implements com.google.android.gms.internal.ads.InterfaceC4413lw0 {
    private static void j(java.lang.Iterable iterable, java.util.List list) {
        if (iterable instanceof java.util.Collection) {
            int size = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof com.google.android.gms.internal.ads.C5622ww0) {
                ((com.google.android.gms.internal.ads.C5622ww0) list).f(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj : iterable) {
                if (obj == null) {
                    m(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size3 = list2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            java.lang.Object obj2 = list2.get(i6);
            if (obj2 == null) {
                m(list, size2);
            }
            list.add(obj2);
        }
    }

    protected static com.google.android.gms.internal.ads.Kw0 k(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0) {
        return new com.google.android.gms.internal.ads.Kw0(interfaceC4523mw0);
    }

    protected static void l(java.lang.Iterable iterable, java.util.List list) {
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        iterable.getClass();
        if (!(iterable instanceof com.google.android.gms.internal.ads.Yv0)) {
            if (iterable instanceof com.google.android.gms.internal.ads.InterfaceC5402uw0) {
                list.addAll((java.util.Collection) iterable);
                return;
            } else {
                j(iterable, list);
                return;
            }
        }
        java.util.List listA = ((com.google.android.gms.internal.ads.Yv0) iterable).a();
        com.google.android.gms.internal.ads.Yv0 yv0 = (com.google.android.gms.internal.ads.Yv0) list;
        int size = list.size();
        for (java.lang.Object obj : listA) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (yv0.size() - size) + " is null.";
                int size2 = yv0.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new java.lang.NullPointerException(str);
                    }
                    yv0.remove(size2);
                }
            } else {
                if (obj instanceof com.google.android.gms.internal.ads.AbstractC3753fv0) {
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArr2, 0, bArr2.length);
                } else {
                    yv0.add((java.lang.String) obj);
                }
                yv0.b();
            }
        }
    }

    private static void m(java.util.List list, int i6) {
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

    public com.google.android.gms.internal.ads.Nu0 e(byte[] bArr, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        return h(bArr, 0, bArr.length, c5730xv0);
    }

    public abstract com.google.android.gms.internal.ads.Nu0 h(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C5730xv0 c5730xv0);
}
