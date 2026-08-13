package ca;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final int a(java.lang.String str) {
        int iE;
        int i6;
        int iE2;
        p247y7.AbstractC7350t.f(str, "color");
        if (!S8.r.V(str, "#", false, 2, null)) {
            throw new java.lang.IllegalArgumentException(("Invalid color value " + str).toString());
        }
        int length = str.length();
        if (length != 4) {
            if (length == 5) {
                java.lang.String strSubstring = str.substring(1);
                p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                iE = S8.N.e(strSubstring, 16);
                i6 = (((iE >> 12) & 15) * 285212672) | (((iE >> 8) & 15) * 1114112);
            } else {
                if (length != 7) {
                    if (length != 9) {
                        return -16777216;
                    }
                    java.lang.String strSubstring2 = str.substring(1);
                    p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                    return S8.N.e(strSubstring2, 16);
                }
                java.lang.String strSubstring3 = str.substring(1);
                p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                iE2 = S8.N.e(strSubstring3, 16);
            }
            return (-16777216) | iE2;
        }
        java.lang.String strSubstring4 = str.substring(1);
        p247y7.AbstractC7350t.e(strSubstring4, "substring(...)");
        iE = S8.N.e(strSubstring4, 16);
        i6 = ((iE >> 8) & 15) * 1114112;
        iE2 = ((iE & 15) * 17) | i6 | (((iE >> 4) & 15) * 4352);
        return (-16777216) | iE2;
    }

    public static final float b(java.lang.String str, Y0.e eVar) {
        float f6;
        p247y7.AbstractC7350t.f(eVar, "density");
        if (str == null) {
            f6 = 0.0f;
        } else {
            if (!S8.r.J(str, "dp", false, 2, null)) {
                if (S8.r.J(str, "px", false, 2, null)) {
                    return eVar.q0(java.lang.Float.parseFloat(S8.r.K0(str, "px")));
                }
                throw new java.lang.UnsupportedOperationException("value should ends with dp or px");
            }
            f6 = java.lang.Float.parseFloat(S8.r.K0(str, "dp"));
        }
        return Y0.i.q(f6);
    }

    public static final int c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "fillType");
        if (p247y7.AbstractC7350t.b(str, "nonZero")) {
            return p141o0.S1.f52156a.b();
        }
        if (p247y7.AbstractC7350t.b(str, "evenOdd")) {
            return p141o0.S1.f52156a.a();
        }
        throw new java.lang.UnsupportedOperationException("unknown fillType: " + str);
    }

    public static final int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "strokeCap");
        int iHashCode = str.hashCode();
        if (iHashCode != -894674659) {
            if (iHashCode != 3035667) {
                if (iHashCode == 108704142 && str.equals("round")) {
                    return p141o0.g2.f52226a.b();
                }
            } else if (str.equals("butt")) {
                return p141o0.g2.f52226a.a();
            }
        } else if (str.equals("square")) {
            return p141o0.g2.f52226a.c();
        }
        throw new java.lang.UnsupportedOperationException("unknown strokeCap: " + str);
    }

    public static final int e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "strokeJoin");
        int iHashCode = str.hashCode();
        if (iHashCode != 93630586) {
            if (iHashCode != 103906565) {
                if (iHashCode == 108704142 && str.equals("round")) {
                    return p141o0.h2.f52230a.c();
                }
            } else if (str.equals("miter")) {
                return p141o0.h2.f52230a.b();
            }
        } else if (str.equals("bevel")) {
            return p141o0.h2.f52230a.a();
        }
        throw new java.lang.UnsupportedOperationException("unknown strokeJoin: " + str);
    }

    public static final int f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tileMode");
        int iHashCode = str.hashCode();
        if (iHashCode != -1073910849) {
            if (iHashCode != -436781190) {
                if (iHashCode == 94742715 && str.equals("clamp")) {
                    return p141o0.j2.f52237a.a();
                }
            } else if (str.equals("repeated")) {
                return p141o0.j2.f52237a.d();
            }
        } else if (str.equals("mirror")) {
            return p141o0.j2.f52237a.c();
        }
        throw new java.lang.UnsupportedOperationException("unknown tileMode: " + str);
    }
}
