.class public final Landroidx/compose/ui/window/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a$a;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/k;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/a$a$a;->a:Landroidx/compose/ui/window/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/a$a$a;->a:Landroidx/compose/ui/window/k;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Landroidx/compose/ui/window/a$a$a;->a:Landroidx/compose/ui/window/k;

    invoke-virtual {v0}, Landroidx/compose/ui/window/k;->k()V

    return-void
.end method
