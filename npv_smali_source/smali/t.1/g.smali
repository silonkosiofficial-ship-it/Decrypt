.class public abstract Lt/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/high16 v0, -0x80000000

    invoke-static {v0, v0}, LY0/u;->a(II)J

    move-result-wide v0

    sput-wide v0, Lt/g;->a:J

    return-void
.end method

.method public static final a()J
    .locals 2

    sget-wide v0, Lt/g;->a:J

    return-wide v0
.end method

.method public static final b(J)Z
    .locals 2

    sget-wide v0, Lt/g;->a:J

    invoke-static {p0, p1, v0, v1}, LY0/t;->e(JJ)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
