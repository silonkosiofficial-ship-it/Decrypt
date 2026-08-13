package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6341b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.String f42265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.Boolean f42267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.lang.Boolean f42268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Long f42269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    java.lang.Long f42270f;

    AbstractC6341b(java.lang.String str, int i6) {
        this.f42265a = str;
        this.f42266b = i6;
    }

    static java.lang.Boolean b(double d6, com.google.android.gms.internal.measurement.M1 m6) {
        try {
            return h(new java.math.BigDecimal(d6), m6, java.lang.Math.ulp(d6));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean c(long j6, com.google.android.gms.internal.measurement.M1 m6) {
        try {
            return h(new java.math.BigDecimal(j6), m6, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean d(java.lang.Boolean bool, boolean z6) {
        if (bool == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(bool.booleanValue() != z6);
    }

    static java.lang.Boolean e(java.lang.String str, com.google.android.gms.internal.measurement.M1 m6) {
        if (!com.google.android.gms.measurement.internal.Z5.g0(str)) {
            return null;
        }
        try {
            return h(new java.math.BigDecimal(str), m6, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static java.lang.Boolean f(java.lang.String str, com.google.android.gms.internal.measurement.O1.b bVar, boolean z6, java.lang.String str2, java.util.List list, java.lang.String str3, com.google.android.gms.measurement.internal.C6428n2 c6428n2) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        if (bVar == com.google.android.gms.internal.measurement.O1.b.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z6 && bVar != com.google.android.gms.internal.measurement.O1.b.REGEXP) {
            str = str.toUpperCase(java.util.Locale.ENGLISH);
        }
        switch (com.google.android.gms.measurement.internal.k6.f42495a[bVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile(str3, z6 ? 0 : 66).matcher(str).matches());
                } catch (java.util.regex.PatternSyntaxException unused) {
                    if (c6428n2 != null) {
                        c6428n2.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                if (list == null) {
                    return null;
                }
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return java.lang.Boolean.valueOf(zStartsWith);
    }

    static java.lang.Boolean g(java.lang.String str, com.google.android.gms.internal.measurement.O1 o6, com.google.android.gms.measurement.internal.C6428n2 c6428n2) {
        java.util.List list;
        Q3.AbstractC1477p.l(o6);
        if (str == null || !o6.N() || o6.F() == com.google.android.gms.internal.measurement.O1.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        com.google.android.gms.internal.measurement.O1.b bVarF = o6.F();
        com.google.android.gms.internal.measurement.O1.b bVar = com.google.android.gms.internal.measurement.O1.b.IN_LIST;
        if (bVarF == bVar) {
            if (o6.k() == 0) {
                return null;
            }
        } else if (!o6.M()) {
            return null;
        }
        com.google.android.gms.internal.measurement.O1.b bVarF2 = o6.F();
        boolean zK = o6.K();
        java.lang.String strI = (zK || bVarF2 == com.google.android.gms.internal.measurement.O1.b.REGEXP || bVarF2 == bVar) ? o6.I() : o6.I().toUpperCase(java.util.Locale.ENGLISH);
        if (o6.k() == 0) {
            list = null;
        } else {
            java.util.List listJ = o6.J();
            if (!zK) {
                java.util.ArrayList arrayList = new java.util.ArrayList(listJ.size());
                java.util.Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((java.lang.String) it.next()).toUpperCase(java.util.Locale.ENGLISH));
                }
                listJ = j$.util.DesugarCollections.unmodifiableList(arrayList);
            }
            list = listJ;
        }
        return f(str, bVarF2, zK, strI, list, bVarF2 == com.google.android.gms.internal.measurement.O1.b.REGEXP ? strI : null, c6428n2);
    }

    private static java.lang.Boolean h(java.math.BigDecimal bigDecimal, com.google.android.gms.internal.measurement.M1 m6, double d6) {
        java.math.BigDecimal bigDecimal2;
        java.math.BigDecimal bigDecimal3;
        java.math.BigDecimal bigDecimal4;
        Q3.AbstractC1477p.l(m6);
        if (m6.M() && m6.F() != com.google.android.gms.internal.measurement.M1.b.UNKNOWN_COMPARISON_TYPE) {
            com.google.android.gms.internal.measurement.M1.b bVarF = m6.F();
            com.google.android.gms.internal.measurement.M1.b bVar = com.google.android.gms.internal.measurement.M1.b.BETWEEN;
            if (bVarF == bVar) {
                if (!m6.Q() || !m6.P()) {
                    return null;
                }
            } else if (!m6.N()) {
                return null;
            }
            com.google.android.gms.internal.measurement.M1.b bVarF2 = m6.F();
            if (m6.F() == bVar) {
                if (com.google.android.gms.measurement.internal.Z5.g0(m6.K()) && com.google.android.gms.measurement.internal.Z5.g0(m6.J())) {
                    try {
                        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(m6.K());
                        bigDecimal4 = new java.math.BigDecimal(m6.J());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!com.google.android.gms.measurement.internal.Z5.g0(m6.I())) {
                return null;
            }
            try {
                bigDecimal2 = new java.math.BigDecimal(m6.I());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (java.lang.NumberFormatException unused2) {
            }
            if (bVarF2 == bVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i6 = com.google.android.gms.measurement.internal.k6.f42496b[bVarF2.ordinal()];
            boolean z6 = false;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z6 = true;
                        }
                        return java.lang.Boolean.valueOf(z6);
                    }
                    if (bigDecimal2 != null) {
                        if (d6 == 0.0d) {
                            return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new java.math.BigDecimal(d6).multiply(new java.math.BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new java.math.BigDecimal(d6).multiply(new java.math.BigDecimal(2)))) < 0) {
                            z6 = true;
                        }
                        return java.lang.Boolean.valueOf(z6);
                    }
                } else if (bigDecimal2 != null) {
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}
