.class public abstract LF0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LF0/d$a;

.field private static final b:Lx7/l;

.field private static final c:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/d$a;

    invoke-direct {v0}, LF0/d$a;-><init>()V

    sput-object v0, LF0/d;->a:LF0/d$a;

    sget-object v0, LF0/d$b;->D:LF0/d$b;

    sput-object v0, LF0/d;->b:Lx7/l;

    sget-object v0, LF0/d$c;->D:LF0/d$c;

    sput-object v0, LF0/d;->c:Lx7/l;

    return-void
.end method

.method public static final synthetic a()LF0/d$a;
    .locals 1

    sget-object v0, LF0/d;->a:LF0/d$a;

    return-object v0
.end method

.method public static final synthetic b()Lx7/l;
    .locals 1

    sget-object v0, LF0/d;->c:Lx7/l;

    return-object v0
.end method

.method public static final synthetic c(LF0/c;)Z
    .locals 0

    invoke-static {p0}, LF0/d;->d(LF0/c;)Z

    move-result p0

    return p0
.end method

.method private static final d(LF0/c;)Z
    .locals 1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object p0

    invoke-virtual {p0}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LF0/C0;

    invoke-virtual {p0}, LF0/C0;->T1()Z

    move-result p0

    return p0
.end method
