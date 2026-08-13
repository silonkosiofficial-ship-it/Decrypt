.class public final LU8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU8/b$a;
    }
.end annotation


# static fields
.field public static final E:LU8/b$a;

.field private static final F:LU8/b;

.field private static final G:Ljava/util/Comparator;


# instance fields
.field private final C:J

.field private final D:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU8/b$a;-><init>(Ly7/k;)V

    sput-object v0, LU8/b;->E:LU8/b$a;

    new-instance v0, LU8/b;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, LU8/b;-><init>(JJ)V

    sput-object v0, LU8/b;->F:LU8/b;

    new-instance v0, LU8/a;

    invoke-direct {v0}, LU8/a;-><init>()V

    sput-object v0, LU8/b;->G:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LU8/b;->C:J

    iput-wide p3, p0, LU8/b;->D:J

    return-void
.end method

.method public static synthetic a(LU8/b;LU8/b;)I
    .locals 0

    invoke-static {p0, p1}, LU8/b;->b(LU8/b;LU8/b;)I

    move-result p0

    return p0
.end method

.method private static final b(LU8/b;LU8/b;)I
    .locals 4

    .prologue
    const-string v0, "a"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LU8/b;->C:J

    iget-wide v2, p1, LU8/b;->C:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    iget-wide p0, p1, LU8/b;->C:J

    :goto_0
    invoke-static {p0, p1}, Li7/G;->g(J)J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Lr/z;->a(JJ)I

    move-result p0

    goto :goto_1

    :cond_0
    iget-wide v0, p0, LU8/b;->D:J

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    iget-wide p0, p1, LU8/b;->D:J

    goto :goto_0

    :goto_1
    return p0
.end method

.method public static final synthetic c()LU8/b;
    .locals 1

    sget-object v0, LU8/b;->F:LU8/b;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LU8/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, LU8/b;->C:J

    check-cast p1, LU8/b;

    iget-wide v5, p1, LU8/b;->C:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, LU8/b;->D:J

    iget-wide v5, p1, LU8/b;->D:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, LU8/b;->C:J

    iget-wide v2, p0, LU8/b;->D:J

    xor-long/2addr v0, v2

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    long-to-int v0, v0

    xor-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const/16 v0, 0x24

    new-array v0, v0, [B

    iget-wide v1, p0, LU8/b;->D:J

    const/16 v3, 0x18

    const/4 v4, 0x6

    invoke-static {v1, v2, v0, v3, v4}, LU8/d;->b(J[BII)V

    const/16 v1, 0x17

    const/16 v2, 0x2d

    aput-byte v2, v0, v1

    iget-wide v3, p0, LU8/b;->D:J

    const/16 v1, 0x30

    ushr-long/2addr v3, v1

    const/16 v1, 0x13

    const/4 v5, 0x2

    invoke-static {v3, v4, v0, v1, v5}, LU8/d;->b(J[BII)V

    const/16 v1, 0x12

    aput-byte v2, v0, v1

    iget-wide v3, p0, LU8/b;->C:J

    const/16 v1, 0xe

    invoke-static {v3, v4, v0, v1, v5}, LU8/d;->b(J[BII)V

    const/16 v1, 0xd

    aput-byte v2, v0, v1

    iget-wide v3, p0, LU8/b;->C:J

    const/16 v1, 0x10

    ushr-long/2addr v3, v1

    const/16 v1, 0x9

    invoke-static {v3, v4, v0, v1, v5}, LU8/d;->b(J[BII)V

    const/16 v1, 0x8

    aput-byte v2, v0, v1

    iget-wide v1, p0, LU8/b;->C:J

    const/16 v3, 0x20

    ushr-long/2addr v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v1, v2, v0, v3, v4}, LU8/d;->b(J[BII)V

    invoke-static {v0}, LS8/r;->C([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
