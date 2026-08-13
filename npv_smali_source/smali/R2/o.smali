.class public LR2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field static final I:Ljava/lang/String;


# instance fields
.field final C:Landroidx/work/impl/utils/futures/c;

.field final D:Landroid/content/Context;

.field final E:LQ2/p;

.field final F:Landroidx/work/ListenableWorker;

.field final G:LI2/f;

.field final H:LS2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR2/o;->I:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LQ2/p;Landroidx/work/ListenableWorker;LI2/f;LS2/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, LR2/o;->C:Landroidx/work/impl/utils/futures/c;

    iput-object p1, p0, LR2/o;->D:Landroid/content/Context;

    iput-object p2, p0, LR2/o;->E:LQ2/p;

    iput-object p3, p0, LR2/o;->F:Landroidx/work/ListenableWorker;

    iput-object p4, p0, LR2/o;->G:LI2/f;

    iput-object p5, p0, LR2/o;->H:LS2/a;

    return-void
.end method


# virtual methods
.method public a()LP4/d;
    .locals 1

    iget-object v0, p0, LR2/o;->C:Landroidx/work/impl/utils/futures/c;

    return-object v0
.end method

.method public run()V
    .locals 3

    .prologue
    iget-object v0, p0, LR2/o;->E:LQ2/p;

    iget-boolean v0, v0, LQ2/p;->q:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/core/os/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iget-object v1, p0, LR2/o;->H:LS2/a;

    invoke-interface {v1}, LS2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, LR2/o$a;

    invoke-direct {v2, p0, v0}, LR2/o$a;-><init>(LR2/o;Landroidx/work/impl/utils/futures/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, LR2/o$b;

    invoke-direct {v1, p0, v0}, LR2/o$b;-><init>(LR2/o;Landroidx/work/impl/utils/futures/c;)V

    iget-object v2, p0, LR2/o;->H:LS2/a;

    invoke-interface {v2}, LS2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/work/impl/utils/futures/a;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, LR2/o;->C:Landroidx/work/impl/utils/futures/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Object;)Z

    return-void
.end method
