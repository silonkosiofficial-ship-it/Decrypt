package p001a0;

/* JADX INFO: loaded from: classes.dex */
final class c extends p001a0.b implements java.util.Map.Entry, p256z7.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p001a0.i f16993E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object f16994F;

    public c(p001a0.i iVar, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2);
        this.f16993E = iVar;
        this.f16994F = obj2;
    }

    public void a(java.lang.Object obj) {
        this.f16994F = obj;
    }

    @Override // p001a0.b, java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f16994F;
    }

    @Override // p001a0.b, java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object value = getValue();
        a(obj);
        this.f16993E.c(getKey(), obj);
        return value;
    }
}
