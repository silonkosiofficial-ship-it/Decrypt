.class public final synthetic Lcom/google/android/gms/internal/ads/KU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/MU;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/e70;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic e:Lcom/google/android/gms/internal/ads/U60;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/MU;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KU;->a:Lcom/google/android/gms/internal/ads/MU;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/KU;->b:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/KU;->c:Lcom/google/android/gms/internal/ads/e70;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/KU;->d:Lcom/google/android/gms/internal/ads/R60;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/KU;->e:Lcom/google/android/gms/internal/ads/U60;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KU;->a:Lcom/google/android/gms/internal/ads/MU;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KU;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/KU;->c:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/KU;->d:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/KU;->e:Lcom/google/android/gms/internal/ads/U60;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/MU;->c(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
