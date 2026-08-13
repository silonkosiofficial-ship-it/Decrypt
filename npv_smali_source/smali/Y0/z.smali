.class public final LY0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/z$a;
    }
.end annotation


# static fields
.field public static final b:LY0/z$a;

.field private static final c:J

.field private static final d:J

.field private static final e:J


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LY0/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY0/z$a;-><init>(Ly7/k;)V

    sput-object v0, LY0/z;->b:LY0/z$a;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, LY0/z;->e(J)J

    move-result-wide v0

    sput-wide v0, LY0/z;->c:J

    const-wide v0, 0x100000000L

    invoke-static {v0, v1}, LY0/z;->e(J)J

    move-result-wide v0

    sput-wide v0, LY0/z;->d:J

    const-wide v0, 0x200000000L

    invoke-static {v0, v1}, LY0/z;->e(J)J

    move-result-wide v0

    sput-wide v0, LY0/z;->e:J

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LY0/z;->a:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, LY0/z;->e:J

    return-wide v0
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, LY0/z;->d:J

    return-wide v0
.end method

.method public static final synthetic c()J
    .locals 2

    sget-wide v0, LY0/z;->c:J

    return-wide v0
.end method

.method public static final synthetic d(J)LY0/z;
    .locals 1

    new-instance v0, LY0/z;

    invoke-direct {v0, p0, p1}, LY0/z;-><init>(J)V

    return-object v0
.end method

.method public static e(J)J
    .locals 0

    return-wide p0
.end method

.method public static f(JLjava/lang/Object;)Z
    .locals 4

    .prologue
    instance-of v0, p2, LY0/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, LY0/z;

    invoke-virtual {p2}, LY0/z;->j()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final g(JJ)Z
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

.method public static h(J)I
    .locals 0

    invoke-static {p0, p1}, Lr/r;->a(J)I

    move-result p0

    return p0
.end method

.method public static i(J)Ljava/lang/String;
    .locals 2

    .prologue
    sget-wide v0, LY0/z;->c:J

    invoke-static {p0, p1, v0, v1}, LY0/z;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Unspecified"

    goto :goto_0

    :cond_0
    sget-wide v0, LY0/z;->d:J

    invoke-static {p0, p1, v0, v1}, LY0/z;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Sp"

    goto :goto_0

    :cond_1
    sget-wide v0, LY0/z;->e:J

    invoke-static {p0, p1, v0, v1}, LY0/z;->g(JJ)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Em"

    goto :goto_0

    :cond_2
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, LY0/z;->a:J

    invoke-static {v0, v1, p1}, LY0/z;->f(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LY0/z;->a:J

    invoke-static {v0, v1}, LY0/z;->h(J)I

    move-result v0

    return v0
.end method

.method public final synthetic j()J
    .locals 2

    iget-wide v0, p0, LY0/z;->a:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, LY0/z;->a:J

    invoke-static {v0, v1}, LY0/z;->i(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
