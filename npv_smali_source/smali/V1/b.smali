.class public final synthetic LV1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB1/a;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV1/b;->a:Landroidx/fragment/app/g;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LV1/b;->a:Landroidx/fragment/app/g;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-static {v0, p1}, Landroidx/fragment/app/g;->a0(Landroidx/fragment/app/g;Landroid/content/res/Configuration;)V

    return-void
.end method
