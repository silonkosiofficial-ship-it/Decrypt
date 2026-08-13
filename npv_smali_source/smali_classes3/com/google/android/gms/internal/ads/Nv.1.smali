.class final Lcom/google/android/gms/internal/ads/Nv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/b50;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Ev;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ls3/c2;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nv;->a:Lcom/google/android/gms/internal/ads/Ev;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/b50;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nv;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final bridge synthetic b(Ls3/c2;)Lcom/google/android/gms/internal/ads/b50;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nv;->d:Ls3/c2;

    return-object p0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/c50;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nv;->b:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nv;->c:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nv;->d:Ls3/c2;

    const-class v1, Ls3/c2;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Ov;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nv;->a:Lcom/google/android/gms/internal/ads/Ev;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Nv;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Nv;->c:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Nv;->d:Ls3/c2;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/Ov;-><init>(Lcom/google/android/gms/internal/ads/Ev;Landroid/content/Context;Ljava/lang/String;Ls3/c2;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method

.method public final bridge synthetic y(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/b50;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nv;->c:Ljava/lang/String;

    return-object p0
.end method
