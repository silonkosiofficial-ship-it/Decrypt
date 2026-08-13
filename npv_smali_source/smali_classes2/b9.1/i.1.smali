.class public abstract Lb9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lb9/D;

.field public static final b:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb9/i;->a:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb9/i;->b:Lb9/D;

    return-void
.end method

.method public static final synthetic a()Lb9/D;
    .locals 1

    sget-object v0, Lb9/i;->a:Lb9/D;

    return-object v0
.end method

.method public static final b(Lm7/e;Ljava/lang/Object;)V
    .locals 6

    .prologue
    instance-of v0, p0, Lb9/h;

    if-eqz v0, :cond_8

    check-cast p0, Lb9/h;

    invoke-static {p1}, LW8/C;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lb9/h;->F:LW8/J;

    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v2

    invoke-virtual {v1, v2}, LW8/J;->v1(Lm7/i;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iput-object v0, p0, Lb9/h;->H:Ljava/lang/Object;

    iput v2, p0, LW8/a0;->E:I

    iget-object p1, p0, Lb9/h;->F:LW8/J;

    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v1, LW8/X0;->a:LW8/X0;

    invoke-virtual {v1}, LW8/X0;->b()LW8/j0;

    move-result-object v1

    invoke-virtual {v1}, LW8/j0;->G1()Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v0, p0, Lb9/h;->H:Ljava/lang/Object;

    iput v2, p0, LW8/a0;->E:I

    invoke-virtual {v1, p0}, LW8/j0;->C1(LW8/a0;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v1, v2}, LW8/j0;->E1(Z)V

    :try_start_0
    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v3

    sget-object v4, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v3, v4}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v3

    check-cast v3, LW8/z0;

    if-eqz v3, :cond_2

    invoke-interface {v3}, LW8/z0;->f()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LW8/a0;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lb9/h;->G:Lm7/e;

    iget-object v3, p0, Lb9/h;->I:Ljava/lang/Object;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v4

    invoke-static {v4, v3}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lb9/K;->a:Lb9/D;

    if-eq v3, v5, :cond_3

    invoke-static {v0, v4, v3}, LW8/H;->m(Lm7/e;Lm7/i;Ljava/lang/Object;)LW8/c1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    :try_start_1
    iget-object v5, p0, Lb9/h;->G:Lm7/e;

    invoke-interface {v5, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_4

    :try_start_2
    invoke-virtual {v0}, LW8/c1;->k1()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v4, v3}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-virtual {v1}, LW8/j0;->J1()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_5

    :goto_2
    invoke-virtual {v1, v2}, LW8/j0;->z1(Z)V

    goto :goto_4

    :catchall_1
    move-exception p1

    if-eqz v0, :cond_6

    :try_start_3
    invoke-virtual {v0}, LW8/c1;->k1()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    invoke-static {v4, v3}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_7
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    :try_start_4
    invoke-virtual {p0, p1}, LW8/a0;->h(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    invoke-virtual {v1, v2}, LW8/j0;->z1(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static final c(Lb9/h;)Z
    .locals 5

    .prologue
    sget-object v0, Li7/M;->a:Li7/M;

    sget-object v1, LW8/X0;->a:LW8/X0;

    invoke-virtual {v1}, LW8/X0;->b()LW8/j0;

    move-result-object v1

    invoke-virtual {v1}, LW8/j0;->H1()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LW8/j0;->G1()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iput-object v0, p0, Lb9/h;->H:Ljava/lang/Object;

    iput v4, p0, LW8/a0;->E:I

    invoke-virtual {v1, p0}, LW8/j0;->C1(LW8/a0;)V

    move v3, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, LW8/j0;->E1(Z)V

    :try_start_0
    invoke-virtual {p0}, LW8/a0;->run()V

    :cond_2
    invoke-virtual {v1}, LW8/j0;->J1()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    :goto_0
    invoke-virtual {v1, v4}, LW8/j0;->z1(Z)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {p0, v0}, LW8/a0;->h(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return v3

    :catchall_1
    move-exception p0

    invoke-virtual {v1, v4}, LW8/j0;->z1(Z)V

    throw p0
.end method
