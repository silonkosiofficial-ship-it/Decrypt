.class public final Lu0/n;
.super Lu0/p;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:F

.field private final E:F

.field private final F:F

.field private final G:F

.field private final H:F

.field private final I:F

.field private final J:F

.field private final K:Ljava/util/List;

.field private final L:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu0/p;-><init>(Ly7/k;)V

    iput-object p1, p0, Lu0/n;->C:Ljava/lang/String;

    iput p2, p0, Lu0/n;->D:F

    iput p3, p0, Lu0/n;->E:F

    iput p4, p0, Lu0/n;->F:F

    iput p5, p0, Lu0/n;->G:F

    iput p6, p0, Lu0/n;->H:F

    iput p7, p0, Lu0/n;->I:F

    iput p8, p0, Lu0/n;->J:F

    iput-object p9, p0, Lu0/n;->K:Ljava/util/List;

    iput-object p10, p0, Lu0/n;->L:Ljava/util/List;

    return-void
.end method

.method public static final synthetic d(Lu0/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lu0/n;->L:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final C()F
    .locals 1

    iget v0, p0, Lu0/n;->D:F

    return v0
.end method

.method public final D()F
    .locals 1

    iget v0, p0, Lu0/n;->G:F

    return v0
.end method

.method public final E()F
    .locals 1

    iget v0, p0, Lu0/n;->H:F

    return v0
.end method

.method public final M()I
    .locals 1

    iget-object v0, p0, Lu0/n;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final N()F
    .locals 1

    iget v0, p0, Lu0/n;->I:F

    return v0
.end method

.method public final O()F
    .locals 1

    iget v0, p0, Lu0/n;->J:F

    return v0
.end method

.method public final e(I)Lu0/p;
    .locals 1

    iget-object v0, p0, Lu0/n;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu0/p;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    instance-of v2, p1, Lu0/n;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lu0/n;->C:Ljava/lang/String;

    check-cast p1, Lu0/n;

    iget-object v3, p1, Lu0/n;->C:Ljava/lang/String;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lu0/n;->D:F

    iget v3, p1, Lu0/n;->D:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Lu0/n;->E:F

    iget v3, p1, Lu0/n;->E:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Lu0/n;->F:F

    iget v3, p1, Lu0/n;->F:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Lu0/n;->G:F

    iget v3, p1, Lu0/n;->G:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Lu0/n;->H:F

    iget v3, p1, Lu0/n;->H:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Lu0/n;->I:F

    iget v3, p1, Lu0/n;->I:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Lu0/n;->J:F

    iget v3, p1, Lu0/n;->J:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget-object v2, p0, Lu0/n;->K:Ljava/util/List;

    iget-object v3, p1, Lu0/n;->K:Ljava/util/List;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lu0/n;->L:Ljava/util/List;

    iget-object p1, p1, Lu0/n;->L:Ljava/util/List;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu0/n;->K:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu0/n;->C:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lu0/n;->C:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->D:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->E:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->F:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->G:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->H:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->I:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/n;->J:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu0/n;->K:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu0/n;->L:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lu0/n$a;

    invoke-direct {v0, p0}, Lu0/n$a;-><init>(Lu0/n;)V

    return-object v0
.end method

.method public final o()F
    .locals 1

    iget v0, p0, Lu0/n;->E:F

    return v0
.end method

.method public final s()F
    .locals 1

    iget v0, p0, Lu0/n;->F:F

    return v0
.end method
