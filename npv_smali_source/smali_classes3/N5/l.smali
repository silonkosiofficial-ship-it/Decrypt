.class public LN5/l;
.super LN5/k;
.source "SourceFile"


# instance fields
.field private final D:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    const-string v0, "Fetch was throttled."

    invoke-direct {p0, v0, p1, p2}, LN5/l;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1}, LN5/k;-><init>(Ljava/lang/String;)V

    iput-wide p2, p0, LN5/l;->D:J

    return-void
.end method
