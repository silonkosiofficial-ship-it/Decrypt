.class final Lcom/google/android/gms/internal/ads/SY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/K20;


# instance fields
.field private final a:Ljava/util/ArrayList;


# direct methods
.method synthetic constructor <init>(Ljava/util/ArrayList;Lcom/google/android/gms/internal/ads/TY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SY;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/fC;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fC;->b:Landroid/os/Bundle;

    const-string v0, "ad_types"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SY;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/fC;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fC;->a:Landroid/os/Bundle;

    const-string v0, "ad_types"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SY;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method
