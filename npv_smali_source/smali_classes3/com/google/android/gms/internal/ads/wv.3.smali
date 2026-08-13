.class public abstract Lcom/google/android/gms/internal/ads/wv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Vu;


# instance fields
.field protected b:Lcom/google/android/gms/internal/ads/Rt;

.field protected c:Lcom/google/android/gms/internal/ads/Rt;

.field private d:Lcom/google/android/gms/internal/ads/Rt;

.field private e:Lcom/google/android/gms/internal/ads/Rt;

.field private f:Ljava/nio/ByteBuffer;

.field private g:Ljava/nio/ByteBuffer;

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->f:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    sget-object v0, Lcom/google/android/gms/internal/ads/Rt;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->d:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->b:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->c:Lcom/google/android/gms/internal/ads/Rt;

    return-void
.end method


# virtual methods
.method public b()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/wv;->h:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->d:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->b:Lcom/google/android/gms/internal/ads/Rt;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->c:Lcom/google/android/gms/internal/ads/Rt;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wv;->k()V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/Rt;)Lcom/google/android/gms/internal/ads/Rt;
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->d:Lcom/google/android/gms/internal/ads/Rt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/wv;->h(Lcom/google/android/gms/internal/ads/Rt;)Lcom/google/android/gms/internal/ads/Rt;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->e:Lcom/google/android/gms/internal/ads/Rt;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wv;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->e:Lcom/google/android/gms/internal/ads/Rt;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Rt;->e:Lcom/google/android/gms/internal/ads/Rt;

    :goto_0
    return-object p1
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wv;->c()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->f:Ljava/nio/ByteBuffer;

    sget-object v0, Lcom/google/android/gms/internal/ads/Rt;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->d:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->e:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->b:Lcom/google/android/gms/internal/ads/Rt;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->c:Lcom/google/android/gms/internal/ads/Rt;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wv;->m()V

    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/wv;->h:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wv;->l()V

    return-void
.end method

.method public g()Z
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/wv;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/google/android/gms/internal/ads/Vu;->a:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract h(Lcom/google/android/gms/internal/ads/Rt;)Lcom/google/android/gms/internal/ads/Rt;
.end method

.method public i()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->e:Lcom/google/android/gms/internal/ads/Rt;

    sget-object v1, Lcom/google/android/gms/internal/ads/Rt;->e:Lcom/google/android/gms/internal/ads/Rt;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final j(I)Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->f:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->f:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method protected k()V
    .locals 0

    return-void
.end method

.method protected l()V
    .locals 0

    return-void
.end method

.method protected m()V
    .locals 0

    return-void
.end method

.method protected final n()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    return v0
.end method
