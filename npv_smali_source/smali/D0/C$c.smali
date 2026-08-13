.class final LD0/C$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private C:LY0/v;

.field private D:F

.field private E:F

.field final synthetic F:LD0/C;


# direct methods
.method public constructor <init>(LD0/C;)V
    .locals 0

    iput-object p1, p0, LD0/C$c;->F:LD0/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LY0/v;->D:LY0/v;

    iput-object p1, p0, LD0/C$c;->C:LY0/v;

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 2

    .prologue
    iget-object v0, p0, LD0/C$c;->F:LD0/C;

    invoke-static {v0}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    sget-object v1, LF0/J$e;->F:LF0/J$e;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LD0/C$c;->F:LD0/C;

    invoke-static {v0}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    sget-object v1, LF0/J$e;->D:LF0/J$e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public synthetic B0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->g(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public synthetic K0(J)I
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->a(LY0/e;J)I

    move-result p1

    return p1
.end method

.method public synthetic O(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/m;->b(LY0/n;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
    .locals 9

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
    new-instance v0, LD0/C$c$a;

    iget-object v7, p0, LD0/C$c;->F:LD0/C;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p0

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, LD0/C$c$a;-><init>(IILjava/util/Map;Lx7/l;LD0/C$c;LD0/C;Lx7/l;)V

    return-object v0
.end method

.method public synthetic P(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->e(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic S0(F)I
    .locals 0

    invoke-static {p0, p1}, LY0/d;->b(LY0/e;F)I

    move-result p1

    return p1
.end method

.method public synthetic X(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/m;->a(LY0/n;J)F

    move-result p1

    return p1
.end method

.method public synthetic b1(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->h(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD0/C$c;->F:LD0/C;

    invoke-virtual {v0, p1, p2}, LD0/C;->K(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f(F)V
    .locals 0

    iput p1, p0, LD0/C$c;->D:F

    return-void
.end method

.method public synthetic f0(IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LD0/L;->a(LD0/M;IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public synthetic g1(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->f(LY0/e;J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget v0, p0, LD0/C$c;->D:F

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LD0/C$c;->C:LY0/v;

    return-object v0
.end method

.method public k(F)V
    .locals 0

    iput p1, p0, LD0/C$c;->E:F

    return-void
.end method

.method public synthetic k0(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/d;->i(LY0/e;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic o0(I)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->d(LY0/e;I)F

    move-result p1

    return p1
.end method

.method public synthetic q0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->c(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public s(LY0/v;)V
    .locals 0

    iput-object p1, p0, LD0/C$c;->C:LY0/v;

    return-void
.end method

.method public v0()F
    .locals 1

    iget v0, p0, LD0/C$c;->E:F

    return v0
.end method
