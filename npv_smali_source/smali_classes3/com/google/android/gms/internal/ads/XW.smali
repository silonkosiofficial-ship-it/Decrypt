.class public final synthetic Lcom/google/android/gms/internal/ads/XW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Z80;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/ZW;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Rf;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZW;Lcom/google/android/gms/internal/ads/Rf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XW;->a:Lcom/google/android/gms/internal/ads/ZW;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/XW;->b:Lcom/google/android/gms/internal/ads/Rf;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XW;->a:Lcom/google/android/gms/internal/ads/ZW;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/XW;->b:Lcom/google/android/gms/internal/ads/Rf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ZW;->c(Lcom/google/android/gms/internal/ads/Rf;)V

    return-void
.end method
