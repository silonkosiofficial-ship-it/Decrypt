package p076h5;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Q5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p126m5.n f46495a;

    public e(p126m5.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "userMetadata");
        this.f46495a = nVar;
    }

    @Override // Q5.f
    public void a(Q5.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "rolloutsState");
        p126m5.n nVar = this.f46495a;
        java.util.Set setB = eVar.b();
        p247y7.AbstractC7350t.e(setB, "rolloutsState.rolloutAssignments");
        java.util.Set<Q5.d> set = setB;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(set, 10));
        for (Q5.d dVar : set) {
            arrayList.add(p126m5.i.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        nVar.p(arrayList);
        p076h5.g.f().b("Updated Crashlytics Rollout State");
    }
}
