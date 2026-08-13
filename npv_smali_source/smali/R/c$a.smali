.class final LR/c$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/c;->Y1(Lz/n$b;JF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LR/h;

.field final synthetic I:LR/c;

.field final synthetic J:Lz/n$b;


# direct methods
.method constructor <init>(LR/h;LR/c;Lz/n$b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LR/c$a;->H:LR/h;

    iput-object p2, p0, LR/c$a;->I:LR/c;

    iput-object p3, p0, LR/c$a;->J:Lz/n$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LR/c$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

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
    iget-object p1, p0, LR/c$a;->H:LR/h;

    iput v2, p0, LR/c$a;->G:I

    invoke-virtual {p1, p0}, LR/h;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LR/c$a;->I:LR/c;

    invoke-static {p1}, LR/c;->h2(LR/c;)Lr/K;

    move-result-object p1

    iget-object v0, p0, LR/c$a;->J:Lz/n$b;

    invoke-virtual {p1, v0}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LR/c$a;->I:LR/c;

    invoke-static {p1}, LF0/t;->a(LF0/s;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    iget-object v0, p0, LR/c$a;->I:LR/c;

    invoke-static {v0}, LR/c;->h2(LR/c;)Lr/K;

    move-result-object v0

    iget-object v1, p0, LR/c$a;->J:Lz/n$b;

    invoke-virtual {v0, v1}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LR/c$a;->I:LR/c;

    invoke-static {v0}, LF0/t;->a(LF0/s;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LR/c$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LR/c$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LR/c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LR/c$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LR/c$a;

    iget-object v0, p0, LR/c$a;->H:LR/h;

    iget-object v1, p0, LR/c$a;->I:LR/c;

    iget-object v2, p0, LR/c$a;->J:Lz/n$b;

    invoke-direct {p1, v0, v1, v2, p2}, LR/c$a;-><init>(LR/h;LR/c;Lz/n$b;Lm7/e;)V

    return-object p1
.end method
