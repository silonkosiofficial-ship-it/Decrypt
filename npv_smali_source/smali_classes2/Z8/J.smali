.class public abstract LZ8/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/I$a;JJ)LZ8/I;
    .locals 0

    new-instance p0, LZ8/M;

    invoke-static {p1, p2}, LT8/a;->z(J)J

    move-result-wide p1

    invoke-static {p3, p4}, LT8/a;->z(J)J

    move-result-wide p3

    invoke-direct {p0, p1, p2, p3, p4}, LZ8/M;-><init>(JJ)V

    return-object p0
.end method
