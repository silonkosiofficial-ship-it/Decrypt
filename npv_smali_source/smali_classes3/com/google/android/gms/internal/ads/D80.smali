.class public final synthetic Lcom/google/android/gms/internal/ads/D80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/E80;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/w80;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/E80;Lcom/google/android/gms/internal/ads/w80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/D80;->a:Lcom/google/android/gms/internal/ads/E80;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/D80;->b:Lcom/google/android/gms/internal/ads/w80;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/D80;->a:Lcom/google/android/gms/internal/ads/E80;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/D80;->b:Lcom/google/android/gms/internal/ads/w80;

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/E80;->c(Lcom/google/android/gms/internal/ads/w80;Ljava/lang/Exception;)LP4/d;

    move-result-object p1

    return-object p1
.end method
