.class final Ls3/l;
.super Ls3/x;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ls3/c2;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/google/android/gms/internal/ads/Vl;

.field final synthetic f:Ls3/w;


# direct methods
.method constructor <init>(Ls3/w;Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 0

    iput-object p2, p0, Ls3/l;->b:Landroid/content/Context;

    iput-object p3, p0, Ls3/l;->c:Ls3/c2;

    iput-object p4, p0, Ls3/l;->d:Ljava/lang/String;

    iput-object p5, p0, Ls3/l;->e:Lcom/google/android/gms/internal/ads/Vl;

    iput-object p1, p0, Ls3/l;->f:Ls3/w;

    invoke-direct {p0}, Ls3/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls3/l;->b:Landroid/content/Context;

    const-string v1, "banner"

    invoke-static {v0, v1}, Ls3/w;->q(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ls3/B1;

    invoke-direct {v0}, Ls3/B1;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Ls3/l0;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ls3/l;->b:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v2

    iget-object v3, p0, Ls3/l;->c:Ls3/c2;

    iget-object v4, p0, Ls3/l;->d:Ljava/lang/String;

    iget-object v5, p0, Ls3/l;->e:Lcom/google/android/gms/internal/ads/Vl;

    const v6, 0xe916690

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Ls3/l0;->h6(LX3/a;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Ls3/V;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ls3/l;->f:Ls3/w;

    invoke-static {v0}, Ls3/w;->b(Ls3/w;)Ls3/V1;

    move-result-object v1

    iget-object v2, p0, Ls3/l;->b:Landroid/content/Context;

    iget-object v3, p0, Ls3/l;->c:Ls3/c2;

    iget-object v4, p0, Ls3/l;->d:Ljava/lang/String;

    iget-object v5, p0, Ls3/l;->e:Lcom/google/android/gms/internal/ads/Vl;

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, Ls3/V1;->c(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Ls3/V;

    move-result-object v0

    return-object v0
.end method
