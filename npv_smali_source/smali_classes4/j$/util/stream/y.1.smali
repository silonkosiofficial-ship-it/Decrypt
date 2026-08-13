.class final Lj$/util/stream/y;
.super Lj$/util/stream/j2;
.source "SourceFile"


# instance fields
.field b:Z

.field c:Lj$/util/stream/p;

.field final synthetic d:Lj$/util/stream/v;


# direct methods
.method constructor <init>(Lj$/util/stream/v;Lj$/util/stream/q2;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/y;->d:Lj$/util/stream/v;

    invoke-direct {p0, p2}, Lj$/util/stream/j2;-><init>(Lj$/util/stream/q2;)V

    iget-object p1, p0, Lj$/util/stream/j2;->a:Lj$/util/stream/q2;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lj$/util/stream/p;

    invoke-direct {p2, p1}, Lj$/util/stream/p;-><init>(Lj$/util/stream/q2;)V

    iput-object p2, p0, Lj$/util/stream/y;->c:Lj$/util/stream/p;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 2

    .prologue
    iget-object v0, p0, Lj$/util/stream/y;->d:Lj$/util/stream/v;

    iget-object v0, v0, Lj$/util/stream/v;->n:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/DoubleFunction;

    invoke-interface {v0, p1, p2}, Ljava/util/function/DoubleFunction;->apply(D)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/F;

    if-eqz p1, :cond_2

    :try_start_0
    iget-boolean p2, p0, Lj$/util/stream/y;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lj$/util/stream/y;->c:Lj$/util/stream/p;

    if-nez p2, :cond_0

    :try_start_1
    invoke-interface {p1}, Lj$/util/stream/F;->sequential()Lj$/util/stream/F;

    move-result-object p2

    invoke-interface {p2, v0}, Lj$/util/stream/F;->forEach(Ljava/util/function/DoubleConsumer;)V

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lj$/util/stream/F;->sequential()Lj$/util/stream/F;

    move-result-object p2

    invoke-interface {p2}, Lj$/util/stream/F;->spliterator()Lj$/util/U;

    move-result-object p2

    :cond_1
    iget-object v1, p0, Lj$/util/stream/j2;->a:Lj$/util/stream/q2;

    invoke-interface {v1}, Lj$/util/stream/q2;->m()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p2, v0}, Lj$/util/U;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    goto :goto_2

    :goto_0
    :try_start_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2

    :cond_2
    :goto_2
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    :cond_3
    return-void
.end method

.method public final k(J)V
    .locals 2

    iget-object p1, p0, Lj$/util/stream/j2;->a:Lj$/util/stream/q2;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Lj$/util/stream/q2;->k(J)V

    return-void
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj$/util/stream/y;->b:Z

    iget-object v0, p0, Lj$/util/stream/j2;->a:Lj$/util/stream/q2;

    invoke-interface {v0}, Lj$/util/stream/q2;->m()Z

    move-result v0

    return v0
.end method
