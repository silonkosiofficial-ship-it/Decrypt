.class public final Lu/W$a;
.super Lu/V;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lu/F;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lu/V;-><init>(Ljava/lang/Object;Lu/F;Ly7/k;)V

    iput p3, p0, Lu/W$a;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lu/F;IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lu/u;->a:Lu/u$a;

    invoke-virtual {p3}, Lu/u$a;->a()I

    move-result p3

    :cond_1
    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lu/W$a;-><init>(Ljava/lang/Object;Lu/F;ILy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lu/F;ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu/W$a;-><init>(Ljava/lang/Object;Lu/F;I)V

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lu/W$a;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu/W$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lu/W$a;

    invoke-virtual {p1}, Lu/V;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lu/V;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lu/V;->a()Lu/F;

    move-result-object v1

    invoke-virtual {p0}, Lu/V;->a()Lu/F;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget p1, p1, Lu/W$a;->c:I

    iget v1, p0, Lu/W$a;->c:I

    invoke-static {p1, v1}, Lu/u;->c(II)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    invoke-virtual {p0}, Lu/V;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu/W$a;->c:I

    invoke-static {v1}, Lu/u;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lu/V;->a()Lu/F;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
