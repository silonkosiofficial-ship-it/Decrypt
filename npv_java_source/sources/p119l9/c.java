package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f50165a;

    public c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "string");
        this.f50165a = str;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "builder");
        appendable.append(this.f50165a);
    }
}
