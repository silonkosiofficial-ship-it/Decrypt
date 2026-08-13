package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6072m4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.C6072m4 f41035d = new com.google.android.gms.internal.measurement.C6072m4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.measurement.AbstractC6108q5 f41036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41038c;

    private C6072m4() {
        this.f41036a = new com.google.android.gms.internal.measurement.C6131t5();
    }

    private C6072m4(com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5) {
        this.f41036a = abstractC6108q5;
        m();
    }

    private C6072m4(boolean z6) {
        this(new com.google.android.gms.internal.measurement.C6131t5());
        m();
    }

    public static int b(com.google.android.gms.internal.measurement.InterfaceC6090o4 interfaceC6090o4, java.lang.Object obj) {
        com.google.android.gms.internal.measurement.N5 n5B = interfaceC6090o4.b();
        int iA = interfaceC6090o4.a();
        if (!interfaceC6090o4.d()) {
            return c(n5B, iA, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int i6 = 0;
        if (!interfaceC6090o4.f()) {
            int iC = 0;
            while (i6 < size) {
                iC += c(n5B, iA, list.get(i6));
                i6++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i6 < size) {
            iD += d(n5B, list.get(i6));
            i6++;
        }
        return com.google.android.gms.internal.measurement.AbstractC5982c4.s0(iA) + iD + com.google.android.gms.internal.measurement.AbstractC5982c4.v0(iD);
    }

    static int c(com.google.android.gms.internal.measurement.N5 n6, int i6, java.lang.Object obj) {
        int iS0 = com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6);
        if (n6 == com.google.android.gms.internal.measurement.N5.f40605N) {
            com.google.android.gms.internal.measurement.AbstractC6146v4.g((com.google.android.gms.internal.measurement.InterfaceC5965a5) obj);
            iS0 <<= 1;
        }
        return iS0 + d(n6, obj);
    }

    private static int d(com.google.android.gms.internal.measurement.N5 n6, java.lang.Object obj) {
        switch (com.google.android.gms.internal.measurement.AbstractC6063l4.f41026b[n6.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.c(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.d(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.a0(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.n0(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.g0(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.S(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.c0(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.h(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.B((com.google.android.gms.internal.measurement.InterfaceC5965a5) obj);
            case 10:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.T((com.google.android.gms.internal.measurement.InterfaceC5965a5) obj);
            case 11:
                return obj instanceof com.google.android.gms.internal.measurement.L3 ? com.google.android.gms.internal.measurement.AbstractC5982c4.A((com.google.android.gms.internal.measurement.L3) obj) : com.google.android.gms.internal.measurement.AbstractC5982c4.C((java.lang.String) obj);
            case 12:
                return obj instanceof com.google.android.gms.internal.measurement.L3 ? com.google.android.gms.internal.measurement.AbstractC5982c4.A((com.google.android.gms.internal.measurement.L3) obj) : com.google.android.gms.internal.measurement.AbstractC5982c4.i((byte[]) obj);
            case 13:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.v0(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.k0(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.f0(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.o0(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.android.gms.internal.measurement.AbstractC5982c4.j0(((java.lang.Long) obj).longValue());
            case 18:
                return obj instanceof com.google.android.gms.internal.measurement.InterfaceC6170y4 ? com.google.android.gms.internal.measurement.AbstractC5982c4.X(((com.google.android.gms.internal.measurement.InterfaceC6170y4) obj).a()) : com.google.android.gms.internal.measurement.AbstractC5982c4.X(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(java.util.Map.Entry entry) {
        androidx.appcompat.app.D.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private final void g(com.google.android.gms.internal.measurement.InterfaceC6090o4 interfaceC6090o4, java.lang.Object obj) {
        if (!interfaceC6090o4.d()) {
            j(interfaceC6090o4, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.Object obj2 = list.get(i6);
                j(interfaceC6090o4, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f41036a.put(interfaceC6090o4, obj);
    }

    private final void h(java.util.Map.Entry entry) {
        androidx.appcompat.app.D.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    private static void j(com.google.android.gms.internal.measurement.InterfaceC6090o4 interfaceC6090o4, java.lang.Object obj) {
        boolean z6;
        com.google.android.gms.internal.measurement.N5 n5B = interfaceC6090o4.b();
        com.google.android.gms.internal.measurement.AbstractC6146v4.e(obj);
        switch (com.google.android.gms.internal.measurement.AbstractC6063l4.f41025a[n5B.e().ordinal()]) {
            case 1:
                z6 = obj instanceof java.lang.Integer;
                break;
            case 2:
                z6 = obj instanceof java.lang.Long;
                break;
            case 3:
                z6 = obj instanceof java.lang.Float;
                break;
            case 4:
                z6 = obj instanceof java.lang.Double;
                break;
            case 5:
                z6 = obj instanceof java.lang.Boolean;
                break;
            case 6:
                z6 = obj instanceof java.lang.String;
                break;
            case 7:
                if ((obj instanceof com.google.android.gms.internal.measurement.L3) || (obj instanceof byte[])) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.measurement.InterfaceC6170y4)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            case 9:
                if (!(obj instanceof com.google.android.gms.internal.measurement.InterfaceC5965a5)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                break;
            default:
                z6 = false;
                break;
        }
        if (!z6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(interfaceC6090o4.a()), interfaceC6090o4.b().e(), obj.getClass().getName()));
        }
    }

    private static boolean k(java.util.Map.Entry entry) {
        androidx.appcompat.app.D.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int iA = this.f41036a.a();
        int iE = 0;
        for (int i6 = 0; i6 < iA; i6++) {
            iE += e(this.f41036a.f(i6));
        }
        java.util.Iterator it = this.f41036a.g().iterator();
        while (it.hasNext()) {
            iE += e((java.util.Map.Entry) it.next());
        }
        return iE;
    }

    public final /* synthetic */ java.lang.Object clone() {
        com.google.android.gms.internal.measurement.C6072m4 c6072m4 = new com.google.android.gms.internal.measurement.C6072m4();
        int iA = this.f41036a.a();
        for (int i6 = 0; i6 < iA; i6++) {
            java.util.Map.Entry entryF = this.f41036a.f(i6);
            androidx.appcompat.app.D.a(entryF.getKey());
            c6072m4.g(null, entryF.getValue());
        }
        for (java.util.Map.Entry entry : this.f41036a.g()) {
            androidx.appcompat.app.D.a(entry.getKey());
            c6072m4.g(null, entry.getValue());
        }
        c6072m4.f41038c = this.f41038c;
        return c6072m4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.C6072m4) {
            return this.f41036a.equals(((com.google.android.gms.internal.measurement.C6072m4) obj).f41036a);
        }
        return false;
    }

    public final void f(com.google.android.gms.internal.measurement.C6072m4 c6072m4) {
        int iA = c6072m4.f41036a.a();
        for (int i6 = 0; i6 < iA; i6++) {
            h(c6072m4.f41036a.f(i6));
        }
        java.util.Iterator it = c6072m4.f41036a.g().iterator();
        while (it.hasNext()) {
            h((java.util.Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f41036a.hashCode();
    }

    final java.util.Iterator i() {
        if (this.f41036a.isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        return this.f41038c ? new com.google.android.gms.internal.measurement.G4(this.f41036a.l().iterator()) : this.f41036a.l().iterator();
    }

    public final java.util.Iterator l() {
        if (this.f41036a.isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        return this.f41038c ? new com.google.android.gms.internal.measurement.G4(this.f41036a.entrySet().iterator()) : this.f41036a.entrySet().iterator();
    }

    public final void m() {
        if (this.f41037b) {
            return;
        }
        int iA = this.f41036a.a();
        for (int i6 = 0; i6 < iA; i6++) {
            java.lang.Object value = this.f41036a.f(i6).getValue();
            if (value instanceof com.google.android.gms.internal.measurement.AbstractC6130t4) {
                ((com.google.android.gms.internal.measurement.AbstractC6130t4) value).C();
            }
        }
        java.util.Iterator it = this.f41036a.g().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.measurement.AbstractC6130t4) {
                ((com.google.android.gms.internal.measurement.AbstractC6130t4) value2).C();
            }
        }
        this.f41036a.m();
        this.f41037b = true;
    }

    public final boolean n() {
        int iA = this.f41036a.a();
        for (int i6 = 0; i6 < iA; i6++) {
            if (!k(this.f41036a.f(i6))) {
                return false;
            }
        }
        java.util.Iterator it = this.f41036a.g().iterator();
        while (it.hasNext()) {
            if (!k((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
