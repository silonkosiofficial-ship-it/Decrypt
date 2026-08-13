.class public final LD0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/M;
.implements LD0/o;


# instance fields
.field private final C:LY0/v;

.field private final synthetic D:LD0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LD0/o;LY0/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LD0/r;->C:LY0/v;

    iput-object p1, p0, LD0/r;->D:LD0/o;

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0}, LD0/o;->A0()Z

    move-result v0

    return v0
.end method

.method public B0(F)F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1}, LY0/e;->B0(F)F

    move-result p1

    return p1
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1, p2}, LY0/e;->K0(J)I

    move-result p1

    return p1
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1}, LY0/n;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
    .locals 2

    .prologue
    const/4 p5, 0x0

    invoke-static {p1, p5}, LE7/j;->d(II)I

    move-result p1

    invoke-static {p2, p5}, LE7/j;->d(II)I

    move-result p2

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 p5, 0x1

    :cond_0
    if-nez p5, :cond_1

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Size("

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " x "

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance p5, LD0/r$a;

    invoke-direct {p5, p1, p2, p3, p4}, LD0/r$a;-><init>(IILjava/util/Map;Lx7/l;)V

    return-object p5
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1, p2}, LY0/e;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1}, LY0/e;->S0(F)I

    move-result p1

    return p1
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1, p2}, LY0/n;->X(J)F

    move-result p1

    return p1
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1, p2}, LY0/e;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic f0(IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LD0/L;->a(LD0/M;IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1, p2}, LY0/e;->g1(J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LD0/r;->C:LY0/v;

    return-object v0
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1}, LY0/e;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1}, LY0/e;->o0(I)F

    move-result p1

    return p1
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0, p1}, LY0/e;->q0(F)F

    move-result p1

    return p1
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, LD0/r;->D:LD0/o;

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method
