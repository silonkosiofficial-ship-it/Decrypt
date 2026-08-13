.class final Landroidx/compose/ui/platform/P1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/r;
.implements Landroidx/lifecycle/o;


# instance fields
.field private final C:Landroidx/compose/ui/platform/r;

.field private final D:LV/r;

.field private E:Z

.field private F:Landroidx/lifecycle/k;

.field private G:Lx7/p;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/r;LV/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/P1;->C:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Landroidx/compose/ui/platform/P1;->D:LV/r;

    sget-object p1, Landroidx/compose/ui/platform/n0;->a:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/n0;->a()Lx7/p;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/P1;->G:Lx7/p;

    return-void
.end method

.method public static final synthetic A(Landroidx/compose/ui/platform/P1;)Landroidx/lifecycle/k;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/P1;->F:Landroidx/lifecycle/k;

    return-object p0
.end method

.method public static final synthetic B(Landroidx/compose/ui/platform/P1;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/platform/P1;->E:Z

    return p0
.end method

.method public static final synthetic C(Landroidx/compose/ui/platform/P1;Landroidx/lifecycle/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/P1;->F:Landroidx/lifecycle/k;

    return-void
.end method

.method public static final synthetic E(Landroidx/compose/ui/platform/P1;Lx7/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/P1;->G:Lx7/p;

    return-void
.end method


# virtual methods
.method public final F()LV/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/P1;->D:LV/r;

    return-object v0
.end method

.method public final G()Landroidx/compose/ui/platform/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/P1;->C:Landroidx/compose/ui/platform/r;

    return-object v0
.end method

.method public e()V
    .locals 3

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/P1;->E:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/P1;->E:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/P1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lh0/l;->L:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/P1;->F:Landroidx/lifecycle/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/P1;->D:LV/r;

    invoke-interface {v0}, LV/r;->e()V

    return-void
.end method

.method public h(Lx7/p;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/P1;->C:Landroidx/compose/ui/platform/r;

    new-instance v1, Landroidx/compose/ui/platform/P1$a;

    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/platform/P1$a;-><init>(Landroidx/compose/ui/platform/P1;Lx7/p;)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/r;->setOnViewTreeOwnersAvailable(Lx7/l;)V

    return-void
.end method

.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    .prologue
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/P1;->e()V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_1

    iget-boolean p1, p0, Landroidx/compose/ui/platform/P1;->E:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/platform/P1;->G:Lx7/p;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/P1;->h(Lx7/p;)V

    :cond_1
    :goto_0
    return-void
.end method
