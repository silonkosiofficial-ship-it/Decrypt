.class public final synthetic Landroidx/appcompat/app/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/t$a;


# instance fields
.field public final synthetic C:Landroidx/appcompat/app/t;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/app/s;->C:Landroidx/appcompat/app/t;

    return-void
.end method


# virtual methods
.method public final r(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/s;->C:Landroidx/appcompat/app/t;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/t;->j(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
