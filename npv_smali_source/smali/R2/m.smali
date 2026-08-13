.class public LR2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final F:Ljava/lang/String;


# instance fields
.field private final C:LJ2/j;

.field private final D:Ljava/lang/String;

.field private final E:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "StopWorkRunnable"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR2/m;->F:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LJ2/j;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR2/m;->C:LJ2/j;

    iput-object p2, p0, LR2/m;->D:Ljava/lang/String;

    iput-boolean p3, p0, LR2/m;->E:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, LR2/m;->C:LJ2/j;

    invoke-virtual {v1}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    iget-object v2, p0, LR2/m;->C:LJ2/j;

    invoke-virtual {v2}, LJ2/j;->m()LJ2/d;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v3

    invoke-virtual {v1}, Lo2/n;->g()V

    :try_start_0
    iget-object v4, p0, LR2/m;->D:Ljava/lang/String;

    invoke-virtual {v2, v4}, LJ2/d;->h(Ljava/lang/String;)Z

    move-result v2

    iget-boolean v4, p0, LR2/m;->E:Z

    if-eqz v4, :cond_0

    iget-object v2, p0, LR2/m;->C:LJ2/j;

    invoke-virtual {v2}, LJ2/j;->m()LJ2/d;

    move-result-object v2

    iget-object v3, p0, LR2/m;->D:Ljava/lang/String;

    invoke-virtual {v2, v3}, LJ2/d;->n(Ljava/lang/String;)Z

    move-result v2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    iget-object v2, p0, LR2/m;->D:Ljava/lang/String;

    invoke-interface {v3, v2}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v2

    sget-object v4, LI2/s;->D:LI2/s;

    if-ne v2, v4, :cond_1

    sget-object v2, LI2/s;->C:LI2/s;

    iget-object v4, p0, LR2/m;->D:Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v2, v4}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    :cond_1
    iget-object v2, p0, LR2/m;->C:LJ2/j;

    invoke-virtual {v2}, LJ2/j;->m()LJ2/d;

    move-result-object v2

    iget-object v3, p0, LR2/m;->D:Ljava/lang/String;

    invoke-virtual {v2, v3}, LJ2/d;->o(Ljava/lang/String;)Z

    move-result v2

    :goto_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LR2/m;->F:Ljava/lang/String;

    const-string v5, "StopWorkRunnable for %s; Processor.stopWork = %s"

    iget-object v6, p0, LR2/m;->D:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v0

    const/4 v6, 0x1

    aput-object v2, v7, v6

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v2, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lo2/n;->n()V

    return-void

    :goto_1
    invoke-virtual {v1}, Lo2/n;->n()V

    throw v0
.end method
