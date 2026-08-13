package N0;

/* JADX INFO: loaded from: classes.dex */
final class U implements N0.h0 {
    @Override // N0.h0
    public android.text.StaticLayout a(N0.i0 i0Var) {
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(i0Var.r(), i0Var.q(), i0Var.e(), i0Var.o(), i0Var.u());
        builderObtain.setTextDirection(i0Var.s());
        builderObtain.setAlignment(i0Var.a());
        builderObtain.setMaxLines(i0Var.n());
        builderObtain.setEllipsize(i0Var.c());
        builderObtain.setEllipsizedWidth(i0Var.d());
        builderObtain.setLineSpacing(i0Var.l(), i0Var.m());
        builderObtain.setIncludePad(i0Var.g());
        builderObtain.setBreakStrategy(i0Var.b());
        builderObtain.setHyphenationFrequency(i0Var.f());
        builderObtain.setIndents(i0Var.i(), i0Var.p());
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            N0.W.a(builderObtain, i0Var.h());
        }
        if (i6 >= 28) {
            N0.Y.a(builderObtain, i0Var.t());
        }
        if (i6 >= 33) {
            N0.f0.b(builderObtain, i0Var.j(), i0Var.k());
        }
        return builderObtain.build();
    }

    @Override // N0.h0
    public boolean b(android.text.StaticLayout staticLayout, boolean z6) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            return N0.f0.a(staticLayout);
        }
        if (i6 >= 28) {
            return z6;
        }
        return false;
    }
}
