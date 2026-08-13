.class public final synthetic Lv3/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/z0;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lv3/z0;->a:Landroid/net/Uri;

    invoke-static {v0}, Lv3/E0;->p(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
