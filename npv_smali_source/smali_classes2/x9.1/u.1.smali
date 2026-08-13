.class public final Lx9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx9/u$a;
    }
.end annotation


# static fields
.field private static final e:Lx9/u$a;

.field private static final f:[J


# instance fields
.field private final a:Lv9/f;

.field private final b:Lx7/p;

.field private c:J

.field private final d:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx9/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx9/u$a;-><init>(Ly7/k;)V

    sput-object v0, Lx9/u;->e:Lx9/u$a;

    const/4 v0, 0x0

    new-array v0, v0, [J

    sput-object v0, Lx9/u;->f:[J

    return-void
.end method

.method public constructor <init>(Lv9/f;Lx7/p;)V
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readIfAbsent"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/u;->a:Lv9/f;

    iput-object p2, p0, Lx9/u;->b:Lx7/p;

    invoke-interface {p1}, Lv9/f;->e()I

    move-result p1

    const-wide/16 v0, 0x0

    const/16 p2, 0x40

    if-gt p1, p2, :cond_1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    shl-long/2addr v0, p1

    :goto_0
    iput-wide v0, p0, Lx9/u;->c:J

    sget-object p1, Lx9/u;->f:[J

    iput-object p1, p0, Lx9/u;->d:[J

    goto :goto_1

    :cond_1
    iput-wide v0, p0, Lx9/u;->c:J

    invoke-direct {p0, p1}, Lx9/u;->e(I)[J

    move-result-object p1

    iput-object p1, p0, Lx9/u;->d:[J

    :goto_1
    return-void
.end method

.method private final b(I)V
    .locals 6

    ushr-int/lit8 v0, p1, 0x6

    add-int/lit8 v0, v0, -0x1

    and-int/lit8 p1, p1, 0x3f

    iget-object v1, p0, Lx9/u;->d:[J

    aget-wide v2, v1, v0

    const-wide/16 v4, 0x1

    shl-long/2addr v4, p1

    or-long/2addr v2, v4

    aput-wide v2, v1, v0

    return-void
.end method

.method private final c()I
    .locals 10

    .prologue
    iget-object v0, p0, Lx9/u;->d:[J

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    add-int/lit8 v2, v1, 0x1

    mul-int/lit8 v3, v2, 0x40

    iget-object v4, p0, Lx9/u;->d:[J

    aget-wide v5, v4, v1

    :cond_0
    const-wide/16 v7, -0x1

    cmp-long v4, v5, v7

    if-eqz v4, :cond_1

    not-long v7, v5

    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v4

    const-wide/16 v7, 0x1

    shl-long/2addr v7, v4

    or-long/2addr v5, v7

    add-int/2addr v4, v3

    iget-object v7, p0, Lx9/u;->b:Lx7/p;

    iget-object v8, p0, Lx9/u;->a:Lv9/f;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v7, v8, v9}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v0, p0, Lx9/u;->d:[J

    aput-wide v5, v0, v1

    return v4

    :cond_1
    iget-object v3, p0, Lx9/u;->d:[J

    aput-wide v5, v3, v1

    move v1, v2

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method private final e(I)[J
    .locals 4

    .prologue
    add-int/lit8 v0, p1, -0x1

    ushr-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, p1, 0x3f

    new-array v0, v0, [J

    if-eqz v1, :cond_0

    invoke-static {v0}, Lj7/n;->d0([J)I

    move-result v1

    const-wide/16 v2, -0x1

    shl-long/2addr v2, p1

    aput-wide v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .prologue
    const/16 v0, 0x40

    if-ge p1, v0, :cond_0

    iget-wide v0, p0, Lx9/u;->c:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lx9/u;->c:J

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lx9/u;->b(I)V

    :goto_0
    return-void
.end method

.method public final d()I
    .locals 6

    .prologue
    iget-object v0, p0, Lx9/u;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->e()I

    move-result v0

    :cond_0
    iget-wide v1, p0, Lx9/u;->c:J

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    not-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v1

    iget-wide v2, p0, Lx9/u;->c:J

    const-wide/16 v4, 0x1

    shl-long/2addr v4, v1

    or-long/2addr v2, v4

    iput-wide v2, p0, Lx9/u;->c:J

    iget-object v2, p0, Lx9/u;->b:Lx7/p;

    iget-object v3, p0, Lx9/u;->a:Lv9/f;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_1
    const/16 v1, 0x40

    if-le v0, v1, :cond_2

    invoke-direct {p0}, Lx9/u;->c()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method
