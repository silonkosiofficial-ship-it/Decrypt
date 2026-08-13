.class public final synthetic Lcom/google/android/gms/internal/ads/aR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/dR;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/dR;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aR;->a:Lcom/google/android/gms/internal/ads/dR;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aR;->a:Lcom/google/android/gms/internal/ads/dR;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dR;->b(Lorg/json/JSONObject;)LP4/d;

    move-result-object p1

    return-object p1
.end method
