package X7;

/* JADX INFO: renamed from: X7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1823a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X7.AbstractC1823a.C0304a f15987c = new X7.AbstractC1823a.C0304a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Map f15988d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.x f15989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f15990b;

    /* JADX INFO: renamed from: X7.a$a, reason: collision with other inner class name */
    private static final class C0304a {
        private C0304a() {
        }

        public /* synthetic */ C0304a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: X7.a$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.AbstractC1823a.b f15991D = new X7.AbstractC1823a.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "$this$extractNullability");
            return java.lang.Boolean.FALSE;
        }
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (X7.EnumC1824b enumC1824b : X7.EnumC1824b.values()) {
            java.lang.String strG = enumC1824b.g();
            if (linkedHashMap.get(strG) == null) {
                linkedHashMap.put(strG, enumC1824b);
            }
        }
        f15988d = linkedHashMap;
    }

    public AbstractC1823a(X7.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "javaTypeEnhancementState");
        this.f15989a = xVar;
        this.f15990b = new j$.util.concurrent.ConcurrentHashMap();
    }

    private final java.util.Set a(java.util.Set set) {
        return set.contains(X7.EnumC1824b.TYPE_USE) ? p097j7.Z.j(p097j7.Z.i(p097j7.AbstractC6872n.d1(X7.EnumC1824b.values()), X7.EnumC1824b.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final X7.r d(java.lang.Object obj) {
        p058f8.i iVarG;
        X7.r rVarR = r(obj);
        if (rVarR != null) {
            return rVarR;
        }
        p087i7.u uVarT = t(obj);
        if (uVarT == null) {
            return null;
        }
        java.lang.Object objA = uVarT.a();
        java.util.Set set = (java.util.Set) uVarT.b();
        X7.G gQ = q(obj);
        if (gQ == null) {
            gQ = p(objA);
        }
        if (gQ.i() || (iVarG = g(objA, X7.AbstractC1823a.b.f15991D)) == null) {
            return null;
        }
        return new X7.r(p058f8.i.b(iVarG, null, gQ.m(), 1, null), set, false, 4, null);
    }

    private final p058f8.i g(java.lang.Object obj, p237x7.l lVar) {
        p058f8.i iVarN;
        p058f8.i iVarN2 = n(obj, ((java.lang.Boolean) lVar.l(obj)).booleanValue());
        if (iVarN2 != null) {
            return iVarN2;
        }
        java.lang.Object objS = s(obj);
        if (objS == null) {
            return null;
        }
        X7.G gP = p(obj);
        if (gP.i() || (iVarN = n(objS, ((java.lang.Boolean) lVar.l(objS)).booleanValue())) == null) {
            return null;
        }
        return p058f8.i.b(iVarN, null, gP.m(), 1, null);
    }

    private final java.lang.Object h(java.lang.Object obj, p138n8.c cVar) {
        for (java.lang.Object obj2 : k(obj)) {
            if (p247y7.AbstractC7350t.b(i(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean l(java.lang.Object obj, p138n8.c cVar) {
        java.lang.Iterable iterableK = k(obj);
        if ((iterableK instanceof java.util.Collection) && ((java.util.Collection) iterableK).isEmpty()) {
            return false;
        }
        java.util.Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r7.equals("UNKNOWN") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r7.equals("NEVER") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r7.equals("MAYBE") == false) goto L44;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p058f8.i n(java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X7.AbstractC1823a.n(java.lang.Object, boolean):f8.i");
    }

    private final X7.G o(java.lang.Object obj) {
        p138n8.c cVarI = i(obj);
        return (cVarI == null || !X7.AbstractC1825c.c().containsKey(cVarI)) ? p(obj) : (X7.G) this.f15989a.c().l(cVarI);
    }

    private final X7.G p(java.lang.Object obj) {
        X7.G gQ = q(obj);
        return gQ != null ? gQ : this.f15989a.d().a();
    }

    private final X7.G q(java.lang.Object obj) {
        java.lang.Iterable iterableB;
        java.lang.String str;
        X7.G g6 = (X7.G) this.f15989a.d().c().get(i(obj));
        if (g6 != null) {
            return g6;
        }
        java.lang.Object objH = h(obj, X7.AbstractC1825c.d());
        if (objH == null || (iterableB = b(objH, false)) == null || (str = (java.lang.String) p097j7.AbstractC6879v.j0(iterableB)) == null) {
            return null;
        }
        X7.G gB = this.f15989a.d().b();
        if (gB != null) {
            return gB;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return X7.G.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return X7.G.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return X7.G.WARN;
        }
        return null;
    }

    private final X7.r r(java.lang.Object obj) {
        X7.r rVar;
        if (this.f15989a.b() || (rVar = (X7.r) X7.AbstractC1825c.a().get(i(obj))) == null) {
            return null;
        }
        X7.G gO = o(obj);
        if (gO == X7.G.IGNORE) {
            gO = null;
        }
        if (gO == null) {
            return null;
        }
        return X7.r.b(rVar, p058f8.i.b(rVar.d(), null, gO.m(), 1, null), null, false, 6, null);
    }

    private final p087i7.u t(java.lang.Object obj) {
        java.lang.Object objH;
        java.lang.Object next;
        if (this.f15989a.d().d() || (objH = h(obj, X7.AbstractC1825c.e())) == null) {
            return null;
        }
        java.util.Iterator it = k(obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (s(next) == null);
        if (next == null) {
            return null;
        }
        java.lang.Iterable iterableB = b(objH, true);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it2 = iterableB.iterator();
        while (it2.hasNext()) {
            X7.EnumC1824b enumC1824b = (X7.EnumC1824b) f15988d.get((java.lang.String) it2.next());
            if (enumC1824b != null) {
                linkedHashSet.add(enumC1824b);
            }
        }
        return new p087i7.u(next, a(linkedHashSet));
    }

    protected abstract java.lang.Iterable b(java.lang.Object obj, boolean z6);

    public final X7.y c(X7.y yVar, java.lang.Iterable iterable) {
        java.util.EnumMap enumMapB;
        p247y7.AbstractC7350t.f(iterable, "annotations");
        if (this.f15989a.b()) {
            return yVar;
        }
        java.util.ArrayList<X7.r> arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            X7.r rVarD = d(it.next());
            if (rVarD != null) {
                arrayList.add(rVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return yVar;
        }
        java.util.EnumMap enumMap = (yVar == null || (enumMapB = yVar.b()) == null) ? new java.util.EnumMap(X7.EnumC1824b.class) : new java.util.EnumMap(enumMapB);
        boolean z6 = false;
        for (X7.r rVar : arrayList) {
            java.util.Iterator it2 = rVar.e().iterator();
            while (it2.hasNext()) {
                enumMap.put((X7.EnumC1824b) it2.next(), rVar);
                z6 = true;
            }
        }
        return !z6 ? yVar : new X7.y(enumMap);
    }

    public final p058f8.f e(java.lang.Iterable iterable) {
        p058f8.f fVar;
        p247y7.AbstractC7350t.f(iterable, "annotations");
        java.util.Iterator it = iterable.iterator();
        p058f8.f fVar2 = null;
        while (it.hasNext()) {
            p138n8.c cVarI = i(it.next());
            if (X7.C.p().contains(cVarI)) {
                fVar = p058f8.f.READ_ONLY;
            } else if (X7.C.m().contains(cVarI)) {
                fVar = p058f8.f.MUTABLE;
            } else {
                continue;
            }
            if (fVar2 != null && fVar2 != fVar) {
                return null;
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    public final p058f8.i f(java.lang.Iterable iterable, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(iterable, "annotations");
        p247y7.AbstractC7350t.f(lVar, "forceWarning");
        java.util.Iterator it = iterable.iterator();
        p058f8.i iVar = null;
        while (it.hasNext()) {
            p058f8.i iVarG = g(it.next(), lVar);
            if (iVar != null) {
                if (iVarG != null && !p247y7.AbstractC7350t.b(iVarG, iVar) && (!iVarG.d() || iVar.d())) {
                    if (iVarG.d() || !iVar.d()) {
                        return null;
                    }
                }
            }
            iVar = iVarG;
        }
        return iVar;
    }

    protected abstract p138n8.c i(java.lang.Object obj);

    protected abstract java.lang.Object j(java.lang.Object obj);

    protected abstract java.lang.Iterable k(java.lang.Object obj);

    public final boolean m(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "annotation");
        java.lang.Object objH = h(obj, L7.j.a.f6341H);
        if (objH == null) {
            return false;
        }
        java.lang.Iterable iterableB = b(objH, false);
        if ((iterableB instanceof java.util.Collection) && ((java.util.Collection) iterableB).isEmpty()) {
            return false;
        }
        java.util.Iterator it = iterableB.iterator();
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b((java.lang.String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object s(java.lang.Object obj) {
        java.lang.Object objS;
        p247y7.AbstractC7350t.f(obj, "annotation");
        if (this.f15989a.d().d()) {
            return null;
        }
        if (p097j7.AbstractC6879v.Z(X7.AbstractC1825c.b(), i(obj)) || l(obj, X7.AbstractC1825c.f())) {
            return obj;
        }
        if (!l(obj, X7.AbstractC1825c.g())) {
            return null;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f15990b;
        java.lang.Object objJ = j(obj);
        V v6 = concurrentHashMap.get(objJ);
        if (v6 != 0) {
            return v6;
        }
        java.util.Iterator it = k(obj).iterator();
        do {
            if (!it.hasNext()) {
                objS = null;
                break;
            }
            objS = s(it.next());
        } while (objS == null);
        if (objS == null) {
            return null;
        }
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(objJ, objS);
        return vPutIfAbsent == 0 ? objS : vPutIfAbsent;
    }
}
