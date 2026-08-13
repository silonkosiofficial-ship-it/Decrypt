package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6383h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.EnumMap f42414a;

    C6383h() {
        this.f42414a = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
    }

    private C6383h(java.util.EnumMap enumMap) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        this.f42414a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static com.google.android.gms.measurement.internal.C6383h a(java.lang.String str) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.A3.a.class);
        if (str.length() >= com.google.android.gms.measurement.internal.A3.a.values().length) {
            int i6 = 0;
            if (str.charAt(0) == '1') {
                com.google.android.gms.measurement.internal.A3.a[] aVarArrValues = com.google.android.gms.measurement.internal.A3.a.values();
                int length = aVarArrValues.length;
                int i10 = 1;
                while (i6 < length) {
                    enumMap.put(aVarArrValues[i6], com.google.android.gms.measurement.internal.EnumC6397j.g(str.charAt(i10)));
                    i6++;
                    i10++;
                }
                return new com.google.android.gms.measurement.internal.C6383h(enumMap);
            }
        }
        return new com.google.android.gms.measurement.internal.C6383h();
    }

    public final com.google.android.gms.measurement.internal.EnumC6397j b(com.google.android.gms.measurement.internal.A3.a aVar) {
        com.google.android.gms.measurement.internal.EnumC6397j enumC6397j = (com.google.android.gms.measurement.internal.EnumC6397j) this.f42414a.get(aVar);
        return enumC6397j == null ? com.google.android.gms.measurement.internal.EnumC6397j.UNSET : enumC6397j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void c(com.google.android.gms.measurement.internal.A3.a aVar, int i6) {
        com.google.android.gms.measurement.internal.EnumC6397j enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.UNSET;
        if (i6 == -30) {
            enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.TCF;
        } else if (i6 == -20) {
            enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.API;
        } else if (i6 == -10) {
            enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.MANIFEST;
        } else if (i6 == 0) {
            enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.API;
        } else if (i6 == 30) {
            enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.INITIALIZATION;
        }
        this.f42414a.put(aVar, enumC6397j);
    }

    public final void d(com.google.android.gms.measurement.internal.A3.a aVar, com.google.android.gms.measurement.internal.EnumC6397j enumC6397j) {
        this.f42414a.put(aVar, enumC6397j);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1");
        for (com.google.android.gms.measurement.internal.A3.a aVar : com.google.android.gms.measurement.internal.A3.a.values()) {
            com.google.android.gms.measurement.internal.EnumC6397j enumC6397j = (com.google.android.gms.measurement.internal.EnumC6397j) this.f42414a.get(aVar);
            if (enumC6397j == null) {
                enumC6397j = com.google.android.gms.measurement.internal.EnumC6397j.UNSET;
            }
            sb.append(enumC6397j.f42450C);
        }
        return sb.toString();
    }
}
