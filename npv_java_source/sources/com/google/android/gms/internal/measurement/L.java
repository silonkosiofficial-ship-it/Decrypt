package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends com.google.android.gms.internal.measurement.A {
    protected L() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_IN);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_IN_CONST);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_IN_LET);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_LET);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_OF);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_OF_CONST);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FOR_OF_LET);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.WHILE);
    }

    private static com.google.android.gms.internal.measurement.InterfaceC6117s c(com.google.android.gms.internal.measurement.P p6, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2) {
        return d(p6, interfaceC6117s.g(), interfaceC6117s2);
    }

    private static com.google.android.gms.internal.measurement.InterfaceC6117s d(com.google.android.gms.internal.measurement.P p6, java.util.Iterator it, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (it != null) {
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = p6.a((com.google.android.gms.internal.measurement.InterfaceC6117s) it.next()).a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117s);
                if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                    com.google.android.gms.internal.measurement.C6058l c6058l = (com.google.android.gms.internal.measurement.C6058l) interfaceC6117sA;
                    if ("break".equals(c6058l.b())) {
                        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                    }
                    if ("return".equals(c6058l.b())) {
                        return c6058l;
                    }
                }
            }
        }
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }

    private static com.google.android.gms.internal.measurement.InterfaceC6117s e(com.google.android.gms.internal.measurement.P p6, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2) {
        if (interfaceC6117s instanceof java.lang.Iterable) {
            return d(p6, ((java.lang.Iterable) interfaceC6117s).iterator(), interfaceC6117s2);
        }
        throw new java.lang.IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:88:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA;
        com.google.android.gms.internal.measurement.C6058l c6058l;
        switch (com.google.android.gms.internal.measurement.O.f40619a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()]) {
            case 1:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_IN, 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new com.google.android.gms.internal.measurement.T(c5963a3, ((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)));
            case 2:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new com.google.android.gms.internal.measurement.N(c5963a3, ((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)));
            case 3:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new com.google.android.gms.internal.measurement.Q(c5963a3, ((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)));
            case 4:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_LET, 4, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (!(interfaceC6117sB instanceof com.google.android.gms.internal.measurement.C6013g)) {
                    throw new java.lang.IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                com.google.android.gms.internal.measurement.C6013g c6013g = (com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB;
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s = (com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2 = (com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(3));
                com.google.android.gms.internal.measurement.C5963a3 c5963a3D = c5963a3.d();
                for (int i6 = 0; i6 < c6013g.N(); i6++) {
                    java.lang.String strE = c6013g.C(i6).e();
                    c5963a3D.h(strE, c5963a3.c(strE));
                }
                while (c5963a3.b(interfaceC6117s).f().booleanValue()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA2 = c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB2);
                    if (interfaceC6117sA2 instanceof com.google.android.gms.internal.measurement.C6058l) {
                        com.google.android.gms.internal.measurement.C6058l c6058l2 = (com.google.android.gms.internal.measurement.C6058l) interfaceC6117sA2;
                        if ("break".equals(c6058l2.b())) {
                            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                        }
                        if ("return".equals(c6058l2.b())) {
                            return c6058l2;
                        }
                    }
                    com.google.android.gms.internal.measurement.C5963a3 c5963a3D2 = c5963a3.d();
                    for (int i10 = 0; i10 < c6013g.N(); i10++) {
                        java.lang.String strE2 = c6013g.C(i10).e();
                        c5963a3D2.h(strE2, c5963a3D.c(strE2));
                    }
                    c5963a3D2.b(interfaceC6117s2);
                    c5963a3D = c5963a3D2;
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 5:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_OF, 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new com.google.android.gms.internal.measurement.T(c5963a3, ((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)));
            case 6:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new com.google.android.gms.internal.measurement.N(c5963a3, ((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)));
            case 7:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new com.google.android.gms.internal.measurement.Q(c5963a3, ((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)));
            case 8:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.WHILE, 4, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s3 = (com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s4 = (com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s5 = (com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(3));
                if (c5963a3.b(interfaceC6117s5).f().booleanValue()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA3 = c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB3);
                    if (interfaceC6117sA3 instanceof com.google.android.gms.internal.measurement.C6058l) {
                        com.google.android.gms.internal.measurement.C6058l c6058l3 = (com.google.android.gms.internal.measurement.C6058l) interfaceC6117sA3;
                        if (!"break".equals(c6058l3.b())) {
                            if ("return".equals(c6058l3.b())) {
                                return c6058l3;
                            }
                            while (c5963a3.b(interfaceC6117s3).f().booleanValue()) {
                                interfaceC6117sA = c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB3);
                                if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                                    c6058l = (com.google.android.gms.internal.measurement.C6058l) interfaceC6117sA;
                                    if (!"break".equals(c6058l.b())) {
                                        if ("return".equals(c6058l.b())) {
                                            return c6058l;
                                        }
                                    }
                                }
                                c5963a3.b(interfaceC6117s4);
                            }
                        }
                    } else {
                        while (c5963a3.b(interfaceC6117s3).f().booleanValue()) {
                            interfaceC6117sA = c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB3);
                            if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                                c6058l = (com.google.android.gms.internal.measurement.C6058l) interfaceC6117sA;
                                if (!"break".equals(c6058l.b())) {
                                    if ("return".equals(c6058l.b())) {
                                        return c6058l;
                                    }
                                }
                            }
                            c5963a3.b(interfaceC6117s4);
                        }
                    }
                } else {
                    while (c5963a3.b(interfaceC6117s3).f().booleanValue()) {
                        interfaceC6117sA = c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB3);
                        if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                            c6058l = (com.google.android.gms.internal.measurement.C6058l) interfaceC6117sA;
                            if (!"break".equals(c6058l.b())) {
                                if ("return".equals(c6058l.b())) {
                                    return c6058l;
                                }
                            }
                        }
                        c5963a3.b(interfaceC6117s4);
                    }
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            default:
                return super.a(str);
        }
    }
}
