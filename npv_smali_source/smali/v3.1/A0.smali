.class final Lv3/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/bg;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/cg;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lv3/E0;Lcom/google/android/gms/internal/ads/cg;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    iput-object p2, p0, Lv3/A0;->a:Lcom/google/android/gms/internal/ads/cg;

    iput-object p3, p0, Lv3/A0;->b:Landroid/content/Context;

    iput-object p4, p0, Lv3/A0;->c:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lv3/A0;->a:Lcom/google/android/gms/internal/ads/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cg;->a()Landroidx/browser/customtabs/f;

    move-result-object v0

    new-instance v1, Landroidx/browser/customtabs/d$d;

    invoke-direct {v1, v0}, Landroidx/browser/customtabs/d$d;-><init>(Landroidx/browser/customtabs/f;)V

    invoke-virtual {v1}, Landroidx/browser/customtabs/d$d;->a()Landroidx/browser/customtabs/d;

    move-result-object v0

    iget-object v1, v0, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    iget-object v2, p0, Lv3/A0;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/sz0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lv3/A0;->b:Landroid/content/Context;

    iget-object v2, p0, Lv3/A0;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Landroidx/browser/customtabs/d;->a(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lv3/A0;->b:Landroid/content/Context;

    iget-object v1, p0, Lv3/A0;->a:Lcom/google/android/gms/internal/ads/cg;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/cg;->f(Landroid/app/Activity;)V

    return-void
.end method
