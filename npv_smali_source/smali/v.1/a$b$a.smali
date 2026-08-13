.class final Lv/a$b$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lv/a;


# direct methods
.method constructor <init>(Lv/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lv/a$b$a;->G:Lv/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lv/a$b$a;->E:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lv/a$b$a;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lv/a$b$a;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/a$b$a;->F:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lz0/c;

    iput-object v1, p0, Lv/a$b$a;->F:Ljava/lang/Object;

    iput v4, p0, Lv/a$b$a;->E:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v5, v1

    move-object v8, p0

    invoke-static/range {v5 .. v10}, Lx/D;->e(Lz0/c;ZLz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lz0/B;

    iget-object v5, p0, Lv/a$b$a;->G:Lv/a;

    invoke-virtual {p1}, Lz0/B;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Lz0/A;->a(J)Lz0/A;

    move-result-object v6

    invoke-static {v5, v6}, Lv/a;->f(Lv/a;Lz0/A;)V

    iget-object v5, p0, Lv/a$b$a;->G:Lv/a;

    invoke-virtual {p1}, Lz0/B;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-static {v5, p1}, Lv/a;->g(Lv/a;Ln0/g;)V

    :cond_4
    iput-object v1, p0, Lv/a$b$a;->F:Ljava/lang/Object;

    iput v2, p0, Lv/a$b$a;->E:I

    invoke-static {v1, v3, p0, v4, v3}, Lz0/b;->a(Lz0/c;Lz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Lz0/p;

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p1

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    :goto_2
    if-ge v8, v6, :cond_7

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lz0/B;

    invoke-virtual {v10}, Lz0/B;->i()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lv/a$b$a;->G:Lv/a;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    :goto_3
    if-ge v7, v6, :cond_9

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lz0/B;

    invoke-virtual {v9}, Lz0/B;->f()J

    move-result-wide v9

    invoke-static {p1}, Lv/a;->e(Lv/a;)Lz0/A;

    move-result-object v11

    invoke-static {v9, v10, v11}, Lz0/A;->c(JLjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_9
    move-object v8, v3

    :goto_4
    check-cast v8, Lz0/B;

    if-nez v8, :cond_a

    invoke-static {v5}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lz0/B;

    :cond_a
    if-eqz v8, :cond_b

    iget-object p1, p0, Lv/a$b$a;->G:Lv/a;

    invoke-virtual {v8}, Lz0/B;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Lz0/A;->a(J)Lz0/A;

    move-result-object v6

    invoke-static {p1, v6}, Lv/a;->f(Lv/a;Lz0/A;)V

    iget-object p1, p0, Lv/a$b$a;->G:Lv/a;

    invoke-virtual {v8}, Lz0/B;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ln0/g;->d(J)Ln0/g;

    move-result-object v6

    invoke-static {p1, v6}, Lv/a;->g(Lv/a;Ln0/g;)V

    :cond_b
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v4

    if-nez p1, :cond_4

    iget-object p1, p0, Lv/a$b$a;->G:Lv/a;

    invoke-static {p1, v3}, Lv/a;->f(Lv/a;Lz0/A;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv/a$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lv/a$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lv/a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lv/a$b$a;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lv/a$b$a;

    iget-object v1, p0, Lv/a$b$a;->G:Lv/a;

    invoke-direct {v0, v1, p2}, Lv/a$b$a;-><init>(Lv/a;Lm7/e;)V

    iput-object p1, v0, Lv/a$b$a;->F:Ljava/lang/Object;

    return-object v0
.end method
