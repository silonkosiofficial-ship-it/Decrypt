package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G {

    public static final class a implements p239x9.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p199t9.b f56938a;

        a(p199t9.b bVar) {
            this.f56938a = bVar;
        }

        @Override // p199t9.b, p199t9.e, p199t9.a
        public p219v9.f a() {
            throw new java.lang.IllegalStateException("unsupported".toString());
        }

        @Override // p199t9.a
        public java.lang.Object b(p229w9.h hVar) {
            p247y7.AbstractC7350t.f(hVar, "decoder");
            throw new java.lang.IllegalStateException("unsupported".toString());
        }

        @Override // p239x9.E
        public /* synthetic */ p199t9.b[] c() {
            return p239x9.D.a(this);
        }

        @Override // p239x9.E
        public p199t9.b[] d() {
            return new p199t9.b[]{this.f56938a};
        }

        @Override // p199t9.e
        public void e(p229w9.j jVar, java.lang.Object obj) {
            p247y7.AbstractC7350t.f(jVar, "encoder");
            throw new java.lang.IllegalStateException("unsupported".toString());
        }
    }

    public static final p219v9.f a(java.lang.String str, p199t9.b bVar) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(bVar, "primitiveSerializer");
        return new p239x9.F(str, new x9.G.a(bVar));
    }
}
