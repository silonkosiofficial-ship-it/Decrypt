.class public final synthetic Lcom/google/android/gms/internal/ads/JR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/NR;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/MR;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/Po;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/tk0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/NR;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/tk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/JR;->a:Lcom/google/android/gms/internal/ads/NR;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/JR;->b:Lcom/google/android/gms/internal/ads/MR;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/JR;->c:Lcom/google/android/gms/internal/ads/Po;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/JR;->d:Lcom/google/android/gms/internal/ads/tk0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/JR;->a:Lcom/google/android/gms/internal/ads/NR;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/JR;->b:Lcom/google/android/gms/internal/ads/MR;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/JR;->c:Lcom/google/android/gms/internal/ads/Po;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/JR;->d:Lcom/google/android/gms/internal/ads/tk0;

    check-cast p1, Lcom/google/android/gms/internal/ads/AR;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/NR;->b(Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/tk0;Lcom/google/android/gms/internal/ads/AR;)LP4/d;

    move-result-object p1

    return-object p1
.end method
