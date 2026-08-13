.class final LC6/c$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC6/c;-><init>(LF6/b;LC6/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LC6/c;


# direct methods
.method constructor <init>(LC6/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LC6/c$b;->I:LC6/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LC6/c$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LC6/c$b;->H:Ljava/lang/Object;

    check-cast v0, La7/e;

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

    iget-object p1, p0, LC6/c$b;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    :try_start_1
    iput-object p1, p0, LC6/c$b;->H:Ljava/lang/Object;

    iput v2, p0, LC6/c$b;->G:I

    invoke-virtual {p1, p0}, La7/e;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    :try_start_2
    check-cast p1, LQ6/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    :goto_1
    iget-object v1, p0, LC6/c$b;->I:LC6/c;

    invoke-virtual {v1}, LC6/c;->s()LS6/b;

    move-result-object v1

    invoke-static {}, LR6/a;->d()LS6/a;

    move-result-object v2

    new-instance v3, LR6/e;

    invoke-virtual {v0}, La7/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD6/b;

    invoke-virtual {v0}, LD6/b;->e()LQ6/c;

    move-result-object v0

    invoke-direct {v3, v0, p1}, LR6/e;-><init>(LQ6/c;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2, v3}, LS6/b;->a(LS6/a;Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p2, LC6/c$b;

    iget-object v0, p0, LC6/c$b;->I:LC6/c;

    invoke-direct {p2, v0, p3}, LC6/c$b;-><init>(LC6/c;Lm7/e;)V

    iput-object p1, p2, LC6/c$b;->H:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {p2, p1}, LC6/c$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p2, LQ6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LC6/c$b;->H(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
