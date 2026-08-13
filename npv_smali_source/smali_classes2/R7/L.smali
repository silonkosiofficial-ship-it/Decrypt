.class public LR7/L;
.super LR7/M;
.source "SourceFile"

# interfaces
.implements LO7/j0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR7/L$a;,
        LR7/L$b;
    }
.end annotation


# static fields
.field public static final N:LR7/L$a;


# instance fields
.field private final H:I

.field private final I:Z

.field private final J:Z

.field private final K:Z

.field private final L:LF8/E;

.field private final M:LO7/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR7/L$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR7/L$a;-><init>(Ly7/k;)V

    sput-object v0, LR7/L;->N:LR7/L$a;

    return-void
.end method

.method public constructor <init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V
    .locals 7

    .prologue
    move-object v6, p0

    const-string v0, "containingDeclaration"

    move-object v1, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object v2, p4

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object v3, p5

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outType"

    move-object v4, p6

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v5, p11

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LR7/M;-><init>(LO7/m;LP7/g;Ln8/f;LF8/E;LO7/a0;)V

    move v0, p3

    iput v0, v6, LR7/L;->H:I

    move v0, p7

    iput-boolean v0, v6, LR7/L;->I:Z

    move v0, p8

    iput-boolean v0, v6, LR7/L;->J:Z

    move/from16 v0, p9

    iput-boolean v0, v6, LR7/L;->K:Z

    move-object/from16 v0, p10

    iput-object v0, v6, LR7/L;->L:LF8/E;

    if-nez p2, :cond_0

    move-object v0, v6

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    iput-object v0, v6, LR7/L;->M:LO7/j0;

    return-void
.end method

.method public static final T0(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;Lx7/a;)LR7/L;
    .locals 13

    sget-object v0, LR7/L;->N:LR7/L$a;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-virtual/range {v0 .. v12}, LR7/L$a;->a(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;Lx7/a;)LR7/L;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public D0()Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LR7/L;->I:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LR7/L;->b()LO7/a;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/b;

    invoke-interface {v0}, LO7/b;->j()LO7/b$a;

    move-result-object v0

    invoke-virtual {v0}, LO7/b$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic J0()LO7/p;
    .locals 1

    invoke-virtual {p0}, LR7/L;->a()LO7/j0;

    move-result-object v0

    return-object v0
.end method

.method public U0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public V0(LF8/n0;)LO7/j0;
    .locals 1

    .prologue
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic a()LO7/a;
    .locals 1

    invoke-virtual {p0}, LR7/L;->a()LO7/j0;

    move-result-object v0

    return-object v0
.end method

.method public a()LO7/j0;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/L;->M:LO7/j0;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LO7/j0;->a()LO7/j0;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/L;->a()LO7/j0;

    move-result-object v0

    return-object v0
.end method

.method public b()LO7/a;
    .locals 2

    invoke-super {p0}, LR7/k;->b()LO7/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/a;

    return-object v0
.end method

.method public bridge synthetic b()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/L;->b()LO7/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/L;->V0(LF8/n0;)LO7/j0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d0()Lt8/g;
    .locals 1

    invoke-virtual {p0}, LR7/L;->U0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lt8/g;

    return-object v0
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, LR7/L;->K:Z

    return v0
.end method

.method public f()Ljava/util/Collection;
    .locals 4

    .prologue
    invoke-virtual {p0}, LR7/L;->b()LO7/a;

    move-result-object v0

    invoke-interface {v0}, LO7/a;->f()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getOverriddenDescriptors(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/a;

    invoke-interface {v2}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, LR7/L;->getIndex()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public g0(LO7/a;Ln8/f;I)LO7/j0;
    .locals 13

    const-string v0, "newOwner"

    move-object v2, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newName"

    move-object v6, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR7/L;

    invoke-virtual {p0}, LP7/b;->k()LP7/g;

    move-result-object v5

    const-string v1, "<get-annotations>(...)"

    invoke-static {v5, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/M;->getType()LF8/E;

    move-result-object v7

    const-string v1, "getType(...)"

    invoke-static {v7, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/L;->D0()Z

    move-result v8

    invoke-virtual {p0}, LR7/L;->j0()Z

    move-result v9

    invoke-virtual {p0}, LR7/L;->e0()Z

    move-result v10

    invoke-virtual {p0}, LR7/L;->u0()LF8/E;

    move-result-object v11

    sget-object v12, LO7/a0;->a:LO7/a0;

    const-string v1, "NO_SOURCE"

    invoke-static {v12, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    move-object v1, v0

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, LR7/L;->H:I

    return v0
.end method

.method public h()LO7/u;
    .locals 2

    sget-object v0, LO7/t;->f:LO7/u;

    const-string v1, "LOCAL"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j0()Z
    .locals 1

    iget-boolean v0, p0, LR7/L;->J:Z

    return v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LO7/o;->b(LO7/j0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public u0()LF8/E;
    .locals 1

    iget-object v0, p0, LR7/L;->L:LF8/E;

    return-object v0
.end method
