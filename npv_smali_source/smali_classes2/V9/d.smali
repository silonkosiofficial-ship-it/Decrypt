.class public final LV9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/F;
.implements LV9/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV9/d$a;,
        LV9/d$b;,
        LV9/d$c;,
        LV9/d$d;,
        LV9/d$e;
    }
.end annotation


# static fields
.field private static final A:Ljava/util/List;

.field public static final z:LV9/d$b;


# instance fields
.field private final a:LH9/z;

.field private final b:LH9/G;

.field private final c:Ljava/util/Random;

.field private final d:J

.field private e:LV9/e;

.field private f:J

.field private final g:Ljava/lang/String;

.field private h:LH9/e;

.field private i:LL9/a;

.field private j:LV9/g;

.field private k:LV9/h;

.field private l:LL9/d;

.field private m:Ljava/lang/String;

.field private n:LV9/d$d;

.field private final o:Ljava/util/ArrayDeque;

.field private final p:Ljava/util/ArrayDeque;

.field private q:J

.field private r:Z

.field private s:I

.field private t:Ljava/lang/String;

.field private u:Z

.field private v:I

.field private w:I

.field private x:I

.field private y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV9/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV9/d$b;-><init>(Ly7/k;)V

    sput-object v0, LV9/d;->z:LV9/d$b;

    sget-object v0, LH9/y;->F:LH9/y;

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LV9/d;->A:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LL9/e;LH9/z;LH9/G;Ljava/util/Random;JLV9/e;J)V
    .locals 1

    .prologue
    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LV9/d;->a:LH9/z;

    iput-object p3, p0, LV9/d;->b:LH9/G;

    iput-object p4, p0, LV9/d;->c:Ljava/util/Random;

    iput-wide p5, p0, LV9/d;->d:J

    iput-object p7, p0, LV9/d;->e:LV9/e;

    iput-wide p8, p0, LV9/d;->f:J

    invoke-virtual {p1}, LL9/e;->i()LL9/d;

    move-result-object p1

    iput-object p1, p0, LV9/d;->l:LL9/d;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LV9/d;->o:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    const/4 p1, -0x1

    iput p1, p0, LV9/d;->s:I

    const-string p1, "GET"

    invoke-virtual {p2}, LH9/z;->g()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p2, LX9/g;->F:LX9/g$a;

    const/16 p1, 0x10

    new-array p3, p1, [B

    invoke-virtual {p4, p3}, Ljava/util/Random;->nextBytes([B)V

    sget-object p1, Li7/M;->a:Li7/M;

    const/4 p6, 0x3

    const/4 p7, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-static/range {p2 .. p7}, LX9/g$a;->e(LX9/g$a;[BIIILjava/lang/Object;)LX9/g;

    move-result-object p1

    invoke-virtual {p1}, LX9/g;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LV9/d;->g:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Request must be GET: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LH9/z;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic i(LV9/d;)Ljava/util/ArrayDeque;
    .locals 0

    iget-object p0, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method public static final synthetic j(LV9/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LV9/d;->m:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic k(LV9/d;LV9/e;)Z
    .locals 0

    invoke-direct {p0, p1}, LV9/d;->s(LV9/e;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic l(LV9/d;LV9/e;)V
    .locals 0

    iput-object p1, p0, LV9/d;->e:LV9/e;

    return-void
.end method

.method private final s(LV9/e;)Z
    .locals 4

    .prologue
    iget-boolean v0, p1, LV9/e;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p1, LV9/e;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p1, LV9/e;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, LE7/i;

    const/16 v2, 0x8

    const/16 v3, 0xf

    invoke-direct {v0, v2, v3}, LE7/i;-><init>(II)V

    iget-object p1, p1, LV9/e;->d:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LE7/i;->D(I)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private final u()V
    .locals 8

    .prologue
    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v3, p0, LV9/d;->i:LL9/a;

    if-eqz v3, :cond_2

    iget-object v2, p0, LV9/d;->l:LL9/d;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, LL9/d;->j(LL9/d;LL9/a;JILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private final declared-synchronized v(LX9/g;I)Z
    .locals 6

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LV9/d;->u:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, LV9/d;->r:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, LV9/d;->q:J

    invoke-virtual {p1}, LX9/g;->I()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    const-wide/32 v4, 0x1000000

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/16 p1, 0x3e9

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, LV9/d;->f(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_1
    iget-wide v0, p0, LV9/d;->q:J

    invoke-virtual {p1}, LX9/g;->I()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LV9/d;->q:J

    iget-object v0, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    new-instance v1, LV9/d$c;

    invoke-direct {v1, p2, p1}, LV9/d$c;-><init>(ILX9/g;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, LV9/d;->u()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    monitor-exit p0

    return v1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(LX9/g;)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV9/d;->b:LH9/G;

    invoke-virtual {v0, p0, p1}, LH9/G;->d(LH9/F;LX9/g;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX9/g;->F:LX9/g$a;

    invoke-virtual {v0, p1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LV9/d;->v(LX9/g;I)Z

    move-result p1

    return p1
.end method

.method public c(LX9/g;)Z
    .locals 1

    const-string v0, "bytes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, LV9/d;->v(LX9/g;I)Z

    move-result p1

    return p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LV9/d;->h:LH9/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, LH9/e;->cancel()V

    return-void
.end method

.method public declared-synchronized d(LX9/g;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "payload"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LV9/d;->u:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LV9/d;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, LV9/d;->o:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, LV9/d;->u()V

    iget p1, p0, LV9/d;->w:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LV9/d;->w:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV9/d;->b:LH9/G;

    invoke-virtual {v0, p0, p1}, LH9/G;->e(LH9/F;Ljava/lang/String;)V

    return-void
.end method

.method public f(ILjava/lang/String;)Z
    .locals 2

    const-wide/32 v0, 0xea60

    invoke-virtual {p0, p1, p2, v0, v1}, LV9/d;->n(ILjava/lang/String;J)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized g(LX9/g;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "payload"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, LV9/d;->x:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LV9/d;->x:I

    const/4 p1, 0x0

    iput-boolean p1, p0, LV9/d;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h(ILjava/lang/String;)V
    .locals 4

    .prologue
    const-string v0, "reason"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_9

    monitor-enter p0

    :try_start_0
    iget v1, p0, LV9/d;->s:I

    if-ne v1, v0, :cond_8

    iput p1, p0, LV9/d;->s:I

    iput-object p2, p0, LV9/d;->t:Ljava/lang/String;

    iget-boolean v0, p0, LV9/d;->r:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV9/d;->n:LV9/d$d;

    iput-object v1, p0, LV9/d;->n:LV9/d$d;

    iget-object v2, p0, LV9/d;->j:LV9/g;

    iput-object v1, p0, LV9/d;->j:LV9/g;

    iget-object v3, p0, LV9/d;->k:LV9/h;

    iput-object v1, p0, LV9/d;->k:LV9/h;

    iget-object v1, p0, LV9/d;->l:LL9/d;

    invoke-virtual {v1}, LL9/d;->n()V

    move-object v1, v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    move-object v2, v1

    move-object v3, v2

    :goto_0
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    :try_start_1
    iget-object v0, p0, LV9/d;->b:LH9/G;

    invoke-virtual {v0, p0, p1, p2}, LH9/G;->b(LH9/F;ILjava/lang/String;)V

    if-eqz v1, :cond_1

    iget-object v0, p0, LV9/d;->b:LH9/G;

    invoke-virtual {v0, p0, p1, p2}, LH9/G;->a(LH9/F;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    invoke-static {v1}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-static {v2}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_3
    if-eqz v3, :cond_4

    invoke-static {v3}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_4
    return-void

    :goto_2
    if-eqz v1, :cond_5

    invoke-static {v1}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-static {v2}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_6
    if-eqz v3, :cond_7

    invoke-static {v3}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_7
    throw p1

    :cond_8
    :try_start_2
    const-string p1, "already closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_9
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final m(LH9/B;LM9/c;)V
    .locals 7

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH9/B;->o()I

    move-result v0

    const/16 v1, 0x65

    const/16 v2, 0x27

    if-ne v0, v1, :cond_4

    const-string v0, "Connection"

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v0, v1, v3, v1}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "Upgrade"

    const/4 v5, 0x1

    invoke-static {v4, v0, v5}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {p1, v4, v1, v3, v1}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "websocket"

    invoke-static {v4, v0, v5}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v0, "Sec-WebSocket-Accept"

    invoke-static {p1, v0, v1, v3, v1}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LX9/g;->F:LX9/g$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, LV9/d;->g:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    invoke-virtual {v0}, LX9/g;->G()LX9/g;

    move-result-object v0

    invoke-virtual {v0}, LX9/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Web Socket exchange missing: bad interceptor?"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' but was \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p2, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected HTTP 101 response but was \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LH9/B;->o()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LH9/B;->R()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final declared-synchronized n(ILjava/lang/String;J)Z
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, LV9/f;->a:LV9/f;

    invoke-virtual {v0, p1}, LV9/f;->c(I)V

    if-eqz p2, :cond_1

    sget-object v0, LX9/g;->F:LX9/g$a;

    invoke-virtual {v0, p2}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    invoke-virtual {v0}, LX9/g;->I()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x7b

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "reason.size() > 123: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-boolean p2, p0, LV9/d;->u:Z

    if-nez p2, :cond_3

    iget-boolean p2, p0, LV9/d;->r:Z

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    iput-boolean p2, p0, LV9/d;->r:Z

    iget-object v1, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    new-instance v2, LV9/d$a;

    invoke-direct {v2, p1, v0, p3, p4}, LV9/d$a;-><init>(ILX9/g;J)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, LV9/d;->u()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p2

    :cond_3
    :goto_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final o(LH9/x;)V
    .locals 4

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV9/d;->a:LH9/z;

    const-string v1, "Sec-WebSocket-Extensions"

    invoke-virtual {v0, v1}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    return-void

    :cond_0
    invoke-virtual {p1}, LH9/x;->C()LH9/x$a;

    move-result-object p1

    sget-object v0, LH9/r;->b:LH9/r;

    invoke-virtual {p1, v0}, LH9/x$a;->d(LH9/r;)LH9/x$a;

    move-result-object p1

    sget-object v0, LV9/d;->A:Ljava/util/List;

    invoke-virtual {p1, v0}, LH9/x$a;->K(Ljava/util/List;)LH9/x$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/x$a;->a()LH9/x;

    move-result-object p1

    iget-object v0, p0, LV9/d;->a:LH9/z;

    invoke-virtual {v0}, LH9/z;->h()LH9/z$a;

    move-result-object v0

    const-string v2, "websocket"

    const-string v3, "Upgrade"

    invoke-virtual {v0, v3, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    const-string v2, "Connection"

    invoke-virtual {v0, v2, v3}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    const-string v2, "Sec-WebSocket-Key"

    iget-object v3, p0, LV9/d;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    const-string v2, "Sec-WebSocket-Version"

    const-string v3, "13"

    invoke-virtual {v0, v2, v3}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    const-string v2, "permessage-deflate"

    invoke-virtual {v0, v1, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/z$a;->b()LH9/z;

    move-result-object v0

    new-instance v1, LM9/e;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v0, v2}, LM9/e;-><init>(LH9/x;LH9/z;Z)V

    iput-object v1, p0, LV9/d;->h:LH9/e;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LV9/d$f;

    invoke-direct {p1, p0, v0}, LV9/d$f;-><init>(LV9/d;LH9/z;)V

    invoke-interface {v1, p1}, LH9/e;->N(LH9/f;)V

    return-void
.end method

.method public final p(Ljava/lang/Exception;LH9/B;)V
    .locals 4

    .prologue
    const-string v0, "e"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LV9/d;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, LV9/d;->u:Z

    iget-object v0, p0, LV9/d;->n:LV9/d$d;

    const/4 v1, 0x0

    iput-object v1, p0, LV9/d;->n:LV9/d$d;

    iget-object v2, p0, LV9/d;->j:LV9/g;

    iput-object v1, p0, LV9/d;->j:LV9/g;

    iget-object v3, p0, LV9/d;->k:LV9/h;

    iput-object v1, p0, LV9/d;->k:LV9/h;

    iget-object v1, p0, LV9/d;->l:LL9/d;

    invoke-virtual {v1}, LL9/d;->n()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    :try_start_2
    iget-object v1, p0, LV9/d;->b:LH9/G;

    invoke-virtual {v1, p0, p1, p2}, LH9/G;->c(LH9/F;Ljava/lang/Throwable;LH9/B;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_1

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_1
    if-eqz v2, :cond_2

    invoke-static {v2}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v3}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_4

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {v2}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v3, :cond_6

    invoke-static {v3}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_6
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final q()LH9/G;
    .locals 1

    iget-object v0, p0, LV9/d;->b:LH9/G;

    return-object v0
.end method

.method public final r(Ljava/lang/String;LV9/d$d;)V
    .locals 10

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streams"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV9/d;->e:LV9/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LV9/d;->m:Ljava/lang/String;

    iput-object p2, p0, LV9/d;->n:LV9/d$d;

    new-instance v9, LV9/h;

    invoke-virtual {p2}, LV9/d$d;->a()Z

    move-result v2

    invoke-virtual {p2}, LV9/d$d;->f()LX9/e;

    move-result-object v3

    iget-object v4, p0, LV9/d;->c:Ljava/util/Random;

    iget-boolean v5, v0, LV9/e;->a:Z

    invoke-virtual {p2}, LV9/d$d;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, LV9/e;->a(Z)Z

    move-result v6

    iget-wide v7, p0, LV9/d;->f:J

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, LV9/h;-><init>(ZLX9/e;Ljava/util/Random;ZZJ)V

    iput-object v9, p0, LV9/d;->k:LV9/h;

    new-instance v1, LV9/d$e;

    invoke-direct {v1, p0}, LV9/d$e;-><init>(LV9/d;)V

    iput-object v1, p0, LV9/d;->i:LL9/a;

    iget-wide v1, p0, LV9/d;->d:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    iget-object v3, p0, LV9/d;->l:LL9/d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ping"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v4, LV9/d$g;

    invoke-direct {v4, p1, p0, v1, v2}, LV9/d$g;-><init>(Ljava/lang/String;LV9/d;J)V

    invoke-virtual {v3, v4, v1, v2}, LL9/d;->i(LL9/a;J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_1

    invoke-direct {p0}, LV9/d;->u()V

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    new-instance p1, LV9/g;

    invoke-virtual {p2}, LV9/d$d;->a()Z

    move-result v2

    invoke-virtual {p2}, LV9/d$d;->g()LX9/f;

    move-result-object v3

    iget-boolean v5, v0, LV9/e;->a:Z

    invoke-virtual {p2}, LV9/d$d;->a()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {v0, p2}, LV9/e;->a(Z)Z

    move-result v6

    move-object v1, p1

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, LV9/g;-><init>(ZLX9/f;LV9/g$a;ZZ)V

    iput-object p1, p0, LV9/d;->j:LV9/g;

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final t()V
    .locals 2

    .prologue
    :goto_0
    iget v0, p0, LV9/d;->s:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LV9/d;->j:LV9/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LV9/g;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final w()Z
    .locals 12

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LV9/d;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, LV9/d;->k:LV9/h;

    iget-object v2, p0, LV9/d;->o:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-nez v2, :cond_4

    iget-object v6, p0, LV9/d;->p:Ljava/util/ArrayDeque;

    invoke-virtual {v6}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, LV9/d$a;

    if-eqz v7, :cond_2

    iget v1, p0, LV9/d;->s:I

    iget-object v7, p0, LV9/d;->t:Ljava/lang/String;

    if-eq v1, v5, :cond_1

    iget-object v5, p0, LV9/d;->n:LV9/d$d;

    iput-object v4, p0, LV9/d;->n:LV9/d$d;

    iget-object v8, p0, LV9/d;->j:LV9/g;

    iput-object v4, p0, LV9/d;->j:LV9/g;

    iget-object v9, p0, LV9/d;->k:LV9/h;

    iput-object v4, p0, LV9/d;->k:LV9/h;

    iget-object v4, p0, LV9/d;->l:LL9/d;

    invoke-virtual {v4}, LL9/d;->n()V

    :goto_0
    move-object v4, v6

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    move-object v5, v6

    check-cast v5, LV9/d$a;

    invoke-virtual {v5}, LV9/d$a;->a()J

    move-result-wide v8

    iget-object v5, p0, LV9/d;->l:LL9/d;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, p0, LV9/d;->m:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " cancel"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v11, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v8

    new-instance v11, LV9/d$h;

    invoke-direct {v11, v10, v3, p0}, LV9/d$h;-><init>(Ljava/lang/String;ZLV9/d;)V

    invoke-virtual {v5, v11, v8, v9}, LL9/d;->i(LL9/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v5, v4

    move-object v8, v5

    move-object v9, v8

    goto :goto_0

    :cond_2
    if-nez v6, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move v1, v5

    move-object v5, v9

    goto :goto_0

    :cond_4
    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move v1, v5

    move-object v5, v9

    :goto_1
    :try_start_2
    sget-object v6, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    if-eqz v2, :cond_5

    :try_start_3
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v2, LX9/g;

    invoke-virtual {v0, v2}, LV9/h;->o(LX9/g;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_5
    instance-of v2, v4, LV9/d$c;

    if-eqz v2, :cond_6

    check-cast v4, LV9/d$c;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, LV9/d$c;->b()I

    move-result v1

    invoke-virtual {v4}, LV9/d$c;->a()LX9/g;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LV9/h;->g(ILX9/g;)V

    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-wide v0, p0, LV9/d;->q:J

    invoke-virtual {v4}, LV9/d$c;->a()LX9/g;

    move-result-object v2

    invoke-virtual {v2}, LX9/g;->I()I

    move-result v2

    int-to-long v6, v2

    sub-long/2addr v0, v6

    iput-wide v0, p0, LV9/d;->q:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit p0

    goto :goto_2

    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_6
    instance-of v2, v4, LV9/d$a;

    if-eqz v2, :cond_b

    check-cast v4, LV9/d$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, LV9/d$a;->b()I

    move-result v2

    invoke-virtual {v4}, LV9/d$a;->c()LX9/g;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, LV9/h;->a(ILX9/g;)V

    if-eqz v5, :cond_7

    iget-object v0, p0, LV9/d;->b:LH9/G;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, v1, v7}, LH9/G;->a(LH9/F;ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    invoke-static {v5}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_8
    if-eqz v8, :cond_9

    invoke-static {v8}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_9
    if-eqz v9, :cond_a

    invoke-static {v9}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_a
    return v3

    :cond_b
    :try_start_6
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_3
    if-eqz v5, :cond_c

    invoke-static {v5}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_c
    if-eqz v8, :cond_d

    invoke-static {v8}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_d
    if-eqz v9, :cond_e

    invoke-static {v9}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_e
    throw v0

    :goto_4
    monitor-exit p0

    throw v0
.end method

.method public final x()V
    .locals 7

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LV9/d;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, LV9/d;->k:LV9/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    iget-boolean v1, p0, LV9/d;->y:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    iget v1, p0, LV9/d;->v:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_0
    iget v3, p0, LV9/d;->v:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, LV9/d;->v:I

    iput-boolean v4, p0, LV9/d;->y:Z

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    const/4 v3, 0x0

    if-eq v1, v2, :cond_3

    new-instance v0, Ljava/net/SocketTimeoutException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sent ping but didn\'t receive pong within "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, LV9/d;->d:J

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, "ms (after "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr v1, v4

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " successful ping/pongs)"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v3}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    return-void

    :cond_3
    :try_start_3
    sget-object v1, LX9/g;->G:LX9/g;

    invoke-virtual {v0, v1}, LV9/h;->i(LX9/g;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0, v3}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    :goto_1
    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method
