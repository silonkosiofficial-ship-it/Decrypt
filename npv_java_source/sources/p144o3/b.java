package p144o3;

/* JADX INFO: loaded from: classes.dex */
final class b extends java.lang.Thread {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.Map f52545C;

    b(p144o3.a aVar, java.util.Map map) {
        this.f52545C = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f52545C;
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (java.lang.String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (java.lang.String) map.get(str));
        }
        p144o3.d.a(builderBuildUpon.build().toString());
    }
}
