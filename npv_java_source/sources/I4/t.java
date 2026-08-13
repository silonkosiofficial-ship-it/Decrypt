package I4;

/* JADX INFO: loaded from: classes3.dex */
final class t implements I4.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f5050a;

    /* synthetic */ t(I4.s sVar) {
    }

    @Override // I4.w
    public final I4.v a() {
        K4.l.a(this.f5050a, android.content.Context.class);
        return new I4.v(this.f5050a, null);
    }

    public final I4.t b(android.content.Context context) {
        context.getClass();
        this.f5050a = context;
        return this;
    }
}
