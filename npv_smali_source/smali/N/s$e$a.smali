.class final LN/s$e$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/s$e;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:LN/h;

.field final synthetic H:LN/d;

.field final synthetic I:LH/F;


# direct methods
.method constructor <init>(LN/h;LN/d;LH/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LN/s$e$a;->G:LN/h;

    iput-object p2, p0, LN/s$e$a;->H:LN/d;

    iput-object p3, p0, LN/s$e$a;->I:LH/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/s$e$a;->E:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    iget-object v1, p0, LN/s$e$a;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LN/s$e$a;->F:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lz0/c;

    iput-object v1, p0, LN/s$e$a;->F:Ljava/lang/Object;

    iput v4, p0, LN/s$e$a;->E:I

    invoke-static {v1, p0}, LN/s;->a(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Lz0/p;

    invoke-static {p1}, LN/s;->g(Lz0/p;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    invoke-virtual {p1}, Lz0/p;->b()I

    move-result v5

    invoke-static {v5}, Lz0/u;->b(I)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_6

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lz0/B;

    invoke-virtual {v9}, Lz0/B;->p()Z

    move-result v9

    xor-int/2addr v9, v4

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    iget-object v2, p0, LN/s$e$a;->G:LN/h;

    iget-object v4, p0, LN/s$e$a;->H:LN/d;

    iput-object v6, p0, LN/s$e$a;->F:Ljava/lang/Object;

    iput v3, p0, LN/s$e$a;->E:I

    invoke-static {v1, v2, v4, p1, p0}, LN/s;->c(Lz0/c;LN/h;LN/d;Lz0/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_7
    :goto_3
    invoke-static {p1}, LN/s;->g(Lz0/p;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, p0, LN/s$e$a;->I:LH/F;

    iput-object v6, p0, LN/s$e$a;->F:Ljava/lang/Object;

    iput v2, p0, LN/s$e$a;->E:I

    invoke-static {v1, v3, p1, p0}, LN/s;->d(Lz0/c;LH/F;Lz0/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/s$e$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LN/s$e$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LN/s$e$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LN/s$e$a;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LN/s$e$a;

    iget-object v1, p0, LN/s$e$a;->G:LN/h;

    iget-object v2, p0, LN/s$e$a;->H:LN/d;

    iget-object v3, p0, LN/s$e$a;->I:LH/F;

    invoke-direct {v0, v1, v2, v3, p2}, LN/s$e$a;-><init>(LN/h;LN/d;LH/F;Lm7/e;)V

    iput-object p1, v0, LN/s$e$a;->F:Ljava/lang/Object;

    return-object v0
.end method
