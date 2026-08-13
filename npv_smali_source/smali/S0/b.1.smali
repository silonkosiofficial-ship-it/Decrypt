.class final LS0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS0/b;

    invoke-direct {v0}, LS0/b;-><init>()V

    sput-object v0, LS0/b;->a:LS0/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ln0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 2

    invoke-static {}, LK/g;->a()Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object v0

    invoke-static {p1}, Lo0/X1;->c(Ln0/i;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v0, v1}, LK/h;->a(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object v0

    invoke-static {p1}, Lo0/X1;->c(Ln0/i;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-static {v0, p1}, LK/i;->a(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object p1

    invoke-static {p1}, LK/j;->a(Landroid/view/inputmethod/EditorBoundsInfo$Builder;)Landroid/view/inputmethod/EditorBoundsInfo;

    move-result-object p1

    invoke-static {p0, p1}, LK/k;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroid/view/inputmethod/EditorBoundsInfo;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    move-result-object p0

    return-object p0
.end method
