.class public final synthetic Lcom/google/android/gms/internal/ads/ZQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/ll;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ll;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ZQ;->a:Lcom/google/android/gms/internal/ads/ll;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZQ;->a:Lcom/google/android/gms/internal/ads/ll;

    check-cast p1, Lorg/json/JSONObject;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ll;->c(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
