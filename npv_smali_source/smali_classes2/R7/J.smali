.class public final LR7/J;
.super LR7/p;
.source "SourceFile"

# interfaces
.implements LR7/I;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR7/J$a;
    }
.end annotation


# static fields
.field public static final k0:LR7/J$a;

.field static final synthetic l0:[LF7/k;


# instance fields
.field private final g0:LE8/n;

.field private final h0:LO7/e0;

.field private final i0:LE8/j;

.field private j0:LO7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LR7/J;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "withDispatchReceiver"

    const-string v3, "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LR7/J;->l0:[LF7/k;

    new-instance v0, LR7/J$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR7/J$a;-><init>(Ly7/k;)V

    sput-object v0, LR7/J;->k0:LR7/J$a;

    return-void
.end method

.method private constructor <init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;)V
    .locals 7

    sget-object v4, Ln8/h;->i:Ln8/f;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, LR7/p;-><init>(LO7/m;LO7/y;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)V

    iput-object p1, p0, LR7/J;->g0:LE8/n;

    iput-object p2, p0, LR7/J;->h0:LO7/e0;

    invoke-virtual {p0}, LR7/J;->x1()LO7/e0;

    move-result-object p2

    invoke-interface {p2}, LO7/C;->N0()Z

    move-result p2

    invoke-virtual {p0, p2}, LR7/p;->e1(Z)V

    new-instance p2, LR7/J$b;

    invoke-direct {p2, p0, p3}, LR7/J$b;-><init>(LR7/J;LO7/d;)V

    invoke-interface {p1, p2}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object p1

    iput-object p1, p0, LR7/J;->i0:LE8/j;

    iput-object p3, p0, LR7/J;->j0:LO7/d;

    return-void
.end method

.method public synthetic constructor <init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LR7/J;-><init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;)V

    return-void
.end method


# virtual methods
.method public G()Z
    .locals 1

    invoke-virtual {p0}, LR7/J;->y0()LO7/d;

    move-result-object v0

    invoke-interface {v0}, LO7/l;->G()Z

    move-result v0

    return v0
.end method

.method public H()LO7/e;
    .locals 2

    invoke-virtual {p0}, LR7/J;->y0()LO7/d;

    move-result-object v0

    invoke-interface {v0}, LO7/l;->H()LO7/e;

    move-result-object v0

    const-string v1, "getConstructedClass(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic J0()LO7/p;
    .locals 1

    invoke-virtual {p0}, LR7/J;->w1()LR7/I;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LR7/J;->u1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/J;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a()LO7/a;
    .locals 1

    invoke-virtual {p0}, LR7/J;->w1()LR7/I;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/b;
    .locals 1

    invoke-virtual {p0}, LR7/J;->w1()LR7/I;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/J;->w1()LR7/I;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/y;
    .locals 1

    invoke-virtual {p0}, LR7/J;->w1()LR7/I;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LO7/i;
    .locals 1

    invoke-virtual {p0}, LR7/J;->v1()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/J;->v1()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/l;
    .locals 0

    invoke-virtual {p0, p1}, LR7/J;->y1(LF8/n0;)LR7/I;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/J;->y1(LF8/n0;)LR7/I;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LF8/n0;)LO7/y;
    .locals 0

    invoke-virtual {p0, p1}, LR7/J;->y1(LF8/n0;)LR7/I;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LR7/J;->t1(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LR7/I;

    move-result-object p1

    return-object p1
.end method

.method public l()LF8/E;
    .locals 1

    invoke-super {p0}, LR7/p;->l()LF8/E;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final p0()LE8/n;
    .locals 1

    iget-object v0, p0, LR7/J;->g0:LE8/n;

    return-object v0
.end method

.method public t1(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LR7/I;
    .locals 1

    const-string v0, "newOwner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modality"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/p;->z()LO7/y$a;

    move-result-object v0

    invoke-interface {v0, p1}, LO7/y$a;->o(LO7/m;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p2}, LO7/y$a;->x(LO7/D;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p3}, LO7/y$a;->r(LO7/u;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p4}, LO7/y$a;->l(LO7/b$a;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p5}, LO7/y$a;->v(Z)LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LR7/I;

    return-object p1
.end method

.method protected u1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/J;
    .locals 8

    .prologue
    const-string p2, "newOwner"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "annotations"

    invoke-static {p5, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {p6, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LO7/b$a;->C:LO7/b$a;

    if-eq p3, v6, :cond_0

    sget-object p1, LO7/b$a;->F:LO7/b$a;

    :cond_0
    new-instance p1, LR7/J;

    iget-object v1, p0, LR7/J;->g0:LE8/n;

    invoke-virtual {p0}, LR7/J;->x1()LO7/e0;

    move-result-object v2

    invoke-virtual {p0}, LR7/J;->y0()LO7/d;

    move-result-object v3

    move-object v0, p1

    move-object v4, p0

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LR7/J;-><init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;)V

    return-object p1
.end method

.method public v1()LO7/e0;
    .locals 1

    invoke-virtual {p0}, LR7/J;->x1()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public w1()LR7/I;
    .locals 2

    invoke-super {p0}, LR7/p;->a()LO7/y;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LR7/I;

    return-object v0
.end method

.method public x1()LO7/e0;
    .locals 1

    iget-object v0, p0, LR7/J;->h0:LO7/e0;

    return-object v0
.end method

.method public y0()LO7/d;
    .locals 1

    iget-object v0, p0, LR7/J;->j0:LO7/d;

    return-object v0
.end method

.method public y1(LF8/n0;)LR7/I;
    .locals 2

    .prologue
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LR7/p;->c(LF8/n0;)LO7/y;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LR7/J;

    invoke-virtual {p1}, LR7/J;->l()LF8/E;

    move-result-object v0

    invoke-static {v0}, LF8/n0;->f(LF8/E;)LF8/n0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/J;->y0()LO7/d;

    move-result-object v1

    invoke-interface {v1}, LO7/d;->a()LO7/d;

    move-result-object v1

    invoke-interface {v1, v0}, LO7/d;->c(LF8/n0;)LO7/d;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iput-object v0, p1, LR7/J;->j0:LO7/d;

    return-object p1
.end method
