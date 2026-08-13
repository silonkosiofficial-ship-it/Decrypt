.class public final LD/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/w;
.implements LD0/M;


# instance fields
.field private final C:LD/q;

.field private final D:LD0/j0;

.field private final E:LD/s;

.field private final F:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LD/q;LD0/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/x;->C:LD/q;

    iput-object p2, p0, LD/x;->D:LD0/j0;

    invoke-virtual {p1}, LD/q;->d()Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/s;

    iput-object p1, p0, LD/x;->E:LD/s;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LD/x;->F:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0}, LD0/o;->A0()Z

    move-result v0

    return v0
.end method

.method public B0(F)F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1}, LY0/e;->B0(F)F

    move-result p1

    return p1
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1, p2}, LY0/e;->K0(J)I

    move-result p1

    return p1
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1}, LY0/n;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
    .locals 6

    iget-object v0, p0, LD/x;->D:LD0/j0;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, LD0/M;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1, p2}, LY0/e;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1}, LY0/e;->S0(F)I

    move-result p1

    return p1
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1, p2}, LY0/n;->X(J)F

    move-result p1

    return p1
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1, p2}, LY0/e;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f0(IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1, p2, p3, p4}, LD0/M;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1, p2}, LY0/e;->g1(J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1}, LY0/e;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1}, LY0/e;->o0(I)F

    move-result p1

    return p1
.end method

.method public p0(IJ)Ljava/util/List;
    .locals 5

    .prologue
    iget-object v0, p0, LD/x;->F:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LD/x;->E:LD/s;

    invoke-interface {v0, p1}, LD/s;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LD/x;->E:LD/s;

    invoke-interface {v1, p1}, LD/s;->e(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LD/x;->C:LD/q;

    invoke-virtual {v2, p1, v0, v1}, LD/q;->b(ILjava/lang/Object;Ljava/lang/Object;)Lx7/p;

    move-result-object v1

    iget-object v2, p0, LD/x;->D:LD0/j0;

    invoke-interface {v2, v0, v1}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/G;

    invoke-interface {v4, p2, p3}, LD0/G;->U(J)LD0/X;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, LD/x;->F:Ljava/util/HashMap;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v2

    :goto_1
    return-object v0
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0, p1}, LY0/e;->q0(F)F

    move-result p1

    return p1
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, LD/x;->D:LD0/j0;

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method
