.class public final LY0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/i$a;
    }
.end annotation


# static fields
.field public static final D:LY0/i$a;

.field private static final E:F

.field private static final F:F

.field private static final G:F


# instance fields
.field private final C:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LY0/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY0/i$a;-><init>(Ly7/k;)V

    sput-object v0, LY0/i;->D:LY0/i$a;

    const/4 v0, 0x0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LY0/i;->E:F

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LY0/i;->F:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LY0/i;->G:F

    return-void
.end method

.method private synthetic constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LY0/i;->C:F

    return-void
.end method

.method public static final synthetic e()F
    .locals 1

    sget v0, LY0/i;->E:F

    return v0
.end method

.method public static final synthetic g()F
    .locals 1

    sget v0, LY0/i;->F:F

    return v0
.end method

.method public static final synthetic i()F
    .locals 1

    sget v0, LY0/i;->G:F

    return v0
.end method

.method public static final synthetic m(F)LY0/i;
    .locals 1

    new-instance v0, LY0/i;

    invoke-direct {v0, p0}, LY0/i;-><init>(F)V

    return-object v0
.end method

.method public static o(FF)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    return p0
.end method

.method public static q(F)F
    .locals 0

    return p0
.end method

.method public static r(FLjava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LY0/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LY0/i;

    invoke-virtual {p1}, LY0/i;->v()F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final s(FF)Z
    .locals 0

    .prologue
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static t(F)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    return p0
.end method

.method public static u(F)Ljava/lang/String;
    .locals 1

    .prologue
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Dp.Unspecified"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ".dp"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LY0/i;

    invoke-virtual {p1}, LY0/i;->v()F

    move-result p1

    invoke-virtual {p0, p1}, LY0/i;->n(F)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LY0/i;->C:F

    invoke-static {v0, p1}, LY0/i;->r(FLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LY0/i;->C:F

    invoke-static {v0}, LY0/i;->t(F)I

    move-result v0

    return v0
.end method

.method public n(F)I
    .locals 1

    iget v0, p0, LY0/i;->C:F

    invoke-static {v0, p1}, LY0/i;->o(FF)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, LY0/i;->C:F

    invoke-static {v0}, LY0/i;->u(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()F
    .locals 1

    iget v0, p0, LY0/i;->C:F

    return v0
.end method
