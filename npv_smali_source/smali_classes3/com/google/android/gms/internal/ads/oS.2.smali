.class public final Lcom/google/android/gms/internal/ads/oS;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Jo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Jo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oS;->a:Lcom/google/android/gms/internal/ads/Jo;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oS;->a:Lcom/google/android/gms/internal/ads/Jo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jo;->a()LP4/d;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->C7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "persistFlags"

    if-eqz v1, :cond_0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/gr;->b(LP4/d;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/gr;->a(LP4/d;Ljava/lang/String;)V

    return-void
.end method
