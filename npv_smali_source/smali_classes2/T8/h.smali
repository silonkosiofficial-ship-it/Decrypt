.class public final LT8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LT8/h;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT8/h;

    invoke-direct {v0}, LT8/h;-><init>()V

    sput-object v0, LT8/h;->a:LT8/h;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sput-wide v0, LT8/h;->b:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-wide v2, LT8/h;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    invoke-direct {p0}, LT8/h;->c()J

    move-result-wide v0

    sget-object v2, LT8/d;->D:LT8/d;

    invoke-static {v0, v1, p1, p2, v2}, LT8/g;->b(JJLT8/d;)J

    move-result-wide p1

    return-wide p1
.end method

.method public b()J
    .locals 2

    invoke-direct {p0}, LT8/h;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, LT8/i$a;->e(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "TimeSource(System.nanoTime())"

    return-object v0
.end method
