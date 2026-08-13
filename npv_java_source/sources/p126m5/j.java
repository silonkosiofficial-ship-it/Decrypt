package p126m5;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f51171a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51172b;

    public j(int i6) {
        this.f51172b = i6;
    }

    public java.util.List a() {
        java.util.List listB = b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < listB.size(); i6++) {
            arrayList.add(((p126m5.i) listB.get(i6)).h());
        }
        return arrayList;
    }

    public synchronized java.util.List b() {
        return j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(this.f51171a));
    }

    public synchronized boolean c(java.util.List list) {
        this.f51171a.clear();
        if (list.size() <= this.f51172b) {
            return this.f51171a.addAll(list);
        }
        p076h5.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f51172b);
        return this.f51171a.addAll(list.subList(0, this.f51172b));
    }
}
