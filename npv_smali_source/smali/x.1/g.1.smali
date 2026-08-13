.class public abstract Lx/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;

.field private static final b:Lx/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lx/g$a;->D:Lx/g$a;

    invoke-static {v0}, LV/y;->e(Lx7/l;)LV/O0;

    move-result-object v0

    sput-object v0, Lx/g;->a:LV/O0;

    new-instance v0, Lx/g$b;

    invoke-direct {v0}, Lx/g$b;-><init>()V

    sput-object v0, Lx/g;->b:Lx/f;

    return-void
.end method

.method public static final a()LV/O0;
    .locals 1

    sget-object v0, Lx/g;->a:LV/O0;

    return-object v0
.end method

.method public static final b()Lx/f;
    .locals 1

    sget-object v0, Lx/g;->b:Lx/f;

    return-object v0
.end method
