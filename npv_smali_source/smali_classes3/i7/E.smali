.class public final Li7/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/E$a;
    }
.end annotation


# static fields
.field public static final D:Li7/E$a;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/E$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li7/E$a;-><init>(Ly7/k;)V

    sput-object v0, Li7/E;->D:Li7/E$a;

    return-void
.end method

.method private synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li7/E;->C:I

    return-void
.end method

.method public static final synthetic e(I)Li7/E;
    .locals 1

    new-instance v0, Li7/E;

    invoke-direct {v0, p0}, Li7/E;-><init>(I)V

    return-object v0
.end method

.method public static g(I)I
    .locals 0

    return p0
.end method

.method public static i(ILjava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li7/E;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Li7/E;

    invoke-virtual {p1}, Li7/E;->o()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static m(I)I
    .locals 0

    return p0
.end method

.method public static n(I)Ljava/lang/String;
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Li7/E;

    invoke-virtual {p1}, Li7/E;->o()I

    move-result p1

    invoke-virtual {p0}, Li7/E;->o()I

    move-result v0

    invoke-static {v0, p1}, Li7/O;->a(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Li7/E;->C:I

    invoke-static {v0, p1}, Li7/E;->i(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Li7/E;->C:I

    invoke-static {v0}, Li7/E;->m(I)I

    move-result v0

    return v0
.end method

.method public final synthetic o()I
    .locals 1

    iget v0, p0, Li7/E;->C:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Li7/E;->C:I

    invoke-static {v0}, Li7/E;->n(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
