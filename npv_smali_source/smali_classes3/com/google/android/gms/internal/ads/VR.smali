.class public final synthetic Lcom/google/android/gms/internal/ads/VR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/gS;

.field public final synthetic b:LP4/d;

.field public final synthetic c:LP4/d;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/Po;

.field public final synthetic e:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/gS;LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/VR;->a:Lcom/google/android/gms/internal/ads/gS;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/VR;->b:LP4/d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/VR;->c:LP4/d;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/VR;->d:Lcom/google/android/gms/internal/ads/Po;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/VR;->e:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VR;->a:Lcom/google/android/gms/internal/ads/gS;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/VR;->b:LP4/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/VR;->c:LP4/d;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/VR;->d:Lcom/google/android/gms/internal/ads/Po;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/VR;->e:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/gS;->s6(LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/E90;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
