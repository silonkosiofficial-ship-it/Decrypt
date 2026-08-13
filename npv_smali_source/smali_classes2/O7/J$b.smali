.class public final LO7/J$b;
.super LR7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final K:Z

.field private final L:Ljava/util/List;

.field private final M:LF8/k;


# direct methods
.method public constructor <init>(LE8/n;LO7/m;Ln8/f;ZI)V
    .locals 7

    .prologue
    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LO7/a0;->a:LO7/a0;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, LR7/g;-><init>(LE8/n;LO7/m;Ln8/f;LO7/a0;Z)V

    iput-boolean p4, p0, LO7/J$b;->K:Z

    const/4 p2, 0x0

    invoke-static {p2, p5}, LE7/j;->q(II)LE7/i;

    move-result-object p2

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    move-object p4, p2

    check-cast p4, Lj7/O;

    invoke-virtual {p4}, Lj7/O;->b()I

    move-result v5

    sget-object p4, LP7/g;->d:LP7/g$a;

    invoke-virtual {p4}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    sget-object v3, LF8/u0;->G:LF8/u0;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p5, 0x54

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v4

    const/4 v2, 0x0

    move-object v0, p0

    move-object v6, p1

    invoke-static/range {v0 .. v6}, LR7/K;->a1(LO7/m;LP7/g;ZLF8/u0;Ln8/f;ILE8/n;)LO7/f0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object p3, p0, LO7/J$b;->L:Ljava/util/List;

    new-instance p2, LF8/k;

    invoke-static {p0}, LO7/g0;->d(LO7/i;)Ljava/util/List;

    move-result-object p3

    invoke-static {p0}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object p4

    invoke-interface {p4}, LO7/G;->t()LL7/g;

    move-result-object p4

    invoke-virtual {p4}, LL7/g;->i()LF8/M;

    move-result-object p4

    invoke-static {p4}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p4

    check-cast p4, Ljava/util/Collection;

    invoke-direct {p2, p0, p3, p4, p1}, LF8/k;-><init>(LO7/e;Ljava/util/List;Ljava/util/Collection;LE8/n;)V

    iput-object p2, p0, LO7/J$b;->M:LF8/k;

    return-void
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LO7/J$b;->L:Ljava/util/List;

    return-object v0
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public E()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I0()LO7/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public O()Ljava/util/Collection;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public P()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic Q(LG8/g;)Ly8/h;
    .locals 0

    invoke-virtual {p0, p1}, LO7/J$b;->V0(LG8/g;)Ly8/h$b;

    move-result-object p1

    return-object p1
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, LO7/J$b;->K:Z

    return v0
.end method

.method public T0()Ly8/h$b;
    .locals 1

    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    return-object v0
.end method

.method public U0()LF8/k;
    .locals 1

    iget-object v0, p0, LO7/J$b;->M:LF8/k;

    return-object v0
.end method

.method protected V0(LG8/g;)Ly8/h$b;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ly8/h$b;->b:Ly8/h$b;

    return-object p1
.end method

.method public X()LO7/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic Y()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LO7/J$b;->T0()Ly8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public a0()LO7/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()LO7/u;
    .locals 2

    sget-object v0, LO7/t;->e:LO7/u;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()LO7/f;
    .locals 1

    sget-object v0, LO7/f;->D:LO7/f;

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic p()LF8/e0;
    .locals 1

    invoke-virtual {p0}, LO7/J$b;->U0()LF8/k;

    move-result-object v0

    return-object v0
.end method

.method public q()LO7/D;
    .locals 1

    sget-object v0, LO7/D;->D:LO7/D;

    return-object v0
.end method

.method public r()Ljava/util/Collection;
    .locals 1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/a;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (not found)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
