.class public final LY0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/x$a;
    }
.end annotation


# static fields
.field public static final b:LY0/x$a;

.field private static final c:[LY0/z;

.field private static final d:J


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LY0/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY0/x$a;-><init>(Ly7/k;)V

    sput-object v0, LY0/x;->b:LY0/x$a;

    sget-object v0, LY0/z;->b:LY0/z$a;

    invoke-virtual {v0}, LY0/z$a;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/z;->d(J)LY0/z;

    move-result-object v1

    invoke-virtual {v0}, LY0/z$a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/z;->d(J)LY0/z;

    move-result-object v2

    invoke-virtual {v0}, LY0/z$a;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/z;->d(J)LY0/z;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [LY0/z;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    sput-object v3, LY0/x;->c:[LY0/z;

    const-wide/16 v0, 0x0

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-static {v0, v1, v2}, LY0/y;->i(JF)J

    move-result-wide v0

    sput-wide v0, LY0/x;->d:J

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LY0/x;->a:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, LY0/x;->d:J

    return-wide v0
.end method

.method public static final synthetic b(J)LY0/x;
    .locals 1

    new-instance v0, LY0/x;

    invoke-direct {v0, p0, p1}, LY0/x;-><init>(J)V

    return-object v0
.end method

.method public static c(J)J
    .locals 0

    return-wide p0
.end method

.method public static d(JLjava/lang/Object;)Z
    .locals 4

    .prologue
    instance-of v0, p2, LY0/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, LY0/x;

    invoke-virtual {p2}, LY0/x;->k()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final e(JJ)Z
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

.method public static final f(J)J
    .locals 2

    const-wide v0, 0xff00000000L

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static final g(J)J
    .locals 2

    sget-object v0, LY0/x;->c:[LY0/z;

    invoke-static {p0, p1}, LY0/x;->f(J)J

    move-result-wide p0

    const/16 v1, 0x20

    ushr-long/2addr p0, v1

    long-to-int p0, p0

    aget-object p0, v0, p0

    invoke-virtual {p0}, LY0/z;->j()J

    move-result-wide p0

    return-wide p0
.end method

.method public static final h(J)F
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method public static i(J)I
    .locals 0

    invoke-static {p0, p1}, Lr/r;->a(J)I

    move-result p0

    return p0
.end method

.method public static j(J)Ljava/lang/String;
    .locals 5

    .prologue
    invoke-static {p0, p1}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->c()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p0, "Unspecified"

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LY0/x;->h(J)F

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ".sp"

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LY0/x;->h(J)F

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ".em"

    goto :goto_0

    :cond_2
    const-string p0, "Invalid"

    :goto_1
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, LY0/x;->a:J

    invoke-static {v0, v1, p1}, LY0/x;->d(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LY0/x;->a:J

    invoke-static {v0, v1}, LY0/x;->i(J)I

    move-result v0

    return v0
.end method

.method public final synthetic k()J
    .locals 2

    iget-wide v0, p0, LY0/x;->a:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, LY0/x;->a:J

    invoke-static {v0, v1}, LY0/x;->j(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
