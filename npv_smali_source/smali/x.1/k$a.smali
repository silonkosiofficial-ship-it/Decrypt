.class final Lx/k$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/k;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lx/k;

.field final synthetic I:Lv/L;

.field final synthetic J:Lx7/p;


# direct methods
.method constructor <init>(Lx/k;Lv/L;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/k$a;->H:Lx/k;

    iput-object p2, p0, Lx/k$a;->I:Lv/L;

    iput-object p3, p0, Lx/k$a;->J:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/k$a;->G:I

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

    iget-object p1, p0, Lx/k$a;->H:Lx/k;

    invoke-static {p1}, Lx/k;->f(Lx/k;)Lv/N;

    move-result-object p1

    iget-object v1, p0, Lx/k$a;->H:Lx/k;

    invoke-static {v1}, Lx/k;->g(Lx/k;)Lx/w;

    move-result-object v1

    iget-object v3, p0, Lx/k$a;->I:Lv/L;

    new-instance v4, Lx/k$a$a;

    iget-object v5, p0, Lx/k$a;->H:Lx/k;

    iget-object v6, p0, Lx/k$a;->J:Lx7/p;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lx/k$a$a;-><init>(Lx/k;Lx7/p;Lm7/e;)V

    iput v2, p0, Lx/k$a;->G:I

    invoke-virtual {p1, v1, v3, v4, p0}, Lv/N;->e(Ljava/lang/Object;Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/k$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/k$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/k$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/k$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, Lx/k$a;

    iget-object v0, p0, Lx/k$a;->H:Lx/k;

    iget-object v1, p0, Lx/k$a;->I:Lv/L;

    iget-object v2, p0, Lx/k$a;->J:Lx7/p;

    invoke-direct {p1, v0, v1, v2, p2}, Lx/k$a;-><init>(Lx/k;Lv/L;Lx7/p;Lm7/e;)V

    return-object p1
.end method
