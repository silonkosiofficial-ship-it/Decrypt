.class final Lcom/google/android/gms/internal/ads/eb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gc;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/gb0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gb0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eb0;->a:Lcom/google/android/gms/internal/ads/gb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->u:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eb0;->a:Lcom/google/android/gms/internal/ads/gb0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/gb0;->e(Lcom/google/android/gms/internal/ads/gb0;Z)V

    :cond_0
    return-void
.end method
