.class public final synthetic Lcom/google/android/gms/internal/ads/IK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/RK;

.field public final synthetic b:Ls3/c2;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/U60;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/RK;Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/IK;->a:Lcom/google/android/gms/internal/ads/RK;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/IK;->b:Ls3/c2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/IK;->c:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/IK;->d:Lcom/google/android/gms/internal/ads/U60;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/IK;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/IK;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IK;->a:Lcom/google/android/gms/internal/ads/RK;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/IK;->b:Ls3/c2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/IK;->c:Lcom/google/android/gms/internal/ads/R60;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/IK;->d:Lcom/google/android/gms/internal/ads/U60;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/IK;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/IK;->f:Ljava/lang/String;

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/RK;->b(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
