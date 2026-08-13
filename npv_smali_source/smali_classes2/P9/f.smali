.class public final LP9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/f$a;,
        LP9/f$b;,
        LP9/f$c;,
        LP9/f$d;
    }
.end annotation


# static fields
.field public static final e0:LP9/f$b;

.field private static final f0:LP9/m;


# instance fields
.field private final C:Z

.field private final D:LP9/f$c;

.field private final E:Ljava/util/Map;

.field private final F:Ljava/lang/String;

.field private G:I

.field private H:I

.field private I:Z

.field private final J:LL9/e;

.field private final K:LL9/d;

.field private final L:LL9/d;

.field private final M:LL9/d;

.field private final N:LP9/l;

.field private O:J

.field private P:J

.field private Q:J

.field private R:J

.field private S:J

.field private T:J

.field private final U:LP9/m;

.field private V:LP9/m;

.field private W:J

.field private X:J

.field private Y:J

.field private Z:J

.field private final a0:Ljava/net/Socket;

.field private final b0:LP9/j;

.field private final c0:LP9/f$d;

.field private final d0:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LP9/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP9/f$b;-><init>(Ly7/k;)V

    sput-object v0, LP9/f;->e0:LP9/f$b;

    new-instance v0, LP9/m;

    invoke-direct {v0}, LP9/m;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, LP9/m;->h(II)LP9/m;

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, LP9/m;->h(II)LP9/m;

    sput-object v0, LP9/f;->f0:LP9/m;

    return-void
.end method

.method public constructor <init>(LP9/f$a;)V
    .locals 6

    .prologue
    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LP9/f$a;->b()Z

    move-result v0

    iput-boolean v0, p0, LP9/f;->C:Z

    invoke-virtual {p1}, LP9/f$a;->d()LP9/f$c;

    move-result-object v1

    iput-object v1, p0, LP9/f;->D:LP9/f$c;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LP9/f;->E:Ljava/util/Map;

    invoke-virtual {p1}, LP9/f$a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {p1}, LP9/f$a;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    iput v2, p0, LP9/f;->H:I

    invoke-virtual {p1}, LP9/f$a;->j()LL9/e;

    move-result-object v2

    iput-object v2, p0, LP9/f;->J:LL9/e;

    invoke-virtual {v2}, LL9/e;->i()LL9/d;

    move-result-object v3

    iput-object v3, p0, LP9/f;->K:LL9/d;

    invoke-virtual {v2}, LL9/e;->i()LL9/d;

    move-result-object v4

    iput-object v4, p0, LP9/f;->L:LL9/d;

    invoke-virtual {v2}, LL9/e;->i()LL9/d;

    move-result-object v2

    iput-object v2, p0, LP9/f;->M:LL9/d;

    invoke-virtual {p1}, LP9/f$a;->f()LP9/l;

    move-result-object v2

    iput-object v2, p0, LP9/f;->N:LP9/l;

    new-instance v2, LP9/m;

    invoke-direct {v2}, LP9/m;-><init>()V

    invoke-virtual {p1}, LP9/f$a;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x7

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, LP9/m;->h(II)LP9/m;

    :cond_1
    iput-object v2, p0, LP9/f;->U:LP9/m;

    sget-object v2, LP9/f;->f0:LP9/m;

    iput-object v2, p0, LP9/f;->V:LP9/m;

    invoke-virtual {v2}, LP9/m;->c()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, LP9/f;->Z:J

    invoke-virtual {p1}, LP9/f$a;->h()Ljava/net/Socket;

    move-result-object v2

    iput-object v2, p0, LP9/f;->a0:Ljava/net/Socket;

    new-instance v2, LP9/j;

    invoke-virtual {p1}, LP9/f$a;->g()LX9/e;

    move-result-object v4

    invoke-direct {v2, v4, v0}, LP9/j;-><init>(LX9/e;Z)V

    iput-object v2, p0, LP9/f;->b0:LP9/j;

    new-instance v2, LP9/f$d;

    new-instance v4, LP9/h;

    invoke-virtual {p1}, LP9/f$a;->i()LX9/f;

    move-result-object v5

    invoke-direct {v4, v5, v0}, LP9/h;-><init>(LX9/f;Z)V

    invoke-direct {v2, p0, v4}, LP9/f$d;-><init>(LP9/f;LP9/h;)V

    iput-object v2, p0, LP9/f;->c0:LP9/f$d;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LP9/f;->d0:Ljava/util/Set;

    invoke-virtual {p1}, LP9/f$a;->e()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, LP9/f$a;->e()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ping"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LP9/f$j;

    invoke-direct {v0, p1, p0, v4, v5}, LP9/f$j;-><init>(Ljava/lang/String;LP9/f;J)V

    invoke-virtual {v3, v0, v4, v5}, LL9/d;->i(LL9/a;J)V

    :cond_2
    return-void
