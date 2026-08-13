package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public class a implements p018b8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p048e8.g f24182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f24183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f24184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f24185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f24186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f24187f;

    /* JADX INFO: renamed from: b8.a$a, reason: collision with other inner class name */
    static final class C0460a extends p247y7.AbstractC7352v implements p237x7.l {
        C0460a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p048e8.r rVar) {
            p247y7.AbstractC7350t.f(rVar, "m");
            return java.lang.Boolean.valueOf(((java.lang.Boolean) p018b8.a.this.f24183b.l(rVar)).booleanValue() && !p048e8.p.c(rVar));
        }
    }

    public a(p048e8.g gVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(gVar, "jClass");
        p247y7.AbstractC7350t.f(lVar, "memberFilter");
        this.f24182a = gVar;
        this.f24183b = lVar;
        p018b8.a.C0460a c0460a = new p018b8.a.C0460a();
        this.f24184c = c0460a;
        R8.h hVarW = R8.k.w(p097j7.AbstractC6879v.Y(gVar.S()), c0460a);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : hVarW) {
            p138n8.f name = ((p048e8.r) obj).getName();
            java.lang.Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.f24185d = linkedHashMap;
        R8.h hVarW2 = R8.k.w(p097j7.AbstractC6879v.Y(this.f24182a.H()), this.f24183b);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : hVarW2) {
            linkedHashMap2.put(((p048e8.n) obj2).getName(), obj2);
        }
        this.f24186e = linkedHashMap2;
        java.util.Collection collectionI = this.f24182a.i();
        p237x7.l lVar2 = this.f24183b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : collectionI) {
            if (((java.lang.Boolean) lVar2.l(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(arrayList2, 10)), 16));
        for (java.lang.Object obj4 : arrayList2) {
            linkedHashMap3.put(((p048e8.w) obj4).getName(), obj4);
        }
        this.f24187f = linkedHashMap3;
    }

    @Override // p018b8.b
    public java.util.Set a() {
        R8.h hVarW = R8.k.w(p097j7.AbstractC6879v.Y(this.f24182a.S()), this.f24184c);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = hVarW.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((p048e8.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p018b8.b
    public p048e8.w b(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return (p048e8.w) this.f24187f.get(fVar);
    }

    @Override // p018b8.b
    public p048e8.n c(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return (p048e8.n) this.f24186e.get(fVar);
    }

    @Override // p018b8.b
    public java.util.Collection d(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        java.util.List listM = (java.util.List) this.f24185d.get(fVar);
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        return listM;
    }

    @Override // p018b8.b
    public java.util.Set e() {
        return this.f24187f.keySet();
    }

    @Override // p018b8.b
    public java.util.Set f() {
        R8.h hVarW = R8.k.w(p097j7.AbstractC6879v.Y(this.f24182a.H()), this.f24183b);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = hVarW.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((p048e8.n) it.next()).getName());
        }
        return linkedHashSet;
    }
}
