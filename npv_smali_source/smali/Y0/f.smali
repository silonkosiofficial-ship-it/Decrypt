.class final LY0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/e;


# instance fields
.field private final C:F

.field private final D:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LY0/f;->C:F

    iput p2, p0, LY0/f;->D:F

    return-void
.end method


# virtual methods
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LY0/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LY0/f;

    iget v1, p0, LY0/f;->C:F

    iget v3, p1, LY0/f;->C:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LY0/f;->D:F

    iget p1, p1, LY0/f;->D:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public synthetic g1(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->f(LY0/e;J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget v0, p0, LY0/f;->C:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LY0/f;->C:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY0/f;->D:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DensityImpl(density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY0/f;->C:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY0/f;->D:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v0()F
    .locals 1

    iget v0, p0, LY0/f;->D:F

    return v0
.end method
