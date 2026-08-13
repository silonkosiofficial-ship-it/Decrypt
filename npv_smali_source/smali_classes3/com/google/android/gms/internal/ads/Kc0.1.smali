.class public final Lcom/google/android/gms/internal/ads/Kc0;
.super Lcom/google/android/gms/internal/ads/Ic0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Cc0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Ic0;-><init>(Lcom/google/android/gms/internal/ads/Cc0;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ic0;->b:Lcom/google/android/gms/internal/ads/Cc0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Cc0;->e(Lorg/json/JSONObject;)V

    return-object v0
.end method
