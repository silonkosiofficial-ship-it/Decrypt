.class final Lz0/X$a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/X$a;->G0(JLx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:J

.field final synthetic I:Lz0/X$a;


# direct methods
.method constructor <init>(JLz0/X$a;Lm7/e;)V
    .locals 0

    iput-wide p1, p0, Lz0/X$a$b;->H:J

    iput-object p3, p0, Lz0/X$a$b;->I:Lz0/X$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lz0/X$a$b;->G:I

    const-wide/16 v2, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v4, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-wide v6, p0, Lz0/X$a$b;->H:J

    sub-long/2addr v6, v2

    iput v5, p0, Lz0/X$a$b;->G:I

    invoke-static {v6, v7, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iput v4, p0, Lz0/X$a$b;->G:I

    invoke-static {v2, v3, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-object p1, p0, Lz0/X$a$b;->I:Lz0/X$a;

    invoke-static {p1}, Lz0/X$a;->y(Lz0/X$a;)LW8/l;

    move-result-object p1

    if-eqz p1, :cond_5

    sget-object v0, Li7/w;->D:Li7/w$a;

    new-instance v0, Lz0/s;

    iget-wide v1, p0, Lz0/X$a$b;->H:J

    invoke-direct {v0, v1, v2}, Lz0/s;-><init>(J)V

    invoke-static {v0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_5
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz0/X$a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lz0/X$a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lz0/X$a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lz0/X$a$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, Lz0/X$a$b;

    iget-wide v0, p0, Lz0/X$a$b;->H:J

    iget-object v2, p0, Lz0/X$a$b;->I:Lz0/X$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lz0/X$a$b;-><init>(JLz0/X$a;Lm7/e;)V

    return-object p1
.end method
