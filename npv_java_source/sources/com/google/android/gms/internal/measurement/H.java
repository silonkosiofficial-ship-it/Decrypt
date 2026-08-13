package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H {
    private static com.google.android.gms.internal.measurement.C6013g a(com.google.android.gms.internal.measurement.C6013g c6013g, com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n) {
        return b(c6013g, c5963a3, abstractC6076n, null, null);
    }

    private static com.google.android.gms.internal.measurement.C6013g b(com.google.android.gms.internal.measurement.C6013g c6013g, com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n, java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.google.android.gms.internal.measurement.C6013g c6013g2 = new com.google.android.gms.internal.measurement.C6013g();
        java.util.Iterator itS = c6013g.S();
        while (itS.hasNext()) {
            int iIntValue = ((java.lang.Integer) itS.next()).intValue();
            if (c6013g.R(iIntValue)) {
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = abstractC6076n.a(c5963a3, java.util.Arrays.asList(c6013g.C(iIntValue), new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(iIntValue)), c6013g));
                if (interfaceC6117sA.f().equals(bool)) {
                    return c6013g2;
                }
                if (bool2 == null || interfaceC6117sA.f().equals(bool2)) {
                    c6013g2.Q(iIntValue, interfaceC6117sA);
                }
            }
        }
        return c6013g2;
    }

    private static com.google.android.gms.internal.measurement.InterfaceC6117s c(com.google.android.gms.internal.measurement.C6013g c6013g, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list, boolean z6) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA;
        com.google.android.gms.internal.measurement.AbstractC6152w2.k("reduce", 1, list);
        com.google.android.gms.internal.measurement.AbstractC6152w2.n("reduce", 2, list);
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
        if (!(interfaceC6117sB instanceof com.google.android.gms.internal.measurement.AbstractC6076n)) {
            throw new java.lang.IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC6117sA = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
            if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                throw new java.lang.IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c6013g.N() == 0) {
                throw new java.lang.IllegalStateException("Empty array with no initial value error");
            }
            interfaceC6117sA = null;
        }
        com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n = (com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sB;
        int iN = c6013g.N();
        int i6 = z6 ? 0 : iN - 1;
        int i10 = z6 ? iN - 1 : 0;
        int i11 = z6 ? 1 : -1;
        if (interfaceC6117sA == null) {
            interfaceC6117sA = c6013g.C(i6);
            i6 += i11;
        }
        while ((i10 - i6) * i11 >= 0) {
            if (c6013g.R(i6)) {
                interfaceC6117sA = abstractC6076n.a(c5963a3, java.util.Arrays.asList(interfaceC6117sA, c6013g.C(i6), new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(i6)), c6013g));
                if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                    throw new java.lang.IllegalStateException("Reduce operation failed");
                }
                i6 += i11;
            } else {
                i6 += i11;
            }
        }
        return interfaceC6117sA;
    }

    public static com.google.android.gms.internal.measurement.InterfaceC6117s d(java.lang.String str, com.google.android.gms.internal.measurement.C6013g c6013g, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        java.lang.String str2;
        byte b6;
        double d6;
        java.lang.String strE;
        com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n;
        int i6;
        com.google.android.gms.internal.measurement.C5963a3 c5963a4;
        java.lang.Double d10;
        double dA;
        str.hashCode();
        java.lang.Double dValueOf = java.lang.Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                b6 = str.equals(str2) ? (byte) 0 : (byte) -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    b6 = 1;
                } else {
                    str2 = "toString";
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b6 = 2;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    b6 = 3;
                } else {
                    str2 = "toString";
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b6 = 4;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b6 = 5;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b6 = 6;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b6 = 7;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b6 = 8;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    b6 = 9;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b6 = 10;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b6 = 11;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b6 = 12;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    b6 = 13;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    b6 = 14;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b6 = 15;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b6 = 16;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b6 = 17;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b6 = 18;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b6 = 19;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            default:
                str2 = "toString";
                break;
        }
        switch (b6) {
            case 0:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str2, 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(c6013g.toString());
            case 1:
                com.google.android.gms.internal.measurement.C6013g c6013g2 = (com.google.android.gms.internal.measurement.C6013g) c6013g.c();
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) it.next());
                        if (interfaceC6117sB instanceof com.google.android.gms.internal.measurement.C6058l) {
                            throw new java.lang.IllegalStateException("Failed evaluation of arguments");
                        }
                        int iN = c6013g2.N();
                        if (interfaceC6117sB instanceof com.google.android.gms.internal.measurement.C6013g) {
                            com.google.android.gms.internal.measurement.C6013g c6013g3 = (com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB;
                            java.util.Iterator itS = c6013g3.S();
                            while (itS.hasNext()) {
                                java.lang.Integer num = (java.lang.Integer) itS.next();
                                c6013g2.Q(num.intValue() + iN, c6013g3.C(num.intValue()));
                            }
                        } else {
                            c6013g2.Q(iN, interfaceC6117sB);
                        }
                    }
                }
                return c6013g2;
            case 2:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("filter", 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (!(interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.C6125t)) {
                    throw new java.lang.IllegalArgumentException("Callback should be a method");
                }
                if (c6013g.w() == 0) {
                    return new com.google.android.gms.internal.measurement.C6013g();
                }
                com.google.android.gms.internal.measurement.C6013g c6013g4 = (com.google.android.gms.internal.measurement.C6013g) c6013g.c();
                com.google.android.gms.internal.measurement.C6013g c6013gB = b(c6013g, c5963a3, (com.google.android.gms.internal.measurement.C6125t) interfaceC6117sB2, null, java.lang.Boolean.TRUE);
                com.google.android.gms.internal.measurement.C6013g c6013g5 = new com.google.android.gms.internal.measurement.C6013g();
                java.util.Iterator itS2 = c6013gB.S();
                while (itS2.hasNext()) {
                    c6013g5.M(c6013g4.C(((java.lang.Integer) itS2.next()).intValue()));
                }
                return c6013g5;
            case 3:
                return c(c6013g, c5963a3, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new com.google.android.gms.internal.measurement.C6013g();
                }
                int iA = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue());
                if (iA < 0) {
                    iA = java.lang.Math.max(0, iA + c6013g.N());
                } else if (iA > c6013g.N()) {
                    iA = c6013g.N();
                }
                int iN2 = c6013g.N();
                com.google.android.gms.internal.measurement.C6013g c6013g6 = new com.google.android.gms.internal.measurement.C6013g();
                if (list.size() <= 1) {
                    while (iA < iN2) {
                        c6013g6.M(c6013g.C(iA));
                        c6013g.Q(iA, null);
                        iA++;
                    }
                    return c6013g6;
                }
                int iMax = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()));
                if (iMax > 0) {
                    for (int i10 = iA; i10 < java.lang.Math.min(iN2, iA + iMax); i10++) {
                        c6013g6.M(c6013g.C(iA));
                        c6013g.P(iA);
                    }
                }
                if (list.size() > 2) {
                    for (int i11 = 2; i11 < list.size(); i11++) {
                        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i11));
                        if (interfaceC6117sB3 instanceof com.google.android.gms.internal.measurement.C6058l) {
                            throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
                        }
                        c6013g.D((iA + i11) - 2, interfaceC6117sB3);
                    }
                }
                return c6013g6;
            case 5:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("forEach", 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB4 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (!(interfaceC6117sB4 instanceof com.google.android.gms.internal.measurement.C6125t)) {
                    throw new java.lang.IllegalArgumentException("Callback should be a method");
                }
                if (c6013g.w() == 0) {
                    return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                }
                a(c6013g, c5963a3, (com.google.android.gms.internal.measurement.C6125t) interfaceC6117sB4);
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 6:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("lastIndexOf", 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB5 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                if (!list.isEmpty()) {
                    interfaceC6117sB5 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                }
                double dN = c6013g.N() - 1;
                if (list.size() > 1) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB6 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                    dN = java.lang.Double.isNaN(interfaceC6117sB6.d().doubleValue()) ? c6013g.N() - 1 : com.google.android.gms.internal.measurement.AbstractC6152w2.a(interfaceC6117sB6.d().doubleValue());
                    d6 = 0.0d;
                    if (dN < 0.0d) {
                        dN += (double) c6013g.N();
                    }
                } else {
                    d6 = 0.0d;
                }
                if (dN < d6) {
                    return new com.google.android.gms.internal.measurement.C6049k(dValueOf);
                }
                for (int iMin = (int) java.lang.Math.min(c6013g.N(), dN); iMin >= 0; iMin--) {
                    if (c6013g.R(iMin) && com.google.android.gms.internal.measurement.AbstractC6152w2.h(c6013g.C(iMin), interfaceC6117sB5)) {
                        return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(iMin));
                    }
                }
                return new com.google.android.gms.internal.measurement.C6049k(dValueOf);
            case 7:
                if (!list.isEmpty()) {
                    com.google.android.gms.internal.measurement.C6013g c6013g7 = new com.google.android.gms.internal.measurement.C6013g();
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB7 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) it2.next());
                        if (interfaceC6117sB7 instanceof com.google.android.gms.internal.measurement.C6058l) {
                            throw new java.lang.IllegalStateException("Argument evaluation failed");
                        }
                        c6013g7.M(interfaceC6117sB7);
                    }
                    int iN3 = c6013g7.N();
                    java.util.Iterator itS3 = c6013g.S();
                    while (itS3.hasNext()) {
                        java.lang.Integer num2 = (java.lang.Integer) itS3.next();
                        c6013g7.Q(num2.intValue() + iN3, c6013g.C(num2.intValue()));
                    }
                    c6013g.U();
                    java.util.Iterator itS4 = c6013g7.S();
                    while (itS4.hasNext()) {
                        java.lang.Integer num3 = (java.lang.Integer) itS4.next();
                        c6013g.Q(num3.intValue(), c6013g7.C(num3.intValue()));
                    }
                }
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c6013g.N()));
            case 8:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("map", 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB8 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (interfaceC6117sB8 instanceof com.google.android.gms.internal.measurement.C6125t) {
                    return c6013g.N() == 0 ? new com.google.android.gms.internal.measurement.C6013g() : a(c6013g, c5963a3, (com.google.android.gms.internal.measurement.C6125t) interfaceC6117sB8);
                }
                throw new java.lang.IllegalArgumentException("Callback should be a method");
            case 9:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("pop", 0, list);
                int iN4 = c6013g.N();
                if (iN4 == 0) {
                    return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                }
                int i12 = iN4 - 1;
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC = c6013g.C(i12);
                c6013g.P(i12);
                return interfaceC6117sC;
            case 10:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("join", 1, list);
                if (c6013g.N() == 0) {
                    return com.google.android.gms.internal.measurement.InterfaceC6117s.f41181v;
                }
                if (list.isEmpty()) {
                    strE = ",";
                } else {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB9 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                    strE = ((interfaceC6117sB9 instanceof com.google.android.gms.internal.measurement.C6102q) || (interfaceC6117sB9 instanceof com.google.android.gms.internal.measurement.C6173z)) ? "" : interfaceC6117sB9.e();
                }
                return new com.google.android.gms.internal.measurement.C6133u(c6013g.O(strE));
            case 11:
                if (!list.isEmpty()) {
                    java.util.Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c6013g.M(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) it3.next()));
                    }
                }
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c6013g.N()));
            case 12:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("some", 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB10 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (!(interfaceC6117sB10 instanceof com.google.android.gms.internal.measurement.AbstractC6076n)) {
                    throw new java.lang.IllegalArgumentException("Callback should be a method");
                }
                if (c6013g.N() != 0) {
                    com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n2 = (com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sB10;
                    java.util.Iterator itS5 = c6013g.S();
                    while (itS5.hasNext()) {
                        int iIntValue = ((java.lang.Integer) itS5.next()).intValue();
                        if (c6013g.R(iIntValue) && abstractC6076n2.a(c5963a3, java.util.Arrays.asList(c6013g.C(iIntValue), new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(iIntValue)), c6013g)).f().booleanValue()) {
                            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t;
                        }
                    }
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41180u;
            case 13:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("sort", 1, list);
                if (c6013g.N() >= 2) {
                    java.util.List listT = c6013g.T();
                    if (list.isEmpty()) {
                        abstractC6076n = null;
                    } else {
                        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB11 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                        if (!(interfaceC6117sB11 instanceof com.google.android.gms.internal.measurement.AbstractC6076n)) {
                            throw new java.lang.IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC6076n = (com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sB11;
                    }
                    java.util.Collections.sort(listT, new com.google.android.gms.internal.measurement.K(abstractC6076n, c5963a3));
                    c6013g.U();
                    java.util.Iterator it4 = listT.iterator();
                    int i13 = 0;
                    while (it4.hasNext()) {
                        c6013g.Q(i13, (com.google.android.gms.internal.measurement.InterfaceC6117s) it4.next());
                        i13++;
                    }
                }
                return c6013g;
            case 14:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("every", 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB12 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (interfaceC6117sB12 instanceof com.google.android.gms.internal.measurement.C6125t) {
                    return (c6013g.N() == 0 || b(c6013g, c5963a3, (com.google.android.gms.internal.measurement.C6125t) interfaceC6117sB12, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).N() == c6013g.N()) ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t : com.google.android.gms.internal.measurement.InterfaceC6117s.f41180u;
                }
                throw new java.lang.IllegalArgumentException("Callback should be a method");
            case 15:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("shift", 0, list);
                if (c6013g.N() == 0) {
                    return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                }
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC2 = c6013g.C(0);
                c6013g.P(0);
                return interfaceC6117sC2;
            case 16:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c6013g.c();
                }
                double dN2 = c6013g.N();
                double dA2 = com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue());
                double dMax = dA2 < 0.0d ? java.lang.Math.max(dA2 + dN2, 0.0d) : java.lang.Math.min(dA2, dN2);
                if (list.size() == 2) {
                    double dA3 = com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
                    dN2 = dA3 < 0.0d ? java.lang.Math.max(dN2 + dA3, 0.0d) : java.lang.Math.min(dN2, dA3);
                }
                com.google.android.gms.internal.measurement.C6013g c6013g8 = new com.google.android.gms.internal.measurement.C6013g();
                for (int i14 = (int) dMax; i14 < dN2; i14++) {
                    c6013g8.M(c6013g.C(i14));
                }
                return c6013g8;
            case 17:
                return c(c6013g, c5963a3, list, false);
            case 18:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("reverse", 0, list);
                int iN5 = c6013g.N();
                if (iN5 != 0) {
                    int i15 = 0;
                    while (i15 < iN5 / 2) {
                        if (c6013g.R(i15)) {
                            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC3 = c6013g.C(i15);
                            c6013g.Q(i15, null);
                            i6 = 1;
                            int i16 = (iN5 - 1) - i15;
                            if (c6013g.R(i16)) {
                                c6013g.Q(i15, c6013g.C(i16));
                            }
                            c6013g.Q(i16, interfaceC6117sC3);
                        } else {
                            i6 = 1;
                        }
                        i15 += i6;
                    }
                }
                return c6013g;
            case 19:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("indexOf", 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB13 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                if (list.isEmpty()) {
                    c5963a4 = c5963a3;
                } else {
                    c5963a4 = c5963a3;
                    interfaceC6117sB13 = c5963a4.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                }
                if (list.size() > 1) {
                    dA = com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a4.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
                    if (dA >= c6013g.N()) {
                        return new com.google.android.gms.internal.measurement.C6049k(dValueOf);
                    }
                    d10 = dValueOf;
                    if (dA < 0.0d) {
                        dA += (double) c6013g.N();
                    }
                } else {
                    d10 = dValueOf;
                    dA = 0.0d;
                }
                java.util.Iterator itS6 = c6013g.S();
                while (itS6.hasNext()) {
                    int iIntValue2 = ((java.lang.Integer) itS6.next()).intValue();
                    double d11 = iIntValue2;
                    if (d11 >= dA && com.google.android.gms.internal.measurement.AbstractC6152w2.h(c6013g.C(iIntValue2), interfaceC6117sB13)) {
                        return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(d11));
                    }
                }
                return new com.google.android.gms.internal.measurement.C6049k(d10);
            default:
                throw new java.lang.IllegalArgumentException("Command not supported");
        }
    }
}
