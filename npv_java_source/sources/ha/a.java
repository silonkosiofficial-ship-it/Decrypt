package ha;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements fa.d, java.io.Serializable {
    private void i(ga.b bVar, fa.g gVar, java.lang.String str, java.lang.Throwable th) {
        h(bVar, gVar, str, null, th);
    }

    @Override // fa.d
    public /* synthetic */ boolean d(ga.b bVar) {
        return fa.c.a(this, bVar);
    }

    @Override // fa.d
    public void g(java.lang.String str) {
        if (f()) {
            i(ga.b.TRACE, null, str, null);
        }
    }

    protected abstract void h(ga.b bVar, fa.g gVar, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th);
}
