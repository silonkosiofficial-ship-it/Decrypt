.class public abstract Lu8/c;
.super Lu8/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lu8/a;-><init>()V

    return-void
.end method


# virtual methods
.method public i()Z
    .locals 1

    invoke-virtual {p0}, Lu8/c;->m()Z

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
