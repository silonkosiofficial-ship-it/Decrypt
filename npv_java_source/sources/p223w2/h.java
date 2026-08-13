package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final boolean a(o2.n.e eVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(eVar, "<this>");
        java.util.Map mapE = eVar.e();
        if (!mapE.containsKey(java.lang.Integer.valueOf(i6))) {
            return false;
        }
        java.util.Map mapH = (java.util.Map) mapE.get(java.lang.Integer.valueOf(i6));
        if (mapH == null) {
            mapH = p097j7.S.h();
        }
        return mapH.containsKey(java.lang.Integer.valueOf(i10));
    }

    public static final java.util.List b(o2.n.e eVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(eVar, "<this>");
        if (i6 == i10) {
            return p097j7.AbstractC6879v.m();
        }
        return c(eVar, new java.util.ArrayList(), i10 > i6, i6, i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[LOOP:0: B:2:0x0000->B:27:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0009  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    private static final java.util.List c(o2.n.e eVar, java.util.List list, boolean z6, int i6, int i10) {
        p087i7.u uVarG;
        java.util.Iterator it;
        int iIntValue;
        boolean z10;
        while (true) {
            if (z6) {
                if (i6 >= i10) {
                    break;
                }
                if (z6) {
                    uVarG = eVar.f(i6);
                } else {
                    uVarG = eVar.g(i6);
                }
                if (uVarG == null) {
                    return null;
                }
                java.util.Map map = (java.util.Map) uVarG.a();
                it = ((java.lang.Iterable) uVarG.b()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        iIntValue = i6;
                        z10 = false;
                        break;
                    }
                    iIntValue = ((java.lang.Number) it.next()).intValue();
                    if (!z6) {
                        if (i10 <= iIntValue && iIntValue < i6) {
                            java.lang.Object obj = map.get(java.lang.Integer.valueOf(iIntValue));
                            p247y7.AbstractC7350t.c(obj);
                            list.add(obj);
                            z10 = true;
                            break;
                        }
                    } else if (i6 + 1 <= iIntValue && iIntValue <= i10) {
                        java.lang.Object obj2 = map.get(java.lang.Integer.valueOf(iIntValue));
                        p247y7.AbstractC7350t.c(obj2);
                        list.add(obj2);
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return null;
                }
                i6 = iIntValue;
            } else {
                if (i6 <= i10) {
                    break;
                }
                if (z6) {
                    uVarG = eVar.f(i6);
                } else {
                    uVarG = eVar.g(i6);
                }
                if (uVarG == null) {
                    return null;
                }
                java.util.Map map2 = (java.util.Map) uVarG.a();
                it = ((java.lang.Iterable) uVarG.b()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        iIntValue = i6;
                        z10 = false;
                        break;
                    }
                    iIntValue = ((java.lang.Number) it.next()).intValue();
                    if (!z6) {
                        if (i6 + 1 <= iIntValue) {
                            continue;
                        }
                    } else if (i10 <= iIntValue) {
                        continue;
                    }
                }
                if (!z10) {
                    return null;
                }
                i6 = iIntValue;
            }
        }
        return list;
    }

    public static final boolean d(p143o2.C7023c c7023c, int i6, int i10) {
        p247y7.AbstractC7350t.f(c7023c, "<this>");
        if ((i6 <= i10 || !c7023c.f52408l) && c7023c.f52407k) {
            return c7023c.c() == null || !c7023c.c().contains(java.lang.Integer.valueOf(i6));
        }
        return false;
    }
}
