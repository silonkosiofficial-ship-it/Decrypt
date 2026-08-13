.class public abstract LK/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LK/r0$a;->L:LK/r0$a;

    sput-object v0, LK/r0;->a:Lx7/l;

    return-void
.end method

.method public static final synthetic a(Landroid/view/inputmethod/EditorInfo;)V
    .locals 0

    invoke-static {p0}, LK/r0;->d(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method

.method public static final b()LK/q0;
    .locals 1

    new-instance v0, LK/a;

    invoke-direct {v0}, LK/a;-><init>()V

    return-object v0
.end method

.method public static final c()Lx7/l;
    .locals 1

    sget-object v0, LK/r0;->a:Lx7/l;

    return-object v0
.end method

.method private static final d(Landroid/view/inputmethod/EditorInfo;)V
    .locals 1

    .prologue
    invoke-static {}, Landroidx/emoji2/text/f;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/emoji2/text/f;->c()Landroidx/emoji2/text/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/emoji2/text/f;->x(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method
