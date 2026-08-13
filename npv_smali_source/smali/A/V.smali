.class public abstract LA/V;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LA/V$a;->D:LA/V$a;

    invoke-static {v0}, LE0/e;->a(Lx7/a;)LE0/m;

    move-result-object v0

    sput-object v0, LA/V;->a:LE0/m;

    return-void
.end method

.method public static final a()LE0/m;
    .locals 1

    sget-object v0, LA/V;->a:LE0/m;

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LA/V$b;

    invoke-direct {v0, p1}, LA/V$b;-><init>(Lx7/l;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v1, LA/V$c;

    invoke-direct {v1, p1}, LA/V$c;-><init>(Lx7/l;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/d;LA/S;)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LA/V$d;

    invoke-direct {v0, p1}, LA/V$d;-><init>(LA/S;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v1, LA/V$e;

    invoke-direct {v1, p1}, LA/V$e;-><init>(LA/S;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
