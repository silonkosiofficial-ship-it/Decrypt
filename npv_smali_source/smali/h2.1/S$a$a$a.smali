.class final Lh2/S$a$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/S$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LY8/j;

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(LY8/j;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/S$a$a$a;->H:LY8/j;

    iput-object p2, p0, Lh2/S$a$a$a;->I:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/S$a$a$a;->G:I

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
    new-instance p1, Lh2/S$a$a$a$a;

    iget-object v1, p0, Lh2/S$a$a$a;->H:LY8/j;

    iget-object v4, p0, Lh2/S$a$a$a;->I:Lx7/p;

    invoke-direct {p1, v1, v4, v2}, Lh2/S$a$a$a$a;-><init>(LY8/j;Lx7/p;Lm7/e;)V

    iput v3, p0, Lh2/S$a$a$a;->G:I

    invoke-static {p1, p0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lh2/S$a$a$a;->H:LY8/j;

    invoke-static {p1, v2, v3, v2}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Lh2/S$a$a$a;->H:LY8/j;

    invoke-interface {v0, p1}, LY8/C;->c(Ljava/lang/Throwable;)Z

    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/S$a$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/S$a$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/S$a$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/S$a$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, Lh2/S$a$a$a;

    iget-object v0, p0, Lh2/S$a$a$a;->H:LY8/j;

    iget-object v1, p0, Lh2/S$a$a$a;->I:Lx7/p;

    invoke-direct {p1, v0, v1, p2}, Lh2/S$a$a$a;-><init>(LY8/j;Lx7/p;Lm7/e;)V

    return-object p1
.end method
