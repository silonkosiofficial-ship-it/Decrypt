.class final Lh2/z$j;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;-><init>(Ljava/lang/Object;Lh2/L;Lh2/E;LZ8/f;Lh2/Q;Lh2/M;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field private synthetic J:Ljava/lang/Object;

.field final synthetic K:Lh2/z;


# direct methods
.method constructor <init>(Lh2/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$j;->K:Lh2/z;

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

    iget v1, p0, Lh2/z$j;->I:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh2/z$j;->H:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    iget-object v2, p0, Lh2/z$j;->G:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v5, p0, Lh2/z$j;->J:Ljava/lang/Object;

    check-cast v5, Lh2/B$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$j;->J:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LZ8/g;

    iget-object p1, p0, Lh2/z$j;->K:Lh2/z;

    invoke-static {p1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v5

    invoke-static {v5}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p1

    iput-object v5, p0, Lh2/z$j;->J:Ljava/lang/Object;

    iput-object p1, p0, Lh2/z$j;->G:Ljava/lang/Object;

    iput-object v1, p0, Lh2/z$j;->H:Ljava/lang/Object;

    iput v2, p0, Lh2/z$j;->I:I

    invoke-interface {p1, v4, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    move-object v2, p1

    :goto_0
    :try_start_0
    invoke-static {v5}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p1

    invoke-virtual {p1}, Lh2/w;->d()Lh2/s;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    new-instance v2, Lh2/x$c;

    invoke-direct {v2, p1, v4, v3, v4}, Lh2/x$c;-><init>(Lh2/s;Lh2/s;ILy7/k;)V

    iput-object v4, p0, Lh2/z$j;->J:Ljava/lang/Object;

    iput-object v4, p0, Lh2/z$j;->G:Ljava/lang/Object;

    iput-object v4, p0, Lh2/z$j;->H:Ljava/lang/Object;

    iput v3, p0, Lh2/z$j;->I:I

    invoke-interface {v1, v2, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/z$j;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/z$j;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/z$j;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/z$j;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lh2/z$j;

    iget-object v1, p0, Lh2/z$j;->K:Lh2/z;

    invoke-direct {v0, v1, p2}, Lh2/z$j;-><init>(Lh2/z;Lm7/e;)V

    iput-object p1, v0, Lh2/z$j;->J:Ljava/lang/Object;

    return-object v0
.end method
