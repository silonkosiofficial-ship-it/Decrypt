package p106k5;

/* JADX INFO: renamed from: k5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6912x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f49706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p166q5.g f49707b;

    public C6912x(java.lang.String str, p166q5.g gVar) {
        this.f49706a = str;
        this.f49707b = gVar;
    }

    private java.io.File b() {
        return this.f49707b.g(this.f49706a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (java.io.IOException e6) {
            p076h5.g.f().e("Error creating marker: " + this.f49706a, e6);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
