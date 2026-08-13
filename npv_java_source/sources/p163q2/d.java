package p163q2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p147o7.l implements p237x7.p {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.lang.Object f53055G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f53056H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final /* synthetic */ p247y7.O f53057I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final /* synthetic */ p163q2.h f53058J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p247y7.O o6, p163q2.h hVar, p127m7.e eVar) {
        super(2, eVar);
        this.f53057I = o6;
        this.f53058J = hVar;
    }

    @Override // p147o7.a
    public final java.lang.Object B(java.lang.Object obj) {
        p247y7.O o6;
        java.lang.Object objG = p137n7.b.g();
        int i6 = this.f53056H;
        if (i6 == 0) {
            p087i7.x.b(obj);
            p247y7.O o10 = this.f53057I;
            p163q2.h hVar = this.f53058J;
            this.f53055G = o10;
            this.f53056H = 1;
            java.lang.Object objA = hVar.a(this);
            if (objA == objG) {
                return objG;
            }
            o6 = o10;
            obj = objA;
        } else {
            if (i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o6 = (p247y7.O) this.f53055G;
            p087i7.x.b(obj);
        }
        o6.f57254C = obj;
        return p087i7.M.f46721a;
    }

    @Override // p237x7.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
        return ((p163q2.d) x(n6, eVar)).B(p087i7.M.f46721a);
    }

    @Override // p147o7.a
    public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
        return new p163q2.d(this.f53057I, this.f53058J, eVar);
    }
}
