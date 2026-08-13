.class public abstract LF0/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LY0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, LY0/g;->b(FFILjava/lang/Object;)LY0/e;

    move-result-object v0

    sput-object v0, LF0/N;->a:LY0/e;

    return-void
.end method

.method public static final synthetic a()LY0/e;
    .locals 1

    sget-object v0, LF0/N;->a:LY0/e;

    return-object v0
.end method

.method public static final b(LF0/J;)LF0/o0;
    .locals 0

    .prologue
    invoke-virtual {p0}, LF0/J;->n0()LF0/o0;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "LayoutNode should be attached to an owner"

    invoke-static {p0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0
.end method
