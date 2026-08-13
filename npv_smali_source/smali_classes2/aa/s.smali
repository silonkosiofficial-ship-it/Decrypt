.class public abstract Laa/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Laa/r;

.field private static final b:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Laa/t;->b()Laa/r;

    move-result-object v0

    sput-object v0, Laa/s;->a:Laa/r;

    sget-object v0, Laa/s$a;->D:Laa/s$a;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, Laa/s;->b:LV/O0;

    return-void
.end method

.method public static final a()Laa/r;
    .locals 1

    sget-object v0, Laa/s;->a:Laa/r;

    return-object v0
.end method

.method public static final b()LV/O0;
    .locals 1

    sget-object v0, Laa/s;->b:LV/O0;

    return-object v0
.end method
