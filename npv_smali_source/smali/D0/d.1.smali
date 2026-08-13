.class public final LD0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/o;
.implements LD0/M;


# instance fields
.field private final C:LF0/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/F;LD0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/d;->C:LF0/F;

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public B0(F)F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1}, LF0/T;->B0(F)F

    move-result p1

    return p1
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1, p2}, LF0/T;->K0(J)I

    move-result p1

    return p1
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1}, LF0/T;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
    .locals 8

    .prologue
    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Size("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance v0, LD0/d$a;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, LD0/d$a;-><init>(IILjava/util/Map;Lx7/l;Lx7/l;LD0/d;)V

    return-object v0
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1, p2}, LF0/T;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1}, LF0/T;->S0(F)I

    move-result p1

    return p1
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1, p2}, LF0/T;->X(J)F

    move-result p1

    return p1
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1, p2}, LF0/T;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f()LD0/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f0(IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1, p2, p3, p4}, LF0/T;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1, p2}, LF0/T;->g1(J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0}, LF0/d0;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0}, LF0/d0;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public final k()LF0/F;
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    return-object v0
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1}, LF0/T;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1}, LF0/T;->o0(I)F

    move-result p1

    return p1
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0, p1}, LF0/T;->q0(F)F

    move-result p1

    return p1
.end method

.method public s()J
    .locals 2

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0}, LF0/F;->j2()LF0/U;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/U;->q1()LD0/K;

    move-result-object v0

    invoke-interface {v0}, LD0/K;->getWidth()I

    move-result v1

    invoke-interface {v0}, LD0/K;->getHeight()I

    move-result v0

    invoke-static {v1, v0}, LY0/u;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final t(LD0/c;)V
    .locals 0

    return-void
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, LD0/d;->C:LF0/F;

    invoke-virtual {v0}, LF0/d0;->v0()F

    move-result v0

    return v0
.end method
