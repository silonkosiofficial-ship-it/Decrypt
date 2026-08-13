.class public final Li1/e;
.super Li1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/e$a;
    }
.end annotation


# static fields
.field public static final L:Li1/e$a;

.field public static final M:I


# instance fields
.field private K:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/e$a;-><init>(Ly7/k;)V

    sput-object v0, Li1/e;->L:Li1/e$a;

    const/16 v0, 0x8

    sput v0, Li1/e;->M:I

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [C

    invoke-direct {p0, v0}, Li1/e;-><init>([C)V

    iput p1, p0, Li1/e;->K:F

    return-void
.end method

.method public constructor <init>(Li1/e;)V
    .locals 1

    const-string v0, "clNumber"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/c;-><init>(Li1/c;)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Li1/e;->K:F

    iget p1, p1, Li1/e;->K:F

    iput p1, p0, Li1/e;->K:F

    return-void
.end method

.method public constructor <init>([C)V
    .locals 1

    const-string v0, "content"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/c;-><init>([C)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Li1/e;->K:F

    return-void
.end method


# virtual methods
.method public d()Li1/c;
    .locals 1

    new-instance v0, Li1/e;

    invoke-direct {v0, p0}, Li1/e;-><init>(Li1/e;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li1/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Li1/e;->g()F

    move-result v1

    check-cast p1, Li1/e;

    invoke-virtual {p1}, Li1/e;->g()F

    move-result p1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float p1, v1, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public g()F
    .locals 1

    .prologue
    iget v0, p0, Li1/e;->K:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/c;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Li1/e;->K:F

    :cond_0
    iget v0, p0, Li1/e;->K:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Li1/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Li1/e;->K:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public o()I
    .locals 1

    .prologue
    iget v0, p0, Li1/e;->K:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/c;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Li1/e;->K:F

    :cond_0
    iget v0, p0, Li1/e;->K:F

    float-to-int v0, v0

    return v0
.end method
