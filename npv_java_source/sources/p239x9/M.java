package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends p239x9.T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v9.f f56954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(p199t9.b bVar, p199t9.b bVar2) {
        super(bVar, bVar2, null);
        p247y7.AbstractC7350t.f(bVar, "kSerializer");
        p247y7.AbstractC7350t.f(bVar2, "vSerializer");
        this.f56954c = new p239x9.L(bVar.a(), bVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public java.util.LinkedHashMap p(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = map instanceof java.util.LinkedHashMap ? (java.util.LinkedHashMap) map : null;
        return linkedHashMap == null ? new java.util.LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.util.Map q(java.util.LinkedHashMap linkedHashMap) {
        p247y7.AbstractC7350t.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // p239x9.T, p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return this.f56954c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public java.util.LinkedHashMap f() {
        return new java.util.LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(java.util.LinkedHashMap linkedHashMap) {
        p247y7.AbstractC7350t.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(java.util.LinkedHashMap linkedHashMap, int i6) {
        p247y7.AbstractC7350t.f(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator i(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int j(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        return map.size();
    }
}
