.class final LF6/b$a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF6/b$a;->e(LF6/b;LO6/e;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LF6/b;

.field final synthetic I:LO6/e;


# direct methods
.method constructor <init>(LF6/b;LO6/e;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LF6/b$a$b;->H:LF6/b;

    iput-object p2, p0, LF6/b$a$b;->I:LO6/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF6/b$a$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LF6/b$a$b;->H:LF6/b;

    invoke-static {p1}, LF6/b$a;->c(LF6/b;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, LF6/b$a$b;->H:LF6/b;

    iget-object v1, p0, LF6/b$a$b;->I:LO6/e;

    iput v2, p0, LF6/b$a$b;->G:I

    invoke-interface {p1, v1, p0}, LF6/b;->W0(LO6/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1

    :cond_3
    new-instance p1, LF6/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v2, v0}, LF6/a;-><init>(Ljava/lang/Throwable;ILy7/k;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF6/b$a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LF6/b$a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LF6/b$a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LF6/b$a$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LF6/b$a$b;

    iget-object v0, p0, LF6/b$a$b;->H:LF6/b;

    iget-object v1, p0, LF6/b$a$b;->I:LO6/e;

    invoke-direct {p1, v0, v1, p2}, LF6/b$a$b;-><init>(LF6/b;LO6/e;Lm7/e;)V

    return-object p1
.end method
