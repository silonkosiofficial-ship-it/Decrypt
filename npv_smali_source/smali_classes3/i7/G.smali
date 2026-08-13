.class public final Li7/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/G$a;
    }
.end annotation


# static fields
.field public static final D:Li7/G$a;


# instance fields
.field private final C:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/G$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li7/G$a;-><init>(Ly7/k;)V

    sput-object v0, Li7/G;->D:Li7/G$a;

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Li7/G;->C:J

    return-void
.end method

.method public static final synthetic e(J)Li7/G;
    .locals 1

    new-instance v0, Li7/G;

    invoke-direct {v0, p0, p1}, Li7/G;-><init>(J)V

    return-object v0
.end method

.method public static g(J)J
    .locals 0

    return-wide p0
.end method

.method public static i(JLjava/lang/Object;)Z
    .locals 4

    .prologue
    instance-of v0, p2, Li7/G;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, Li7/G;

    invoke-virtual {p2}, Li7/G;->q()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final m(JJ)Z
    .locals 0

    .prologue
    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(J)I
    .locals 0

    invoke-static {p0, p1}, Lr/r;->a(J)I

    move-result p0

    return p0
.end method

.method public static o(J)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xa

    invoke-static {p0, p1, v0}, Li7/O;->d(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Li7/G;

    invoke-virtual {p1}, Li7/G;->q()J

    move-result-wide v0

    invoke-virtual {p0}, Li7/G;->q()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Li7/O;->b(JJ)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, Li7/G;->C:J

    invoke-static {v0, v1, p1}, Li7/G;->i(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Li7/G;->C:J

    invoke-static {v0, v1}, Li7/G;->n(J)I

    move-result v0

    return v0
.end method

.method public final synthetic q()J
    .locals 2

    iget-wide v0, p0, Li7/G;->C:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Li7/G;->C:J

    invoke-static {v0, v1}, Li7/G;->o(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
