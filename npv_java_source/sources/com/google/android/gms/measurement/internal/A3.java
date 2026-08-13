package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class A3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.measurement.internal.A3 f41705c = new com.google.android.gms.measurement.internal.A3(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.EnumMap f41706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41707b;

    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final java.lang.String f41713C;

        a(java.lang.String str) {
            this.f41713C = str;
        }
    }

    public A3(java.lang.Boolean bool, java.lang.Boolean bool2, int i6) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        this.f41706a = enumMap;
        enumMap.put(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE, h(null));
        enumMap.put(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE, h(null));
        this.f41707b = i6;
    }

    private A3(java.util.EnumMap enumMap, int i6) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        this.f41706a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f41707b = i6;
    }

    static char a(p085i4.p pVar) {
        if (pVar == null) {
            return '-';
        }
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static com.google.android.gms.measurement.internal.A3 c(android.os.Bundle bundle, int i6) {
        if (bundle == null) {
            return new com.google.android.gms.measurement.internal.A3(null, null, i6);
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.f41736C) {
            enumMap.put(aVar, i(bundle.getString(aVar.f41713C)));
        }
        return new com.google.android.gms.measurement.internal.A3(enumMap, i6);
    }

    public static com.google.android.gms.measurement.internal.A3 e(p085i4.p pVar, p085i4.p pVar2, int i6) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        enumMap.put(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE, pVar);
        enumMap.put(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE, pVar2);
        return new com.google.android.gms.measurement.internal.A3(enumMap, -10);
    }

    public static com.google.android.gms.measurement.internal.A3 f(java.lang.String str, int i6) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        if (str == null) {
            str = "";
        }
        com.google.android.gms.measurement.internal.A3.a[] aVarArrE = com.google.android.gms.measurement.internal.B3.STORAGE.e();
        for (int i10 = 0; i10 < aVarArrE.length; i10++) {
            int i11 = i10 + 2;
            enumMap.put(aVarArrE[i10], i11 < str.length() ? g(str.charAt(i11)) : p085i4.p.UNINITIALIZED);
        }
        return new com.google.android.gms.measurement.internal.A3(enumMap, i6);
    }

    static p085i4.p g(char c6) {
        if (c6 == '+') {
            return p085i4.p.POLICY;
        }
        if (c6 != '0') {
            return c6 != '1' ? p085i4.p.UNINITIALIZED : p085i4.p.GRANTED;
        }
        return p085i4.p.DENIED;
    }

    static p085i4.p h(java.lang.Boolean bool) {
        if (bool == null) {
            return p085i4.p.UNINITIALIZED;
        }
        return bool.booleanValue() ? p085i4.p.GRANTED : p085i4.p.DENIED;
    }

    static p085i4.p i(java.lang.String str) {
        if (str == null) {
            return p085i4.p.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return p085i4.p.GRANTED;
        }
        return str.equals("denied") ? p085i4.p.DENIED : p085i4.p.UNINITIALIZED;
    }

    static java.lang.String j(int i6) {
        if (i6 == -30) {
            return "TCF";
        }
        if (i6 == -20) {
            return "API";
        }
        if (i6 == -10) {
            return "MANIFEST";
        }
        if (i6 == 0) {
            return "1P_API";
        }
        if (i6 == 30) {
            return "1P_INIT";
        }
        if (i6 != 90) {
            return i6 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static java.lang.String k(android.os.Bundle bundle) {
        java.lang.String string;
        com.google.android.gms.measurement.internal.A3.a[] aVarArr = com.google.android.gms.measurement.internal.B3.STORAGE.f41736C;
        int length = aVarArr.length;
        int i6 = 0;
        while (true) {
            java.lang.Boolean bool = null;
            if (i6 >= length) {
                return null;
            }
            com.google.android.gms.measurement.internal.A3.a aVar = aVarArr[i6];
            if (bundle.containsKey(aVar.f41713C) && (string = bundle.getString(aVar.f41713C)) != null) {
                if (string.equals("granted")) {
                    bool = java.lang.Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = java.lang.Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i6++;
        }
    }

    public static boolean l(int i6, int i10) {
        if (i6 == -20 && i10 == -30) {
            return true;
        }
        return (i6 == -30 && i10 == -20) || i6 == i10 || i6 < i10;
    }

    public static com.google.android.gms.measurement.internal.A3 q(java.lang.String str) {
        return f(str, 100);
    }

    static java.lang.String r(p085i4.p pVar) {
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean A() {
        java.util.Iterator it = this.f41706a.values().iterator();
        while (it.hasNext()) {
            if (((p085i4.p) it.next()) != p085i4.p.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f41707b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    public final com.google.android.gms.measurement.internal.A3 d(com.google.android.gms.measurement.internal.A3 a6) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.f41736C) {
            p085i4.p pVar = (p085i4.p) this.f41706a.get(aVar);
            p085i4.p pVar2 = (p085i4.p) a6.f41706a.get(aVar);
            if (pVar == null) {
                pVar = pVar2;
            } else if (pVar2 != null) {
                p085i4.p pVar3 = p085i4.p.UNINITIALIZED;
                if (pVar == pVar3) {
                    pVar = pVar2;
                } else if (pVar2 != pVar3) {
                    p085i4.p pVar4 = p085i4.p.POLICY;
                    if (pVar == pVar4) {
                        pVar = pVar2;
                    } else if (pVar2 != pVar4) {
                        p085i4.p pVar5 = p085i4.p.DENIED;
                        pVar = (pVar == pVar5 || pVar2 == pVar5) ? pVar5 : p085i4.p.GRANTED;
                    }
                }
            }
            if (pVar != null) {
                enumMap.put(aVar, pVar);
            }
        }
        return new com.google.android.gms.measurement.internal.A3(enumMap, 100);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.measurement.internal.A3)) {
            return false;
        }
        com.google.android.gms.measurement.internal.A3 a6 = (com.google.android.gms.measurement.internal.A3) obj;
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.f41736C) {
            if (this.f41706a.get(aVar) != a6.f41706a.get(aVar)) {
                return false;
            }
        }
        return this.f41707b == a6.f41707b;
    }

    public final int hashCode() {
        int iHashCode = this.f41707b * 17;
        java.util.Iterator it = this.f41706a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((p085i4.p) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean m(com.google.android.gms.measurement.internal.A3.a aVar) {
        return ((p085i4.p) this.f41706a.get(aVar)) != p085i4.p.DENIED;
    }

    public final boolean n(com.google.android.gms.measurement.internal.A3 a6, com.google.android.gms.measurement.internal.A3.a... aVarArr) {
        for (com.google.android.gms.measurement.internal.A3.a aVar : aVarArr) {
            if (!a6.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final android.os.Bundle o() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.f41706a.entrySet()) {
            java.lang.String strR = r((p085i4.p) entry.getValue());
            if (strR != null) {
                bundle.putString(((com.google.android.gms.measurement.internal.A3.a) entry.getKey()).f41713C, strR);
            }
        }
        return bundle;
    }

    public final com.google.android.gms.measurement.internal.A3 p(com.google.android.gms.measurement.internal.A3 a6) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.f41736C) {
            p085i4.p pVar = (p085i4.p) this.f41706a.get(aVar);
            if (pVar == p085i4.p.UNINITIALIZED) {
                pVar = (p085i4.p) a6.f41706a.get(aVar);
            }
            if (pVar != null) {
                enumMap.put(aVar, pVar);
            }
        }
        return new com.google.android.gms.measurement.internal.A3(enumMap, this.f41707b);
    }

    public final boolean s(com.google.android.gms.measurement.internal.A3 a6, com.google.android.gms.measurement.internal.A3.a... aVarArr) {
        for (com.google.android.gms.measurement.internal.A3.a aVar : aVarArr) {
            p085i4.p pVar = (p085i4.p) this.f41706a.get(aVar);
            p085i4.p pVar2 = (p085i4.p) a6.f41706a.get(aVar);
            p085i4.p pVar3 = p085i4.p.DENIED;
            if (pVar == pVar3 && pVar2 != pVar3) {
                return true;
            }
        }
        return false;
    }

    public final p085i4.p t() {
        p085i4.p pVar = (p085i4.p) this.f41706a.get(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE);
        return pVar == null ? p085i4.p.UNINITIALIZED : pVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source=");
        sb.append(j(this.f41707b));
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.f41736C) {
            sb.append(",");
            sb.append(aVar.f41713C);
            sb.append("=");
            p085i4.p pVar = (p085i4.p) this.f41706a.get(aVar);
            if (pVar == null) {
                pVar = p085i4.p.UNINITIALIZED;
            }
            sb.append(pVar);
        }
        return sb.toString();
    }

    public final boolean u(com.google.android.gms.measurement.internal.A3 a6) {
        return s(a6, (com.google.android.gms.measurement.internal.A3.a[]) this.f41706a.keySet().toArray(new com.google.android.gms.measurement.internal.A3.a[0]));
    }

    public final p085i4.p v() {
        p085i4.p pVar = (p085i4.p) this.f41706a.get(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE);
        return pVar == null ? p085i4.p.UNINITIALIZED : pVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final java.lang.String w() {
        int iOrdinal;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("G1");
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.e()) {
            p085i4.p pVar = (p085i4.p) this.f41706a.get(aVar);
            char c6 = '-';
            if (pVar != null && (iOrdinal = pVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c6 = '1';
                } else if (iOrdinal == 2) {
                    c6 = '0';
                } else if (iOrdinal == 3) {
                    c6 = '1';
                }
            }
            sb.append(c6);
        }
        return sb.toString();
    }

    public final java.lang.String x() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("G1");
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.STORAGE.e()) {
            sb.append(a((p085i4.p) this.f41706a.get(aVar)));
        }
        return sb.toString();
    }

    public final boolean y() {
        return m(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE);
    }

    public final boolean z() {
        return m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE);
    }
}
