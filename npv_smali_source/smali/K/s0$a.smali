.class final LK/s0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/s0;-><init>(Landroid/view/View;Lx7/l;LK/l0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LK/s0;


# direct methods
.method constructor <init>(LK/s0;)V
    .locals 0

    iput-object p1, p0, LK/s0$a;->D:LK/s0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/inputmethod/BaseInputConnection;
    .locals 3

    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    iget-object v1, p0, LK/s0$a;->D:LK/s0;

    invoke-virtual {v1}, LK/s0;->i()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK/s0$a;->a()Landroid/view/inputmethod/BaseInputConnection;

    move-result-object v0

    return-object v0
.end method
