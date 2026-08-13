.class final LI6/h$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/lang/Object;

.field final synthetic J:LQ6/c;


# direct methods
.method constructor <init>(Ljava/lang/Object;LQ6/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/h$b$a;->I:Ljava/lang/Object;

    iput-object p2, p0, LI6/h$b$a;->J:LQ6/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/h$b$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/h$b$a;->H:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/t;

    :try_start_1
    iget-object v1, p0, LI6/h$b$a;->I:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/d;

    invoke-virtual {p1}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object p1

    iput v2, p0, LI6/h$b$a;->G:I

    const-wide v2, 0x7fffffffffffffffL

    invoke-static {v1, p1, v2, v3, p0}, Lio/ktor/utils/io/f;->a(Lio/ktor/utils/io/d;Lio/ktor/utils/io/g;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    iget-object v0, p0, LI6/h$b$a;->J:LQ6/c;

    const-string v1, "Receive failed"

    invoke-static {v0, v1, p1}, LW8/O;->c(LW8/N;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :goto_2
    iget-object v0, p0, LI6/h$b$a;->J:LQ6/c;

    invoke-static {v0, p1}, LW8/O;->d(LW8/N;Ljava/util/concurrent/CancellationException;)V

    throw p1
.end method

.method public final H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI6/h$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LI6/h$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LI6/h$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/ktor/utils/io/t;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LI6/h$b$a;->H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LI6/h$b$a;

    iget-object v1, p0, LI6/h$b$a;->I:Ljava/lang/Object;

    iget-object v2, p0, LI6/h$b$a;->J:LQ6/c;

    invoke-direct {v0, v1, v2, p2}, LI6/h$b$a;-><init>(Ljava/lang/Object;LQ6/c;Lm7/e;)V

    iput-object p1, v0, LI6/h$b$a;->H:Ljava/lang/Object;

    return-object v0
.end method
