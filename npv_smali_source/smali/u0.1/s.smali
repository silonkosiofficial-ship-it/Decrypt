.class public final Lu0/s;
.super Lu0/p;
.source "SourceFile"


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Ljava/util/List;

.field private final E:I

.field private final F:Lo0/n0;

.field private final G:F

.field private final H:Lo0/n0;

.field private final I:F

.field private final J:F

.field private final K:I

.field private final L:I

.field private final M:F

.field private final N:F

.field private final O:F

.field private final P:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/List;ILo0/n0;FLo0/n0;FFIIFFFF)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu0/p;-><init>(Ly7/k;)V

    iput-object p1, p0, Lu0/s;->C:Ljava/lang/String;

    iput-object p2, p0, Lu0/s;->D:Ljava/util/List;

    iput p3, p0, Lu0/s;->E:I

    iput-object p4, p0, Lu0/s;->F:Lo0/n0;

    iput p5, p0, Lu0/s;->G:F

    iput-object p6, p0, Lu0/s;->H:Lo0/n0;

    iput p7, p0, Lu0/s;->I:F

    iput p8, p0, Lu0/s;->J:F

    iput p9, p0, Lu0/s;->K:I

    iput p10, p0, Lu0/s;->L:I

    iput p11, p0, Lu0/s;->M:F

    iput p12, p0, Lu0/s;->N:F

    iput p13, p0, Lu0/s;->O:F

    iput p14, p0, Lu0/s;->P:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ILo0/n0;FLo0/n0;FFIIFFFFLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p14}, Lu0/s;-><init>(Ljava/lang/String;Ljava/util/List;ILo0/n0;FLo0/n0;FFIIFFFF)V

    return-void
.end method


# virtual methods
.method public final C()F
    .locals 1

    iget v0, p0, Lu0/s;->I:F

    return v0
.end method

.method public final D()I
    .locals 1

    iget v0, p0, Lu0/s;->K:I

    return v0
.end method

.method public final E()I
    .locals 1

    iget v0, p0, Lu0/s;->L:I

    return v0
.end method

.method public final M()F
    .locals 1

    iget v0, p0, Lu0/s;->M:F

    return v0
.end method

.method public final N()F
    .locals 1

    iget v0, p0, Lu0/s;->J:F

    return v0
.end method

.method public final O()F
    .locals 1

    iget v0, p0, Lu0/s;->O:F

    return v0
.end method

.method public final P()F
    .locals 1

    iget v0, p0, Lu0/s;->P:F

    return v0
.end method

.method public final Q()F
    .locals 1

    iget v0, p0, Lu0/s;->N:F

    return v0
.end method

.method public final d()Lo0/n0;
    .locals 1

    iget-object v0, p0, Lu0/s;->F:Lo0/n0;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lu0/s;->G:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lu0/s;

    if-eq v3, v2, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lu0/s;

    iget-object v2, p0, Lu0/s;->C:Ljava/lang/String;

    iget-object v3, p1, Lu0/s;->C:Ljava/lang/String;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lu0/s;->F:Lo0/n0;

    iget-object v3, p1, Lu0/s;->F:Lo0/n0;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget v2, p0, Lu0/s;->G:F

    iget v3, p1, Lu0/s;->G:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget-object v2, p0, Lu0/s;->H:Lo0/n0;

    iget-object v3, p1, Lu0/s;->H:Lo0/n0;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget v2, p0, Lu0/s;->I:F

    iget v3, p1, Lu0/s;->I:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Lu0/s;->J:F

    iget v3, p1, Lu0/s;->J:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Lu0/s;->K:I

    iget v3, p1, Lu0/s;->K:I

    invoke-static {v2, v3}, Lo0/g2;->e(II)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget v2, p0, Lu0/s;->L:I

    iget v3, p1, Lu0/s;->L:I

    invoke-static {v2, v3}, Lo0/h2;->e(II)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget v2, p0, Lu0/s;->M:F

    iget v3, p1, Lu0/s;->M:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Lu0/s;->N:F

    iget v3, p1, Lu0/s;->N:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Lu0/s;->O:F

    iget v3, p1, Lu0/s;->O:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Lu0/s;->P:F

    iget v3, p1, Lu0/s;->P:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Lu0/s;->E:I

    iget v3, p1, Lu0/s;->E:I

    invoke-static {v2, v3}, Lo0/S1;->d(II)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lu0/s;->D:Ljava/util/List;

    iget-object p1, p1, Lu0/s;->D:Ljava/util/List;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v1

    :cond_8
    return v0

    :cond_9
    :goto_0
    return v1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu0/s;->C:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu0/s;->D:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Lu0/s;->C:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu0/s;->D:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu0/s;->F:Lo0/n0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->G:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu0/s;->H:Lo0/n0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->I:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->J:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->K:I

    invoke-static {v1}, Lo0/g2;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->L:I

    invoke-static {v1}, Lo0/h2;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->M:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->N:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->O:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->P:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu0/s;->E:I

    invoke-static {v1}, Lo0/S1;->e(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lu0/s;->E:I

    return v0
.end method

.method public final s()Lo0/n0;
    .locals 1

    iget-object v0, p0, Lu0/s;->H:Lo0/n0;

    return-object v0
.end method
