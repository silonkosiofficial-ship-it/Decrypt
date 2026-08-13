.class final Ll4/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/K;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Ll4/h;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll4/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll4/H;->b:Ljava/lang/Object;

    iput-object p1, p0, Ll4/H;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll4/H;->c:Ll4/h;

    return-void
.end method

.method static bridge synthetic a(Ll4/H;)Ll4/h;
    .locals 0

    iget-object p0, p0, Ll4/H;->c:Ll4/h;

    return-object p0
.end method

.method static bridge synthetic b(Ll4/H;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ll4/H;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final c(Ll4/l;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, Ll4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll4/H;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll4/H;->c:Ll4/h;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ll4/H;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ll4/G;

    invoke-direct {v1, p0, p1}, Ll4/G;-><init>(Ll4/H;Ll4/l;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method
