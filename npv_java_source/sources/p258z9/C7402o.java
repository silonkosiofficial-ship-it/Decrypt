package p258z9;

/* JADX INFO: renamed from: z9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7402o extends p258z9.C7401n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7402o(p258z9.A a6, boolean z6) {
        super(a6);
        p247y7.AbstractC7350t.f(a6, "writer");
        this.f57777c = z6;
    }

    @Override // p258z9.C7401n
    public void n(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        if (this.f57777c) {
            super.n(str);
        } else {
            super.k(str);
        }
    }
}
