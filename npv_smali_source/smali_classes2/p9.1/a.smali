.class public final Lp9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/a$a;
    }
.end annotation


# static fields
.field public static final E:Lp9/a$a;

.field private static final F:Lp9/a;

.field private static final G:[C


# instance fields
.field private final C:[B

.field private D:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp9/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp9/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lp9/a;->E:Lp9/a$a;

    new-instance v0, Lp9/a;

    const/4 v2, 0x0

    new-array v2, v2, [B

    invoke-direct {v0, v2, v1}, Lp9/a;-><init>([BLjava/lang/Object;)V

    sput-object v0, Lp9/a;->F:Lp9/a;

    const-string v0, "0123456789abcdef"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const-string v1, "toCharArray(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lp9/a;->G:[C

    return-void
.end method

.method private constructor <init>([BLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/a;->C:[B

    return-void
.end method

.method public synthetic constructor <init>([BLjava/lang/Object;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp9/a;-><init>([BLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lp9/a;

    invoke-virtual {p0, p1}, Lp9/a;->e(Lp9/a;)I

    move-result p1

    return p1
.end method

.method public e(Lp9/a;)I
    .locals 6

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lp9/a;->C:[B

    iget-object v2, p1, Lp9/a;->C:[B

    invoke-virtual {p0}, Lp9/a;->i()I

    move-result v3

    invoke-virtual {p1}, Lp9/a;->i()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    :goto_0
    if-ge v0, v3, :cond_2

    aget-byte v4, v1, v0

    invoke-static {v4}, Li7/C;->g(B)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    aget-byte v5, v2, v0

    invoke-static {v5}, Li7/C;->g(B)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    invoke-static {v4, v5}, Ly7/t;->g(II)I

    move-result v4

    if-eqz v4, :cond_1

    return v4

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lp9/a;->i()I

    move-result v0

    invoke-virtual {p1}, Lp9/a;->i()I

    move-result p1

    invoke-static {v0, p1}, Ly7/t;->g(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lp9/a;

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lp9/a;

    iget-object v1, p1, Lp9/a;->C:[B

    array-length v2, v1

    iget-object v3, p0, Lp9/a;->C:[B

    array-length v4, v3

    if-eq v2, v4, :cond_2

    return v0

    :cond_2
    iget p1, p1, Lp9/a;->D:I

    if-eqz p1, :cond_3

    iget v2, p0, Lp9/a;->D:I

    if-eqz v2, :cond_3

    if-eq p1, v2, :cond_3

    return v0

    :cond_3
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method public final g()[B
    .locals 1

    iget-object v0, p0, Lp9/a;->C:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    iget v0, p0, Lp9/a;->D:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lp9/a;->C:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    iput v0, p0, Lp9/a;->D:I

    :cond_0
    return v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lp9/a;->C:[B

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .prologue
    invoke-static {p0}, Lp9/c;->a(Lp9/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ByteString(size=0)"

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lp9/a;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x16

    invoke-virtual {p0}, Lp9/a;->i()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "ByteString(size="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " hex="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lp9/a;->C:[B

    invoke-virtual {p0}, Lp9/a;->i()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-byte v4, v0, v3

    sget-object v5, Lp9/a;->G:[C

    ushr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v5, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x29

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
