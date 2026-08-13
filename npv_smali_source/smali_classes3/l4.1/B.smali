.class final Ll4/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/K;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Ll4/e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll4/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll4/B;->b:Ljava/lang/Object;

    iput-object p1, p0, Ll4/B;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll4/B;->c:Ll4/e;

    return-void
.end method

.method static bridge synthetic a(Ll4/B;)Ll4/e;
    .locals 0

    iget-object p0, p0, Ll4/B;->c:Ll4/e;

    return-object p0
.end method

.method static bridge synthetic b(Ll4/B;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ll4/B;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final c(Ll4/l;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Ll4/l;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll4/B;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Ll4/B;->c:Ll4/e;

    if-nez v0, :cond_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll4/B;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Ll4/A;

    invoke-direct {v0, p0}, Ll4/A;-><init>(Ll4/B;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method
