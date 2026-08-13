.class LJ2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ2/k;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LP4/d;

.field final synthetic D:Landroidx/work/impl/utils/futures/c;

.field final synthetic E:LJ2/k;


# direct methods
.method constructor <init>(LJ2/k;LP4/d;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    iput-object p1, p0, LJ2/k$a;->E:LJ2/k;

    iput-object p2, p0, LJ2/k$a;->C:LP4/d;

    iput-object p3, p0, LJ2/k$a;->D:Landroidx/work/impl/utils/futures/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LJ2/k$a;->C:LP4/d;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    sget-object v2, LJ2/k;->V:Ljava/lang/String;

    const-string v3, "Starting work for %s"

    iget-object v4, p0, LJ2/k$a;->E:LJ2/k;

    iget-object v4, v4, LJ2/k;->G:LQ2/p;

    iget-object v4, v4, LQ2/p;->c:Ljava/lang/String;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v0

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v3, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LJ2/k$a;->E:LJ2/k;

    iget-object v1, v0, LJ2/k;->H:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->startWork()LP4/d;

    move-result-object v1

    iput-object v1, v0, LJ2/k;->T:LP4/d;

    iget-object v0, p0, LJ2/k$a;->D:Landroidx/work/impl/utils/futures/c;

    iget-object v1, p0, LJ2/k$a;->E:LJ2/k;

    iget-object v1, v1, LJ2/k;->T:LP4/d;

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->s(LP4/d;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LJ2/k$a;->D:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->r(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
