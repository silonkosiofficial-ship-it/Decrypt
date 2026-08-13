.class final Lcom/google/android/gms/internal/ads/Sr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Z

.field final synthetic D:Lcom/google/android/gms/internal/ads/Tr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Tr;Z)V
    .locals 0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/Sr;->C:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Sr;->D:Lcom/google/android/gms/internal/ads/Tr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Sr;->C:Z

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "isVisible"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Sr;->D:Lcom/google/android/gms/internal/ads/Tr;

    const-string v2, "windowVisibilityChanged"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/Tr;->w(Lcom/google/android/gms/internal/ads/Tr;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
