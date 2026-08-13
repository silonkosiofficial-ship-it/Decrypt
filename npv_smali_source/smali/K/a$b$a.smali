.class final LK/a$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Landroidx/compose/ui/platform/T0;

.field final synthetic J:Lx7/l;

.field final synthetic K:LK/a;

.field final synthetic L:LK/q0$a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/T0;Lx7/l;LK/a;LK/q0$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK/a$b$a;->I:Landroidx/compose/ui/platform/T0;

    iput-object p2, p0, LK/a$b$a;->J:Lx7/l;

    iput-object p3, p0, LK/a$b$a;->K:LK/a;

    iput-object p4, p0, LK/a$b$a;->L:LK/q0$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LK/a$b$a;->G:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LK/a$b$a;->H:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LW8/N;

    invoke-static {}, LK/r0;->c()Lx7/l;

    move-result-object p1

    iget-object v1, p0, LK/a$b$a;->I:Landroidx/compose/ui/platform/T0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/T0;->a()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK/l0;

    new-instance v1, LK/s0;

    iget-object v5, p0, LK/a$b$a;->I:Landroidx/compose/ui/platform/T0;

    invoke-interface {v5}, Landroidx/compose/ui/platform/T0;->a()Landroid/view/View;

    move-result-object v5

    new-instance v6, LK/a$b$a$b;

    iget-object v7, p0, LK/a$b$a;->L:LK/q0$a;

    invoke-direct {v6, v7}, LK/a$b$a$b;-><init>(LK/q0$a;)V

    invoke-direct {v1, v5, v6, p1}, LK/s0;-><init>(Landroid/view/View;Lx7/l;LK/l0;)V

    invoke-static {}, LI/c;->a()Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v7, LK/a$b$a$a;

    iget-object v5, p0, LK/a$b$a;->K:LK/a;

    invoke-direct {v7, v5, p1, v2}, LK/a$b$a$a;-><init>(LK/a;LK/l0;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_2
    iget-object p1, p0, LK/a$b$a;->J:Lx7/l;

    if-eqz p1, :cond_3

    invoke-interface {p1, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, LK/a$b$a;->K:LK/a;

    invoke-static {p1, v1}, LK/a;->n(LK/a;LK/s0;)V

    :try_start_1
    iget-object p1, p0, LK/a$b$a;->I:Landroidx/compose/ui/platform/T0;

    iput v3, p0, LK/a$b$a;->G:I

    invoke-interface {p1, v1, p0}, Landroidx/compose/ui/platform/T0;->b(Landroidx/compose/ui/platform/Q0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object v0, p0, LK/a$b$a;->K:LK/a;

    invoke-static {v0, v2}, LK/a;->n(LK/a;LK/s0;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK/a$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK/a$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK/a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK/a$b$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, LK/a$b$a;

    iget-object v1, p0, LK/a$b$a;->I:Landroidx/compose/ui/platform/T0;

    iget-object v2, p0, LK/a$b$a;->J:Lx7/l;

    iget-object v3, p0, LK/a$b$a;->K:LK/a;

    iget-object v4, p0, LK/a$b$a;->L:LK/q0$a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LK/a$b$a;-><init>(Landroidx/compose/ui/platform/T0;Lx7/l;LK/a;LK/q0$a;Lm7/e;)V

    iput-object p1, v6, LK/a$b$a;->H:Ljava/lang/Object;

    return-object v6
.end method
