package A9;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends A9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, java.util.Map map5, boolean z6) {
        super(null);
        p247y7.AbstractC7350t.f(map, "class2ContextualFactory");
        p247y7.AbstractC7350t.f(map2, "polyBase2Serializers");
        p247y7.AbstractC7350t.f(map3, "polyBase2DefaultSerializerProvider");
        p247y7.AbstractC7350t.f(map4, "polyBase2NamedSerializers");
        p247y7.AbstractC7350t.f(map5, "polyBase2DefaultDeserializerProvider");
        this.f278a = map;
        this.f279b = map2;
        this.f280c = map3;
        this.f281d = map4;
        this.f282e = map5;
        this.f283f = z6;
    }

    @Override // A9.b
    public void a(A9.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "collector");
        java.util.Iterator it = this.f278a.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            androidx.appcompat.app.D.a(entry.getValue());
            throw new p087i7.s();
        }
        for (java.util.Map.Entry entry2 : this.f279b.entrySet()) {
            F7.c cVar = (F7.c) entry2.getKey();
            for (java.util.Map.Entry entry3 : ((java.util.Map) entry2.getValue()).entrySet()) {
                F7.c cVar2 = (F7.c) entry3.getKey();
                p199t9.b bVar = (p199t9.b) entry3.getValue();
                p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p247y7.AbstractC7350t.d(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                dVar.b(cVar, cVar2, bVar);
            }
        }
        for (java.util.Map.Entry entry4 : this.f280c.entrySet()) {
            F7.c cVar3 = (F7.c) entry4.getKey();
            p237x7.l lVar = (p237x7.l) entry4.getValue();
            p247y7.AbstractC7350t.d(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p247y7.AbstractC7350t.d(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            dVar.c(cVar3, (p237x7.l) p247y7.W.f(lVar, 1));
        }
        for (java.util.Map.Entry entry5 : this.f282e.entrySet()) {
            F7.c cVar4 = (F7.c) entry5.getKey();
            p237x7.l lVar2 = (p237x7.l) entry5.getValue();
            p247y7.AbstractC7350t.d(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p247y7.AbstractC7350t.d(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            dVar.a(cVar4, (p237x7.l) p247y7.W.f(lVar2, 1));
        }
    }

    @Override // A9.b
    public p199t9.b b(F7.c cVar, java.util.List list) {
        p247y7.AbstractC7350t.f(cVar, "kClass");
        p247y7.AbstractC7350t.f(list, "typeArgumentsSerializers");
        androidx.appcompat.app.D.a(this.f278a.get(cVar));
        return null;
    }
}
