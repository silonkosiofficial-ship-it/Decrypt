.class final La9/l$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/l$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:[LZ8/f;

.field final synthetic I:I

.field final synthetic J:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic K:LY8/j;


# direct methods
.method constructor <init>([LZ8/f;ILjava/util/concurrent/atomic/AtomicInteger;LY8/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, La9/l$a$a;->H:[LZ8/f;

    iput p2, p0, La9/l$a$a;->I:I

    iput-object p3, p0, La9/l$a$a;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, La9/l$a$a;->K:LY8/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La9/l$a$a;->G:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, La9/l$a$a;->H:[LZ8/f;

    iget v1, p0, La9/l$a$a;->I:I

    aget-object p1, p1, v1

    new-instance v4, La9/l$a$a$a;

    iget-object v5, p0, La9/l$a$a;->K:LY8/j;

    invoke-direct {v4, v5, v1}, La9/l$a$a$a;-><init>(LY8/j;I)V

    iput v3, p0, La9/l$a$a;->G:I

    invoke-interface {p1, v4, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, La9/l$a$a;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, La9/l$a$a;->K:LY8/j;

    invoke-static {p1, v2, v3, v2}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    iget-object v0, p0, La9/l$a$a;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, La9/l$a$a;->K:LY8/j;

    invoke-static {v0, v2, v3, v2}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_4
    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, La9/l$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, La9/l$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, La9/l$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, La9/l$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, La9/l$a$a;

    iget-object v1, p0, La9/l$a$a;->H:[LZ8/f;

    iget v2, p0, La9/l$a$a;->I:I

    iget-object v3, p0, La9/l$a$a;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, La9/l$a$a;->K:LY8/j;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La9/l$a$a;-><init>([LZ8/f;ILjava/util/concurrent/atomic/AtomicInteger;LY8/j;Lm7/e;)V

    return-object p1
.end method
