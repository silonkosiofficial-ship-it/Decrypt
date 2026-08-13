package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p249y9.q f57437a = new p249y9.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57438b = p219v9.l.c("kotlinx.serialization.json.JsonElement", v9.c.a.f56026a, new p219v9.f[0], new p237x7.l() { // from class: y9.k
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return p249y9.q.l((p219v9.a) obj);
        }
    });

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M l(p219v9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "$this$buildSerialDescriptor");
        p219v9.a.b(aVar, "JsonPrimitive", p249y9.r.f(new p237x7.a() { // from class: y9.l
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p249y9.q.m();
            }
        }), null, false, 12, null);
        p219v9.a.b(aVar, "JsonNull", p249y9.r.f(new p237x7.a() { // from class: y9.m
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p249y9.q.n();
            }
        }), null, false, 12, null);
        p219v9.a.b(aVar, "JsonLiteral", p249y9.r.f(new p237x7.a() { // from class: y9.n
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p249y9.q.o();
            }
        }), null, false, 12, null);
        p219v9.a.b(aVar, "JsonObject", p249y9.r.f(new p237x7.a() { // from class: y9.o
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p249y9.q.p();
            }
        }), null, false, 12, null);
        p219v9.a.b(aVar, "JsonArray", p249y9.r.f(new p237x7.a() { // from class: y9.p
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p249y9.q.q();
            }
        }), null, false, 12, null);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f m() {
        return p249y9.G.f57386a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f n() {
        return p249y9.B.f57378a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f o() {
        return p249y9.x.f57443a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f p() {
        return p249y9.E.f57381a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f q() {
        return p249y9.C7360d.f57398a.a();
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57438b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p249y9.i b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return p249y9.r.d(hVar).l();
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p249y9.i iVar) {
        p199t9.e eVar;
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(iVar, "value");
        p249y9.r.h(jVar);
        if (iVar instanceof p249y9.F) {
            eVar = p249y9.G.f57386a;
        } else if (iVar instanceof p249y9.D) {
            eVar = p249y9.E.f57381a;
        } else {
            if (!(iVar instanceof p249y9.C7359c)) {
                throw new p087i7.s();
            }
            eVar = p249y9.C7360d.f57398a;
        }
        jVar.t(eVar, iVar);
    }
}
