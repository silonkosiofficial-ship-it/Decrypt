package N0;

/* JADX INFO: loaded from: classes.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.f0 f7553a = new N0.f0();

    private f0() {
    }

    public static final boolean a(android.text.StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(android.text.StaticLayout.Builder builder, int i6, int i10) {
        builder.setLineBreakConfig(N0.Z.a().setLineBreakStyle(i6).setLineBreakWordStyle(i10).build());
    }
}
