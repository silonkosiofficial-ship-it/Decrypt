.class public final Li7/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/C$a;
    }
.end annotation


# static fields
.field public static final D:Li7/C$a;


# instance fields
.field private final C:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li7/C$a;-><init>(Ly7/k;)V

    sput-object v0, Li7/C;->D:Li7/C$a;

    return-void
.end method

.method private synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Li7/C;->C:B

    return-void
.end method

.method public static final synthetic e(B)Li7/C;
    .locals 1

    new-instance v0, Li7/C;

    invoke-direct {v0, p0}, Li7/C;-><init>(B)V

    return-object v0
.end method

.method public static g(B)B
    .locals 0

    return p0
.end method

.method public static i(BLjava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li7/C;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Li7/C;

    invoke-virtual {p1}, Li7/C;->o()B

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static m(B)I
    .locals 0

    return p0
.end method

.method public static n(B)Ljava/lang/String;
    .locals 0

    and-int/lit16 p0, p0, 0xff

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Li7/C;

    invoke-virtual {p1}, Li7/C;->o()B

    move-result p1

    invoke-virtual {p0}, Li7/C;->o()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 p1, p1, 0xff

    invoke-static {v0, p1}, Ly7/t;->g(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-byte v0, p0, Li7/C;->C:B

    invoke-static {v0, p1}, Li7/C;->i(BLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-byte v0, p0, Li7/C;->C:B

    invoke-static {v0}, Li7/C;->m(B)I

    move-result v0

    return v0
.end method

.method public final synthetic o()B
    .locals 1

    iget-byte v0, p0, Li7/C;->C:B

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-byte v0, p0, Li7/C;->C:B

    invoke-static {v0}, Li7/C;->n(B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
