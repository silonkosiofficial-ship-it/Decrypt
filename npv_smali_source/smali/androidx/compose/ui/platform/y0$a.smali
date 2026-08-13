.class final Landroidx/compose/ui/platform/y0$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/y0;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field final synthetic J:LY8/j;


# direct methods
.method constructor <init>(LY8/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/y0$a;->J:LY8/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/y0$a;->I:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/platform/y0$a;->H:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v3, p0, Landroidx/compose/ui/platform/y0$a;->G:Ljava/lang/Object;

    check-cast v3, LY8/B;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Landroidx/compose/ui/platform/y0$a;->J:LY8/j;

    :try_start_1
    invoke-interface {v3}, LY8/B;->iterator()LY8/l;

    move-result-object p1

    move-object v1, p1

    :goto_0
    iput-object v3, p0, Landroidx/compose/ui/platform/y0$a;->G:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/y0$a;->H:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/y0$a;->I:I

    invoke-interface {v1, p0}, LY8/l;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v1}, LY8/l;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li7/M;

    invoke-static {}, Landroidx/compose/ui/platform/y0;->a()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p1, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {p1}, Lf0/k$a;->n()V

    goto :goto_0

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x0

    invoke-static {v3, p1}, LY8/q;->a(LY8/B;Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v3, p1}, LY8/q;->a(LY8/B;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/y0$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/y0$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/y0$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/y0$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, Landroidx/compose/ui/platform/y0$a;

    iget-object v0, p0, Landroidx/compose/ui/platform/y0$a;->J:LY8/j;

    invoke-direct {p1, v0, p2}, Landroidx/compose/ui/platform/y0$a;-><init>(LY8/j;Lm7/e;)V

    return-object p1
.end method
