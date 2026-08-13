package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends com.google.android.gms.internal.measurement.A {
    protected F() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.APPLY);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BLOCK);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BREAK);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.CASE);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.DEFAULT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.CONTINUE);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.DEFINE_FUNCTION);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.FN);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.IF);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.QUOTE);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.RETURN);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.SWITCH);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.TERNARY);
    }

    private static com.google.android.gms.internal.measurement.InterfaceC6117s c(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        com.google.android.gms.internal.measurement.AbstractC6152w2.j(com.google.android.gms.internal.measurement.Z.FN, 2, list);
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
        if (!(interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.C6013g)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("FN requires an ArrayValue of parameter names found %s", interfaceC6117sB2.getClass().getCanonicalName()));
        }
        java.util.List listT = ((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB2).T();
        java.util.List arrayList = new java.util.ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new com.google.android.gms.internal.measurement.C6125t(interfaceC6117sB.e(), listT, arrayList, c5963a3);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        switch (com.google.android.gms.internal.measurement.I.f40538a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()]) {
            case 1:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.APPLY, 3, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                java.lang.String strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).e();
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2));
                if (!(interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.C6013g)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Function arguments for Apply are not a list found %s", interfaceC6117sB2.getClass().getCanonicalName()));
                }
                if (strE.isEmpty()) {
                    throw new java.lang.IllegalArgumentException("Function name for apply is undefined");
                }
                return interfaceC6117sB.n(strE, c5963a3, ((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB2).T());
            case 2:
                return c5963a3.d().a(new com.google.android.gms.internal.measurement.C6013g(list));
            case 3:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BREAK, 0, list);
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41177r;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                    if (interfaceC6117sB3 instanceof com.google.android.gms.internal.measurement.C6013g) {
                        return c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB3);
                    }
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 6:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BREAK, 0, list);
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41176q;
            case 7:
                com.google.android.gms.internal.measurement.AbstractC6152w2.j(com.google.android.gms.internal.measurement.Z.DEFINE_FUNCTION, 2, list);
                com.google.android.gms.internal.measurement.C6125t c6125t = (com.google.android.gms.internal.measurement.C6125t) c(c5963a3, list);
                c5963a3.h(c6125t.b() == null ? "" : c6125t.b(), c6125t);
                return c6125t;
            case 8:
                return c(c5963a3, list);
            case 9:
                com.google.android.gms.internal.measurement.AbstractC6152w2.j(com.google.android.gms.internal.measurement.Z.IF, 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB4 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB5 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB6 = list.size() > 2 ? c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2)) : null;
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = interfaceC6117sB4.f().booleanValue() ? c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB5) : interfaceC6117sB6 != null ? c5963a3.a((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB6) : interfaceC6117s;
                return interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l ? interfaceC6117sA : interfaceC6117s;
            case 10:
                return new com.google.android.gms.internal.measurement.C6013g(list);
            case 11:
                if (list.isEmpty()) {
                    return com.google.android.gms.internal.measurement.InterfaceC6117s.f41178s;
                }
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.RETURN, 1, list);
                return new com.google.android.gms.internal.measurement.C6058l("return", c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)));
            case 12:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.SWITCH, 3, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB7 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB8 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB9 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2));
                if (!(interfaceC6117sB8 instanceof com.google.android.gms.internal.measurement.C6013g)) {
                    throw new java.lang.IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC6117sB9 instanceof com.google.android.gms.internal.measurement.C6013g)) {
                    throw new java.lang.IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                com.google.android.gms.internal.measurement.C6013g c6013g = (com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB8;
                com.google.android.gms.internal.measurement.C6013g c6013g2 = (com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB9;
                boolean z6 = false;
                for (int i6 = 0; i6 < c6013g.N(); i6++) {
                    if (z6 || interfaceC6117sB7.equals(c5963a3.b(c6013g.C(i6)))) {
                        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB10 = c5963a3.b(c6013g2.C(i6));
                        if (interfaceC6117sB10 instanceof com.google.android.gms.internal.measurement.C6058l) {
                            if (!((com.google.android.gms.internal.measurement.C6058l) interfaceC6117sB10).b().equals("break")) {
                                return interfaceC6117sB10;
                            }
                            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                        }
                        z6 = true;
                    }
                }
                if (c6013g.N() + 1 == c6013g2.N()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB11 = c5963a3.b(c6013g2.C(c6013g.N()));
                    if (interfaceC6117sB11 instanceof com.google.android.gms.internal.measurement.C6058l) {
                        java.lang.String strB = ((com.google.android.gms.internal.measurement.C6058l) interfaceC6117sB11).b();
                        if (strB.equals("return") || strB.equals("continue")) {
                            return interfaceC6117sB11;
                        }
                    }
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 13:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.TERNARY, 3, list);
                return c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).f().booleanValue() ? c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)) : c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
