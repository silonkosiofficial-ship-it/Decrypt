.class final LS/y$a$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y$a$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS/y;


# direct methods
.method constructor <init>(LS/y;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/y$a$a$a;->H:LS/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/y$a$a$a;->G:I

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

    iget-object p1, p0, LS/y$a$a$a;->H:LS/y;

    invoke-static {p1}, LS/y;->Z1(LS/y;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LS/y$a$a$a;->H:LS/y;

    invoke-static {p1}, LS/y;->e2(LS/y;)LS/c;

    move-result-object p1

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->b()I

    move-result v1

    invoke-virtual {p1, v1}, LS/c;->f(I)V

    :cond_2
    iget-object p1, p0, LS/y$a$a$a;->H:LS/y;

    invoke-static {p1}, LS/y;->e2(LS/y;)LS/c;

    move-result-object p1

    iput v2, p0, LS/y$a$a$a;->G:I

    invoke-virtual {p1, p0}, LS/c;->A(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS/y$a$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/y$a$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/y$a$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/y$a$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, LS/y$a$a$a;

    iget-object v0, p0, LS/y$a$a$a;->H:LS/y;

    invoke-direct {p1, v0, p2}, LS/y$a$a$a;-><init>(LS/y;Lm7/e;)V

    return-object p1
.end method
