.class final Landroidx/compose/ui/platform/O1$b$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O1$b;->i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Ly7/O;

.field final synthetic J:LV/U0;

.field final synthetic K:Landroidx/lifecycle/r;

.field final synthetic L:Landroidx/compose/ui/platform/O1$b;

.field final synthetic M:Landroid/view/View;


# direct methods
.method constructor <init>(Ly7/O;LV/U0;Landroidx/lifecycle/r;Landroidx/compose/ui/platform/O1$b;Landroid/view/View;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O1$b$b;->I:Ly7/O;

    iput-object p2, p0, Landroidx/compose/ui/platform/O1$b$b;->J:LV/U0;

    iput-object p3, p0, Landroidx/compose/ui/platform/O1$b$b;->K:Landroidx/lifecycle/r;

    iput-object p4, p0, Landroidx/compose/ui/platform/O1$b$b;->L:Landroidx/compose/ui/platform/O1$b;

    iput-object p5, p0, Landroidx/compose/ui/platform/O1$b$b;->M:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/O1$b$b;->G:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/O1$b$b;->H:Ljava/lang/Object;

    check-cast v0, LW8/z0;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b$b;->H:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LW8/N;

    :try_start_1
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b$b;->I:Ly7/O;

    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/platform/L0;

    if-eqz p1, :cond_2

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$b$b;->M:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/O1;->a(Landroid/content/Context;)LZ8/N;

    move-result-object v1

    invoke-interface {v1}, LZ8/N;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {p1, v5}, Landroidx/compose/ui/platform/L0;->a(F)V

    new-instance v7, Landroidx/compose/ui/platform/O1$b$b$a;

    invoke-direct {v7, v1, p1, v3}, Landroidx/compose/ui/platform/O1$b$b$a;-><init>(LZ8/N;Landroidx/compose/ui/platform/L0;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v0, v3

    goto :goto_2

    :cond_2
    move-object p1, v3

    :goto_0
    :try_start_2
    iget-object v1, p0, Landroidx/compose/ui/platform/O1$b$b;->J:LV/U0;

    iput-object p1, p0, Landroidx/compose/ui/platform/O1$b$b;->H:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/O1$b$b;->G:I

    invoke-virtual {v1, p0}, LV/U0;->z0(Lm7/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_4

    invoke-static {v0, v3, v2, v3}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_4
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b$b;->K:Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/O1$b$b;->L:Landroidx/compose/ui/platform/O1$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_2
    move-exception v0

    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    :goto_2
    if-eqz v0, :cond_5

    invoke-static {v0, v3, v2, v3}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Landroidx/compose/ui/platform/O1$b$b;->K:Landroidx/lifecycle/r;

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$b$b;->L:Landroidx/compose/ui/platform/O1$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/O1$b$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/O1$b$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/O1$b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/O1$b$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/platform/O1$b$b;

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$b$b;->I:Ly7/O;

    iget-object v2, p0, Landroidx/compose/ui/platform/O1$b$b;->J:LV/U0;

    iget-object v3, p0, Landroidx/compose/ui/platform/O1$b$b;->K:Landroidx/lifecycle/r;

    iget-object v4, p0, Landroidx/compose/ui/platform/O1$b$b;->L:Landroidx/compose/ui/platform/O1$b;

    iget-object v5, p0, Landroidx/compose/ui/platform/O1$b$b;->M:Landroid/view/View;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/O1$b$b;-><init>(Ly7/O;LV/U0;Landroidx/lifecycle/r;Landroidx/compose/ui/platform/O1$b;Landroid/view/View;Lm7/e;)V

    iput-object p1, v7, Landroidx/compose/ui/platform/O1$b$b;->H:Ljava/lang/Object;

    return-object v7
.end method
