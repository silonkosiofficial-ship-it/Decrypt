.class public abstract LY8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LY8/p;

.field public static final b:I

.field private static final c:I

.field public static final d:Lb9/D;

.field private static final e:Lb9/D;

.field private static final f:Lb9/D;

.field private static final g:Lb9/D;

.field private static final h:Lb9/D;

.field private static final i:Lb9/D;

.field private static final j:Lb9/D;

.field private static final k:Lb9/D;

.field private static final l:Lb9/D;

.field private static final m:Lb9/D;

.field private static final n:Lb9/D;

.field private static final o:Lb9/D;

.field private static final p:Lb9/D;

.field private static final q:Lb9/D;

.field private static final r:Lb9/D;

.field private static final s:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, LY8/p;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LY8/p;-><init>(JLY8/p;LY8/h;I)V

    sput-object v6, LY8/i;->a:LY8/p;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const-string v7, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb9/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LY8/i;->b:I

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb9/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LY8/i;->c:I

    new-instance v0, Lb9/D;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->d:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->e:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->f:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->g:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->h:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->i:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->j:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->k:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->l:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->m:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->n:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->o:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->p:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->q:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->r:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LY8/i;->s:Lb9/D;

    return-void
.end method

.method private static final A(I)J
    .locals 2

    .prologue
    if-eqz p0, :cond_1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    int-to-long v0, p0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method private static final B(LW8/l;Ljava/lang/Object;Lx7/q;)Z
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2}, LW8/l;->s(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LW8/l;->J(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic C(LW8/l;Ljava/lang/Object;Lx7/q;ILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LY8/i;->B(LW8/l;Ljava/lang/Object;Lx7/q;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a(JZ)J
    .locals 0

    invoke-static {p0, p1, p2}, LY8/i;->v(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(JI)J
    .locals 0

    invoke-static {p0, p1, p2}, LY8/i;->w(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(JLY8/p;)LY8/p;
    .locals 0

    invoke-static {p0, p1, p2}, LY8/i;->x(JLY8/p;)LY8/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->q:Lb9/D;

    return-object v0
.end method

.method public static final synthetic e()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->r:Lb9/D;

    return-object v0
.end method

.method public static final synthetic f()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->i:Lb9/D;

    return-object v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, LY8/i;->c:I

    return v0
.end method

.method public static final synthetic h()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->o:Lb9/D;

    return-object v0
.end method

.method public static final synthetic i()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->k:Lb9/D;

    return-object v0
.end method

.method public static final synthetic j()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->j:Lb9/D;

    return-object v0
.end method

.method public static final synthetic k()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->e:Lb9/D;

    return-object v0
.end method

.method public static final synthetic l()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->s:Lb9/D;

    return-object v0
.end method

.method public static final synthetic m()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->p:Lb9/D;

    return-object v0
.end method

.method public static final synthetic n()LY8/p;
    .locals 1

    sget-object v0, LY8/i;->a:LY8/p;

    return-object v0
.end method

.method public static final synthetic o()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->h:Lb9/D;

    return-object v0
.end method

.method public static final synthetic p()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->g:Lb9/D;

    return-object v0
.end method

.method public static final synthetic q()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->f:Lb9/D;

    return-object v0
.end method

.method public static final synthetic r()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->m:Lb9/D;

    return-object v0
.end method

.method public static final synthetic s()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->n:Lb9/D;

    return-object v0
.end method

.method public static final synthetic t(I)J
    .locals 2

    invoke-static {p0}, LY8/i;->A(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic u(LW8/l;Ljava/lang/Object;Lx7/q;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LY8/i;->B(LW8/l;Ljava/lang/Object;Lx7/q;)Z

    move-result p0

    return p0
.end method

.method private static final v(JZ)J
    .locals 2

    .prologue
    if-eqz p2, :cond_0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final w(JI)J
    .locals 2

    int-to-long v0, p2

    const/16 p2, 0x3c

    shl-long/2addr v0, p2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final x(JLY8/p;)LY8/p;
    .locals 7

    new-instance v6, LY8/p;

    invoke-virtual {p2}, LY8/p;->y()LY8/h;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, LY8/p;-><init>(JLY8/p;LY8/h;I)V

    return-object v6
.end method

.method public static final y()LF7/f;
    .locals 1

    sget-object v0, LY8/i$a;->L:LY8/i$a;

    return-object v0
.end method

.method public static final z()Lb9/D;
    .locals 1

    sget-object v0, LY8/i;->l:Lb9/D;

    return-object v0
.end method
