.class final Lcom/google/android/gms/internal/ads/hw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB3/d;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Ev;

.field private b:Lcom/google/android/gms/internal/ads/nC;

.field private c:LB3/B;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hw;->a:Lcom/google/android/gms/internal/ads/Ev;

    return-void
.end method


# virtual methods
.method public final c()LB3/e;
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hw;->b:Lcom/google/android/gms/internal/ads/nC;

    const-class v1, Lcom/google/android/gms/internal/ads/nC;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hw;->c:LB3/B;

    const-class v1, LB3/B;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/iw;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/hw;->c:LB3/B;

    new-instance v5, Lcom/google/android/gms/internal/ads/NA;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/NA;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/OB;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/OB;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/uO;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/uO;-><init>()V

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/hw;->b:Lcom/google/android/gms/internal/ads/nC;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/hw;->a:Lcom/google/android/gms/internal/ads/Ev;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/ads/iw;-><init>(Lcom/google/android/gms/internal/ads/Ev;LB3/B;Lcom/google/android/gms/internal/ads/NA;Lcom/google/android/gms/internal/ads/OB;Lcom/google/android/gms/internal/ads/uO;Lcom/google/android/gms/internal/ads/nC;Lcom/google/android/gms/internal/ads/J50;Lcom/google/android/gms/internal/ads/l50;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/ads/nC;)LB3/d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hw;->b:Lcom/google/android/gms/internal/ads/nC;

    return-object p0
.end method

.method public final bridge synthetic e(LB3/B;)LB3/d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hw;->c:LB3/B;

    return-object p0
.end method
