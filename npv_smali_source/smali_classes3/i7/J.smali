.class public final Li7/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/J$a;
    }
.end annotation


# static fields
.field public static final D:Li7/J$a;


# instance fields
.field private final C:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/J$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li7/J$a;-><init>(Ly7/k;)V

    sput-object v0, Li7/J;->D:Li7/J$a;

    return-void
.end method

.method private synthetic constructor <init>(S)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, Li7/J;->C:S

    return-void
.end method

.method public static final synthetic e(S)Li7/J;
    .locals 1

    new-instance v0, Li7/J;

    invoke-direct {v0, p0}, Li7/J;-><init>(S)V

    return-object v0
.end method

.method public static g(S)S
    .locals 0

    return p0
.end method

.method public static i(SLjava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li7/J;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Li7/J;

    invoke-virtual {p1}, Li7/J;->o()S

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static m(S)I
    .locals 0

    return p0
.end method

.method public static n(S)Ljava/lang/String;
    .locals 1

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Li7/J;

    invoke-virtual {p1}, Li7/J;->o()S

    move-result p1

    invoke-virtual {p0}, Li7/J;->o()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    and-int/2addr p1, v1

    invoke-static {v0, p1}, Ly7/t;->g(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-short v0, p0, Li7/J;->C:S

    invoke-static {v0, p1}, Li7/J;->i(SLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-short v0, p0, Li7/J;->C:S

    invoke-static {v0}, Li7/J;->m(S)I

    move-result v0

    return v0
.end method

.method public final synthetic o()S
    .locals 1

    iget-short v0, p0, Li7/J;->C:S

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-short v0, p0, Li7/J;->C:S

    invoke-static {v0}, Li7/J;->n(S)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
