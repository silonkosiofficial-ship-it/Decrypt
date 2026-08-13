package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p119l9.e f50173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f50174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50175c;

    public g(p119l9.e eVar, p237x7.l lVar, boolean z6) {
        p247y7.AbstractC7350t.f(eVar, "formatter");
        p247y7.AbstractC7350t.f(lVar, "allSubFormatsNegative");
        this.f50173a = eVar;
        this.f50174b = lVar;
        this.f50175c = z6;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        java.lang.Character ch;
        p247y7.AbstractC7350t.f(appendable, "builder");
        if (z6 || !((java.lang.Boolean) this.f50174b.l(obj)).booleanValue()) {
            ch = this.f50175c ? '+' : null;
        } else {
            ch = '-';
        }
        if (ch != null) {
            appendable.append(ch.charValue());
        }
        this.f50173a.a(obj, appendable, z6 || (ch != null && ch.charValue() == '-'));
    }
}
