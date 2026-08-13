package Q2;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f8780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8781b;

    public g(java.lang.String str, int i6) {
        this.f8780a = str;
        this.f8781b = i6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q2.g)) {
            return false;
        }
        Q2.g gVar = (Q2.g) obj;
        if (this.f8781b != gVar.f8781b) {
            return false;
        }
        return this.f8780a.equals(gVar.f8780a);
    }

    public int hashCode() {
        return (this.f8780a.hashCode() * 31) + this.f8781b;
    }
}
