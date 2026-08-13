.class public final LS0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/u;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Li7/n;

.field private final c:Landroidx/core/view/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/v;->a:Landroid/view/View;

    sget-object v0, Li7/r;->E:Li7/r;

    new-instance v1, LS0/v$a;

    invoke-direct {v1, p0}, LS0/v$a;-><init>(LS0/v;)V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, LS0/v;->b:Li7/n;

    new-instance v0, Landroidx/core/view/L;

    invoke-direct {v0, p1}, Landroidx/core/view/L;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LS0/v;->c:Landroidx/core/view/L;

    return-void
.end method

.method public static final synthetic c(LS0/v;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, LS0/v;->a:Landroid/view/View;

    return-object p0
.end method

.method private final d()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    iget-object v0, p0, LS0/v;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LS0/v;->c:Landroidx/core/view/L;

    invoke-virtual {v0}, Landroidx/core/view/L;->a()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LS0/v;->c:Landroidx/core/view/L;

    invoke-virtual {v0}, Landroidx/core/view/L;->b()V

    return-void
.end method

.method public f()Z
    .locals 2

    invoke-direct {p0}, LS0/v;->d()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LS0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public g(ILandroid/view/inputmethod/ExtractedText;)V
    .locals 2

    invoke-direct {p0}, LS0/v;->d()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LS0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    return-void
.end method

.method public h(IIII)V
    .locals 6

    invoke-direct {p0}, LS0/v;->d()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LS0/v;->a:Landroid/view/View;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void
.end method

.method public i()V
    .locals 2

    invoke-direct {p0}, LS0/v;->d()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LS0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void
.end method

.method public j(Landroid/view/inputmethod/CursorAnchorInfo;)V
    .locals 2

    invoke-direct {p0}, LS0/v;->d()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LS0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    return-void
.end method
