.class public final synthetic Lcom/google/android/gms/internal/ads/F30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/K20;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/G30;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/G30;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F30;->a:Lcom/google/android/gms/internal/ads/G30;

    return-void
.end method


# virtual methods
.method public final synthetic b(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F30;->a:Lcom/google/android/gms/internal/ads/G30;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/G30;->c(Lorg/json/JSONObject;)V

    return-void
.end method
