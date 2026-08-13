.class public final Lio/ktor/utils/io/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/d;
.implements Lio/ktor/utils/io/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/ktor/utils/io/a$a;
    }
.end annotation


# static fields
.field static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field static final synthetic h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field volatile synthetic _closedCause:Ljava/lang/Object;

.field private final b:Z

.field private final c:Lo9/a;

.field private final d:Ljava/lang/Object;

.field private final e:Lo9/a;

.field private final f:Lo9/a;

.field private volatile flushBufferSize:I

.field volatile synthetic suspensionSlot:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "suspensionSlot"

    const-class v1, Lio/ktor/utils/io/a;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closedCause"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/a;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/ktor/utils/io/a;->b:Z

    new-instance p1, Lo9/a;

    invoke-direct {p1}, Lo9/a;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/a;->c:Lo9/a;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/a;->d:Ljava/lang/Object;

    sget-object p1, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    iput-object p1, p0, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    new-instance p1, Lo9/a;

    invoke-direct {p1}, Lo9/a;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    new-instance p1, Lo9/a;

    invoke-direct {p1}, Lo9/a;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/a;->f:Lo9/a;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lio/ktor/utils/io/a;-><init>(Z)V

    return-void
.end method

.method public static final synthetic i(Lio/ktor/utils/io/a;)I
    .locals 0

    iget p0, p0, Lio/ktor/utils/io/a;->flushBufferSize:I

    return p0
.end method

.method public static final synthetic j(Lio/ktor/utils/io/a;)Lo9/a;
    .locals 0

    iget-object p0, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    return-object p0
.end method

