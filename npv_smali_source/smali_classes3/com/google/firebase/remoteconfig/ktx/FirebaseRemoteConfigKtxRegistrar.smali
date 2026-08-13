.class public final Lcom/google/firebase/remoteconfig/ktx/FirebaseRemoteConfigKtxRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Li7/e;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u13b4"
    }
    d2 = {
        "\u13b5",
        "\u13b6",
        "\u13b7",
        "\u13b8",
        "",
        "\u13b9",
        "\u13ba",
        "\u13bb",
        "\u13bc"
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
