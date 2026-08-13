.class final Lcom/google/android/gms/internal/ads/Gf0;
.super Lcom/google/android/gms/internal/ads/Ye0;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Nf0;

.field final synthetic D:Lcom/google/android/gms/internal/ads/Hf0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Nf0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Gf0;->D:Lcom/google/android/gms/internal/ads/Hf0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ye0;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Gf0;->C:Lcom/google/android/gms/internal/ads/Nf0;

    return-void
.end method


# virtual methods
.method public final r4(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const/16 v0, 0x1fd6

    const-string v1, "statusCode"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "sessionToken"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mf0;->c()Lcom/google/android/gms/internal/ads/Kf0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Kf0;->b(I)Lcom/google/android/gms/internal/ads/Kf0;

    if-eqz p1, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Kf0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Kf0;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Gf0;->C:Lcom/google/android/gms/internal/ads/Nf0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Kf0;->c()Lcom/google/android/gms/internal/ads/Mf0;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/Nf0;->a(Lcom/google/android/gms/internal/ads/Mf0;)V

    const/16 p1, 0x1fdd

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Gf0;->D:Lcom/google/android/gms/internal/ads/Hf0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Hf0;->a()V

    :cond_1
    return-void
.end method
