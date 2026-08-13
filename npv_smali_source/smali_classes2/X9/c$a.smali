.class final LX9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LX9/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LX9/c$a;LX9/c;JZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LX9/c$a;->f(LX9/c;JZ)V

    return-void
.end method

.method public static final synthetic b(LX9/c$a;LX9/c;)V
    .locals 0

    invoke-direct {p0, p1}, LX9/c$a;->g(LX9/c;)V

    return-void
.end method

.method private final f(LX9/c;JZ)V
    .locals 4

    .prologue
    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LX9/c;

    invoke-direct {v0}, LX9/c;-><init>()V

    invoke-static {v0}, LX9/c;->r(LX9/c;)V

    new-instance v0, LX9/c$b;

    invoke-direct {v0}, LX9/c$b;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, p2, v2

    if-eqz v2, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p1}, LX9/a0;->c()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    :goto_0
    add-long/2addr p2, v0

    :goto_1
    invoke-static {p1, p2, p3}, LX9/c;->u(LX9/c;J)V

    goto :goto_2

    :cond_1
    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p4, :cond_6

    invoke-virtual {p1}, LX9/a0;->c()J

    move-result-wide p2

    goto :goto_1

    :goto_2
    invoke-static {p1, v0, v1}, LX9/c;->q(LX9/c;J)J

    move-result-wide p2

    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object p4

    :goto_3
    invoke-static {p4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p4}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {p4}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v2, v0, v1}, LX9/c;->q(LX9/c;J)J

    move-result-wide v2

    cmp-long v2, p2, v2

    if-gez v2, :cond_3

    goto :goto_4

    :cond_3
    invoke-static {p4}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object p4

    goto :goto_3

    :cond_4
    :goto_4
    invoke-static {p4}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object p2

    invoke-static {p1, p2}, LX9/c;->s(LX9/c;LX9/c;)V

    invoke-static {p4, p1}, LX9/c;->s(LX9/c;LX9/c;)V

    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object p1

    if-ne p4, p1, :cond_5

    invoke-virtual {p0}, LX9/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signal()V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method private final g(LX9/c;)V
    .locals 2

    .prologue
    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v1

    if-ne v1, p1, :cond_0

    invoke-static {p1}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v1

    invoke-static {v0, v1}, LX9/c;->s(LX9/c;LX9/c;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, LX9/c;->s(LX9/c;LX9/c;)V

    return-void

    :cond_0
    invoke-static {v0}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "node was not found in the queue"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c()LX9/c;
    .locals 7

    .prologue
    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    if-nez v0, :cond_1

    invoke-virtual {p0}, LX9/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    invoke-static {}, LX9/c;->l()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v4, v5, v6}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    invoke-static {}, LX9/c;->m()J

    move-result-wide v2

    cmp-long v0, v4, v2

    if-ltz v0, :cond_0

    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object v1

    :cond_0
    return-object v1

    :cond_1
    invoke-static {v0, v2, v3}, LX9/c;->q(LX9/c;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_2

    invoke-virtual {p0}, LX9/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    return-object v1

    :cond_2
    invoke-static {}, LX9/c;->k()LX9/c;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LX9/c;->o(LX9/c;)LX9/c;

    move-result-object v3

    invoke-static {v2, v3}, LX9/c;->s(LX9/c;LX9/c;)V

    invoke-static {v0, v1}, LX9/c;->s(LX9/c;LX9/c;)V

    const/4 v1, 0x2

    invoke-static {v0, v1}, LX9/c;->t(LX9/c;I)V

    return-object v0
.end method

.method public final d()Ljava/util/concurrent/locks/Condition;
    .locals 1

    invoke-static {}, LX9/c;->j()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    invoke-static {}, LX9/c;->n()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    return-object v0
.end method
