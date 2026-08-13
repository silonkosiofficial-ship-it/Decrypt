.class public Ll5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field private final C:Ljava/util/concurrent/ExecutorService;

.field private final D:Ljava/lang/Object;

.field private E:Ll4/l;


# direct methods
.method constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll5/e;->D:Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {v0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object v0

    iput-object v0, p0, Ll5/e;->E:Ll4/l;

    iput-object p1, p0, Ll5/e;->C:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Runnable;Ll4/l;)Ll4/l;
    .locals 0

    invoke-static {p0, p1}, Ll5/e;->e(Ljava/lang/Runnable;Ll4/l;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/concurrent/Callable;Ll4/l;)Ll4/l;
    .locals 0

    invoke-static {p0, p1}, Ll5/e;->f(Ljava/util/concurrent/Callable;Ll4/l;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(Ljava/lang/Runnable;Ll4/l;)Ll4/l;
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    const/4 p0, 0x0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Ljava/util/concurrent/Callable;Ll4/l;)Ll4/l;
    .locals 0

    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll4/l;

    return-object p0
.end method


# virtual methods
.method public d()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Ll5/e;->C:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ll5/e;->C:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Ljava/lang/Runnable;)Ll4/l;
    .locals 4

    .prologue
    iget-object v0, p0, Ll5/e;->D:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll5/e;->E:Ll4/l;

    iget-object v2, p0, Ll5/e;->C:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll5/d;

    invoke-direct {v3, p1}, Ll5/d;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2, v3}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object p1

    iput-object p1, p0, Ll5/e;->E:Ll4/l;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Ljava/util/concurrent/Callable;)Ll4/l;
    .locals 4

    .prologue
    iget-object v0, p0, Ll5/e;->D:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll5/e;->E:Ll4/l;

    iget-object v2, p0, Ll5/e;->C:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll5/c;

    invoke-direct {v3, p1}, Ll5/c;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {v1, v2, v3}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object p1

    iput-object p1, p0, Ll5/e;->E:Ll4/l;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
