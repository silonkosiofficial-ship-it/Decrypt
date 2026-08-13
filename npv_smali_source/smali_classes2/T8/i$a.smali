.class public abstract LT8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static e(J)J
    .locals 0

    return-wide p0
.end method

.method public static g(J)J
    .locals 1

    sget-object v0, LT8/h;->a:LT8/h;

    invoke-virtual {v0, p0, p1}, LT8/h;->a(J)J

    move-result-wide p0

    return-wide p0
.end method
