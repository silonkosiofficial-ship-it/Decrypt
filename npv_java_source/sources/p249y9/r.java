package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    public static final class a implements p219v9.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f57439a;

        a(p237x7.a aVar) {
            this.f57439a = p087i7.AbstractC6669o.b(aVar);
        }

        private final p219v9.f b() {
            return (p219v9.f) this.f57439a.getValue();
        }

        @Override // p219v9.f
        public java.lang.String a() {
            return b().a();
        }

        @Override // p219v9.f
        public /* synthetic */ boolean c() {
            return p219v9.e.c(this);
        }

        @Override // p219v9.f
        public int d(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            return b().d(str);
        }

        @Override // p219v9.f
        public int e() {
            return b().e();
        }

        @Override // p219v9.f
        public java.lang.String f(int i6) {
            return b().f(i6);
        }

        @Override // p219v9.f
        public java.util.List g(int i6) {
            return b().g(i6);
        }

        @Override // p219v9.f
        public p219v9.f h(int i6) {
            return b().h(i6);
        }

        @Override // p219v9.f
        public boolean i(int i6) {
            return b().i(i6);
        }

        @Override // p219v9.f
        public p219v9.m j() {
            return b().j();
        }

        @Override // p219v9.f
        public /* synthetic */ java.util.List k() {
            return p219v9.e.a(this);
        }

        @Override // p219v9.f
        public /* synthetic */ boolean m() {
            return p219v9.e.b(this);
        }
    }

    public static final p249y9.InterfaceC7364h d(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p249y9.InterfaceC7364h interfaceC7364h = hVar instanceof p249y9.InterfaceC7364h ? (p249y9.InterfaceC7364h) hVar : null;
        if (interfaceC7364h != null) {
            return interfaceC7364h;
        }
        throw new java.lang.IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + p247y7.P.b(hVar.getClass()));
    }

    public static final p249y9.s e(p229w9.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        p249y9.s sVar = jVar instanceof p249y9.s ? (p249y9.s) jVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new java.lang.IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + p247y7.P.b(jVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f f(p237x7.a aVar) {
        return new y9.r.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p229w9.h hVar) {
        d(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p229w9.j jVar) {
        e(jVar);
    }
}
