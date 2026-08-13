.class public final Lu/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/I;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu/l0;->a:F

    iput p2, p0, Lu/l0;->b:F

    iput-object p3, p0, Lu/l0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(FFLjava/lang/Object;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const p2, 0x44bb8000    # 1500.0f

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lu/l0;-><init>(FFLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu/x0;)Lu/B0;
    .locals 0

    invoke-virtual {p0, p1}, Lu/l0;->i(Lu/x0;)Lu/O0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lu/x0;)Lu/H0;
    .locals 0

    invoke-virtual {p0, p1}, Lu/l0;->i(Lu/x0;)Lu/O0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, Lu/l0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lu/l0;

    iget v0, p1, Lu/l0;->a:F

    iget v2, p0, Lu/l0;->a:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p1, Lu/l0;->b:F

    iget v2, p0, Lu/l0;->b:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p1, Lu/l0;->c:Ljava/lang/Object;

    iget-object v0, p0, Lu/l0;->c:Ljava/lang/Object;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lu/l0;->a:F

    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lu/l0;->b:F

    return v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/l0;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Lu/l0;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu/l0;->a:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu/l0;->b:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(Lu/x0;)Lu/O0;
    .locals 4

    new-instance v0, Lu/O0;

    iget v1, p0, Lu/l0;->a:F

    iget v2, p0, Lu/l0;->b:F

    iget-object v3, p0, Lu/l0;->c:Ljava/lang/Object;

    invoke-static {p1, v3}, Lu/k;->a(Lu/x0;Ljava/lang/Object;)Lu/r;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lu/O0;-><init>(FFLu/r;)V

    return-object v0
.end method
