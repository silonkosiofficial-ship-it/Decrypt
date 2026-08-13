package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p119l9.e f50179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50180b;

    public i(p119l9.e eVar, int i6) {
        p247y7.AbstractC7350t.f(eVar, "formatter");
        this.f50179a = eVar;
        this.f50180b = i6;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "builder");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.f50179a.a(obj, sb, z6);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "let(...)");
        int length = this.f50180b - string.length();
        for (int i6 = 0; i6 < length; i6++) {
            appendable.append(' ');
        }
        appendable.append(string);
    }
}
