.class public final synthetic Lcom/google/android/gms/internal/ads/mZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pg0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/oZ;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/oZ;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method
