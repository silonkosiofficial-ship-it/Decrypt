.class public final Lcom/google/android/gms/internal/ads/VV;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/G70;

.field private final b:Lcom/google/android/gms/internal/ads/PM;

.field private final c:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/G70;Lcom/google/android/gms/internal/ads/PM;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/VV;->a:Lcom/google/android/gms/internal/ads/G70;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/VV;->b:Lcom/google/android/gms/internal/ads/PM;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/VV;->c:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/R60;ILcom/google/android/gms/internal/ads/aU;J)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VV;->c:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dO;->d(Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/dO;->c(Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/dO;

    const-string p1, "action"

    const-string v1, "adapter_status"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const-string p1, "adapter_l"

    invoke-static {p5, p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {v0, p1, p5}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const-string p1, "sc"

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/aU;->b()Ls3/W0;

    move-result-object p1

    iget p1, p1, Ls3/W0;->C:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "arec"

    invoke-virtual {v0, p3, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VV;->a:Lcom/google/android/gms/internal/ads/G70;

    invoke-virtual {p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/G70;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p3, "areec"

    invoke-virtual {v0, p3, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VV;->b:Lcom/google/android/gms/internal/ads/PM;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->t:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/PM;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/OM;

    move-result-object p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_4

    const-string p1, "ancn"

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/OM;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/OM;->b:Lcom/google/android/gms/internal/ads/hn;

    if-eqz p1, :cond_3

    const-string p2, "adapter_v"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hn;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_3
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/OM;->c:Lcom/google/android/gms/internal/ads/hn;

    if-eqz p1, :cond_4

    const-string p2, "adapter_sv"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hn;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method
