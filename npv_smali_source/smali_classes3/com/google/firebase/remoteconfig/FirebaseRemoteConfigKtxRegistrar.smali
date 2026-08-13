.class public final Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigKtxRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u13ab"
    }
    d2 = {
        "\u13ac",
        "\u13ad",
        "\u13ae",
        "\u13af",
        "",
        "\u13b0",
        "\u13b1",
        "\u13b2",
        "\u13b3"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le5/c;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
