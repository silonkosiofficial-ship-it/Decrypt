package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6480v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.measurement.internal.C6480v f42660f = new com.google.android.gms.measurement.internal.C6480v(null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f42662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Boolean f42663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f42664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.EnumMap f42665e;

    C6480v(java.lang.Boolean bool, int i6) {
        this((java.lang.Boolean) null, i6, (java.lang.Boolean) null, (java.lang.String) null);
    }

    C6480v(java.lang.Boolean bool, int i6, java.lang.Boolean bool2, java.lang.String str) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        this.f42665e = enumMap;
        enumMap.put(com.google.android.gms.measurement.internal.A3.a.AD_USER_DATA, com.google.android.gms.measurement.internal.A3.h(bool));
        this.f42661a = i6;
        this.f42662b = l();
        this.f42663c = bool2;
        this.f42664d = str;
    }

    private C6480v(java.util.EnumMap enumMap, int i6, java.lang.Boolean bool, java.lang.String str) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        this.f42665e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f42661a = i6;
        this.f42662b = l();
        this.f42663c = bool;
        this.f42664d = str;
    }

    public static com.google.android.gms.measurement.internal.C6480v b(android.os.Bundle bundle, int i6) {
        if (bundle == null) {
            return new com.google.android.gms.measurement.internal.C6480v(null, i6);
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.DMA.e()) {
            enumMap.put(aVar, com.google.android.gms.measurement.internal.A3.i(bundle.getString(aVar.f41713C)));
        }
        return new com.google.android.gms.measurement.internal.C6480v(enumMap, i6, bundle.containsKey("is_dma_region") ? java.lang.Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static com.google.android.gms.measurement.internal.C6480v c(p085i4.p pVar, int i6) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        enumMap.put(com.google.android.gms.measurement.internal.A3.a.AD_USER_DATA, pVar);
        return new com.google.android.gms.measurement.internal.C6480v(enumMap, -10, (java.lang.Boolean) null, (java.lang.String) null);
    }

    public static com.google.android.gms.measurement.internal.C6480v d(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return f42660f;
        }
        java.lang.String[] strArrSplit = str.split(":");
        int i6 = java.lang.Integer.parseInt(strArrSplit[0]);
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        com.google.android.gms.measurement.internal.A3.a[] aVarArrE = com.google.android.gms.measurement.internal.B3.DMA.e();
        int length = aVarArrE.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(aVarArrE[i11], com.google.android.gms.measurement.internal.A3.g(strArrSplit[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new com.google.android.gms.measurement.internal.C6480v(enumMap, i6, (java.lang.Boolean) null, (java.lang.String) null);
    }

    public static java.lang.Boolean e(android.os.Bundle bundle) {
        p085i4.p pVarI;
        if (bundle == null || (pVarI = com.google.android.gms.measurement.internal.A3.i(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i6 = com.google.android.gms.measurement.internal.AbstractC6508z.f42718a[pVarI.ordinal()];
        if (i6 == 3) {
            return java.lang.Boolean.FALSE;
        }
        if (i6 != 4) {
            return null;
        }
        return java.lang.Boolean.TRUE;
    }

    private final java.lang.String l() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f42661a);
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.DMA.e()) {
            sb.append(":");
            sb.append(com.google.android.gms.measurement.internal.A3.a((p085i4.p) this.f42665e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f42661a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.measurement.internal.C6480v)) {
            return false;
        }
        com.google.android.gms.measurement.internal.C6480v c6480v = (com.google.android.gms.measurement.internal.C6480v) obj;
        if (this.f42662b.equalsIgnoreCase(c6480v.f42662b) && j$.util.Objects.equals(this.f42663c, c6480v.f42663c)) {
            return j$.util.Objects.equals(this.f42664d, c6480v.f42664d);
        }
        return false;
    }

    public final android.os.Bundle f() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.f42665e.entrySet()) {
            java.lang.String strR = com.google.android.gms.measurement.internal.A3.r((p085i4.p) entry.getValue());
            if (strR != null) {
                bundle.putString(((com.google.android.gms.measurement.internal.A3.a) entry.getKey()).f41713C, strR);
            }
        }
        java.lang.Boolean bool = this.f42663c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        java.lang.String str = this.f42664d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final p085i4.p g() {
        p085i4.p pVar = (p085i4.p) this.f42665e.get(com.google.android.gms.measurement.internal.A3.a.AD_USER_DATA);
        return pVar == null ? p085i4.p.UNINITIALIZED : pVar;
    }

    public final java.lang.Boolean h() {
        return this.f42663c;
    }

    public final int hashCode() {
        int i6;
        java.lang.Boolean bool = this.f42663c;
        if (bool == null) {
            i6 = 3;
        } else {
            i6 = bool == java.lang.Boolean.TRUE ? 7 : 13;
        }
        java.lang.String str = this.f42664d;
        return this.f42662b.hashCode() + (i6 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final java.lang.String i() {
        return this.f42664d;
    }

    public final java.lang.String j() {
        return this.f42662b;
    }

    public final boolean k() {
        java.util.Iterator it = this.f42665e.values().iterator();
        while (it.hasNext()) {
            if (((p085i4.p) it.next()) != p085i4.p.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        int i6;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source=");
        sb.append(com.google.android.gms.measurement.internal.A3.j(this.f42661a));
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.B3.DMA.e()) {
            sb.append(",");
            sb.append(aVar.f41713C);
            sb.append("=");
            p085i4.p pVar = (p085i4.p) this.f42665e.get(aVar);
            if (pVar == null || (i6 = com.google.android.gms.measurement.internal.AbstractC6508z.f42718a[pVar.ordinal()]) == 1) {
                sb.append("uninitialized");
            } else {
                if (i6 == 2) {
                    str = "eu_consent_policy";
                } else if (i6 == 3) {
                    str = "denied";
                } else if (i6 == 4) {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        if (this.f42663c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f42663c);
        }
        if (this.f42664d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f42664d);
        }
        return sb.toString();
    }
}
