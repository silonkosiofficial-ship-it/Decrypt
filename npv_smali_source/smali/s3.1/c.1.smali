.class final Ls3/c;
.super Ls3/x;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/internal/ads/Vl;


# direct methods
.method constructor <init>(Ls3/w;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 0

    iput-object p2, p0, Ls3/c;->b:Landroid/content/Context;

    iput-object p3, p0, Ls3/c;->c:Ljava/lang/String;

    iput-object p4, p0, Ls3/c;->d:Lcom/google/android/gms/internal/ads/Vl;

    invoke-direct {p0}, Ls3/x;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls3/c;->b:Landroid/content/Context;

    const-string v1, "rewarded"

    invoke-static {v0, v1}, Ls3/w;->q(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ls3/G1;

    invoke-direct {v0}, Ls3/G1;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Ls3/l0;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls3/c;->b:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    iget-object v1, p0, Ls3/c;->c:Ljava/lang/String;

    iget-object v2, p0, Ls3/c;->d:Lcom/google/android/gms/internal/ads/Vl;

    const v3, 0xe916690

    invoke-interface {p1, v0, v1, v2, v3}, Ls3/l0;->f2(LX3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Lcom/google/android/gms/internal/ads/vp;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ls3/c;->b:Landroid/content/Context;

    iget-object v1, p0, Ls3/c;->c:Ljava/lang/String;

    iget-object v2, p0, Ls3/c;->d:Lcom/google/android/gms/internal/ads/Vl;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Ip;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/vp;

    move-result-object v0

    return-object v0
.end method
