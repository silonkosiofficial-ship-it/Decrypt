.class final LV/U0$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/U0;-><init>(Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/U0;


# direct methods
.method constructor <init>(LV/U0;)V
    .locals 0

    iput-object p1, p0, LV/U0$f;->D:LV/U0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 7

    .prologue
    const-string v0, "Recomposer effect job completed"

    invoke-static {v0, p1}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    iget-object v1, p0, LV/U0$f;->D:LV/U0;

    invoke-static {v1}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LV/U0$f;->D:LV/U0;

    monitor-enter v1

    :try_start_0
    invoke-static {v2}, LV/U0;->D(LV/U0;)LW8/z0;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-static {v2}, LV/U0;->J(LV/U0;)LZ8/y;

    move-result-object v5

    sget-object v6, LV/U0$d;->D:LV/U0$d;

    invoke-interface {v5, v6}, LZ8/y;->setValue(Ljava/lang/Object;)V

    invoke-static {v2}, LV/U0;->K(LV/U0;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v3, v0}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    invoke-static {v2}, LV/U0;->H(LV/U0;)LW8/l;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v2}, LV/U0;->H(LV/U0;)LW8/l;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v4

    :goto_1
    invoke-static {v2, v4}, LV/U0;->U(LV/U0;LW8/l;)V

    new-instance v4, LV/U0$f$a;

    invoke-direct {v4, v2, p1}, LV/U0$f$a;-><init>(LV/U0;Ljava/lang/Throwable;)V

    invoke-interface {v3, v4}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    move-object v4, v0

    goto :goto_2

    :cond_2
    invoke-static {v2, v0}, LV/U0;->R(LV/U0;Ljava/lang/Throwable;)V

    invoke-static {v2}, LV/U0;->J(LV/U0;)LZ8/y;

    move-result-object p1

    sget-object v0, LV/U0$d;->C:LV/U0$d;

    invoke-interface {p1, v0}, LZ8/y;->setValue(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v1

    if-eqz v4, :cond_3

    sget-object p1, Li7/w;->D:Li7/w$a;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v4, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_3
    return-void

    :goto_3
    monitor-exit v1

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LV/U0$f;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
