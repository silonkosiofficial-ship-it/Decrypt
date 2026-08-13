.class public final LT6/I;
.super LW6/B;
.source "SourceFile"

# interfaces
.implements LT6/H;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, LW6/B;-><init>(ZI)V

    return-void
.end method


# virtual methods
.method public i()LT6/G;
    .locals 2

    new-instance v0, LT6/J;

    invoke-virtual {p0}, LW6/B;->l()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, LT6/J;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
