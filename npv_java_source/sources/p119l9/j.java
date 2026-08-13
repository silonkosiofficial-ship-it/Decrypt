package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f50181a;

    public j(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "string");
        this.f50181a = lVar;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "builder");
        appendable.append((java.lang.CharSequence) this.f50181a.l(obj));
    }
}