.end method

.method public static final synthetic D(LP9/f;)LL9/d;
    .locals 0

    iget-object p0, p0, LP9/f;->M:LL9/d;

    return-object p0
.end method

.method public static synthetic D1(LP9/f;ZLL9/e;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, LL9/e;->i:LL9/e;

    :cond_1
    invoke-virtual {p0, p1, p2}, LP9/f;->C1(ZLL9/e;)V

    return-void
.end method

.method public static final synthetic H(LP9/f;)LL9/e;
    .locals 0

    iget-object p0, p0, LP9/f;->J:LL9/e;

    return-object p0
.end method

.method public static final synthetic N(LP9/f;)LL9/d;
    .locals 0

    iget-object p0, p0, LP9/f;->K:LL9/d;

    return-object p0
.end method

.method public static final synthetic R(LP9/f;)Z
    .locals 0

    iget-boolean p0, p0, LP9/f;->I:Z

    return p0
.end method

.method public static final synthetic a(LP9/f;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, LP9/f;->u0(Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic e0(LP9/f;J)V
    .locals 0

    iput-wide p1, p0, LP9/f;->S:J

    return-void
.end method

.method public static final synthetic f(LP9/f;)J
    .locals 2

    iget-wide v0, p0, LP9/f;->S:J

    return-wide v0
.end method

.method private final f1(ILjava/util/List;Z)LP9/i;
    .locals 11

    .prologue
    const/4 v0, 0x1

    xor-int/lit8 v7, p3, 0x1

    iget-object v8, p0, LP9/f;->b0:LP9/j;

    monitor-enter v8

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v1, p0, LP9/f;->H:I

    const v2, 0x3fffffff    # 1.9999999f

    if-le v1, v2, :cond_0

    sget-object v1, LP9/b;->L:LP9/b;

    invoke-virtual {p0, v1}, LP9/f;->B1(LP9/b;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget-boolean v1, p0, LP9/f;->I:Z

    if-nez v1, :cond_7

    iget v9, p0, LP9/f;->H:I

    add-int/lit8 v1, v9, 0x2

    iput v1, p0, LP9/f;->H:I

    new-instance v10, LP9/i;

    const/4 v6, 0x0

    const/4 v5, 0x0

    move-object v1, v10

    move v2, v9

    move-object v3, p0

    move v4, v7

    invoke-direct/range {v1 .. v6}, LP9/i;-><init>(ILP9/f;ZZLH9/t;)V

    if-eqz p3, :cond_2

    iget-wide v1, p0, LP9/f;->Y:J

    iget-wide v3, p0, LP9/f;->Z:J

    cmp-long p3, v1, v3

    if-gez p3, :cond_2

    invoke-virtual {v10}, LP9/i;->r()J

    move-result-wide v1

    invoke-virtual {v10}, LP9/i;->q()J

    move-result-wide v3

    cmp-long p3, v1, v3

    if-ltz p3, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move p3, v0

    :goto_2
    invoke-virtual {v10}, LP9/i;->u()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LP9/f;->E:Ljava/util/Map;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    if-nez p1, :cond_4

    iget-object p1, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {p1, v7, v9, p2}, LP9/j;->s(ZILjava/util/List;)V

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_4
    iget-boolean v1, p0, LP9/f;->C:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {v0, p1, v9, p2}, LP9/j;->H(IILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    monitor-exit v8

    if-eqz p3, :cond_5

    iget-object p1, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {p1}, LP9/j;->flush()V

    :cond_5
    return-object v10

    :cond_6
    :try_start_3
    const-string p1, "client streams shouldn\'t have associated stream IDs"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :try_start_4
    new-instance p1, LP9/a;

    invoke-direct {p1}, LP9/a;-><init>()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    monitor-exit v8

    throw p1
.end method

.method public static final synthetic g(LP9/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LP9/f;->d0:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic g0(LP9/f;J)V
    .locals 0

    iput-wide p1, p0, LP9/f;->R:J

    return-void
.end method

.method public static final synthetic i()LP9/m;
    .locals 1

    sget-object v0, LP9/f;->f0:LP9/m;

    return-object v0
.end method

.method public static final synthetic n0(LP9/f;J)V
    .locals 0

    iput-wide p1, p0, LP9/f;->O:J

    return-void
.end method

.method public static final synthetic o(LP9/f;)J
    .locals 2

    iget-wide v0, p0, LP9/f;->R:J

    return-wide v0
.end method

.method public static final synthetic o0(LP9/f;J)V
    .locals 0

    iput-wide p1, p0, LP9/f;->P:J

    return-void
.end method

.method public static final synthetic q0(LP9/f;Z)V
    .locals 0

    iput-boolean p1, p0, LP9/f;->I:Z

    return-void
.end method

.method public static final synthetic r(LP9/f;)J
    .locals 2

    iget-wide v0, p0, LP9/f;->O:J

    return-wide v0
.end method

.method public static final synthetic r0(LP9/f;J)V
    .locals 0

    iput-wide p1, p0, LP9/f;->Z:J

    return-void
.end method

.method public static final synthetic s(LP9/f;)J
    .locals 2

    iget-wide v0, p0, LP9/f;->P:J

    return-wide v0
.end method

.method private final u0(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, LP9/b;->F:LP9/b;

    invoke-virtual {p0, v0, v0, p1}, LP9/f;->s0(LP9/b;LP9/b;Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic y(LP9/f;)LP9/l;
    .locals 0

    iget-object p0, p0, LP9/f;->N:LP9/l;

    return-object p0
.end method


# virtual methods
.method public final A1(LP9/m;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f;->V:LP9/m;

    return-void
.end method

.method public final B1(LP9/b;)V
    .locals 4

    .prologue
    const-string v0, "statusCode"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f;->b0:LP9/j;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ly7/M;

    invoke-direct {v1}, Ly7/M;-><init>()V

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v2, p0, LP9/f;->I:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :try_start_3
    iput-boolean v2, p0, LP9/f;->I:Z

    iget v2, p0, LP9/f;->G:I

    iput v2, v1, Ly7/M;->C:I

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0

    iget-object v1, p0, LP9/f;->b0:LP9/j;

    sget-object v3, LI9/d;->a:[B

    invoke-virtual {v1, v2, p1, v3}, LP9/j;->r(ILP9/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final C1(ZLL9/e;)V
    .locals 4

    .prologue
    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {p1}, LP9/j;->f()V

    iget-object p1, p0, LP9/f;->b0:LP9/j;

    iget-object v0, p0, LP9/f;->U:LP9/m;

    invoke-virtual {p1, v0}, LP9/j;->R(LP9/m;)V

    iget-object p1, p0, LP9/f;->U:LP9/m;

    invoke-virtual {p1}, LP9/m;->c()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    iget-object v1, p0, LP9/f;->b0:LP9/j;

    sub-int/2addr p1, v0

    int-to-long v2, p1

    const/4 p1, 0x0

    invoke-virtual {v1, p1, v2, v3}, LP9/j;->e0(IJ)V

    :cond_0
    invoke-virtual {p2}, LL9/e;->i()LL9/d;

    move-result-object p1

    iget-object p2, p0, LP9/f;->F:Ljava/lang/String;

    iget-object v0, p0, LP9/f;->c0:LP9/f$d;

    new-instance v1, LL9/c;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2, v0}, LL9/c;-><init>(Ljava/lang/String;ZLx7/a;)V

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v1, v2, v3}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public final E0()LP9/f$c;
    .locals 1

    iget-object v0, p0, LP9/f;->D:LP9/f$c;

    return-object v0
.end method

.method public final declared-synchronized E1(J)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, LP9/f;->W:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LP9/f;->W:J

    iget-wide p1, p0, LP9/f;->X:J

    sub-long/2addr v0, p1

    iget-object p1, p0, LP9/f;->U:LP9/m;

    invoke-virtual {p1}, LP9/m;->c()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, LP9/f;->K1(IJ)V

    iget-wide p1, p0, LP9/f;->X:J

    add-long/2addr p1, v0

    iput-wide p1, p0, LP9/f;->X:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
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

.method public final F1(IZLX9/d;J)V
    .locals 8

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {p4, p2, p1, p3, v3}, LP9/j;->g(ZILX9/d;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, LP9/f;->Y:J

    iget-wide v6, p0, LP9/f;->Z:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    iget-object v2, p0, LP9/f;->E:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {v4}, LP9/j;->y()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, LP9/f;->Y:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, LP9/f;->Y:J

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, LP9/f;->b0:LP9/j;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, LP9/j;->g(ZILX9/d;I)V

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final G1(IZLjava/util/List;)V
    .locals 1

    const-string v0, "alternating"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {v0, p2, p1, p3}, LP9/j;->s(ZILjava/util/List;)V

    return-void
.end method

.method public final H0()I
    .locals 1

    iget v0, p0, LP9/f;->H:I

    return v0
.end method

.method public final H1(ZII)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {v0, p1, p2, p3}, LP9/j;->D(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, LP9/f;->u0(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public final I1(ILP9/b;)V
    .locals 1

    const-string v0, "statusCode"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {v0, p1, p2}, LP9/j;->N(ILP9/b;)V

    return-void
.end method

.method public final J1(ILP9/b;)V
    .locals 9

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f;->K:LL9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] writeSynReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LP9/f$k;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LP9/f$k;-><init>(Ljava/lang/String;ZLP9/f;ILP9/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public final K0()LP9/m;
    .locals 1

    iget-object v0, p0, LP9/f;->U:LP9/m;

    return-object v0
.end method

.method public final K1(IJ)V
    .locals 10

    iget-object v0, p0, LP9/f;->K:LL9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] windowUpdate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LP9/f$l;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-wide v8, p2

    invoke-direct/range {v3 .. v9}, LP9/f$l;-><init>(Ljava/lang/String;ZLP9/f;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public final P0()LP9/m;
    .locals 1

    iget-object v0, p0, LP9/f;->V:LP9/m;

    return-object v0
.end method

.method public final declared-synchronized R0(I)LP9/i;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/f;->E:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP9/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final Y0()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LP9/f;->E:Ljava/util/Map;

    return-object v0
.end method

.method public final c1()J
    .locals 2

    iget-wide v0, p0, LP9/f;->Z:J

    return-wide v0
.end method

.method public close()V
    .locals 3

    sget-object v0, LP9/b;->E:LP9/b;

    sget-object v1, LP9/b;->M:LP9/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, LP9/f;->s0(LP9/b;LP9/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final d1()LP9/j;
    .locals 1

    iget-object v0, p0, LP9/f;->b0:LP9/j;

    return-object v0
.end method

.method public final declared-synchronized e1(J)Z
    .locals 6

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LP9/f;->I:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-wide v2, p0, LP9/f;->R:J

    iget-wide v4, p0, LP9/f;->Q:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, LP9/f;->T:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, p1, v2

    if-ltz p1, :cond_1

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {v0}, LP9/j;->flush()V

    return-void
.end method

.method public final l1(Ljava/util/List;Z)LP9/i;
    .locals 1

    const-string v0, "requestHeaders"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, LP9/f;->f1(ILjava/util/List;Z)LP9/i;

    move-result-object p1

    return-object p1
.end method

.method public final m1(ILX9/f;IZ)V
    .locals 9

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, LX9/d;

    invoke-direct {v6}, LX9/d;-><init>()V

    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, LX9/f;->q(J)V

    invoke-interface {p2, v6, v0, v1}, LX9/Z;->b0(LX9/d;J)J

    iget-object p2, p0, LP9/f;->L:LL9/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] onData"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v0, LP9/f$e;

    const/4 v3, 0x1

    move-object v1, v0

    move-object v4, p0

    move v5, p1

    move v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, LP9/f$e;-><init>(Ljava/lang/String;ZLP9/f;ILX9/d;IZ)V

    const-wide/16 p3, 0x0

    invoke-virtual {p2, v0, p3, p4}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public final s0(LP9/b;LP9/b;Ljava/io/IOException;)V
    .locals 3

    .prologue
    const-string v0, "connectionCode"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, LP9/f;->B1(LP9/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, LP9/f;->E:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, LP9/f;->E:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [LP9/i;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, LP9/f;->E:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    :goto_1
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    check-cast p1, [LP9/i;

    if-eqz p1, :cond_3

    array-length v1, p1

    :goto_2
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, LP9/i;->d(LP9/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    :try_start_3
    iget-object p1, p0, LP9/f;->b0:LP9/j;

    invoke-virtual {p1}, LP9/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, LP9/f;->a0:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, LP9/f;->K:LL9/d;

    invoke-virtual {p1}, LL9/d;->n()V

    iget-object p1, p0, LP9/f;->L:LL9/d;

    invoke-virtual {p1}, LL9/d;->n()V

    iget-object p1, p0, LP9/f;->M:LL9/d;

    invoke-virtual {p1}, LL9/d;->n()V

    return-void

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public final t1(ILjava/util/List;Z)V
    .locals 10

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f;->L:LL9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LP9/f$f;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    move v9, p3

    invoke-direct/range {v3 .. v9}, LP9/f$f;-><init>(Ljava/lang/String;ZLP9/f;ILjava/util/List;Z)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public final u1(ILjava/util/List;)V
    .locals 9

    .prologue
    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/f;->d0:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, LP9/b;->F:LP9/b;

    invoke-virtual {p0, p1, p2}, LP9/f;->J1(ILP9/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, LP9/f;->d0:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v0, p0, LP9/f;->L:LL9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onRequest"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LP9/f$g;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LP9/f$g;-><init>(Ljava/lang/String;ZLP9/f;ILjava/util/List;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LL9/d;->i(LL9/a;J)V

    return-void

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final v1(ILP9/b;)V
    .locals 9

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f;->L:LL9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LP9/f$h;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LP9/f$h;-><init>(Ljava/lang/String;ZLP9/f;ILP9/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public final w1(I)Z
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final x0()Z
    .locals 1

    iget-boolean v0, p0, LP9/f;->C:Z

    return v0
.end method

.method public final declared-synchronized x1(I)LP9/i;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/f;->E:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP9/i;

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final y0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP9/f;->F:Ljava/lang/String;

    return-object v0
.end method

.method public final y1()V
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, LP9/f;->R:J

    iget-wide v2, p0, LP9/f;->Q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    :try_start_1
    iput-wide v2, p0, LP9/f;->Q:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const v2, 0x3b9aca00

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LP9/f;->T:J

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v0, p0, LP9/f;->K:LL9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ping"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LP9/f$i;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3, p0}, LP9/f$i;-><init>(Ljava/lang/String;ZLP9/f;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v2, v3, v4}, LL9/d;->i(LL9/a;J)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final z0()I
    .locals 1

    iget v0, p0, LP9/f;->G:I

    return v0
.end method

.method public final z1(I)V
    .locals 0

    iput p1, p0, LP9/f;->G:I

    return-void
.end method
