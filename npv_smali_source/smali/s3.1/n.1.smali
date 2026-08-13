.class final Ls3/n;
.super Ls3/x;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ls3/c2;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ls3/w;


# direct methods
.method constructor <init>(Ls3/w;Landroid/content/Context;Ls3/c2;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Ls3/n;->b:Landroid/content/Context;

    iput-object p3, p0, Ls3/n;->c:Ls3/c2;

    iput-object p4, p0, Ls3/n;->d:Ljava/lang/String;

    iput-object p1, p0, Ls3/n;->e:Ls3/w;

    invoke-direct {p0}, Ls3/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls3/n;->b:Landroid/content/Context;

    const-string v1, "search"

    invoke-static {v0, v1}, Ls3/w;->q(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ls3/B1;

    invoke-direct {v0}, Ls3/B1;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Ls3/l0;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls3/n;->b:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    iget-object v1, p0, Ls3/n;->c:Ls3/c2;

    iget-object v2, p0, Ls3/n;->d:Ljava/lang/String;

    const v3, 0xe916690

    invoke-interface {p1, v0, v1, v2, v3}, Ls3/l0;->F4(LX3/a;Ls3/c2;Ljava/lang/String;I)Ls3/V;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ls3/n;->e:Ls3/w;

    invoke-static {v0}, Ls3/w;->b(Ls3/w;)Ls3/V1;

    move-result-object v1

    iget-object v2, p0, Ls3/n;->b:Landroid/content/Context;

    iget-object v3, p0, Ls3/n;->c:Ls3/c2;

    iget-object v4, p0, Ls3/n;->d:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-virtual/range {v1 .. v6}, Ls3/V1;->c(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Ls3/V;

    move-result-object v0

    return-object v0
.end method
