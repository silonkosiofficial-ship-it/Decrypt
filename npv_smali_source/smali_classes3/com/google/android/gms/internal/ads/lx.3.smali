.class public final Lcom/google/android/gms/internal/ads/lx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/bx;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/KP;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/KP;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lx;->a:Lcom/google/android/gms/internal/ads/KP;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->e9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lx;->a:Lcom/google/android/gms/internal/ads/KP;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/KP;->o(Lorg/json/JSONObject;)V

    :cond_1
    :goto_0
    return-void
.end method
