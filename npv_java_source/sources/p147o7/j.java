package p147o7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends p147o7.a {
    public j(p127m7.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != p127m7.j.f51198C) {
            throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return p127m7.j.f51198C;
    }
}
