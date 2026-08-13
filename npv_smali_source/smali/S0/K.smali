.class public abstract LS0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/inputmethod/InputConnection;Lx7/l;)LS0/z;
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, LS0/J;

    invoke-direct {v0, p0, p1}, LS0/J;-><init>(Landroid/view/inputmethod/InputConnection;Lx7/l;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    new-instance v0, LS0/G;

    invoke-direct {v0, p0, p1}, LS0/G;-><init>(Landroid/view/inputmethod/InputConnection;Lx7/l;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    new-instance v0, LS0/E;

    invoke-direct {v0, p0, p1}, LS0/E;-><init>(Landroid/view/inputmethod/InputConnection;Lx7/l;)V

    goto :goto_0

    :cond_2
    new-instance v0, LS0/A;

    invoke-direct {v0, p0, p1}, LS0/A;-><init>(Landroid/view/inputmethod/InputConnection;Lx7/l;)V

    :goto_0
    return-object v0
.end method
