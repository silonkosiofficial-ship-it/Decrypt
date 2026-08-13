.class public final LA/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/B;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FFFF)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LA/C;->a:F

    iput p2, p0, LA/C;->b:F

    iput p3, p0, LA/C;->c:F

    iput p4, p0, LA/C;->d:F

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_3

    cmpl-float p1, p2, v0

    if-ltz p1, :cond_2

    cmpl-float p1, p3, v0

    if-ltz p1, :cond_1

    cmpl-float p1, p4, v0

    if-ltz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bottom padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "End padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Top padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Start padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(FFFFLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LA/C;-><init>(FFFF)V

    return-void
.end method


# virtual methods
.method public a(LY0/v;)F
    .locals 1

    .prologue
    sget-object v0, LY0/v;->C:LY0/v;

    if-ne p1, v0, :cond_0

    iget p1, p0, LA/C;->a:F

    goto :goto_0

    :cond_0
    iget p1, p0, LA/C;->c:F

    :goto_0
    return p1
.end method

.method public b(LY0/v;)F
    .locals 1

    .prologue
    sget-object v0, LY0/v;->C:LY0/v;

    if-ne p1, v0, :cond_0

    iget p1, p0, LA/C;->c:F

    goto :goto_0

    :cond_0
    iget p1, p0, LA/C;->a:F

    :goto_0
    return p1
.end method

.method public c()F
    .locals 1

    iget v0, p0, LA/C;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, LA/C;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, LA/C;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, LA/C;->a:F

    check-cast p1, LA/C;

    iget v2, p1, LA/C;->a:F

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LA/C;->b:F

    iget v2, p1, LA/C;->b:F

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LA/C;->c:F

    iget v2, p1, LA/C;->c:F

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LA/C;->d:F

    iget p1, p1, LA/C;->d:F

    invoke-static {v0, p1}, LY0/i;->s(FF)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LA/C;->a:F

    invoke-static {v0}, LY0/i;->t(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LA/C;->b:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LA/C;->c:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LA/C;->d:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PaddingValues(start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA/C;->a:F

    invoke-static {v1}, LY0/i;->u(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA/C;->b:F

    invoke-static {v1}, LY0/i;->u(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA/C;->c:F

    invoke-static {v1}, LY0/i;->u(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA/C;->d:F

    invoke-static {v1}, LY0/i;->u(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
