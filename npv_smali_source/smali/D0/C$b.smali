.class final LD0/C$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/j0;
.implements LD0/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final synthetic C:LD0/C$c;

.field final synthetic D:LD0/C;


# direct methods
.method public constructor <init>(LD0/C;)V
    .locals 0

    iput-object p1, p0, LD0/C$b;->D:LD0/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD0/C;->l(LD0/C;)LD0/C$c;

    move-result-object p1

    iput-object p1, p0, LD0/C$b;->C:LD0/C$c;

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0}, LD0/C$c;->A0()Z

    move-result v0

    return v0
.end method

.method public B0(F)F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1}, LD0/C$c;->B0(F)F

    move-result p1

    return p1
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1, p2}, LD0/C$c;->K0(J)I

    move-result p1

    return p1
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1}, LD0/C$c;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
    .locals 6

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LD0/C$c;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1, p2}, LD0/C$c;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1}, LD0/C$c;->S0(F)I

    move-result p1

    return p1
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1, p2}, LD0/C$c;->X(J)F

    move-result p1

    return p1
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1, p2}, LD0/C$c;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, LD0/C$b;->D:LD0/C;

    invoke-static {v0}, LD0/C;->m(LD0/C;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->G()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, LD0/C$b;->D:LD0/C;

    invoke-static {v0, p1, p2}, LD0/C;->o(LD0/C;Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f0(IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1, p2, p3, p4}, LD0/C$c;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1, p2}, LD0/C$c;->g1(J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0}, LD0/C$c;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0}, LD0/C$c;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1}, LD0/C$c;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1}, LD0/C$c;->o0(I)F

    move-result p1

    return p1
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0, p1}, LD0/C$c;->q0(F)F

    move-result p1

    return p1
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, LD0/C$b;->C:LD0/C$c;

    invoke-virtual {v0}, LD0/C$c;->v0()F

    move-result v0

    return v0
.end method
