.class final Lh2/z$l;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;->E(LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field final synthetic K:Lh2/z;


# direct methods
.method constructor <init>(Lh2/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$l;->K:Lh2/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/z$l;->J:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh2/z$l;->I:Ljava/lang/Object;

    check-cast v1, Lh2/z;

    iget-object v3, p0, Lh2/z$l;->H:Ljava/lang/Object;

    check-cast v3, Lf9/a;

    iget-object v5, p0, Lh2/z$l;->G:Ljava/lang/Object;

    check-cast v5, Lh2/B$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lh2/z$l;->K:Lh2/z;

    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v5

    invoke-static {v5}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p1

    iput-object v5, p0, Lh2/z$l;->G:Ljava/lang/Object;

    iput-object p1, p0, Lh2/z$l;->H:Ljava/lang/Object;

    iput-object v1, p0, Lh2/z$l;->I:Ljava/lang/Object;

    iput v3, p0, Lh2/z$l;->J:I

    invoke-interface {p1, v4, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, p1

    :goto_0
    :try_start_0
    invoke-static {v5}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    invoke-virtual {p1}, Lh2/B;->f()LZ8/f;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object v3, Lh2/t;->D:Lh2/t;

    iput-object v4, p0, Lh2/z$l;->G:Ljava/lang/Object;

    iput-object v4, p0, Lh2/z$l;->H:Ljava/lang/Object;

    iput-object v4, p0, Lh2/z$l;->I:Ljava/lang/Object;

    iput v2, p0, Lh2/z$l;->J:I

    invoke-static {v1, p1, v3, p0}, Lh2/z;->a(Lh2/z;LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v3, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/z$l;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/z$l;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/z$l;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/z$l;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, Lh2/z$l;

    iget-object v0, p0, Lh2/z$l;->K:Lh2/z;

    invoke-direct {p1, v0, p2}, Lh2/z$l;-><init>(Lh2/z;Lm7/e;)V

    return-object p1
.end method
