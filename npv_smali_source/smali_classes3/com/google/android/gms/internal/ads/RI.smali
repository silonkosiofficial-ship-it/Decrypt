.class public final synthetic Lcom/google/android/gms/internal/ads/RI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Ot;

.field public final synthetic D:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ot;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/RI;->C:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/RI;->D:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    sget v0, Lcom/google/android/gms/internal/ads/ZI;->G:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RI;->C:Lcom/google/android/gms/internal/ads/Ot;

    const-string v1, "onVideoEvent"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RI;->D:Lorg/json/JSONObject;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
