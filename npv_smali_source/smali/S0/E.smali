.class LS0/E;
.super LS0/A;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lx7/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LS0/A;-><init>(Landroid/view/inputmethod/InputConnection;Lx7/l;)V

    return-void
.end method


# virtual methods
.method protected final b(Landroid/view/inputmethod/InputConnection;)V
    .locals 0

    invoke-static {p1}, LS0/D;->a(Landroid/view/inputmethod/InputConnection;)V

    return-void
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LS0/A;->c()Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, LS0/B;->a(Landroid/view/inputmethod/InputConnection;II)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1

    .prologue
    invoke-virtual {p0}, LS0/A;->c()Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LS0/C;->a(Landroid/view/inputmethod/InputConnection;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
