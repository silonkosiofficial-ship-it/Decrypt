.class public final synthetic LV1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/d$c;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV1/a;->a:Landroidx/fragment/app/g;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LV1/a;->a:Landroidx/fragment/app/g;

    invoke-static {v0}, Landroidx/fragment/app/g;->b0(Landroidx/fragment/app/g;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
