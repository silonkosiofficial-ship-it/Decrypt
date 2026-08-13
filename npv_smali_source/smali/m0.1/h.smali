.class public abstract synthetic Lm0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lm0/i;Landroid/view/KeyEvent;Lx7/a;ILjava/lang/Object;)Z
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm0/h$a;->D:Lm0/h$a;

    :cond_0
    invoke-interface {p0, p1, p2}, Lm0/i;->j(Landroid/view/KeyEvent;Lx7/a;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
