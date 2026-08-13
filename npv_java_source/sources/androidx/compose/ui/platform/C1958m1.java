package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1958m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1958m1 f20148a = new androidx.compose.ui.platform.C1958m1();

    private C1958m1() {
    }

    public final int a(android.view.RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(android.view.RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(android.view.RenderNode renderNode, int i6) {
        renderNode.setAmbientShadowColor(i6);
    }

    public final void d(android.view.RenderNode renderNode, int i6) {
        renderNode.setSpotShadowColor(i6);
    }
}
