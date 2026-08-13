.class public final LE0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF0/o0;

.field private final b:LX/b;

.field private final c:LX/b;

.field private final d:LX/b;

.field private final e:LX/b;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/o0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/f;->a:LF0/o0;

    new-instance p1, LX/b;

    const/16 v0, 0x10

    new-array v1, v0, [LF0/c;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LE0/f;->b:LX/b;

    new-instance p1, LX/b;

    new-array v1, v0, [LE0/c;

    invoke-direct {p1, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LE0/f;->c:LX/b;

    new-instance p1, LX/b;

    new-array v1, v0, [LF0/J;

    invoke-direct {p1, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LE0/f;->d:LX/b;

    new-instance p1, LX/b;

    new-array v0, v0, [LE0/c;

    invoke-direct {p1, v0, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LE0/f;->e:LX/b;

    return-void
.end method

.method private final c(Landroidx/compose/ui/d$c;LE0/c;Ljava/util/Set;)V
    .locals 12

    .prologue
    const/16 v0, 0x20

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "visitSubtreeIf called on an unattached node"

    invoke-static {v1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v1, LX/b;

    const/16 v2, 0x10

    new-array v3, v2, [Landroidx/compose/ui/d$c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p1

    :cond_1
    invoke-static {v1, p1}, LF0/k;->a(LX/b;Landroidx/compose/ui/d$c;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v3}, LX/b;->d(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, LX/b;->x()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v1}, LX/b;->t()I

    move-result p1

    const/4 v3, 0x1

    sub-int/2addr p1, v3

    invoke-virtual {v1, p1}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/d$c;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_1

    move-object v5, p1

    :goto_1
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_b

    const/4 v6, 0x0

    move-object v7, v5

    move-object v8, v6

    :goto_2
    if-eqz v7, :cond_b

    instance-of v9, v7, LE0/i;

    if-eqz v9, :cond_4

    check-cast v7, LE0/i;

    instance-of v9, v7, LF0/c;

    if-eqz v9, :cond_3

    move-object v9, v7

    check-cast v9, LF0/c;

    invoke-virtual {v9}, LF0/c;->T1()Landroidx/compose/ui/d$b;

    move-result-object v10

    instance-of v10, v10, LE0/d;

    if-eqz v10, :cond_3

    invoke-virtual {v9}, LF0/c;->U1()Ljava/util/HashSet;

    move-result-object v9

    invoke-virtual {v9, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {p3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-interface {v7}, LE0/i;->s0()LE0/g;

    move-result-object v7

    invoke-virtual {v7, p2}, LE0/g;->a(LE0/c;)Z

    move-result v7

    xor-int/2addr v7, v3

    if-nez v7, :cond_a

    goto :goto_0

    :cond_4
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_a

    instance-of v9, v7, LF0/m;

    if-eqz v9, :cond_a

    move-object v9, v7

    check-cast v9, LF0/m;

    invoke-virtual {v9}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v9

    move v10, v4

    :goto_3
    if-eqz v9, :cond_9

    invoke-virtual {v9}, Landroidx/compose/ui/d$c;->v1()I

    move-result v11

    and-int/2addr v11, v0

    if-eqz v11, :cond_8

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v3, :cond_5

    move-object v7, v9

    goto :goto_4

    :cond_5
    if-nez v8, :cond_6

    new-instance v8, LX/b;

    new-array v11, v2, [Landroidx/compose/ui/d$c;

    invoke-direct {v8, v11, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_6
    if-eqz v7, :cond_7

    invoke-virtual {v8, v7}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v7, v6

    :cond_7
    invoke-virtual {v8, v9}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_8
    :goto_4
    invoke-virtual {v9}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v9

    goto :goto_3

    :cond_9
    if-ne v10, v3, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {v8}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_b
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto/16 :goto_1

    :cond_c
    return-void
.end method


# virtual methods
.method public final a(LF0/c;LE0/c;)V
    .locals 1

    iget-object v0, p0, LE0/f;->b:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    iget-object p1, p0, LE0/f;->c:LX/b;

    invoke-virtual {p1, p2}, LX/b;->d(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LE0/f;->b()V

    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LE0/f;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/f;->f:Z

    iget-object v0, p0, LE0/f;->a:LF0/o0;

    new-instance v1, LE0/f$a;

    invoke-direct {v1, p0}, LE0/f$a;-><init>(LE0/f;)V

    invoke-interface {v0, v1}, LF0/o0;->x(Lx7/a;)V

    :cond_0
    return-void
.end method

.method public final d(LF0/c;LE0/c;)V
    .locals 1

    iget-object v0, p0, LE0/f;->d:LX/b;

    invoke-static {p1}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p1

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    iget-object p1, p0, LE0/f;->e:LX/b;

    invoke-virtual {p1, p2}, LX/b;->d(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LE0/f;->b()V

    return-void
.end method

.method public final e()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/f;->f:Z

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, LE0/f;->d:LX/b;

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    if-lez v3, :cond_2

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    move v4, v0

    :cond_0
    aget-object v5, v2, v4

    check-cast v5, LF0/J;

    iget-object v6, p0, LE0/f;->e:LX/b;

    invoke-virtual {v6}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v6

    aget-object v6, v6, v4

    check-cast v6, LE0/c;

    invoke-virtual {v5}, LF0/J;->k0()LF0/b0;

    move-result-object v7

    invoke-virtual {v7}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v5}, LF0/J;->k0()LF0/b0;

    move-result-object v5

    invoke-virtual {v5}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v5

    invoke-direct {p0, v5, v6, v1}, LE0/f;->c(Landroidx/compose/ui/d$c;LE0/c;Ljava/util/Set;)V

    :cond_1
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v3, :cond_0

    :cond_2
    iget-object v2, p0, LE0/f;->d:LX/b;

    invoke-virtual {v2}, LX/b;->j()V

    iget-object v2, p0, LE0/f;->e:LX/b;

    invoke-virtual {v2}, LX/b;->j()V

    iget-object v2, p0, LE0/f;->b:LX/b;

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    if-lez v3, :cond_5

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    :cond_3
    aget-object v4, v2, v0

    check-cast v4, LF0/c;

    iget-object v5, p0, LE0/f;->c:LX/b;

    invoke-virtual {v5}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v0

    check-cast v5, LE0/c;

    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-direct {p0, v4, v5, v1}, LE0/f;->c(Landroidx/compose/ui/d$c;LE0/c;Ljava/util/Set;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    if-lt v0, v3, :cond_3

    :cond_5
    iget-object v0, p0, LE0/f;->b:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    iget-object v0, p0, LE0/f;->c:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF0/c;

    invoke-virtual {v1}, LF0/c;->Z1()V

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final f(LF0/c;LE0/c;)V
    .locals 1

    iget-object v0, p0, LE0/f;->b:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    iget-object p1, p0, LE0/f;->c:LX/b;

    invoke-virtual {p1, p2}, LX/b;->d(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LE0/f;->b()V

    return-void
.end method
