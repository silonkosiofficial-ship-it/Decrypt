.class public final Lcom/google/android/gms/internal/ads/hS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;

.field private final e:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hS;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hS;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/hS;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/hS;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/hS;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hS;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/zv;->a()Lcom/google/android/gms/internal/ads/Xo;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hS;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/lv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lv;->a()Lcom/google/android/gms/internal/ads/Ww;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hS;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/pS;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pS;->a()Lcom/google/android/gms/internal/ads/oS;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hS;->d:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/ArrayDeque;

    invoke-static {}, Lcom/google/android/gms/internal/ads/vv;->a()Lcom/google/android/gms/internal/ads/lS;

    move-result-object v8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hS;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/google/android/gms/internal/ads/T90;

    new-instance v0, Lcom/google/android/gms/internal/ads/gS;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/gS;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Xo;Lcom/google/android/gms/internal/ads/Ww;Lcom/google/android/gms/internal/ads/oS;Ljava/util/ArrayDeque;Lcom/google/android/gms/internal/ads/lS;Lcom/google/android/gms/internal/ads/T90;)V

    return-object v0
.end method