.method private final l(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, Lio/ktor/utils/io/a$a$a;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/a$a$a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lio/ktor/utils/io/a$a;->a:Lio/ktor/utils/io/a$a$b;

    invoke-virtual {v0}, Lio/ktor/utils/io/a$a$b;->a()Lio/ktor/utils/io/a$a$a;

    move-result-object v0

    :goto_0
    sget-object v1, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/a$a;

    instance-of v1, v0, Lio/ktor/utils/io/a$a$e;

    if-nez v1, :cond_1

    return-void

    :cond_1
    check-cast v0, Lio/ktor/utils/io/a$a$e;

    invoke-interface {v0, p1}, Lio/ktor/utils/io/a$a$e;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final o()V
    .locals 3

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/ktor/utils/io/a;->c:Lo9/a;

    iget-object v2, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    invoke-virtual {v1, v2}, Lo9/a;->t(Lo9/g;)J

    const/4 v1, 0x0

    iput v1, p0, Lio/ktor/utils/io/a;->flushBufferSize:I

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/a$a;

    instance-of v1, v0, Lio/ktor/utils/io/a$a$f;

    if-eqz v1, :cond_0

    sget-object v1, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v2, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lio/ktor/utils/io/a$a$e;

    invoke-interface {v0}, Lio/ktor/utils/io/a$a$e;->c()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Ljava/lang/Throwable;
    .locals 1

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/ktor/utils/io/n;->a()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Lo9/p;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lio/ktor/utils/io/a;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/ktor/utils/io/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/ktor/utils/io/a;->f:Lo9/a;

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Channel is closed for write"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    throw v0
.end method

.method public d()Lo9/q;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lio/ktor/utils/io/a;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/ktor/utils/io/a;->o()V

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    return-object v0

    :cond_1
    throw v0
.end method

.method public e(Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p1, Lio/ktor/utils/io/a$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/ktor/utils/io/a$d;

    iget v1, v0, Lio/ktor/utils/io/a$d;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/a$d;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/a$d;

    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/a$d;-><init>(Lio/ktor/utils/io/a;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/a$d;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/a$d;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lio/ktor/utils/io/a$d;->F:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/a;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, Li7/w;->D:Li7/w$a;

    iput-object p0, v0, Lio/ktor/utils/io/a$d;->F:Ljava/lang/Object;

    iput v3, v0, Lio/ktor/utils/io/a$d;->I:I

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/a;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    sget-object p1, Lio/ktor/utils/io/a;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lio/ktor/utils/io/o;->a()Lio/ktor/utils/io/n;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    invoke-direct {v0, v2}, Lio/ktor/utils/io/a;->l(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public f(ILm7/e;)Ljava/lang/Object;
    .locals 11

    .prologue
    instance-of v0, p2, Lio/ktor/utils/io/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/ktor/utils/io/a$b;

    iget v1, v0, Lio/ktor/utils/io/a$b;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/a$b;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/a$b;

    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/a$b;-><init>(Lio/ktor/utils/io/a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/a$b;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/a$b;->K:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/ktor/utils/io/a$b;->H:I

    iget-object v2, v0, Lio/ktor/utils/io/a$b;->G:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/a;

    iget-object v4, v0, Lio/ktor/utils/io/a$b;->F:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/a;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Lio/ktor/utils/io/f;->g(Lio/ktor/utils/io/a;)V

    iget-object p2, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    invoke-virtual {p2}, Lo9/a;->r()J

    move-result-wide v4

    int-to-long v6, p1

    cmp-long p2, v4, v6

    if-ltz p2, :cond_3

    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3
    move-object v2, p0

    move-object v4, v2

    :cond_4
    :goto_1
    invoke-static {v4}, Lio/ktor/utils/io/a;->i(Lio/ktor/utils/io/a;)I

    move-result p2

    int-to-long v5, p2

    invoke-static {v4}, Lio/ktor/utils/io/a;->j(Lio/ktor/utils/io/a;)Lo9/a;

    move-result-object p2

    invoke-virtual {p2}, Lo9/a;->r()J

    move-result-wide v7

    add-long/2addr v5, v7

    int-to-long v7, p1

    cmp-long p2, v5, v7

    if-gez p2, :cond_d

    iget-object p2, v4, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    if-nez p2, :cond_d

    iput-object v4, v0, Lio/ktor/utils/io/a$b;->F:Ljava/lang/Object;

    iput-object v2, v0, Lio/ktor/utils/io/a$b;->G:Ljava/lang/Object;

    iput p1, v0, Lio/ktor/utils/io/a$b;->H:I

    iput v3, v0, Lio/ktor/utils/io/a$b;->K:I

    new-instance p2, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v5

    invoke-direct {p2, v5, v3}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {p2}, LW8/n;->E()V

    new-instance v5, Lio/ktor/utils/io/a$a$d;

    invoke-direct {v5, p2}, Lio/ktor/utils/io/a$a$d;-><init>(Lm7/e;)V

    iget-object v6, v2, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/a$a;

    instance-of v9, v6, Lio/ktor/utils/io/a$a$a;

    if-nez v9, :cond_5

    sget-object v10, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v10, v2, v6, v5}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :goto_2
    invoke-interface {v5}, Lio/ktor/utils/io/a$a$e;->c()V

    goto :goto_4

    :cond_5
    instance-of v10, v6, Lio/ktor/utils/io/a$a$d;

    if-eqz v10, :cond_6

    check-cast v6, Lio/ktor/utils/io/a$a$e;

    new-instance v9, Lio/ktor/utils/io/p;

    invoke-interface {v5}, Lio/ktor/utils/io/a$a$e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6}, Lio/ktor/utils/io/a$a$e;->d()Ljava/lang/Throwable;

    move-result-object v10

    invoke-direct {v9, v5, v10}, Lio/ktor/utils/io/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v6, v9}, Lio/ktor/utils/io/a$a$e;->b(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    instance-of v10, v6, Lio/ktor/utils/io/a$a$e;

    if-eqz v10, :cond_7

    check-cast v6, Lio/ktor/utils/io/a$a$e;

    invoke-interface {v6}, Lio/ktor/utils/io/a$a$e;->c()V

    goto :goto_3

    :cond_7
    if-eqz v9, :cond_8

    check-cast v6, Lio/ktor/utils/io/a$a$a;

    invoke-virtual {v6}, Lio/ktor/utils/io/a$a$a;->f()Ljava/lang/Throwable;

    move-result-object v6

    invoke-interface {v5, v6}, Lio/ktor/utils/io/a$a$e;->b(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    sget-object v5, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    invoke-static {v6, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_3
    invoke-static {v4}, Lio/ktor/utils/io/a;->i(Lio/ktor/utils/io/a;)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v4}, Lio/ktor/utils/io/a;->j(Lio/ktor/utils/io/a;)Lo9/a;

    move-result-object v9

    invoke-virtual {v9}, Lo9/a;->r()J

    move-result-wide v9

    add-long/2addr v5, v9

    cmp-long v5, v5, v7

    if-gez v5, :cond_9

    iget-object v5, v4, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    if-nez v5, :cond_9

    goto :goto_4

    :cond_9
    iget-object v5, v2, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    check-cast v5, Lio/ktor/utils/io/a$a;

    instance-of v6, v5, Lio/ktor/utils/io/a$a$d;

    if-eqz v6, :cond_a

    sget-object v6, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v7, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    invoke-static {v6, v2, v5, v7}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    check-cast v5, Lio/ktor/utils/io/a$a$e;

    goto :goto_2

    :cond_a
    :goto_4
    invoke-virtual {p2}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v5

    if-ne p2, v5, :cond_b

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V

    :cond_b
    if-ne p2, v1, :cond_4

    return-object v1

    :cond_c
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_d
    iget-object p1, v4, Lio/ktor/utils/io/a;->e:Lo9/a;

    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide p1

    const-wide/32 v0, 0x100000

    cmp-long p1, p1, v0

    if-gez p1, :cond_e

    invoke-direct {v4}, Lio/ktor/utils/io/a;->o()V

    :cond_e
    iget-object p1, v4, Lio/ktor/utils/io/a;->e:Lo9/a;

    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide p1

    cmp-long p1, p1, v7

    if-ltz p1, :cond_f

    goto :goto_5

    :cond_f
    const/4 v3, 0x0

    :goto_5
    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public g(Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p1, Lio/ktor/utils/io/a$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/ktor/utils/io/a$c;

    iget v1, v0, Lio/ktor/utils/io/a$c;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/a$c;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/a$c;

    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/a$c;-><init>(Lio/ktor/utils/io/a;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/a$c;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/a$c;->J:I

    const/high16 v3, 0x100000

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v2, v0, Lio/ktor/utils/io/a$c;->G:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/a;

    iget-object v5, v0, Lio/ktor/utils/io/a$c;->F:Ljava/lang/Object;

    check-cast v5, Lio/ktor/utils/io/a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Lio/ktor/utils/io/f;->g(Lio/ktor/utils/io/a;)V

    invoke-virtual {p0}, Lio/ktor/utils/io/a;->m()V

    iget p1, p0, Lio/ktor/utils/io/a;->flushBufferSize:I

    if-ge p1, v3, :cond_3

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_3
    move-object v2, p0

    move-object v5, v2

    :cond_4
    :goto_1
    invoke-static {v5}, Lio/ktor/utils/io/a;->i(Lio/ktor/utils/io/a;)I

    move-result p1

    if-lt p1, v3, :cond_d

    iget-object p1, v5, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    if-nez p1, :cond_d

    iput-object v5, v0, Lio/ktor/utils/io/a$c;->F:Ljava/lang/Object;

    iput-object v2, v0, Lio/ktor/utils/io/a$c;->G:Ljava/lang/Object;

    iput v4, v0, Lio/ktor/utils/io/a$c;->J:I

    new-instance p1, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v6

    invoke-direct {p1, v6, v4}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {p1}, LW8/n;->E()V

    new-instance v6, Lio/ktor/utils/io/a$a$f;

    invoke-direct {v6, p1}, Lio/ktor/utils/io/a$a$f;-><init>(Lm7/e;)V

    iget-object v7, v2, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/a$a;

    instance-of v8, v7, Lio/ktor/utils/io/a$a$a;

    if-nez v8, :cond_5

    sget-object v9, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v9, v2, v7, v6}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :goto_2
    invoke-interface {v6}, Lio/ktor/utils/io/a$a$e;->c()V

    goto :goto_4

    :cond_5
    instance-of v9, v7, Lio/ktor/utils/io/a$a$f;

    if-eqz v9, :cond_6

    check-cast v7, Lio/ktor/utils/io/a$a$e;

    new-instance v8, Lio/ktor/utils/io/p;

    invoke-interface {v6}, Lio/ktor/utils/io/a$a$e;->a()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7}, Lio/ktor/utils/io/a$a$e;->d()Ljava/lang/Throwable;

    move-result-object v9

    invoke-direct {v8, v6, v9}, Lio/ktor/utils/io/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v7, v8}, Lio/ktor/utils/io/a$a$e;->b(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    instance-of v9, v7, Lio/ktor/utils/io/a$a$e;

    if-eqz v9, :cond_7

    check-cast v7, Lio/ktor/utils/io/a$a$e;

    invoke-interface {v7}, Lio/ktor/utils/io/a$a$e;->c()V

    goto :goto_3

    :cond_7
    if-eqz v8, :cond_8

    check-cast v7, Lio/ktor/utils/io/a$a$a;

    invoke-virtual {v7}, Lio/ktor/utils/io/a$a$a;->f()Ljava/lang/Throwable;

    move-result-object v7

    invoke-interface {v6, v7}, Lio/ktor/utils/io/a$a$e;->b(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    sget-object v6, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    invoke-static {v7, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    :goto_3
    invoke-static {v5}, Lio/ktor/utils/io/a;->i(Lio/ktor/utils/io/a;)I

    move-result v6

    if-lt v6, v3, :cond_9

    iget-object v6, v5, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    if-nez v6, :cond_9

    goto :goto_4

    :cond_9
    iget-object v6, v2, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/a$a;

    instance-of v7, v6, Lio/ktor/utils/io/a$a$f;

    if-eqz v7, :cond_a

    sget-object v7, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v8, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    invoke-static {v7, v2, v6, v8}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    check-cast v6, Lio/ktor/utils/io/a$a$e;

    goto :goto_2

    :cond_a
    :goto_4
    invoke-virtual {p1}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v6

    if-ne p1, v6, :cond_b

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V

    :cond_b
    if-ne p1, v1, :cond_4

    return-object v1

    :cond_c
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_d
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public h()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Lio/ktor/utils/io/a;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/ktor/utils/io/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lio/ktor/utils/io/a;->flushBufferSize:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/ktor/utils/io/a;->e:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/a;->_closedCause:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/ktor/utils/io/n;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/n;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lio/ktor/utils/io/a;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/ktor/utils/io/n;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/ktor/utils/io/a;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method public m()V
    .locals 4

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/a;->f:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/ktor/utils/io/a;->f:Lo9/a;

    invoke-virtual {v1}, Lo9/a;->r()J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, p0, Lio/ktor/utils/io/a;->c:Lo9/a;

    iget-object v3, p0, Lio/ktor/utils/io/a;->f:Lo9/a;

    invoke-virtual {v2, v3}, Lo9/a;->X(Lo9/h;)J

    iget v2, p0, Lio/ktor/utils/io/a;->flushBufferSize:I

    add-int/2addr v2, v1

    iput v2, p0, Lio/ktor/utils/io/a;->flushBufferSize:I

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lio/ktor/utils/io/a;->suspensionSlot:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/a$a;

    instance-of v1, v0, Lio/ktor/utils/io/a$a$d;

    if-eqz v1, :cond_1

    sget-object v1, Lio/ktor/utils/io/a;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v2, Lio/ktor/utils/io/a$a$c;->b:Lio/ktor/utils/io/a$a$c;

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast v0, Lio/ktor/utils/io/a$a$e;

    invoke-interface {v0}, Lio/ktor/utils/io/a$a$e;->c()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lio/ktor/utils/io/a;->b:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ByteChannel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
