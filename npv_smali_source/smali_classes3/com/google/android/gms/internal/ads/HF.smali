.class public final Lcom/google/android/gms/internal/ads/HF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/EF;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/EF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/HF;->a:Lcom/google/android/gms/internal/ads/EF;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/EF;)Ljava/util/Set;
    .locals 0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HF;->a:Lcom/google/android/gms/internal/ads/EF;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/HF;->a(Lcom/google/android/gms/internal/ads/EF;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
