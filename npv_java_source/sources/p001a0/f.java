package p001a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends p097j7.AbstractC6867i implements java.util.Map, p256z7.e, j$.util.Map {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p001a0.d f17003C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p021c0.e f17004D = new p021c0.e();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p001a0.t f17005E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object f17006F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f17007G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f17008H;

    public f(p001a0.d dVar) {
        this.f17003C = dVar;
        this.f17005E = this.f17003C.r();
        this.f17008H = this.f17003C.size();
    }

    @Override // p097j7.AbstractC6867i
    public java.util.Set a() {
        return new p001a0.h(this);
    }

    @Override // p097j7.AbstractC6867i
    public java.util.Set b() {
        return new p001a0.j(this);
    }

    @Override // p097j7.AbstractC6867i
    public int c() {
        return this.f17008H;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        p001a0.t tVarA = p001a0.t.f17020e.a();
        p247y7.AbstractC7350t.d(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f17005E = tVarA;
        o(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f17005E.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p097j7.AbstractC6867i
    public java.util.Collection d() {
        return new p001a0.l(this);
    }

    /* JADX INFO: renamed from: e */
    public abstract p001a0.d i();

    public final int f() {
        return this.f17007G;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public final p001a0.t g() {
        return this.f17005E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f17005E.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final p021c0.e h() {
        return this.f17004D;
    }

    public final void k(int i6) {
        this.f17007G = i6;
    }

    public final void l(java.lang.Object obj) {
        this.f17006F = obj;
    }

    protected final void m(p021c0.e eVar) {
        this.f17004D = eVar;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public void o(int i6) {
        this.f17008H = i6;
        this.f17007G++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.f17006F = null;
        this.f17005E = this.f17005E.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f17006F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        p001a0.d dVarE = map instanceof p001a0.d ? (p001a0.d) map : null;
        if (dVarE == null) {
            p001a0.f fVar = map instanceof p001a0.f ? (p001a0.f) map : null;
            dVarE = fVar != null ? fVar.i() : null;
        }
        if (dVarE == null) {
            super.putAll(map);
            return;
        }
        p021c0.b bVar = new p021c0.b(0, 1, null);
        int size = size();
        p001a0.t tVar = this.f17005E;
        p001a0.t tVarR = dVarE.r();
        p247y7.AbstractC7350t.d(tVarR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f17005E = tVar.E(tVarR, 0, bVar, this);
        int size2 = (dVarE.size() + size) - bVar.a();
        if (size != size2) {
            o(size2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        this.f17006F = null;
        p001a0.t tVarG = this.f17005E.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarG == null) {
            tVarG = p001a0.t.f17020e.a();
            p247y7.AbstractC7350t.d(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f17005E = tVarG;
        return this.f17006F;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int size = size();
        p001a0.t tVarH = this.f17005E.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = p001a0.t.f17020e.a();
            p247y7.AbstractC7350t.d(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f17005E = tVarH;
        return size != size();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }
}
