package p171r0;

/* JADX INFO: loaded from: classes.dex */
final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p171r0.S f53505a = new p171r0.S();

    private S() {
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
