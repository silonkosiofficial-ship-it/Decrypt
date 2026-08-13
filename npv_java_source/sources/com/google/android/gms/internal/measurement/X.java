package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends com.google.android.gms.internal.measurement.A {
    protected X() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.ASSIGN);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.CONST);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.CREATE_ARRAY);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.CREATE_OBJECT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.EXPRESSION_LIST);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.GET);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.GET_INDEX);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.GET_PROPERTY);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.NULL);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.SET_PROPERTY);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.TYPEOF);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.UNDEFINED);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        java.lang.String str2;
        int i6 = 0;
        switch (com.google.android.gms.internal.measurement.W.f40697a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()]) {
            case 1:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.ASSIGN, 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (!(interfaceC6117sB instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for assign var. got %s", interfaceC6117sB.getClass().getCanonicalName()));
                }
                if (!c5963a3.g(interfaceC6117sB.e())) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to assign undefined value %s", interfaceC6117sB.e()));
                }
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                c5963a3.h(interfaceC6117sB.e(), interfaceC6117sB2);
                return interfaceC6117sB2;
            case 2:
                com.google.android.gms.internal.measurement.AbstractC6152w2.j(com.google.android.gms.internal.measurement.Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("CONST requires an even number of arguments, found %s", java.lang.Integer.valueOf(list.size())));
                }
                for (int i10 = 0; i10 < list.size() - 1; i10 += 2) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i10));
                    if (!(interfaceC6117sB3 instanceof com.google.android.gms.internal.measurement.C6133u)) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for const name. got %s", interfaceC6117sB3.getClass().getCanonicalName()));
                    }
                    c5963a3.f(interfaceC6117sB3.e(), c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i10 + 1)));
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 3:
                if (list.isEmpty()) {
                    return new com.google.android.gms.internal.measurement.C6013g();
                }
                com.google.android.gms.internal.measurement.C6013g c6013g = new com.google.android.gms.internal.measurement.C6013g();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB4 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) it.next());
                    if (interfaceC6117sB4 instanceof com.google.android.gms.internal.measurement.C6058l) {
                        throw new java.lang.IllegalStateException("Failed to evaluate array element");
                    }
                    c6013g.Q(i6, interfaceC6117sB4);
                    i6++;
                }
                return c6013g;
            case 4:
                if (list.isEmpty()) {
                    return new com.google.android.gms.internal.measurement.r();
                }
                if (list.size() % 2 != 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("CREATE_OBJECT requires an even number of arguments, found %s", java.lang.Integer.valueOf(list.size())));
                }
                com.google.android.gms.internal.measurement.r rVar = new com.google.android.gms.internal.measurement.r();
                while (i6 < list.size() - 1) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB5 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i6));
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB6 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i6 + 1));
                    if ((interfaceC6117sB5 instanceof com.google.android.gms.internal.measurement.C6058l) || (interfaceC6117sB6 instanceof com.google.android.gms.internal.measurement.C6058l)) {
                        throw new java.lang.IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.s(interfaceC6117sB5.e(), interfaceC6117sB6);
                    i6 += 2;
                }
                return rVar;
            case 5:
                com.google.android.gms.internal.measurement.AbstractC6152w2.j(com.google.android.gms.internal.measurement.Z.EXPRESSION_LIST, 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB7 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                while (i6 < list.size()) {
                    interfaceC6117sB7 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i6));
                    if (interfaceC6117sB7 instanceof com.google.android.gms.internal.measurement.C6058l) {
                        throw new java.lang.IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i6++;
                }
                return interfaceC6117sB7;
            case 6:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.GET, 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB8 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (interfaceC6117sB8 instanceof com.google.android.gms.internal.measurement.C6133u) {
                    return c5963a3.c(interfaceC6117sB8.e());
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for get var. got %s", interfaceC6117sB8.getClass().getCanonicalName()));
            case 7:
            case 8:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.GET_PROPERTY, 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB9 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB10 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                if ((interfaceC6117sB9 instanceof com.google.android.gms.internal.measurement.C6013g) && com.google.android.gms.internal.measurement.AbstractC6152w2.l(interfaceC6117sB10)) {
                    return ((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB9).C(interfaceC6117sB10.d().intValue());
                }
                if (interfaceC6117sB9 instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
                    return ((com.google.android.gms.internal.measurement.InterfaceC6067m) interfaceC6117sB9).o(interfaceC6117sB10.e());
                }
                if (interfaceC6117sB9 instanceof com.google.android.gms.internal.measurement.C6133u) {
                    if ("length".equals(interfaceC6117sB10.e())) {
                        return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(interfaceC6117sB9.e().length()));
                    }
                    if (com.google.android.gms.internal.measurement.AbstractC6152w2.l(interfaceC6117sB10) && interfaceC6117sB10.d().doubleValue() < interfaceC6117sB9.e().length()) {
                        return new com.google.android.gms.internal.measurement.C6133u(java.lang.String.valueOf(interfaceC6117sB9.e().charAt(interfaceC6117sB10.d().intValue())));
                    }
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 9:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.NULL, 0, list);
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41175p;
            case 10:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.SET_PROPERTY, 3, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB11 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB12 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB13 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2));
                if (interfaceC6117sB11 == com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o || interfaceC6117sB11 == com.google.android.gms.internal.measurement.InterfaceC6117s.f41175p) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Can't set property %s of %s", interfaceC6117sB12.e(), interfaceC6117sB11.e()));
                }
                if ((interfaceC6117sB11 instanceof com.google.android.gms.internal.measurement.C6013g) && (interfaceC6117sB12 instanceof com.google.android.gms.internal.measurement.C6049k)) {
                    ((com.google.android.gms.internal.measurement.C6013g) interfaceC6117sB11).Q(interfaceC6117sB12.d().intValue(), interfaceC6117sB13);
                } else if (interfaceC6117sB11 instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
                    ((com.google.android.gms.internal.measurement.InterfaceC6067m) interfaceC6117sB11).s(interfaceC6117sB12.e(), interfaceC6117sB13);
                }
                return interfaceC6117sB13;
            case 11:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.TYPEOF, 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB14 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6173z) {
                    str2 = "undefined";
                } else if (interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6022h) {
                    str2 = "boolean";
                } else if (interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6049k) {
                    str2 = "number";
                } else if (interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6133u) {
                    str2 = "string";
                } else if (interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6125t) {
                    str2 = "function";
                } else {
                    if ((interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6141v) || (interfaceC6117sB14 instanceof com.google.android.gms.internal.measurement.C6058l)) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported value type %s in typeof", interfaceC6117sB14));
                    }
                    str2 = "object";
                }
                return new com.google.android.gms.internal.measurement.C6133u(str2);
            case 12:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.UNDEFINED, 0, list);
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            case 13:
                com.google.android.gms.internal.measurement.AbstractC6152w2.j(com.google.android.gms.internal.measurement.Z.VAR, 1, list);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB15 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) it2.next());
                    if (!(interfaceC6117sB15 instanceof com.google.android.gms.internal.measurement.C6133u)) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for var name. got %s", interfaceC6117sB15.getClass().getCanonicalName()));
                    }
                    c5963a3.e(interfaceC6117sB15.e(), com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o);
                }
                return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            default:
                return super.a(str);
        }
    }
}
