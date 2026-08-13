package p046e5;

/* JADX INFO: loaded from: classes3.dex */
public class s extends p046e5.t {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f44739C;

    public s(java.util.List list) {
        super("Dependency cycle detected: " + java.util.Arrays.toString(list.toArray()));
        this.f44739C = list;
    }
}
