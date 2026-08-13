package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends M8.e implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final F8.a0.a f2872D = new F8.a0.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final F8.a0 f2873E = new F8.a0(p097j7.AbstractC6879v.m());

    public static final class a extends M8.s {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        @Override // M8.s
        public int b(j$.util.concurrent.ConcurrentHashMap concurrentHashMap, java.lang.String str, p237x7.l lVar) {
            int iIntValue;
            p247y7.AbstractC7350t.f(concurrentHashMap, "<this>");
            p247y7.AbstractC7350t.f(str, "key");
            p247y7.AbstractC7350t.f(lVar, "compute");
            java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    java.lang.Integer num2 = (java.lang.Integer) concurrentHashMap.get(str);
                    if (num2 == null) {
                        java.lang.Object objL = lVar.l(str);
                        concurrentHashMap.putIfAbsent(str, java.lang.Integer.valueOf(((java.lang.Number) objL).intValue()));
                        num2 = (java.lang.Integer) objL;
                    }
                    p247y7.AbstractC7350t.c(num2);
                    iIntValue = num2.intValue();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final F8.a0 h(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "attributes");
            return list.isEmpty() ? i() : new F8.a0(list, null);
        }

        public final F8.a0 i() {
            return F8.a0.f2873E;
        }
    }

    private a0(F8.Y y6) {
        this(p097j7.AbstractC6879v.e(y6));
    }

    private a0(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            F8.Y y6 = (F8.Y) it.next();
            f(y6.b(), y6);
        }
    }

    public /* synthetic */ a0(java.util.List list, p247y7.AbstractC7342k abstractC7342k) {
        this(list);
    }

    public final boolean C(F8.Y y6) {
        p247y7.AbstractC7350t.f(y6, "attribute");
        return d().get(f2872D.d(y6.b())) != null;
    }

    public final F8.a0 D(F8.a0 a0Var) {
        F8.Y yC;
        p247y7.AbstractC7350t.f(a0Var, "other");
        if (isEmpty() && a0Var.isEmpty()) {
            return this;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f2872D.f().iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            F8.Y y6 = (F8.Y) d().get(iIntValue);
            F8.Y y10 = (F8.Y) a0Var.d().get(iIntValue);
            if (y6 == null) {
                yC = y10 != null ? y10.c(y6) : null;
            } else {
                yC = y6.c(y10);
            }
            P8.a.a(arrayList, yC);
        }
        return f2872D.h(arrayList);
    }

    public final F8.a0 E(F8.Y y6) {
        p247y7.AbstractC7350t.f(y6, "attribute");
        if (C(y6)) {
            return this;
        }
        if (isEmpty()) {
            return new F8.a0(y6);
        }
        return f2872D.h(p097j7.AbstractC6879v.D0(p097j7.AbstractC6879v.T0(this), y6));
    }

    public final F8.a0 M(F8.Y y6) {
        p247y7.AbstractC7350t.f(y6, "attribute");
        if (isEmpty()) {
            return this;
        }
        M8.c cVarD = d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : cVarD) {
            if (!p247y7.AbstractC7350t.b((F8.Y) obj, y6)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == d().d() ? this : f2872D.h(arrayList);
    }

    @Override // M8.a
    protected M8.s e() {
        return f2872D;
    }

    public final F8.a0 s(F8.a0 a0Var) {
        F8.Y yA;
        p247y7.AbstractC7350t.f(a0Var, "other");
        if (isEmpty() && a0Var.isEmpty()) {
            return this;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f2872D.f().iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            F8.Y y6 = (F8.Y) d().get(iIntValue);
            F8.Y y10 = (F8.Y) a0Var.d().get(iIntValue);
            if (y6 == null) {
                yA = y10 != null ? y10.a(y6) : null;
            } else {
                yA = y6.a(y10);
            }
            P8.a.a(arrayList, yA);
        }
        return f2872D.h(arrayList);
    }
}
