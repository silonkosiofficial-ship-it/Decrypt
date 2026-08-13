package p249y9;

/* JADX INFO: renamed from: y9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7358b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p249y9.AbstractC7358b.a f57393d = new p249y9.AbstractC7358b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p249y9.C7363g f57394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A9.b f57395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p258z9.C7412z f57396c;

    /* JADX INFO: renamed from: y9.b$a */
    public static final class a extends p249y9.AbstractC7358b {
        private a() {
            super(new p249y9.C7363g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), A9.c.a(), null);
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private AbstractC7358b(p249y9.C7363g c7363g, A9.b bVar) {
        this.f57394a = c7363g;
        this.f57395b = bVar;
        this.f57396c = new p258z9.C7412z();
    }

    public /* synthetic */ AbstractC7358b(p249y9.C7363g c7363g, A9.b bVar, p247y7.AbstractC7342k abstractC7342k) {
        this(c7363g, bVar);
    }

    public final java.lang.Object a(p199t9.a aVar, p249y9.i iVar) {
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        p247y7.AbstractC7350t.f(iVar, "element");
        return p258z9.f0.a(this, iVar, aVar);
    }

    public final java.lang.Object b(p199t9.a aVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        p247y7.AbstractC7350t.f(str, "string");
        p258z9.b0 b0VarA = p258z9.c0.a(this, str);
        java.lang.Object objX = new p258z9.Y(this, p258z9.i0.OBJ, b0VarA, aVar.a(), null).x(aVar);
        b0VarA.w();
        return objX;
    }

    public final p249y9.i c(p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(eVar, "serializer");
        return p258z9.h0.d(this, obj, eVar);
    }

    public final java.lang.String d(p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(eVar, "serializer");
        p258z9.O o6 = new p258z9.O();
        try {
            p258z9.N.a(this, o6, eVar, obj);
            return o6.toString();
        } finally {
            o6.h();
        }
    }

    public final p249y9.C7363g e() {
        return this.f57394a;
    }

    public A9.b f() {
        return this.f57395b;
    }

    public final p258z9.C7412z g() {
        return this.f57396c;
    }

    public final p249y9.i h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "string");
        return (p249y9.i) b(p249y9.q.f57437a, str);
    }
}
