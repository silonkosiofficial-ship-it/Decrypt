package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends M8.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private M8.c f7082C;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        M8.i iVar = M8.i.f7095C;
        p247y7.AbstractC7350t.d(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }

    protected e(M8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "arrayMap");
        this.f7082C = cVar;
    }

    @Override // M8.a
    protected final M8.c d() {
        return this.f7082C;
    }

    @Override // M8.a
    protected final void g(java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "keyQualifiedName");
        p247y7.AbstractC7350t.f(obj, "value");
        int iE = e().e(str);
        int iD = this.f7082C.d();
        if (iD == 0) {
            this.f7082C = new M8.o(obj, iE);
            return;
        }
        if (iD == 1) {
            M8.c cVar = this.f7082C;
            p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            M8.o oVar = (M8.o) cVar;
            if (oVar.f() == iE) {
                this.f7082C = new M8.o(obj, iE);
                return;
            } else {
                M8.d dVar = new M8.d();
                this.f7082C = dVar;
                dVar.e(oVar.f(), oVar.g());
            }
        }
        this.f7082C.e(iE, obj);
    }
}
