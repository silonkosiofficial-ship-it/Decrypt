.class final Lcom/google/android/gms/internal/ads/fw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/jM;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Ev;

.field private b:Lcom/google/android/gms/internal/ads/J50;

.field private c:Lcom/google/android/gms/internal/ads/l50;

.field private d:Lcom/google/android/gms/internal/ads/EF;

.field private e:Lcom/google/android/gms/internal/ads/nC;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fw;->a:Lcom/google/android/gms/internal/ads/Ev;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/nC;)Lcom/google/android/gms/internal/ads/jM;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fw;->e:Lcom/google/android/gms/internal/ads/nC;

    return-object p0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/jM;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fw;->d:Lcom/google/android/gms/internal/ads/EF;

    return-object p0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/kM;
    .locals 15

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fw;->d:Lcom/google/android/gms/internal/ads/EF;

    const-class v1, Lcom/google/android/gms/internal/ads/EF;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fw;->e:Lcom/google/android/gms/internal/ads/nC;

    const-class v1, Lcom/google/android/gms/internal/ads/nC;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/gw;

    new-instance v4, Lcom/google/android/gms/internal/ads/NA;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/NA;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/T70;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/T70;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/OB;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/OB;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/uO;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/uO;-><init>()V

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/fw;->d:Lcom/google/android/gms/internal/ads/EF;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/fw;->e:Lcom/google/android/gms/internal/ads/nC;

    invoke-static {}, Lcom/google/android/gms/internal/ads/fW;->a()Lcom/google/android/gms/internal/ads/cW;

    move-result-object v10

    iget-object v12, p0, Lcom/google/android/gms/internal/ads/fw;->b:Lcom/google/android/gms/internal/ads/J50;

    iget-object v13, p0, Lcom/google/android/gms/internal/ads/fw;->c:Lcom/google/android/gms/internal/ads/l50;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/fw;->a:Lcom/google/android/gms/internal/ads/Ev;

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/gw;-><init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/NA;Lcom/google/android/gms/internal/ads/T70;Lcom/google/android/gms/internal/ads/OB;Lcom/google/android/gms/internal/ads/uO;Lcom/google/android/gms/internal/ads/EF;Lcom/google/android/gms/internal/ads/nC;Lcom/google/android/gms/internal/ads/cW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/J50;Lcom/google/android/gms/internal/ads/l50;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method

.method public final bridge synthetic g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fw;->d()Lcom/google/android/gms/internal/ads/kM;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic l(Lcom/google/android/gms/internal/ads/J50;)Lcom/google/android/gms/internal/ads/iC;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fw;->b:Lcom/google/android/gms/internal/ads/J50;

    return-object p0
.end method

.method public final synthetic u(Lcom/google/android/gms/internal/ads/l50;)Lcom/google/android/gms/internal/ads/iC;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fw;->c:Lcom/google/android/gms/internal/ads/l50;

    return-object p0
.end method
