.class final LZ8/M$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/M;->a(LZ8/N;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:I

.field final synthetic J:LZ8/M;


# direct methods
.method constructor <init>(LZ8/M;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LZ8/M$a;->J:LZ8/M;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LZ8/M$a;->G:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    iget-object v1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LZ8/g;

    iget p1, p0, LZ8/M$a;->I:I

    if-lez p1, :cond_6

    sget-object p1, LZ8/G;->C:LZ8/G;

    iput v6, p0, LZ8/M$a;->G:I

    invoke-interface {v1, p1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_6
    iget-object p1, p0, LZ8/M$a;->J:LZ8/M;

    invoke-static {p1}, LZ8/M;->c(LZ8/M;)J

    move-result-wide v6

    iput-object v1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    iput v5, p0, LZ8/M$a;->G:I

    invoke-static {v6, v7, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    iget-object p1, p0, LZ8/M$a;->J:LZ8/M;

    invoke-static {p1}, LZ8/M;->b(LZ8/M;)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long p1, v5, v7

    if-lez p1, :cond_9

    sget-object p1, LZ8/G;->D:LZ8/G;

    iput-object v1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    iput v4, p0, LZ8/M$a;->G:I

    invoke-interface {v1, p1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    iget-object p1, p0, LZ8/M$a;->J:LZ8/M;

    invoke-static {p1}, LZ8/M;->b(LZ8/M;)J

    move-result-wide v4

    iput-object v1, p0, LZ8/M$a;->H:Ljava/lang/Object;

    iput v3, p0, LZ8/M$a;->G:I

    invoke-static {v4, v5, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_3
    sget-object p1, LZ8/G;->E:LZ8/G;

    const/4 v3, 0x0

    iput-object v3, p0, LZ8/M$a;->H:Ljava/lang/Object;

    iput v2, p0, LZ8/M$a;->G:I

    invoke-interface {v1, p1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/g;ILm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LZ8/M$a;

    iget-object v1, p0, LZ8/M$a;->J:LZ8/M;

    invoke-direct {v0, v1, p3}, LZ8/M$a;-><init>(LZ8/M;Lm7/e;)V

    iput-object p1, v0, LZ8/M$a;->H:Ljava/lang/Object;

    iput p2, v0, LZ8/M$a;->I:I

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LZ8/M$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LZ8/M$a;->H(LZ8/g;ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
