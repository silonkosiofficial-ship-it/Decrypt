.class final LS/y$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y;-><init>(LS/c;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LS/y;


# direct methods
.method constructor <init>(LS/y;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/y$a;->I:LS/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/y$a;->G:I

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

    iget-object p1, p0, LS/y$a;->H:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lz0/K;

    new-instance v5, LS/y$a$a;

    iget-object p1, p0, LS/y$a;->I:LS/y;

    invoke-direct {v5, p1}, LS/y$a$a;-><init>(LS/y;)V

    new-instance v7, LS/y$a$b;

    iget-object p1, p0, LS/y$a;->I:LS/y;

    invoke-direct {v7, p1}, LS/y$a$b;-><init>(LS/y;)V

    iput v2, p0, LS/y$a;->G:I

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x5

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lx/l;->f(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS/y$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/y$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/y$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/K;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/y$a;->H(Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LS/y$a;

    iget-object v1, p0, LS/y$a;->I:LS/y;

    invoke-direct {v0, v1, p2}, LS/y$a;-><init>(LS/y;Lm7/e;)V

    iput-object p1, v0, LS/y$a;->H:Ljava/lang/Object;

    return-object v0
.end method
