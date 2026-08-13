package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements androidx.appcompat.view.menu.m {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected android.content.Context f17776C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected android.content.Context f17777D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected androidx.appcompat.view.menu.g f17778E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected android.view.LayoutInflater f17779F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected android.view.LayoutInflater f17780G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f17781H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f17782I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f17783J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected androidx.appcompat.view.menu.n f17784K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f17785L;

    public b(android.content.Context context, int i6, int i10) {
        this.f17776C = context;
        this.f17779F = android.view.LayoutInflater.from(context);
        this.f17782I = i6;
        this.f17783J = i10;
    }

    protected void a(android.view.View view, int i6) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((android.view.ViewGroup) this.f17784K).addView(view, i6);
    }

    public abstract void b(androidx.appcompat.view.menu.i iVar, androidx.appcompat.view.menu.n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        androidx.appcompat.view.menu.m.a aVar = this.f17781H;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f17784K;
        if (viewGroup == null) {
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f17778E;
        int i6 = 0;
        if (gVar != null) {
            gVar.r();
            java.util.ArrayList arrayListE = this.f17778E.E();
            int size = arrayListE.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayListE.get(i11);
                if (q(i10, iVar)) {
                    android.view.View childAt = viewGroup.getChildAt(i10);
                    androidx.appcompat.view.menu.i itemData = childAt instanceof androidx.appcompat.view.menu.n.a ? ((androidx.appcompat.view.menu.n.a) childAt).getItemData() : null;
                    android.view.View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i10);
                    }
                    i10++;
                }
            }
            i6 = i10;
        }
        while (i6 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i6)) {
                i6++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(androidx.appcompat.view.menu.m.a aVar) {
        this.f17781H = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(android.content.Context context, androidx.appcompat.view.menu.g gVar) {
        this.f17777D = context;
        this.f17780G = android.view.LayoutInflater.from(context);
        this.f17778E = gVar;
    }

    public androidx.appcompat.view.menu.n.a j(android.view.ViewGroup viewGroup) {
        return (androidx.appcompat.view.menu.n.a) this.f17779F.inflate(this.f17783J, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        androidx.appcompat.view.menu.m.a aVar = this.f17781H;
        androidx.appcompat.view.menu.g gVar = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            gVar = this.f17778E;
        }
        return aVar.d(gVar);
    }

    protected boolean l(android.view.ViewGroup viewGroup, int i6) {
        viewGroup.removeViewAt(i6);
        return true;
    }

    public androidx.appcompat.view.menu.m.a m() {
        return this.f17781H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.view.View n(androidx.appcompat.view.menu.i iVar, android.view.View view, android.view.ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n.a aVarJ = view instanceof androidx.appcompat.view.menu.n.a ? (androidx.appcompat.view.menu.n.a) view : j(viewGroup);
        b(iVar, aVarJ);
        return (android.view.View) aVarJ;
    }

    public androidx.appcompat.view.menu.n o(android.view.ViewGroup viewGroup) {
        if (this.f17784K == null) {
            androidx.appcompat.view.menu.n nVar = (androidx.appcompat.view.menu.n) this.f17779F.inflate(this.f17782I, viewGroup, false);
            this.f17784K = nVar;
            nVar.b(this.f17778E);
            d(true);
        }
        return this.f17784K;
    }

    public void p(int i6) {
        this.f17785L = i6;
    }

    public abstract boolean q(int i6, androidx.appcompat.view.menu.i iVar);
}
