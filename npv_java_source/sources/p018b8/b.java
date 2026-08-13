package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a implements p018b8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b8.b.a f24189a = new b8.b.a();

        private a() {
        }

        @Override // p018b8.b
        public java.util.Set a() {
            return p097j7.Z.d();
        }

        @Override // p018b8.b
        public p048e8.w b(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            return null;
        }

        @Override // p018b8.b
        public p048e8.n c(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            return null;
        }

        @Override // p018b8.b
        public java.util.Set e() {
            return p097j7.Z.d();
        }

        @Override // p018b8.b
        public java.util.Set f() {
            return p097j7.Z.d();
        }

        @Override // p018b8.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public java.util.List d(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            return p097j7.AbstractC6879v.m();
        }
    }

    java.util.Set a();

    p048e8.w b(p138n8.f fVar);

    p048e8.n c(p138n8.f fVar);

    java.util.Collection d(p138n8.f fVar);

    java.util.Set e();

    java.util.Set f();
}
