.class public final Lv/x;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/h;
.implements Lm0/j;


# instance fields
.field private final P:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method

.method private final T1()Lw0/b;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/p0;->j()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/b;

    return-object v0
.end method


# virtual methods
.method public Y(Landroidx/compose/ui/focus/j;)V
    .locals 2

    invoke-direct {p0}, Lv/x;->T1()Lw0/b;

    move-result-object v0

    invoke-interface {v0}, Lw0/b;->a()I

    move-result v0

    sget-object v1, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v1}, Lw0/a$a;->b()I

    move-result v1

    invoke-static {v0, v1}, Lw0/a;->f(II)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->y(Z)V

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lv/x;->P:Z

    return v0
.end method
