.class public final Lo2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field private final C:Ljava/util/concurrent/Executor;

.field private final D:Ljava/util/ArrayDeque;

.field private E:Ljava/lang/Runnable;

.field private final F:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    const-string v0, "executor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/z;->C:Ljava/util/concurrent/Executor;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lo2/z;->D:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/z;->F:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Runnable;Lo2/z;)V
    .locals 0

    invoke-static {p0, p1}, Lo2/z;->c(Ljava/lang/Runnable;Lo2/z;)V

    return-void
.end method

.method private static final c(Ljava/lang/Runnable;Lo2/z;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lo2/z;->d()V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Lo2/z;->d()V

    throw p0
.end method


# virtual methods
.method public final d()V
    .locals 3

    .prologue
    iget-object v0, p0, Lo2/z;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo2/z;->D:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Runnable;

    iput-object v2, p0, Lo2/z;->E:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lo2/z;->C:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    const-string v0, "command"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/z;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo2/z;->D:Ljava/util/ArrayDeque;

    new-instance v2, Lo2/y;

    invoke-direct {v2, p1, p0}, Lo2/y;-><init>(Ljava/lang/Runnable;Lo2/z;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo2/z;->E:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lo2/z;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
