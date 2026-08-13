.class public final LD8/l;
.super LR7/d;
.source "SourceFile"

# interfaces
.implements LD8/g;


# instance fields
.field private final M:Li8/r;

.field private final N:Lk8/c;

.field private final O:Lk8/g;

.field private final P:Lk8/h;

.field private final Q:LD8/f;

.field private R:LF8/M;

.field private S:LF8/M;

.field private T:Ljava/util/List;

.field private U:LF8/M;


# direct methods
.method public constructor <init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/u;Li8/r;Lk8/c;Lk8/g;Lk8/h;LD8/f;)V
    .locals 12

    move-object v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const-string v0, "storageManager"

    move-object v1, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    move-object v2, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object v3, p3

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LO7/a0;->a:LO7/a0;

    const-string v0, "NO_SOURCE"

    invoke-static {v5, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, LR7/d;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/a0;LO7/u;)V

    iput-object v8, v7, LD8/l;->M:Li8/r;

    iput-object v9, v7, LD8/l;->N:Lk8/c;

    iput-object v10, v7, LD8/l;->O:Lk8/g;

    iput-object v11, v7, LD8/l;->P:Lk8/h;

    move-object/from16 v0, p10

    iput-object v0, v7, LD8/l;->Q:LD8/f;

    return-void
.end method


# virtual methods
.method protected V0()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, LD8/l;->T:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "typeConstructorParameters"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public X0()Li8/r;
    .locals 1

    iget-object v0, p0, LD8/l;->M:Li8/r;

    return-object v0
.end method

.method public Y0()Lk8/h;
    .locals 1

    iget-object v0, p0, LD8/l;->P:Lk8/h;

    return-object v0
.end method

.method public Z()Lk8/g;
    .locals 1

    iget-object v0, p0, LD8/l;->O:Lk8/g;

    return-object v0
.end method

.method public final Z0(Ljava/util/List;LF8/M;LF8/M;)V
    .locals 1

    const-string v0, "declaredTypeParameters"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "underlyingType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LR7/d;->W0(Ljava/util/List;)V

    iput-object p2, p0, LD8/l;->R:LF8/M;

    iput-object p3, p0, LD8/l;->S:LF8/M;

    invoke-static {p0}, LO7/g0;->d(LO7/i;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LD8/l;->T:Ljava/util/List;

    invoke-virtual {p0}, LR7/d;->O0()LF8/M;

    move-result-object p1

    iput-object p1, p0, LD8/l;->U:LF8/M;

    return-void
.end method

.method public a1(LF8/n0;)LO7/e0;
    .locals 12

    .prologue
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LD8/l;

    invoke-virtual {p0}, LR7/d;->p0()LE8/n;

    move-result-object v2

    invoke-virtual {p0}, LR7/k;->b()LO7/m;

    move-result-object v3

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LP7/b;->k()LP7/g;

    move-result-object v4

    const-string v1, "<get-annotations>(...)"

    invoke-static {v4, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/j;->getName()Ln8/f;

    move-result-object v5

    const-string v1, "getName(...)"

    invoke-static {v5, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/d;->h()LO7/u;

    move-result-object v6

    invoke-virtual {p0}, LD8/l;->X0()Li8/r;

    move-result-object v7

    invoke-virtual {p0}, LD8/l;->h0()Lk8/c;

    move-result-object v8

    invoke-virtual {p0}, LD8/l;->Z()Lk8/g;

    move-result-object v9

    invoke-virtual {p0}, LD8/l;->Y0()Lk8/h;

    move-result-object v10

    invoke-virtual {p0}, LD8/l;->k0()LD8/f;

    move-result-object v11

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, LD8/l;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/u;Li8/r;Lk8/c;Lk8/g;Lk8/h;LD8/f;)V

    invoke-virtual {p0}, LR7/d;->A()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, LD8/l;->o0()LF8/M;

    move-result-object v2

    sget-object v3, LF8/u0;->G:LF8/u0;

    invoke-virtual {p1, v2, v3}, LF8/n0;->n(LF8/E;LF8/u0;)LF8/E;

    move-result-object v2

    const-string v4, "safeSubstitute(...)"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object v2

    invoke-virtual {p0}, LD8/l;->c0()LF8/M;

    move-result-object v5

    invoke-virtual {p1, v5, v3}, LF8/n0;->n(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    invoke-static {p1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, LD8/l;->Z0(Ljava/util/List;LF8/M;LF8/M;)V

    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LD8/l;->a1(LF8/n0;)LO7/e0;

    move-result-object p1

    return-object p1
.end method

.method public c0()LF8/M;
    .locals 1

    .prologue
    iget-object v0, p0, LD8/l;->S:LF8/M;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "expandedType"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public h0()Lk8/c;
    .locals 1

    iget-object v0, p0, LD8/l;->N:Lk8/c;

    return-object v0
.end method

.method public k0()LD8/f;
    .locals 1

    iget-object v0, p0, LD8/l;->Q:LD8/f;

    return-object v0
.end method

.method public o0()LF8/M;
    .locals 1

    .prologue
    iget-object v0, p0, LD8/l;->R:LF8/M;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "underlyingType"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public v()LO7/e;
    .locals 3

    .prologue
    invoke-virtual {p0}, LD8/l;->c0()LF8/M;

    move-result-object v0

    invoke-static {v0}, LF8/G;->a(LF8/E;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LD8/l;->c0()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v2, v0, LO7/e;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, LO7/e;

    :cond_1
    :goto_0
    return-object v1
.end method

.method public w()LF8/M;
    .locals 1

    .prologue
    iget-object v0, p0, LD8/l;->U:LF8/M;

    if-nez v0, :cond_0

    const-string v0, "defaultTypeImpl"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
