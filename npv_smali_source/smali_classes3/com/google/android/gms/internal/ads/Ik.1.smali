.class final Lcom/google/android/gms/internal/ads/Ik;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/gj;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Jk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Jk;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ik;->b:Lcom/google/android/gms/internal/ads/Jk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ik;->a:Lcom/google/android/gms/internal/ads/gj;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/Ik;)Lcom/google/android/gms/internal/ads/gj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Ik;->a:Lcom/google/android/gms/internal/ads/gj;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ik;->a:Lcom/google/android/gms/internal/ads/gj;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ik;->b:Lcom/google/android/gms/internal/ads/Jk;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/gj;->a(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
