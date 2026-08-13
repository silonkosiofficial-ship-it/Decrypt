.class public final synthetic Lcom/google/android/gms/internal/ads/C80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/E80;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/w80;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/b80;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/x80;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/E80;Lcom/google/android/gms/internal/ads/w80;Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/x80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/C80;->a:Lcom/google/android/gms/internal/ads/E80;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/C80;->b:Lcom/google/android/gms/internal/ads/w80;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/C80;->c:Lcom/google/android/gms/internal/ads/b80;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/C80;->d:Lcom/google/android/gms/internal/ads/x80;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C80;->a:Lcom/google/android/gms/internal/ads/E80;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/C80;->b:Lcom/google/android/gms/internal/ads/w80;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/C80;->c:Lcom/google/android/gms/internal/ads/b80;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/C80;->d:Lcom/google/android/gms/internal/ads/x80;

    check-cast p1, Lcom/google/android/gms/internal/ads/l80;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/E80;->b(Lcom/google/android/gms/internal/ads/w80;Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/x80;Lcom/google/android/gms/internal/ads/l80;)LP4/d;

    move-result-object p1

    return-object p1
.end method
