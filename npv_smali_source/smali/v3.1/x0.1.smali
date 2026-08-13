.class public final synthetic Lv3/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/f;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/x0;->a:Landroid/content/Context;

    iput-object p2, p0, Lv3/x0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/String;)Lw3/u;
    .locals 2

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lv3/x0;->a:Landroid/content/Context;

    iget-object v1, p0, Lv3/x0;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lv3/E0;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lw3/u;->C:Lw3/u;

    return-object p1
.end method
