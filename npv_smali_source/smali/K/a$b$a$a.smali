.class final LK/a$b$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LK/a;

.field final synthetic I:LK/l0;


# direct methods
.method constructor <init>(LK/a;LK/l0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK/a$b$a$a;->H:LK/a;

    iput-object p2, p0, LK/a$b$a$a;->I:LK/l0;

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

    iget v1, p0, LK/a$b$a$a;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p1, LK/a$b$a$a$a;->D:LK/a$b$a$a$a;

    iput v3, p0, LK/a$b$a$a;->G:I

    invoke-static {p1, p0}, LV/l0;->b(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, LK/a$b$a$a;->H:LK/a;

    invoke-static {p1}, LK/a;->m(LK/a;)LZ8/x;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v1, LK/a$b$a$a$b;

    iget-object v3, p0, LK/a$b$a$a;->I:LK/l0;

    invoke-direct {v1, v3}, LK/a$b$a$a$b;-><init>(LK/l0;)V

    iput v2, p0, LK/a$b$a$a;->G:I

    invoke-interface {p1, v1, p0}, LZ8/C;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_5
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK/a$b$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK/a$b$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK/a$b$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK/a$b$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LK/a$b$a$a;

    iget-object v0, p0, LK/a$b$a$a;->H:LK/a;

    iget-object v1, p0, LK/a$b$a$a;->I:LK/l0;

    invoke-direct {p1, v0, v1, p2}, LK/a$b$a$a;-><init>(LK/a;LK/l0;Lm7/e;)V

    return-object p1
.end method
